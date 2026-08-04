package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lِؚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11693l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11359l f23440l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23441l;

    public /* synthetic */ C11693l(C11359l c11359l, int i) {
        this.f23441l = i;
        this.f23440l = c11359l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f23441l;
        C4346l c4346l = C4346l.f8873l;
        C11359l c11359l = this.f23440l;
        switch (i) {
            case 0:
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = c11359l.loadAd;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(interfaceC15451l.yandex(c4346l, 1.0f, true), 16.0f);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str, interfaceC17242lSmaato, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.admob, c6956l, 0, 0, 131064);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                InterfaceC15451l interfaceC15451l2 = (InterfaceC15451l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC15451l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String str2 = c11359l.loadAd;
                    InterfaceC17242l interfaceC17242lSmaato2 = AbstractC3605l.smaato(interfaceC15451l2.yandex(c4346l, 1.0f, true), 16.0f);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str2, interfaceC17242lSmaato2, ((C14370l) c6956l2.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l2)).loadAd.admob, c6956l2, 0, 0, 131064);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
