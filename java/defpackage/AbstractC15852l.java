package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lٕٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15852l {
    public static final C15578l yandex = new C15578l(571083779, false, new C2464l(15));
    public static final C15578l loadAd = new C15578l(-536693875, false, new C2464l(16));

    public static void amazon(int[] iArr, int[] iArr2) {
        AbstractC0079l.tapsense(iArr, iArr2);
        long j = 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        int i = 5;
        int i2 = 12;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = ((long) iArr[i + 6]) & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 11] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 10] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[12] = (int) j6;
                long j7 = ((long) iArr[7]) & j5;
                long j8 = ((long) iArr2[14]) & j5;
                long j9 = (j7 * j2) + ((((long) (i3 << 31)) & j5) | (j6 >>> 33));
                int i6 = (int) j9;
                iArr2[13] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j10 = j8 + (j9 >>> 32);
                long j11 = ((long) iArr[8]) & j5;
                long j12 = ((long) iArr2[15]) & j5;
                long j13 = ((long) iArr2[16]) & j5;
                long j14 = (j11 * j2) + j10;
                int i7 = (int) j14;
                iArr2[14] = (i7 << 1) | (i6 >>> 31);
                long jRemoteconfig = AbstractC0653l.remoteconfig(j11, j7, j14 >>> 32, j12);
                long j15 = j13 + (jRemoteconfig >>> 32);
                long j16 = ((long) iArr[9]) & j5;
                long j17 = (((long) iArr2[17]) & j5) + (j15 >>> 32);
                long j18 = j15 & j5;
                long j19 = (((long) iArr2[18]) & j5) + (j17 >>> 32);
                long j20 = j17 & j5;
                long j21 = (j16 * j2) + (jRemoteconfig & j5);
                int i8 = (int) j21;
                iArr2[15] = (i8 << 1) | (i7 >>> 31);
                long jRemoteconfig2 = AbstractC0653l.remoteconfig(j16, j7, j21 >>> 32, j18);
                long jRemoteconfig3 = AbstractC0653l.remoteconfig(j16, j11, jRemoteconfig2 >>> 32, j20);
                long j22 = j19 + (jRemoteconfig3 >>> 32);
                long j23 = jRemoteconfig3 & j5;
                long j24 = ((long) iArr[10]) & j5;
                long j25 = (((long) iArr2[19]) & j5) + (j22 >>> 32);
                long j26 = j22 & j5;
                long j27 = (((long) iArr2[20]) & j5) + (j25 >>> 32);
                long j28 = j25 & j5;
                long j29 = (j24 * j2) + (jRemoteconfig2 & j5);
                int i9 = (int) j29;
                iArr2[16] = (i9 << 1) | (i8 >>> 31);
                long jRemoteconfig4 = AbstractC0653l.remoteconfig(j24, j7, j29 >>> 32, j23);
                long jRemoteconfig5 = AbstractC0653l.remoteconfig(j24, j11, jRemoteconfig4 >>> 32, j26);
                long jRemoteconfig6 = AbstractC0653l.remoteconfig(j24, j16, jRemoteconfig5 >>> 32, j28);
                long j30 = j27 + (jRemoteconfig6 >>> 32);
                long j31 = jRemoteconfig6 & j5;
                long j32 = ((long) iArr[11]) & j5;
                long j33 = (((long) iArr2[21]) & j5) + (j30 >>> 32);
                long j34 = j30 & j5;
                long j35 = (((long) iArr2[22]) & j5) + (j33 >>> 32);
                long j36 = j33 & j5;
                long j37 = (j32 * j2) + (jRemoteconfig4 & j5);
                int i10 = (int) j37;
                iArr2[17] = (i10 << 1) | (i9 >>> 31);
                long jRemoteconfig7 = AbstractC0653l.remoteconfig(j32, j7, j37 >>> 32, jRemoteconfig5 & j5);
                long jRemoteconfig8 = AbstractC0653l.remoteconfig(j32, j11, jRemoteconfig7 >>> 32, j31);
                long jRemoteconfig9 = AbstractC0653l.remoteconfig(j32, j16, jRemoteconfig8 >>> 32, j34);
                long jRemoteconfig10 = AbstractC0653l.remoteconfig(j32, j24, jRemoteconfig9 >>> 32, j36);
                long j38 = j35 + (jRemoteconfig10 >>> 32);
                int i11 = (int) jRemoteconfig7;
                iArr2[18] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) jRemoteconfig8;
                iArr2[19] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) jRemoteconfig9;
                iArr2[20] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) jRemoteconfig10;
                iArr2[21] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j38;
                iArr2[22] = i16 | (i17 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j38 >>> 32))) << 1) | (i17 >>> 31);
                int iBilling = AbstractC0079l.billing(iArr2, iArr2);
                int iPurchase = AbstractC0079l.purchase(18, 12, iArr2, iArr2, AbstractC0079l.purchase(0, 6, iArr2, iArr2, 0) + iBilling) + iBilling;
                int[] iArr3 = new int[6];
                AbstractC0079l.isPro(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                AbstractC0079l.tapsense(iArr3, iArr4);
                AbstractC4952l.admob(24, AbstractC4952l.m1650package(12, 6, iArr4, iArr2) + iPurchase, 18, iArr2);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    public static void crashlytics(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC0079l.ads(iArr, iArr2, iArr3);
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i = 12;
        int i2 = 1;
        while (i2 < 6) {
            int i3 = i + 1;
            int i4 = i2;
            long j14 = ((long) iArr[6 + i2]) & 4294967295L;
            long j15 = j3;
            long j16 = (j14 * j) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j16;
            int i5 = i + 2;
            long j17 = (j14 * j2) + (((long) iArr3[i5]) & 4294967295L) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 3;
            long j18 = (j14 * j15) + (((long) iArr3[i6]) & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i + 4;
            long j19 = (j14 * j4) + (((long) iArr3[i7]) & 4294967295L) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i + 5;
            long j20 = (j14 * j5) + (((long) iArr3[i8]) & 4294967295L) + (j19 >>> 32);
            iArr3[i8] = (int) j20;
            int i9 = i + 6;
            long j21 = (j14 * j6) + (((long) iArr3[i9]) & 4294967295L) + (j20 >>> 32);
            iArr3[i9] = (int) j21;
            iArr3[i + 7] = (int) (j21 >>> 32);
            i2 = i4 + 1;
            i = i3;
            j3 = j15;
        }
        int iBilling = AbstractC0079l.billing(iArr3, iArr3);
        int iPurchase = AbstractC0079l.purchase(18, 12, iArr3, iArr3, AbstractC0079l.purchase(0, 6, iArr3, iArr3, 0) + iBilling) + iBilling;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = AbstractC0079l.isPro(iArr, iArr, iArr4) != AbstractC0079l.isPro(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        AbstractC0079l.ads(iArr4, iArr5, iArr6);
        AbstractC4952l.admob(24, iPurchase + (z ? AbstractC4952l.billing(12, 6, iArr6, iArr3) : AbstractC4952l.m1650package(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static final int loadAd(int i, C6886l c6886l) {
        boolean z = c6886l.compareTo(C6886l.f14423l) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final Throwable purchase(Throwable th) {
        Throwable cause = th;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (!cause.equals(cancellationException.getCause())) {
                cause = cancellationException.getCause();
            }
        }
        return cause == null ? th : cause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lَؒۘ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [lۣؖۘ] */
    /* JADX WARN: Type inference failed for: r8v1, types: [lؗؕۦ] */
    /* JADX WARN: Type inference failed for: r8v4, types: [lۣؖۘ] */
    /* JADX WARN: Type inference failed for: r8v5, types: [lۣؖۘ] */
    /* JADX WARN: Type inference failed for: r8v6, types: [lۣؖۘ, lؗۖؕ] */
    public static C0966l yandex(C4616l c4616l) {
        ?? c7874l;
        ?? c0966l = new C0966l(true);
        for (int i = 0; i < EnumC0678l.values().length; i++) {
            EnumC0678l enumC0678l = EnumC0678l.values()[i];
            C5074l c5074l = (C5074l) c4616l.loadAd(enumC0678l.f2165l, C5074l.class);
            if (c5074l == null) {
                c5074l = (C5074l) ((C17217l) c4616l.loadAd(C4421l.subs, C17217l.class)).loadAd(enumC0678l.f2165l, C5074l.class);
            }
            if (c5074l != null) {
                for (C12645l c12645l : c5074l.purchase()) {
                    int i2 = c12645l.f24874l;
                    String str = c12645l.f24877l;
                    if (i2 == 1) {
                        EnumC14116l enumC14116l = EnumC14116l.f27597l;
                        if (str.equals(enumC14116l.f27616l)) {
                            c7874l = new C5076l(c12645l);
                            if (!str.equals(enumC14116l.f27616l)) {
                                C8339l.metrica("Descriptor description must be WM/Picture");
                                return null;
                            }
                            if (c12645l.f24874l != 1) {
                                C8339l.metrica("Descriptor type must be binary");
                                return null;
                            }
                            try {
                                c7874l.yandex();
                            } catch (UnsupportedEncodingException e) {
                                C11467l.metrica(e);
                                return null;
                            }
                        } else {
                            c7874l = str.equals(EnumC14116l.f27480l.f27616l) ? new C7264l(c12645l) : new C4357l(c12645l);
                        }
                    } else {
                        c7874l = new C7874l(c12645l);
                        if (c12645l.f24874l == 1) {
                            C8339l.metrica("Cannot interpret binary as string.");
                            return null;
                        }
                    }
                    c0966l.billing(c7874l);
                }
            }
        }
        return c0966l;
    }
}
