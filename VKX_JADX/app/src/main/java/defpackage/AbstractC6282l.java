package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6282l {
    public static final float loadAd;
    public static final C4776l yandex;

    static {
        C6763l c6763l = AbstractC5341l.yandex;
        yandex = AbstractC0532l.subs(250, 2, c6763l);
        AbstractC0532l.subs(250, 2, c6763l);
        loadAd = 16.0f;
    }

    public static final void loadAd(float f, int i, int i2, long j, long j2, C14855l c14855l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C6956l c6956l, InterfaceC17242l interfaceC17242l, C11194l c11194l) {
        int i3;
        C15578l c15578l4;
        C15578l c15578l5;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(1263070953);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.amazon(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.purchase(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.purchase(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c6956l.crashlytics(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c6956l.crashlytics(0.0f) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= c6956l.billing(c11194l) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= c6956l.billing(c14855l) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            c15578l4 = c15578l;
            i3 |= c6956l.admob(c15578l4) ? 67108864 : 33554432;
        } else {
            c15578l4 = c15578l;
        }
        if ((805306368 & i2) == 0) {
            c15578l5 = c15578l2;
            i3 |= c6956l.admob(c15578l5) ? 536870912 : 268435456;
        } else {
            c15578l5 = c15578l2;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 306783379) != 306783378)) {
            interfaceC17242l2 = interfaceC17242l;
            int i4 = i3;
            AbstractC3274l.yandex(AbstractC0019l.crashlytics(AbstractC4962l.yandex(AbstractC3605l.vip(AbstractC13841l.purchase(AbstractC0080l.adcel(AbstractC0080l.amazon(interfaceC17242l2, 1.0f), c14855l), c11194l, false), 0.0f, 0.0f, 2), false, new C10557l(21)), AbstractC7497l.yandex), null, j, j2, 0.0f, 0.0f, null, AbstractC14566l.amazon(744721476, new C6960l(c11194l, c15578l3, c15578l5, f, i, c15578l4), c6956l), c6956l, (i4 & 896) | 12582912 | (i4 & 7168), 114);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1922l(i, interfaceC17242l2, j, j2, f, c11194l, c14855l, c15578l, c15578l2, c15578l3, i2);
        }
    }

    public static final void yandex(float f, int i, int i2, long j, long j2, C14855l c14855l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C6956l c6956l, InterfaceC17242l interfaceC17242l, C11194l c11194l) {
        C11194l c11194l2;
        int i3;
        C11194l c11194lCrashlytics;
        c6956l.m2133new(798744196);
        int i4 = i2 | (c6956l.amazon(i) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        int i5 = i4 | 128 | (c6956l.purchase(j2) ? 16384 : 8192) | 1572864;
        if ((i2 & 12582912) == 0) {
            i5 |= c6956l.billing(c14855l) ? 8388608 : 4194304;
        }
        if (c6956l.m2127for(i5 & 1, (306783379 & i5) != 306783378)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                i3 = i5 & (-897);
                c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
            } else {
                c6956l.m2124else();
                i3 = i5 & (-897);
                c11194lCrashlytics = c11194l;
            }
            c6956l.adcel();
            loadAd(f, i, (i3 & 29360128) | (i3 & 126) | 384 | ((i3 >> 3) & 7168) | 221184 | 905969664, j, j2, c14855l, c15578l, c15578l2, c15578l3, c6956l, interfaceC17242l, c11194lCrashlytics);
            c11194l2 = c11194lCrashlytics;
        } else {
            c6956l.m2124else();
            c11194l2 = c11194l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1922l(i, interfaceC17242l, c11194l2, j, j2, f, c14855l, c15578l, c15578l2, c15578l3, i2);
        }
    }
}
