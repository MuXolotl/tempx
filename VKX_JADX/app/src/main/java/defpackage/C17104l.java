package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lْٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17104l implements InterfaceC16588l {
    public static final C17104l yandex = new C17104l();
    public static final InterfaceC1220l loadAd = AbstractC9968l.crashlytics(2, new C1712l(11));

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC17739l.crashlytics(interfaceC18035lPurchase);
        abstractC4072l.premium(yandex.purchase(), 0, ((C14146l) obj).crashlytics);
        abstractC4072l.yandex(interfaceC18035lPurchase);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        InterfaceC18035l interfaceC18035lPurchase = purchase();
        InterfaceC14988l interfaceC14988lCrashlytics = interfaceC10726l.crashlytics(interfaceC18035lPurchase);
        long jInmobi = 0;
        boolean z = false;
        while (true) {
            C17104l c17104l = yandex;
            int iAdmob = interfaceC14988lCrashlytics.admob(c17104l.purchase());
            if (iAdmob == -1) {
                Unit unit = Unit.INSTANCE;
                interfaceC14988lCrashlytics.yandex(interfaceC18035lPurchase);
                if (z) {
                    return new C14146l(jInmobi);
                }
                throw new C9088l("nanoseconds", purchase().yandex());
            }
            if (iAdmob != 0) {
                AbstractC13693l.isPro(iAdmob);
                throw null;
            }
            jInmobi = interfaceC14988lCrashlytics.inmobi(c17104l.purchase(), 0);
            z = true;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return (InterfaceC18035l) loadAd.getValue();
    }
}
