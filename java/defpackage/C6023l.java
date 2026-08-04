package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6023l extends AbstractC8443l {
    public final C1693l crashlytics;
    public final int loadAd;
    public final int yandex;

    public C6023l(int i, int i2, C1693l c1693l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = c1693l;
    }

    public static C10111l loadAd() {
        C10111l c10111l = new C10111l(4, false);
        c10111l.f20587l = null;
        c10111l.f20586l = null;
        c10111l.f20589l = C1693l.f4075l;
        return c10111l;
    }

    public final int crashlytics() {
        C1693l c1693l = C1693l.f4075l;
        int i = this.loadAd;
        C1693l c1693l2 = this.crashlytics;
        if (c1693l2 == c1693l) {
            return i;
        }
        if (c1693l2 == C1693l.f4068l) {
            return i + 5;
        }
        if (c1693l2 == C1693l.f4073l) {
            return i + 5;
        }
        if (c1693l2 == C1693l.f4072l) {
            return i + 5;
        }
        C8339l.smaato("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6023l)) {
            return false;
        }
        C6023l c6023l = (C6023l) obj;
        return c6023l.yandex == this.yandex && c6023l.crashlytics() == crashlytics() && c6023l.crashlytics == this.crashlytics;
    }

    public final int hashCode() {
        return Objects.hash(C6023l.class, Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), this.crashlytics);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.crashlytics);
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(this.loadAd);
        sb.append("-byte tags, and ");
        return AbstractC14814l.remoteconfig(this.yandex, "-byte key)", sb);
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.crashlytics != C1693l.f4075l;
    }
}
