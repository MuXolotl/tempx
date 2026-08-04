package defpackage;

/* JADX INFO: renamed from: lؓۦۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2261l {
    public final long yandex;

    public /* synthetic */ C2261l(long j) {
        this.yandex = j;
    }

    public static String crashlytics(long j) {
        return j != 9205357640488583168L ? AbstractC9361l.pro(C14467l.crashlytics(loadAd(j)), " x ", C14467l.crashlytics(yandex(j))) : "DpSize.Unspecified";
    }

    public static final float loadAd(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float yandex(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2261l) {
            return this.yandex == ((C2261l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return crashlytics(this.yandex);
    }
}
