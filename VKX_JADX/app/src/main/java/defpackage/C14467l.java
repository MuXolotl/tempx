package defpackage;

/* JADX INFO: renamed from: lٓۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14467l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f28331l;

    public static String crashlytics(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean loadAd(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static int yandex(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return yandex(this.f28331l, ((C14467l) obj).f28331l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14467l) {
            return Float.compare(this.f28331l, ((C14467l) obj).f28331l) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f28331l);
    }

    public final String toString() {
        return crashlytics(this.f28331l);
    }
}
