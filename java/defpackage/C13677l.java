package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lْۜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13677l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17517l f26707l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f26708l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26709l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C1820l f26710l;

    public /* synthetic */ C13677l(List list, C17517l c17517l, C1820l c1820l, int i) {
        this.f26709l = i;
        this.f26708l = list;
        this.f26707l = c17517l;
        this.f26710l = c1820l;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.f26709l;
        C13863l c13863l = C1867l.yandex;
        List list = this.f26708l;
        C1820l c1820l = this.f26710l;
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
                    C14718l c14718l = (C14718l) list.get(iIntValue);
                    c6956l.m2123default(-1030748612);
                    C17517l c17517l = this.f26707l;
                    boolean zYandex = AbstractC8576l.yandex(c17517l.f34137l.get(c1820l.yandex), c14718l.yandex);
                    boolean zAdmob = c6956l.admob(c17517l) | c6956l.admob(c1820l) | c6956l.admob(c14718l);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C6042l(c17517l, c1820l, c14718l, 1);
                        c6956l.m2147try(objM2132native);
                    }
                    c17517l.pro(zYandex, c14718l, (Function0) objM2132native, c6956l, 0);
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
                    C14718l c14718l2 = (C14718l) list.get(iIntValue3);
                    c6956l2.m2123default(1221374494);
                    C17517l c17517l2 = this.f26707l;
                    boolean zYandex2 = AbstractC8576l.yandex(c17517l2.f34137l.get(c1820l.yandex), c14718l2.yandex);
                    boolean zAdmob2 = c6956l2.admob(c17517l2) | c6956l2.admob(c1820l) | c6956l2.admob(c14718l2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6042l(c17517l2, c1820l, c14718l2, 2);
                        c6956l2.m2147try(objM2132native2);
                    }
                    c17517l2.ad(zYandex2, c14718l2, (Function0) objM2132native2, null, null, c6956l2, 0, 24);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
