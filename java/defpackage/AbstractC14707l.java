package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14707l {
    public static final C15294l yandex = new C15294l(1.0f, 1.0f);

    public static InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, C7473l c7473l) {
        return AbstractC16422l.mopub(interfaceC17242l, new C2117l(new C3151l(1, c7473l, C7473l.class, "onPull", "onPull$material(F)F", 0, 0, 0), new C11491l(2, c7473l, C7473l.class, "onRelease", "onRelease$material(F)F", 4, 1), 0), null);
    }

    public static final long billing(long j) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    public static final int crashlytics(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final long loadAd(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final long mopub(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final long purchase(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static C9385l yandex(Function1 function1) {
        C10705l c10705l = AbstractC14790l.crashlytics;
        C12847l c12847l = new C12847l();
        C16215l c16215l = c10705l.yandex;
        c12847l.yandex = c16215l.yandex;
        c12847l.loadAd = c16215l.loadAd;
        c12847l.crashlytics = c16215l.crashlytics;
        c12847l.amazon = c16215l.amazon;
        c12847l.purchase = c16215l.purchase;
        c12847l.billing = c16215l.billing;
        c12847l.mopub = c16215l.mopub;
        c12847l.admob = c16215l.admob;
        c12847l.subs = c16215l.subs;
        c12847l.isPro = c10705l.loadAd;
        function1.invoke(c12847l);
        return new C9385l(new C16215l(c12847l.yandex, c12847l.loadAd, c12847l.crashlytics, c12847l.amazon, c12847l.purchase, c12847l.billing, c12847l.mopub, c12847l.admob, c12847l.subs), c12847l.isPro);
    }
}
