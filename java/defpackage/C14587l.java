package defpackage;

/* JADX INFO: renamed from: lٓۨۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14587l extends AbstractC14971l implements InterfaceC16388l, InterfaceC7150l, InterfaceC3703l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C7737l f28561l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C15466l f28562l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public String f28563l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC17030l f28564l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC13460l f28567l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public AbstractC8939l f28568l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f28566l = 1.0f;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f28565l = true;

    public C14587l(C7737l c7737l, InterfaceC13460l interfaceC13460l, InterfaceC17030l interfaceC17030l, AbstractC8939l abstractC8939l, String str, C15466l c15466l) {
        this.f28567l = interfaceC13460l;
        this.f28564l = interfaceC17030l;
        this.f28568l = abstractC8939l;
        this.f28563l = str;
        this.f28562l = c15466l;
        this.f28561l = c7737l;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C15466l c15466l = this.f28562l;
        if (c15466l != null) {
            c15466l.admob(j);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(m3873l(j));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 0));
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jLoadAd = AbstractC7563l.loadAd(0, i, 0, 0, 13);
        C15466l c15466l = this.f28562l;
        if (c15466l != null) {
            c15466l.admob(jLoadAd);
        }
        if (this.f28561l.subs() == 9205357640488583168L) {
            return interfaceC6357l.crashlytics(i);
        }
        long jM3873l = m3873l(jLoadAd);
        return Math.max(C15519l.subs(jM3873l), interfaceC6357l.crashlytics(i));
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        String str = this.f28563l;
        if (str != null) {
            AbstractC3668l.mopub(interfaceC17593l, str);
            AbstractC3668l.remoteconfig(interfaceC17593l, 5);
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f28561l.loadAd();
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        InterfaceC2262l interfaceC2262lM3914l = m3914l();
        C7737l c7737l = this.f28561l;
        c7737l.f16245l = interfaceC2262lM3914l;
        c7737l.crashlytics();
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final long m3872l(long j) {
        if (C14174l.mopub(j)) {
            return 0L;
        }
        long jSubs = this.f28561l.subs();
        if (jSubs != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jSubs >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jSubs & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jBilling = this.f28564l.billing(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jBilling >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jBilling))) <= Float.MAX_VALUE) {
                return AbstractC10392l.firebase(jFloatToRawIntBits, jBilling);
            }
        }
        return j;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) {
        C13601l c13601l = c6742l.f14144l;
        long jM3872l = m3872l(c13601l.f26629l.m4551private());
        long jYandex = this.f28567l.yandex(AbstractC1924l.loadAd(jM3872l), AbstractC1924l.loadAd(c13601l.f26629l.m4551private()), c6742l.getLayoutDirection());
        int i = (int) (jYandex >> 32);
        int i2 = (int) (jYandex & 4294967295L);
        C18449l c18449l = c13601l.f26629l;
        long jM4551private = c18449l.m4551private();
        c18449l.m4555synchronized().mopub();
        try {
            C16543l c16543l = (C16543l) c18449l.f36010l;
            if (this.f28565l) {
                C18449l c18449l2 = (C18449l) c16543l.f32482l;
                c16543l.remoteconfig(0.0f, 0.0f, Float.intBitsToFloat((int) (c18449l2.m4551private() >> 32)), Float.intBitsToFloat((int) (4294967295L & c18449l2.m4551private())), 1);
            }
            c16543l.inmobi(i, i2);
            this.f28561l.mopub(c6742l, jM3872l, this.f28566l, this.f28568l);
            c18449l.m4555synchronized().ads();
            c18449l.m4534abstract(jM4551private);
            c6742l.yandex();
        } catch (Throwable th) {
            AbstractC0653l.license(c18449l, jM4551private);
            throw th;
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ */
    public final void mo513l() {
        this.f28561l.metrica(null);
    }

    /* JADX INFO: renamed from: lؘٗۦ, reason: contains not printable characters */
    public final long m3873l(long j) {
        float fIsPro;
        int iSubs;
        float fAmazon;
        boolean zBilling = C15519l.billing(j);
        boolean zPurchase = C15519l.purchase(j);
        if (!zBilling || !zPurchase) {
            boolean z = C15519l.amazon(j) && C15519l.crashlytics(j);
            C7737l c7737l = this.f28561l;
            long jSubs = c7737l.subs();
            if (jSubs != 9205357640488583168L) {
                if (!z || (!zBilling && !zPurchase)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jSubs >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jSubs & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i = AbstractC1924l.loadAd;
                        fIsPro = AbstractC8576l.amazon(fIntBitsToFloat, C15519l.isPro(j), C15519l.admob(j));
                    } else {
                        fIsPro = C15519l.isPro(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i2 = AbstractC1924l.loadAd;
                        fAmazon = AbstractC8576l.amazon(fIntBitsToFloat2, C15519l.subs(j), C15519l.mopub(j));
                    } else {
                        iSubs = C15519l.subs(j);
                    }
                    long jM3872l = m3872l((((long) Float.floatToRawIntBits(fAmazon)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIsPro)) << 32));
                    return C15519l.yandex(AbstractC7563l.mopub(AbstractC5573l.ads(Float.intBitsToFloat((int) (jM3872l >> 32))), j), 0, AbstractC7563l.billing(AbstractC5573l.ads(Float.intBitsToFloat((int) (jM3872l & 4294967295L))), j), 0, 10, j);
                }
                fIsPro = C15519l.admob(j);
                iSubs = C15519l.mopub(j);
                fAmazon = iSubs;
                long jM3872l2 = m3872l((((long) Float.floatToRawIntBits(fAmazon)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIsPro)) << 32));
                return C15519l.yandex(AbstractC7563l.mopub(AbstractC5573l.ads(Float.intBitsToFloat((int) (jM3872l2 >> 32))), j), 0, AbstractC7563l.billing(AbstractC5573l.ads(Float.intBitsToFloat((int) (jM3872l2 & 4294967295L))), j), 0, 10, j);
            }
            if (z && ((InterfaceC4141l) c7737l.f16237l.f15551l.getValue()).yandex() != null) {
                return C15519l.yandex(C15519l.admob(j), 0, C15519l.mopub(j), 0, 10, j);
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jLoadAd = AbstractC7563l.loadAd(0, i, 0, 0, 13);
        C15466l c15466l = this.f28562l;
        if (c15466l != null) {
            c15466l.admob(jLoadAd);
        }
        if (this.f28561l.subs() == 9205357640488583168L) {
            return interfaceC6357l.mo1460for(i);
        }
        long jM3873l = m3873l(jLoadAd);
        return Math.max(C15519l.subs(jM3873l), interfaceC6357l.mo1460for(i));
    }

    @Override // defpackage.InterfaceC3703l
    public final /* synthetic */ boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jLoadAd = AbstractC7563l.loadAd(0, 0, 0, i, 7);
        C15466l c15466l = this.f28562l;
        if (c15466l != null) {
            c15466l.admob(jLoadAd);
        }
        if (this.f28561l.subs() == 9205357640488583168L) {
            return interfaceC6357l.remoteconfig(i);
        }
        long jM3873l = m3873l(jLoadAd);
        return Math.max(C15519l.isPro(jM3873l), interfaceC6357l.remoteconfig(i));
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        long jLoadAd = AbstractC7563l.loadAd(0, 0, 0, i, 7);
        C15466l c15466l = this.f28562l;
        if (c15466l != null) {
            c15466l.admob(jLoadAd);
        }
        if (this.f28561l.subs() == 9205357640488583168L) {
            return interfaceC6357l.metrica(i);
        }
        long jM3873l = m3873l(jLoadAd);
        return Math.max(C15519l.isPro(jM3873l), interfaceC6357l.metrica(i));
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}
