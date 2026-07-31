package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lًۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8408l {
    public final int loadAd;
    public final WeakReference yandex;

    public C8408l(ClassLoader classLoader) {
        this.yandex = new WeakReference(classLoader);
        this.loadAd = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8408l) && this.yandex.get() == ((C8408l) obj).yandex.get();
    }

    public final int hashCode() {
        return this.loadAd;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.yandex.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
