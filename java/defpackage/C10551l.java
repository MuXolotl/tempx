package defpackage;

/* JADX INFO: renamed from: lًَۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10551l implements InterfaceC12184l {
    private static final byte[] DEFAULT_IV = {-90, 89, 89, -90};
    private final InterfaceC10952l engine;
    private final byte[] preIV = new byte[4];
    private C13886l param = null;
    private boolean forWrapping = true;

    public C10551l(InterfaceC10952l interfaceC10952l) {
        this.engine = interfaceC10952l;
    }

    @Override // defpackage.InterfaceC12184l
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // defpackage.InterfaceC12184l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.forWrapping = z;
        if (interfaceC9719l instanceof C6114l) {
            interfaceC9719l = ((C6114l) interfaceC9719l).f12903l;
        }
        if (interfaceC9719l instanceof C13886l) {
            this.param = (C13886l) interfaceC9719l;
            System.arraycopy(DEFAULT_IV, 0, this.preIV, 0, 4);
        } else if (interfaceC9719l instanceof C0272l) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr = c0272l.f1273l;
            if (bArr.length != 4) {
                C8339l.metrica("IV length not equal to 4");
            } else {
                this.param = (C13886l) c0272l.f1272l;
                System.arraycopy(bArr, 0, this.preIV, 0, 4);
            }
        }
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] unwrap(byte[] bArr, int i, int i2) throws C10352l {
        byte[] bArr2;
        if (this.forWrapping) {
            C8339l.smaato("not set for unwrapping");
            return null;
        }
        int i3 = i2 / 8;
        if (i3 * 8 != i2) {
            C11467l.remoteconfig("unwrap data must be a multiple of 8 bytes");
            return null;
        }
        if (i3 <= 1) {
            C11467l.remoteconfig("unwrap data must be at least 16 bytes");
            return null;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        byte[] bArr4 = new byte[i2];
        byte[] bArr5 = new byte[8];
        if (i3 == 2) {
            this.engine.init(false, this.param);
            int iLicense = this.engine.license();
            for (int i4 = 0; i4 < i2; i4 += iLicense) {
                this.engine.tapsense(i4, i4, bArr3, bArr4);
            }
            System.arraycopy(bArr4, 0, bArr5, 0, 8);
            int i5 = i2 - 8;
            bArr2 = new byte[i5];
            System.arraycopy(bArr4, 8, bArr2, 0, i5);
        } else {
            int i6 = i2 - 8;
            byte[] bArr6 = new byte[i6];
            byte[] bArr7 = new byte[16];
            System.arraycopy(bArr, i, bArr7, 0, 8);
            System.arraycopy(bArr, i + 8, bArr6, 0, i6);
            this.engine.init(false, this.param);
            int i7 = i3 - 1;
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = i7; i9 >= 1; i9--) {
                    int i10 = (i9 - 1) * 8;
                    System.arraycopy(bArr6, i10, bArr7, 8, 8);
                    int i11 = (i7 * i8) + i9;
                    int i12 = 1;
                    while (i11 != 0) {
                        int i13 = 8 - i12;
                        bArr7[i13] = (byte) (bArr7[i13] ^ ((byte) i11));
                        i11 >>>= 8;
                        i12++;
                    }
                    this.engine.tapsense(0, 0, bArr7, bArr7);
                    System.arraycopy(bArr7, 8, bArr6, i10, 8);
                }
            }
            System.arraycopy(bArr7, 0, bArr5, 0, 8);
            bArr2 = bArr6;
        }
        int i14 = 4;
        byte[] bArr8 = new byte[4];
        System.arraycopy(bArr5, 0, bArr8, 0, 4);
        int iYandex = AbstractC10000l.yandex(4, bArr5);
        boolean zSmaato = AbstractC14024l.smaato(bArr8, this.preIV);
        int length = bArr2.length;
        if (iYandex <= length - 8) {
            zSmaato = false;
        }
        if (iYandex > length) {
            zSmaato = false;
        }
        int i15 = length - iYandex;
        if (i15 >= 8 || i15 < 0) {
            zSmaato = false;
        } else {
            i14 = i15;
        }
        byte[] bArr9 = new byte[i14];
        System.arraycopy(bArr2, bArr2.length - i14, bArr9, 0, i14);
        if (!AbstractC14024l.smaato(bArr9, new byte[i14])) {
            zSmaato = false;
        }
        if (!zSmaato) {
            C11467l.remoteconfig("checksum failed");
            return null;
        }
        byte[] bArr10 = new byte[iYandex];
        System.arraycopy(bArr2, 0, bArr10, 0, iYandex);
        return bArr10;
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            C8339l.smaato("not set for wrapping");
            return null;
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(this.preIV, 0, bArr2, 0, 4);
        AbstractC10000l.isPro(i2, 4, bArr2);
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        int i3 = (8 - (i2 % 8)) % 8;
        int i4 = i2 + i3;
        byte[] bArr4 = new byte[i4];
        System.arraycopy(bArr3, 0, bArr4, 0, i2);
        if (i3 != 0) {
            System.arraycopy(new byte[i3], 0, bArr4, i2, i3);
        }
        if (i4 != 8) {
            C7804l c7804l = new C7804l(this.engine);
            c7804l.init(true, new C0272l(this.param, bArr2, 0, 8));
            return c7804l.wrap(bArr4, 0, i4);
        }
        int i5 = i4 + 8;
        byte[] bArr5 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr5, 0, 8);
        System.arraycopy(bArr4, 0, bArr5, 8, i4);
        this.engine.init(true, this.param);
        int iLicense = this.engine.license();
        for (int i6 = 0; i6 < i5; i6 += iLicense) {
            this.engine.tapsense(i6, i6, bArr5, bArr5);
        }
        return bArr5;
    }
}
