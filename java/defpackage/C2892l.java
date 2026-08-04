package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؔۚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2892l extends AbstractC16915l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6292l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2892l(int i, Object obj) {
        super(3);
        this.f6293l = i;
        this.f6292l = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6293l;
        int i2 = 6;
        Object obj4 = this.f6292l;
        switch (i) {
            case 0:
                InterfaceC13553l interfaceC13553l = (InterfaceC13553l) obj;
                C6956l c6956l = (C6956l) obj2;
                ((Number) obj3).intValue();
                Object objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = new C14632l(interfaceC13553l, interfaceC2262l);
                    c6956l.m2147try(objM2132native2);
                }
                C14632l c14632l = (C14632l) objM2132native2;
                ((C15578l) obj4).invoke(c14632l, new C13554l(c14632l), c6956l, 6);
                return Unit.INSTANCE;
            case 1:
                AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) obj2).adcel(((C15519l) obj3).yandex);
                return ((InterfaceC7448l) obj).isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C2977l(abstractC10113lAdcel, (C10405l) obj4, i2));
            default:
                C6956l c6956l2 = ((C1393l) obj).yandex;
                C6956l c6956l3 = (C6956l) obj2;
                ((Number) obj3).intValue();
                int iLoadAd = AbstractC8238l.loadAd(c6956l3);
                InterfaceC17242l interfaceC17242lBilling = (InterfaceC17242l) obj4;
                if (interfaceC17242lBilling != C4346l.f8873l) {
                    interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, AbstractC15560l.admob(new C3225l(c6956l3.smaato()), interfaceC17242lBilling));
                }
                c6956l2.m2125final(509942095);
                InterfaceC8801l.firebase.getClass();
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(iLoadAd), C3438l.isPro);
                c6956l2.startapp(false);
                return Unit.INSTANCE;
        }
    }
}
