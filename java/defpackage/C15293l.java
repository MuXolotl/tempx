package defpackage;

/* JADX INFO: renamed from: lٔۤۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15293l {
    public final int amazon;
    public final Object[] crashlytics;
    public final String loadAd;
    public final AbstractC9446l yandex;

    public C15293l(AbstractC9446l abstractC9446l, String str, Object[] objArr) {
        this.yandex = abstractC9446l;
        this.loadAd = str;
        this.crashlytics = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.amazon = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.amazon = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int yandex() {
        int i = this.amazon;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
