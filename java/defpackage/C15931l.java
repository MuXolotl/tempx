package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: lٌٕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15931l implements HostnameVerifier {
    public static final C15931l yandex = new C15931l();

    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    public static boolean loadAd(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (AbstractC3623l.yandex.amazon(str)) {
            String strLoadAd = AbstractC3623l.loadAd(str);
            List listYandex = yandex(x509Certificate, 7);
            if (!listYandex.isEmpty()) {
                Iterator it = listYandex.iterator();
                while (it.hasNext()) {
                    if (AbstractC8576l.yandex(strLoadAd, AbstractC3623l.loadAd((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) AbstractC7799l.amazon(str))) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listYandex2 = yandex(x509Certificate, 2);
        if (!listYandex2.isEmpty()) {
            for (String lowerCase : listYandex2) {
                if (str.length() == 0 || AbstractC16648l.isVip(str, ".", false) || AbstractC16648l.Signature(str, "..", false) || lowerCase == null || lowerCase.length() == 0 || AbstractC16648l.isVip(lowerCase, ".", false) || AbstractC16648l.Signature(lowerCase, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !AbstractC16648l.Signature(str, ".", false) ? str.concat(".") : str;
                    if (!AbstractC16648l.Signature(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (lowerCase.length() == ((int) AbstractC7799l.amazon(lowerCase))) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!AbstractC12024l.appmetrica(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!AbstractC16648l.isVip(lowerCase, "*.", false) || AbstractC12024l.m3321extends(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (AbstractC16648l.Signature(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC12024l.m3343switch(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List yandex(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC8576l.yandex(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return C2580l.f5619l;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (str.length() == ((int) AbstractC7799l.amazon(str))) {
            try {
                return loadAd(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
