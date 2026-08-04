package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12155l {
    public static final byte[][] loadAd = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};
    public static C15615l yandex;

    public static final void amazon(AbstractC7532l abstractC7532l, String str) {
        new C2394l(abstractC7532l, abstractC7532l.yandex, abstractC7532l.loadAd);
    }

    public static synchronized void billing(C15615l c15615l) {
        if (yandex != null) {
            throw new IllegalStateException("init() already called");
        }
        yandex = c15615l;
    }

    public static final void crashlytics(Long l, long j, C17721l c17721l) {
        if (l == null || l.longValue() < 0 || c17721l.equals(C17721l.mopub) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l.longValue() + " bytes, but received " + j + " bytes").toString());
    }

    public static final C11474l loadAd(InterfaceC16588l interfaceC16588l, String str) {
        return new C11474l(str, new C6089l(interfaceC16588l));
    }

    public static void purchase(int i, long[] jArr, long[] jArr2) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            int i5 = (((int) jArr2[i3]) ^ i4) & i2;
            jArr[i3] = i4 ^ i5;
            jArr2[i3] = ((int) jArr2[i3]) ^ i5;
        }
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-932836462);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC9334l.yandex(c6956l, AbstractC14289l.isPro(interfaceC17242l, function1));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(interfaceC17242l, function1, i);
        }
    }
}
