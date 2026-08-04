package defpackage;

/* JADX INFO: renamed from: lَؙٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10134l {
    public final int yandex;

    public static String loadAd(int i) {
        return "StreamFormat(" + yandex(i) + ')';
    }

    public static final String yandex(int i) {
        if (i == 0) {
            return "UNKNOWN";
        }
        if (i == 34) {
            return "PRIVATE";
        }
        if (i == 1144402265) {
            return "DEPTH16";
        }
        if (i == 1768253795) {
            return "DEPTH_JPEG";
        }
        if (i == 257) {
            return "DEPTH_POINT_CLOUD";
        }
        if (i == 41) {
            return "FLEX_RGB_888";
        }
        if (i == 42) {
            return "FLEX_RGBA_8888";
        }
        if (i == 1212500294) {
            return "HEIC";
        }
        if (i == 256) {
            return "JPEG";
        }
        if (i == 4101) {
            return "JPEG_R";
        }
        if (i == 16) {
            return "NV16";
        }
        if (i == 17) {
            return "NV21";
        }
        if (i == 37) {
            return "RAW10";
        }
        if (i == 38) {
            return "RAW12";
        }
        if (i == 4098) {
            return "RAW_DEPTH";
        }
        if (i == 36) {
            return "RAW_PRIVATE";
        }
        if (i == 32) {
            return "RAW_SENSOR";
        }
        if (i == 4) {
            return "RGB_565";
        }
        if (i == 842094169) {
            return "Y12";
        }
        if (i == 540422489) {
            return "Y16";
        }
        if (i == 538982489) {
            return "Y8";
        }
        if (i == 54) {
            return "YCBCR_P010";
        }
        if (i == 35) {
            return "YUV_420_888";
        }
        if (i == 39) {
            return "YUV_422_888";
        }
        if (i == 40) {
            return "YUV_444_888";
        }
        if (i == 20) {
            return "YUY2";
        }
        if (i == 842094169) {
            return "YV12";
        }
        StringBuilder sb = new StringBuilder("UNKNOWN(");
        AbstractC8576l.loadAd(16);
        sb.append(Integer.toString(i, 16));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10134l) {
            return this.yandex == ((C10134l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return loadAd(this.yandex);
    }
}
