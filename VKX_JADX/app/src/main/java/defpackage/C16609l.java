package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٖٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16609l extends AbstractC16800l {
    public final String crashlytics;
    public final String loadAd;

    public C16609l(String str, String str2, String str3) {
        super(str);
        this.loadAd = str2;
        this.crashlytics = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16609l.class != obj.getClass()) {
            return false;
        }
        C16609l c16609l = (C16609l) obj;
        return this.yandex.equals(c16609l.yandex) && Objects.equals(this.loadAd, c16609l.loadAd) && this.crashlytics.equals(c16609l.crashlytics);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(527, 31, this.yandex);
        String str = this.loadAd;
        return this.crashlytics.hashCode() + ((iAdvert + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC16800l
    public final String toString() {
        return this.yandex + ": url=" + this.crashlytics;
    }
}
