package org.conscrypt;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.C18073l;
import defpackage.C18262l;
import defpackage.C6541l;
import defpackage.C8339l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return str + " (" + i + ") must not be negative";
        }
        if (i2 < 0) {
            C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
            return null;
        }
        return str + " (" + i + ") must not be greater than size (" + i2 + ")";
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return badPositionIndex(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : AbstractC12589l.applovin(i2, i, "end index (", ") must not be less than start index (", ")");
    }

    public static void checkArgument(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        C18073l.adcel(str, new Object[]{obj});
    }

    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        C6541l.subs(str);
        return null;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            C18262l.adcel(badPositionIndexes(i, i2, i3));
        }
    }

    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        C8339l.metrica(str);
    }
}
