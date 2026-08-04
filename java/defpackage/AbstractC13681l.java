package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lْٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13681l {
    private static final void amazon(int i) {
        throw new IndexOutOfBoundsException(AbstractC15560l.tapsense("fromIndex (", i, ") is less than 0."));
    }

    private static final void billing(int i, int i2) {
        throw new IllegalArgumentException(AbstractC12589l.applovin(i, i2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }

    private static final void crashlytics(int i, int i2) {
        throw new IndexOutOfBoundsException(AbstractC12589l.applovin(i, i2, "Index ", " is out of bounds. The list has ", " elements."));
    }

    public static final void loadAd(int i, int i2, List list) {
        if (i > i2) {
            billing(i, i2);
        }
        if (i < 0) {
            amazon(i);
        }
        if (i2 > list.size()) {
            purchase(i2, list.size());
        }
    }

    private static final void purchase(int i, int i2) {
        throw new IndexOutOfBoundsException(AbstractC12589l.applovin(i, i2, "toIndex (", ") is more than than the list size (", ")"));
    }

    public static final void yandex(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            crashlytics(i, size);
        }
    }
}
