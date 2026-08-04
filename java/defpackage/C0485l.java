package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؑٞۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0485l extends AbstractC8443l {
    public final C10858l amazon;
    public final C3179l crashlytics;
    public final int loadAd;
    public final int yandex;

    public C0485l(int i, int i2, C3179l c3179l, C10858l c10858l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = c3179l;
        this.amazon = c10858l;
    }

    public static C10038l loadAd() {
        C10038l c10038l = new C10038l(15, false);
        c10038l.f20463l = null;
        c10038l.f20462l = null;
        c10038l.f20466l = null;
        c10038l.f20465l = C3179l.f6840l;
        return c10038l;
    }

    public final int crashlytics() {
        C3179l c3179l = C3179l.f6840l;
        int i = this.loadAd;
        C3179l c3179l2 = this.crashlytics;
        if (c3179l2 == c3179l) {
            return i;
        }
        if (c3179l2 == C3179l.f6837l) {
            return i + 5;
        }
        if (c3179l2 == C3179l.f6839l) {
            return i + 5;
        }
        if (c3179l2 == C3179l.f6838l) {
            return i + 5;
        }
        C8339l.smaato("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0485l)) {
            return false;
        }
        C0485l c0485l = (C0485l) obj;
        return c0485l.yandex == this.yandex && c0485l.crashlytics() == crashlytics() && c0485l.crashlytics == this.crashlytics && c0485l.amazon == this.amazon;
    }

    public final int hashCode() {
        return Objects.hash(C0485l.class, Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), this.crashlytics, this.amazon);
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("HMAC Parameters (variant: ", String.valueOf(this.crashlytics), ", hashType: ", String.valueOf(this.amazon), ", ");
        sbLicense.append(this.loadAd);
        sbLicense.append("-byte tags, and ");
        sbLicense.append(this.yandex);
        sbLicense.append("-byte key)");
        return sbLicense.toString();
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.crashlytics != C3179l.f6840l;
    }
}
