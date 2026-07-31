package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lّۜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12869l {
    public static final String admob;
    public static final C12869l billing = new C12869l(new C8597l[0], 0, -9223372036854775807L, 0);
    public static final String firebase;
    public static final String isPro;
    public static final C8597l mopub;
    public static final String subs;
    public final int amazon;
    public final long crashlytics;
    public final long loadAd;
    public final C8597l[] purchase;
    public final int yandex;

    static {
        C8597l c8597l = new C8597l(0L, -1, -1, new int[0], new C2427l[0], new long[0], 0L, false, new String[0], new C11660l[0], false);
        int[] iArr = c8597l.billing;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = c8597l.mopub;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        C2427l[] c2427lArr = (C2427l[]) Arrays.copyOf(c8597l.purchase, 0);
        String[] strArr = (String[]) Arrays.copyOf(c8597l.admob, 0);
        C11660l[] c11660lArr = c8597l.subs;
        mopub = new C8597l(c8597l.yandex, 0, c8597l.crashlytics, iArrCopyOf, c2427lArr, jArrCopyOf, c8597l.isPro, c8597l.firebase, strArr, (C11660l[]) Arrays.copyOf(c11660lArr, Math.max(0, c11660lArr.length)), c8597l.smaato);
        String str = AbstractC15323l.yandex;
        admob = Integer.toString(1, 36);
        subs = Integer.toString(2, 36);
        isPro = Integer.toString(3, 36);
        firebase = Integer.toString(4, 36);
    }

    public C12869l(C8597l[] c8597lArr, long j, long j2, int i) {
        this.loadAd = j;
        this.crashlytics = j2;
        this.yandex = c8597lArr.length + i;
        this.purchase = c8597lArr;
        this.amazon = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12869l.class != obj.getClass()) {
            return false;
        }
        C12869l c12869l = (C12869l) obj;
        return this.yandex == c12869l.yandex && this.loadAd == c12869l.loadAd && this.crashlytics == c12869l.crashlytics && this.amazon == c12869l.amazon && Arrays.equals(this.purchase, c12869l.purchase);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.purchase) + (((((((this.yandex * 961) + ((int) this.loadAd)) * 31) + ((int) this.crashlytics)) * 31) + this.amazon) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.loadAd);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            C8597l[] c8597lArr = this.purchase;
            if (i >= c8597lArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c8597lArr[i].yandex);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < c8597lArr[i].billing.length; i2++) {
                sb.append("ad(state=");
                int i3 = c8597lArr[i].billing[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(c8597lArr[i].mopub[i2]);
                sb.append(')');
                if (i2 < c8597lArr[i].billing.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c8597lArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public final C8597l yandex(int i) {
        int i2 = this.amazon;
        return i < i2 ? mopub : this.purchase[i - i2];
    }
}
