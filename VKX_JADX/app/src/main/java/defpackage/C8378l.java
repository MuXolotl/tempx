package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًٖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8378l extends AbstractC1440l {
    public final int amazon;
    public final C11534l billing;
    public final int crashlytics;
    public final int loadAd;
    public final C6932l purchase;
    public final int yandex;

    public C8378l(int i, int i2, int i3, int i4, C6932l c6932l, C11534l c11534l) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
        this.purchase = c6932l;
        this.billing = c11534l;
    }

    public static C1424l loadAd() {
        C1424l c1424l = new C1424l();
        c1424l.f3603l = null;
        c1424l.f3602l = null;
        c1424l.f3601l = null;
        c1424l.f3605l = null;
        c1424l.f3604l = null;
        c1424l.f3606l = C6932l.purchase;
        return c1424l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8378l)) {
            return false;
        }
        C8378l c8378l = (C8378l) obj;
        return c8378l.yandex == this.yandex && c8378l.loadAd == this.loadAd && c8378l.crashlytics == this.crashlytics && c8378l.amazon == this.amazon && c8378l.purchase == this.purchase && c8378l.billing == this.billing;
    }

    public final int hashCode() {
        return Objects.hash(C8378l.class, Integer.valueOf(this.yandex), Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), Integer.valueOf(this.amazon), this.purchase, this.billing);
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.purchase), ", hashType: ", String.valueOf(this.billing), ", ");
        AbstractC12900l.tapsense(sbLicense, this.crashlytics, "-byte IV, and ", this.amazon, "-byte tags, and ");
        sbLicense.append(this.yandex);
        sbLicense.append("-byte AES key, and ");
        sbLicense.append(this.loadAd);
        sbLicense.append("-byte HMAC key)");
        return sbLicense.toString();
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.purchase != C6932l.purchase;
    }
}
