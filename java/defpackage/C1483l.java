package defpackage;

/* JADX INFO: renamed from: lؒۦٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1483l implements InterfaceC0363l, InterfaceC16922l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final byte[] f3689l = AbstractC9008l.crashlytics("ParallelHash");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f3690l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final byte[] f3691l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f3692l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C9053l f3693l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9053l f3694l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f3695l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f3696l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f3697l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f3698l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final byte[] f3699l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final EnumC2441l f3700l;

    public C1483l(C1483l c1483l) {
        this.f3694l = new C9053l(c1483l.f3694l);
        this.f3693l = new C9053l(c1483l.f3693l);
        this.f3690l = c1483l.f3690l;
        this.f3696l = c1483l.f3696l;
        this.f3697l = c1483l.f3697l;
        this.f3699l = AbstractC14024l.crashlytics(c1483l.f3699l);
        this.f3691l = AbstractC14024l.crashlytics(c1483l.f3691l);
        this.f3700l = c1483l.f3700l;
        this.f3692l = c1483l.f3692l;
        this.f3698l = c1483l.f3698l;
        this.f3695l = c1483l.f3695l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }

    @Override // defpackage.InterfaceC0363l
    public final int crashlytics(int i, int i2, byte[] bArr) {
        if (this.f3692l) {
            yandex(this.f3697l);
        }
        int iCrashlytics = this.f3694l.crashlytics(0, i2, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f3692l;
        int i2 = this.f3697l;
        if (z) {
            yandex(i2);
        }
        int iCrashlytics = this.f3694l.crashlytics(i, i2, bArr);
        reset();
        return iCrashlytics;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "ParallelHash".concat(this.f3694l.getAlgorithmName().substring(6));
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return this.f3694l.getByteLength();
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f3697l;
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        C9053l c9053l = this.f3694l;
        c9053l.reset();
        AbstractC14024l.loadAd(this.f3699l);
        byte[] bArrMopub = AbstractC13766l.mopub(this.f3696l);
        c9053l.billing(0, bArrMopub.length, bArrMopub);
        this.f3698l = 0;
        this.f3695l = 0;
        this.f3692l = true;
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        int i4;
        int iMax = Math.max(0, i2);
        int i5 = this.f3695l;
        C9053l c9053l = this.f3694l;
        byte[] bArr3 = this.f3691l;
        C9053l c9053l2 = this.f3693l;
        if (i5 != 0) {
            i3 = 0;
            while (true) {
                bArr2 = this.f3699l;
                if (i3 >= iMax || (i4 = this.f3695l) == bArr2.length) {
                    break;
                }
                this.f3695l = i4 + 1;
                bArr2[i4] = bArr[i3 + i];
                i3++;
            }
            int i6 = this.f3695l;
            if (i6 == bArr2.length) {
                c9053l2.billing(0, i6, bArr2);
                c9053l2.crashlytics(0, bArr3.length, bArr3);
                c9053l.billing(0, bArr3.length, bArr3);
                this.f3698l++;
                this.f3695l = 0;
            }
        } else {
            i3 = 0;
        }
        if (i3 < iMax) {
            while (true) {
                int i7 = iMax - i3;
                int i8 = this.f3696l;
                if (i7 < i8) {
                    break;
                }
                c9053l2.billing(i + i3, i8, bArr);
                c9053l2.crashlytics(0, bArr3.length, bArr3);
                c9053l.billing(0, bArr3.length, bArr3);
                this.f3698l++;
                i3 += i8;
            }
        }
        while (i3 < iMax) {
            update(bArr[i3 + i]);
            i3++;
        }
    }

    public final void yandex(int i) {
        int i2 = this.f3695l;
        C9053l c9053l = this.f3694l;
        if (i2 != 0) {
            C9053l c9053l2 = this.f3693l;
            c9053l2.billing(0, i2, this.f3699l);
            byte[] bArr = this.f3691l;
            c9053l2.crashlytics(0, bArr.length, bArr);
            c9053l.billing(0, bArr.length, bArr);
            this.f3698l++;
            this.f3695l = 0;
        }
        byte[] bArrAdmob = AbstractC13766l.admob(this.f3698l);
        byte[] bArrAdmob2 = AbstractC13766l.admob(i * 8);
        c9053l.billing(0, bArrAdmob.length, bArrAdmob);
        c9053l.billing(0, bArrAdmob2.length, bArrAdmob2);
        this.f3692l = false;
    }

    public C1483l(int i, int i2) {
        this.f3694l = new C9053l(f3689l, i, null);
        this.f3693l = new C9053l(new byte[0], i, new byte[0]);
        this.f3690l = i;
        this.f3696l = 128;
        this.f3697l = (i2 + 7) / 8;
        this.f3699l = new byte[128];
        this.f3691l = new byte[(i * 2) / 8];
        this.f3700l = EnumC2441l.f5219l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        reset();
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        int i = this.f3695l;
        int i2 = i + 1;
        this.f3695l = i2;
        byte[] bArr = this.f3699l;
        bArr[i] = b;
        if (i2 == bArr.length) {
            C9053l c9053l = this.f3693l;
            c9053l.billing(0, i2, bArr);
            byte[] bArr2 = this.f3691l;
            c9053l.crashlytics(0, bArr2.length, bArr2);
            this.f3694l.billing(0, bArr2.length, bArr2);
            this.f3698l++;
            this.f3695l = 0;
        }
    }
}
