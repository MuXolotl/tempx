package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُؓؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10798l implements InterfaceC5329l {
    public static C17032l loadAd(C18389l c18389l, String str) {
        C13170l c13170l;
        String strAmazon = c18389l.f35918l.amazon("Location");
        if (strAmazon == null) {
            strAmazon = null;
        }
        C17032l c17032l = c18389l.f35911l;
        if (strAmazon != null) {
            C6705l c6705l = c17032l.yandex;
            c6705l.getClass();
            try {
                c13170l = new C13170l();
                c13170l.isPro(c6705l, strAmazon);
            } catch (IllegalArgumentException unused) {
                c13170l = null;
            }
            C6705l c6705lCrashlytics = c13170l != null ? c13170l.crashlytics() : null;
            if (c6705lCrashlytics != null) {
                C11644l c11644lYandex = c17032l.yandex();
                if (AbstractC3670l.purchase(str)) {
                    int i = c18389l.f35915l;
                    boolean z = str.equals("PROPFIND") || i == 308 || i == 307;
                    if (str.equals("PROPFIND") || i == 308 || i == 307) {
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
                C6705l c6705l2 = c17032l.yandex;
                if (!AbstractC8576l.yandex(c6705l2.amazon, c6705lCrashlytics.amazon) || c6705l2.purchase != c6705lCrashlytics.purchase || !AbstractC8576l.yandex(c6705l2.yandex, c6705lCrashlytics.yandex)) {
                    c11644lYandex.m3166l("Authorization");
                }
                c11644lYandex.f23358l = c6705lCrashlytics;
                return new C17032l(c11644lYandex);
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC5329l
    public C18389l yandex(C8795l c8795l) throws IOException {
        C18389l c18389lLoadAd = c8795l.loadAd(crashlytics(c8795l.purchase));
        int i = 0;
        while (true) {
            C17032l c17032lLoadAd = null;
            if (!c8795l.yandex.f34637l) {
                String str = c18389lLoadAd.f35911l.loadAd;
                int i2 = c18389lLoadAd.f35915l;
                if (i2 != 307) {
                    if (i2 != 308) {
                        if (300 <= i2 && i2 < 304) {
                            c17032lLoadAd = loadAd(c18389lLoadAd, str);
                        }
                    } else if (AbstractC8576l.yandex(str, "GET") || AbstractC8576l.yandex(str, "HEAD")) {
                        c17032lLoadAd = loadAd(c18389lLoadAd, str);
                    }
                } else if (AbstractC8576l.yandex(str, "GET") || AbstractC8576l.yandex(str, "HEAD") || AbstractC8576l.yandex(str, "POST")) {
                    c17032lLoadAd = loadAd(c18389lLoadAd, str);
                }
                if (c17032lLoadAd != null) {
                    C17032l c17032lCrashlytics = crashlytics(c17032lLoadAd);
                    c18389lLoadAd.close();
                    c18389lLoadAd = c8795l.loadAd(c17032lCrashlytics);
                    if (i == 20) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            } else {
                C18262l.metrica("Call was canceled!");
                return null;
            }
        }
        C10049l c10049lYandex = c18389lLoadAd.yandex();
        String str2 = c18389lLoadAd.f35911l.yandex.admob;
        if (str2 == null) {
            str2 = "";
        }
        c10049lYandex.billing.loadAd("X-Req-Hash", str2);
        return c10049lYandex.yandex();
    }

    public C17032l crashlytics(C17032l c17032l) {
        return c17032l;
    }
}
