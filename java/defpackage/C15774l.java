package defpackage;

/* JADX INFO: renamed from: lِٕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15774l {
    public final String yandex;
    public static final C15774l loadAd = new C15774l("text/*");
    public static final C15774l crashlytics = new C15774l("*/*");

    public C15774l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15774l)) {
            return false;
        }
        return this.yandex.equals(((C15774l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC15560l.Signature("MediaType(representation='", this.yandex, "')");
    }
}
