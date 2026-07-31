package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؚٗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16816l extends AbstractC1440l {
    public final C5138l amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C16816l(int i, int i2, int i3, C5138l c5138l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = c5138l;
    }

    public static C10038l loadAd() {
        C10038l c10038l = new C10038l(4, false);
        c10038l.f20463l = null;
        c10038l.f20462l = null;
        c10038l.f20466l = null;
        c10038l.f20465l = C5138l.f11178l;
        return c10038l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16816l)) {
            return false;
        }
        C16816l c16816l = (C16816l) obj;
        return c16816l.yandex == this.yandex && c16816l.loadAd == this.loadAd && c16816l.crashlytics == this.crashlytics && c16816l.amazon == this.amazon;
    }

    public final int hashCode() {
        return Objects.hash(C16816l.class, Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), this.amazon);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.amazon) + ", " + this.loadAd + "-byte IV, " + this.crashlytics + "-byte tag, and " + this.yandex + "-byte key)";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.amazon != C5138l.f11178l;
    }
}
