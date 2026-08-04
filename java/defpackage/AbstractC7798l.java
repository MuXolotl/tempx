package defpackage;

/* JADX INFO: renamed from: lًؖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7798l {
    public static C14567l loadAd;
    public static final Object yandex = new Object();

    public static final void amazon() {
        try {
            if (loadAd == null) {
                loadAd = (C14567l) ((C1423l) ((InterfaceC16967l) C14184l.crashlytics().loadAd(InterfaceC16967l.class))).metrica.get();
            }
            C14567l c14567l = loadAd;
            if ((c14567l != null ? c14567l : null).subs) {
                if (c14567l == null) {
                    c14567l = null;
                }
                c14567l.loadAd();
            }
        } catch (Exception unused) {
        }
    }

    public static final int crashlytics(C0327l c0327l, int i) {
        C17555l c17555l = c0327l.yandex;
        C6222l c6222l = c0327l.loadAd;
        if (c17555l.yandex.f7563l.length() != 0) {
            int iAmazon = c6222l.amazon(i);
            if ((i != 0 && iAmazon == c6222l.amazon(i - 1)) || (i != c17555l.yandex.f7563l.length() && iAmazon == c6222l.amazon(i + 1))) {
                return c0327l.yandex(i);
            }
        }
        return c0327l.isPro(i);
    }

    public static final void loadAd(int i) {
        if (i >= 1) {
            return;
        }
        C10754l.metrica(AbstractC0653l.vip(i, "Expected positive parallelism level, but got "));
    }

    public static int purchase(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static final boolean yandex(C17230l c17230l, int i, C15084l c15084l) {
        boolean z;
        synchronized (yandex) {
            int i2 = c17230l.amazon;
            if (i2 == i) {
                c17230l.crashlytics = c15084l;
                z = true;
                c17230l.amazon = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }
}
