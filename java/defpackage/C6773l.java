package defpackage;

/* JADX INFO: renamed from: lؙ۟ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6773l {
    public final String yandex;
    public static final C6773l loadAd = new C6773l("HTTP");
    public static final C6773l crashlytics = new C6773l("HTTPS");

    public C6773l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6773l) && this.yandex.equals(((C6773l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("ConnectorType(name="), this.yandex, ')');
    }
}
