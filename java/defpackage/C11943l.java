package defpackage;

import androidx.car.app.model.Alert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;

/* JADX INFO: renamed from: lُِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11943l implements InterfaceC5329l {
    public final /* synthetic */ int yandex;
    public static final C11943l loadAd = new C11943l(0);
    public static final C11943l crashlytics = new C11943l(1);

    public /* synthetic */ C11943l(int i) {
        this.yandex = i;
    }

    private final C18389l amazon(C8795l c8795l) throws IOException {
        InterfaceC1029l c8417l;
        C17778l c17778l = c8795l.yandex;
        synchronized (c17778l) {
            if (!c17778l.f34627l) {
                throw new IllegalStateException("released");
            }
            if (c17778l.f34636l || c17778l.f34618l || c17778l.f34623l || c17778l.f34629l) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC11772l interfaceC11772l = c17778l.f34633l;
        C13247l c13247lCrashlytics = interfaceC11772l.crashlytics();
        C11610l c11610l = c17778l.f34625l;
        int i = c8795l.mopub;
        C10111l c10111l = c13247lCrashlytics.admob;
        C8050l c8050l = c13247lCrashlytics.subs;
        if (c8050l != null) {
            c8417l = new C0164l(c11610l, c13247lCrashlytics, c8795l, c8050l);
        } else {
            c13247lCrashlytics.purchase.setSoTimeout(i);
            C3446l c3446lIsPro = ((C1503l) c10111l.f20586l).f3756l.isPro();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c3446lIsPro.mopub(j, timeUnit);
            ((C7167l) c10111l.f20589l).f14999l.isPro().mopub(c8795l.admob, timeUnit);
            c8417l = new C8417l(c11610l, c13247lCrashlytics, c10111l);
        }
        C4619l c4619l = new C4619l(c17778l, interfaceC11772l, c8417l);
        c17778l.f34632l = c4619l;
        c17778l.f34626l = c4619l;
        synchronized (c17778l) {
            c17778l.f34618l = true;
            c17778l.f34636l = true;
        }
        if (!c17778l.f34637l) {
            return C8795l.yandex(c8795l, 0, c4619l, null, 2097149).loadAd(c8795l.purchase);
        }
        C18262l.metrica("Canceled");
        return null;
    }

    public static int billing(C18389l c18389l, int i) {
        String strAmazon = c18389l.f35918l.amazon("Retry-After");
        if (strAmazon == null) {
            strAmazon = null;
        }
        if (strAmazon == null) {
            return i;
        }
        return Pattern.compile("\\d+").matcher(strAmazon).matches() ? Integer.valueOf(strAmazon).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0082 A[EDGE_INSN: B:179:0x0082->B:24:0x0082 BREAK  A[LOOP:2: B:18:0x0060->B:22:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[LOOP:2: B:18:0x0060->B:22:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab  */
    private final C18389l crashlytics(C8795l c8795l) {
        C10023l c10023l;
        C10023l c10023l2;
        C18389l c18389l;
        int i;
        int i2;
        int length;
        int length2;
        C10023l c10023l3;
        C8309l c8309l;
        String string;
        String string2;
        System.currentTimeMillis();
        C17032l c17032l = c8795l.purchase;
        C10023l c10023l4 = new C10023l((Object) c17032l, (Object) null, false);
        C15115l c15115l = c17032l.billing;
        if (c15115l == null) {
            int i3 = C15115l.vip;
            C8309l c8309l2 = c17032l.crashlytics;
            int size = c8309l2.size();
            String str = null;
            int i4 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = true;
            int iMetrica = -1;
            int iMetrica2 = -1;
            int iMetrica3 = -1;
            int iMetrica4 = -1;
            while (i4 < size) {
                String strBilling = c8309l2.billing(i4);
                String strFirebase = c8309l2.firebase(i4);
                if (strBilling.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str = strFirebase;
                    }
                    i2 = 0;
                    while (i2 < strFirebase.length()) {
                        length = strFirebase.length();
                        length2 = i2;
                        while (true) {
                            if (length2 < length) {
                                c10023l3 = c10023l4;
                                c8309l = c8309l2;
                                length2 = strFirebase.length();
                                break;
                            }
                            c10023l3 = c10023l4;
                            c8309l = c8309l2;
                            if (AbstractC12024l.inmobi("=,;", strFirebase.charAt(length2))) {
                                break;
                            }
                            length2++;
                            c10023l4 = c10023l3;
                            c8309l2 = c8309l;
                        }
                        string = AbstractC12024l.m3330l(strFirebase.substring(i2, length2)).toString();
                        if (length2 != strFirebase.length() || strFirebase.charAt(length2) == ',' || strFirebase.charAt(length2) == ';') {
                            i2 = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = AbstractC7712l.yandex;
                            int length4 = strFirebase.length();
                            while (true) {
                                if (length3 >= length4) {
                                    length3 = strFirebase.length();
                                    break;
                                }
                                char cCharAt = strFirebase.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            }
                            if (length3 >= strFirebase.length() || strFirebase.charAt(length3) != '\"') {
                                int length5 = strFirebase.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        length6 = strFirebase.length();
                                        break;
                                    }
                                    int i5 = length5;
                                    if (AbstractC12024l.inmobi(",;", strFirebase.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    length5 = i5;
                                }
                                int i6 = length6;
                                string2 = AbstractC12024l.m3330l(strFirebase.substring(length3, length6)).toString();
                                i2 = i6;
                            } else {
                                int i7 = length3 + 1;
                                int iM3321extends = AbstractC12024l.m3321extends(strFirebase, '\"', i7, 4);
                                string2 = strFirebase.substring(i7, iM3321extends);
                                i2 = iM3321extends + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z2 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iMetrica = AbstractC7712l.metrica(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iMetrica2 = AbstractC7712l.metrica(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z3 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z4 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z5 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iMetrica3 = AbstractC7712l.metrica(Alert.DURATION_SHOW_INDEFINITELY, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iMetrica4 = AbstractC7712l.metrica(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z6 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z7 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z8 = true;
                        }
                        c10023l4 = c10023l3;
                        c8309l2 = c8309l;
                    }
                    i4++;
                    c10023l4 = c10023l4;
                    c8309l2 = c8309l2;
                } else {
                    if (strBilling.equalsIgnoreCase("Pragma")) {
                    }
                    i4++;
                    c10023l4 = c10023l4;
                    c8309l2 = c8309l2;
                }
                z9 = false;
                i2 = 0;
                while (i2 < strFirebase.length()) {
                    length = strFirebase.length();
                    length2 = i2;
                    while (true) {
                        if (length2 < length) {
                            c10023l3 = c10023l4;
                            c8309l = c8309l2;
                            length2 = strFirebase.length();
                            break;
                        }
                        c10023l3 = c10023l4;
                        c8309l = c8309l2;
                        if (AbstractC12024l.inmobi("=,;", strFirebase.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        c10023l4 = c10023l3;
                        c8309l2 = c8309l;
                    }
                    string = AbstractC12024l.m3330l(strFirebase.substring(i2, length2)).toString();
                    if (length2 != strFirebase.length()) {
                        i2 = length2 + 1;
                        string2 = null;
                    } else {
                        i2 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iMetrica = AbstractC7712l.metrica(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iMetrica2 = AbstractC7712l.metrica(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iMetrica3 = AbstractC7712l.metrica(Alert.DURATION_SHOW_INDEFINITELY, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iMetrica4 = AbstractC7712l.metrica(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z8 = true;
                    }
                    c10023l4 = c10023l3;
                    c8309l2 = c8309l;
                }
                i4++;
                c10023l4 = c10023l4;
                c8309l2 = c8309l2;
            }
            c10023l = c10023l4;
            C15115l c15115l2 = new C15115l(z, z2, iMetrica, iMetrica2, z3, z4, z5, iMetrica3, iMetrica4, z6, z7, z8, !z9 ? null : str);
            c17032l.billing = c15115l2;
            c15115l = c15115l2;
        } else {
            c10023l = c10023l4;
        }
        if (c15115l.isPro) {
            Object obj = null;
            c10023l2 = new C10023l(obj, obj, false);
        } else {
            c10023l2 = c10023l;
        }
        C17032l c17032l2 = (C17032l) c10023l2.f20419l;
        C18389l c18389l2 = (C18389l) c10023l2.f20418l;
        if (c17032l2 == null && c18389l2 == null) {
            C18389l c18389l3 = new C18389l(c8795l.purchase, EnumC9199l.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new C8309l((String[]) new ArrayList(20).toArray(new String[0])), AbstractC6897l.f14438l, null, null, null, null, -1L, System.currentTimeMillis(), null, InterfaceC14341l.f28087l);
            c8795l.yandex.f34630l.getClass();
            return c18389l3;
        }
        if (c17032l2 == null) {
            C10049l c10049lYandex = c18389l2.yandex();
            C18389l c18389lCrashlytics = AbstractC9592l.crashlytics(c18389l2);
            C10049l.loadAd(c18389lCrashlytics, "cacheResponse");
            c10049lYandex.isPro = c18389lCrashlytics;
            C18389l c18389lYandex = c10049lYandex.yandex();
            c8795l.yandex.f34630l.getClass();
            return c18389lYandex;
        }
        if (c18389l2 != null) {
            c8795l.yandex.f34630l.getClass();
        }
        C18389l c18389lLoadAd = c8795l.loadAd(c17032l2);
        if (c18389l2 == null) {
            c18389l = null;
        } else {
            if (c18389lLoadAd.f35915l == 304) {
                C10049l c10049lYandex2 = c18389l2.yandex();
                C8309l c8309l3 = c18389l2.f35918l;
                C8309l c8309l4 = c18389lLoadAd.f35918l;
                ArrayList arrayList = new ArrayList(20);
                int i8 = 0;
                for (int size2 = c8309l3.size(); i8 < size2; size2 = i) {
                    String strBilling2 = c8309l3.billing(i8);
                    String strFirebase2 = c8309l3.firebase(i8);
                    if ("Warning".equalsIgnoreCase(strBilling2)) {
                        i = size2;
                        if (AbstractC16648l.isVip(strFirebase2, "1", false)) {
                        }
                        i8++;
                    } else {
                        i = size2;
                    }
                    if ("Content-Length".equalsIgnoreCase(strBilling2) || "Content-Encoding".equalsIgnoreCase(strBilling2) || "Content-Type".equalsIgnoreCase(strBilling2) || !AbstractC1762l.purchase(strBilling2) || c8309l4.amazon(strBilling2) == null) {
                        arrayList.add(strBilling2);
                        arrayList.add(AbstractC12024l.m3330l(strFirebase2).toString());
                    }
                    i8++;
                }
                int size3 = c8309l4.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    String strBilling3 = c8309l4.billing(i9);
                    if (!"Content-Length".equalsIgnoreCase(strBilling3) && !"Content-Encoding".equalsIgnoreCase(strBilling3) && !"Content-Type".equalsIgnoreCase(strBilling3) && AbstractC1762l.purchase(strBilling3)) {
                        String strFirebase3 = c8309l4.firebase(i9);
                        arrayList.add(strBilling3);
                        arrayList.add(AbstractC12024l.m3330l(strFirebase3).toString());
                    }
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C16543l c16543l = new C16543l((byte) 0, 13);
                AbstractC3984l.pro((ArrayList) c16543l.f32482l, strArr);
                c10049lYandex2.billing = c16543l;
                c10049lYandex2.smaato = c18389lLoadAd.f35916l;
                c10049lYandex2.remoteconfig = c18389lLoadAd.f35905l;
                C18389l c18389lCrashlytics2 = AbstractC9592l.crashlytics(c18389l2);
                C10049l.loadAd(c18389lCrashlytics2, "cacheResponse");
                c10049lYandex2.isPro = c18389lCrashlytics2;
                C18389l c18389lCrashlytics3 = AbstractC9592l.crashlytics(c18389lLoadAd);
                C10049l.loadAd(c18389lCrashlytics3, "networkResponse");
                c10049lYandex2.subs = c18389lCrashlytics3;
                c10049lYandex2.yandex();
                c18389lLoadAd.f35907l.close();
                throw null;
            }
            c18389l = null;
            AbstractC7712l.loadAd(c18389l2.f35907l);
        }
        C10049l c10049lYandex3 = c18389lLoadAd.yandex();
        C18389l c18389lCrashlytics4 = c18389l2 != null ? AbstractC9592l.crashlytics(c18389l2) : c18389l;
        C10049l.loadAd(c18389lCrashlytics4, "cacheResponse");
        c10049lYandex3.isPro = c18389lCrashlytics4;
        C18389l c18389lCrashlytics5 = AbstractC9592l.crashlytics(c18389lLoadAd);
        C10049l.loadAd(c18389lCrashlytics5, "networkResponse");
        c10049lYandex3.subs = c18389lCrashlytics5;
        return c10049lYandex3.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0149  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public static C17032l loadAd(C18389l c18389l, C4619l c4619l, C8795l c8795l) throws ProtocolException {
        String strAmazon;
        C17032l c17032l;
        C13170l c13170l;
        C6705l c6705lCrashlytics;
        C11644l c11644lYandex;
        boolean z;
        AbstractC10033l abstractC10033l;
        C18389l c18389l2;
        C13003l c13003l = c4619l != null ? c4619l.pro().crashlytics : null;
        int i = c18389l.f35915l;
        C17032l c17032l2 = c18389l.f35911l;
        String str = c17032l2.loadAd;
        if (i == 307 || i == 308) {
            if (c8795l.yandex.f34625l.admob) {
                strAmazon = c18389l.f35918l.amazon("Location");
                if (strAmazon == null) {
                    strAmazon = null;
                }
                c17032l = c18389l.f35911l;
                if (strAmazon != null) {
                    C6705l c6705l = c17032l.yandex;
                    c6705l.getClass();
                    try {
                        c13170l = new C13170l();
                        c13170l.isPro(c6705l, strAmazon);
                    } catch (IllegalArgumentException unused) {
                        c13170l = null;
                    }
                    if (c13170l != null) {
                        c6705lCrashlytics = c13170l.crashlytics();
                    } else {
                        c6705lCrashlytics = null;
                    }
                    if (c6705lCrashlytics != null && (AbstractC8576l.yandex(c6705lCrashlytics.yandex, c17032l.yandex.yandex) || c8795l.yandex.f34625l.subs)) {
                        c11644lYandex = c17032l.yandex();
                        if (AbstractC3670l.purchase(str)) {
                            int i2 = c18389l.f35915l;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                c11644lYandex.m3145l(str, z ? c17032l.amazon : null);
                            } else {
                                c11644lYandex.m3145l("GET", null);
                            }
                            if (!z) {
                                c11644lYandex.m3166l("Transfer-Encoding");
                                c11644lYandex.m3166l("Content-Length");
                                c11644lYandex.m3166l("Content-Type");
                            }
                        }
                        if (!AbstractC11432l.yandex(c17032l.yandex, c6705lCrashlytics)) {
                            c11644lYandex.m3166l("Authorization");
                        }
                        c11644lYandex.f23358l = c6705lCrashlytics;
                        return new C17032l(c11644lYandex);
                    }
                }
            }
        } else {
            if (i == 401) {
                return c8795l.subs.remoteconfig(c13003l, c18389l);
            }
            if (i == 421) {
                AbstractC10033l abstractC10033l2 = c17032l2.amazon;
                if ((abstractC10033l2 == null || !abstractC10033l2.billing()) && c4619l != null && !AbstractC8576l.yandex(((InterfaceC11772l) c4619l.f9372l).billing().subs.admob.amazon, ((InterfaceC1029l) c4619l.f9374l).subs().admob().yandex.admob.amazon)) {
                    C13247l c13247lPro = c4619l.pro();
                    synchronized (c13247lPro) {
                        c13247lPro.firebase = true;
                        Unit unit = Unit.INSTANCE;
                    }
                    return c18389l.f35911l;
                }
            } else if (i == 503) {
                C18389l c18389l3 = c18389l.f35919l;
                if ((c18389l3 == null || c18389l3.f35915l != 503) && billing(c18389l, Alert.DURATION_SHOW_INDEFINITELY) == 0) {
                    return c18389l.f35911l;
                }
            } else {
                if (i == 407) {
                    if (c13003l.loadAd.type() == Proxy.Type.HTTP) {
                        return c8795l.metrica.remoteconfig(c13003l, c18389l);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (c8795l.yandex.f34625l.admob) {
                                strAmazon = c18389l.f35918l.amazon("Location");
                                if (strAmazon == null) {
                                    strAmazon = null;
                                }
                                c17032l = c18389l.f35911l;
                                if (strAmazon != null) {
                                    C6705l c6705l2 = c17032l.yandex;
                                    c6705l2.getClass();
                                    c13170l = new C13170l();
                                    c13170l.isPro(c6705l2, strAmazon);
                                    if (c13170l != null) {
                                        c6705lCrashlytics = c13170l.crashlytics();
                                    } else {
                                        c6705lCrashlytics = null;
                                    }
                                    if (c6705lCrashlytics != null) {
                                        c11644lYandex = c17032l.yandex();
                                        if (AbstractC3670l.purchase(str)) {
                                            int i3 = c18389l.f35915l;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                c11644lYandex.m3145l(str, z ? c17032l.amazon : null);
                                            } else {
                                                c11644lYandex.m3145l(str, z ? c17032l.amazon : null);
                                            }
                                            if (!z) {
                                                c11644lYandex.m3166l("Transfer-Encoding");
                                                c11644lYandex.m3166l("Content-Length");
                                                c11644lYandex.m3166l("Content-Type");
                                            }
                                        }
                                        if (!AbstractC11432l.yandex(c17032l.yandex, c6705lCrashlytics)) {
                                            c11644lYandex.m3166l("Authorization");
                                        }
                                        c11644lYandex.f23358l = c6705lCrashlytics;
                                        return new C17032l(c11644lYandex);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (c8795l.adcel && (((abstractC10033l = c17032l2.amazon) == null || !abstractC10033l.billing()) && (((c18389l2 = c18389l.f35919l) == null || c18389l2.f35915l != 408) && billing(c18389l, 0) <= 0))) {
                    return c18389l.f35911l;
                }
            }
        }
        return null;
    }

    public static boolean purchase(IOException iOException, C17778l c17778l, C8795l c8795l, C17032l c17032l) {
        AbstractC10033l abstractC10033l;
        boolean z = iOException instanceof C10085l;
        if (!c8795l.adcel) {
            return false;
        }
        if ((!z && (((abstractC10033l = c17032l.amazon) != null && abstractC10033l.billing()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C4619l c4619l = c17778l.f34626l;
        if (c4619l == null || !c4619l.f9369l) {
            return false;
        }
        C11815l c11815lBilling = c17778l.f34633l.billing();
        C4619l c4619l2 = c17778l.f34626l;
        return c11815lBilling.yandex(c4619l2 != null ? c4619l2.pro() : null);
    }

    /* JADX WARN: Code duplicated, block: B:245:0x0536  */
    /* JADX WARN: Code duplicated, block: B:249:0x053d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0544 A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0571  */
    /* JADX WARN: Code duplicated, block: B:266:0x0580 A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:270:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:271:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x05b6 A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:275:0x05be  */
    /* JADX WARN: Code duplicated, block: B:276:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:278:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:279:0x05c5 A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:282:0x05cf A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:284:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:287:0x05de  */
    /* JADX WARN: Code duplicated, block: B:288:0x05df  */
    /* JADX WARN: Code duplicated, block: B:290:0x05e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x0607 A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:295:0x062c A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:297:0x0634  */
    /* JADX WARN: Code duplicated, block: B:300:0x063b A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:303:0x064a  */
    /* JADX WARN: Code duplicated, block: B:305:0x064e A[Catch: IOException -> 0x0550, TryCatch #5 {IOException -> 0x0550, blocks: (B:250:0x053e, B:252:0x0544, B:255:0x0553, B:264:0x057a, B:266:0x0580, B:267:0x0589, B:268:0x05a2, B:273:0x05b6, B:279:0x05c5, B:280:0x05cc, B:282:0x05cf, B:285:0x05d8, B:291:0x05e5, B:293:0x061e, B:295:0x062c, B:298:0x0635, B:305:0x064e, B:308:0x065b, B:309:0x067f, B:300:0x063b, B:292:0x0607), top: B:325:0x053e }] */
    /* JADX WARN: Code duplicated, block: B:315:0x0688 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:323:0x0509 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x0589 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC5329l
    public final C18389l yandex(C8795l c8795l) throws Throwable {
        boolean z;
        boolean z2;
        C10049l c10049lM1567synchronized;
        IOException iOException;
        C18389l c18389lYandex;
        int i;
        boolean z3;
        C18389l c18389lYandex2;
        String strAmazon;
        String strAmazon2;
        boolean z4;
        C10049l c10049l;
        boolean z5;
        boolean z6;
        boolean z7;
        List list;
        boolean z8;
        boolean z9;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C14511l c14511l;
        InterfaceC11772l c3585l;
        switch (this.yandex) {
            case 0:
                C4619l c4619l = c8795l.amazon;
                C17032l c17032l = c8795l.purchase;
                AbstractC10033l abstractC10033l = c17032l.amazon;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z10 = AbstractC3670l.purchase(c17032l.loadAd) && abstractC10033l != null;
                boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(c17032l.crashlytics.amazon("Connection"));
                try {
                    c4619l.getClass();
                    try {
                        try {
                            ((C17778l) c4619l.f9373l).f34630l.getClass();
                            ((InterfaceC1029l) c4619l.f9374l).isPro(c17032l);
                            ((C17778l) c4619l.f9373l).f34630l.getClass();
                            if (z10) {
                                if ("100-continue".equalsIgnoreCase(c17032l.crashlytics.amazon("Expect"))) {
                                    try {
                                        try {
                                            ((InterfaceC1029l) c4619l.f9374l).billing();
                                            c10049lM1567synchronized = c4619l.m1567synchronized(true);
                                            try {
                                                ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                c10049l = c10049lM1567synchronized;
                                                z2 = false;
                                            } catch (IOException e) {
                                                e = e;
                                                z2 = true;
                                                z = true;
                                                if (e instanceof C10085l) {
                                                    throw e;
                                                }
                                                throw e;
                                            }
                                        } catch (IOException e2) {
                                            ((C17778l) c4619l.f9373l).f34630l.getClass();
                                            c4619l.m1563catch(e2);
                                            throw e2;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        c10049lM1567synchronized = null;
                                    }
                                } else {
                                    c10049l = null;
                                    z2 = true;
                                }
                                if (c10049l != null) {
                                    z5 = true;
                                    try {
                                        z = true;
                                        try {
                                            ((C17778l) c4619l.f9373l).isPro(c4619l, true, false, false, false, null);
                                            if (!(c4619l.pro().subs != null)) {
                                                ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                            }
                                            c10049lM1567synchronized = c10049l;
                                        } catch (IOException e4) {
                                            e = e4;
                                            c10049lM1567synchronized = c10049l;
                                            if (e instanceof C10085l) {
                                                throw e;
                                            }
                                            throw e;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z = z5;
                                        c10049lM1567synchronized = c10049l;
                                        if (e instanceof C10085l) {
                                            throw e;
                                        }
                                        throw e;
                                    }
                                    break;
                                } else {
                                    try {
                                        try {
                                            if (abstractC10033l.purchase()) {
                                                try {
                                                    ((InterfaceC1029l) c4619l.f9374l).billing();
                                                    z6 = true;
                                                    c4619l.f9370l = true;
                                                    long jYandex = c17032l.amazon.yandex();
                                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                    abstractC10033l.isPro(new C7167l(new C6334l(c4619l, ((InterfaceC1029l) c4619l.f9374l).admob(c17032l, jYandex), jYandex, false)));
                                                } catch (IOException e6) {
                                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                    c4619l.m1563catch(e6);
                                                    throw e6;
                                                }
                                            } else {
                                                z6 = true;
                                                c4619l.f9370l = false;
                                                long jYandex2 = c17032l.amazon.yandex();
                                                ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                C7167l c7167l = new C7167l(new C6334l(c4619l, ((InterfaceC1029l) c4619l.f9374l).admob(c17032l, jYandex2), jYandex2, false));
                                                abstractC10033l.isPro(c7167l);
                                                c7167l.close();
                                            }
                                            z = z6;
                                            c10049lM1567synchronized = c10049l;
                                        } catch (IOException e7) {
                                            e = e7;
                                            z = z5;
                                            c10049lM1567synchronized = c10049l;
                                            if ((e instanceof C10085l) || !c4619l.f9369l) {
                                                throw e;
                                            }
                                            iOException = e;
                                            if (c10049lM1567synchronized == null) {
                                                try {
                                                    c10049lM1567synchronized = c4619l.m1567synchronized(false);
                                                    if (z2) {
                                                        ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                        z2 = false;
                                                    }
                                                } catch (IOException e8) {
                                                    if (iOException == null) {
                                                        throw e8;
                                                    }
                                                    AbstractC11718l.yandex(iOException, e8);
                                                    throw iOException;
                                                }
                                            }
                                            c10049lM1567synchronized.yandex = c17032l;
                                            c10049lM1567synchronized.purchase = c4619l.pro().billing;
                                            c10049lM1567synchronized.smaato = jCurrentTimeMillis;
                                            c10049lM1567synchronized.remoteconfig = System.currentTimeMillis();
                                            c18389lYandex = c10049lM1567synchronized.yandex();
                                            i = c18389lYandex.f35915l;
                                            while (true) {
                                                if (i != 100) {
                                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                    if (i == 101) {
                                                        z3 = z;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        if (c4619l.pro().subs != null) {
                                                            z4 = z;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (z4) {
                                                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                                        }
                                                    }
                                                    if (z3) {
                                                        strAmazon2 = c18389lYandex.f35918l.amazon("Connection");
                                                        if (strAmazon2 == null) {
                                                            strAmazon2 = null;
                                                        }
                                                        if (!"upgrade".equalsIgnoreCase(strAmazon2)) {
                                                            z = false;
                                                        }
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (zEqualsIgnoreCase) {
                                                        C5738l c5738lSignatures = c4619l.signatures(c18389lYandex);
                                                        C10049l c10049lYandex = c18389lYandex.yandex();
                                                        c10049lYandex.mopub = c5738lSignatures;
                                                        c10049lYandex.metrica = new C14823l(26);
                                                        c18389lYandex2 = c10049lYandex.yandex();
                                                    } else {
                                                        C5738l c5738lSignatures2 = c4619l.signatures(c18389lYandex);
                                                        C10049l c10049lYandex2 = c18389lYandex.yandex();
                                                        c10049lYandex2.mopub = c5738lSignatures2;
                                                        c10049lYandex2.metrica = new C14823l(26);
                                                        c18389lYandex2 = c10049lYandex2.yandex();
                                                    }
                                                    if ("close".equalsIgnoreCase(c18389lYandex2.f35911l.crashlytics.amazon("Connection"))) {
                                                        ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                                    } else {
                                                        strAmazon = c18389lYandex2.f35918l.amazon("Connection");
                                                        if (strAmazon == null) {
                                                            strAmazon = null;
                                                        }
                                                        if ("close".equalsIgnoreCase(strAmazon)) {
                                                            ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                                        }
                                                    }
                                                    if (i == 204) {
                                                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c18389lYandex2.f35907l.billing());
                                                    }
                                                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c18389lYandex2.f35907l.billing());
                                                    return c18389lYandex2;
                                                }
                                                C10049l c10049lM1567synchronized2 = c4619l.m1567synchronized(false);
                                                if (z2) {
                                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                                }
                                                c10049lM1567synchronized2.yandex = c17032l;
                                                c10049lM1567synchronized2.purchase = c4619l.pro().billing;
                                                c10049lM1567synchronized2.smaato = jCurrentTimeMillis;
                                                c10049lM1567synchronized2.remoteconfig = System.currentTimeMillis();
                                                c18389lYandex = c10049lM1567synchronized2.yandex();
                                                i = c18389lYandex.f35915l;
                                            }
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        z5 = true;
                                    }
                                }
                                if (c10049lM1567synchronized == null) {
                                    c10049lM1567synchronized = c4619l.m1567synchronized(false);
                                    if (z2) {
                                        ((C17778l) c4619l.f9373l).f34630l.getClass();
                                        z2 = false;
                                    }
                                }
                                c10049lM1567synchronized.yandex = c17032l;
                                c10049lM1567synchronized.purchase = c4619l.pro().billing;
                                c10049lM1567synchronized.smaato = jCurrentTimeMillis;
                                c10049lM1567synchronized.remoteconfig = System.currentTimeMillis();
                                c18389lYandex = c10049lM1567synchronized.yandex();
                                i = c18389lYandex.f35915l;
                                while (true) {
                                    if (i != 100 && (102 > i || i >= 200)) {
                                    }
                                    C10049l c10049lM1567synchronized3 = c4619l.m1567synchronized(false);
                                    if (z2) {
                                        ((C17778l) c4619l.f9373l).f34630l.getClass();
                                    }
                                    c10049lM1567synchronized3.yandex = c17032l;
                                    c10049lM1567synchronized3.purchase = c4619l.pro().billing;
                                    c10049lM1567synchronized3.smaato = jCurrentTimeMillis;
                                    c10049lM1567synchronized3.remoteconfig = System.currentTimeMillis();
                                    c18389lYandex = c10049lM1567synchronized3.yandex();
                                    i = c18389lYandex.f35915l;
                                }
                                ((C17778l) c4619l.f9373l).f34630l.getClass();
                                if (i == 101) {
                                    z3 = z;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    if (c4619l.pro().subs != null) {
                                        z4 = z;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                    }
                                }
                                if (z3) {
                                    z = false;
                                } else {
                                    strAmazon2 = c18389lYandex.f35918l.amazon("Connection");
                                    if (strAmazon2 == null) {
                                        strAmazon2 = null;
                                    }
                                    if (!"upgrade".equalsIgnoreCase(strAmazon2)) {
                                        z = false;
                                    }
                                }
                                if (zEqualsIgnoreCase || !z) {
                                    C5738l c5738lSignatures3 = c4619l.signatures(c18389lYandex);
                                    C10049l c10049lYandex3 = c18389lYandex.yandex();
                                    c10049lYandex3.mopub = c5738lSignatures3;
                                    c10049lYandex3.metrica = new C14823l(26);
                                    c18389lYandex2 = c10049lYandex3.yandex();
                                } else {
                                    C10049l c10049lYandex4 = c18389lYandex.yandex();
                                    c10049lYandex4.mopub = new C4243l(c18389lYandex.f35907l.mopub(), c18389lYandex.f35907l.billing());
                                    c10049lYandex4.admob = c4619l.m1562case();
                                    c18389lYandex2 = c10049lYandex4.yandex();
                                }
                                if ("close".equalsIgnoreCase(c18389lYandex2.f35911l.crashlytics.amazon("Connection"))) {
                                    ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                } else {
                                    strAmazon = c18389lYandex2.f35918l.amazon("Connection");
                                    if (strAmazon == null) {
                                        strAmazon = null;
                                    }
                                    if ("close".equalsIgnoreCase(strAmazon)) {
                                        ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                    }
                                }
                                if ((i == 204 && i != 205) || c18389lYandex2.f35907l.billing() <= 0) {
                                    return c18389lYandex2;
                                }
                                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c18389lYandex2.f35907l.billing());
                            }
                            z = true;
                            ((C17778l) c4619l.f9373l).isPro(c4619l, true, false, false, false, null);
                            z2 = true;
                            c10049lM1567synchronized = null;
                            if (abstractC10033l != null) {
                                try {
                                    if (!abstractC10033l.purchase()) {
                                        try {
                                            ((InterfaceC1029l) c4619l.f9374l).loadAd();
                                        } catch (IOException e10) {
                                            ((C17778l) c4619l.f9373l).f34630l.getClass();
                                            c4619l.m1563catch(e10);
                                            throw e10;
                                        }
                                    }
                                    iOException = null;
                                } catch (IOException e11) {
                                    e = e11;
                                    if (e instanceof C10085l) {
                                        throw e;
                                    }
                                    throw e;
                                }
                            } else {
                                ((InterfaceC1029l) c4619l.f9374l).loadAd();
                                iOException = null;
                            }
                            while (true) {
                                if (i != 100) {
                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                    if (i == 101) {
                                        z3 = z;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        if (c4619l.pro().subs != null) {
                                            z4 = z;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4) {
                                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                                        }
                                    }
                                    if (z3) {
                                        z = false;
                                    } else {
                                        strAmazon2 = c18389lYandex.f35918l.amazon("Connection");
                                        if (strAmazon2 == null) {
                                            strAmazon2 = null;
                                        }
                                        if (!"upgrade".equalsIgnoreCase(strAmazon2)) {
                                            z = false;
                                        }
                                    }
                                    if (zEqualsIgnoreCase) {
                                        C5738l c5738lSignatures4 = c4619l.signatures(c18389lYandex);
                                        C10049l c10049lYandex5 = c18389lYandex.yandex();
                                        c10049lYandex5.mopub = c5738lSignatures4;
                                        c10049lYandex5.metrica = new C14823l(26);
                                        c18389lYandex2 = c10049lYandex5.yandex();
                                    } else {
                                        C5738l c5738lSignatures5 = c4619l.signatures(c18389lYandex);
                                        C10049l c10049lYandex6 = c18389lYandex.yandex();
                                        c10049lYandex6.mopub = c5738lSignatures5;
                                        c10049lYandex6.metrica = new C14823l(26);
                                        c18389lYandex2 = c10049lYandex6.yandex();
                                    }
                                    if ("close".equalsIgnoreCase(c18389lYandex2.f35911l.crashlytics.amazon("Connection"))) {
                                        ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                    } else {
                                        strAmazon = c18389lYandex2.f35918l.amazon("Connection");
                                        if (strAmazon == null) {
                                            strAmazon = null;
                                        }
                                        if ("close".equalsIgnoreCase(strAmazon)) {
                                            ((InterfaceC1029l) c4619l.f9374l).subs().purchase();
                                        }
                                    }
                                    if (i == 204) {
                                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c18389lYandex2.f35907l.billing());
                                    }
                                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c18389lYandex2.f35907l.billing());
                                    return c18389lYandex2;
                                }
                                C10049l c10049lM1567synchronized4 = c4619l.m1567synchronized(false);
                                if (z2) {
                                    ((C17778l) c4619l.f9373l).f34630l.getClass();
                                }
                                c10049lM1567synchronized4.yandex = c17032l;
                                c10049lM1567synchronized4.purchase = c4619l.pro().billing;
                                c10049lM1567synchronized4.smaato = jCurrentTimeMillis;
                                c10049lM1567synchronized4.remoteconfig = System.currentTimeMillis();
                                c18389lYandex = c10049lM1567synchronized4.yandex();
                                i = c18389lYandex.f35915l;
                            }
                        } catch (IOException e12) {
                            ((C17778l) c4619l.f9373l).f34630l.getClass();
                            c4619l.m1563catch(e12);
                            throw e12;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        z2 = true;
                        c10049lM1567synchronized = null;
                        if (e instanceof C10085l) {
                            throw e;
                        }
                        throw e;
                    }
                } catch (IOException e14) {
                    e = e14;
                    z = true;
                }
                if (c10049lM1567synchronized == null) {
                    c10049lM1567synchronized = c4619l.m1567synchronized(false);
                    if (z2) {
                        ((C17778l) c4619l.f9373l).f34630l.getClass();
                        z2 = false;
                    }
                }
                c10049lM1567synchronized.yandex = c17032l;
                c10049lM1567synchronized.purchase = c4619l.pro().billing;
                c10049lM1567synchronized.smaato = jCurrentTimeMillis;
                c10049lM1567synchronized.remoteconfig = System.currentTimeMillis();
                c18389lYandex = c10049lM1567synchronized.yandex();
                i = c18389lYandex.f35915l;
                break;
            case 1:
                return amazon(c8795l);
            case 2:
                C13863l c13863l = c8795l.smaato;
                C17032l c17032l2 = c8795l.purchase;
                C11644l c11644lYandex = c17032l2.yandex();
                C8309l c8309l = c17032l2.crashlytics;
                AbstractC10033l abstractC10033l2 = c17032l2.amazon;
                if (abstractC10033l2 != null) {
                    C12105l c12105lLoadAd = abstractC10033l2.loadAd();
                    if (c12105lLoadAd != null) {
                        c11644lYandex.m3154l("Content-Type", c12105lLoadAd.yandex);
                    }
                    long jYandex3 = abstractC10033l2.yandex();
                    if (jYandex3 != -1) {
                        c11644lYandex.m3154l("Content-Length", String.valueOf(jYandex3));
                        c11644lYandex.m3166l("Transfer-Encoding");
                    } else {
                        c11644lYandex.m3154l("Transfer-Encoding", "chunked");
                        c11644lYandex.m3166l("Content-Length");
                    }
                }
                if (c8309l.amazon("Host") == null) {
                    c11644lYandex.m3154l("Host", AbstractC11432l.subs(c17032l2.yandex, false));
                }
                if (c8309l.amazon("Connection") == null) {
                    c11644lYandex.m3154l("Connection", "Keep-Alive");
                }
                if (c8309l.amazon("Accept-Encoding") == null && c8309l.amazon("Range") == null) {
                    c11644lYandex.m3154l("Accept-Encoding", "gzip");
                    z7 = true;
                } else {
                    z7 = false;
                }
                c13863l.getClass();
                if (c8309l.amazon("User-Agent") == null) {
                    c11644lYandex.m3154l("User-Agent", "okhttp/5.4.0");
                }
                C17032l c17032l3 = new C17032l(c11644lYandex);
                C18389l c18389lLoadAd = c8795l.loadAd(c17032l3);
                C8309l c8309l2 = c18389lLoadAd.f35918l;
                AbstractC0548l.amazon(c13863l, c17032l3.yandex, c8309l2);
                C10049l c10049lYandex7 = c18389lLoadAd.yandex();
                c10049lYandex7.yandex = c17032l3;
                if (z7) {
                    String strAmazon3 = c8309l2.amazon("Content-Encoding");
                    if (strAmazon3 == null) {
                        strAmazon3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(strAmazon3) && AbstractC0548l.yandex(c18389lLoadAd)) {
                        C6787l c6787l = new C6787l(c18389lLoadAd.f35907l.mo1516l());
                        C16543l c16543lMopub = c8309l2.mopub();
                        c16543lMopub.ad("Content-Encoding");
                        c16543lMopub.ad("Content-Length");
                        c10049lYandex7.billing = c16543lMopub.smaato().mopub();
                        String strAmazon4 = c8309l2.amazon("Content-Type");
                        if (strAmazon4 == null) {
                            strAmazon4 = null;
                        }
                        c10049lYandex7.mopub = new C5738l(strAmazon4, -1L, new C1503l(c6787l));
                    }
                }
                return c10049lYandex7.yandex();
            case 3:
                return crashlytics(c8795l);
            case 4:
                C17032l c17032l4 = c8795l.purchase;
                C18389l c18389lLoadAd2 = c8795l.loadAd(c17032l4);
                C6705l c6705l = c17032l4.yandex;
                String str = (String) AbstractC16901l.m4212class(c6705l.billing);
                if (str == null) {
                    str = "";
                }
                if (!AbstractC16648l.Signature(str, ".m3u8", false)) {
                    return c18389lLoadAd2;
                }
                C13170l c13170lBilling = c6705l.billing();
                int iSmaato = AbstractC14055l.smaato(c6705l.billing);
                ArrayList arrayList = c13170lBilling.crashlytics;
                arrayList.remove(iSmaato);
                if (arrayList.isEmpty()) {
                    arrayList.add("");
                }
                c13170lBilling.amazon = null;
                String str2 = c13170lBilling.crashlytics().subs;
                InterfaceC9473l interfaceC9473lMo1516l = c18389lLoadAd2.f35907l.mo1516l();
                StringBuilder sb = new StringBuilder();
                while (!interfaceC9473lMo1516l.subs()) {
                    String strMo702class = interfaceC9473lMo1516l.mo702class();
                    if (strMo702class == null) {
                        strMo702class = "";
                    }
                    if (AbstractC16648l.isVip(strMo702class, "#", false)) {
                        sb.append(strMo702class);
                    } else {
                        sb.append(str2);
                        sb.append('/');
                        sb.append(strMo702class);
                    }
                    sb.append('\n');
                }
                c18389lLoadAd2.close();
                C10049l c10049lYandex8 = c18389lLoadAd2.yandex();
                C8552l c8552l = AbstractC6897l.f14438l;
                String string = sb.toString();
                C11155l c11155l = C12105l.amazon;
                C8195l c8195lLoadAd = AbstractC13041l.loadAd(AbstractC0775l.m674strictfp("application/vnd.apple.mpegurl"));
                Charset charset = (Charset) c8195lLoadAd.f17098l;
                C12105l c12105l = (C12105l) c8195lLoadAd.f17097l;
                C0869l c0869l = new C0869l();
                int length = string.length();
                if (length < 0) {
                    C10754l.metrica(AbstractC12589l.premium(length, 0, "endIndex < beginIndex: ", " < "));
                } else if (length > string.length()) {
                    C10754l.remoteconfig(string.length(), AbstractC2812l.Signature("endIndex > string.length: ", length, " > "));
                } else if (charset.equals(AbstractC9050l.yandex)) {
                    c0869l.m721l(0, length, string);
                } else {
                    byte[] bytes = string.substring(0, length).getBytes(charset);
                    c0869l.write(bytes, 0, bytes.length);
                }
                c10049lYandex8.mopub = new C8552l(c12105l, c0869l.f2526l, c0869l);
                return c10049lYandex8.yandex();
            default:
                C17032l c17032l5 = c8795l.purchase;
                C17778l c17778l = c8795l.yandex;
                List listM4218final = C2580l.f5619l;
                C18389l c18389l = null;
                int i2 = 0;
                C17032l c17032lLoadAd = c17032l5;
                while (true) {
                    boolean z11 = true;
                    while (true) {
                        if (c17778l.f34632l != null) {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        synchronized (c17778l) {
                            if (c17778l.f34636l) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (c17778l.f34618l || c17778l.f34623l || c17778l.f34629l) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z11) {
                            C11610l c11610l = c17778l.f34625l;
                            List list2 = listM4218final;
                            C3097l c3097l = c11610l.applovin;
                            C0093l c0093l = (C0093l) c8795l.firebase.f10245l;
                            int i3 = c8795l.mopub;
                            int i4 = c8795l.admob;
                            int i5 = c8795l.billing;
                            boolean z12 = c8795l.adcel;
                            boolean z13 = c11610l.billing;
                            C6705l c6705l2 = c17032lLoadAd.yandex;
                            if (AbstractC8576l.yandex(c6705l2.yandex, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = c8795l.subscription;
                                HostnameVerifier hostnameVerifier2 = c8795l.vip;
                                c14511l = c8795l.isPro;
                                sSLSocketFactory = sSLSocketFactory2;
                                hostnameVerifier = hostnameVerifier2;
                            } else {
                                sSLSocketFactory = null;
                                hostnameVerifier = null;
                                c14511l = null;
                            }
                            String str3 = c6705l2.amazon;
                            int i6 = c6705l2.purchase;
                            C8565l c8565l = c8795l.remoteconfig;
                            SocketFactory socketFactory = c8795l.ads;
                            InterfaceC8038l interfaceC8038l = c8795l.metrica;
                            C11610l c11610l2 = c8795l.yandex.f34625l;
                            list = list2;
                            C17032l c17032l6 = c17032lLoadAd;
                            C11815l c11815l = new C11815l(c3097l, c0093l, i3, i4, i5, i3, z12, z13, new C12919l(str3, i6, c8565l, socketFactory, sSLSocketFactory, hostnameVerifier, c14511l, interfaceC8038l, c11610l2.ads, c11610l2.adcel, c8795l.startapp), c17778l.f34625l.premium, c17778l, c17032l6);
                            c17032lLoadAd = c17032l6;
                            C11610l c11610l3 = c17778l.f34625l;
                            if (c11610l3.billing) {
                                C3097l c3097l2 = c11610l3.applovin;
                                C18338l c18338l = new C18338l();
                                c18338l.f35847l = c11815l;
                                c18338l.f35846l = c3097l2;
                                c18338l.f35848l = Long.MIN_VALUE;
                                c18338l.f35850l = new CopyOnWriteArrayList();
                                c18338l.f35849l = new LinkedBlockingDeque();
                                c3585l = c18338l;
                            } else {
                                c3585l = new C3585l(26, c11815l);
                            }
                            c17778l.f34633l = c3585l;
                        } else {
                            list = listM4218final;
                        }
                        try {
                            if (c17778l.f34637l) {
                                throw new IOException("Canceled");
                            }
                            try {
                            } catch (IOException e15) {
                                boolean zPurchase = purchase(e15, c17778l, c8795l, c17032lLoadAd);
                                c17778l.f34630l.getClass();
                                if (!zPurchase) {
                                    byte[] bArr = AbstractC7712l.yandex;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        AbstractC11718l.yandex(e15, (Exception) it.next());
                                    }
                                    throw e15;
                                }
                                listM4218final = AbstractC16901l.m4218final(e15, list);
                                c17778l.admob(true);
                                z11 = false;
                            }
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z8 = true;
                        }
                        c17778l.admob(z8);
                        throw th;
                    }
                    C10049l c10049lYandex9 = c8795l.loadAd(c17032lLoadAd).yandex();
                    c10049lYandex9.yandex = c17032lLoadAd;
                    c10049lYandex9.firebase = c18389l != null ? AbstractC9592l.crashlytics(c18389l) : null;
                    C18389l c18389lYandex3 = c10049lYandex9.yandex();
                    C4619l c4619l2 = c17778l.f34632l;
                    c17032lLoadAd = loadAd(c18389lYandex3, c4619l2, c8795l);
                    try {
                        if (c17032lLoadAd == null) {
                            if (c4619l2 != null && c4619l2.f9370l) {
                                if (c17778l.f34635l) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                c17778l.f34635l = true;
                                c17778l.f34634l.subs();
                            }
                            c17778l.f34630l.getClass();
                            z9 = false;
                        } else {
                            AbstractC10033l abstractC10033l3 = c17032lLoadAd.amazon;
                            if (abstractC10033l3 == null || !abstractC10033l3.billing()) {
                                AbstractC7712l.loadAd(c18389lYandex3.f35907l);
                                int i7 = i2 + 1;
                                AbstractC17567l abstractC17567l = c17778l.f34630l;
                                if (i7 > 20) {
                                    abstractC17567l.getClass();
                                    throw new ProtocolException("Too many follow-up requests: " + i7);
                                }
                                abstractC17567l.getClass();
                                c17778l.admob(true);
                                c18389l = c18389lYandex3;
                                listM4218final = list;
                                i2 = i7;
                            } else {
                                c17778l.f34630l.getClass();
                                z9 = false;
                            }
                        }
                        c17778l.admob(z9);
                        return c18389lYandex3;
                    } catch (Throwable th2) {
                        th = th2;
                        z8 = false;
                    }
                }
                break;
        }
    }
}
