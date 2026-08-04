package defpackage;

/* JADX INFO: renamed from: lّؐۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12299l implements InterfaceC8782l, InterfaceC2417l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC2417l f24373l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f24374l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC8782l f24375l;

    public C12299l(InterfaceC8782l interfaceC8782l, long j) {
        this.f24375l = interfaceC8782l;
        this.f24374l = j;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        C7751l c7751l = new C7751l();
        long j = c11495l.yandex;
        c7751l.loadAd = c11495l.loadAd;
        c7751l.crashlytics = c11495l.crashlytics;
        c7751l.yandex = j - this.f24374l;
        return this.f24375l.adcel(new C11495l(c7751l));
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() {
        this.f24375l.admob();
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        long jAds = this.f24375l.ads();
        if (jAds == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jAds + this.f24374l;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f24375l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        long jBilling = this.f24375l.billing();
        if (jBilling == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jBilling + this.f24374l;
    }

    @Override // defpackage.InterfaceC2417l
    public final void crashlytics(InterfaceC8782l interfaceC8782l) {
        InterfaceC2417l interfaceC2417l = this.f24373l;
        interfaceC2417l.getClass();
        interfaceC2417l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) {
        this.f24375l.isPro(j - this.f24374l);
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        this.f24375l.license(j - this.f24374l);
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        return this.f24375l.metrica();
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        long j2 = this.f24374l;
        return this.f24375l.mopub(j - j2, c17654l) + j2;
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        InterfaceC11759l[] interfaceC11759lArr2 = new InterfaceC11759l[interfaceC11759lArr.length];
        int i = 0;
        while (true) {
            InterfaceC11759l interfaceC11759l = null;
            if (i >= interfaceC11759lArr.length) {
                break;
            }
            C3380l c3380l = (C3380l) interfaceC11759lArr[i];
            if (c3380l != null) {
                interfaceC11759l = c3380l.f7203l;
            }
            interfaceC11759lArr2[i] = interfaceC11759l;
            i++;
        }
        InterfaceC8782l interfaceC8782l = this.f24375l;
        long j2 = this.f24374l;
        long jPurchase = interfaceC8782l.purchase(interfaceC10376lArr, zArr, interfaceC11759lArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC11759lArr.length; i2++) {
            InterfaceC11759l interfaceC11759l2 = interfaceC11759lArr2[i2];
            if (interfaceC11759l2 == null) {
                interfaceC11759lArr[i2] = null;
            } else {
                InterfaceC11759l interfaceC11759l3 = interfaceC11759lArr[i2];
                if (interfaceC11759l3 == null || ((C3380l) interfaceC11759l3).f7203l != interfaceC11759l2) {
                    interfaceC11759lArr[i2] = new C3380l(interfaceC11759l2, j2);
                }
            }
        }
        return jPurchase + j2;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        long jRemoteconfig = this.f24375l.remoteconfig();
        if (jRemoteconfig == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jRemoteconfig + this.f24374l;
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        long j2 = this.f24374l;
        return this.f24375l.subs(j - j2) + j2;
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public final void mo614throws(InterfaceC3128l interfaceC3128l) {
        InterfaceC2417l interfaceC2417l = this.f24373l;
        interfaceC2417l.getClass();
        interfaceC2417l.mo614throws(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        this.f24373l = interfaceC2417l;
        this.f24375l.vip(this, j - this.f24374l);
    }
}
