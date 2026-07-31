package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٓ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14446l {
    public static final String admob;
    public static final String billing;
    public static final String mopub;
    public static final String subs;
    public final int[] amazon;
    public final boolean crashlytics;
    public final C11916l loadAd;
    public final boolean[] purchase;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        billing = Integer.toString(0, 36);
        mopub = Integer.toString(1, 36);
        admob = Integer.toString(3, 36);
        subs = Integer.toString(4, 36);
    }

    public C14446l(C11916l c11916l, boolean z, int[] iArr, boolean[] zArr) {
        int i = c11916l.yandex;
        this.yandex = i;
        boolean z2 = false;
        AbstractC12442l.admob(i == iArr.length && i == zArr.length);
        this.loadAd = c11916l;
        if (z && i > 1) {
            z2 = true;
        }
        this.crashlytics = z2;
        this.amazon = (int[]) iArr.clone();
        this.purchase = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14446l.class == obj.getClass()) {
            C14446l c14446l = (C14446l) obj;
            if (this.crashlytics == c14446l.crashlytics && this.loadAd.equals(c14446l.loadAd) && Arrays.equals(this.amazon, c14446l.amazon) && Arrays.equals(this.purchase, c14446l.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.purchase) + ((Arrays.hashCode(this.amazon) + (((this.loadAd.hashCode() * 31) + (this.crashlytics ? 1 : 0)) * 31)) * 31);
    }
}
