package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5711l {
    public static final String[] yandex = {"standard", "accelerate", "decelerate", "linear"};

    public static final boolean admob(InterfaceC6407l interfaceC6407l) {
        InterfaceC6407l.yandex.getClass();
        return !(interfaceC6407l == C8298l.loadAd || ((interfaceC6407l instanceof C10773l) && ((C10773l) interfaceC6407l).crashlytics == 16));
    }

    public static void amazon(int i, long[] jArr, long[] jArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long jCrashlytics = AbstractC2438l.crashlytics(1, AbstractC2438l.crashlytics(2, AbstractC2438l.crashlytics(4, AbstractC2438l.crashlytics(8, AbstractC2438l.crashlytics(16, jArr[i3], 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
            jArr2[i2] = jCrashlytics & 6148914691236517205L;
            jArr2[i2 + 1] = (jCrashlytics >>> 1) & 6148914691236517205L;
            i2 += 2;
        }
    }

    public static final void billing(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC15862l.yandex[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static long crashlytics(int i) {
        int iLoadAd = AbstractC2438l.loadAd(AbstractC2438l.loadAd(AbstractC2438l.loadAd(AbstractC2438l.loadAd(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1);
        return ((((long) (iLoadAd >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) iLoadAd));
    }

    public static final void firebase(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static long isPro(long j) {
        return AbstractC2438l.crashlytics(16, AbstractC2438l.crashlytics(8, AbstractC2438l.crashlytics(4, AbstractC2438l.crashlytics(2, AbstractC2438l.crashlytics(1, j, 2459565876494606882L), 868082074056920076L), 67555025218437360L), 280375465148160L), 4294901760L);
    }

    public static int loadAd(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static final long mopub(int i, byte[] bArr) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static void purchase(int i, long j, long[] jArr) {
        long jCrashlytics = AbstractC2438l.crashlytics(1, AbstractC2438l.crashlytics(2, AbstractC2438l.crashlytics(4, AbstractC2438l.crashlytics(8, AbstractC2438l.crashlytics(16, j, 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
        jArr[i] = jCrashlytics & (-6148914691236517206L);
        jArr[i + 1] = (jCrashlytics << 1) & (-6148914691236517206L);
    }

    public static final C10773l subs(long j) {
        return new C10773l(j);
    }

    public abstract List yandex(String str, List list);
}
