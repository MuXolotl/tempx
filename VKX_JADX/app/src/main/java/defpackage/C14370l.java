package defpackage;

/* JADX INFO: renamed from: lٓۘٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14370l {
    public final InterfaceC1878l amazon;
    public final C1919l crashlytics;
    public final C13494l loadAd;
    public final C0764l yandex;

    public C14370l(C0764l c0764l, C13494l c13494l, C1919l c1919l, InterfaceC1878l interfaceC1878l) {
        this.yandex = c0764l;
        this.loadAd = c13494l;
        this.crashlytics = c1919l;
        this.amazon = interfaceC1878l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14370l.class != obj.getClass()) {
            return false;
        }
        C14370l c14370l = (C14370l) obj;
        return AbstractC8576l.yandex(this.yandex, c14370l.yandex) && this.loadAd.equals(c14370l.loadAd) && this.crashlytics.equals(c14370l.crashlytics) && AbstractC8576l.yandex(this.amazon, c14370l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.yandex + ", typography=" + this.loadAd + ", shapes=" + this.crashlytics + ", motionScheme=" + this.amazon + ")";
    }
}
