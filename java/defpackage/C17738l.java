package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؙٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17738l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7679l f34555l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34556l;

    public /* synthetic */ C17738l(C7679l c7679l, int i) {
        this.f34556l = i;
        this.f34555l = c7679l;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f34556l;
        int i2 = 4;
        C13863l c13863l = C1867l.yandex;
        C7679l c7679l = this.f34555l;
        int i3 = 2;
        int i4 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 36.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
                    long j = c6956l.f14595continue;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                    C10707l c10707l = AbstractC16964l.yandex;
                    this.f34555l.m2195import(R.drawable.ic_add_square_outline_28, AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, 8.0f, 7), ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, true, 36.0f, 0.0f, c6956l, 27696, 32);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.bc_v2_title), null, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.amazon, c6956l, 0, 0, 130042);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.bc_v2_subtitle), null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.isPro, c6956l, 0, 0, 130042);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    C6893l c6893l = new C6893l();
                    InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l);
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    boolean zAdmob = c6956l2.admob(c7679l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C0783l(i3, c7679l);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC4654l.yandex(c6893l, interfaceC17242lFirebase, null, c17253l, 8.0f, c7537l, null, false, null, (Function1) objM2132native, c6956l2, 1772544);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zAdmob2 = c6956l3.admob(c7679l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C10575l(c7679l, i4);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC7470l.billing((Function0) objM2132native2, null, false, null, null, null, AbstractC17457l.crashlytics, c6956l3, 1572864, 62);
                    boolean zAdmob3 = c6956l3.admob(c7679l);
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C10575l(c7679l, i3);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC7470l.billing((Function0) objM2132native3, null, false, null, null, null, AbstractC17457l.amazon, c6956l3, 1572864, 62);
                } else {
                    c6956l3.m2124else();
                }
                break;
            default:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zAdmob4 = c6956l4.admob(c7679l);
                    Object objM2132native4 = c6956l4.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C10575l(c7679l, i2);
                        c6956l4.m2147try(objM2132native4);
                    }
                    C17253l c17253l2 = C12719l.yandex;
                    AbstractC17457l.mopub((Function0) objM2132native4, null, false, AbstractC16837l.yandex, C12719l.subs(((C14370l) c6956l4.isPro(AbstractC16964l.yandex)).yandex.yandex, 0L, c6956l4, 13), AbstractC3605l.loadAd(0.0f, 0.0f, 2), AbstractC17457l.mopub, c6956l4, 817892352, 358);
                } else {
                    c6956l4.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
