package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٌؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0682l {
    public final String amazon;
    public final double crashlytics;
    public final int loadAd;
    public final String yandex;

    public C0682l(String str, int i, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        AbstractC12442l.subscription(z);
        this.yandex = str;
        this.loadAd = i;
        this.amazon = str2;
        this.crashlytics = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0682l)) {
            return false;
        }
        C0682l c0682l = (C0682l) obj;
        return this.loadAd == c0682l.loadAd && Double.compare(this.crashlytics, c0682l.crashlytics) == 0 && Objects.equals(this.yandex, c0682l.yandex) && Objects.equals(this.amazon, c0682l.amazon);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Integer.valueOf(this.loadAd), Double.valueOf(this.crashlytics), this.amazon);
    }

    public C0682l(String str, double d) {
        this.yandex = str;
        this.loadAd = 2;
        this.crashlytics = d;
        this.amazon = null;
    }
}
