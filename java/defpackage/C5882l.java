package defpackage;

import android.net.Uri;

/* JADX INFO: renamed from: lؘّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5882l {
    public final boolean amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public final String purchase;
    public final Uri yandex;

    public C5882l(String str, String str2) {
        this.yandex = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.loadAd = 0;
        this.crashlytics = 400;
        this.amazon = false;
        this.purchase = str2;
        this.billing = 0;
    }

    public C5882l(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.yandex = uri;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = z;
        this.purchase = str;
        this.billing = i3;
    }
}
