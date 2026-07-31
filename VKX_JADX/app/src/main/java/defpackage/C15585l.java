package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: renamed from: lٍٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15585l {
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public C15585l(String str, int i, int i2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15585l)) {
            return false;
        }
        C15585l c15585l = (C15585l) obj;
        int i = c15585l.crashlytics;
        String str = c15585l.yandex;
        int i2 = c15585l.loadAd;
        int i3 = this.crashlytics;
        String str2 = this.yandex;
        int i4 = this.loadAd;
        if (i4 < 0 || i2 < 0) {
            return TextUtils.equals(str2, str) && i3 == i;
        }
        return TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Integer.valueOf(this.crashlytics));
    }
}
