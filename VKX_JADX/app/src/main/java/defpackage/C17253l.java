package defpackage;

/* JADX INFO: renamed from: lؚٜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17253l implements InterfaceC11780l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C17253l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            AbstractC10440l.yandex("Padding must be non-negative");
        }
    }

    @Override // defpackage.InterfaceC11780l
    public final float amazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC11780l
    public final float crashlytics(EnumC9931l enumC9931l) {
        return enumC9931l == EnumC9931l.f20223l ? this.crashlytics : this.yandex;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17253l)) {
            return false;
        }
        C17253l c17253l = (C17253l) obj;
        return C14467l.loadAd(this.yandex, c17253l.yandex) && C14467l.loadAd(this.loadAd, c17253l.loadAd) && C14467l.loadAd(this.crashlytics, c17253l.crashlytics) && C14467l.loadAd(this.amazon, c17253l.amazon);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    @Override // defpackage.InterfaceC11780l
    public final float loadAd(EnumC9931l enumC9931l) {
        return enumC9931l == EnumC9931l.f20223l ? this.yandex : this.crashlytics;
    }

    public final String toString() {
        String strCrashlytics = C14467l.crashlytics(this.yandex);
        String strCrashlytics2 = C14467l.crashlytics(this.loadAd);
        return AbstractC9361l.advert(AbstractC14814l.license("PaddingValues(start=", strCrashlytics, ", top=", strCrashlytics2, ", end="), C14467l.crashlytics(this.crashlytics), ", bottom=", C14467l.crashlytics(this.amazon), ")");
    }

    @Override // defpackage.InterfaceC11780l
    public final float yandex() {
        return this.amazon;
    }
}
