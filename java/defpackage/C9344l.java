package defpackage;

/* JADX INFO: renamed from: lٍؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9344l {
    public final C17253l loadAd;
    public final long yandex;

    public C9344l() {
        long jAmazon = AbstractC12953l.amazon(4284900966L);
        C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 0.0f, 3);
        this.yandex = jAmazon;
        this.loadAd = c17253lLoadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9344l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C9344l c9344l = (C9344l) obj;
        return C9735l.crashlytics(this.yandex, c9344l.yandex) && AbstractC8576l.yandex(this.loadAd, c9344l.loadAd);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return this.loadAd.hashCode() + (C10882l.yandex(this.yandex) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + C9735l.subs(this.yandex) + ", drawPadding=" + this.loadAd + ")";
    }
}
