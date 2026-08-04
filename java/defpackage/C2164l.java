package defpackage;

/* JADX INFO: renamed from: lؓ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2164l {
    public final Object crashlytics;
    public final Object loadAd;
    public final Object yandex;

    public C2164l(Object obj, Object obj2, Object obj3) {
        this.yandex = obj;
        this.loadAd = obj2;
        this.crashlytics = obj3;
    }

    public final IllegalArgumentException yandex() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.yandex;
        sb.append(obj);
        sb.append("=");
        sb.append(this.loadAd);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.crashlytics);
        return new IllegalArgumentException(sb.toString());
    }
}
