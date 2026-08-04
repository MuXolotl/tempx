package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙؙ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17735l {
    public final ArrayList yandex;

    public C17735l(ArrayList arrayList) {
        this.yandex = new ArrayList(arrayList);
    }

    public static String amazon(C17735l c17735l) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c17735l.yandex.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC4212l) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final ArrayList crashlytics(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4212l interfaceC4212l : this.yandex) {
            if (cls.isAssignableFrom(interfaceC4212l.getClass())) {
                arrayList.add(interfaceC4212l);
            }
        }
        return arrayList;
    }

    public final InterfaceC4212l loadAd(Class cls) {
        for (InterfaceC4212l interfaceC4212l : this.yandex) {
            if (interfaceC4212l.getClass() == cls) {
                return interfaceC4212l;
            }
        }
        return null;
    }

    public final boolean yandex(Class cls) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((InterfaceC4212l) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }
}
