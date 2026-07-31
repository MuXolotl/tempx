package defpackage;

/* JADX INFO: renamed from: lْؕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13114l {
    public final String yandex;
    public static final C13114l loadAd = new C13114l("SHA1");
    public static final C13114l crashlytics = new C13114l("SHA224");
    public static final C13114l amazon = new C13114l("SHA256");
    public static final C13114l purchase = new C13114l("SHA384");
    public static final C13114l billing = new C13114l("SHA512");

    public C13114l(String str) {
        this.yandex = str;
    }

    public final String toString() {
        return this.yandex;
    }
}
