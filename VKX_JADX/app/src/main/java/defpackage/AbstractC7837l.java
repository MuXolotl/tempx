package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًؙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7837l {
    public static final C15578l yandex = new C15578l(1110955941, false, new C14678l(4));

    public static final InterfaceC7204l amazon(InterfaceC7204l interfaceC7204l, boolean z) {
        if (!z) {
            return interfaceC7204l;
        }
        InterfaceC9473l interfaceC9473lMo2151l = interfaceC7204l.mo2151l();
        return (interfaceC9473lMo2151l.mo716l(0L, AbstractC11938l.loadAd) || interfaceC9473lMo2151l.mo716l(0L, AbstractC11938l.yandex)) ? AbstractC17291l.loadAd(new C1503l(new C6675l(interfaceC7204l.mo2151l())), interfaceC7204l.getFileSystem()) : interfaceC7204l;
    }

    public static C8723l crashlytics(double d, double d2) {
        C14997l c14997l;
        C18684l c18684l = new C18684l(d, d2);
        int i = 100;
        int i2 = 0;
        while (i2 < i) {
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = c18684l.yandex(i3) < c18684l.yandex(i4);
            if (c18684l.yandex(i3) >= c18684l.loadAd - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        c14997l = new C14997l(AbstractC6889l.firebase(c18684l.yandex, c18684l.loadAd, i2));
                        return new C8723l(d, d2, c14997l);
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        c14997l = new C14997l(AbstractC6889l.firebase(c18684l.yandex, c18684l.loadAd, i2));
        return new C8723l(d, d2, c14997l);
    }

    public static final void loadAd(C0324l c0324l, C6956l c6956l, int i) {
        c6956l.m2133new(1995512795);
        int i2 = 2;
        int i3 = (c6956l.billing(c0324l) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c0324l.billing, c6956l, 0);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1741481111, new C18525l(c0324l, AbstractC9637l.purchase(c0324l.admob, c6956l, 0), i2), c6956l), null, null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC14566l.amazon(810117356, new C11223l((Object) AbstractC9637l.purchase(c0324l.subs, c6956l, 0), (Object) c0324l, (Object) AbstractC9637l.purchase(c0324l.mopub, c6956l, 0), (Object) interfaceC8714lPurchase, 16), c6956l), c6956l, 905969712, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17876l(c0324l, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public static final void yandex(C15578l c15578l, Function0 function0, C5866l c5866l, Function1 function1, C6956l c6956l, int i, int i2) {
        C5866l c5866l2;
        int i3;
        boolean z;
        C5866l c5866lYandex;
        C4224l c4224lAds;
        int i4;
        c6956l.m2133new(362172769);
        int i5 = (c6956l.admob(function0) ? 32 : 16) | i;
        if ((i2 & 4) == 0) {
            c5866l2 = c5866l;
            int i6 = c6956l.billing(c5866l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            i3 = i5 | i6;
            if ((i & 3072) == 0) {
                if (c6956l.admob(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if ((i2 & 4) != 0) {
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    }
                    c6956l.adcel();
                    C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
                    AbstractC15497l.loadAd(null, AbstractC14566l.amazon(261920293, new C12755l(c15578l, c13072lYandex, function0), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1262586096, new Cprotected(c13072lYandex, c5866lYandex, function1, 11), c6956l), c6956l, 805306416, 253);
                } else {
                    c6956l.m2124else();
                    int i7 = i2 & 4;
                }
                c5866lYandex = c5866l2;
                c6956l.adcel();
                C13072l c13072lYandex2 = AbstractC0831l.yandex(c6956l);
                AbstractC15497l.loadAd(null, AbstractC14566l.amazon(261920293, new C12755l(c15578l, c13072lYandex2, function0), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1262586096, new Cprotected(c13072lYandex2, c5866lYandex, function1, 11), c6956l), c6956l, 805306416, 253);
            } else {
                c6956l.m2124else();
                c5866lYandex = c5866l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C10515l(c15578l, function0, c5866lYandex, function1, i, i2, 0);
            }
        }
        c5866l2 = c5866l;
        i3 = i5 | i6;
        if ((i & 3072) == 0) {
            if (c6956l.admob(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if ((i2 & 4) != 0) {
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                } else {
                    c5866lYandex = c5866l2;
                }
            } else if ((i2 & 4) != 0) {
                c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
            } else {
                c5866lYandex = c5866l2;
            }
            c6956l.adcel();
            C13072l c13072lYandex3 = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(261920293, new C12755l(c15578l, c13072lYandex3, function0), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1262586096, new Cprotected(c13072lYandex3, c5866lYandex, function1, 11), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
            c5866lYandex = c5866l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10515l(c15578l, function0, c5866lYandex, function1, i, i2, 0);
        }
    }
}
