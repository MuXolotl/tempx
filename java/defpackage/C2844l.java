package defpackage;

/* JADX INFO: renamed from: lؔۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2844l {
    public final C12747l loadAd;
    public final InterfaceC2413l yandex;

    public C2844l(InterfaceC2413l interfaceC2413l, C12747l c12747l) {
        this.yandex = interfaceC2413l;
        this.loadAd = c12747l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2844l)) {
            return false;
        }
        C2844l c2844l = (C2844l) obj;
        return AbstractC8576l.yandex(this.yandex, c2844l.yandex) && AbstractC8576l.yandex(this.loadAd, c2844l.loadAd);
    }

    public final int hashCode() {
        InterfaceC2413l interfaceC2413l = this.yandex;
        int iHashCode = (interfaceC2413l == null ? 0 : interfaceC2413l.hashCode()) * 31;
        C12747l c12747l = this.loadAd;
        return iHashCode + (c12747l != null ? c12747l.hashCode() : 0);
    }

    public final String toString() {
        return "AwaitOpenCameraResult(cameraDeviceWrapper=" + this.yandex + ", androidCameraState=" + this.loadAd + ')';
    }
}
