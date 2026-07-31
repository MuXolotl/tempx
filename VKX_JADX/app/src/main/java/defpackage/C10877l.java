package defpackage;

/* JADX INFO: renamed from: lؘُٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10877l {
    public static final C13329l Companion = new C13329l();
    public final long yandex;

    public /* synthetic */ C10877l(long j) {
        this.yandex = j;
    }

    public static int loadAd(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean yandex(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10877l) {
            return this.yandex == ((C10877l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return loadAd(this.yandex);
    }

    public final String toString() {
        return String.valueOf(this.yandex);
    }
}
