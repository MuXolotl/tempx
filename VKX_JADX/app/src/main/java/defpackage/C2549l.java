package defpackage;

/* JADX INFO: renamed from: lِؔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2549l {
    public final C4292l amazon;
    public final C11775l crashlytics;
    public final C0820l loadAd;
    public final float purchase;
    public final C2891l yandex;

    public C2549l(C2891l c2891l, C0820l c0820l, C11775l c11775l, C4292l c4292l, float f) {
        this.yandex = c2891l;
        this.loadAd = c0820l;
        this.crashlytics = c11775l;
        this.amazon = c4292l;
        this.purchase = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2549l.class != obj.getClass()) {
            return false;
        }
        C2549l c2549l = (C2549l) obj;
        return AbstractC8576l.yandex(this.yandex, c2549l.yandex) && AbstractC8576l.yandex(this.loadAd, c2549l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c2549l.crashlytics) && AbstractC8576l.yandex(this.amazon, c2549l.amazon);
    }

    public final int hashCode() {
        return this.amazon.yandex.hashCode() + ((EnumC3738l.Auto.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + ((this.yandex.hashCode() + 38347) * 31)) * 31)) * 31)) * 31);
    }
}
