package defpackage;

/* JADX INFO: renamed from: lٌّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9224l {
    public final int loadAd;
    public final int yandex;
    public static final C9224l crashlytics = new C9224l(0, 0);
    public static final C9224l amazon = new C9224l(2, 0);
    public static final C9224l purchase = new C9224l(0, 1);
    public static final C9224l billing = new C9224l(1, 1);

    public C9224l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9224l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9224l c9224l = (C9224l) obj;
        return this.yandex == c9224l.yandex && this.loadAd == c9224l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) C12347l.loadAd(this.yandex)) + ", vertical=" + ((Object) C15667l.loadAd(this.loadAd)) + ')';
    }
}
