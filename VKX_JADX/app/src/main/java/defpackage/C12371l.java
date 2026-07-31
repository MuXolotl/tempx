package defpackage;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Mac;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّؕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12371l implements InterfaceC13504l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24463l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15578l f24462l = new C15578l(343441346, false, new C11813l(9));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15578l f24461l = new C15578l(1439930443, false, new C8337l(20));

    public /* synthetic */ C12371l(int i) {
        this.f24463l = i;
    }

    public static int admob(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            C12371l c12371l = AbstractC3472l.yandex;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC3472l.crashlytics(i, AbstractC1900l.mopub(j, bArr));
        }
        if (i2 == 2) {
            return AbstractC3472l.amazon(i, AbstractC1900l.mopub(j, bArr), AbstractC1900l.mopub(j + 1, bArr));
        }
        C11586l.yandex();
        return 0;
    }

    public static InterfaceC13504l amazon(C0347l c0347l) {
        C7972l c7972l = c0347l.subs;
        C9812l c9812l = new C9812l(((C0346l) c7972l.f16631l).loadAd());
        try {
            Provider providerMopub = AbstractC17764l.mopub();
            if (providerMopub == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerMopub);
            return new C13645l(c9812l, new C2494l(((C0346l) c7972l.f16631l).loadAd(), providerMopub), 9);
        } catch (GeneralSecurityException unused) {
            return c9812l;
        }
    }

    public static final C12130l crashlytics(String str, String str2, C18120l c18120l) {
        ArrayList arrayListMetrica = AbstractC14055l.metrica(str);
        if (str2 != null) {
            arrayListMetrica.add(str2);
        }
        return new C12130l(arrayListMetrica, c18120l);
    }

    public static final void loadAd(C14115l c14115l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i, int i2) {
        C14855l c14855l = C18450l.f36043l;
        InterfaceC17030l interfaceC17030l = (i2 & 16) != 0 ? C4176l.loadAd : C4176l.yandex;
        boolean zBilling = c6956l.billing(c14115l);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = AbstractC6604l.yandex(c14115l, 1);
            c6956l.m2147try(objM2132native);
        }
        yandex((C7733l) objM2132native, interfaceC17242l, c14855l, interfaceC17030l, 1.0f, c6956l, 440 | (57344 & i), 0);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void yandex(final AbstractC14165l abstractC14165l, final InterfaceC17242l interfaceC17242l, InterfaceC13460l interfaceC13460l, InterfaceC17030l interfaceC17030l, float f, C6956l c6956l, final int i, final int i2) {
        final InterfaceC13460l interfaceC13460l2;
        int i3;
        InterfaceC17030l interfaceC17030l2;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        final InterfaceC17030l interfaceC17030l3;
        final float f3;
        C4224l c4224lAds;
        InterfaceC13460l interfaceC13460l3;
        InterfaceC17030l interfaceC17030l4;
        float f4;
        Object objM2132native;
        C16395l c16395l;
        c6956l.m2133new(1142754848);
        int i9 = ((i & 8) == 0 ? c6956l.billing(abstractC14165l) : c6956l.admob(abstractC14165l) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i9 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 = i9 | 3072;
            interfaceC13460l2 = interfaceC13460l;
        } else {
            interfaceC13460l2 = interfaceC13460l;
            i3 = i9 | (c6956l.billing(interfaceC13460l2) ? 2048 : 1024);
        }
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                interfaceC17030l2 = interfaceC17030l;
                i3 |= c6956l.billing(interfaceC17030l2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                i6 = i3 | 196608;
                f2 = f;
            } else {
                f2 = f;
                if (c6956l.crashlytics(f2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i6 = i3 | i5;
            }
            if ((i2 & 64) != 0) {
                i7 = 1572864;
            } else if (c6956l.billing(null)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i8 = i6 | i7;
            if ((599187 & i8) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i8 & 1, z)) {
                if (i10 != 0) {
                    interfaceC13460l3 = C18450l.f36043l;
                } else {
                    interfaceC13460l3 = interfaceC13460l2;
                }
                if (i11 != 0) {
                    interfaceC17030l4 = C4176l.loadAd;
                } else {
                    interfaceC17030l4 = interfaceC17030l2;
                }
                if (i4 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                c6956l.m2123default(1899381698);
                c6956l.startapp(false);
                InterfaceC17242l interfaceC17242lIsPro = AbstractC11748l.isPro(AbstractC0019l.amazon(interfaceC17242l.premium(C4346l.f8873l)), abstractC14165l, interfaceC13460l3, interfaceC17030l4, f4, null, 2);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = C10327l.admob;
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC10835l interfaceC10835l = (InterfaceC10835l) objM2132native;
                long j = c6956l.f14595continue;
                int i12 = (int) (j ^ (j >>> 32));
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lIsPro);
                InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                InterfaceC8801l.firebase.getClass();
                c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835l, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i12), C3438l.isPro);
                c6956l.startapp(true);
                f3 = f4;
                interfaceC17030l3 = interfaceC17030l4;
                interfaceC13460l2 = interfaceC13460l3;
            } else {
                c6956l.m2124else();
                interfaceC17030l3 = interfaceC17030l2;
                f3 = f2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lؕؓؔ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        C12371l.yandex(abstractC14165l, interfaceC17242l, interfaceC13460l2, interfaceC17030l3, f3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 24576;
        interfaceC17030l2 = interfaceC17030l;
        i4 = i2 & 32;
        if (i4 != 0) {
            i6 = i3 | 196608;
            f2 = f;
        } else {
            f2 = f;
            if (c6956l.crashlytics(f2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i6 = i3 | i5;
        }
        if ((i2 & 64) != 0) {
            i7 = 1572864;
        } else if (c6956l.billing(null)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        i8 = i6 | i7;
        if ((599187 & i8) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i8 & 1, z)) {
            if (i10 != 0) {
                interfaceC13460l3 = C18450l.f36043l;
            } else {
                interfaceC13460l3 = interfaceC13460l2;
            }
            if (i11 != 0) {
                interfaceC17030l4 = C4176l.loadAd;
            } else {
                interfaceC17030l4 = interfaceC17030l2;
            }
            if (i4 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            c6956l.m2123default(1899381698);
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lIsPro2 = AbstractC11748l.isPro(AbstractC0019l.amazon(interfaceC17242l.premium(C4346l.f8873l)), abstractC14165l, interfaceC13460l3, interfaceC17030l4, f4, null, 2);
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = C10327l.admob;
                c6956l.m2147try(objM2132native);
            }
            InterfaceC10835l interfaceC10835l2 = (InterfaceC10835l) objM2132native;
            long j2 = c6956l.f14595continue;
            int i13 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lIsPro2);
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC8801l.firebase.getClass();
            c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835l2, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, C3438l.amazon);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i13), C3438l.isPro);
            c6956l.startapp(true);
            f3 = f4;
            interfaceC17030l3 = interfaceC17030l4;
            interfaceC13460l2 = interfaceC13460l3;
        } else {
            c6956l.m2124else();
            interfaceC17030l3 = interfaceC17030l2;
            f3 = f2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؕؓؔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C12371l.yandex(abstractC14165l, interfaceC17242l, interfaceC13460l2, interfaceC17030l3, f3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x023c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0183  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fe  */
    public final int billing(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        int i5;
        char cCharAt2;
        char cCharAt3;
        int i6;
        int i7;
        char cCharAt4;
        char c = 2048;
        char c2 = 128;
        char c3 = 55296;
        switch (this.f24463l) {
            case 0:
                int length = str.length();
                int i8 = i2 + i;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + i;
                    if (i10 >= i8 || (cCharAt3 = str.charAt(i9)) >= 128) {
                        if (i9 == length) {
                            return i + length;
                        }
                        i3 = i + i9;
                        while (i9 < length) {
                            cCharAt = str.charAt(i9);
                            if (cCharAt >= 128 && i3 < i8) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt < 2048 || i3 > i8 - 2) {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
                                    if (i3 > i8 - 4) {
                                        if (55296 > cCharAt && cCharAt <= 57343 && ((i4 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new C13717l(i9, length);
                                        }
                                        C10754l.isPro(cCharAt, i3);
                                        return 0;
                                    }
                                    i5 = i9 + 1;
                                    if (i5 != str.length()) {
                                        cCharAt2 = str.charAt(i5);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt2);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i9 = i5;
                                        } else {
                                            i9 = i5;
                                        }
                                    }
                                    throw new C13717l(i9 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                                i9++;
                            } else {
                                int i13 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            }
                            i9++;
                        }
                        return i3;
                    }
                    bArr[i10] = (byte) cCharAt3;
                    i9++;
                }
                if (i9 == length) {
                    return i + length;
                }
                i3 = i + i9;
                while (i9 < length) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= 128) {
                        if (cCharAt < 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | 128);
                            }
                            if (i3 > i8 - 4) {
                                if (55296 > cCharAt) {
                                }
                                C10754l.isPro(cCharAt, i3);
                                return 0;
                            }
                            i5 = i9 + 1;
                            if (i5 != str.length()) {
                                cCharAt2 = str.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                    bArr[i3] = (byte) ((codePoint2 >>> 18) | 240);
                                    bArr[i3 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i16 = i3 + 3;
                                    bArr[i3 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i3 += 4;
                                    bArr[i16] = (byte) ((codePoint2 & 63) | 128);
                                    i9 = i5;
                                } else {
                                    i9 = i5;
                                }
                            }
                            throw new C13717l(i9 - 1, length);
                        }
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i3 > i8 - 4) {
                            if (55296 > cCharAt) {
                            }
                            C10754l.isPro(cCharAt, i3);
                            return 0;
                        }
                        i5 = i9 + 1;
                        if (i5 != str.length()) {
                            cCharAt2 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint3 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i3] = (byte) ((codePoint3 >>> 18) | 240);
                                bArr[i3 + 1] = (byte) (((codePoint3 >>> 12) & 63) | 128);
                                int i19 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((codePoint3 >>> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i19] = (byte) ((codePoint3 & 63) | 128);
                                i9 = i5;
                            } else {
                                i9 = i5;
                            }
                        }
                        throw new C13717l(i9 - 1, length);
                    }
                    if (cCharAt < 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i110 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i110] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i111 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i111] = (byte) ((cCharAt & '?') | 128);
                        }
                        if (i3 > i8 - 4) {
                            if (55296 > cCharAt) {
                            }
                            C10754l.isPro(cCharAt, i3);
                            return 0;
                        }
                        i5 = i9 + 1;
                        if (i5 != str.length()) {
                            cCharAt2 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                                int codePoint4 = Character.toCodePoint(cCharAt, cCharAt2);
                                bArr[i3] = (byte) ((codePoint4 >>> 18) | 240);
                                bArr[i3 + 1] = (byte) (((codePoint4 >>> 12) & 63) | 128);
                                int i112 = i3 + 3;
                                bArr[i3 + 2] = (byte) (((codePoint4 >>> 6) & 63) | 128);
                                i3 += 4;
                                bArr[i112] = (byte) ((codePoint4 & 63) | 128);
                                i9 = i5;
                            } else {
                                i9 = i5;
                            }
                        }
                        throw new C13717l(i9 - 1, length);
                    }
                    if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i113 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i113] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i114 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i114] = (byte) ((cCharAt & '?') | 128);
                    }
                    if (i3 > i8 - 4) {
                        if (55296 > cCharAt) {
                        }
                        C10754l.isPro(cCharAt, i3);
                        return 0;
                    }
                    i5 = i9 + 1;
                    if (i5 != str.length()) {
                        cCharAt2 = str.charAt(i5);
                        if (Character.isSurrogatePair(cCharAt, cCharAt2)) {
                            int codePoint5 = Character.toCodePoint(cCharAt, cCharAt2);
                            bArr[i3] = (byte) ((codePoint5 >>> 18) | 240);
                            bArr[i3 + 1] = (byte) (((codePoint5 >>> 12) & 63) | 128);
                            int i115 = i3 + 3;
                            bArr[i3 + 2] = (byte) (((codePoint5 >>> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i115] = (byte) ((codePoint5 & 63) | 128);
                            i9 = i5;
                        } else {
                            i9 = i5;
                        }
                    }
                    throw new C13717l(i9 - 1, length);
                    i9++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt4 = str.charAt(i20)) < 128) {
                    AbstractC1900l.firebase(bArr, j, (byte) cCharAt4);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 >= c2 || j >= j2) {
                            if (cCharAt5 >= c || j > j2 - 2) {
                                i6 = i20;
                                if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
                                    if (j > j2 - 4) {
                                        if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i6 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
                                            throw new C13717l(i6, length2);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                    }
                                    i20 = i6 + 1;
                                    if (i20 != length2) {
                                        char cCharAt6 = str.charAt(i20);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint6 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            AbstractC1900l.firebase(bArr, j, (byte) ((codePoint6 >>> 18) | 240));
                                            AbstractC1900l.firebase(bArr, j + 1, (byte) (((codePoint6 >>> 12) & 63) | 128));
                                            long j3 = j + 3;
                                            AbstractC1900l.firebase(bArr, j + 2, (byte) (((codePoint6 >>> 6) & 63) | 128));
                                            j += 4;
                                            AbstractC1900l.firebase(bArr, j3, (byte) ((codePoint6 & 63) | 128));
                                        }
                                    } else {
                                        i20 = i6;
                                    }
                                    throw new C13717l(i20 - 1, length2);
                                }
                                AbstractC1900l.firebase(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                                long j4 = j + 2;
                                AbstractC1900l.firebase(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | c2));
                                j += 3;
                                AbstractC1900l.firebase(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            } else {
                                i6 = i20;
                                long j5 = j + 1;
                                AbstractC1900l.firebase(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                                j += 2;
                                AbstractC1900l.firebase(bArr, j5, (byte) ((cCharAt5 & '?') | c2));
                            }
                            i20 = i6;
                        } else {
                            AbstractC1900l.firebase(bArr, j, (byte) cCharAt5);
                            j++;
                        }
                        i20++;
                        c = 2048;
                        c2 = 128;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9  */
    public final int mopub(int i, int i2, byte[] bArr) {
        byte b;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        byte bMopub;
        byte bMopub2;
        int i5 = i;
        switch (this.f24463l) {
            case 0:
                while (i5 < i2 && bArr[i5] >= 0) {
                    i5++;
                }
                if (i5 < i2) {
                    while (i5 < i2) {
                        int i6 = i5 + 1;
                        byte b2 = bArr[i5];
                        if (b2 >= 0) {
                            i5 = i6;
                        } else if (b2 < -32) {
                            if (i6 >= i2) {
                                return b2;
                            }
                            if (b2 < -62) {
                                return -1;
                            }
                            i5 += 2;
                            if (bArr[i6] > -65) {
                                return -1;
                            }
                        } else if (b2 < -16) {
                            if (i6 >= i2 - 1) {
                                return AbstractC3472l.yandex(i6, i2, bArr);
                            }
                            int i7 = i5 + 2;
                            byte b3 = bArr[i6];
                            if (b3 > -65) {
                                return -1;
                            }
                            if (b2 == -32 && b3 < -96) {
                                return -1;
                            }
                            if (b2 == -19 && b3 >= -96) {
                                return -1;
                            }
                            i5 += 3;
                            if (bArr[i7] > -65) {
                                return -1;
                            }
                        } else {
                            if (i6 >= i2 - 2) {
                                return AbstractC3472l.yandex(i6, i2, bArr);
                            }
                            int i8 = i5 + 2;
                            byte b4 = bArr[i6];
                            if (b4 > -65 || (((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                                return -1;
                            }
                            int i9 = i5 + 3;
                            if (bArr[i8] > -65) {
                                return -1;
                            }
                            i5 += 4;
                            if (bArr[i9] > -65) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j4 = i5;
                int i10 = (int) (((long) i2) - j4);
                if (i10 < 16) {
                    j = j4;
                    b = 0;
                    i3 = 0;
                } else {
                    int i11 = 8 - (((int) j4) & 7);
                    long j5 = j4;
                    b = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < i11) {
                            long j6 = j5 + 1;
                            if (AbstractC1900l.mopub(j5, bArr) < 0) {
                                j = j4;
                            } else {
                                i3++;
                                j5 = j6;
                            }
                        } else {
                            while (true) {
                                int i12 = i3 + 8;
                                if (i12 <= i10) {
                                    j = j4;
                                    if ((AbstractC1900l.crashlytics.admob(AbstractC1900l.billing + j5, bArr) & (-9187201950435737472L)) == 0) {
                                        j5 += 8;
                                        i3 = i12;
                                        j4 = j;
                                    }
                                } else {
                                    j = j4;
                                }
                            }
                            while (true) {
                                if (i3 < i10) {
                                    long j7 = j5 + 1;
                                    if (AbstractC1900l.mopub(j5, bArr) >= 0) {
                                        i3++;
                                        j5 = j7;
                                    }
                                } else {
                                    i3 = i10;
                                }
                            }
                        }
                    }
                }
                int i13 = i10 - i3;
                long j8 = j + ((long) i3);
                while (true) {
                    byte b5 = b;
                    while (i13 > 0) {
                        long j9 = j8 + 1;
                        byte bMopub3 = AbstractC1900l.mopub(j8, bArr);
                        if (bMopub3 >= 0) {
                            i13--;
                            j8 = j9;
                            b5 = bMopub3;
                        } else {
                            j8 = j9;
                            b5 = bMopub3;
                            if (i13 == 0) {
                                return b;
                            }
                            i4 = i13 - 1;
                            if (b5 < -32) {
                                if (i4 == 0) {
                                    return b5;
                                }
                                i13 -= 2;
                                if (b5 >= -62) {
                                    return -1;
                                }
                                j2 = j8 + 1;
                                if (AbstractC1900l.mopub(j8, bArr) > -65) {
                                    return -1;
                                }
                                j8 = j2;
                            } else if (b5 >= -16) {
                                if (i4 < 2) {
                                    return admob(j8, bArr, b5, i4);
                                }
                                i13 -= 3;
                                j3 = j8 + 1;
                                bMopub = AbstractC1900l.mopub(j8, bArr);
                                if (bMopub <= -65) {
                                    return -1;
                                }
                                if (b5 != -32 && bMopub < -96) {
                                    return -1;
                                }
                                if (b5 != -19 && bMopub >= -96) {
                                    return -1;
                                }
                                j8 += 2;
                                if (AbstractC1900l.mopub(j3, bArr) > -65) {
                                    return -1;
                                }
                            } else {
                                if (i4 < 3) {
                                    return admob(j8, bArr, b5, i4);
                                }
                                i13 -= 4;
                                long j10 = j8 + 1;
                                bMopub2 = AbstractC1900l.mopub(j8, bArr);
                                if (bMopub2 > -65 && (((bMopub2 + 112) + (b5 << 28)) >> 30) == 0) {
                                    long j11 = j8 + 2;
                                    if (AbstractC1900l.mopub(j10, bArr) > -65) {
                                        return -1;
                                    }
                                    j8 += 3;
                                    if (AbstractC1900l.mopub(j11, bArr) > -65) {
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                    if (i13 == 0) {
                        return b;
                    }
                    i4 = i13 - 1;
                    if (b5 < -32) {
                        if (i4 == 0) {
                            return b5;
                        }
                        i13 -= 2;
                        if (b5 >= -62) {
                            return -1;
                        }
                        j2 = j8 + 1;
                        if (AbstractC1900l.mopub(j8, bArr) > -65) {
                            return -1;
                        }
                        j8 = j2;
                    } else {
                        if (b5 >= -16) {
                            if (i4 < 3) {
                                return admob(j8, bArr, b5, i4);
                            }
                            i13 -= 4;
                            long j12 = j8 + 1;
                            bMopub2 = AbstractC1900l.mopub(j8, bArr);
                            return bMopub2 > -65 ? -1 : -1;
                        }
                        if (i4 < 2) {
                            return admob(j8, bArr, b5, i4);
                        }
                        i13 -= 3;
                        j3 = j8 + 1;
                        bMopub = AbstractC1900l.mopub(j8, bArr);
                        if (bMopub <= -65) {
                            return -1;
                        }
                        if (b5 != -32) {
                        }
                        if (b5 != -19) {
                        }
                        j8 += 2;
                        if (AbstractC1900l.mopub(j3, bArr) > -65) {
                            return -1;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    public final String purchase(int i, int i2, byte[] bArr) {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f24463l) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw C2297l.loadAd();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || AbstractC3925l.loadAd(b6)) {
                                    throw C2297l.loadAd();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else if (b < -16) {
                                if (i3 < i5 - 1) {
                                    throw C2297l.loadAd();
                                }
                                int i8 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b7 = bArr[i8];
                                int i9 = i6 + 1;
                                if (!AbstractC3925l.loadAd(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || AbstractC3925l.loadAd(b7)))) {
                                    throw C2297l.loadAd();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b7 & 63));
                                i6 = i9;
                            } else {
                                if (i3 < i5 - 2) {
                                    throw C2297l.loadAd();
                                }
                                b4 = bArr[i3];
                                int i10 = i + 3;
                                byte b8 = bArr[i + 2];
                                i += 4;
                                byte b9 = bArr[i10];
                                int i11 = i6 + 1;
                                if (!AbstractC3925l.loadAd(b4) || (((b4 + 112) + (b << 28)) >> 30) != 0 || AbstractC3925l.loadAd(b8) || AbstractC3925l.loadAd(b9)) {
                                    throw C2297l.loadAd();
                                }
                                int i12 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                cArr[i6] = (char) ((i12 >>> 10) + 55232);
                                cArr[i11] = (char) ((i12 & 1023) + 56320);
                                i6 += 2;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw C2297l.loadAd();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw C2297l.loadAd();
                        }
                        if (b < -16) {
                            if (i3 < i5 - 1) {
                                throw C2297l.loadAd();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (AbstractC3925l.loadAd(b3)) {
                            }
                            throw C2297l.loadAd();
                        }
                        if (i3 < i5 - 2) {
                            throw C2297l.loadAd();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (AbstractC3925l.loadAd(b4)) {
                        }
                        throw C2297l.loadAd();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC6061l.yandex;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw C2297l.loadAd();
                }
                return str;
        }
    }
}
