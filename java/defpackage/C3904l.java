package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؖؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3904l {
    public static final String admob;
    public static final String firebase;
    public static final String isPro;
    public static final String smaato;
    public static final String subs;
    public long amazon;
    public boolean billing;
    public int crashlytics;
    public Object loadAd;
    public C12869l mopub = C12869l.billing;
    public long purchase;
    public Object yandex;

    static {
        String str = AbstractC15323l.yandex;
        admob = Integer.toString(0, 36);
        subs = Integer.toString(1, 36);
        isPro = Integer.toString(2, 36);
        firebase = Integer.toString(3, 36);
        smaato = Integer.toString(4, 36);
    }

    public final boolean admob(int i) {
        return this.mopub.yandex(i).firebase;
    }

    public final long amazon(int i) {
        return this.mopub.yandex(i).yandex;
    }

    public final int billing(int i) {
        return this.mopub.yandex(i).yandex(-1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final int crashlytics(long j) {
        int i;
        C12869l c12869l = this.mopub;
        long j2 = this.amazon;
        int i2 = c12869l.yandex;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            C8597l c8597lYandex = c12869l.yandex(i3);
            if (c8597lYandex.smaato && c8597lYandex.yandex == Long.MIN_VALUE && c8597lYandex.loadAd == -1) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        int i4 = i3 - i;
        while (i4 >= 0 && j != Long.MIN_VALUE) {
            C8597l c8597lYandex2 = c12869l.yandex(i4);
            long j3 = c8597lYandex2.yandex;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i4--;
            } else {
                if (j2 != -9223372036854775807L && ((!c8597lYandex2.smaato || j3 != Long.MIN_VALUE || c8597lYandex2.loadAd != -1) && j >= j2)) {
                    break;
                }
                i4--;
            }
        }
        if (i4 >= 0) {
            C8597l c8597lYandex3 = c12869l.yandex(i4);
            int i5 = c8597lYandex3.loadAd;
            if (i5 != -1) {
                for (int i6 = 0; i6 < i5; i6++) {
                    int i7 = c8597lYandex3.billing[i6];
                    if (i7 != 0 && i7 != 1) {
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3904l.class.equals(obj.getClass())) {
            C3904l c3904l = (C3904l) obj;
            if (Objects.equals(this.yandex, c3904l.yandex) && Objects.equals(this.loadAd, c3904l.loadAd) && this.crashlytics == c3904l.crashlytics && this.amazon == c3904l.amazon && this.purchase == c3904l.purchase && this.billing == c3904l.billing && Objects.equals(this.mopub, c3904l.mopub)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.loadAd;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.crashlytics) * 31;
        long j = this.amazon;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.purchase;
        return this.mopub.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.billing ? 1 : 0)) * 31);
    }

    public final int loadAd(long j) {
        C8597l c8597lYandex;
        int i;
        C12869l c12869l = this.mopub;
        long j2 = this.amazon;
        int i2 = c12869l.yandex;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = c12869l.amazon;
            while (i3 < i2 && ((c12869l.yandex(i3).yandex != Long.MIN_VALUE && c12869l.yandex(i3).yandex <= j) || ((i = (c8597lYandex = c12869l.yandex(i3)).loadAd) != -1 && c8597lYandex.yandex(-1) >= i))) {
                i3++;
            }
            if (i3 < i2 && (j2 == -9223372036854775807L || c12869l.yandex(i3).yandex <= j2)) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean mopub(int i) {
        C12869l c12869l = this.mopub;
        int i2 = c12869l.yandex;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        C8597l c8597lYandex = c12869l.yandex(i);
        return c8597lYandex.smaato && c8597lYandex.yandex == Long.MIN_VALUE && c8597lYandex.loadAd == -1;
    }

    public final int purchase(int i, int i2) {
        C8597l c8597lYandex = this.mopub.yandex(i);
        if (c8597lYandex.loadAd != -1) {
            return c8597lYandex.billing[i2];
        }
        return 0;
    }

    public final void subs(Object obj, Object obj2, int i, long j, long j2, C12869l c12869l, boolean z) {
        this.yandex = obj;
        this.loadAd = obj2;
        this.crashlytics = i;
        this.amazon = j;
        this.purchase = j2;
        this.mopub = c12869l;
        this.billing = z;
    }

    public final long yandex(int i, int i2) {
        C8597l c8597lYandex = this.mopub.yandex(i);
        if (c8597lYandex.loadAd != -1) {
            return c8597lYandex.mopub[i2];
        }
        return -9223372036854775807L;
    }
}
