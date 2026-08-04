package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lُؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1131l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C2169l f3083l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13238l f3084l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3085l;

    public /* synthetic */ C1131l(InterfaceC13238l interfaceC13238l, C2169l c2169l, int i) {
        this.f3085l = i;
        this.f3084l = interfaceC13238l;
        this.f3083l = c2169l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f3085l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC13238l interfaceC13238l = this.f3084l;
        C2169l c2169l = this.f3083l;
        switch (i3) {
            case 0:
                C7091l c7091l = (C7091l) obj;
                int iIntValue = ((Number) obj2).intValue();
                C6956l c6956l = (C6956l) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (c6956l.billing(c7091l) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= c6956l.amazon(iIntValue) ? 32 : 16;
                }
                if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
                    C16820l c16820l = (C16820l) interfaceC13238l.get(iIntValue);
                    c6956l.m2123default(-1176047602);
                    EnumC11447l enumC11447lM2931abstract = c2169l.m2931abstract();
                    AbstractC18643l abstractC18643lM2933instanceof = c2169l.m2933instanceof();
                    String strStartapp = abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null;
                    boolean zAdmob = c6956l.admob(c2169l) | c6956l.billing(c16820l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C11239l(c2169l, c16820l, 10);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC10114l.yandex(c16820l, enumC11447lM2931abstract, strStartapp, (Function0) objM2132native, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c7091l2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C14286l c14286l = (C14286l) interfaceC13238l.get(iIntValue3);
                    c6956l2.m2123default(-1609949367);
                    C7537l c7537l = new C7537l(4.0f, true, new C8339l(12));
                    boolean zAdmob2 = c6956l2.admob(c2169l) | c6956l2.admob(c14286l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C11239l(c2169l, c14286l, 9);
                        c6956l2.m2147try(objM2132native2);
                    }
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native2, 15);
                    C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
                    long j = c6956l2.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC7741l.purchase(c14286l.subs, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 128.0f), ((C14370l) c6956l2.isPro(c10707l)).crashlytics.amazon), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l2, 36912, 6, 31712);
                    AbstractC13010l.loadAd(c14286l.loadAd, AbstractC0080l.vip(c4346l, 128.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro, c6956l2, 48, 24960, 110584);
                    c6956l2.startapp(true);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
