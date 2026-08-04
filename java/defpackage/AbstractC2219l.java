package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؓۤٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2219l {
    public static final int[] yandex = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] loadAd = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static byte[] admob(byte[] bArr) {
        long jCrashlytics = ((long) AbstractC16655l.crashlytics(0, bArr)) & 4294967295L;
        long jLoadAd = ((long) (AbstractC16655l.loadAd(4, bArr) << 4)) & 4294967295L;
        long jCrashlytics2 = ((long) AbstractC16655l.crashlytics(7, bArr)) & 4294967295L;
        long jLoadAd2 = ((long) (AbstractC16655l.loadAd(11, bArr) << 4)) & 4294967295L;
        long jCrashlytics3 = ((long) AbstractC16655l.crashlytics(14, bArr)) & 4294967295L;
        long jLoadAd3 = ((long) (AbstractC16655l.loadAd(18, bArr) << 4)) & 4294967295L;
        long jCrashlytics4 = ((long) AbstractC16655l.crashlytics(21, bArr)) & 4294967295L;
        long jLoadAd4 = ((long) (AbstractC16655l.loadAd(25, bArr) << 4)) & 4294967295L;
        long jCrashlytics5 = ((long) AbstractC16655l.crashlytics(28, bArr)) & 4294967295L;
        long jLoadAd5 = ((long) (AbstractC16655l.loadAd(32, bArr) << 4)) & 4294967295L;
        long jCrashlytics6 = ((long) AbstractC16655l.crashlytics(35, bArr)) & 4294967295L;
        long jLoadAd6 = ((long) (AbstractC16655l.loadAd(39, bArr) << 4)) & 4294967295L;
        long jCrashlytics7 = ((long) AbstractC16655l.crashlytics(42, bArr)) & 4294967295L;
        long jLoadAd7 = ((long) (AbstractC16655l.loadAd(46, bArr) << 4)) & 4294967295L;
        long jCrashlytics8 = AbstractC16655l.crashlytics(49, bArr);
        long j = jCrashlytics8 & 4294967295L;
        long jLoadAd8 = ((long) (AbstractC16655l.loadAd(53, bArr) << 4)) & 4294967295L;
        long jCrashlytics9 = AbstractC16655l.crashlytics(56, bArr);
        long jLoadAd9 = ((long) (AbstractC16655l.loadAd(60, bArr) << 4)) & 4294967295L;
        long j2 = ((long) bArr[63]) & 255;
        long j3 = jLoadAd9 + ((jCrashlytics9 & 4294967295L) >> 28);
        long j4 = jCrashlytics9 & 268435455;
        long j5 = jCrashlytics5 - (j3 * (-50998291));
        long j6 = (jLoadAd5 - (j2 * (-50998291))) - (j3 * 19280294);
        long j7 = (jCrashlytics7 - (j2 * (-6428113))) - (j3 * 5343);
        long j8 = ((jLoadAd6 - (j2 * 127719000)) - (j3 * (-6428113))) - (j4 * 5343);
        long j9 = jLoadAd8 + (j >> 28);
        long j10 = jCrashlytics8 & 268435455;
        long j11 = (((jCrashlytics6 - (j2 * 19280294)) - (j3 * 127719000)) - (j4 * (-6428113))) - (j9 * 5343);
        long j12 = ((j6 - (j4 * 127719000)) - (j9 * (-6428113))) - (j10 * 5343);
        long j13 = (jLoadAd7 - (j2 * 5343)) + (j7 >> 28);
        long j14 = jCrashlytics3 - (j13 * (-50998291));
        long j15 = (jLoadAd3 - (j10 * (-50998291))) - (j13 * 19280294);
        long j16 = ((jCrashlytics4 - (j9 * (-50998291))) - (j10 * 19280294)) - (j13 * 127719000);
        long j17 = (((jLoadAd4 - (j4 * (-50998291))) - (j9 * 19280294)) - (j10 * 127719000)) - (j13 * (-6428113));
        long j18 = (((j5 - (j4 * 19280294)) - (j9 * 127719000)) - (j10 * (-6428113))) - (j13 * 5343);
        long j19 = (j7 & 268435455) + (j8 >> 28);
        long j20 = j17 - (j19 * 5343);
        long j21 = (j8 & 268435455) + (j11 >> 28);
        long j22 = (jLoadAd2 - (j19 * (-50998291))) - (j21 * 19280294);
        long j23 = (j14 - (j19 * 19280294)) - (j21 * 127719000);
        long j24 = (j15 - (j19 * 127719000)) - (j21 * (-6428113));
        long j25 = (j16 - (j19 * (-6428113))) - (j21 * 5343);
        long j26 = (j11 & 268435455) + (j12 >> 28);
        long j27 = jLoadAd - (j26 * (-50998291));
        long j28 = (jCrashlytics2 - (j21 * (-50998291))) - (j26 * 19280294);
        long j29 = j22 - (j26 * 127719000);
        long j30 = j23 - (j26 * (-6428113));
        long j31 = j24 - (j26 * 5343);
        long j32 = j18 + (j20 >> 28);
        long j33 = (j12 & 268435455) + (j32 >> 28);
        long j34 = j32 & 268435455;
        long j35 = j34 >>> 27;
        long j36 = j33 + j35;
        long j37 = jCrashlytics - (j36 * (-50998291));
        long j38 = (j27 - (j36 * 19280294)) + (j37 >> 28);
        long j39 = (j28 - (j36 * 127719000)) + (j38 >> 28);
        long j40 = (j29 - (j36 * (-6428113))) + (j39 >> 28);
        long j41 = (j30 - (j36 * 5343)) + (j40 >> 28);
        long j42 = j31 + (j41 >> 28);
        long j43 = j25 + (j42 >> 28);
        long j44 = (j20 & 268435455) + (j43 >> 28);
        long j45 = j34 + (j44 >> 28);
        long j46 = (j45 >> 28) - j35;
        long j47 = (j37 & 268435455) + (j46 & (-50998291));
        long j48 = (j38 & 268435455) + (j46 & 19280294) + (j47 >> 28);
        long j49 = (j39 & 268435455) + (j46 & 127719000) + (j48 >> 28);
        long j50 = (j40 & 268435455) + (j46 & (-6428113)) + (j49 >> 28);
        long j51 = (j41 & 268435455) + (j46 & 5343) + (j50 >> 28);
        long j52 = (j42 & 268435455) + (j51 >> 28);
        long j53 = (j43 & 268435455) + (j52 >> 28);
        long j54 = (j44 & 268435455) + (j53 >> 28);
        byte[] bArr2 = new byte[32];
        AbstractC16655l.mopub((j47 & 268435455) | ((j48 & 268435455) << 28), bArr2, 0);
        AbstractC16655l.mopub((j49 & 268435455) | ((j50 & 268435455) << 28), bArr2, 7);
        AbstractC16655l.mopub((j51 & 268435455) | ((j52 & 268435455) << 28), bArr2, 14);
        AbstractC16655l.mopub((j53 & 268435455) | ((j54 & 268435455) << 28), bArr2, 21);
        AbstractC16655l.purchase((int) ((j45 & 268435455) + (j54 >> 28)), 28, bArr2);
        return bArr2;
    }

    public static void amazon(byte[] bArr, int[] iArr) {
        AbstractC16655l.amazon(8, bArr, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int crashlytics(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2219l.crashlytics(int, int, int, boolean):int");
    }

    public static final C8195l loadAd(long j, long j2) {
        long jMopub = AbstractC14707l.mopub(j2);
        float fBilling = C14174l.billing(jMopub);
        float fCrashlytics = C14174l.crashlytics(jMopub);
        float fAmazon = AbstractC8576l.amazon(C1187l.purchase(j), 0.0f, fBilling);
        float fAmazon2 = AbstractC8576l.amazon(C1187l.billing(j), 0.0f, C14174l.crashlytics(jMopub));
        return new C8195l(Float.valueOf(AbstractC8576l.amazon((1.0f / fBilling) * fAmazon, 0.0f, 1.0f)), Float.valueOf(AbstractC8576l.amazon(1.0f - ((1.0f / fCrashlytics) * fAmazon2), 0.0f, 1.0f)));
    }

    public static String subs(C1998l c1998l) {
        StringBuilder sb = new StringBuilder(c1998l.mopub());
        for (int i = 0; i < c1998l.mopub(); i++) {
            byte bAmazon = c1998l.amazon(i);
            if (bAmazon == 34) {
                sb.append("\\\"");
            } else if (bAmazon == 39) {
                sb.append("\\'");
            } else if (bAmazon != 92) {
                switch (bAmazon) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bAmazon < 32 || bAmazon > 126) {
                            sb.append('\\');
                            sb.append((char) (((bAmazon >>> 6) & 3) + 48));
                            sb.append((char) (((bAmazon >>> 3) & 7) + 48));
                            sb.append((char) ((bAmazon & 7) + 48));
                        } else {
                            sb.append((char) bAmazon);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C12818l c12818l, Function2 function2, C6956l c6956l, int i) {
        float f = c12818l.yandex;
        c6956l.m2133new(-710607452);
        if (((i | (c6956l.billing(interfaceC17242l) ? 4 : 2) | (c6956l.billing(c12818l) ? 32 : 16) | (c6956l.billing(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2125final(-492369756);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = C1083l.license(AbstractC14055l.remoteconfig(new C9735l(AbstractC12953l.amazon(4294967295L)), new C9735l(AbstractC12953l.amazon(4278190080L))), 0.0f, 0.0f, 14);
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            AbstractC9544l abstractC9544l = (AbstractC9544l) objM2132native;
            Float fValueOf = Float.valueOf(f);
            c6956l.m2125final(1157296644);
            boolean zBilling = c6956l.billing(fValueOf);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                C18411l c18411lLoadAd = new C1575l(f, 1.0f, 1.0f, 1.0f).loadAd();
                C9735l c9735l = new C9735l(AbstractC12953l.amazon(4294967295L));
                int iAds = AbstractC5573l.ads(c18411lLoadAd.yandex * 255.0f);
                int iAds2 = AbstractC5573l.ads(c18411lLoadAd.loadAd * 255.0f);
                int iAds3 = AbstractC5573l.ads(c18411lLoadAd.crashlytics * 255.0f);
                float f2 = c18411lLoadAd.amazon;
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                objM2132native2 = C1083l.startapp(AbstractC14055l.remoteconfig(c9735l, new C9735l(AbstractC12953l.crashlytics(iAds, iAds2, iAds3, AbstractC5573l.ads(f2 * 255.0f)))));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            AbstractC9544l abstractC9544l2 = (AbstractC9544l) objM2132native2;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242l, 1.0f);
            Unit unit = Unit.INSTANCE;
            c6956l.m2125final(1157296644);
            boolean zBilling2 = c6956l.billing(function2);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = new C7178l(function2, null, 5);
                c6956l.m2147try(objM2132native3);
            }
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lCrashlytics.premium(new C8110l(unit, null, null, new C15463l((Function2) objM2132native3), 6));
            c6956l.m2125final(1618982084);
            boolean zBilling3 = c6956l.billing(abstractC9544l) | c6956l.billing(abstractC9544l2) | c6956l.billing(c12818l);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling3 || objM2132native4 == c13863l) {
                objM2132native4 = new C12683l(abstractC9544l, abstractC9544l2, c12818l, 8);
                c6956l.m2147try(objM2132native4);
            }
            c6956l.startapp(false);
            AbstractC12155l.yandex(interfaceC17242lPremium, (Function1) objM2132native4, c6956l, 0);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds == null) {
            return;
        }
        c4224lAds.amazon = new C11834l(interfaceC17242l, c12818l, function2, i, 3);
    }

    public abstract C13698l billing();

    public Object mopub(int i) {
        Object objInvoke;
        C2443l c2443lAdvert = billing().advert(i);
        int i2 = i - c2443lAdvert.yandex;
        Function1 key = c2443lAdvert.crashlytics.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new C13604l(i) : objInvoke;
    }

    public Object purchase(int i) {
        C2443l c2443lAdvert = billing().advert(i);
        return c2443lAdvert.crashlytics.yandex().invoke(Integer.valueOf(i - c2443lAdvert.yandex));
    }
}
