package defpackage;

/* JADX INFO: renamed from: lُؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10858l {
    public final String yandex;
    public static final C10858l loadAd = new C10858l("SHA1");
    public static final C10858l crashlytics = new C10858l("SHA224");
    public static final C10858l amazon = new C10858l("SHA256");
    public static final C10858l purchase = new C10858l("SHA384");
    public static final C10858l billing = new C10858l("SHA512");

    public C10858l(String str) {
        this.yandex = str;
    }

    public final String toString() {
        return this.yandex;
    }
}
