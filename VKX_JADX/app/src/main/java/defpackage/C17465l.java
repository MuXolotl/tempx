package defpackage;

/* JADX INFO: renamed from: lٗۡؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17465l {
    public static final long amazon;
    public static final C17465l purchase;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        amazon = jCharAt;
        purchase = new C17465l(0, -1, -1);
    }

    public C17465l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public static int purchase(int i, int i2, String str) {
        if (i == i2) {
            throw C6451l.crashlytics("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw C6451l.crashlytics("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw C6451l.loadAd(i, i2, "precision too large", str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw C6451l.loadAd(i, i2, "invalid precision", str);
    }

    public final void amazon(StringBuilder sb) {
        if (yandex()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.yandex & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.loadAd;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.crashlytics;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean crashlytics() {
        return (this.yandex & 128) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17465l) {
            C17465l c17465l = (C17465l) obj;
            if (c17465l.yandex == this.yandex && c17465l.loadAd == this.loadAd && c17465l.crashlytics == this.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final boolean loadAd(int i, boolean z) {
        int i2;
        if (yandex()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.yandex;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.crashlytics != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.loadAd != -1;
    }

    public final boolean yandex() {
        return this == purchase;
    }
}
