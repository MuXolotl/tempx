package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؕۚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3626l {
    public static final Object[] yandex = new Object[0];
    public static final C12463l loadAd = new C12463l(0);

    public static final void loadAd(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            AbstractC13082l.crashlytics("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
            throw null;
        }
        if (i < 0) {
            AbstractC13082l.amazon("fromIndex (" + i + ") is less than 0.");
            throw null;
        }
        if (i2 <= size) {
            return;
        }
        AbstractC13082l.amazon("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        throw null;
    }

    public static final void yandex(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            AbstractC13082l.amazon("Index " + i + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }
}
