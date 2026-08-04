package defpackage;

/* JADX INFO: renamed from: lِٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11599l {
    public static final C3844l yandex;

    static {
        C3844l c3844l = new C3844l("xn--".getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = "xn--";
        yandex = c3844l;
    }

    public static int loadAd(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        C11983l.billing(i, "unexpected digit: ");
        return 0;
    }

    public static int yandex(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }
}
