package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٟؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5418l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11605l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f11606l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11607l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11608l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11609l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11610l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f11611l;

    public /* synthetic */ C5418l(C5766l c5766l, int i, String str, C7968l c7968l, Function1 function1, InterfaceC17242l interfaceC17242l, int i2) {
        this.f11608l = 0;
        this.f11605l = c5766l;
        this.f11607l = i;
        this.f11610l = str;
        this.f11609l = c7968l;
        this.f11611l = function1;
        this.f11606l = interfaceC17242l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC6942l interfaceC6942l;
        int i = this.f11608l;
        Object obj3 = this.f11611l;
        Object obj4 = this.f11609l;
        int i2 = this.f11607l;
        Object obj5 = this.f11606l;
        Object obj6 = this.f11610l;
        int i3 = 1;
        Object obj7 = this.f11605l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((C5766l) obj7).m1853public(this.f11607l, (String) obj6, (C7968l) obj4, (Function1) obj3, (InterfaceC17242l) obj5, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C15578l) obj7).subs(this.f11610l, this.f11609l, this.f11611l, this.f11606l, (C6956l) obj, AbstractC0545l.purchase(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((C18449l) obj7).startapp((Function0) obj4, (String) obj6, this.f11607l, (C13412l) obj3, (InterfaceC17242l) obj5, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC16964l.yandex((C0764l) obj7, (InterfaceC1878l) obj6, (C1919l) obj4, (C13494l) obj3, (C15578l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C17284l) obj7).m4292abstract((String) obj6, (String) obj4, (C15578l) obj3, (InterfaceC17242l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C18306l) obj7).m4516protected((String) obj6, (String) obj4, (C15578l) obj3, (C15578l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
            case 6:
                Integer[] numArr = (Integer[]) obj7;
                InterfaceC6942l interfaceC6942l2 = (InterfaceC6942l) obj6;
                InterfaceC6942l interfaceC6942l3 = (InterfaceC6942l) obj4;
                InterfaceC6942l interfaceC6942l4 = (InterfaceC6942l) obj3;
                C6111l c6111l = (C6111l) obj5;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < 3) {
                        int i6 = i5 + 1;
                        int iIntValue2 = numArr[i4].intValue();
                        boolean z = i2 == i5 ? i3 : 0;
                        if (i5 != 0) {
                            interfaceC6942l = i5 != i3 ? interfaceC6942l4 : interfaceC6942l3;
                        } else {
                            interfaceC6942l = interfaceC6942l2;
                        }
                        InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942l, 0, c6956l, 48);
                        boolean zAmazon = c6956l.amazon(i5) | c6956l.admob(c6111l);
                        Object objM2132native = c6956l.m2132native();
                        if (zAmazon || objM2132native == C1867l.yandex) {
                            objM2132native = new C8803l(i5, c6111l, 8);
                            c6956l.m2147try(objM2132native);
                        }
                        C15578l c15578lAmazon = AbstractC14566l.amazon(633065317, new C10994l(iIntValue2, z, interfaceC8714lLoadAd), c6956l);
                        C10707l c10707l = AbstractC16964l.yandex;
                        AbstractC12853l.loadAd(z, (Function0) objM2132native, null, false, c15578lAmazon, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c6956l, 24576);
                        i4++;
                        numArr = numArr;
                        i5 = i6;
                        i3 = i3;
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2438l.yandex((C18656l) obj7, (C9459l) obj6, this.f11609l, this.f11611l, (InterfaceC17807l) obj5, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C5418l(C18449l c18449l, Function0 function0, String str, int i, C13412l c13412l, InterfaceC17242l interfaceC17242l, int i2) {
        this.f11608l = 2;
        this.f11605l = c18449l;
        this.f11609l = function0;
        this.f11610l = str;
        this.f11607l = i;
        this.f11611l = c13412l;
        this.f11606l = interfaceC17242l;
    }

    public /* synthetic */ C5418l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.f11608l = i2;
        this.f11605l = obj;
        this.f11610l = obj2;
        this.f11609l = obj3;
        this.f11611l = obj4;
        this.f11606l = obj5;
        this.f11607l = i;
    }

    public /* synthetic */ C5418l(Integer[] numArr, int i, InterfaceC6942l interfaceC6942l, InterfaceC6942l interfaceC6942l2, InterfaceC6942l interfaceC6942l3, C6111l c6111l) {
        this.f11608l = 6;
        this.f11605l = numArr;
        this.f11607l = i;
        this.f11610l = interfaceC6942l;
        this.f11609l = interfaceC6942l2;
        this.f11611l = interfaceC6942l3;
        this.f11606l = c6111l;
    }
}
