package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؓٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1897l implements InterfaceC1525l {
    public final C10487l crashlytics;
    public final C10487l loadAd;
    public final float yandex;

    public C1897l(float f, C10487l c10487l, C10487l c10487l2) {
        this.yandex = f;
        this.loadAd = c10487l;
        this.crashlytics = c10487l2;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1897l)) {
            return false;
        }
        C1897l c1897l = (C1897l) obj;
        return Float.compare(this.yandex, c1897l.yandex) == 0 && Objects.equals(this.loadAd, c1897l.loadAd) && Objects.equals(this.crashlytics, c1897l.crashlytics);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.yandex) * 31;
        C10487l c10487l = this.loadAd;
        int iHashCode = (iFloatToIntBits + (c10487l != null ? c10487l.hashCode() : 0)) * 31;
        C10487l c10487l2 = this.crashlytics;
        return iHashCode + (c10487l2 != null ? c10487l2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.yandex + ", field 1=" + this.loadAd + ", field 2=" + this.crashlytics;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
