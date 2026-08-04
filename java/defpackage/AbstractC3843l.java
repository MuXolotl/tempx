package defpackage;

/* JADX INFO: renamed from: lؖؑٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3843l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static byte loadAd(AbstractC2377l abstractC2377l) {
        if (abstractC2377l != null) {
            if (abstractC2377l instanceof C11204l) {
                return C6356l.amazon().vip;
            }
            return (byte) 1;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        yandex.getClass();
        int i = C17500l.yandex;
        return (byte) 1;
    }

    public static byte yandex(AbstractC2377l abstractC2377l, byte b) {
        if (abstractC2377l == null) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            yandex.getClass();
            int i = C17500l.yandex;
            C6356l.amazon();
            if (b == 2) {
                return (byte) 1;
            }
            if (b == 3) {
                return (byte) 0;
            }
        } else {
            if (abstractC2377l instanceof C11204l) {
                C6356l.amazon();
                return b;
            }
            C6356l.amazon();
            if (b == 2) {
                return (byte) 1;
            }
            if (b == 3) {
                return (byte) 0;
            }
        }
        return b;
    }
}
