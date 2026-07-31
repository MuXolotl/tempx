package defpackage;

import android.graphics.Rect;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lؘؗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4699l {
    public static final C3797l yandex = C3797l.appmetrica("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final C3797l loadAd = C3797l.appmetrica("id", "layers", "w", "h", "p", "u");
    public static final C3797l crashlytics = C3797l.appmetrica("list");
    public static final C3797l amazon = C3797l.appmetrica("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0045. Please report as an issue. */
    public static C10712l yandex(C3122l c3122l) throws C8413l, EOFException {
        float f;
        C10712l c10712l;
        int i;
        float f2;
        C10712l c10712l2;
        int i2;
        float f3;
        float f4;
        float fCrashlytics = AbstractC4218l.crashlytics();
        C3994l c3994l = new C3994l((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        C18152l c18152l = new C18152l(0);
        C10712l c10712l3 = new C10712l();
        c3122l.billing();
        int iSignatures = 0;
        int iSignatures2 = 0;
        float fSignatures = 0.0f;
        float fSignatures2 = 0.0f;
        float fSignatures3 = 0.0f;
        while (c3122l.ads()) {
            switch (c3122l.mo1288throw(yandex)) {
                case 0:
                    iSignatures = (int) c3122l.signatures();
                    c10712l3 = c10712l3;
                    break;
                case 1:
                    iSignatures2 = (int) c3122l.signatures();
                    c10712l3 = c10712l3;
                    break;
                case 2:
                    fSignatures2 = (float) c3122l.signatures();
                    c10712l3 = c10712l3;
                    break;
                case 3:
                    fSignatures = ((float) c3122l.signatures()) - 0.01f;
                    c10712l3 = c10712l3;
                    fCrashlytics = fCrashlytics;
                    break;
                case 4:
                    fSignatures3 = (float) c3122l.signatures();
                    c10712l3 = c10712l3;
                    fCrashlytics = fCrashlytics;
                    break;
                case 5:
                    f = fCrashlytics;
                    c10712l = c10712l3;
                    i = iSignatures2;
                    f2 = fSignatures2;
                    String[] strArrSplit = c3122l.mo1284package().split("\\.");
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    int i4 = Integer.parseInt(strArrSplit[1]);
                    int i5 = Integer.parseInt(strArrSplit[2]);
                    if (i3 < 4 || (i3 <= 4 && (i4 < 4 || (i4 <= 4 && i5 < 0)))) {
                        c10712l.yandex("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                case 6:
                    f = fCrashlytics;
                    C10712l c10712l4 = c10712l3;
                    i = iSignatures2;
                    f2 = fSignatures2;
                    c3122l.yandex();
                    int i6 = 0;
                    while (c3122l.ads()) {
                        C10712l c10712l5 = c10712l4;
                        C4913l c4913lYandex = AbstractC2751l.yandex(c3122l, c10712l5);
                        if (c4913lYandex.purchase == 3) {
                            i6++;
                        }
                        arrayList.add(c4913lYandex);
                        c3994l.subs(c4913lYandex.amazon, c4913lYandex);
                        if (i6 > 4) {
                            AbstractC17968l.loadAd("You have " + i6 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        c10712l4 = c10712l5;
                    }
                    c10712l = c10712l4;
                    c3122l.mopub();
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                case 7:
                    f = fCrashlytics;
                    i = iSignatures2;
                    f2 = fSignatures2;
                    c3122l.yandex();
                    while (c3122l.ads()) {
                        ArrayList arrayList3 = new ArrayList();
                        C3994l c3994l2 = new C3994l((Object) null);
                        c3122l.billing();
                        String strMo1284package = null;
                        String strMo1284package2 = null;
                        String strMo1284package3 = null;
                        int iInmobi = 0;
                        int iInmobi2 = 0;
                        while (c3122l.ads()) {
                            int iMo1288throw = c3122l.mo1288throw(loadAd);
                            if (iMo1288throw != 0) {
                                if (iMo1288throw == 1) {
                                    c3122l.yandex();
                                    while (c3122l.ads()) {
                                        C4913l c4913lYandex2 = AbstractC2751l.yandex(c3122l, c10712l3);
                                        c3994l2.subs(c4913lYandex2.amazon, c4913lYandex2);
                                        arrayList3.add(c4913lYandex2);
                                        c10712l3 = c10712l3;
                                    }
                                    c10712l2 = c10712l3;
                                    c3122l.mopub();
                                } else if (iMo1288throw == 2) {
                                    iInmobi = c3122l.inmobi();
                                } else if (iMo1288throw == 3) {
                                    iInmobi2 = c3122l.inmobi();
                                } else if (iMo1288throw == 4) {
                                    strMo1284package2 = c3122l.mo1284package();
                                } else if (iMo1288throw != 5) {
                                    c3122l.mo1286switch();
                                    c3122l.mo1275continue();
                                    c10712l2 = c10712l3;
                                } else {
                                    strMo1284package3 = c3122l.mo1284package();
                                }
                                c10712l3 = c10712l2;
                            } else {
                                strMo1284package = c3122l.mo1284package();
                            }
                        }
                        C10712l c10712l6 = c10712l3;
                        c3122l.vip();
                        if (strMo1284package2 != null) {
                            map2.put(strMo1284package, new C3547l(iInmobi, iInmobi2, strMo1284package, strMo1284package2, strMo1284package3));
                        } else {
                            map.put(strMo1284package, arrayList3);
                        }
                        c10712l3 = c10712l6;
                    }
                    c3122l.mopub();
                    c10712l = c10712l3;
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                case 8:
                    f = fCrashlytics;
                    int i7 = iSignatures2;
                    float f5 = fSignatures2;
                    c3122l.billing();
                    while (c3122l.ads()) {
                        if (c3122l.mo1288throw(crashlytics) != 0) {
                            c3122l.mo1286switch();
                            c3122l.mo1275continue();
                        } else {
                            c3122l.yandex();
                            while (c3122l.ads()) {
                                C3797l c3797l = AbstractC0368l.yandex;
                                c3122l.billing();
                                String strMo1284package4 = null;
                                String strMo1284package5 = null;
                                String strMo1284package6 = null;
                                while (c3122l.ads()) {
                                    i7 = i7;
                                    int iMo1288throw2 = c3122l.mo1288throw(AbstractC0368l.yandex);
                                    if (iMo1288throw2 != 0) {
                                        float f6 = f5;
                                        if (iMo1288throw2 == 1) {
                                            strMo1284package5 = c3122l.mo1284package();
                                        } else if (iMo1288throw2 == 2) {
                                            strMo1284package6 = c3122l.mo1284package();
                                        } else if (iMo1288throw2 != 3) {
                                            c3122l.mo1286switch();
                                            c3122l.mo1275continue();
                                        } else {
                                            c3122l.signatures();
                                        }
                                        f5 = f6;
                                    } else {
                                        strMo1284package4 = c3122l.mo1284package();
                                    }
                                }
                                c3122l.vip();
                                map3.put(strMo1284package5, new C4362l(strMo1284package4, strMo1284package5, strMo1284package6));
                                i7 = i7;
                            }
                            c3122l.mopub();
                        }
                    }
                    i = i7;
                    f2 = f5;
                    c3122l.vip();
                    c10712l = c10712l3;
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                case 9:
                    f = fCrashlytics;
                    i2 = iSignatures2;
                    f3 = fSignatures2;
                    c3122l.yandex();
                    while (c3122l.ads()) {
                        C3797l c3797l2 = AbstractC15369l.yandex;
                        ArrayList arrayList4 = new ArrayList();
                        c3122l.billing();
                        double dSignatures = 0.0d;
                        char cCharAt = 0;
                        String strMo1284package7 = null;
                        String strMo1284package8 = null;
                        while (c3122l.ads()) {
                            int iMo1288throw3 = c3122l.mo1288throw(AbstractC15369l.yandex);
                            if (iMo1288throw3 == 0) {
                                cCharAt = c3122l.mo1284package().charAt(0);
                            } else if (iMo1288throw3 == 1) {
                                c3122l.signatures();
                            } else if (iMo1288throw3 == 2) {
                                dSignatures = c3122l.signatures();
                            } else if (iMo1288throw3 == 3) {
                                strMo1284package7 = c3122l.mo1284package();
                            } else if (iMo1288throw3 == 4) {
                                strMo1284package8 = c3122l.mo1284package();
                            } else if (iMo1288throw3 != 5) {
                                c3122l.mo1286switch();
                                c3122l.mo1275continue();
                            } else {
                                c3122l.billing();
                                while (c3122l.ads()) {
                                    if (c3122l.mo1288throw(AbstractC15369l.loadAd) != 0) {
                                        c3122l.mo1286switch();
                                        c3122l.mo1275continue();
                                    } else {
                                        c3122l.yandex();
                                        while (c3122l.ads()) {
                                            arrayList4.add((C1075l) AbstractC14857l.yandex(c3122l, c10712l3));
                                        }
                                        c3122l.mopub();
                                    }
                                }
                                c3122l.vip();
                            }
                        }
                        c3122l.vip();
                        C2521l c2521l = new C2521l(arrayList4, cCharAt, dSignatures, strMo1284package7, strMo1284package8);
                        c18152l.purchase(c2521l.hashCode(), c2521l);
                    }
                    c3122l.mopub();
                    i = i2;
                    f2 = f3;
                    c10712l = c10712l3;
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                case 10:
                    c3122l.yandex();
                    while (c3122l.ads()) {
                        c3122l.billing();
                        String strMo1284package9 = null;
                        float fSignatures4 = 0.0f;
                        while (c3122l.ads()) {
                            int iMo1288throw4 = c3122l.mo1288throw(amazon);
                            if (iMo1288throw4 != 0) {
                                f4 = fCrashlytics;
                                if (iMo1288throw4 == 1) {
                                    fSignatures2 = fSignatures2;
                                    fSignatures4 = (float) c3122l.signatures();
                                    iSignatures2 = iSignatures2;
                                } else if (iMo1288throw4 != 2) {
                                    c3122l.mo1286switch();
                                    c3122l.mo1275continue();
                                } else {
                                    c3122l.signatures();
                                }
                            } else {
                                f4 = fCrashlytics;
                                strMo1284package9 = c3122l.mo1284package();
                            }
                            fCrashlytics = f4;
                        }
                        c3122l.vip();
                        arrayList2.add(new C13714l(strMo1284package9, fSignatures4));
                        iSignatures2 = iSignatures2;
                        fSignatures2 = fSignatures2;
                        fCrashlytics = fCrashlytics;
                    }
                    f = fCrashlytics;
                    i2 = iSignatures2;
                    f3 = fSignatures2;
                    c3122l.mopub();
                    i = i2;
                    f2 = f3;
                    c10712l = c10712l3;
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
                default:
                    c3122l.mo1286switch();
                    c3122l.mo1275continue();
                    f = fCrashlytics;
                    c10712l = c10712l3;
                    i = iSignatures2;
                    f2 = fSignatures2;
                    c10712l3 = c10712l;
                    iSignatures2 = i;
                    fCrashlytics = f;
                    fSignatures2 = f2;
                    break;
            }
        }
        float f7 = fCrashlytics;
        C10712l c10712l7 = c10712l3;
        Rect rect = new Rect(0, 0, (int) (iSignatures * f7), (int) (iSignatures2 * f7));
        float fCrashlytics2 = AbstractC4218l.crashlytics();
        c10712l7.firebase = rect;
        c10712l7.smaato = fSignatures2;
        c10712l7.remoteconfig = fSignatures;
        c10712l7.vip = fSignatures3;
        c10712l7.isPro = arrayList;
        c10712l7.subs = c3994l;
        c10712l7.crashlytics = map;
        c10712l7.amazon = map2;
        c10712l7.purchase = fCrashlytics2;
        c10712l7.admob = c18152l;
        c10712l7.billing = map3;
        c10712l7.mopub = arrayList2;
        return c10712l7;
    }
}
