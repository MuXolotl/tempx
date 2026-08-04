package defpackage;

/* JADX INFO: renamed from: lٓۤؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14519l {
    public static final C14519l amazon = new C14519l(0.0f, new C12015l(0.0f, 0.0f), 0);
    public final int crashlytics;
    public final C12015l loadAd;
    public final float yandex;

    public C14519l(float f, C12015l c12015l, int i) {
        this.yandex = f;
        this.loadAd = c12015l;
        this.crashlytics = i;
        if (Float.isNaN(f)) {
            C8339l.metrica("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14519l)) {
            return false;
        }
        C14519l c14519l = (C14519l) obj;
        return this.yandex == c14519l.yandex && AbstractC8576l.yandex(this.loadAd, c14519l.loadAd) && this.crashlytics == c14519l.crashlytics;
    }

    public final int hashCode() {
        return ((this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31)) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.yandex);
        sb.append(", range=");
        sb.append(this.loadAd);
        sb.append(", steps=");
        return AbstractC14814l.remoteconfig(this.crashlytics, ")", sb);
    }
}
