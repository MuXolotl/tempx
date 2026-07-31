package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؚؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4232l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8666l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f8667l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8668l;

    public /* synthetic */ C4232l(List list, Function1 function1, int i) {
        this.f8668l = i;
        this.f8667l = list;
        this.f8666l = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        int i2;
        Object obj6;
        int i3;
        int i4 = this.f8668l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        List list = this.f8667l;
        Function1 function1 = this.f8666l;
        int i5 = 1;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        switch (i4) {
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
                    C7946l c7946l = (C7946l) list.get(iIntValue);
                    c6956l.m2123default(1033485578);
                    boolean zBilling = c6956l.billing(function1) | c6956l.billing(c7946l);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj5 = objM2132native;
                        C0340l c0340l = new C0340l(function1, c7946l, z ? 1 : 0, 3);
                        c6956l.m2147try(c0340l);
                        obj5 = c0340l;
                    }
                    AbstractC7039l.yandex(c7946l, (Function0) obj5, AbstractC0080l.firebase(c4346l, 200.0f, 220.0f), c6956l, 384);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C3571l c3571l = (C3571l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C6956l c6956l2 = (C6956l) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (c6956l2.billing(c3571l) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= c6956l2.amazon(iIntValue3) ? 32 : 16;
                }
                if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
                    C14593l c14593l = (C14593l) list.get(iIntValue3);
                    c6956l2.m2123default(377344488);
                    boolean zBilling2 = c6956l2.billing(function1) | c6956l2.billing(c14593l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        obj6 = objM2132native2;
                        C0340l c0340l2 = new C0340l(function1, c14593l, z2 ? 1 : 0, 11);
                        c6956l2.m2147try(c0340l2);
                        obj6 = c0340l2;
                    }
                    AbstractC11790l.yandex(c14593l, (Function0) obj6, AbstractC0080l.vip(AbstractC0080l.purchase(c4346l, 56.0f), 200.0f), c6956l2, 384);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C7091l c7091l2 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l3.billing(c7091l2) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l3.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l3.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    EnumC11215l enumC11215l = (EnumC11215l) list.get(iIntValue5);
                    c6956l3.m2123default(1433260333);
                    int i7 = AbstractC15548l.yandex;
                    long j = C9735l.isPro;
                    C10707l c10707l = AbstractC5992l.yandex;
                    C15087l c15087lYandex = AbstractC15548l.yandex(j, ((C18718l) c6956l3.isPro(c10707l)).yandex, ((C18718l) c6956l3.isPro(c10707l)).loadAd, 0L, c6956l3, 504);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zBilling3 = c6956l3.billing(function1) | c6956l3.amazon(enumC11215l.ordinal());
                    Object objM2132native3 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C11239l(function1, enumC11215l, 14);
                        c6956l3.m2147try(objM2132native3);
                    }
                    AbstractC13319l.yandex(AbstractC14566l.amazon(-829118655, new C16944l(enumC11215l, i6), c6956l3), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15), null, null, AbstractC14566l.amazon(400555197, new C16944l(enumC11215l, i5), c6956l3), null, c15087lYandex, c6956l3, 24582, 428);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
