package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَؑۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0600l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11359l f2037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2038l;

    public /* synthetic */ C0600l(C11359l c11359l, int i) {
        this.f2038l = i;
        this.f2037l = c11359l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        int i = this.f2038l;
        C9946l c9946l = AbstractC16837l.yandex;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        C11359l c11359l = this.f2037l;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Number) obj2).intValue();
                List list = c11359l.purchase;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zBilling = c6956l.billing(list);
                    Object objM2132native = c6956l.m2132native();
                    if (zBilling || objM2132native == c13863l) {
                        obj3 = objM2132native;
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
                        }
                        c6956l.m2147try(arrayList);
                        obj3 = arrayList;
                    }
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC11028l.crashlytics((List) obj3, ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, ((C14370l) c6956l.isPro(c10707l)).yandex.premium, AbstractC0080l.vip(AbstractC4927l.amazon(c4346l, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, c9946l), 120.0f).premium(AbstractC0080l.loadAd), c6956l, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                List list2 = c11359l.purchase;
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBilling2 = c6956l2.billing(list2);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zBilling2 || objM2132native2 == c13863l) {
                        obj4 = objM2132native2;
                        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Float.valueOf((float) ((Number) it2.next()).doubleValue()));
                        }
                        c6956l2.m2147try(arrayList2);
                        obj4 = arrayList2;
                    }
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC11028l.crashlytics((List) obj4, ((C14370l) c6956l2.isPro(c10707l2)).yandex.yandex, ((C14370l) c6956l2.isPro(c10707l2)).yandex.premium, AbstractC0080l.vip(AbstractC4927l.amazon(c4346l, ((C14370l) c6956l2.isPro(c10707l2)).yandex.startapp, c9946l), 120.0f).premium(AbstractC0080l.loadAd), c6956l2, 0);
                } else {
                    c6956l2.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
