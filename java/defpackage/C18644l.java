package defpackage;

/* JADX INFO: renamed from: lۢؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18644l {
    public int amazon;
    public Object crashlytics;
    public int loadAd;
    public int yandex;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C18644l)) {
                return false;
            }
            C18644l c18644l = (C18644l) obj;
            int i = this.yandex;
            if (i != c18644l.yandex) {
                return false;
            }
            if (i != 8 || Math.abs(this.amazon - this.loadAd) != 1 || this.amazon != c18644l.loadAd || this.loadAd != c18644l.amazon) {
                if (this.amazon != c18644l.amazon || this.loadAd != c18644l.loadAd) {
                    return false;
                }
                Object obj2 = this.crashlytics;
                Object obj3 = c18644l.crashlytics;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + this.amazon;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.yandex;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.loadAd);
        sb.append("c:");
        sb.append(this.amazon);
        sb.append(",p:");
        sb.append(this.crashlytics);
        sb.append("]");
        return sb.toString();
    }
}
