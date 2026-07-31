package defpackage;

/* JADX INFO: renamed from: lؙْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6918l {
    public final long yandex;

    public /* synthetic */ C6918l(long j) {
        this.yandex = j;
    }

    public static String yandex(long j) {
        return AbstractC2812l.subscription(j, "ClassKey(key=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6918l) {
            return this.yandex == ((C6918l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return yandex(this.yandex);
    }
}
