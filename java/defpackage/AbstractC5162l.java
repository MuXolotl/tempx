package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: lؗۛٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5162l {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC5162l) && AbstractC8576l.yandex(yandex(), ((AbstractC5162l) obj).yandex());
    }

    public int hashCode() {
        return yandex().hashCode();
    }

    public abstract Bitmap loadAd(Bitmap bitmap, C9192l c9192l);

    public String toString() {
        return AbstractC18202l.yandex.loadAd(getClass()).license() + "(cacheKey=" + yandex() + ")";
    }

    public abstract String yandex();
}
