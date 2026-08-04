package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: l٘ٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18025l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C7659l f35260l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f35261l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35262l;

    public /* synthetic */ C18025l(List list, C7659l c7659l, int i) {
        this.f35262l = i;
        this.f35261l = list;
        this.f35260l = c7659l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.f35262l;
        C7659l c7659l = this.f35260l;
        List list = this.f35261l;
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
                    C12823l c12823l = ((Cimplements) list.get(iIntValue)).yandex;
                    c6956l.m2123default(1352369929);
                    c7659l.m2192abstract(c12823l, c6956l, 0);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
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
                    C12823l c12823l2 = ((Cimplements) list.get(iIntValue3)).yandex;
                    c6956l2.m2123default(454686849);
                    c7659l.m2192abstract(c12823l2, c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C7091l c7091l3 = (C7091l) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (c6956l3.billing(c7091l3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= c6956l3.amazon(iIntValue5) ? 32 : 16;
                }
                if (c6956l3.m2127for(i3 & 1, (i3 & 147) != 146)) {
                    C12823l c12823l3 = ((Cimplements) list.get(iIntValue5)).yandex;
                    c6956l3.m2123default(-1338593494);
                    c7659l.m2192abstract(c12823l3, c6956l3, 0);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
