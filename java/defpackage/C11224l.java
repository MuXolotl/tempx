package defpackage;

/* JADX INFO: renamed from: lُٟٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11224l {
    public InterfaceC18212l crashlytics;
    public InterfaceC18212l loadAd = null;
    public final C0327l yandex;

    public C11224l(C0327l c0327l, InterfaceC18212l interfaceC18212l) {
        this.yandex = c0327l;
        this.crashlytics = interfaceC18212l;
    }

    public final long amazon(long j) {
        InterfaceC18212l interfaceC18212l;
        InterfaceC18212l interfaceC18212l2 = this.loadAd;
        if (interfaceC18212l2 != null) {
            if (!interfaceC18212l2.mopub()) {
                interfaceC18212l2 = null;
            }
            if (interfaceC18212l2 != null && (interfaceC18212l = this.crashlytics) != null) {
                InterfaceC18212l interfaceC18212l3 = interfaceC18212l.mopub() ? interfaceC18212l : null;
                if (interfaceC18212l3 != null) {
                    return interfaceC18212l2.mo2593throws(interfaceC18212l3, j);
                }
            }
        }
        return j;
    }

    public final boolean crashlytics(long j) {
        long jAmazon = amazon(yandex(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jAmazon));
        C0327l c0327l = this.yandex;
        int iPurchase = c0327l.loadAd.purchase(fIntBitsToFloat);
        int i = (int) (jAmazon >> 32);
        return Float.intBitsToFloat(i) >= c0327l.mopub(iPurchase) && Float.intBitsToFloat(i) <= c0327l.admob(iPurchase);
    }

    public final int loadAd(long j, boolean z) {
        if (z) {
            j = yandex(j);
        }
        return this.yandex.loadAd.mopub(amazon(j));
    }

    public final long purchase(long j) {
        InterfaceC18212l interfaceC18212l;
        InterfaceC18212l interfaceC18212l2 = this.loadAd;
        if (interfaceC18212l2 != null) {
            if (!interfaceC18212l2.mopub()) {
                interfaceC18212l2 = null;
            }
            if (interfaceC18212l2 != null && (interfaceC18212l = this.crashlytics) != null) {
                InterfaceC18212l interfaceC18212l3 = interfaceC18212l.mopub() ? interfaceC18212l : null;
                if (interfaceC18212l3 != null) {
                    return interfaceC18212l3.mo2593throws(interfaceC18212l2, j);
                }
            }
        }
        return j;
    }

    public final long yandex(long j) {
        C8896l c8896lMo2592synchronized;
        InterfaceC18212l interfaceC18212l = this.loadAd;
        C8896l c8896l = C8896l.purchase;
        if (interfaceC18212l != null) {
            if (interfaceC18212l.mopub()) {
                InterfaceC18212l interfaceC18212l2 = this.crashlytics;
                c8896lMo2592synchronized = interfaceC18212l2 != null ? interfaceC18212l2.mo2592synchronized(interfaceC18212l, true) : null;
            } else {
                c8896lMo2592synchronized = c8896l;
            }
            if (c8896lMo2592synchronized != null) {
                c8896l = c8896lMo2592synchronized;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = c8896l.yandex;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = c8896l.crashlytics;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = c8896l.loadAd;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = c8896l.amazon;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }
}
