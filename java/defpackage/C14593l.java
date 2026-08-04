package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٔؐٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14593l {
    public final Function0 amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C14593l(String str, String str2, String str3, Function0 function0) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14593l)) {
            return false;
        }
        C14593l c14593l = (C14593l) obj;
        return this.yandex.equals(c14593l.yandex) && AbstractC8576l.yandex(this.loadAd, c14593l.loadAd) && this.crashlytics.equals(c14593l.crashlytics) && this.amazon.equals(c14593l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
    }

    public final String toString() {
        return "CropSliderItem(id=" + this.yandex + ", title=" + this.loadAd + ", image=" + this.crashlytics + ", action=" + this.amazon + ')';
    }
}
