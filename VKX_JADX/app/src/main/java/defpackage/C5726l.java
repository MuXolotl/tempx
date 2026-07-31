package defpackage;

/* JADX INFO: renamed from: lؘٖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5726l {
    public final C17570l loadAd;
    public final C17570l yandex;
    public final C5643l crashlytics = C5643l.yandex;
    public final C17201l amazon = AbstractC0441l.admob();

    public C5726l(C17570l c17570l, C17570l c17570l2) {
        this.yandex = c17570l;
        this.loadAd = c17570l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5726l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5726l c5726l = (C5726l) obj;
        return this.yandex.equals(c5726l.yandex) && this.loadAd.equals(c5726l.loadAd) && this.crashlytics.equals(c5726l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5726l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((((this.loadAd.yandex.hashCode() + (this.yandex.yandex.hashCode() * 31)) * 31) + 107738481) * 31);
    }
}
