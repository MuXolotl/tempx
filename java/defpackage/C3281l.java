package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٌؕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3281l extends AbstractC1440l {
    public final C17927l amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C3281l(int i, int i2, int i3, C17927l c17927l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = c17927l;
    }

    public static C12014l loadAd() {
        C12014l c12014l = new C12014l(3, false);
        c12014l.f23941l = null;
        c12014l.f23940l = null;
        c12014l.f23944l = null;
        c12014l.f23943l = C17927l.purchase;
        return c12014l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3281l)) {
            return false;
        }
        C3281l c3281l = (C3281l) obj;
        return c3281l.yandex == this.yandex && c3281l.loadAd == this.loadAd && c3281l.crashlytics == this.crashlytics && c3281l.amazon == this.amazon;
    }

    public final int hashCode() {
        return Objects.hash(C3281l.class, Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), this.amazon);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.amazon) + ", " + this.loadAd + "-byte IV, " + this.crashlytics + "-byte tag, and " + this.yandex + "-byte key)";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.amazon != C17927l.purchase;
    }
}
