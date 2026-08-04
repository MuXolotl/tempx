package defpackage;

/* JADX INFO: renamed from: lَؔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10068l {
    public final boolean loadAd;
    public final int yandex;
    public static final C10068l crashlytics = new C10068l(2, false);
    public static final C10068l amazon = new C10068l(1, true);

    public C10068l(int i, boolean z) {
        this.yandex = i;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10068l)) {
            return false;
        }
        C10068l c10068l = (C10068l) obj;
        return this.yandex == c10068l.yandex && this.loadAd == c10068l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        if (equals(crashlytics)) {
            return "TextMotion.Static";
        }
        return equals(amazon) ? "TextMotion.Animated" : "Invalid";
    }
}
