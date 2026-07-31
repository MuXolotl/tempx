package defpackage;

/* JADX INFO: renamed from: lؘٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5382l {
    public final boolean loadAd(int i, C12676l c12676l, Object obj) throws C5957l, C8236l, C8352l {
        int i2 = c12676l.loadAd;
        AbstractC9284l abstractC9284l = (AbstractC9284l) c12676l.purchase;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c12676l.m3487return(0);
            ((C0774l) obj).crashlytics(i3 << 3, Long.valueOf(abstractC9284l.vip()));
            return true;
        }
        if (i4 == 1) {
            c12676l.m3487return(1);
            ((C0774l) obj).crashlytics((i3 << 3) | 1, Long.valueOf(abstractC9284l.firebase()));
            return true;
        }
        if (i4 == 2) {
            ((C0774l) obj).crashlytics((i3 << 3) | 2, c12676l.ads());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new C5957l("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw C5957l.loadAd();
            }
            c12676l.m3487return(5);
            ((C0774l) obj).crashlytics(5 | (i3 << 3), Integer.valueOf(abstractC9284l.isPro()));
            return true;
        }
        C0774l c0774l = new C0774l(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new C5957l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c12676l.billing() != Integer.MAX_VALUE && loadAd(i7, c12676l, c0774l)) {
        }
        if (i6 != c12676l.loadAd) {
            throw new C5957l("Protocol message end-group tag did not match expected tag.");
        }
        if (c0774l.purchase) {
            c0774l.purchase = false;
        }
        ((C0774l) obj).crashlytics(i5 | 3, c0774l);
        return true;
    }

    public final C0774l yandex(Object obj) {
        AbstractC8760l abstractC8760l = (AbstractC8760l) obj;
        C0774l c0774l = abstractC8760l.unknownFields;
        if (c0774l != C0774l.billing) {
            return c0774l;
        }
        C0774l c0774l2 = new C0774l(0, new int[8], new Object[8], true);
        abstractC8760l.unknownFields = c0774l2;
        return c0774l2;
    }
}
