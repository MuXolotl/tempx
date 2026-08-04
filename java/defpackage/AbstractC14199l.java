package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٓٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14199l {
    public static final Map loadAd;
    public static final C18464l[] yandex;

    static {
        C18464l c18464l = new C18464l(C18464l.subs, "");
        C3844l c3844l = C18464l.billing;
        C18464l c18464l2 = new C18464l(c3844l, "GET");
        C18464l c18464l3 = new C18464l(c3844l, "POST");
        C3844l c3844l2 = C18464l.mopub;
        C18464l c18464l4 = new C18464l(c3844l2, "/");
        C18464l c18464l5 = new C18464l(c3844l2, "/index.html");
        C3844l c3844l3 = C18464l.admob;
        C18464l c18464l6 = new C18464l(c3844l3, "http");
        C18464l c18464l7 = new C18464l(c3844l3, "https");
        C3844l c3844l4 = C18464l.purchase;
        C18464l[] c18464lArr = {c18464l, c18464l2, c18464l3, c18464l4, c18464l5, c18464l6, c18464l7, new C18464l(c3844l4, "200"), new C18464l(c3844l4, "204"), new C18464l(c3844l4, "206"), new C18464l(c3844l4, "304"), new C18464l(c3844l4, "400"), new C18464l(c3844l4, "404"), new C18464l(c3844l4, "500"), new C18464l("accept-charset", ""), new C18464l("accept-encoding", "gzip, deflate"), new C18464l("accept-language", ""), new C18464l("accept-ranges", ""), new C18464l("accept", ""), new C18464l("access-control-allow-origin", ""), new C18464l("age", ""), new C18464l("allow", ""), new C18464l("authorization", ""), new C18464l("cache-control", ""), new C18464l("content-disposition", ""), new C18464l("content-encoding", ""), new C18464l("content-language", ""), new C18464l("content-length", ""), new C18464l("content-location", ""), new C18464l("content-range", ""), new C18464l("content-type", ""), new C18464l("cookie", ""), new C18464l("date", ""), new C18464l("etag", ""), new C18464l("expect", ""), new C18464l("expires", ""), new C18464l("from", ""), new C18464l("host", ""), new C18464l("if-match", ""), new C18464l("if-modified-since", ""), new C18464l("if-none-match", ""), new C18464l("if-range", ""), new C18464l("if-unmodified-since", ""), new C18464l("last-modified", ""), new C18464l("link", ""), new C18464l("location", ""), new C18464l("max-forwards", ""), new C18464l("proxy-authenticate", ""), new C18464l("proxy-authorization", ""), new C18464l("range", ""), new C18464l("referer", ""), new C18464l("refresh", ""), new C18464l("retry-after", ""), new C18464l("server", ""), new C18464l("set-cookie", ""), new C18464l("strict-transport-security", ""), new C18464l("transfer-encoding", ""), new C18464l("user-agent", ""), new C18464l("vary", ""), new C18464l("via", ""), new C18464l("www-authenticate", "")};
        yandex = c18464lArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c18464lArr[i].yandex)) {
                linkedHashMap.put(c18464lArr[i].yandex, Integer.valueOf(i));
            }
        }
        loadAd = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void yandex(C3844l c3844l) throws IOException {
        int iPurchase = c3844l.purchase();
        for (int i = 0; i < iPurchase; i++) {
            byte bIsPro = c3844l.isPro(i);
            if (65 <= bIsPro && bIsPro < 91) {
                C18262l.metrica("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c3844l.tapsense()));
                return;
            }
        }
    }
}
