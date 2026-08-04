package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lؙؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15519l {
    public final long yandex;

    public static final int admob(long j) {
        int i = (int) (3 & j);
        int i2 = ((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        return i2 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i2 - 1;
    }

    public static final boolean amazon(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean billing(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i4 - 1);
    }

    public static final boolean crashlytics(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean firebase(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static final int isPro(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    public static final boolean loadAd(long j, long j2) {
        return j == j2;
    }

    public static final int mopub(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        return i3 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3 - 1;
    }

    public static final boolean purchase(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Alert.DURATION_SHOW_INDEFINITELY : i5 - 1);
    }

    public static String smaato(long j) {
        int iAdmob = admob(j);
        String strValueOf = iAdmob == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iAdmob);
        int iMopub = mopub(j);
        String strValueOf2 = iMopub != Integer.MAX_VALUE ? String.valueOf(iMopub) : "Infinity";
        return "Constraints(minWidth = " + isPro(j) + ", maxWidth = " + strValueOf + ", minHeight = " + subs(j) + ", maxHeight = " + strValueOf2 + ")";
    }

    public static final int subs(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static long yandex(int i, int i2, int i3, int i4, int i5, long j) {
        if ((i5 & 1) != 0) {
            i = isPro(j);
        }
        if ((i5 & 2) != 0) {
            i2 = admob(j);
        }
        if ((i5 & 4) != 0) {
            i3 = subs(j);
        }
        if ((i5 & 8) != 0) {
            i4 = mopub(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            AbstractC10280l.yandex("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC7563l.admob(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15519l) {
            return this.yandex == ((C15519l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return smaato(this.yandex);
    }
}
