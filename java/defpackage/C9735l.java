package defpackage;

/* JADX INFO: renamed from: lٍٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9735l {
    public static final long admob;
    public static final long amazon;
    public static final long billing;
    public static final long crashlytics;
    public static final long firebase;
    public static final long isPro;
    public static final long loadAd = AbstractC12953l.amazon(4278190080L);
    public static final long mopub;
    public static final long purchase;
    public static final /* synthetic */ int smaato = 0;
    public static final long subs;
    public final long yandex;

    static {
        AbstractC12953l.amazon(4282664004L);
        crashlytics = AbstractC12953l.amazon(4287137928L);
        amazon = AbstractC12953l.amazon(4291611852L);
        purchase = AbstractC12953l.amazon(4294967295L);
        billing = AbstractC12953l.amazon(4294901760L);
        mopub = AbstractC12953l.amazon(4278255360L);
        admob = AbstractC12953l.amazon(4278190335L);
        AbstractC12953l.amazon(4294967040L);
        AbstractC12953l.amazon(4278255615L);
        subs = AbstractC12953l.amazon(4294902015L);
        isPro = AbstractC12953l.loadAd(0);
        float[] fArr = C3955l.yandex;
        firebase = AbstractC12953l.yandex(0.0f, 0.0f, 0.0f, 0.0f, C3955l.Signature);
    }

    public /* synthetic */ C9735l(long j) {
        this.yandex = j;
    }

    public static final float admob(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC9307l.mopub((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC5553l.yandex;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float amazon(long j) {
        float fMopub;
        float f;
        if ((63 & j) == 0) {
            fMopub = (float) AbstractC9307l.mopub((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fMopub = (float) AbstractC9307l.mopub((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fMopub / f;
    }

    public static final AbstractC11833l billing(long j) {
        float[] fArr = C3955l.yandex;
        return C3955l.advert[(int) (j & 63)];
    }

    public static final boolean crashlytics(long j, long j2) {
        return j == j2;
    }

    public static long loadAd(float f, long j) {
        return AbstractC12953l.yandex(admob(j), mopub(j), purchase(j), f, billing(j));
    }

    public static final float mopub(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC9307l.mopub((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC5553l.yandex;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float purchase(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) AbstractC9307l.mopub((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - AbstractC5553l.yandex;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String subs(long j) {
        float fAdmob = admob(j);
        float fMopub = mopub(j);
        float fPurchase = purchase(j);
        float fAmazon = amazon(j);
        String str = billing(j).yandex;
        StringBuilder sbTapsense = AbstractC14814l.tapsense("Color(", fAdmob, ", ", fMopub, ", ");
        sbTapsense.append(fPurchase);
        sbTapsense.append(", ");
        sbTapsense.append(fAmazon);
        sbTapsense.append(", ");
        return AbstractC0653l.ads(sbTapsense, str, ")");
    }

    public static final long yandex(long j, AbstractC11833l abstractC11833l) {
        C9761l c9761lBilling;
        AbstractC11833l abstractC11833lBilling = billing(j);
        int i = abstractC11833lBilling.crashlytics;
        int i2 = abstractC11833l.crashlytics;
        if ((i | i2) < 0) {
            c9761lBilling = AbstractC0136l.billing(abstractC11833lBilling, abstractC11833l);
        } else {
            C16977l c16977l = AbstractC14339l.yandex;
            int i3 = i | (i2 << 6);
            Object objLoadAd = c16977l.loadAd(i3);
            if (objLoadAd == null) {
                objLoadAd = AbstractC0136l.billing(abstractC11833lBilling, abstractC11833l);
                c16977l.subs(i3, objLoadAd);
            }
            c9761lBilling = (C9761l) objLoadAd;
        }
        return c9761lBilling.yandex(j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9735l) {
            return this.yandex == ((C9735l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return C10882l.yandex(this.yandex);
    }

    public final String toString() {
        return subs(this.yandex);
    }
}
