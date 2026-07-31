package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lؘؘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2432l {
    public final String admob;
    public final byte[] amazon;
    public final long billing;
    public final int crashlytics;
    public final Object isPro;
    public final long loadAd;
    public final long mopub;
    public final Map purchase;
    public final int subs;
    public final Uri yandex;

    static {
        AbstractC17959l.yandex("media3.datasource");
    }

    public C2432l(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        AbstractC12442l.admob(j + j2 >= 0);
        AbstractC12442l.admob(j2 >= 0);
        AbstractC12442l.admob(j3 > 0 || j3 == -1);
        uri.getClass();
        this.yandex = uri;
        this.loadAd = j;
        this.crashlytics = i;
        this.amazon = (bArr == null || bArr.length == 0) ? null : bArr;
        this.purchase = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.billing = j2;
        this.mopub = j3;
        this.admob = str;
        this.subs = i2;
        this.isPro = obj;
    }

    public static String loadAd(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        C18073l.admob();
        return null;
    }

    public final C2432l crashlytics(long j, long j2) {
        if (j == 0 && this.mopub == j2) {
            return this;
        }
        return new C2432l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing + j, j2, this.admob, this.subs, this.isPro);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(loadAd(this.crashlytics));
        sb.append(" ");
        sb.append(this.yandex);
        sb.append(", ");
        sb.append(this.billing);
        sb.append(", ");
        sb.append(this.mopub);
        sb.append(", ");
        sb.append(this.admob);
        sb.append(", ");
        return AbstractC14814l.remoteconfig(this.subs, "]", sb);
    }

    public final C3304l yandex() {
        C3304l c3304l = new C3304l();
        c3304l.yandex = this.yandex;
        c3304l.loadAd = this.loadAd;
        c3304l.crashlytics = this.crashlytics;
        c3304l.amazon = this.amazon;
        c3304l.purchase = this.purchase;
        c3304l.billing = this.billing;
        c3304l.mopub = this.mopub;
        c3304l.admob = this.admob;
        c3304l.subs = this.subs;
        c3304l.isPro = this.isPro;
        return c3304l;
    }
}
