package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؑۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0548l {
    public static final C3844l loadAd;
    public static final C3844l yandex;

    static {
        C3844l c3844l = new C3844l("\"\\".getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = "\"\\";
        yandex = c3844l;
        C3844l c3844l2 = new C3844l("\t ,=".getBytes(AbstractC9050l.yandex));
        c3844l2.f7951l = "\t ,=";
        loadAd = c3844l2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public static final void amazon(C13863l c13863l, C6705l c6705l, C8309l c8309l) {
        C17335l c17335l;
        long j;
        if (c13863l == C13863l.f27115l) {
            return;
        }
        Pattern pattern = C17335l.firebase;
        List listSmaato = c8309l.smaato("Set-Cookie");
        int size = listSmaato.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listSmaato.get(i);
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int iPurchase = AbstractC7712l.purchase(str, ';', 0, 0, 6);
            char c2 = '=';
            int iPurchase2 = AbstractC7712l.purchase(str, '=', 0, iPurchase, 2);
            if (iPurchase2 == iPurchase) {
                c17335l = null;
                break;
            }
            String strStartapp = AbstractC7712l.startapp(0, iPurchase2, str);
            if (strStartapp.length() == 0 || AbstractC7712l.mopub(strStartapp) != -1) {
                c17335l = null;
                break;
            }
            String strStartapp2 = AbstractC7712l.startapp(iPurchase2 + 1, iPurchase, str);
            if (AbstractC7712l.mopub(strStartapp2) == -1) {
                int i2 = iPurchase + 1;
                int length = str.length();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                long j2 = -1;
                long jAmazon = 253402300799999L;
                String strSubstring = null;
                String str2 = null;
                boolean z4 = true;
                String str3 = null;
                while (true) {
                    if (i2 >= length) {
                        if (j2 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j2 != -1) {
                            long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                            j = (j3 < jCurrentTimeMillis || j3 > 253402300799999L) ? 253402300799999L : j3;
                        } else {
                            j = jAmazon;
                        }
                        String str4 = c6705l.amazon;
                        if (str2 == null) {
                            str2 = str4;
                        } else if (!AbstractC8576l.yandex(str4, str2) && (!AbstractC16648l.Signature(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || AbstractC3623l.yandex.amazon(str4))) {
                            break;
                        }
                        if (str4.length() == str2.length() || C2127l.amazon.yandex(str2) != null) {
                            if (strSubstring == null || !AbstractC16648l.isVip(strSubstring, "/", false)) {
                                String strLoadAd = c6705l.loadAd();
                                int iM3343switch = AbstractC12024l.m3343switch(strLoadAd, '/', 0, 6);
                                strSubstring = iM3343switch != 0 ? strLoadAd.substring(0, iM3343switch) : "/";
                            }
                            c17335l = new C17335l(strStartapp, strStartapp2, j, str2, strSubstring, z3, z, z2, z4, str3);
                            break;
                        }
                    } else {
                        int iAmazon = AbstractC7712l.amazon(str, c, i2, length);
                        int iAmazon2 = AbstractC7712l.amazon(str, c2, i2, iAmazon);
                        String strStartapp3 = AbstractC7712l.startapp(i2, iAmazon2, str);
                        String strStartapp4 = iAmazon2 < iAmazon ? AbstractC7712l.startapp(iAmazon2 + 1, iAmazon, str) : "";
                        if (strStartapp3.equalsIgnoreCase("expires")) {
                            try {
                                jAmazon = AbstractC14879l.amazon(strStartapp4.length(), strStartapp4);
                                z2 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strStartapp3.equalsIgnoreCase("max-age")) {
                            try {
                                j2 = Long.parseLong(strStartapp4);
                                if (j2 <= 0) {
                                    j2 = Long.MIN_VALUE;
                                }
                            } catch (NumberFormatException e) {
                                if (!Pattern.compile("-?\\d+").matcher(strStartapp4).matches()) {
                                    throw e;
                                }
                                j2 = AbstractC16648l.isVip(strStartapp4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            z2 = true;
                        } else if (strStartapp3.equalsIgnoreCase("domain")) {
                            if (AbstractC16648l.Signature(strStartapp4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strLoadAd2 = AbstractC3623l.loadAd(AbstractC12024l.m3334new(strStartapp4, "."));
                            if (strLoadAd2 == null) {
                                throw new IllegalArgumentException();
                            }
                            str2 = strLoadAd2;
                            z4 = false;
                        } else if (strStartapp3.equalsIgnoreCase("path")) {
                            strSubstring = strStartapp4;
                        } else if (strStartapp3.equalsIgnoreCase("secure")) {
                            z3 = true;
                        } else if (strStartapp3.equalsIgnoreCase("httponly")) {
                            z = true;
                        } else if (strStartapp3.equalsIgnoreCase("samesite")) {
                            str3 = strStartapp4;
                        }
                        i2 = iAmazon + 1;
                        c = ';';
                        c2 = '=';
                    }
                }
            }
            c17335l = null;
            break;
            if (c17335l != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c17335l);
            }
        }
        List listUnmodifiableList = arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : null;
        if (listUnmodifiableList == null) {
            listUnmodifiableList = C2580l.f5619l;
        }
        listUnmodifiableList.isEmpty();
    }

    public static final String crashlytics(C0869l c0869l) {
        long jSignatures = c0869l.signatures(0L, loadAd);
        if (jSignatures == -1) {
            jSignatures = c0869l.f2526l;
        }
        if (jSignatures != 0) {
            return c0869l.mo712l(jSignatures, AbstractC9050l.yandex);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[LOOP:3: B:40:0x00a5->B:49:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0101 A[EDGE_INSN: B:76:0x0101->B:64:0x0101 BREAK  A[LOOP:2: B:22:0x006a->B:63:0x00fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b1 A[SYNTHETIC] */
    public static final void loadAd(C0869l c0869l, ArrayList arrayList) {
        String strCrashlytics;
        long j;
        C0869l c0869l2;
        long jSignatures;
        while (true) {
            String strCrashlytics2 = null;
            while (true) {
                if (strCrashlytics2 == null) {
                    purchase(c0869l);
                    strCrashlytics2 = crashlytics(c0869l);
                    if (strCrashlytics2 == null) {
                        return;
                    }
                }
                boolean zPurchase = purchase(c0869l);
                String strCrashlytics3 = crashlytics(c0869l);
                if (strCrashlytics3 == null) {
                    if (c0869l.subs()) {
                        arrayList.add(new C5999l(strCrashlytics2, C14054l.f27396l));
                        return;
                    }
                    return;
                }
                int iVip = AbstractC7712l.vip(c0869l);
                boolean zPurchase2 = purchase(c0869l);
                if (zPurchase || !(zPurchase2 || c0869l.subs())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iVip2 = AbstractC7712l.vip(c0869l) + iVip;
                    while (true) {
                        if (strCrashlytics3 != null) {
                            if (iVip2 != 0) {
                                break;
                                break;
                            }
                            if (iVip2 <= 1) {
                                return;
                            }
                            if (c0869l.subs()) {
                                strCrashlytics = crashlytics(c0869l);
                            } else {
                                j = 0;
                                if (c0869l.ads(0L) == 34) {
                                    strCrashlytics = crashlytics(c0869l);
                                } else {
                                    if (c0869l.readByte() == 34) {
                                        C8339l.metrica("Failed requirement.");
                                        return;
                                    }
                                    c0869l2 = new C0869l();
                                    while (true) {
                                        jSignatures = c0869l.signatures(j, yandex);
                                        if (jSignatures != -1) {
                                            if (c0869l.ads(jSignatures) == 34) {
                                                c0869l2.mo390break(c0869l, jSignatures);
                                                c0869l.readByte();
                                                strCrashlytics = c0869l2.m703continue();
                                                break;
                                            } else if (c0869l.f2526l == jSignatures + 1) {
                                                c0869l2.mo390break(c0869l, jSignatures);
                                                c0869l.readByte();
                                                c0869l2.mo390break(c0869l, 1L);
                                                j = 0;
                                            }
                                        }
                                        strCrashlytics = null;
                                        break;
                                    }
                                }
                            }
                            if (strCrashlytics != null) {
                                return;
                            }
                            if (purchase(c0869l)) {
                            }
                            strCrashlytics3 = null;
                        } else {
                            strCrashlytics3 = crashlytics(c0869l);
                            if (!purchase(c0869l)) {
                                iVip2 = AbstractC7712l.vip(c0869l);
                                if (iVip2 != 0) {
                                    break;
                                }
                                if (iVip2 <= 1 || purchase(c0869l)) {
                                    return;
                                }
                                if (c0869l.subs()) {
                                    j = 0;
                                    if (c0869l.ads(0L) == 34) {
                                        strCrashlytics = crashlytics(c0869l);
                                    } else {
                                        if (c0869l.readByte() == 34) {
                                            C8339l.metrica("Failed requirement.");
                                            return;
                                        }
                                        c0869l2 = new C0869l();
                                        while (true) {
                                            jSignatures = c0869l.signatures(j, yandex);
                                            if (jSignatures != -1) {
                                                if (c0869l.ads(jSignatures) == 34) {
                                                    c0869l2.mo390break(c0869l, jSignatures);
                                                    c0869l.readByte();
                                                    strCrashlytics = c0869l2.m703continue();
                                                    break;
                                                } else if (c0869l.f2526l == jSignatures + 1) {
                                                    c0869l2.mo390break(c0869l, jSignatures);
                                                    c0869l.readByte();
                                                    c0869l2.mo390break(c0869l, 1L);
                                                    j = 0;
                                                }
                                            }
                                            strCrashlytics = null;
                                            break;
                                        }
                                    }
                                } else {
                                    strCrashlytics = crashlytics(c0869l);
                                }
                                if (strCrashlytics != null || ((String) linkedHashMap.put(strCrashlytics3, strCrashlytics)) != null) {
                                    return;
                                }
                                if (purchase(c0869l) && !c0869l.subs()) {
                                    return;
                                } else {
                                    strCrashlytics3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new C5999l(strCrashlytics2, linkedHashMap));
                    strCrashlytics2 = strCrashlytics3;
                } else {
                    StringBuilder sbAd = AbstractC5020l.ad(strCrashlytics3);
                    sbAd.append(AbstractC16648l.ad(iVip, "="));
                    arrayList.add(new C5999l(strCrashlytics2, Collections.singletonMap(null, sbAd.toString())));
                }
            }
        }
    }

    public static final boolean purchase(C0869l c0869l) {
        boolean z = false;
        while (!c0869l.subs()) {
            byte bAds = c0869l.ads(0L);
            if (bAds != 44) {
                if (bAds != 32 && bAds != 9) {
                    break;
                }
                c0869l.readByte();
            } else {
                c0869l.readByte();
                z = true;
            }
        }
        return z;
    }

    public static final boolean yandex(C18389l c18389l) {
        if (AbstractC8576l.yandex(c18389l.f35911l.loadAd, "HEAD")) {
            return false;
        }
        int i = c18389l.f35915l;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC11432l.purchase(c18389l) != -1) {
            return true;
        }
        String strAmazon = c18389l.f35918l.amazon("Transfer-Encoding");
        if (strAmazon == null) {
            strAmazon = null;
        }
        return "chunked".equalsIgnoreCase(strAmazon);
    }
}
