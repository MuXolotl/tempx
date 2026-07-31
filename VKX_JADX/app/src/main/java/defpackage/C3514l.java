package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٜؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3514l extends AbstractC16800l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;

    public C3514l(String str, String str2, String str3) {
        super("COMM");
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3514l.class != obj.getClass()) {
            return false;
        }
        C3514l c3514l = (C3514l) obj;
        return this.crashlytics.equals(c3514l.crashlytics) && this.loadAd.equals(c3514l.loadAd) && Objects.equals(this.amazon, c3514l.amazon);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(527, 31, this.loadAd), 31, this.crashlytics);
        String str = this.amazon;
        return iAdvert + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": language=" + this.loadAd + ", description=" + this.crashlytics + ", text=" + this.amazon;
    }
}
