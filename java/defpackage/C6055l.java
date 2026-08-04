package defpackage;

/* JADX INFO: renamed from: lؘِۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6055l {
    public final Object crashlytics;
    public final Object loadAd;
    public final Object yandex;

    public C6055l(Object obj, Object obj2, Object obj3) {
        this.yandex = obj;
        this.loadAd = obj2;
        this.crashlytics = obj3;
    }

    public final IllegalArgumentException yandex() {
        Object obj = this.yandex;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.loadAd);
        return new IllegalArgumentException(AbstractC9361l.ad(AbstractC14814l.license("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.crashlytics)));
    }
}
