package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lؖ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4423l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f9006l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9007l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ List f9008l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9009l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f9010l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f9011l;

    public C4423l(List list, int i, int i2, Function1 function1, Function1 function2, InterfaceC8714l interfaceC8714l) {
        this.f9008l = list;
        this.f9007l = i;
        this.f9006l = i2;
        this.f9010l = function1;
        this.f9009l = function2;
        this.f9011l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C7091l c7091l = (C7091l) obj;
        int iIntValue = ((Number) obj2).intValue();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c6956l.billing(c7091l) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c6956l.amazon(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (c6956l.m2127for(i & 1, (i & 147) != 146)) {
            InterfaceC9265l interfaceC9265l = (InterfaceC9265l) this.f9008l.get(iIntValue);
            c6956l.m2123default(-1125384499);
            boolean z2 = iIntValue == this.f9007l;
            boolean z3 = interfaceC9265l instanceof C6331l;
            InterfaceC8714l interfaceC8714l = this.f9011l;
            C4346l c4346l = C4346l.f8873l;
            C13863l c13863l = C1867l.yandex;
            Function1 function1 = this.f9010l;
            if (z3) {
                c6956l.m2123default(-1125267537);
                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                boolean zBilling = c6956l.billing(function1);
                if ((((i & 112) ^ 48) <= 32 || !c6956l.amazon(iIntValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z4 = zBilling | z;
                Object objM2132native = c6956l.m2132native();
                if (z4 || objM2132native == c13863l) {
                    objM2132native = new C3055l(function1, iIntValue, interfaceC8714l, 0);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC8007l.admob(z2, this.f9006l, (Function0) objM2132native, interfaceC17242lAmazon, c6956l, 24960);
                c6956l.startapp(false);
            } else {
                if (!(interfaceC9265l instanceof C11054l)) {
                    throw AbstractC12900l.billing(-174848136, c6956l, false);
                }
                c6956l.m2123default(-1124647971);
                String str = ((C11054l) interfaceC9265l).crashlytics;
                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                int i2 = (i & 112) ^ 48;
                boolean zBilling2 = c6956l.billing(function1) | ((i2 > 32 && c6956l.amazon(iIntValue)) || (i & 48) == 32);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C3055l(function1, iIntValue, interfaceC8714l, 1);
                    c6956l.m2147try(objM2132native2);
                }
                Function0 function0 = (Function0) objM2132native2;
                Function1 function2 = this.f9009l;
                boolean zBilling3 = c6956l.billing(function2);
                if ((i2 <= 32 || !c6956l.amazon(iIntValue)) && (i & 48) != 32) {
                    z = false;
                }
                boolean z5 = zBilling3 | z;
                Object objM2132native3 = c6956l.m2132native();
                if (z5 || objM2132native3 == c13863l) {
                    objM2132native3 = new C13998l(function2, iIntValue, 3);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC8007l.subs(str, z2, function0, (Function0) objM2132native3, interfaceC17242lAmazon2, c6956l, 196656);
                c6956l = c6956l;
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
