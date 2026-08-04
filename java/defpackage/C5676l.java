package defpackage;

/* JADX INFO: renamed from: lؘٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5676l implements InterfaceC1525l {
    public final float loadAd;
    public final float yandex;

    public C5676l(float f, float f2) {
        AbstractC12442l.subs(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.yandex = f;
        this.loadAd = f2;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5676l.class == obj.getClass()) {
            C5676l c5676l = (C5676l) obj;
            if (this.yandex == c5676l.yandex && this.loadAd == c5676l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.loadAd).hashCode() + ((Float.valueOf(this.yandex).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.yandex + ", longitude=" + this.loadAd;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
