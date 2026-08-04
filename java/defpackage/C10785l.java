package defpackage;

/* JADX INFO: renamed from: lُؙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10785l {
    public final C6288l loadAd;
    public final C12747l yandex;

    public C10785l(C12747l c12747l, C6288l c6288l, int i) {
        c12747l = (i & 1) != 0 ? null : c12747l;
        c6288l = (i & 2) != 0 ? null : c6288l;
        this.yandex = c12747l;
        this.loadAd = c6288l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10785l)) {
            return false;
        }
        C10785l c10785l = (C10785l) obj;
        return AbstractC8576l.yandex(this.yandex, c10785l.yandex) && AbstractC8576l.yandex(this.loadAd, c10785l.loadAd);
    }

    public final int hashCode() {
        C12747l c12747l = this.yandex;
        int iHashCode = (c12747l == null ? 0 : c12747l.hashCode()) * 31;
        C6288l c6288l = this.loadAd;
        return iHashCode + (c6288l != null ? c6288l.yandex : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.yandex + ", errorCode=" + this.loadAd + ')';
    }
}
