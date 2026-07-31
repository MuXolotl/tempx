package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2287l {
    public final /* synthetic */ int yandex;
    public static final C15578l loadAd = new C15578l(-547183648, false, new C7277l(7));
    public static final C15578l crashlytics = new C15578l(1558913424, false, new C11891l(6));
    public static final C15578l amazon = new C15578l(-554567260, false, new C7277l(8));
    public static final C15578l purchase = new C15578l(-154320855, false, new C5407l(23));

    public /* synthetic */ C2287l(int i) {
        this.yandex = i;
    }

    public static final C2769l amazon(C15578l c15578l, C6956l c6956l, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && c6956l.billing(c15578l)) || (i & 6) == 4;
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (z || objM2132native == obj) {
            objM2132native = new C2769l(c15578l);
            c6956l.m2147try(objM2132native);
        }
        C2769l c2769l = (C2769l) objM2132native;
        boolean zBilling = c6956l.billing(c2769l);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj) {
            objM2132native2 = new C1412l(13, c2769l);
            c6956l.m2147try(objM2132native2);
        }
        AbstractC12311l.loadAd(c2769l, (Function1) objM2132native2, c6956l);
        return c2769l;
    }

    public static final void crashlytics(int i, int i2, C6956l c6956l, boolean z, boolean z2) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1684538607);
        int i3 = (c6956l.mopub(z) ? 4 : 2) | i2 | (c6956l2.mopub(z2) ? 32 : 16) | (c6956l2.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C4346l c4346l = C4346l.f8873l;
            if (z2) {
                c6956l2.m2123default(1692085941);
                AbstractC9498l.yandex(z, AbstractC0080l.isPro(c4346l, 32.0f), ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.yandex, 0, 0.0f, 0.0f, 0.0f, 0.0f, c6956l2, (i3 & 14) | 48, 248);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(1692283039);
                String strValueOf = String.valueOf(i);
                C10707l c10707l = AbstractC16964l.yandex;
                AbstractC13010l.loadAd(strValueOf, AbstractC0080l.vip(c4346l, 32.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.remoteconfig, c6956l, 48, 0, 130040);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
            }
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12778l(z, z2, i, i2);
        }
    }

    public static byte[] firebase(C10975l c10975l, C5775l c5775l) {
        byte[] bArr = new byte[c5775l.metrica - 32];
        for (int i = 0; i < c5775l.billing; i++) {
            C10111l c10111l = ((C10111l[]) c10975l.f22121l)[i];
            byte[] bArr2 = new byte[320];
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = i2 * 5;
                int[] iArr = (int[]) c10111l.f20587l;
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
            c10111l.getClass();
            System.arraycopy(bArr2, 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static final void loadAd(boolean z, boolean z2, C15578l c15578l, C6956l c6956l, int i) {
        boolean z3;
        c6956l.m2133new(2068941993);
        int i2 = (c6956l.mopub(z) ? 4 : 2) | i | (c6956l.mopub(z2) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C6839l c6839l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, c6839l), 48.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lIsPro);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            c15578l.invoke(c6956l, 6);
            if (z2) {
                c6956l.m2123default(1346816568);
                z3 = false;
                AbstractC9498l.yandex(z, AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC12953l.amazon(2684354560L), AbstractC16837l.yandex), 0L, 0, 0.0f, 0.0f, 0.0f, 0.0f, c6956l, (i2 & 14) | 48, 252);
            } else {
                z3 = false;
                c6956l.m2123default(1345659059);
            }
            c6956l.startapp(z3);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0802l(z, z2, c15578l, i);
        }
    }

    public static void smaato(C10975l c10975l, C1770l c1770l, C10975l c10975l2, byte[] bArr, byte[] bArr2, byte[] bArr3, C5775l c5775l) {
        int i;
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = c5775l.mopub;
            i = c5775l.billing;
            i2 = c5775l.purchase;
            if (i3 >= i4) {
                break;
            }
            ((C10111l[]) c1770l.f4179l)[i3].isVip(i2 * i3, bArr2);
            i3++;
        }
        for (int i5 = 0; i5 < i; i5++) {
            ((C10111l[]) c10975l2.f22121l)[i5].isVip(i5 * i2, bArr3);
        }
        int i6 = 0;
        while (i6 < i) {
            C10111l c10111l = ((C10111l[]) c10975l.f22121l)[i6];
            int i7 = i6 * 416;
            c10111l.getClass();
            int i8 = 0;
            while (i8 < 32) {
                int i9 = (i8 * 13) + i7;
                int i10 = i8 * 8;
                int i11 = bArr[i9] & 255;
                int i12 = bArr[i9 + 1] & 255;
                int[] iArr = (int[]) c10111l.f20587l;
                iArr[i10] = (i11 | (i12 << 8)) & 8191;
                int i13 = i10 + 1;
                int i14 = (i12 >> 5) | ((bArr[i9 + 2] & 255) << 3);
                int i15 = bArr[i9 + 3] & 255;
                iArr[i13] = (i14 | (i15 << 11)) & 8191;
                int i16 = i10 + 2;
                int i17 = bArr[i9 + 4] & 255;
                iArr[i16] = ((i15 >> 2) | (i17 << 6)) & 8191;
                int i18 = i10 + 3;
                int i19 = (i17 >> 7) | ((bArr[i9 + 5] & 255) << 1);
                int i20 = bArr[i9 + 6] & 255;
                iArr[i18] = (i19 | (i20 << 9)) & 8191;
                int i21 = i10 + 4;
                int i22 = (i20 >> 4) | ((bArr[i9 + 7] & 255) << 4);
                int i23 = bArr[i9 + 8] & 255;
                iArr[i21] = (i22 | (i23 << 12)) & 8191;
                int i24 = i10 + 5;
                int i25 = bArr[i9 + 9] & 255;
                iArr[i24] = ((i23 >> 1) | (i25 << 7)) & 8191;
                int i26 = i10 + 6;
                int i27 = i6;
                int i28 = ((bArr[i9 + 10] & 255) << 2) | (i25 >> 6);
                int i29 = bArr[i9 + 11] & 255;
                iArr[i26] = (i28 | (i29 << 10)) & 8191;
                int i30 = i10 + 7;
                iArr[i30] = ((i29 >> 3) | ((bArr[i9 + 12] & 255) << 5)) & 8191;
                iArr[i10] = 4096 - iArr[i10];
                iArr[i13] = 4096 - iArr[i13];
                iArr[i16] = 4096 - iArr[i16];
                iArr[i18] = 4096 - iArr[i18];
                iArr[i21] = 4096 - iArr[i21];
                iArr[i24] = 4096 - iArr[i24];
                iArr[i26] = 4096 - iArr[i26];
                iArr[i30] = 4096 - iArr[i30];
                i8++;
                i6 = i27;
            }
            i6++;
        }
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, AbstractC5189l abstractC5189l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-714464401);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(abstractC5189l) ? 32 : 16;
        }
        int i3 = i & 384;
        C15578l c15578l2 = AbstractC5998l.yandex;
        if (i3 == 0) {
            i2 |= c6956l.admob(c15578l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                Object c10086l = new C10086l(null, C18450l.f36015l);
                c6956l.m2147try(c10086l);
                objM2132native = c10086l;
            }
            C2769l c2769lAmazon = amazon(c15578l2, c6956l, (i2 >> 6) & 14);
            AbstractC10478l.yandex(abstractC5189l.yandex(c2769lAmazon), AbstractC14566l.amazon(274270255, new C2104l(interfaceC17242l, (InterfaceC8714l) objM2132native, c15578l, c2769lAmazon, 1), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC17242l, abstractC5189l, c15578l, i, 3);
        }
    }

    public short admob(short s) {
        return mopub(AbstractC5711l.loadAd(s));
    }

    public final short billing(short s, short s2) {
        switch (this.yandex) {
            case 0:
                int i = (s2 & 1) * s;
                for (int i2 = 1; i2 < 12; i2++) {
                    i ^= ((1 << i2) & s2) * s;
                }
                return mopub(i);
            default:
                int i3 = (s2 & 1) * s;
                for (int i4 = 1; i4 < 13; i4++) {
                    i3 ^= ((1 << i4) & s2) * s;
                }
                return mopub(i3);
        }
    }

    public short isPro(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 6) * (64 & j);
        long j4 = j ^ (j << 7);
        long j5 = ((j2 << 5) * (j4 & 524320)) ^ (((((j3 ^ ((16385 & j4) * j2)) ^ ((j2 << 1) * (32770 & j4))) ^ ((j2 << 2) * (65540 & j4))) ^ ((j2 << 3) * (131080 & j4))) ^ ((j2 << 4) * (262160 & j4)));
        long j6 = 137371844608L & j5;
        return mopub(((int) (j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24))))) & 67108863);
    }

    public final short mopub(int i) {
        int i2;
        switch (this.yandex) {
            case 0:
                int i3 = (2093056 & i) >>> 9;
                int i4 = (14680064 & i) >>> 18;
                i2 = ((((i & 4095) ^ (i >>> 12)) ^ i3) ^ i4) ^ (i >>> 21);
                break;
            default:
                int i5 = i & 8191;
                int i6 = i >>> 13;
                int i7 = ((i6 << 4) ^ (i6 << 3)) ^ (i6 << 1);
                int i8 = i7 >>> 13;
                i2 = (((i5 ^ i6) ^ i8) ^ (i7 & 8191)) ^ (((i8 << 4) ^ (i8 << 3)) ^ (i8 << 1));
                break;
        }
        return (short) i2;
    }

    public final short purchase(short s) {
        switch (this.yandex) {
            case 0:
                short sBilling = billing(admob(s), s);
                short sBilling2 = billing(admob(admob(sBilling)), sBilling);
                return admob(billing(admob(billing(admob(admob(billing(admob(admob(admob(admob(sBilling2)))), sBilling2))), sBilling)), s));
            default:
                short sIsPro = isPro(s, s);
                short sSubs = subs(sIsPro, sIsPro);
                return isPro(subs(mopub(AbstractC5711l.loadAd(mopub(AbstractC5711l.loadAd(subs(mopub(AbstractC5711l.loadAd(mopub(AbstractC5711l.loadAd(sSubs)))), sSubs))))), sSubs), (short) 1);
        }
    }

    public short subs(short s, short s2) {
        long j = s;
        long j2 = s2;
        long j3 = (j2 << 18) * (64 & j);
        long j4 = j ^ (j << 21);
        long j5 = ((j2 << 15) * (j4 & 8589934624L)) ^ (((((j3 ^ ((268435457 & j4) * j2)) ^ ((j2 << 3) * (536870914 & j4))) ^ ((j2 << 6) * (1073741828 & j4))) ^ ((j2 << 9) * (2147483656L & j4))) ^ ((j2 << 12) * (4294967312L & j4)));
        long j6 = 2305834213120671744L & j5;
        long j7 = j5 ^ ((j6 >>> 26) ^ (((j6 >>> 18) ^ (j6 >>> 20)) ^ (j6 >>> 24)));
        long j8 = 8796025913344L & j7;
        return mopub(((int) (j7 ^ ((j8 >>> 26) ^ (((j8 >>> 18) ^ (j8 >>> 20)) ^ (j8 >>> 24))))) & 67108863);
    }
}
