package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10305l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C15050l f21010l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21011l;

    public /* synthetic */ C10305l(C15050l c15050l, int i) {
        this.f21011l = i;
        this.f21010l = c15050l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f21011l;
        C15050l c15050l = this.f21010l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(c15050l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = c15050l.crashlytics;
                    String str2 = c15050l.loadAd;
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 36.0f), AbstractC7497l.yandex);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC7741l.purchase(str, str2, interfaceC17242lCrashlytics, new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.ads), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.ads), null, c6956l2, 36864, 0, 32736);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
