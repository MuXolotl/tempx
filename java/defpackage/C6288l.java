package defpackage;

/* JADX INFO: renamed from: lؘؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6288l {
    public final int yandex;

    public static String yandex(int i) {
        String str;
        StringBuilder sb = new StringBuilder("CameraError(");
        if (i == 0) {
            str = "ERROR_UNDETERMINED";
        } else if (i == 1) {
            str = "ERROR_CAMERA_IN_USE";
        } else if (i == 2) {
            str = "ERROR_CAMERA_LIMIT_EXCEEDED";
        } else if (i == 3) {
            str = "ERROR_CAMERA_DISABLED";
        } else if (i == 4) {
            str = "ERROR_CAMERA_DEVICE";
        } else if (i == 5) {
            str = "ERROR_CAMERA_SERVICE";
        } else if (i == 6) {
            str = "ERROR_CAMERA_DISCONNECTED";
        } else if (i == 7) {
            str = "ERROR_ILLEGAL_ARGUMENT_EXCEPTION";
        } else if (i == 8) {
            str = "ERROR_SECURITY_EXCEPTION";
        } else if (i == 9) {
            str = "ERROR_GRAPH_CONFIG";
        } else if (i == 10) {
            str = "ERROR_DO_NOT_DISTURB_ENABLED";
        } else if (i == 11) {
            str = "ERROR_UNKNOWN_EXCEPTION";
        } else if (i == 12) {
            str = "ERROR_CAMERA_OPENER";
        } else {
            str = i == 13 ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN";
        }
        return AbstractC2812l.tapsense(sb, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6288l) {
            return this.yandex == ((C6288l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return yandex(this.yandex);
    }
}
