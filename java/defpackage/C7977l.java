package defpackage;

import android.text.TextUtils;

/* JADX INFO: renamed from: lًٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7977l {
    public final int amazon;
    public final C5978l crashlytics;
    public final C5978l loadAd;
    public final int purchase;
    public final String yandex;

    public C7977l(String str, C5978l c5978l, C5978l c5978l2, int i, int i2) {
        AbstractC12442l.admob(i == 0 || i2 == 0);
        AbstractC12442l.admob(true ^ TextUtils.isEmpty(str));
        this.yandex = str;
        c5978l.getClass();
        this.loadAd = c5978l;
        c5978l2.getClass();
        this.crashlytics = c5978l2;
        this.amazon = i;
        this.purchase = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7977l.class == obj.getClass()) {
            C7977l c7977l = (C7977l) obj;
            if (this.amazon == c7977l.amazon && this.purchase == c7977l.purchase && this.yandex.equals(c7977l.yandex) && this.loadAd.equals(c7977l.loadAd) && this.crashlytics.equals(c7977l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + AbstractC12589l.advert((((527 + this.amazon) * 31) + this.purchase) * 31, 31, this.yandex)) * 31);
    }
}
