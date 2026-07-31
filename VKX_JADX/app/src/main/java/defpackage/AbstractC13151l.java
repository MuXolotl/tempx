package defpackage;

/* JADX INFO: renamed from: lْؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13151l implements InterfaceC16588l {
    public abstract InterfaceC1388l admob();

    public InterfaceC16588l billing(InterfaceC14988l interfaceC14988l, String str) {
        C13975l c13975lLoadAd = interfaceC14988l.loadAd();
        admob();
        c13975lLoadAd.getClass();
        AbstractC9464l.firebase(1, null);
        return null;
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC16588l interfaceC16588lAmazon = AbstractC1762l.amazon(this, interfaceC17739l, obj);
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC17739l.crashlytics(interfaceC18035lPurchase);
        abstractC4072l.appmetrica(purchase(), 0, interfaceC16588lAmazon.purchase().yandex());
        abstractC4072l.applovin(purchase(), 1, interfaceC16588lAmazon, obj);
        abstractC4072l.yandex(interfaceC18035lPurchase);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035lPurchase);
        Object objAds = null;
        String strRemoteconfig = null;
        while (true) {
            int iAdmob = interfaceC14988lCrashlytics.admob(purchase());
            if (iAdmob == -1) {
                if (objAds != null) {
                    interfaceC14988lCrashlytics.yandex(interfaceC18035lPurchase);
                    return objAds;
                }
                C10754l.metrica(AbstractC14814l.startapp("Polymorphic value has not been read for class ", strRemoteconfig));
                return null;
            }
            if (iAdmob == 0) {
                strRemoteconfig = interfaceC14988lCrashlytics.remoteconfig(purchase(), iAdmob);
            } else {
                if (iAdmob != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strRemoteconfig == null) {
                        strRemoteconfig = "unknown class";
                    }
                    sb.append(strRemoteconfig);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iAdmob);
                    throw new C14747l(sb.toString());
                }
                if (strRemoteconfig == null) {
                    C8339l.metrica("Cannot read polymorphic value before its type token");
                    return null;
                }
                objAds = interfaceC14988lCrashlytics.ads(purchase(), iAdmob, AbstractC1762l.crashlytics(this, interfaceC14988lCrashlytics, strRemoteconfig), null);
            }
        }
    }

    public InterfaceC16588l mopub(InterfaceC17739l interfaceC17739l, Object obj) {
        C13975l c13975lLoadAd = interfaceC17739l.loadAd();
        InterfaceC1388l interfaceC1388lAdmob = admob();
        c13975lLoadAd.getClass();
        if (interfaceC1388lAdmob.mo886strictfp(obj)) {
            AbstractC9464l.firebase(1, null);
        }
        return null;
    }
}
