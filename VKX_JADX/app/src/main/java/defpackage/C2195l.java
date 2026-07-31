package defpackage;

/* JADX INFO: renamed from: lؓۢٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2195l {
    public static boolean loadAd(int i, C12676l c12676l, Object obj) throws C8236l, C5347l, C0803l {
        int i2 = c12676l.loadAd;
        AbstractC15029l abstractC15029l = (AbstractC15029l) c12676l.purchase;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c12676l.m3487return(0);
            ((C11788l) obj).amazon(i3 << 3, Long.valueOf(abstractC15029l.premium()));
            return true;
        }
        if (i4 == 1) {
            c12676l.m3487return(1);
            ((C11788l) obj).amazon((i3 << 3) | 1, Long.valueOf(abstractC15029l.advert()));
            return true;
        }
        if (i4 == 2) {
            ((C11788l) obj).amazon((i3 << 3) | 2, c12676l.subscription());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C0803l.crashlytics();
            }
            c12676l.m3487return(5);
            ((C11788l) obj).amazon(5 | (i3 << 3), Integer.valueOf(abstractC15029l.ad()));
            return true;
        }
        C11788l c11788lCrashlytics = C11788l.crashlytics();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new C0803l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c12676l.billing() != Integer.MAX_VALUE && loadAd(i7, c12676l, c11788lCrashlytics)) {
        }
        if (i6 != c12676l.loadAd) {
            throw new C0803l("Protocol message end-group tag did not match expected tag.");
        }
        if (c11788lCrashlytics.purchase) {
            c11788lCrashlytics.purchase = false;
        }
        ((C11788l) obj).amazon(i5 | 3, c11788lCrashlytics);
        return true;
    }

    public static C11788l yandex(Object obj) {
        AbstractC12946l abstractC12946l = (AbstractC12946l) obj;
        C11788l c11788l = abstractC12946l.unknownFields;
        if (c11788l != C11788l.billing) {
            return c11788l;
        }
        C11788l c11788lCrashlytics = C11788l.crashlytics();
        abstractC12946l.unknownFields = c11788lCrashlytics;
        return c11788lCrashlytics;
    }
}
