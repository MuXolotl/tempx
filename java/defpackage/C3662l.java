package defpackage;

/* JADX INFO: renamed from: lؕۜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3662l {
    public final long loadAd;
    public final long yandex;
    public static final C14660l crashlytics = AbstractC9092l.purchase("9999999999999999999999999999999999");
    public static final C3662l amazon = new C3662l(8646911284551352320L, 0);
    public static final C3662l purchase = new C3662l(-576460752303423488L, 0);
    public static final C3662l billing = new C3662l(-288230376151711744L, 0);
    public static final C3662l mopub = new C3662l(8935141660703064064L, 0);

    public C3662l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        if (!AbstractC8576l.yandex(c2336l.loadAd(C3662l.class), c2336l.loadAd(obj.getClass()))) {
            return false;
        }
        C3662l c3662l = (C3662l) obj;
        return this.yandex == c3662l.yandex && this.loadAd == c3662l.loadAd;
    }

    public final int hashCode() {
        long j = this.loadAd;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.yandex;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = this.yandex;
        if (Long.compare((j6 & 6917529027641081856L) ^ Long.MIN_VALUE, -4611686018427387904L) <= 0) {
            j = Long.MIN_VALUE;
            if (Long.compare((9222809086901354496L & j6) ^ Long.MIN_VALUE, -5747156074478174208L) <= 0) {
                j3 = 3440750115311058944L;
                j6 += j3;
            } else {
                j2 = 3476778912330022912L;
                j6 -= j2;
            }
        } else {
            j = Long.MIN_VALUE;
            long j7 = (j6 & 8646911284551352320L) ^ Long.MIN_VALUE;
            if ((Long.compare(j7, -1152921504606846976L) <= 0) & (Long.compare(j7, -2305843009213693952L) >= 0)) {
                if (Long.compare((2305702271725338624L & j6) ^ Long.MIN_VALUE, -8354318046260625408L) <= 0) {
                    j3 = 860187528827764736L;
                    j6 += j3;
                } else {
                    j2 = 869194728082505728L;
                    j6 -= j2;
                }
            }
        }
        long j8 = (j6 & 6917529027641081856L) ^ j;
        if (Long.compare(j8, -4611686018427387904L) > 0) {
            long j9 = (j6 & 8646911284551352320L) ^ j;
            if ((Long.compare(j9, -2305843009213693952L) >= 0) && (Long.compare(j9, -1152921504606846976L) <= 0)) {
                int iYandex = C15617l.yandex(j6);
                if (iYandex == 0) {
                    return (j6 & j) != 0 ? "-0" : "0";
                }
                String strValueOf = String.valueOf(iYandex);
                if (iYandex > 0) {
                    strValueOf = AbstractC14814l.startapp("+", strValueOf);
                }
                return AbstractC0653l.ads(new StringBuilder(), (j6 & j) != 0 ? "-0E" : "0E", strValueOf);
            }
            long j10 = (-288230376151711744L) & j6;
            if (j10 == -576460752303423488L) {
                return "-Infinity";
            }
            if (j10 == 8646911284551352320L) {
                return "Infinity";
            }
            if ((j6 & 8935141660703064064L) == 8935141660703064064L) {
                return "NaN";
            }
            C8339l.smaato("Unsupported Decimal128 string conversion. This is a bug.");
            return null;
        }
        int iYandex2 = C15617l.yandex(j6);
        if (Long.compare(j8, -4611686018427387904L) <= 0) {
            j4 = j6 & 562949953421311L;
        } else {
            long j11 = (j6 & 8646911284551352320L) ^ j;
            if (!(Long.compare(j11, -2305843009213693952L) >= 0) || !(Long.compare(j11, -1152921504606846976L) <= 0)) {
                C8339l.smaato("getSignificandHighBits cannot be called for Infinity or NaN.");
                return null;
            }
            j4 = 0;
        }
        if (Long.compare(j8, -4611686018427387904L) <= 0) {
            j5 = this.loadAd;
        } else {
            long j12 = (j6 & 8646911284551352320L) ^ j;
            if (!(Long.compare(j12, -2305843009213693952L) >= 0) || !(Long.compare(j12, -1152921504606846976L) <= 0)) {
                C8339l.smaato("getSignificandLowBits cannot be called for Infinity or NaN.");
                return null;
            }
            j5 = 0;
        }
        String string = new C14660l(j4, j5).toString();
        int length = (string.length() + iYandex2) - 1;
        if (iYandex2 > 0 || length < -6) {
            if (string.length() > 1) {
                string = (string.charAt(0) + ".").concat(string.substring(1));
            }
            String strValueOf2 = String.valueOf(length);
            if (length >= 0) {
                strValueOf2 = AbstractC14814l.startapp("+", strValueOf2);
            }
            string = AbstractC11043l.admob('E', string, strValueOf2);
        } else if (iYandex2 != 0) {
            int iAbs = Math.abs(iYandex2);
            int i = iAbs + 1;
            if (string.length() < i) {
                string = AbstractC16648l.ad(i - string.length(), "0") + string;
            }
            int length2 = string.length() - iAbs;
            string = string.substring(0, length2) + '.' + string.substring(length2);
        }
        return (j6 & j) != 0 ? "-".concat(string) : string;
    }
}
