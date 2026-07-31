package defpackage;

/* JADX INFO: renamed from: lّٜٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12720l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f25081l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f25082l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f25083l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f25085l = null;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f25084l = null;

    public C12720l(int i) {
        this.f25081l = new C12663l(i);
        this.f25082l = i / 8;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        C12663l c12663l = (C12663l) this.f25081l;
        if (((byte[]) this.f25085l) == null) {
            C8339l.smaato("DSTU7564Mac not initialised");
            return 0;
        }
        if (bArr.length < this.f25082l) {
            C18073l.ad("Output buffer too short");
            return 0;
        }
        int i2 = c12663l.f24938l;
        long j = this.f25083l;
        int i3 = i2 - ((int) (j % ((long) i2)));
        if (i3 < 13) {
            i3 += i2;
        }
        byte[] bArr2 = new byte[i3];
        bArr2[0] = -128;
        AbstractC10000l.pro(j * 8, bArr2, i3 - 12);
        c12663l.update(bArr2, 0, i3);
        byte[] bArr3 = (byte[]) this.f25084l;
        c12663l.update(bArr3, 0, bArr3.length);
        this.f25083l = 0L;
        int iDoFinal = c12663l.doFinal(bArr, 0);
        reset();
        return iDoFinal;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f25082l;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C12663l c12663l = (C12663l) this.f25081l;
        this.f25085l = null;
        reset();
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica("Bad parameter passed");
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        this.f25084l = new byte[bArr.length];
        int length = bArr.length;
        int i = c12663l.f24938l;
        int i2 = (((length + i) - 1) / i) * i;
        if (i2 - bArr.length < 13) {
            i2 += i;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = -128;
        AbstractC10000l.smaato(bArr.length * 8, i2 - 12, bArr2);
        this.f25085l = bArr2;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = (byte[]) this.f25084l;
            if (i3 >= bArr3.length) {
                byte[] bArr4 = (byte[]) this.f25085l;
                c12663l.update(bArr4, 0, bArr4.length);
                return;
            } else {
                bArr3[i3] = (byte) (~bArr[i3]);
                i3++;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        this.f25083l = 0L;
        C12663l c12663l = (C12663l) this.f25081l;
        c12663l.reset();
        byte[] bArr = (byte[]) this.f25085l;
        if (bArr != null) {
            c12663l.update(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            C10754l.ad("Input buffer too short");
        } else if (((byte[]) this.f25085l) == null) {
            C8339l.smaato("DSTU7564Mac not initialised");
        } else {
            ((C12663l) this.f25081l).update(bArr, i, i2);
            this.f25083l += (long) i2;
        }
    }

    public void yandex(int i, int i2, byte[] bArr) {
        int i3;
        byte[] bArr2 = (byte[]) this.f25085l;
        C7203l c7203l = (C7203l) this.f25081l;
        byte[] bArr3 = c7203l.amazon;
        int i4 = this.f25082l;
        int i5 = 16 - i4;
        if (i4 <= 0 || i2 < i5) {
            i3 = i2;
            i5 = 0;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i5);
            C7203l.billing(0, 16, bArr2, bArr3);
            c7203l.mopub(bArr3);
            i3 = i2 - i5;
            this.f25082l = 0;
        }
        while (i3 >= 16) {
            C7203l.billing(i + i5, 16, bArr, bArr3);
            c7203l.mopub(bArr3);
            i5 += 16;
            i3 -= 16;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, i + i5, bArr2, this.f25082l, i3);
            this.f25082l += i3;
        }
        this.f25083l += (long) i2;
    }

    public C12720l(C7203l c7203l) {
        this.f25081l = c7203l;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        ((C12663l) this.f25081l).update(b);
        this.f25083l++;
    }
}
