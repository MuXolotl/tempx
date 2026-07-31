package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؓٛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1955l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f4447l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f4448l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f4449l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f4450l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f4451l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f4452l;

    public C1955l(InterfaceC10952l interfaceC10952l, int i, C9912l c9912l) {
        if (i % 8 != 0) {
            C8339l.metrica("MAC size must be multiple of 8");
            throw null;
        }
        this.f4450l = new C4998l(interfaceC10952l);
        this.f4452l = c9912l;
        this.f4448l = i / 8;
        this.f4447l = new byte[interfaceC10952l.license()];
        this.f4451l = new byte[interfaceC10952l.license()];
        this.f4449l = 0;
    }

    public static boolean yandex(C1955l c1955l) {
        return Objects.equals(((C5978l) c1955l.f4447l).metrica, "audio/raw");
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = (byte[]) this.f4447l;
        byte[] bArr3 = (byte[]) this.f4451l;
        C4998l c4998l = (C4998l) this.f4450l;
        int iLicense = c4998l.f10232l.license();
        InterfaceC12684l interfaceC12684l = (InterfaceC12684l) this.f4452l;
        if (interfaceC12684l == null) {
            while (true) {
                int i2 = this.f4449l;
                if (i2 >= iLicense) {
                    break;
                }
                bArr3[i2] = 0;
                this.f4449l = i2 + 1;
            }
        } else {
            if (this.f4449l == iLicense) {
                c4998l.tapsense(0, 0, bArr3, bArr2);
                this.f4449l = 0;
            }
            interfaceC12684l.crashlytics(this.f4449l, bArr3);
        }
        c4998l.tapsense(0, 0, bArr3, bArr2);
        int i3 = this.f4448l;
        System.arraycopy(bArr2, 0, bArr, 0, i3);
        reset();
        return i3;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return ((C4998l) this.f4450l).getAlgorithmName();
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f4448l;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        reset();
        ((C4998l) this.f4450l).init(true, interfaceC9719l);
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f4451l;
            if (i >= bArr.length) {
                this.f4449l = 0;
                ((C4998l) this.f4450l).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f4447l;
        byte[] bArr3 = (byte[]) this.f4451l;
        C4998l c4998l = (C4998l) this.f4450l;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return;
        }
        int iLicense = c4998l.f10232l.license();
        int i3 = this.f4449l;
        int i4 = iLicense - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c4998l.tapsense(0, 0, bArr3, bArr2);
            this.f4449l = 0;
            i2 -= i4;
            i += i4;
            while (i2 > iLicense) {
                c4998l.tapsense(i, 0, bArr, bArr2);
                i2 -= iLicense;
                i += iLicense;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f4449l, i2);
        this.f4449l += i2;
    }

    public C1955l(InterfaceC10952l interfaceC10952l) {
        this(interfaceC10952l, (interfaceC10952l.license() * 8) / 2, null);
    }

    public C1955l(C5978l c5978l, C5978l c5978l2, int i, int i2, C17953l c17953l, C0669l c0669l) {
        this.f4447l = c5978l;
        this.f4451l = c5978l2;
        this.f4449l = i;
        this.f4448l = i2;
        this.f4450l = c17953l;
        this.f4452l = c0669l;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        int i = this.f4449l;
        byte[] bArr = (byte[]) this.f4451l;
        if (i == bArr.length) {
            ((C4998l) this.f4450l).tapsense(0, 0, bArr, (byte[]) this.f4447l);
            this.f4449l = 0;
        }
        int i2 = this.f4449l;
        this.f4449l = i2 + 1;
        bArr[i2] = b;
    }
}
