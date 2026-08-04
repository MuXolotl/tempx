package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: renamed from: lؖٔۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4126l {
    public final int loadAd;
    public final String yandex;

    public C4126l(C3185l c3185l) {
        this.yandex = c3185l.loadAd;
        this.loadAd = c3185l.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4126l)) {
            return false;
        }
        C4126l c4126l = (C4126l) obj;
        return this.yandex.equals(c4126l.yandex) && this.loadAd == c4126l.loadAd && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Integer.valueOf(this.loadAd), 0, 0, null);
    }
}
