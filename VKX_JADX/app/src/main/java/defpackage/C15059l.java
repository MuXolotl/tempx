package defpackage;

/* JADX INFO: renamed from: lٔٞ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15059l {
    public final String yandex;
    public static final C15059l loadAd = new C15059l("NIST_P256");
    public static final C15059l crashlytics = new C15059l("NIST_P384");
    public static final C15059l amazon = new C15059l("NIST_P521");
    public static final C15059l purchase = new C15059l("X25519");

    public C15059l(String str) {
        this.yandex = str;
    }

    public final String toString() {
        return this.yandex;
    }
}
