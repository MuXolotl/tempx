package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٍٛٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9680l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f19759l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19760l;

    public /* synthetic */ C9680l(int i, Function0 function0) {
        this.f19760l = i;
        this.f19759l = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19760l;
        C4346l c4346l = C4346l.f8873l;
        Function0 function0 = this.f19759l;
        switch (i) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(c7091l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC5020l.smaato(c7091l, c4346l), false, null, function0, 15);
                    int i2 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC17860l.vip, interfaceC17242lLoadAd, null, null, AbstractC17860l.metrica, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, 24582, 428);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                C7091l c7091l2 = (C7091l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(c7091l2) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC9151l.loadAd(AbstractC5020l.smaato(c7091l2, c4346l), false, null, function0, 15);
                    int i3 = AbstractC15548l.yandex;
                    AbstractC13319l.yandex(AbstractC17860l.startapp, interfaceC17242lLoadAd2, null, AbstractC17860l.adcel, AbstractC17860l.ads, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l2, 510), c6956l2, 27654, 420);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj;
                InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj2;
                C15519l c15519l = (C15519l) obj3;
                float f = ((C14467l) function0.invoke()).f28331l;
                AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, AbstractC7563l.billing(C14467l.loadAd(f, Float.NaN) ? 0 : interfaceC7448l.mo870l(f), c15519l.yandex), 0, 11, c15519l.yandex));
                return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 14));
        }
    }
}
