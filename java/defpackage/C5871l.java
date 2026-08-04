package defpackage;

/* JADX INFO: renamed from: lؘٟۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5871l implements InterfaceC2077l {
    public final /* synthetic */ C12217l admob;
    public final C5514l yandex;
    public int loadAd = -1;
    public long crashlytics = 9205357640488583168L;
    public long amazon = 0;
    public EnumC1826l purchase = EnumC1826l.f4233l;
    public boolean billing = true;
    public C11379l mopub = C1461l.f3667l;

    public C5871l(C12217l c12217l, C5514l c5514l) {
        this.admob = c12217l;
        this.yandex = c5514l;
    }

    public final void billing() {
        if ((this.crashlytics & 9223372034707292159L) != 9205357640488583168L) {
            C12217l c12217l = this.admob;
            c12217l.amazon();
            this.loadAd = -1;
            this.crashlytics = 9205357640488583168L;
            this.amazon = 0L;
            c12217l.pro = -1;
            this.mopub = C1461l.f3667l;
            c12217l.ads.setValue(EnumC11107l.f22312l);
            this.yandex.invoke();
            if (this.billing) {
                c12217l.ads();
            }
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void loadAd() {
        billing();
    }

    @Override // defpackage.InterfaceC2077l
    public final void onCancel() {
        billing();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    @Override // defpackage.InterfaceC2077l
    public final void purchase(long j) {
        int iIntValue;
        int iAmazon;
        C11379l c11379l;
        C3625l c3625l;
        C12217l c12217l = this.admob;
        boolean z = c12217l.isPro;
        C16328l c16328l = c12217l.yandex;
        C10312l c10312l = c12217l.loadAd;
        if (!z || c10312l.crashlytics() == null || c16328l.amazon().f12057l.length() == 0) {
            return;
        }
        long jSubs = C1187l.subs(this.amazon, j);
        this.amazon = jSubs;
        long jSubs2 = C1187l.subs(this.crashlytics, jSubs);
        if (this.loadAd >= 0 || c10312l.billing(jSubs2)) {
            C0327l c0327lCrashlytics = c10312l.crashlytics();
            int length = (c0327lCrashlytics == null || (c3625l = c0327lCrashlytics.yandex.yandex) == null) ? 0 : c3625l.f7563l.length();
            int i = this.loadAd;
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > length) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : c10312l.amazon(this.crashlytics, false);
            iAmazon = c10312l.amazon(jSubs2, false);
            if (this.loadAd < 0 && iIntValue == iAmazon) {
                return;
            }
            c11379l = this.mopub;
            c12217l.pro(EnumC6775l.f14199l);
        } else {
            iIntValue = c10312l.amazon(this.crashlytics, true);
            iAmazon = c10312l.amazon(jSubs2, true);
            c11379l = iIntValue == iAmazon ? C1461l.f3667l : this.mopub;
        }
        C11379l c11379l2 = c11379l;
        int i2 = iIntValue;
        int i3 = iAmazon;
        long j2 = c16328l.amazon().f12061l;
        long jSignatures = c12217l.signatures(c12217l.yandex.amazon(), i2, i3, false, c11379l2, false, false, new C14797l(9));
        if (this.loadAd == -1 && !C12814l.amazon(jSignatures)) {
            this.loadAd = (int) (jSignatures >> 32);
        }
        if (C12814l.admob(jSignatures)) {
            jSignatures = AbstractC2296l.loadAd((int) (jSignatures & 4294967295L), (int) (jSignatures >> 32));
        }
        if (!C12814l.crashlytics(jSignatures, j2)) {
            int i4 = (int) (jSignatures >> 32);
            int i5 = (int) (j2 >> 32);
            EnumC1826l enumC1826l = EnumC1826l.f4234l;
            if (i4 == i5 || ((int) (jSignatures & 4294967295L)) != ((int) (j2 & 4294967295L))) {
                EnumC1826l enumC1826l2 = EnumC1826l.f4233l;
                if (i4 == i5 && ((int) (jSignatures & 4294967295L)) != ((int) (j2 & 4294967295L))) {
                    enumC1826l = enumC1826l2;
                } else if ((((int) (jSignatures & 4294967295L)) + i4) / 2.0f > (i5 + ((int) (j2 & 4294967295L))) / 2.0f) {
                    enumC1826l = enumC1826l2;
                }
            }
            this.purchase = enumC1826l;
            this.billing = false;
        }
        if (C12814l.amazon(j2) || !C12814l.amazon(jSignatures)) {
            c16328l.isPro(jSignatures);
        }
        c12217l.isVip(this.purchase, jSubs2);
    }

    @Override // defpackage.InterfaceC2077l
    public final void yandex(long j, C11379l c11379l) {
        C12217l c12217l = this.admob;
        boolean z = c12217l.isPro;
        C16328l c16328l = c12217l.yandex;
        C10312l c10312l = c12217l.loadAd;
        if (z) {
            c12217l.isVip(this.purchase, j);
            c12217l.license(false);
            c12217l.ads.setValue(EnumC11107l.f22311l);
            this.crashlytics = j;
            this.amazon = 0L;
            c12217l.pro = -1;
            this.billing = true;
            this.mopub = c11379l;
            if (c10312l.crashlytics() == null) {
                return;
            }
            if (c10312l.billing(j)) {
                if (c16328l.amazon().f12057l.length() == 0) {
                    return;
                }
                int iAmazon = c10312l.amazon(j, true);
                long jSignatures = c12217l.signatures(new C5667l(c12217l.yandex.amazon(), C12814l.loadAd, null, null, null, null, null, 124), iAmazon, iAmazon, false, this.mopub, false, false, new C14797l(0));
                c16328l.isPro(jSignatures);
                c12217l.pro(EnumC6775l.f14199l);
                this.loadAd = (int) (jSignatures >> 32);
                return;
            }
            int iAmazon2 = c10312l.amazon(j, true);
            InterfaceC1234l interfaceC1234l = c12217l.firebase;
            if (interfaceC1234l != null) {
                ((C9421l) interfaceC1234l).yandex(0);
            }
            c16328l.getClass();
            c16328l.isPro(AbstractC2296l.loadAd(iAmazon2, iAmazon2));
            c12217l.license(true);
            this.billing = false;
            c12217l.pro(EnumC6775l.f14200l);
        }
    }

    @Override // defpackage.InterfaceC2077l
    public final void amazon() {
    }

    @Override // defpackage.InterfaceC2077l
    public final void crashlytics() {
    }
}
