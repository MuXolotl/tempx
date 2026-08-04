package defpackage;

/* JADX INFO: renamed from: lٕؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15421l {
    public final int loadAd;
    public final int yandex;
    public static final C15421l crashlytics = new C15421l(0, 0);
    public static final C15421l amazon = new C15421l(1, 8);
    public static final C15421l purchase = new C15421l(3, 10);
    public static final C15421l billing = new C15421l(4, 10);
    public static final C15421l mopub = new C15421l(5, 10);
    public static final C15421l admob = new C15421l(6, 10);
    public static final C15421l subs = new C15421l(6, 8);

    public C15421l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15421l) {
            C15421l c15421l = (C15421l) obj;
            if (this.yandex == c15421l.yandex && this.loadAd == c15421l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd ^ ((this.yandex ^ 1000003) * 1000003);
    }

    public final boolean loadAd() {
        int i = this.yandex;
        return (i == 0 || i == 2 || this.loadAd == 0) ? false : true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.yandex) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return AbstractC14814l.remoteconfig(this.loadAd, "}", sb);
    }

    public final boolean yandex() {
        return loadAd() && this.yandex != 1 && this.loadAd == 10;
    }
}
