package org.bouncycastle.jce.provider;

import defpackage.AbstractC14024l;
import defpackage.AbstractC5020l;
import defpackage.C1074l;
import defpackage.C11138l;
import defpackage.C11327l;
import defpackage.C11778l;
import defpackage.C1405l;
import defpackage.C14143l;
import defpackage.C14441l;
import defpackage.C17364l;
import defpackage.C18229l;
import defpackage.C2321l;
import defpackage.C2857l;
import defpackage.C4567l;
import defpackage.C6541l;
import defpackage.C7972l;
import defpackage.C8413l;
import defpackage.C8843l;
import defpackage.Cclass;
import defpackage.Cfor;
import defpackage.Cpackage;
import defpackage.Cthrow;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC6306l;
import defpackage.appmetrica;
import defpackage.inmobi;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<C4567l, C17364l>>> cache = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static C17364l getOcspResponse(C4567l c4567l, C1405l c1405l, URI uri, X509Certificate x509Certificate, List<Extension> list, InterfaceC12575l interfaceC12575l) throws CertPathValidatorException {
        C2321l c2321l;
        C17364l c17364l;
        WeakReference<Map<C4567l, C17364l>> weakReference = cache.get(uri);
        Map<C4567l, C17364l> map = weakReference != null ? weakReference.get() : null;
        if (map != null && (c17364l = map.get(c4567l)) != null) {
            if (isCertIDFoundAndCurrent(C14441l.vip(Cthrow.premium(c17364l.f33831l.f18174l).f36593l), c1405l.yandex(), c4567l)) {
                return c17364l;
            }
            map.remove(c4567l);
        }
        try {
            URL url = uri.toURL();
            appmetrica appmetricaVar = new appmetrica((byte) 0, 0);
            C14143l c14143l = new C14143l();
            c14143l.f27661l = c4567l;
            appmetricaVar.purchase(c14143l);
            appmetrica appmetricaVar2 = new appmetrica((byte) 0, 0);
            byte[] bArrCrashlytics = null;
            for (int i = 0; i != list.size(); i++) {
                Extension extensionPurchase = C6541l.purchase(list.get(i));
                Cfor cfor = new Cfor(extensionPurchase.getId());
                byte[] value = extensionPurchase.getValue();
                C11327l c11327l = new C11327l(value);
                if (InterfaceC6306l.loadAd.ad(cfor)) {
                    bArrCrashlytics = AbstractC14024l.crashlytics(value);
                }
                boolean zIsCritical = extensionPurchase.isCritical();
                C18229l c18229l = new C18229l();
                c18229l.f35735l = cfor;
                c18229l.f35734l = zIsCritical;
                c18229l.f35733l = c11327l;
                appmetricaVar2.purchase(c18229l);
            }
            if (appmetricaVar2.f489l != 0) {
                C11138l c11138l = new C11138l(appmetricaVar);
                c11138l.f22357l = -1;
                C11138l c11138l2 = new C11138l(appmetricaVar2);
                c11138l2.f22357l = -1;
                c2321l = new C2321l(c11138l, C1074l.ads(c11138l2));
            } else {
                C11138l c11138l3 = new C11138l(appmetricaVar);
                c11138l3.f22357l = -1;
                c2321l = new C2321l(c11138l3, null);
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                appmetrica appmetricaVar3 = new appmetrica(2, 0);
                appmetricaVar3.purchase(c2321l);
                C11138l c11138l4 = new C11138l(appmetricaVar3);
                c11138l4.f22357l = -1;
                c11138l4.metrica(new C7972l(2, byteArrayOutputStream), true);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(byteArray.length));
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(byteArray);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = DEFAULT_MAX_RESPONSE_SIZE;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                long j = contentLength;
                int i2 = 4096;
                byte[] bArr = new byte[4096];
                long j2 = 0;
                while (true) {
                    int i3 = inputStream.read(bArr, 0, i2);
                    if (i3 < 0) {
                        C17364l c17364lVip = C17364l.vip(byteArrayOutputStream2.toByteArray());
                        if (c17364lVip.f33832l.f31115l.appmetrica() != 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("OCSP responder failed: ");
                            inmobi inmobiVar = c17364lVip.f33832l.f31115l;
                            inmobiVar.getClass();
                            sb.append(new BigInteger(inmobiVar.f838l));
                            throw new CertPathValidatorException(sb.toString(), null, c1405l.crashlytics, c1405l.amazon);
                        }
                        C8843l c8843lVip = C8843l.vip(c17364lVip.f33831l);
                        if (c8843lVip.f18175l.ad(InterfaceC6306l.yandex)) {
                            C14441l c14441lVip = C14441l.vip(c8843lVip.f18174l.f36593l);
                            if (ProvOcspRevocationChecker.validatedOcspResponse(c14441lVip, c1405l, bArrCrashlytics, x509Certificate, interfaceC12575l) && isCertIDFoundAndCurrent(c14441lVip, c1405l.yandex(), c4567l)) {
                                WeakReference<Map<C4567l, C17364l>> weakReference2 = cache.get(uri);
                                if (weakReference2 != null) {
                                    map = weakReference2.get();
                                }
                                if (map != null) {
                                    map.put(c4567l, c17364lVip);
                                    return c17364lVip;
                                }
                                HashMap map2 = new HashMap();
                                map2.put(c4567l, c17364lVip);
                                cache.put(uri, new WeakReference<>(map2));
                                return c17364lVip;
                            }
                        }
                        throw new CertPathValidatorException("OCSP response failed to validate", null, c1405l.crashlytics, c1405l.amazon);
                    }
                    ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
                    long j3 = i3;
                    if (j - j2 < j3) {
                        throw new C8413l("Data Overflow");
                    }
                    j2 += j3;
                    byteArrayOutputStream3.write(bArr, 0, i3);
                    byteArrayOutputStream2 = byteArrayOutputStream3;
                    i2 = 4096;
                }
            } catch (IOException e) {
                throw new CertPathValidatorException(AbstractC5020l.adcel(e, new StringBuilder("configuration error: ")), e, c1405l.crashlytics, c1405l.amazon);
            }
        } catch (MalformedURLException e2) {
            throw new CertPathValidatorException("configuration error: " + e2.getMessage(), e2, c1405l.crashlytics, c1405l.amazon);
        }
    }

    private static boolean isCertIDFoundAndCurrent(C14441l c14441l, Date date, C4567l c4567l) {
        Cclass cclass = C2857l.vip(c14441l.f28285l).f6214l;
        for (int i = 0; i != cclass.size(); i++) {
            C11778l c11778lVip = C11778l.vip(cclass.mo173throws(i));
            if (c4567l.equals(c11778lVip.f23575l)) {
                Cpackage cpackage = c11778lVip.f23577l;
                if (cpackage == null) {
                    return true;
                }
                try {
                    if (date.after(cpackage.appmetrica())) {
                        break;
                    }
                    return true;
                } catch (ParseException unused) {
                    break;
                }
            }
        }
        return false;
    }
}
