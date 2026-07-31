package defpackage;

/* JADX INFO: renamed from: lًُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7804l implements InterfaceC12184l {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final InterfaceC10952l engine;
    private final byte[] iv = new byte[8];
    private C13886l param = null;
    private boolean forWrapping = true;
    private final boolean wrapCipherMode = true;

    public C7804l(InterfaceC10952l interfaceC10952l) {
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
            System.arraycopy(DEFAULT_IV, 0, this.iv, 0, 8);
        } else if (interfaceC9719l instanceof C0272l) {
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr = c0272l.f1273l;
            if (bArr.length != 8) {
                C8339l.metrica("IV not equal to 8");
            } else {
                this.param = (C13886l) c0272l.f1272l;
                System.arraycopy(bArr, 0, this.iv, 0, 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        if (defpackage.AbstractC14024l.smaato(r8, r5) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        defpackage.C11467l.remoteconfig("checksum failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0107, code lost:
    
        if (defpackage.AbstractC14024l.smaato(r8, r1) != false) goto L40;
     */
    @Override // defpackage.InterfaceC12184l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] unwrap(byte[] r20, int r21, int r22) throws defpackage.C10352l {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7804l.unwrap(byte[], int, int):byte[]");
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] wrap(byte[] bArr, int i, int i2) {
        String str;
        if (!this.forWrapping) {
            C8339l.smaato("not set for wrapping");
            return null;
        }
        if (i2 >= 8) {
            int i3 = i2 / 8;
            if (i3 * 8 == i2) {
                this.engine.init(this.wrapCipherMode, this.param);
                byte[] bArr2 = this.iv;
                byte[] bArr3 = new byte[bArr2.length + i2];
                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                System.arraycopy(bArr, i, bArr3, this.iv.length, i2);
                if (i3 == 1) {
                    this.engine.tapsense(0, 0, bArr3, bArr3);
                    return bArr3;
                }
                byte[] bArr4 = new byte[this.iv.length + 8];
                for (int i4 = 0; i4 != 6; i4++) {
                    for (int i5 = 1; i5 <= i3; i5++) {
                        System.arraycopy(bArr3, 0, bArr4, 0, this.iv.length);
                        int i6 = i5 * 8;
                        System.arraycopy(bArr3, i6, bArr4, this.iv.length, 8);
                        this.engine.tapsense(0, 0, bArr4, bArr4);
                        int i7 = (i3 * i4) + i5;
                        int i8 = 1;
                        while (i7 != 0) {
                            int length = this.iv.length - i8;
                            bArr4[length] = (byte) (((byte) i7) ^ bArr4[length]);
                            i7 >>>= 8;
                            i8++;
                        }
                        System.arraycopy(bArr4, 0, bArr3, 0, 8);
                        System.arraycopy(bArr4, 8, bArr3, i6, 8);
                    }
                }
                return bArr3;
            }
            str = "wrap data must be a multiple of 8 bytes";
        } else {
            str = "wrap data must be at least 8 bytes";
        }
        C10754l.ad(str);
        return null;
    }
}
