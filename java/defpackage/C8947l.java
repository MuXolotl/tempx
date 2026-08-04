package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌٞٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8947l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8947l f18427l = new C8947l(1, AbstractC5754l.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        C13325l c13325l = (C13325l) obj;
        Set set = AbstractC5754l.yandex;
        StringBuilder sb = new StringBuilder();
        sb.append(c13325l.f26145l);
        byte b = 61;
        sb.append('=');
        String strSmaato = c13325l.f26144l;
        int iOrdinal = c13325l.f26141l.ordinal();
        if (iOrdinal != 0) {
            int i2 = 0;
            if (iOrdinal == 1) {
                if (AbstractC12024l.inmobi(strSmaato, '\"')) {
                    C8339l.metrica("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                    return null;
                }
                for (int i3 = 0; i3 < strSmaato.length(); i3++) {
                    char cCharAt = strSmaato.charAt(i3);
                    if (AbstractC8576l.remoteconfig(cCharAt) || AbstractC8576l.subs(cCharAt, 32) < 0 || AbstractC5754l.crashlytics.contains(Character.valueOf(cCharAt))) {
                        strSmaato = AbstractC14814l.smaato('\"', "\"", strSmaato);
                        break;
                    }
                }
            } else if (iOrdinal != 2) {
                int i4 = 3;
                if (iOrdinal != 3) {
                    C18725l.billing();
                    return null;
                }
                C16353l c16353l = C7714l.billing;
                byte[] bytes = strSmaato.getBytes(AbstractC9050l.yandex);
                int length = bytes.length;
                int length2 = bytes.length;
                c16353l.getClass();
                int i5 = c16353l.amazon;
                AbstractC15918l.admob(0, length, length2);
                int iLoadAd = c16353l.loadAd(length);
                byte[] bArr = new byte[iLoadAd];
                AbstractC15918l.admob(0, length, bytes.length);
                int iLoadAd2 = c16353l.loadAd(length);
                if (iLoadAd < 0) {
                    C18262l.adcel(AbstractC0653l.vip(iLoadAd, "destination offset: 0, destination size: "));
                    return null;
                }
                if (iLoadAd2 < 0 || iLoadAd2 > iLoadAd) {
                    C18262l.adcel(AbstractC12589l.premium(iLoadAd, iLoadAd2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
                    return null;
                }
                byte[] bArr2 = c16353l.yandex ? AbstractC5306l.crashlytics : AbstractC5306l.yandex;
                int i6 = c16353l.loadAd ? c16353l.purchase : Alert.DURATION_SHOW_INDEFINITELY;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    i = i7 + 2;
                    if (i >= length) {
                        break;
                    }
                    int iMin = Math.min((length - i7) / i4, i6);
                    byte b2 = b;
                    int i9 = i2;
                    while (i9 < iMin) {
                        int i10 = bytes[i7] & 255;
                        int i11 = i7 + 2;
                        int i12 = i2;
                        int i13 = bytes[i7 + 1] & 255;
                        i7 += 3;
                        int i14 = (i10 << 16) | (i13 << 8) | (bytes[i11] & 255);
                        bArr[i8] = bArr2[i14 >>> 18];
                        bArr[i8 + 1] = bArr2[(i14 >>> 12) & 63];
                        int i15 = i8 + 3;
                        bArr[i8 + 2] = bArr2[(i14 >>> 6) & 63];
                        i8 += 4;
                        bArr[i15] = bArr2[i14 & 63];
                        i9++;
                        i4 = i4;
                        i2 = i12;
                    }
                    int i16 = i2;
                    int i17 = i4;
                    if (iMin == i6 && i7 != length) {
                        int i18 = i8 + 1;
                        byte[] bArr3 = C7714l.mopub;
                        bArr[i8] = bArr3[i16];
                        i8 += 2;
                        bArr[i18] = bArr3[1];
                    }
                    b = b2;
                    i4 = i17;
                    i2 = i16;
                }
                byte b3 = b;
                int i19 = i4;
                int i20 = length - i7;
                if (i20 == 1) {
                    int i21 = i7 + 1;
                    int i22 = (bytes[i7] & 255) << 4;
                    bArr[i8] = bArr2[i22 >>> 6];
                    int i23 = i8 + 2;
                    bArr[i8 + 1] = bArr2[i22 & 63];
                    if (i5 == 1 || i5 == 3) {
                        bArr[i23] = b3;
                        bArr[i8 + 3] = b3;
                    }
                    i7 = i21;
                } else if (i20 == 2) {
                    int i24 = ((bytes[i7 + 1] & 255) << 2) | ((bytes[i7] & 255) << 10);
                    bArr[i8] = bArr2[i24 >>> 12];
                    int i25 = i8 + 2;
                    bArr[i8 + 1] = bArr2[(i24 >>> 6) & 63];
                    int i26 = i8 + 3;
                    bArr[i25] = bArr2[i24 & 63];
                    if (i5 == 1 || i5 == i19) {
                        bArr[i26] = b3;
                    }
                    i7 = i;
                }
                if (i7 != length) {
                    C8339l.smaato("Check failed.");
                    return null;
                }
                strSmaato = new String(bArr, AbstractC9050l.amazon);
            } else {
                strSmaato = AbstractC2208l.purchase(strSmaato, true);
            }
        }
        sb.append(strSmaato);
        return sb.toString();
    }
}
