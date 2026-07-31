package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؕٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3387l {
    public static final String yandex = C14513l.applovin("Schedulers");

    public static void loadAd(C12211l c12211l, WorkDatabase workDatabase, List list) {
        List list2;
        if (list == null || list.size() == 0) {
            return;
        }
        C9280l c9280lSignature = workDatabase.Signature();
        workDatabase.loadAd();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                list2 = (List) AbstractC2021l.purchase(c9280lSignature.yandex, true, false, new C8125l(15));
                yandex(c9280lSignature, c12211l.amazon, list2);
            } else {
                list2 = null;
            }
            List list3 = (List) AbstractC2021l.purchase(c9280lSignature.yandex, true, false, new C4119l(c12211l.firebase, 7));
            yandex(c9280lSignature, c12211l.amazon, list3);
            if (list2 != null) {
                list3.addAll(list2);
            }
            List list4 = (List) AbstractC2021l.purchase(c9280lSignature.yandex, true, false, new C8125l(18));
            workDatabase.vip();
            workDatabase.firebase();
            if (list3.size() > 0) {
                C7718l[] c7718lArr = (C7718l[]) list3.toArray(new C7718l[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC15402l interfaceC15402l = (InterfaceC15402l) it.next();
                    if (interfaceC15402l.crashlytics()) {
                        interfaceC15402l.purchase(c7718lArr);
                    }
                }
            }
            if (list4.size() > 0) {
                C7718l[] c7718lArr2 = (C7718l[]) list4.toArray(new C7718l[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC15402l interfaceC15402l2 = (InterfaceC15402l) it2.next();
                    if (!interfaceC15402l2.crashlytics()) {
                        interfaceC15402l2.purchase(c7718lArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.firebase();
            throw th;
        }
    }

    public static void yandex(C9280l c9280l, C6565l c6565l, List list) {
        if (list.size() > 0) {
            c6565l.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c9280l.purchase(jCurrentTimeMillis, ((C7718l) it.next()).yandex);
            }
        }
    }
}
