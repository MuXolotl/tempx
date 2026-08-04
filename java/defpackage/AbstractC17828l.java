package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lَ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17828l {
    public static final C15578l yandex = new C15578l(-192029295, false, new C11902l(11));
    public static final C15578l loadAd = new C15578l(-1030923574, false, new C11902l(12));
    public static final C15578l crashlytics = new C15578l(2022595861, false, new C10673l(4));

    public static boolean amazon(C11826l c11826l, boolean z) throws EOFException, InterruptedIOException {
        int i;
        C13143l c13143l = new C13143l(16);
        boolean z2 = true;
        while (true) {
            c13143l.m3563native(8);
            if (!c11826l.billing(c13143l.yandex, 0, 8, true)) {
                break;
            }
            long jApplovin = c13143l.applovin();
            int iRemoteconfig = c13143l.remoteconfig();
            if (jApplovin != 1) {
                i = 8;
            } else {
                if (!c11826l.billing(c13143l.yandex, 8, 8, true)) {
                    break;
                }
                jApplovin = c13143l.m3564package();
                i = 16;
            }
            long j = i;
            if (jApplovin < j) {
                break;
            }
            int i2 = (int) (jApplovin - j);
            if (z2) {
                if (iRemoteconfig != 1718909296 || i2 < 8) {
                    break;
                }
                c13143l.m3563native(4);
                c11826l.billing(c13143l.yandex, 0, 4, false);
                if (c13143l.remoteconfig() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                c11826l.firebase(i2 - 4, false);
                z2 = false;
            } else {
                if (iRemoteconfig == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    c11826l.firebase(i2, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    public static C12843l crashlytics(List list, C12843l c12843l, InterfaceC0965l interfaceC0965l, ClassLoader classLoader) {
        ArrayList<C9243l> arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0581l c0581l = (C0581l) it.next();
            String str = c0581l.loadAd;
            int iInmobi = AbstractC5020l.inmobi(c0581l.amazon);
            int i = 1;
            if (iInmobi != 0) {
                if (iInmobi == 1) {
                    i = 2;
                } else {
                    if (iInmobi != 2) {
                        C18725l.billing();
                        return null;
                    }
                    i = 3;
                }
            }
            C13698l c13698l = AbstractC15547l.ad;
            InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[52];
            c13698l.m3679package(c0581l);
            arrayList.add(new C9243l(null, interfaceC0965l, str, i));
        }
        C14297l c14297lM4228l = AbstractC16901l.m4228l(list);
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(c14297lM4228l, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        Iterator it2 = c14297lM4228l.iterator();
        while (true) {
            C14596l c14596l = (C14596l) it2;
            if (!c14596l.f28578l.hasNext()) {
                break;
            }
            C1143l c1143l = (C1143l) c14596l.next();
            linkedHashMap.put(Integer.valueOf(((C0581l) c1143l.loadAd).crashlytics), arrayList.get(c1143l.yandex));
        }
        C12843l c12843l2 = new C12843l(arrayList, linkedHashMap, c12843l);
        int i2 = 0;
        for (C9243l c9243l : arrayList) {
            int i3 = i2 + 1;
            ArrayList arrayList2 = ((C0581l) list.get(i2)).purchase;
            ?? arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AbstractC10392l.metrica((C4258l) it3.next(), classLoader, c12843l2, null));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = Collections.singletonList(AbstractC1806l.loadAd);
            }
            c9243l.f19009l = arrayList3;
            i2 = i3;
        }
        return c12843l2;
    }

    public static final C2312l loadAd(C2312l c2312l, String str) {
        return c2312l.yandex(C3498l.purchase(str));
    }

    public static C4660l yandex() {
        AbstractC2847l.firebase();
        AbstractC2847l.firebase();
        C4660l c4660l = new C4660l();
        c4660l.yandex = C17924l.yandex;
        AbstractC2847l.firebase();
        c4660l.yandex = C1810l.yandex;
        return c4660l;
    }
}
