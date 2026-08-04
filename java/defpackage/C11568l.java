package defpackage;

/* JADX INFO: renamed from: lِؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11568l {
    public final C4442l crashlytics;
    public final C4442l loadAd;
    public final C4442l yandex;

    public C11568l(C4442l c4442l, C4442l c4442l2, C4442l c4442l3) {
        this.yandex = c4442l;
        this.loadAd = c4442l2;
        this.crashlytics = c4442l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11568l.class != obj.getClass()) {
            return false;
        }
        C11568l c11568l = (C11568l) obj;
        return AbstractC8576l.yandex(this.yandex, c11568l.yandex) && AbstractC8576l.yandex(this.loadAd, c11568l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11568l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ClickableSurfaceGlow(glow=" + this.yandex + ", focusedGlow=" + this.loadAd + ", pressedGlow=" + this.crashlytics + ')';
    }
}
