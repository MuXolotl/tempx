package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَؗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10108l implements InterfaceC5329l {
    public final String loadAd;
    public final C6168l[] yandex;

    public C10108l(C6168l... c6168lArr) {
        this.yandex = c6168lArr;
        ArrayList arrayList = new ArrayList(c6168lArr.length);
        for (C6168l c6168l : c6168lArr) {
            c6168l.getClass();
            arrayList.add("gzip");
        }
        this.loadAd = AbstractC16901l.m4210case(arrayList, ", ", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC5329l
    public final C18389l yandex(C8795l c8795l) {
        C17032l c17032l = c8795l.purchase;
        if (c17032l.crashlytics.amazon("Accept-Encoding") != null) {
            return c8795l.loadAd(c17032l);
        }
        C11644l c11644lYandex = c17032l.yandex();
        ((C16543l) c11644lYandex.f23361l).signatures("Accept-Encoding", this.loadAd);
        C18389l c18389lLoadAd = c8795l.loadAd(new C17032l(c11644lYandex));
        if (AbstractC0548l.yandex(c18389lLoadAd)) {
            AbstractC6897l abstractC6897l = c18389lLoadAd.f35907l;
            String strAmazon = c18389lLoadAd.f35918l.amazon("Content-Encoding");
            if (strAmazon == null) {
                strAmazon = null;
            }
            if (strAmazon != null) {
                C6168l c6168l = this.yandex[0];
                c6168l.getClass();
                if (("gzip".equalsIgnoreCase(strAmazon) ? c6168l : null) != null) {
                    C1503l c1503l = new C1503l(new C6787l(abstractC6897l.mo1516l()));
                    C10049l c10049lYandex = c18389lLoadAd.yandex();
                    c10049lYandex.billing.ad("Content-Encoding");
                    c10049lYandex.billing.ad("Content-Length");
                    C8552l c8552l = AbstractC6897l.f14438l;
                    c10049lYandex.mopub = new C8552l(abstractC6897l.mopub(), -1L, c1503l);
                    return c10049lYandex.yandex();
                }
            }
        }
        return c18389lLoadAd;
    }
}
