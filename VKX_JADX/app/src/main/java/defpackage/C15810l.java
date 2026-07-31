package defpackage;

/* JADX INFO: renamed from: lٕٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15810l implements InterfaceC8782l, InterfaceC2417l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C9100l[] f31043l = new C9100l[0];

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f31044l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C7941l f31045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC2417l f31046l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC8782l f31047l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f31048l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f31049l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f31050l;

    public C15810l(InterfaceC8782l interfaceC8782l, boolean z, long j, long j2, int i) {
        this.f31047l = interfaceC8782l;
        this.f31049l = z ? j : -9223372036854775807L;
        this.f31048l = -9223372036854775807L;
        this.f31050l = j;
        this.f31044l = j2;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean adcel(C11495l c11495l) {
        return this.f31047l.adcel(c11495l);
    }

    @Override // defpackage.InterfaceC8782l
    public final void admob() throws C7941l {
        C7941l c7941l = this.f31045l;
        if (c7941l != null) {
            throw c7941l;
        }
        this.f31047l.admob();
    }

    @Override // defpackage.InterfaceC3128l
    public final long ads() {
        long jAds = this.f31047l.ads();
        if (jAds != Long.MIN_VALUE) {
            long j = this.f31044l;
            if (j == Long.MIN_VALUE || jAds < j) {
                return jAds;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC3128l
    public final boolean amazon() {
        return this.f31047l.amazon();
    }

    @Override // defpackage.InterfaceC3128l
    public final long billing() {
        long jBilling = this.f31047l.billing();
        if (jBilling != Long.MIN_VALUE) {
            long j = this.f31044l;
            if (j == Long.MIN_VALUE || jBilling < j) {
                return jBilling;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC2417l
    public final void crashlytics(InterfaceC8782l interfaceC8782l) {
        if (this.f31045l != null) {
            return;
        }
        InterfaceC2417l interfaceC2417l = this.f31046l;
        interfaceC2417l.getClass();
        interfaceC2417l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void isPro(long j) {
        this.f31047l.isPro(j);
    }

    @Override // defpackage.InterfaceC3128l
    public final void license(long j) {
        this.f31047l.license(j);
    }

    @Override // defpackage.InterfaceC8782l
    public final C8750l metrica() {
        return this.f31047l.metrica();
    }

    @Override // defpackage.InterfaceC8782l
    public final long mopub(long j, C17654l c17654l) {
        long j2 = this.f31050l;
        if (j == j2) {
            return j2;
        }
        long jFirebase = AbstractC15323l.firebase(c17654l.yandex, 0L, j - j2);
        long j3 = c17654l.loadAd;
        long j4 = this.f31044l;
        long jFirebase2 = AbstractC15323l.firebase(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jFirebase != c17654l.yandex || jFirebase2 != c17654l.loadAd) {
            c17654l = new C17654l(jFirebase, jFirebase2);
        }
        return this.f31047l.mopub(j, c17654l);
    }

    @Override // defpackage.InterfaceC8782l
    public final long purchase(InterfaceC10376l[] interfaceC10376lArr, boolean[] zArr, InterfaceC11759l[] interfaceC11759lArr, boolean[] zArr2, long j) {
        long j2;
        this.f31043l = new C9100l[interfaceC11759lArr.length];
        InterfaceC11759l[] interfaceC11759lArr2 = new InterfaceC11759l[interfaceC11759lArr.length];
        for (int i = 0; i < interfaceC11759lArr.length; i++) {
            C9100l[] c9100lArr = this.f31043l;
            C9100l c9100l = (C9100l) interfaceC11759lArr[i];
            c9100lArr[i] = c9100l;
            interfaceC11759lArr2[i] = c9100l != null ? c9100l.f18694l : null;
        }
        long jPurchase = this.f31047l.purchase(interfaceC10376lArr, zArr, interfaceC11759lArr2, zArr2, j);
        long j3 = this.f31044l;
        long jMax = Math.max(jPurchase, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (yandex()) {
            if (jPurchase >= j) {
                if (jPurchase != 0) {
                    int length = interfaceC10376lArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            InterfaceC10376l interfaceC10376l = interfaceC10376lArr[i2];
                            if (interfaceC10376l != null) {
                                C5978l c5978lTapsense = interfaceC10376l.tapsense();
                                if (!AbstractC3825l.yandex(c5978lTapsense.metrica, c5978lTapsense.firebase)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f31049l = j2;
        for (int i3 = 0; i3 < interfaceC11759lArr.length; i3++) {
            InterfaceC11759l interfaceC11759l = interfaceC11759lArr2[i3];
            C9100l[] c9100lArr2 = this.f31043l;
            if (interfaceC11759l == null) {
                c9100lArr2[i3] = null;
            } else {
                C9100l c9100l2 = c9100lArr2[i3];
                if (c9100l2 == null || c9100l2.f18694l != interfaceC11759l) {
                    c9100lArr2[i3] = new C9100l(this, interfaceC11759l);
                }
            }
            interfaceC11759lArr[i3] = c9100lArr2[i3];
        }
        return jMax;
    }

    @Override // defpackage.InterfaceC8782l
    public final long remoteconfig() {
        if (yandex()) {
            long j = this.f31049l;
            this.f31049l = -9223372036854775807L;
            this.f31048l = j;
            long jRemoteconfig = remoteconfig();
            return jRemoteconfig != -9223372036854775807L ? jRemoteconfig : j;
        }
        long jRemoteconfig2 = this.f31047l.remoteconfig();
        if (jRemoteconfig2 != -9223372036854775807L) {
            long j2 = this.f31050l;
            long j3 = this.f31044l;
            long jMax = Math.max(jRemoteconfig2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.f31048l) {
                this.f31048l = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC8782l
    public final long subs(long j) {
        this.f31049l = -9223372036854775807L;
        for (C9100l c9100l : this.f31043l) {
            if (c9100l != null) {
                c9100l.f18693l = false;
            }
        }
        long jSubs = this.f31047l.subs(j);
        long j2 = this.f31050l;
        long j3 = this.f31044l;
        long jMax = Math.max(jSubs, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.InterfaceC18266l
    /* JADX INFO: renamed from: throws */
    public final void mo614throws(InterfaceC3128l interfaceC3128l) {
        InterfaceC2417l interfaceC2417l = this.f31046l;
        interfaceC2417l.getClass();
        interfaceC2417l.mo614throws(this);
    }

    @Override // defpackage.InterfaceC8782l
    public final void vip(InterfaceC2417l interfaceC2417l, long j) {
        this.f31046l = interfaceC2417l;
        this.f31047l.vip(this, j);
    }

    public final boolean yandex() {
        return this.f31049l != -9223372036854775807L;
    }
}
