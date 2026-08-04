package defpackage;

/* JADX INFO: renamed from: lؔؐۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2312l {
    public static final C2312l crashlytics = new C2312l("");
    public transient C2312l loadAd;
    public final C16781l yandex;

    public C2312l(String str) {
        this.yandex = new C16781l(this, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2312l) {
            return AbstractC8576l.yandex(this.yandex, ((C2312l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.yandex.hashCode();
    }

    public final C2312l loadAd() {
        C2312l c2312l = this.loadAd;
        if (c2312l != null) {
            return c2312l;
        }
        C16781l c16781l = this.yandex;
        if (c16781l.crashlytics()) {
            C8339l.smaato("root");
            return null;
        }
        C2312l c2312l2 = new C2312l(c16781l.purchase());
        this.loadAd = c2312l2;
        return c2312l2;
    }

    public final String toString() {
        return this.yandex.toString();
    }

    public final C2312l yandex(C3498l c3498l) {
        return new C2312l(this.yandex.yandex(c3498l), this);
    }

    public C2312l(C16781l c16781l) {
        this.yandex = c16781l;
    }

    public C2312l(C16781l c16781l, C2312l c2312l) {
        this.yandex = c16781l;
        this.loadAd = c2312l;
    }
}
