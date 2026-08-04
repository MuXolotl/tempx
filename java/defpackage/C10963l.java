package defpackage;

/* JADX INFO: renamed from: lَُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10963l implements InterfaceC1525l {
    public final int loadAd;
    public final float yandex;

    public C10963l(int i, float f) {
        this.yandex = f;
        this.loadAd = i;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C10963l.class == obj.getClass()) {
            C10963l c10963l = (C10963l) obj;
            if (this.yandex == c10963l.yandex && this.loadAd == c10963l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.yandex).hashCode() + 527) * 31) + this.loadAd;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.yandex + ", svcTemporalLayerCount=" + this.loadAd;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
