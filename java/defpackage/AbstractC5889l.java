package defpackage;

import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import java.text.DecimalFormat;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘۖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5889l {
    public static final C15578l yandex = new C15578l(324108469, false, new C7277l(5));
    public static final C15578l loadAd = new C15578l(-743378603, false, new C7277l(6));
    public static final C15578l crashlytics = new C15578l(-562634699, false, new C5407l(22));

    public static void admob(byte[] bArr, int i, byte[] bArr2) {
        int i2 = 0;
        do {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            int i4 = i2 + 2;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i + i4]);
            int i5 = i2 + 3;
            bArr[i5] = (byte) (bArr[i5] ^ bArr2[i + i5]);
            i2 += 4;
        } while (i2 < 16);
    }

    public static final void amazon(InterfaceC17242l interfaceC17242l, long j, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        long j2;
        InterfaceC17242l interfaceC17242l3;
        int i4;
        long j3;
        c6956l.m2133new(-1316826184);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | (((i2 & 2) == 0 && c6956l.purchase(j)) ? 32 : 16);
        if (c6956l.m2127for(i6 & 1, (i6 & 19) != 18)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                InterfaceC17242l interfaceC17242l4 = i5 != 0 ? C4346l.f8873l : interfaceC17242l;
                if ((i2 & 2) != 0) {
                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    int i7 = i6 & (-113);
                    interfaceC17242l3 = interfaceC17242l4;
                    i4 = i7;
                } else {
                    interfaceC17242l3 = interfaceC17242l4;
                    i4 = i6;
                    j3 = j;
                }
            } else {
                c6956l.m2124else();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                j3 = j;
                i4 = i6;
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            int i8 = i4 << 6;
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_explicit_outline_20, 0, c6956l), null, interfaceC17242l3, j3, c6956l, (i8 & 896) | 56 | (i8 & 7168), 0);
            interfaceC17242l2 = interfaceC17242l3;
            j2 = j3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            j2 = j;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8457l(interfaceC17242l2, j2, i, i2);
        }
    }

    public static void billing(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long jReverse = Long.reverse(j);
        long jReverse2 = Long.reverse(j2);
        long jReverse3 = Long.reverse(j3);
        long jReverse4 = Long.reverse(j4);
        long jReverse5 = Long.reverse(purchase(jReverse, jReverse3));
        long jPurchase = purchase(j, j3) << 1;
        long jReverse6 = Long.reverse(purchase(jReverse2, jReverse4));
        long jPurchase2 = purchase(j2, j4);
        long j5 = jPurchase2 << 1;
        long jReverse7 = Long.reverse(purchase(jReverse ^ jReverse2, jReverse4 ^ jReverse3));
        long jPurchase3 = ((purchase(j ^ j2, j3 ^ j4) << 1) ^ ((jReverse6 ^ jPurchase) ^ j5)) ^ ((jPurchase2 << 63) ^ (jPurchase2 << 58));
        jArr[0] = jReverse5 ^ ((jPurchase3 >>> 7) ^ (((jPurchase3 >>> 1) ^ jPurchase3) ^ (jPurchase3 >>> 2)));
        jArr[1] = ((jPurchase3 << 57) ^ ((jPurchase3 << 63) ^ (jPurchase3 << 62))) ^ ((jReverse7 ^ ((jPurchase ^ jReverse5) ^ jReverse6)) ^ (((j5 ^ (j5 >>> 1)) ^ (j5 >>> 2)) ^ (j5 >>> 7)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void crashlytics(final int i, boolean z, long j, C6956l c6956l, final int i2, final int i3) {
        boolean z2;
        long j2;
        int i4;
        boolean z3;
        final boolean z4;
        final long j3;
        C4224l c4224lAds;
        boolean z5;
        boolean z6;
        Object objM2132native;
        c6956l.m2133new(-688937262);
        int i5 = i2 | (c6956l.amazon(i) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 48) == 0) {
                z2 = z;
                i5 |= c6956l.mopub(z2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                j2 = j;
                int i7 = c6956l.purchase(j2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i4 = i5 | i7;
                if ((i4 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i4 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i2 & 1) != 0 || c6956l.ad()) {
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if ((i3 & 4) != 0) {
                            j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                            i4 &= -897;
                        }
                    } else {
                        c6956l.m2124else();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                    }
                    long j4 = j2;
                    int i8 = i4;
                    z5 = z2;
                    c6956l.adcel();
                    z6 = (i8 & 14) == 4;
                    objM2132native = c6956l.m2132native();
                    if (z6 || objM2132native == C1867l.yandex) {
                        DecimalFormat decimalFormat = C15638l.yandex;
                        objM2132native = AbstractC14205l.amazon(i, z5);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, null, j4, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, i8 & 896, 0, 131066);
                    z4 = z5;
                    j3 = j4;
                } else {
                    c6956l.m2124else();
                    z4 = z2;
                    j3 = j2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lًٕۛ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC5889l.crashlytics(i, z4, j3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            j2 = j;
            i4 = i5 | i7;
            if ((i4 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i4 & 1, z3)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 4) != 0) {
                        j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i4 &= -897;
                    }
                } else {
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 4) != 0) {
                        j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i4 &= -897;
                    }
                }
                long j5 = j2;
                int i9 = i4;
                z5 = z2;
                c6956l.adcel();
                if ((i9 & 14) == 4) {
                }
                objM2132native = c6956l.m2132native();
                if (z6) {
                    DecimalFormat decimalFormat2 = C15638l.yandex;
                    objM2132native = AbstractC14205l.amazon(i, z5);
                    c6956l.m2147try(objM2132native);
                } else {
                    DecimalFormat decimalFormat3 = C15638l.yandex;
                    objM2132native = AbstractC14205l.amazon(i, z5);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC13010l.loadAd((String) objM2132native, null, j5, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, i9 & 896, 0, 131066);
                z4 = z5;
                j3 = j5;
            } else {
                c6956l.m2124else();
                z4 = z2;
                j3 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lًٕۛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC5889l.crashlytics(i, z4, j3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i5 |= 48;
        z2 = z;
        if ((i3 & 4) == 0) {
            j2 = j;
            if (c6956l.purchase(j2)) {
            }
            i4 = i5 | i7;
            if ((i4 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i4 & 1, z3)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0) {
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 4) != 0) {
                        j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i4 &= -897;
                    }
                } else {
                    if (i6 != 0) {
                        z2 = false;
                    }
                    if ((i3 & 4) != 0) {
                        j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                        i4 &= -897;
                    }
                }
                long j6 = j2;
                int i10 = i4;
                z5 = z2;
                c6956l.adcel();
                if ((i10 & 14) == 4) {
                }
                objM2132native = c6956l.m2132native();
                if (z6) {
                    DecimalFormat decimalFormat4 = C15638l.yandex;
                    objM2132native = AbstractC14205l.amazon(i, z5);
                    c6956l.m2147try(objM2132native);
                } else {
                    DecimalFormat decimalFormat5 = C15638l.yandex;
                    objM2132native = AbstractC14205l.amazon(i, z5);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC13010l.loadAd((String) objM2132native, null, j6, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, i10 & 896, 0, 131066);
                z4 = z5;
                j3 = j6;
            } else {
                c6956l.m2124else();
                z4 = z2;
                j3 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lًٕۛ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC5889l.crashlytics(i, z4, j3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j2 = j;
        i4 = i5 | i7;
        if ((i4 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i4 & 1, z3)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    z2 = false;
                }
                if ((i3 & 4) != 0) {
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    i4 &= -897;
                }
            } else {
                if (i6 != 0) {
                    z2 = false;
                }
                if ((i3 & 4) != 0) {
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription;
                    i4 &= -897;
                }
            }
            long j7 = j2;
            int i11 = i4;
            z5 = z2;
            c6956l.adcel();
            if ((i11 & 14) == 4) {
            }
            objM2132native = c6956l.m2132native();
            if (z6) {
                DecimalFormat decimalFormat6 = C15638l.yandex;
                objM2132native = AbstractC14205l.amazon(i, z5);
                c6956l.m2147try(objM2132native);
            } else {
                DecimalFormat decimalFormat7 = C15638l.yandex;
                objM2132native = AbstractC14205l.amazon(i, z5);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13010l.loadAd((String) objM2132native, null, j7, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, i11 & 896, 0, 131066);
            z4 = z5;
            j3 = j7;
        } else {
            c6956l.m2124else();
            z4 = z2;
            j3 = j2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lًٕۛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5889l.crashlytics(i, z4, j3, (C6956l) obj, AbstractC0545l.purchase(i2 | 1), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void loadAd(C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(1141174275);
        int i2 = 2;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            C10707l c10707l = AbstractC4751l.ads;
            boolean zBilling = c6956l.billing((InterfaceC9801l) c6956l.isPro(c10707l));
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C9507l();
                c6956l.m2147try(objM2132native);
            }
            AbstractC10478l.yandex(c10707l.yandex((C9507l) objM2132native), c15578l, c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15701l(c15578l, i, i2);
        }
    }

    public static byte[] mopub(C7972l c7972l, C16827l c16827l) {
        byte[] bArr = new byte[c16827l.billing - 32];
        for (int i = 0; i < c16827l.loadAd; i++) {
            C18449l c18449l = ((C18449l[]) c7972l.f16631l)[i];
            byte[] bArr2 = new byte[320];
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 5;
                int[] iArr = (int[]) c18449l.f36010l;
                int i4 = i2 * 4;
                int i5 = iArr[i4];
                bArr2[i3] = (byte) i5;
                int i6 = iArr[i4 + 1];
                bArr2[i3 + 1] = (byte) ((i5 >> 8) | (i6 << 2));
                int i7 = i6 >> 6;
                int i8 = iArr[i4 + 2];
                bArr2[i3 + 2] = (byte) (i7 | (i8 << 4));
                int i9 = iArr[i4 + 3];
                bArr2[i3 + 3] = (byte) ((i9 << 6) | (i8 >> 4));
                bArr2[i3 + 4] = (byte) (i9 >> 2);
            }
            c18449l.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static long purchase(long j, long j2) {
        long j3 = j & 1229782938247303441L;
        long j4 = j & 2459565876494606882L;
        long j5 = j & 4919131752989213764L;
        long j6 = j & (-8608480567731124088L);
        long j7 = j2 & 1229782938247303441L;
        long j8 = j2 & 2459565876494606882L;
        long j9 = j2 & 4919131752989213764L;
        long j10 = j2 & (-8608480567731124088L);
        long j11 = (((j3 * j7) ^ (j4 * j10)) ^ (j5 * j9)) ^ (j6 * j8);
        long j12 = (((j3 * j8) ^ (j4 * j7)) ^ (j5 * j10)) ^ (j6 * j9);
        long j13 = (((j3 * j9) ^ (j4 * j8)) ^ (j5 * j7)) ^ (j6 * j10);
        return (j11 & 1229782938247303441L) | (j12 & 2459565876494606882L) | (j13 & 4919131752989213764L) | (((((j3 * j10) ^ (j4 * j9)) ^ (j5 * j8)) ^ (j6 * j7)) & (-8608480567731124088L));
    }

    public static void subs(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i + 2;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i + 3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i += 4;
        } while (i < 16);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234  */
    /* JADX WARN: Code duplicated, block: B:117:0x0257  */
    /* JADX WARN: Code duplicated, block: B:129:0x0282  */
    /* JADX WARN: Code duplicated, block: B:131:0x0285  */
    /* JADX WARN: Code duplicated, block: B:132:0x0288  */
    /* JADX WARN: Code duplicated, block: B:134:0x028b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0292  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
    /* JADX WARN: Code duplicated, block: B:76:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x015a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0180  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    public static final void yandex(final C10178l c10178l, final InterfaceC17242l interfaceC17242l, final boolean z, final InterfaceC13142l interfaceC13142l, final C11090l c11090l, final C3790l c3790l, final InterfaceC11381l interfaceC11381l, final C2403l c2403l, final C8990l c8990l, final InterfaceC17727l interfaceC17727l, final int i, final char c, C11194l c11194l, C6956l c6956l, final int i2) {
        char c2;
        int i3;
        boolean z2;
        final C11194l c11194l2;
        C4224l c4224lAds;
        int i4;
        final C11194l c11194lCrashlytics;
        InterfaceC8714l interfaceC8714lVip;
        Object objM2132native;
        Object obj;
        final C0358l c0358l;
        boolean zAdmob;
        Object objM2132native2;
        boolean z3;
        boolean zMopub;
        Object objM2132native3;
        Object obj2;
        boolean z4;
        Object objM2132native4;
        Object c11662l;
        Object objM2132native5;
        Object objM2132native6;
        InterfaceC17242l interfaceC17242l2;
        Object obj3;
        C10351l c10351l;
        boolean zBilling;
        Object objM2132native7;
        C18574l c18574l;
        boolean zBilling2;
        Object objM2132native8;
        boolean z5;
        InterfaceC8714l interfaceC8714l;
        Executor executor;
        boolean zBilling3;
        Object objM2132native9;
        Object obj4;
        boolean zBilling4;
        Object objM2132native10;
        Object obj5;
        boolean zAdmob2;
        Object objM2132native11;
        c6956l.m2133new(1568790509);
        int i5 = i2 | (c6956l.billing(c10178l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 3072 | (c6956l.billing(interfaceC13142l) ? 16384 : 8192) | (c6956l.billing(c11090l) ? 131072 : 65536) | (c6956l.billing(c3790l) ? 1048576 : 524288) | (c6956l.billing(interfaceC11381l) ? 8388608 : 4194304) | (c6956l.admob(null) ? 67108864 : 33554432) | (c6956l.billing(c2403l) ? 536870912 : 268435456);
        int i6 = (c6956l.billing(c8990l) ? (char) 4 : (char) 2) | (c6956l.billing(interfaceC17727l) ? ' ' : (char) 16) | (c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        Object objApplovin = c6956l.applovin();
        if (objApplovin instanceof Character) {
            c2 = c;
            int i7 = c2 == ((Character) objApplovin).charValue() ? 1024 : 2048;
            i3 = i6 | i7 | 8192;
            if ((306783379 & i5) == 306783378 || (i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i5 & 1, z2)) {
                c6956l.m2141switch();
                if ((i2 & 1) != 0 || c6956l.ad()) {
                    i4 = i3 & (-57345);
                    c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
                } else {
                    c6956l.m2124else();
                    c11194lCrashlytics = c11194l;
                    i4 = i3 & (-57345);
                }
                c6956l.adcel();
                interfaceC8714lVip = AbstractC8020l.vip(Character.valueOf(c2), c6956l);
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                if (objM2132native == obj) {
                    objM2132native = new C0358l(interfaceC8714lVip);
                    c6956l.m2147try(objM2132native);
                }
                c0358l = (C0358l) objM2132native;
                zAdmob = c6956l.admob(c0358l);
                objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == obj) {
                    objM2132native2 = new C6751l(c0358l, null, 0);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.amazon(c6956l, c0358l, (Function2) objM2132native2);
                if (i == 1) {
                    c6956l.m2123default(74207180);
                    C10707l c10707l = AbstractC18460l.yandex;
                    obj3 = (Context) c6956l.isPro(AbstractC1242l.loadAd);
                    c10351l = AbstractC18460l.loadAd;
                    zBilling = c6956l.billing(obj3) | c6956l.billing(c10351l);
                    objM2132native7 = c6956l.m2132native();
                    if (zBilling || objM2132native7 == obj) {
                        objM2132native7 = (C18574l) c10351l.invoke(obj3);
                        c6956l.m2147try(objM2132native7);
                    }
                    c18574l = (C18574l) objM2132native7;
                    zBilling2 = c6956l.billing(c18574l);
                    objM2132native8 = c6956l.m2132native();
                    if (zBilling2 || objM2132native8 == obj) {
                        c18574l.getClass();
                        try {
                            if (Settings.System.getInt(c18574l.yandex, "show_password") > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        } catch (Exception e) {
                            Log.w("BasicSecureTextField", "Failed to fetch show password setting, using value: true", e);
                        }
                        objM2132native8 = AbstractC8020l.smaato(Boolean.valueOf(z5));
                        c6956l.m2147try(objM2132native8);
                    }
                    interfaceC8714l = (InterfaceC8714l) objM2132native8;
                    executor = (Executor) c6956l.isPro(AbstractC18460l.yandex);
                    zBilling3 = c6956l.billing(c18574l);
                    objM2132native9 = c6956l.m2132native();
                    if (zBilling3 || objM2132native9 == obj) {
                        Object c1546l = new C1546l(c18574l, interfaceC8714l, AbstractC15300l.billing(Looper.getMainLooper()));
                        c6956l.m2147try(c1546l);
                        objM2132native9 = c1546l;
                    }
                    obj4 = (C1546l) objM2132native9;
                    zBilling4 = c6956l.billing(c18574l);
                    objM2132native10 = c6956l.m2132native();
                    if (zBilling4 || objM2132native10 == obj) {
                        objM2132native10 = new C0660l(executor);
                        c6956l.m2147try(objM2132native10);
                    }
                    obj5 = (C0660l) objM2132native10;
                    zAdmob2 = c6956l.admob(obj5) | c6956l.admob(c18574l) | c6956l.admob(obj4);
                    objM2132native11 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native11 == obj) {
                        objM2132native11 = new Ctransient(obj5, c18574l, obj4, 4);
                        c6956l.m2147try(objM2132native11);
                    }
                    AbstractC12311l.loadAd(obj5, (Function1) objM2132native11, c6956l);
                    boolean zBooleanValue = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                    c6956l.startapp(false);
                    z3 = zBooleanValue;
                } else {
                    c6956l.m2123default(-1994543479);
                    c6956l.startapp(false);
                    z3 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                zMopub = c6956l.mopub(z3) | c6956l.admob(c0358l);
                objM2132native3 = c6956l.m2132native();
                if (!zMopub || objM2132native3 == obj) {
                    obj2 = null;
                    objM2132native3 = new C14047l(z3, c0358l, (InterfaceC14029l) null);
                    c6956l.m2147try(objM2132native3);
                } else {
                    obj2 = null;
                }
                AbstractC12311l.amazon(c6956l, boolValueOf, (Function2) objM2132native3);
                z4 = (((i4 & 896) ^ 384) <= 256 && c6956l.amazon(i)) || (i4 & 384) == 256;
                objM2132native4 = c6956l.m2132native();
                if (z4 || objM2132native4 == obj) {
                    if (i == 1) {
                        c11662l = c0358l.crashlytics;
                    } else if (i == 2) {
                        c11662l = new C11662l(0, interfaceC8714lVip);
                    } else {
                        c11662l = obj2;
                    }
                    c6956l.m2147try(c11662l);
                    objM2132native4 = c11662l;
                }
                final InterfaceC1832l interfaceC1832l = (InterfaceC1832l) objM2132native4;
                objM2132native5 = c6956l.m2132native();
                if (objM2132native5 == obj) {
                    objM2132native5 = new C10351l(11);
                    c6956l.m2147try(objM2132native5);
                }
                InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native5);
                objM2132native6 = c6956l.m2132native();
                if (objM2132native6 == obj) {
                    objM2132native6 = C5818l.f12249l;
                    c6956l.m2147try(objM2132native6);
                }
                InterfaceC17242l interfaceC17242lBilling = AbstractC10802l.billing(interfaceC17242lYandex, (Function1) objM2132native6);
                if (z3) {
                    interfaceC17242l2 = c0358l.amazon;
                } else {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                final InterfaceC17242l interfaceC17242lPremium = interfaceC17242lBilling.premium(interfaceC17242l2);
                final boolean z6 = z3;
                loadAd(AbstractC14566l.amazon(135148049, new Function2() { // from class: lؙٞۥ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        C6956l c6956l2 = (C6956l) obj6;
                        int iIntValue = ((Integer) obj7).intValue();
                        if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                            boolean z7 = z6;
                            InterfaceC13142l c7198l = interfaceC13142l;
                            if (z7) {
                                C13645l c13645l = c0358l.loadAd;
                                if (c7198l == null) {
                                    c7198l = c13645l;
                                } else if (c13645l != null) {
                                    c7198l = new C7198l(c7198l, c13645l);
                                }
                            }
                            AbstractC16363l.yandex(c10178l, interfaceC17242lPremium, z, c7198l, c11090l, c3790l, interfaceC11381l, C11485l.f23084l, c2403l, c8990l, interfaceC1832l, interfaceC17727l, c11194lCrashlytics, true, c6956l2, 100663296, 1572864, 8192);
                        } else {
                            c6956l2.m2124else();
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l), c6956l, 6);
                c11194l2 = c11194lCrashlytics;
            } else {
                c6956l.m2124else();
                c11194l2 = c11194l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2(interfaceC17242l, z, interfaceC13142l, c11090l, c3790l, interfaceC11381l, c2403l, c8990l, interfaceC17727l, i, c, c11194l2, i2) { // from class: lُٛؖ

                    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
                    public final /* synthetic */ C11194l f22398l;

                    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                    public final /* synthetic */ boolean f22399l;

                    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC11381l f22400l;

                    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                    public final /* synthetic */ C2403l f22401l;

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC17242l f22402l;

                    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC17727l f22404l;

                    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                    public final /* synthetic */ C11090l f22405l;

                    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC13142l f22406l;

                    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
                    public final /* synthetic */ char f22407l;

                    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                    public final /* synthetic */ C8990l f22408l;

                    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                    public final /* synthetic */ C3790l f22409l;

                    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                    public final /* synthetic */ int f22410l;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iPurchase = AbstractC0545l.purchase(1);
                        AbstractC5889l.yandex(this.f22403l, this.f22402l, this.f22399l, this.f22406l, this.f22405l, this.f22409l, this.f22400l, this.f22401l, this.f22408l, this.f22404l, this.f22410l, this.f22407l, this.f22398l, (C6956l) obj6, iPurchase);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        c2 = c;
        c6956l.m2118break(Character.valueOf(c2));
        i3 = i6 | i7 | 8192;
        if ((306783379 & i5) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (c6956l.m2127for(i5 & 1, z2)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0) {
                i4 = i3 & (-57345);
                c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
            } else {
                i4 = i3 & (-57345);
                c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
            }
            c6956l.adcel();
            interfaceC8714lVip = AbstractC8020l.vip(Character.valueOf(c2), c6956l);
            objM2132native = c6956l.m2132native();
            obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C0358l(interfaceC8714lVip);
                c6956l.m2147try(objM2132native);
            }
            c0358l = (C0358l) objM2132native;
            zAdmob = c6956l.admob(c0358l);
            objM2132native2 = c6956l.m2132native();
            if (zAdmob) {
                objM2132native2 = new C6751l(c0358l, null, 0);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C6751l(c0358l, null, 0);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, c0358l, (Function2) objM2132native2);
            if (i == 1) {
                c6956l.m2123default(74207180);
                C10707l c10707l2 = AbstractC18460l.yandex;
                obj3 = (Context) c6956l.isPro(AbstractC1242l.loadAd);
                c10351l = AbstractC18460l.loadAd;
                zBilling = c6956l.billing(obj3) | c6956l.billing(c10351l);
                objM2132native7 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native7 = (C18574l) c10351l.invoke(obj3);
                    c6956l.m2147try(objM2132native7);
                } else {
                    objM2132native7 = (C18574l) c10351l.invoke(obj3);
                    c6956l.m2147try(objM2132native7);
                }
                c18574l = (C18574l) objM2132native7;
                zBilling2 = c6956l.billing(c18574l);
                objM2132native8 = c6956l.m2132native();
                if (zBilling2) {
                    c18574l.getClass();
                    if (Settings.System.getInt(c18574l.yandex, "show_password") > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objM2132native8 = AbstractC8020l.smaato(Boolean.valueOf(z5));
                    c6956l.m2147try(objM2132native8);
                } else {
                    c18574l.getClass();
                    if (Settings.System.getInt(c18574l.yandex, "show_password") > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objM2132native8 = AbstractC8020l.smaato(Boolean.valueOf(z5));
                    c6956l.m2147try(objM2132native8);
                }
                interfaceC8714l = (InterfaceC8714l) objM2132native8;
                executor = (Executor) c6956l.isPro(AbstractC18460l.yandex);
                zBilling3 = c6956l.billing(c18574l);
                objM2132native9 = c6956l.m2132native();
                if (zBilling3) {
                    Object c1546l2 = new C1546l(c18574l, interfaceC8714l, AbstractC15300l.billing(Looper.getMainLooper()));
                    c6956l.m2147try(c1546l2);
                    objM2132native9 = c1546l2;
                } else {
                    Object c1546l3 = new C1546l(c18574l, interfaceC8714l, AbstractC15300l.billing(Looper.getMainLooper()));
                    c6956l.m2147try(c1546l3);
                    objM2132native9 = c1546l3;
                }
                obj4 = (C1546l) objM2132native9;
                zBilling4 = c6956l.billing(c18574l);
                objM2132native10 = c6956l.m2132native();
                if (zBilling4) {
                    objM2132native10 = new C0660l(executor);
                    c6956l.m2147try(objM2132native10);
                } else {
                    objM2132native10 = new C0660l(executor);
                    c6956l.m2147try(objM2132native10);
                }
                obj5 = (C0660l) objM2132native10;
                zAdmob2 = c6956l.admob(obj5) | c6956l.admob(c18574l) | c6956l.admob(obj4);
                objM2132native11 = c6956l.m2132native();
                if (zAdmob2) {
                    objM2132native11 = new Ctransient(obj5, c18574l, obj4, 4);
                    c6956l.m2147try(objM2132native11);
                } else {
                    objM2132native11 = new Ctransient(obj5, c18574l, obj4, 4);
                    c6956l.m2147try(objM2132native11);
                }
                AbstractC12311l.loadAd(obj5, (Function1) objM2132native11, c6956l);
                boolean zBooleanValue2 = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                c6956l.startapp(false);
                z3 = zBooleanValue2;
            } else {
                c6956l.m2123default(-1994543479);
                c6956l.startapp(false);
                z3 = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            zMopub = c6956l.mopub(z3) | c6956l.admob(c0358l);
            objM2132native3 = c6956l.m2132native();
            if (zMopub) {
                obj2 = null;
                objM2132native3 = new C14047l(z3, c0358l, (InterfaceC14029l) null);
                c6956l.m2147try(objM2132native3);
            } else {
                obj2 = null;
                objM2132native3 = new C14047l(z3, c0358l, (InterfaceC14029l) null);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, boolValueOf2, (Function2) objM2132native3);
            if (((i4 & 896) ^ 384) <= 256) {
            }
            objM2132native4 = c6956l.m2132native();
            if (z4) {
                if (i == 1) {
                    c11662l = c0358l.crashlytics;
                } else if (i == 2) {
                    c11662l = new C11662l(0, interfaceC8714lVip);
                } else {
                    c11662l = obj2;
                }
                c6956l.m2147try(c11662l);
                objM2132native4 = c11662l;
            } else {
                if (i == 1) {
                    c11662l = c0358l.crashlytics;
                } else if (i == 2) {
                    c11662l = new C11662l(0, interfaceC8714lVip);
                } else {
                    c11662l = obj2;
                }
                c6956l.m2147try(c11662l);
                objM2132native4 = c11662l;
            }
            final InterfaceC1832l interfaceC1832l2 = (InterfaceC1832l) objM2132native4;
            objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == obj) {
                objM2132native5 = new C10351l(11);
                c6956l.m2147try(objM2132native5);
            }
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native5);
            objM2132native6 = c6956l.m2132native();
            if (objM2132native6 == obj) {
                objM2132native6 = C5818l.f12249l;
                c6956l.m2147try(objM2132native6);
            }
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC10802l.billing(interfaceC17242lYandex2, (Function1) objM2132native6);
            if (z3) {
                interfaceC17242l2 = c0358l.amazon;
            } else {
                interfaceC17242l2 = C4346l.f8873l;
            }
            final InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lBilling2.premium(interfaceC17242l2);
            final boolean z7 = z3;
            loadAd(AbstractC14566l.amazon(135148049, new Function2() { // from class: lؙٞۥ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    C6956l c6956l2 = (C6956l) obj6;
                    int iIntValue = ((Integer) obj7).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z8 = z7;
                        InterfaceC13142l c7198l = interfaceC13142l;
                        if (z8) {
                            C13645l c13645l = c0358l.loadAd;
                            if (c7198l == null) {
                                c7198l = c13645l;
                            } else if (c13645l != null) {
                                c7198l = new C7198l(c7198l, c13645l);
                            }
                        }
                        AbstractC16363l.yandex(c10178l, interfaceC17242lPremium2, z, c7198l, c11090l, c3790l, interfaceC11381l, C11485l.f23084l, c2403l, c8990l, interfaceC1832l2, interfaceC17727l, c11194lCrashlytics, true, c6956l2, 100663296, 1572864, 8192);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 6);
            c11194l2 = c11194lCrashlytics;
        } else {
            c6956l.m2124else();
            c11194l2 = c11194l;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l, z, interfaceC13142l, c11090l, c3790l, interfaceC11381l, c2403l, c8990l, interfaceC17727l, i, c, c11194l2, i2) { // from class: lُٛؖ

                /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
                public final /* synthetic */ C11194l f22398l;

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f22399l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC11381l f22400l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ C2403l f22401l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f22402l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17727l f22404l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C11090l f22405l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC13142l f22406l;

                /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
                public final /* synthetic */ char f22407l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C8990l f22408l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C3790l f22409l;

                /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                public final /* synthetic */ int f22410l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC5889l.yandex(this.f22403l, this.f22402l, this.f22399l, this.f22406l, this.f22405l, this.f22409l, this.f22400l, this.f22401l, this.f22408l, this.f22404l, this.f22410l, this.f22407l, this.f22398l, (C6956l) obj6, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
