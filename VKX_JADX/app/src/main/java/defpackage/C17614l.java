package defpackage;

/* JADX INFO: renamed from: l٘ؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17614l {
    public static final C17614l crashlytics = new C17614l(0, false);
    public final boolean loadAd;
    public final int yandex;

    public C17614l(int i, boolean z) {
        this.yandex = i;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17614l.class == obj.getClass()) {
            C17614l c17614l = (C17614l) obj;
            if (this.yandex == c17614l.yandex && this.loadAd == c17614l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.yandex << 1) + (this.loadAd ? 1 : 0);
    }
}
