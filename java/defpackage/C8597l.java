package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: lٌؘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8597l {
    public static final String Signature;
    public static final String ad;
    public static final String adcel;
    public static final String ads;
    public static final String license;
    public static final String metrica;
    public static final String pro;
    public static final String remoteconfig;
    public static final String startapp;
    public static final String subscription;
    public static final String tapsense;
    public static final String vip;
    public final String[] admob;
    public final Uri[] amazon;
    public final int[] billing;
    public final int crashlytics;
    public final boolean firebase;
    public final long isPro;
    public final int loadAd;
    public final long[] mopub;
    public final C2427l[] purchase;
    public final boolean smaato;
    public final C11660l[] subs;
    public final long yandex;

    static {
        String str = AbstractC15323l.yandex;
        remoteconfig = Integer.toString(0, 36);
        vip = Integer.toString(1, 36);
        metrica = Integer.toString(2, 36);
        startapp = Integer.toString(3, 36);
        adcel = Integer.toString(4, 36);
        ads = Integer.toString(5, 36);
        subscription = Integer.toString(6, 36);
        tapsense = Integer.toString(7, 36);
        Signature = Integer.toString(8, 36);
        license = Integer.toString(9, 36);
        pro = Integer.toString(10, 36);
        ad = Integer.toString(11, 36);
    }

    public C8597l(long j, int i, int i2, int[] iArr, C2427l[] c2427lArr, long[] jArr, long j2, boolean z, String[] strArr, C11660l[] c11660lArr, boolean z2) {
        Uri uri;
        int i3 = 0;
        AbstractC12442l.admob(iArr.length == c2427lArr.length);
        AbstractC12442l.admob(iArr.length == c11660lArr.length);
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = i2;
        this.billing = iArr;
        this.purchase = c2427lArr;
        this.mopub = jArr;
        this.isPro = j2;
        this.firebase = z;
        this.amazon = new Uri[c2427lArr.length];
        while (true) {
            Uri[] uriArr = this.amazon;
            if (i3 >= uriArr.length) {
                this.admob = strArr;
                this.subs = c11660lArr;
                this.smaato = z2;
                return;
            }
            C2427l c2427l = c2427lArr[i3];
            if (c2427l == null) {
                uri = null;
            } else {
                C17805l c17805l = c2427l.loadAd;
                c17805l.getClass();
                uri = c17805l.yandex;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8597l.class == obj.getClass()) {
            C8597l c8597l = (C8597l) obj;
            if (this.yandex == c8597l.yandex && this.loadAd == c8597l.loadAd && this.crashlytics == c8597l.crashlytics && Arrays.equals(this.purchase, c8597l.purchase) && Arrays.equals(this.billing, c8597l.billing) && Arrays.equals(this.mopub, c8597l.mopub) && this.isPro == c8597l.isPro && this.firebase == c8597l.firebase && Arrays.equals(this.admob, c8597l.admob) && Arrays.equals(this.subs, c8597l.subs) && this.smaato == c8597l.smaato) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.loadAd * 31) + this.crashlytics) * 31;
        long j = this.yandex;
        int iHashCode = (Arrays.hashCode(this.mopub) + ((Arrays.hashCode(this.billing) + ((Arrays.hashCode(this.purchase) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j2 = this.isPro;
        return ((Arrays.hashCode(this.subs) + ((((((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.firebase ? 1 : 0)) * 31) + Arrays.hashCode(this.admob)) * 31)) * 31) + (this.smaato ? 1 : 0);
    }

    public final int yandex(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.billing;
            if (i3 >= iArr.length || this.firebase || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }
}
