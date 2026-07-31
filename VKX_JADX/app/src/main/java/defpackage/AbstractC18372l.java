package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: l٘ۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18372l {
    public static final C11154l yandex = new C11154l(0);

    public static synchronized void yandex() {
        C11154l c11154l = yandex;
        Iterator it = ((C10220l) c11154l.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        c11154l.clear();
    }
}
