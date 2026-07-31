package defpackage;

/* JADX INFO: renamed from: lؙۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6738l {
    public final C4812l loadAd;
    public final int yandex;

    public C6738l(int i, C4812l c4812l) {
        if (i == 0) {
            C6541l.subs("Null type");
            throw null;
        }
        this.yandex = i;
        this.loadAd = c4812l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6738l)) {
            return false;
        }
        C6738l c6738l = (C6738l) obj;
        if (!AbstractC5020l.firebase(this.yandex, c6738l.yandex)) {
            return false;
        }
        C4812l c4812l = c6738l.loadAd;
        C4812l c4812l2 = this.loadAd;
        if (c4812l2 == null) {
            return c4812l == null;
        }
        return c4812l2.equals(c4812l);
    }

    public final int hashCode() {
        int iInmobi = (AbstractC5020l.inmobi(this.yandex) ^ 1000003) * 1000003;
        C4812l c4812l = this.loadAd;
        return (c4812l == null ? 0 : c4812l.hashCode()) ^ iInmobi;
    }

    public final String toString() {
        return "CameraState{type=" + AbstractC14814l.applovin(this.yandex) + ", error=" + this.loadAd + "}";
    }
}
