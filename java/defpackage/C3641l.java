package defpackage;

/* JADX INFO: renamed from: lْؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3641l implements InterfaceC16588l {
    public final C16413l amazon;
    public final InterfaceC16588l crashlytics;
    public final InterfaceC16588l loadAd;
    public final InterfaceC16588l yandex;

    public C3641l(InterfaceC16588l interfaceC16588l, InterfaceC16588l interfaceC16588l2, InterfaceC16588l interfaceC16588l3) {
        C16413l c16413l;
        this.yandex = interfaceC16588l;
        this.loadAd = interfaceC16588l2;
        this.crashlytics = interfaceC16588l3;
        InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
        C0783l c0783l = new C0783l(13, this);
        if (AbstractC12024l.m3315catch("kotlin.Triple")) {
            C8339l.metrica("Blank serial names are prohibited");
            c16413l = null;
        } else {
            C14416l c14416l = new C14416l("kotlin.Triple");
            c0783l.invoke(c14416l);
            c16413l = new C16413l("kotlin.Triple", C16015l.amazon, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
        }
        this.amazon = c16413l;
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        C12823l c12823l = (C12823l) obj;
        C16413l c16413l = this.amazon;
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC17739l.crashlytics(c16413l);
        abstractC4072l.applovin(c16413l, 0, this.yandex, c12823l.f25200l);
        abstractC4072l.applovin(c16413l, 1, this.loadAd, c12823l.f25199l);
        abstractC4072l.applovin(c16413l, 2, this.crashlytics, c12823l.f25198l);
        abstractC4072l.yandex(c16413l);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        C16413l c16413l = this.amazon;
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(c16413l);
        Object obj = AbstractC9905l.loadAd;
        Object objAds = obj;
        Object objAds2 = objAds;
        Object objAds3 = objAds2;
        while (true) {
            int iAdmob = interfaceC14988lCrashlytics.admob(c16413l);
            if (iAdmob == -1) {
                interfaceC14988lCrashlytics.yandex(c16413l);
                if (objAds == obj) {
                    C6541l.firebase("Element 'first' is missing");
                    return null;
                }
                if (objAds2 == obj) {
                    C6541l.firebase("Element 'second' is missing");
                    return null;
                }
                if (objAds3 != obj) {
                    return new C12823l(objAds, objAds2, objAds3);
                }
                C6541l.firebase("Element 'third' is missing");
                return null;
            }
            if (iAdmob == 0) {
                objAds = interfaceC14988lCrashlytics.ads(c16413l, 0, this.yandex, null);
            } else if (iAdmob == 1) {
                objAds2 = interfaceC14988lCrashlytics.ads(c16413l, 1, this.loadAd, null);
            } else {
                if (iAdmob != 2) {
                    C6541l.firebase(AbstractC0653l.vip(iAdmob, "Unexpected index "));
                    return null;
                }
                objAds3 = interfaceC14988lCrashlytics.ads(c16413l, 2, this.crashlytics, null);
            }
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return this.amazon;
    }
}
