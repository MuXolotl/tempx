package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lٌُۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11342l {
    public static final C15578l yandex = new C15578l(1357457988, false, new C10721l(14));
    public static final C15578l loadAd = new C15578l(2046510101, false, new C10721l(15));
    public static final C15578l crashlytics = new C15578l(557900734, false, new C10721l(16));

    public static boolean admob(C16138l c16138l, C16138l c16138l2) {
        if (c16138l.f31596l.f842l.length != c16138l2.f31596l.f842l.length) {
            return false;
        }
        C8047l[] c8047lArrAds = c16138l.ads();
        C8047l[] c8047lArrAds2 = c16138l2.ads();
        if (c8047lArrAds.length != c8047lArrAds2.length) {
            return false;
        }
        for (int i = 0; i != c8047lArrAds.length; i++) {
            C8047l c8047l = c8047lArrAds[i];
            C8047l c8047l2 = c8047lArrAds2[i];
            if (c8047l != c8047l2 && (c8047l == null || c8047l2 == null || !c8047l.f16751l.ad(c8047l2.f16751l) || !amazon(c8047l.f16750l).equals(amazon(c8047l2.f16750l)))) {
                return false;
            }
        }
        return true;
    }

    public static String amazon(applovin applovinVar) {
        String strIsPro = isPro(applovinVar);
        if (strIsPro.length() > 0 && strIsPro.charAt(0) == '#') {
            try {
                applovin applovinVarAdvert = Ccase.advert(AbstractC8535l.loadAd(strIsPro.length() - 1, strIsPro));
                if (applovinVarAdvert instanceof Cdefault) {
                    strIsPro = ((Cdefault) applovinVarAdvert).mopub();
                }
            } catch (IOException e) {
                C11983l.ad(e, "unknown encoding in name: ");
                return null;
            }
        }
        String strAmazon = AbstractC9008l.amazon(strIsPro);
        int length = strAmazon.length();
        if (length < 2) {
            return strAmazon;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && strAmazon.charAt(i2) == '\\' && strAmazon.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && strAmazon.charAt(i4 - 1) == '\\' && strAmazon.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            strAmazon = strAmazon.substring(i2, i4 + 1);
        }
        if (strAmazon.indexOf("  ") < 0) {
            return strAmazon;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = strAmazon.charAt(0);
        sb.append(cCharAt);
        for (int i5 = 1; i5 < strAmazon.length(); i5++) {
            char cCharAt2 = strAmazon.charAt(i5);
            if (cCharAt != ' ' || cCharAt2 != ' ') {
                sb.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return sb.toString();
    }

    public static Object billing(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void crashlytics(StringBuilder sb, C8047l c8047l, Hashtable hashtable) {
        String strInmobi = (String) hashtable.get(c8047l.f16751l);
        if (strInmobi == null) {
            strInmobi = c8047l.f16751l.inmobi();
        }
        sb.append(strInmobi);
        sb.append('=');
        sb.append(isPro(c8047l.f16750l));
    }

    public static String isPro(applovin applovinVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!(applovinVar instanceof Cdefault) || (applovinVar instanceof C2761l)) {
            try {
                sb.append('#');
                byte[] bArrRemoteconfig = applovinVar.billing().remoteconfig("DER");
                C1561l c1561l = AbstractC8535l.yandex;
                sb.append(AbstractC8535l.purchase(0, bArrRemoteconfig.length, bArrRemoteconfig));
            } catch (IOException unused) {
                C8339l.metrica("Other value has no encoded form");
                return null;
            }
        } else {
            String strMopub = ((Cdefault) applovinVar).mopub();
            if (strMopub.length() > 0 && strMopub.charAt(0) == '#') {
                sb.append('\\');
            }
            sb.append(strMopub);
        }
        int length = sb.length();
        int i2 = (sb.length() >= 2 && sb.charAt(0) == '\\' && sb.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char cCharAt = sb.charAt(i2);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        break;
                }
            }
            sb.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (sb.length() > 0) {
            while (sb.length() > i && sb.charAt(i) == ' ') {
                sb.insert(i, "\\");
                i += 2;
            }
        }
        for (int length2 = sb.length() - 1; length2 >= i && sb.charAt(length2) == ' '; length2--) {
            sb.insert(length2, '\\');
        }
        return sb.toString();
    }

    public static void loadAd(StringBuilder sb, C16138l c16138l, Hashtable hashtable) {
        boolean z = true;
        if (c16138l.f31596l.f842l.length <= 1) {
            C8047l c8047lVip = c16138l.vip();
            if (c8047lVip != null) {
                crashlytics(sb, c8047lVip, hashtable);
                return;
            }
            return;
        }
        C8047l[] c8047lArrAds = c16138l.ads();
        for (int i = 0; i != c8047lArrAds.length; i++) {
            if (z) {
                z = false;
            } else {
                sb.append('+');
            }
            crashlytics(sb, c8047lArrAds[i], hashtable);
        }
    }

    public static long mopub(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static byte[] purchase(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            C8339l.metrica("The key length in bytes must be 32.");
            return null;
        }
        long jMopub = mopub(0, bArr) & 67108863;
        int i = 3;
        long jMopub2 = (mopub(3, bArr) >> 2) & 67108611;
        long jMopub3 = (mopub(6, bArr) >> 4) & 67092735;
        long jMopub4 = (mopub(9, bArr) >> 6) & 66076671;
        long jMopub5 = (mopub(12, bArr) >> 8) & 1048575;
        long j = jMopub2 * 5;
        long j2 = jMopub3 * 5;
        long j3 = jMopub4 * 5;
        long j4 = jMopub5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jMopub6 = j9 + (mopub(0, bArr3) & 67108863);
            long jMopub7 = j5 + ((mopub(i, bArr3) >> 2) & 67108863);
            long jMopub8 = j6 + ((mopub(6, bArr3) >> 4) & 67108863);
            long jMopub9 = j7 + ((mopub(9, bArr3) >> 6) & 67108863);
            long j10 = jMopub2;
            long jMopub10 = j8 + (((mopub(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jMopub10 * j) + (jMopub9 * j2) + (jMopub8 * j3) + (jMopub7 * j4) + (jMopub6 * jMopub);
            long j12 = (jMopub10 * j2) + (jMopub9 * j3) + (jMopub8 * j4) + (jMopub7 * jMopub) + (jMopub6 * j10);
            long j13 = (jMopub10 * j3) + (jMopub9 * j4) + (jMopub8 * jMopub) + (jMopub7 * j10) + (jMopub6 * jMopub3);
            long j14 = (jMopub10 * j4) + (jMopub9 * jMopub) + (jMopub8 * j10) + (jMopub7 * jMopub3) + (jMopub6 * jMopub4);
            long j15 = jMopub9 * j10;
            long j16 = jMopub10 * jMopub;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jMopub8 * jMopub3) + (jMopub7 * jMopub4) + (jMopub6 * jMopub5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jMopub2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jMopub11 = mopub(16, bArr) + j50;
        long j54 = jMopub11 & 4294967295L;
        long jMopub12 = mopub(20, bArr) + j51 + (jMopub11 >> 32);
        long jMopub13 = mopub(24, bArr) + j52 + (jMopub12 >> 32);
        long jMopub14 = (mopub(28, bArr) + j53 + (jMopub13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        subs(j54, bArr4, 0);
        subs(jMopub12 & 4294967295L, bArr4, 4);
        subs(jMopub13 & 4294967295L, bArr4, 8);
        subs(jMopub14, bArr4, 12);
        return bArr4;
    }

    public static void subs(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(InterfaceC8639l interfaceC8639l, ReadableByteChannel readableByteChannel, AbstractC0283l abstractC0283l) {
        C0224l c0224l;
        C9987l c9987l;
        if (abstractC0283l instanceof C0224l) {
            c0224l = (C0224l) abstractC0283l;
            int i = c0224l.f1197l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0224l.f1197l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0224l = new C0224l(abstractC0283l);
            }
        } else {
            c0224l = new C0224l(abstractC0283l);
        }
        Object obj = c0224l.f1195l;
        int i2 = c0224l.f1197l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C9987l c9987l2 = new C9987l();
            C0464l c0464l = new C0464l(c9987l2, readableByteChannel, 22);
            c0224l.f1196l = c9987l2;
            c0224l.f1197l = 1;
            Object objSmaato = AbstractC3474l.smaato(interfaceC8639l, c0464l, c0224l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSmaato == enumC9342l) {
                return enumC9342l;
            }
            c9987l = c9987l2;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c9987l = c0224l.f1196l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Integer(c9987l.f20387l);
    }
}
