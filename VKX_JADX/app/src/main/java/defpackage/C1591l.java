package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؓؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1591l {
    public static final C1591l admob = new C1591l(1, 2, 3, null, -1, -1);
    public static final String firebase;
    public static final String isPro;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String subs;
    public static final String vip;
    public final byte[] amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public int mopub;
    public final int purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        subs = Integer.toString(0, 36);
        isPro = Integer.toString(1, 36);
        firebase = Integer.toString(2, 36);
        smaato = Integer.toString(3, 36);
        remoteconfig = Integer.toString(4, 36);
        vip = Integer.toString(5, 36);
    }

    public C1591l(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = bArr;
        this.purchase = i4;
        this.billing = i5;
    }

    public static int billing(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static String crashlytics(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? AbstractC0653l.vip(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static String loadAd(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? AbstractC0653l.vip(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static int mopub(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean purchase(C1591l c1591l) {
        if (c1591l == null) {
            return true;
        }
        int i = c1591l.yandex;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c1591l.loadAd;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c1591l.crashlytics;
        if ((i3 != -1 && i3 != 3) || c1591l.amazon != null) {
            return false;
        }
        int i4 = c1591l.billing;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c1591l.purchase;
        return i5 == -1 || i5 == 8;
    }

    public static String yandex(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? AbstractC0653l.vip(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public final boolean amazon() {
        return (this.yandex == -1 || this.loadAd == -1 || this.crashlytics == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1591l.class == obj.getClass()) {
            C1591l c1591l = (C1591l) obj;
            if (this.yandex == c1591l.yandex && this.loadAd == c1591l.loadAd && this.crashlytics == c1591l.crashlytics && Arrays.equals(this.amazon, c1591l.amazon) && this.purchase == c1591l.purchase && this.billing == c1591l.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.mopub == 0) {
            this.mopub = ((((Arrays.hashCode(this.amazon) + ((((((527 + this.yandex) * 31) + this.loadAd) * 31) + this.crashlytics) * 31)) * 31) + this.purchase) * 31) + this.billing;
        }
        return this.mopub;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(loadAd(this.yandex));
        sb.append(", ");
        sb.append(yandex(this.loadAd));
        sb.append(", ");
        sb.append(crashlytics(this.crashlytics));
        sb.append(", ");
        sb.append(this.amazon != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.purchase;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.billing;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return AbstractC0653l.ads(sb, str2, ")");
    }
}
