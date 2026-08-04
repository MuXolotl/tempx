package defpackage;

/* JADX INFO: renamed from: lِْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12154l {
    public static final long[] yandex = {-9187201950435737345L, -1};

    static {
        new C13660l(0);
    }

    public static final int amazon(int i) {
        if (i == 7) {
            return 8;
        }
        return AbstractC5020l.remoteconfig(i, 1, 7, i);
    }

    public static final int crashlytics(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int loadAd(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int yandex(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }
}
