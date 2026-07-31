package defpackage;

/* JADX INFO: renamed from: lؖٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4272l {
    public final long yandex;

    public /* synthetic */ C4272l(long j) {
        this.yandex = j;
    }

    public static boolean yandex(long j, Object obj) {
        return (obj instanceof C4272l) && j == ((C4272l) obj).yandex;
    }

    public final boolean equals(Object obj) {
        return yandex(this.yandex, obj);
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC2812l.subscription(this.yandex, "PropertyKey(key=", ")");
    }
}
