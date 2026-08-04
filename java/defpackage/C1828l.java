package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lُؓٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1828l implements InterfaceC16588l {
    public static final C1828l yandex = new C1828l();
    public static final InterfaceC1220l loadAd = AbstractC9968l.crashlytics(2, new C3321l(5));

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC0039l interfaceC0039lCrashlytics = interfaceC17739l.crashlytics(interfaceC18035lPurchase);
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039lCrashlytics;
        abstractC4072l.signatures(0, ((C0066l) obj).crashlytics, yandex.purchase());
        abstractC4072l.yandex(interfaceC18035lPurchase);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035lPurchase);
        boolean z = false;
        int iSubscription = 0;
        while (true) {
            C1828l c1828l = yandex;
            int iAdmob = interfaceC14988lCrashlytics.admob(c1828l.purchase());
            if (iAdmob == -1) {
                Unit unit = Unit.INSTANCE;
                interfaceC14988lCrashlytics.yandex(interfaceC18035lPurchase);
                if (z) {
                    return new C0066l(iSubscription);
                }
                throw new C9088l("days", purchase().yandex());
            }
            if (iAdmob != 0) {
                AbstractC13693l.isPro(iAdmob);
                throw null;
            }
            iSubscription = interfaceC14988lCrashlytics.subscription(c1828l.purchase(), 0);
            z = true;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return (InterfaceC18035l) loadAd.getValue();
    }
}
