package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lۣؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0674l {
    public static final HashMap admob;
    public static final C18252l billing;
    public static final C15053l isPro;
    public static final C17294l mopub;
    public static final C0674l subs;
    public String amazon;
    public final C18252l crashlytics;
    public final String loadAd;
    public int purchase;
    public final String yandex;

    static {
        C18252l c18252l;
        String strAdmob = AbstractC11452l.admob(StandardCharsets.UTF_8.name());
        AbstractC12832l.yandex("charset", strAdmob);
        C6756l c6756lYandex = C6756l.yandex();
        AbstractC3594l abstractC3594lAds = (AbstractC3594l) c6756lYandex.get("charset");
        if (abstractC3594lAds == null) {
            abstractC3594lAds = AbstractC1186l.ads(4);
            c6756lYandex.put("charset", abstractC3594lAds);
        }
        abstractC3594lAds.yandex(strAdmob);
        Collection collectionEntrySet = c6756lYandex.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            c18252l = C7528l.f15532l;
        } else {
            C11320l<Map.Entry> c11320l = (C11320l) collectionEntrySet;
            C13698l c13698l = new C13698l(c11320l.f22812l.size(), 11);
            int i = 0;
            for (Map.Entry entry : c11320l) {
                Object key = entry.getKey();
                C13708l c13708lMopub = ((C16971l) entry.getValue()).mopub();
                c13698l.mo3668catch(key, c13708lMopub);
                i += c13708lMopub.f26765l;
            }
            c18252l = new C18252l(c13698l.metrica(true), i);
        }
        billing = c18252l;
        C16219l c16219l = C16219l.f31751l;
        C16219l c16219l2 = C16219l.f31750l;
        c16219l2.getClass();
        C14204l c14204l = new C14204l(c16219l2);
        c16219l.getClass();
        mopub = new C17294l(new C17294l(new C17294l(c16219l, c14204l), new C4256l(' ', 1)), AbstractC8791l.loadAd("()<>@,;:\\\"/[]?=").amazon());
        AbstractC8791l.loadAd("\"\\\r").amazon().getClass();
        AbstractC8791l.loadAd(" \t\r\n");
        admob = new HashMap();
        yandex("*", "*");
        yandex("text", "*");
        yandex("image", "*");
        yandex("audio", "*");
        yandex("video", "*");
        yandex("application", "*");
        yandex("font", "*");
        loadAd("text", "cache-manifest");
        loadAd("text", "css");
        loadAd("text", "csv");
        loadAd("text", "html");
        loadAd("text", "calendar");
        loadAd("text", "markdown");
        loadAd("text", "plain");
        loadAd("text", "javascript");
        loadAd("text", "tab-separated-values");
        loadAd("text", "vcard");
        loadAd("text", "vnd.wap.wml");
        loadAd("text", "xml");
        loadAd("text", "vtt");
        yandex("image", "bmp");
        yandex("image", "x-canon-crw");
        yandex("image", "gif");
        yandex("image", "vnd.microsoft.icon");
        yandex("image", "jpeg");
        yandex("image", "png");
        yandex("image", "vnd.adobe.photoshop");
        loadAd("image", "svg+xml");
        yandex("image", "tiff");
        yandex("image", "webp");
        yandex("image", "heif");
        yandex("image", "jp2");
        yandex("audio", "mp4");
        yandex("audio", "mpeg");
        yandex("audio", "ogg");
        yandex("audio", "webm");
        yandex("audio", "l16");
        yandex("audio", "l24");
        yandex("audio", "basic");
        yandex("audio", "aac");
        yandex("audio", "vorbis");
        yandex("audio", "x-ms-wma");
        yandex("audio", "x-ms-wax");
        yandex("audio", "vnd.rn-realaudio");
        yandex("audio", "vnd.wave");
        yandex("video", "mp4");
        yandex("video", "mpeg");
        yandex("video", "ogg");
        yandex("video", "quicktime");
        yandex("video", "webm");
        yandex("video", "x-ms-wmv");
        yandex("video", "x-flv");
        yandex("video", "3gpp");
        yandex("video", "3gpp2");
        loadAd("application", "xml");
        loadAd("application", "atom+xml");
        yandex("application", "x-bzip2");
        loadAd("application", "dart");
        yandex("application", "vnd.apple.pkpass");
        yandex("application", "vnd.ms-fontobject");
        yandex("application", "epub+zip");
        yandex("application", "x-www-form-urlencoded");
        yandex("application", "pkcs12");
        yandex("application", "binary");
        yandex("application", "geo+json");
        yandex("application", "x-gzip");
        yandex("application", "hal+json");
        loadAd("application", "javascript");
        yandex("application", "jose");
        yandex("application", "jose+json");
        subs = loadAd("application", "json");
        yandex("application", "jwt");
        loadAd("application", "manifest+json");
        yandex("application", "vnd.google-earth.kml+xml");
        yandex("application", "vnd.google-earth.kmz");
        yandex("application", "mbox");
        yandex("application", "x-apple-aspen-config");
        yandex("application", "vnd.ms-excel");
        yandex("application", "vnd.ms-outlook");
        yandex("application", "vnd.ms-powerpoint");
        yandex("application", "msword");
        yandex("application", "dash+xml");
        yandex("application", "wasm");
        yandex("application", "x-nacl");
        yandex("application", "x-pnacl");
        yandex("application", "octet-stream");
        yandex("application", "ogg");
        yandex("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        yandex("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        yandex("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        yandex("application", "vnd.oasis.opendocument.graphics");
        yandex("application", "vnd.oasis.opendocument.presentation");
        yandex("application", "vnd.oasis.opendocument.spreadsheet");
        yandex("application", "vnd.oasis.opendocument.text");
        loadAd("application", "opensearchdescription+xml");
        yandex("application", "pdf");
        yandex("application", "postscript");
        yandex("application", "protobuf");
        loadAd("application", "rdf+xml");
        loadAd("application", "rtf");
        yandex("application", "font-sfnt");
        yandex("application", "x-shockwave-flash");
        yandex("application", "vnd.sketchup.skp");
        loadAd("application", "soap+xml");
        yandex("application", "x-tar");
        yandex("application", "font-woff");
        yandex("application", "font-woff2");
        loadAd("application", "xhtml+xml");
        loadAd("application", "xrd+xml");
        yandex("application", "zip");
        yandex("font", "collection");
        yandex("font", "otf");
        yandex("font", "sfnt");
        yandex("font", "ttf");
        yandex("font", "woff");
        yandex("font", "woff2");
        isPro = new C15053l(new C1693l("; "));
    }

    public C0674l(String str, String str2, C18252l c18252l) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = c18252l;
    }

    public static C0674l loadAd(String str, String str2) {
        C0674l c0674l = new C0674l(str, str2, billing);
        admob.put(c0674l, c0674l);
        AbstractC17238l.amazon(StandardCharsets.UTF_8);
        return c0674l;
    }

    public static void yandex(String str, String str2) {
        C0674l c0674l = new C0674l(str, str2, C7528l.f15532l);
        admob.put(c0674l, c0674l);
    }

    public final C5615l crashlytics() {
        return new C5615l(this.crashlytics.admob(), new C3585l(18, new C2922l(12)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0674l)) {
            return false;
        }
        C0674l c0674l = (C0674l) obj;
        return this.yandex.equals(c0674l.yandex) && this.loadAd.equals(c0674l.loadAd) && crashlytics().equals(c0674l.crashlytics());
    }

    public final int hashCode() {
        int i = this.purchase;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.yandex, this.loadAd, crashlytics()});
        this.purchase = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.amazon;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append('/');
        sb.append(this.loadAd);
        C18252l c18252l = this.crashlytics;
        if (c18252l.f35760l != 0) {
            sb.append("; ");
            Collection collectionMopub = new C0353l(c18252l, new C3585l(18, new C2922l(11))).mopub();
            C15053l c15053l = isPro;
            c15053l.getClass();
            try {
                c15053l.isPro(sb, collectionMopub.iterator());
            } catch (IOException e) {
                C8339l.subs(e);
                return null;
            }
        }
        String string = sb.toString();
        this.amazon = string;
        return string;
    }
}
