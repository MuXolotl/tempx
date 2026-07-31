package defpackage;

/* JADX INFO: renamed from: lؚ۠ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7563l {
    public static final long admob(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iCrashlytics = crashlytics(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iCrashlytics2 = crashlytics(i6);
        if (iCrashlytics + iCrashlytics2 > 31) {
            firebase(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iCrashlytics2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iCrashlytics2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iCrashlytics2 + 33));
    }

    public static final long amazon(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iIsPro = C15519l.isPro(j);
        int iAdmob = C15519l.admob(j);
        if (i < iIsPro) {
            i = iIsPro;
        }
        if (i <= iAdmob) {
            iAdmob = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iSubs = C15519l.subs(j);
        int iMopub = C15519l.mopub(j);
        if (i2 < iSubs) {
            i2 = iSubs;
        }
        if (i2 <= iMopub) {
            iMopub = i2;
        }
        return (((long) iAdmob) << 32) | (4294967295L & ((long) iMopub));
    }

    public static final int billing(int i, long j) {
        int iSubs = C15519l.subs(j);
        int iMopub = C15519l.mopub(j);
        if (i < iSubs) {
            i = iSubs;
        }
        return i > iMopub ? iMopub : i;
    }

    public static final int crashlytics(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    public static final void firebase(int i, int i2) {
        throw new IllegalArgumentException(AbstractC12589l.applovin(i, i2, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static /* synthetic */ long isPro(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return subs(i, j, i2);
    }

    public static /* synthetic */ long loadAd(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return yandex(i, i2, i3, i4);
    }

    public static final int mopub(int i, long j) {
        int iIsPro = C15519l.isPro(j);
        int iAdmob = C15519l.admob(j);
        if (i < iIsPro) {
            i = iIsPro;
        }
        return i > iAdmob ? iAdmob : i;
    }

    public static final long purchase(long j, long j2) {
        int iIsPro = C15519l.isPro(j);
        int iAdmob = C15519l.admob(j);
        int iSubs = C15519l.subs(j);
        int iMopub = C15519l.mopub(j);
        int iIsPro2 = C15519l.isPro(j2);
        if (iIsPro2 < iIsPro) {
            iIsPro2 = iIsPro;
        }
        if (iIsPro2 > iAdmob) {
            iIsPro2 = iAdmob;
        }
        int iAdmob2 = C15519l.admob(j2);
        if (iAdmob2 >= iIsPro) {
            iIsPro = iAdmob2;
        }
        if (iIsPro <= iAdmob) {
            iAdmob = iIsPro;
        }
        int iSubs2 = C15519l.subs(j2);
        if (iSubs2 < iSubs) {
            iSubs2 = iSubs;
        }
        if (iSubs2 > iMopub) {
            iSubs2 = iMopub;
        }
        int iMopub2 = C15519l.mopub(j2);
        if (iMopub2 >= iSubs) {
            iSubs = iMopub2;
        }
        if (iSubs <= iMopub) {
            iMopub = iSubs;
        }
        return yandex(iIsPro2, iAdmob, iSubs2, iMopub);
    }

    public static final Void smaato(int i) {
        throw new IllegalArgumentException(AbstractC15560l.tapsense("Can't represent a size of ", i, " in Constraints"));
    }

    public static final long subs(int i, long j, int i2) {
        int iIsPro = C15519l.isPro(j) + i;
        if (iIsPro < 0) {
            iIsPro = 0;
        }
        int iAdmob = C15519l.admob(j);
        if (iAdmob != Integer.MAX_VALUE && (iAdmob = iAdmob + i) < 0) {
            iAdmob = 0;
        }
        int iSubs = C15519l.subs(j) + i2;
        if (iSubs < 0) {
            iSubs = 0;
        }
        int iMopub = C15519l.mopub(j);
        return yandex(iIsPro, iAdmob, iSubs, (iMopub == Integer.MAX_VALUE || (iMopub = iMopub + i2) >= 0) ? iMopub : 0);
    }

    public static final long yandex(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            AbstractC10280l.yandex("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return admob(i, i2, i3, i4);
    }
}
