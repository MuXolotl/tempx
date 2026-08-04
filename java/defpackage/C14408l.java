package defpackage;

/* JADX INFO: renamed from: lٓۚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14408l {
    public final C2209l crashlytics;
    public final C2209l loadAd;
    public final C2209l yandex;

    public C14408l(C2209l c2209l, C2209l c2209l2, C2209l c2209l3) {
        this.yandex = c2209l;
        this.loadAd = c2209l2;
        this.crashlytics = c2209l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14408l.class != obj.getClass()) {
            return false;
        }
        C14408l c14408l = (C14408l) obj;
        return AbstractC8576l.yandex(this.yandex, c14408l.yandex) && this.loadAd.equals(c14408l.loadAd) && this.crashlytics.equals(c14408l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC12900l.purchase(this.loadAd, this.yandex.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CardBorder(border=" + this.yandex + ", focusedBorder=" + this.loadAd + ", pressedBorder=" + this.crashlytics + ')';
    }
}
