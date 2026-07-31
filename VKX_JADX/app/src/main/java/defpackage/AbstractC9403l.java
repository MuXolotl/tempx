package defpackage;

import java.util.EnumSet;

/* JADX INFO: renamed from: lًٍٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9403l {
    public static final EnumSet loadAd;
    public static final EnumSet yandex;

    static {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC17969l.class);
        yandex = enumSetNoneOf;
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC17969l.class);
        loadAd = enumSetNoneOf2;
        enumSetNoneOf.add(EnumC17969l.TRACK);
        enumSetNoneOf.add(EnumC17969l.DISC_NO);
        enumSetNoneOf.add(EnumC17969l.MOVEMENT_NO);
        enumSetNoneOf2.add(EnumC17969l.TRACK_TOTAL);
        enumSetNoneOf2.add(EnumC17969l.DISC_TOTAL);
        enumSetNoneOf2.add(EnumC17969l.MOVEMENT_TOTAL);
    }
}
