package defpackage;

/* JADX INFO: renamed from: l٘ۘٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18155l {
    public static boolean loadAd(int i, C12676l c12676l, Object obj) throws C2297l, C5347l, C8352l {
        int i2 = c12676l.loadAd;
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c12676l.m3487return(0);
            ((C7565l) obj).amazon(i3 << 3, Long.valueOf(abstractC15029l.premium()));
            return true;
        }
        if (i4 == 1) {
            c12676l.m3487return(1);
            ((C7565l) obj).amazon((i3 << 3) | 1, Long.valueOf(abstractC15029l.advert()));
            return true;
        }
        if (i4 == 2) {
            ((C7565l) obj).amazon((i3 << 3) | 2, c12676l.tapsense());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new C2297l("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw C2297l.crashlytics();
            }
            c12676l.m3487return(5);
            ((C7565l) obj).amazon(5 | (i3 << 3), Integer.valueOf(abstractC15029l.ad()));
            return true;
        }
        C7565l c7565lCrashlytics = C7565l.crashlytics();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new C2297l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c12676l.billing() != Integer.MAX_VALUE && loadAd(i7, c12676l, c7565lCrashlytics)) {
        }
        if (i6 != c12676l.loadAd) {
            throw new C2297l("Protocol message end-group tag did not match expected tag.");
        }
        if (c7565lCrashlytics.purchase) {
            c7565lCrashlytics.purchase = false;
        }
        ((C7565l) obj).amazon(i5 | 3, c7565lCrashlytics);
        return true;
    }

    public static C7565l yandex(Object obj) {
        AbstractC13399l abstractC13399l = (AbstractC13399l) obj;
        C7565l c7565l = abstractC13399l.unknownFields;
        if (c7565l != C7565l.billing) {
            return c7565l;
        }
        C7565l c7565lCrashlytics = C7565l.crashlytics();
        abstractC13399l.unknownFields = c7565lCrashlytics;
        return c7565lCrashlytics;
    }
}
