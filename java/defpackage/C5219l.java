package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؗۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5219l {
    public final boolean crashlytics;
    public final String loadAd;
    public final String yandex;

    public C5219l(String str, boolean z) {
        AbstractC1051l.billing(str);
        this.yandex = str;
        AbstractC1051l.billing("com.google.android.gms");
        this.loadAd = "com.google.android.gms";
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5219l)) {
            return false;
        }
        C5219l c5219l = (C5219l) obj;
        return AbstractC7236l.amazon(this.yandex, c5219l.yandex) && AbstractC7236l.amazon(this.loadAd, c5219l.loadAd) && AbstractC7236l.amazon(null, null) && this.crashlytics == c5219l.crashlytics && AbstractC7236l.amazon(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.yandex, this.loadAd, null, 4225, Boolean.valueOf(this.crashlytics), null});
    }

    public final String toString() {
        String str = this.yandex;
        if (str != null) {
            return str;
        }
        AbstractC1051l.subs(null);
        throw null;
    }
}
