package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: lؖۚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4384l {
    public final ArrayList yandex;

    public C4384l() {
        this.yandex = new ArrayList();
    }

    public void crashlytics(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.yandex;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public void loadAd(Object obj) {
        this.yandex.add(obj);
    }

    public void yandex(InterfaceC16243l interfaceC16243l) {
        boolean z = interfaceC16243l instanceof InterfaceC18384l;
        ArrayList arrayList = this.yandex;
        if (z) {
            arrayList.add(interfaceC16243l);
        } else {
            if (!(interfaceC16243l instanceof C0659l)) {
                C18725l.billing();
                return;
            }
            Iterator it = ((C0659l) interfaceC16243l).yandex.iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC18384l) it.next());
            }
        }
    }

    public C4384l(int i) {
        this.yandex = new ArrayList(i);
    }
}
