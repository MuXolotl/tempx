package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lّؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1016l implements InterfaceC6646l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16272l f2842l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9887l f2843l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final Pattern f2772l = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Pattern f2808l = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Pattern f2807l = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final Pattern f2827l = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Pattern f2773l = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Pattern f2778l = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Pattern f2824l = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final Pattern f2803l = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final Pattern f2829l = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final Pattern f2822l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final Pattern f2769l = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final Pattern f2833l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final Pattern f2806l = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final Pattern f2785l = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final Pattern f2794l = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final Pattern f2839l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final Pattern f2793l = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final Pattern f2777l = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final Pattern f2775l = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final Pattern f2768l = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final Pattern f2840l = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final Pattern f2788l = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final Pattern f2802l = yandex("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final Pattern f2817l = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final Pattern f2766l = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final Pattern f2797l = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final Pattern f2816l = yandex("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final Pattern f2837l = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final Pattern f2795l = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static final Pattern f2823l = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static final Pattern f2763l = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final Pattern f2830l = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final Pattern f2787l = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final Pattern f2804l = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final Pattern f2819l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public static final Pattern f2784l = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public static final Pattern f2767l = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public static final Pattern f2782l = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public static final Pattern f2786l = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public static final Pattern f2770l = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public static final Pattern f2789l = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lِِٞ, reason: contains not printable characters */
    public static final Pattern f2813l = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: lُؚؓ, reason: contains not printable characters */
    public static final Pattern f2796l = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: lؔؕؖ, reason: contains not printable characters */
    public static final Pattern f2774l = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: lٖ٘ۘ, reason: contains not printable characters */
    public static final Pattern f2832l = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l٘ٚؒ, reason: contains not printable characters */
    public static final Pattern f2838l = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؕۗؗ, reason: contains not printable characters */
    public static final Pattern f2781l = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؚؕؒ, reason: contains not printable characters */
    public static final Pattern f2779l = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؚۦؑ, reason: contains not printable characters */
    public static final Pattern f2800l = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lِٟ, reason: contains not printable characters */
    public static final Pattern f2814l = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: lؘٟۛ, reason: contains not printable characters */
    public static final Pattern f2792l = yandex("AUTOSELECT");

    /* JADX INFO: renamed from: lًّۥ, reason: contains not printable characters */
    public static final Pattern f2815l = yandex("DEFAULT");

    /* JADX INFO: renamed from: lٌؚ٘, reason: contains not printable characters */
    public static final Pattern f2836l = yandex("FORCED");

    /* JADX INFO: renamed from: lؑٔۦ, reason: contains not printable characters */
    public static final Pattern f2764l = yandex("INDEPENDENT");

    /* JADX INFO: renamed from: lٍۥ۟, reason: contains not printable characters */
    public static final Pattern f2809l = yandex("GAP");

    /* JADX INFO: renamed from: lٕٖٙ, reason: contains not printable characters */
    public static final Pattern f2828l = yandex("PRECISE");

    /* JADX INFO: renamed from: lٌْؔ, reason: contains not printable characters */
    public static final Pattern f2818l = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lۣؕ٘, reason: contains not printable characters */
    public static final Pattern f2780l = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lّؔ۟, reason: contains not printable characters */
    public static final Pattern f2776l = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؑۚؓ, reason: contains not printable characters */
    public static final Pattern f2765l = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٓؔۧ, reason: contains not printable characters */
    public static final Pattern f2820l = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٍٜٛ, reason: contains not printable characters */
    public static final Pattern f2805l = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lُۨ, reason: contains not printable characters */
    public static final Pattern f2812l = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٕؑٞ, reason: contains not printable characters */
    public static final Pattern f2826l = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؖٙؓ, reason: contains not printable characters */
    public static final Pattern f2783l = yandex("END-ON-NEXT");

    /* JADX INFO: renamed from: lؚٕۤ, reason: contains not printable characters */
    public static final Pattern f2798l = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؓٗؗ, reason: contains not printable characters */
    public static final Pattern f2771l = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٟٗٛ, reason: contains not printable characters */
    public static final Pattern f2835l = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lُ٘ۙ, reason: contains not printable characters */
    public static final Pattern f2841l = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؙٓۦ, reason: contains not printable characters */
    public static final Pattern f2821l = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lًؙؗ, reason: contains not printable characters */
    public static final Pattern f2801l = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؘٝؕ, reason: contains not printable characters */
    public static final Pattern f2790l = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lؚۤ۟, reason: contains not printable characters */
    public static final Pattern f2799l = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٖ٘ؕ, reason: contains not printable characters */
    public static final Pattern f2831l = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٜٔٚ, reason: contains not printable characters */
    public static final Pattern f2825l = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lًَؘ, reason: contains not printable characters */
    public static final Pattern f2810l = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: lؘٜۘ, reason: contains not printable characters */
    public static final Pattern f2791l = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: lٖٗ٘, reason: contains not printable characters */
    public static final Pattern f2834l = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: lُۢۗ, reason: contains not printable characters */
    public static final Pattern f2811l = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public C1016l(C9887l c9887l, C16272l c16272l) {
        this.f2843l = c9887l;
        this.f2842l = c16272l;
    }

    public static long admob(C14558l c14558l, String str, Pattern pattern) {
        Matcher matcherYandex = C14558l.yandex(c14558l, str, pattern);
        if (!matcherYandex.find()) {
            return -1L;
        }
        String strGroup = matcherYandex.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static defpackage.C16272l amazon(defpackage.C9887l r126, defpackage.C16272l r127, defpackage.C0554l r128, android.net.Uri r129, defpackage.C14558l r130) {
        /*
            Method dump skipped, instruction units count: 4770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1016l.amazon(lٍُۢ, lٌٍٖ, lَؑۙ, android.net.Uri, lٓۦ۠):lٌٍٖ");
    }

    public static boolean billing(C14558l c14558l, String str, Pattern pattern) {
        Matcher matcherYandex = C14558l.yandex(c14558l, str, pattern);
        if (matcherYandex.find()) {
            return "YES".equals(matcherYandex.group(1));
        }
        return false;
    }

    public static C12687l crashlytics(String str, String str2, HashMap map, C14558l c14558l) throws C17655l {
        String strIsPro = isPro(str, f2770l, "1", map, c14558l);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f2789l;
        if (zEquals) {
            String strFirebase = firebase(str, pattern, map, c14558l);
            return new C12687l(AbstractC17252l.purchase, null, "video/mp4", Base64.decode(strFirebase.substring(strFirebase.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC17252l.purchase;
            String str3 = AbstractC15323l.yandex;
            return new C12687l(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strIsPro)) {
            return null;
        }
        String strFirebase2 = firebase(str, pattern, map, c14558l);
        byte[] bArrDecode = Base64.decode(strFirebase2.substring(strFirebase2.indexOf(44)), 0);
        UUID uuid2 = AbstractC17252l.billing;
        return new C12687l(uuid2, null, "video/mp4", AbstractC14231l.crashlytics(uuid2, null, bArrDecode));
    }

    public static String firebase(String str, Pattern pattern, Map map, C14558l c14558l) throws C17655l {
        String strIsPro = isPro(str, pattern, null, map, c14558l);
        if (strIsPro != null) {
            return strIsPro;
        }
        throw C17655l.loadAd("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String isPro(String str, Pattern pattern, String str2, Map map, C14558l c14558l) {
        Matcher matcherYandex = C14558l.yandex(c14558l, str, pattern);
        if (matcherYandex.find()) {
            str2 = matcherYandex.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : smaato(str2, map, c14558l);
    }

    public static C17564l loadAd(String str, C12687l[] c12687lArr) {
        C12687l[] c12687lArr2 = new C12687l[c12687lArr.length];
        for (int i = 0; i < c12687lArr.length; i++) {
            C12687l c12687l = c12687lArr[i];
            c12687lArr2[i] = new C12687l(c12687l.f25008l, c12687l.f25007l, c12687l.f25011l, null);
        }
        return new C17564l(str, true, c12687lArr2);
    }

    public static double mopub(String str, Pattern pattern, double d, C14558l c14558l) {
        Matcher matcherYandex = C14558l.yandex(c14558l, str, pattern);
        if (!matcherYandex.find()) {
            return d;
        }
        String strGroup = matcherYandex.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x024f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:104:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x026e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0277  */
    /* JADX WARN: Code duplicated, block: B:111:0x0279  */
    /* JADX WARN: Code duplicated, block: B:113:0x0283  */
    /* JADX WARN: Code duplicated, block: B:115:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x0298  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02af  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x0314  */
    /* JADX WARN: Code duplicated, block: B:142:0x031f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0325  */
    /* JADX WARN: Code duplicated, block: B:147:0x0376  */
    /* JADX WARN: Code duplicated, block: B:197:0x0530  */
    /* JADX WARN: Code duplicated, block: B:291:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01da  */
    /* JADX WARN: Code duplicated, block: B:82:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [int] */
    /* JADX WARN: Type inference failed for: r5v69 */
    public static C9887l purchase(C0554l c0554l, Uri uri, C14558l c14558l) throws IOException {
        ?? r28;
        int i;
        ArrayList arrayList;
        C15979l c15979l;
        String strAmazon;
        char c;
        int i2;
        String str;
        C15979l c15979l2;
        String strAmazon2;
        C15979l c15979l3;
        int i3;
        int i4;
        String str2;
        String str3;
        String strAd;
        ArrayList arrayList2;
        int i5;
        int i6;
        int i7;
        int i8;
        C1591l c1591l;
        String[] strArrM3977public;
        StringBuilder sb;
        int length;
        int i9;
        String string;
        String str4;
        C1591l c1591l2;
        String strIsPro;
        int i10;
        int i11;
        String strIsPro2;
        float f;
        Uri uriApplovin;
        Uri uri2;
        ArrayList arrayList3;
        HashMap map;
        ArrayList arrayList4;
        String string2 = uri.toString();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean zM634for = c0554l.m634for();
            Pattern pattern = f2789l;
            ArrayList arrayList13 = arrayList9;
            boolean zContains = z;
            Pattern pattern2 = f2838l;
            boolean z3 = z2;
            if (!zM634for) {
                ArrayList arrayList14 = arrayList5;
                HashMap map4 = map2;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList6;
                ArrayList arrayList18 = arrayList7;
                ArrayList arrayList19 = arrayList8;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i12 = 0;
                while (i12 < arrayList14.size()) {
                    C15979l c15979l4 = (C15979l) arrayList14.get(i12);
                    Uri uri3 = c15979l4.yandex;
                    C5978l c5978l = c15979l4.loadAd;
                    if (hashSet.add(uri3)) {
                        AbstractC12442l.subscription(c5978l.smaato == null);
                        ArrayList arrayList22 = (ArrayList) map4.get(c15979l4.yandex);
                        arrayList22.getClass();
                        C7417l c7417l = new C7417l(new C3975l(null, null, arrayList22));
                        C12984l c12984lYandex = c5978l.yandex();
                        c12984lYandex.firebase = c7417l;
                        arrayList21.add(new C15979l(c15979l4.yandex, new C5978l(c12984lYandex), c15979l4.crashlytics, c15979l4.amazon, c15979l4.purchase, c15979l4.billing, c15979l4.mopub, c15979l4.admob));
                    }
                    i12++;
                    hashSet = hashSet;
                    map4 = map4;
                }
                int i13 = 0;
                ArrayList arrayList23 = null;
                C5978l c5978l2 = null;
                while (i13 < arrayList15.size()) {
                    ArrayList arrayList24 = arrayList15;
                    String str5 = (String) arrayList24.get(i13);
                    String strFirebase = firebase(str5, f2779l, map3, c14558l);
                    String strFirebase2 = firebase(str5, pattern2, map3, c14558l);
                    ArrayList arrayList25 = arrayList23;
                    ArrayList arrayList26 = arrayList21;
                    String strIsPro3 = isPro(str5, f2794l, null, map3, c14558l);
                    C12984l c12984l = new C12984l();
                    C5978l c5978l3 = c5978l2;
                    c12984l.yandex = AbstractC9361l.pro(strFirebase, ":", strFirebase2);
                    c12984l.loadAd = strFirebase2;
                    c12984l.remoteconfig = AbstractC3825l.vip("application/x-mpegURL");
                    boolean zBilling = billing(c14558l, str5, f2815l);
                    if (billing(c14558l, str5, f2836l)) {
                        r28 = zBilling;
                        r28 = (zBilling ? 1 : 0) | 2;
                    }
                    r28 = zBilling;
                    c12984l.purchase = billing(c14558l, str5, f2792l) ? r28 | 4 : r28;
                    int i14 = i13;
                    String strIsPro4 = isPro(str5, f2800l, null, map3, c14558l);
                    if (TextUtils.isEmpty(strIsPro4)) {
                        arrayList15 = arrayList24;
                        i = 0;
                    } else {
                        String str6 = AbstractC15323l.yandex;
                        String[] strArrSplit = strIsPro4.split(",", -1);
                        i = AbstractC15323l.remoteconfig("public.accessibility.describes-video", strArrSplit) ? AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE : 0;
                        arrayList15 = arrayList24;
                        if (AbstractC15323l.remoteconfig("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i |= 4096;
                        }
                        if (AbstractC15323l.remoteconfig("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i |= 1024;
                        }
                        if (AbstractC15323l.remoteconfig("public.easy-to-read", strArrSplit)) {
                            i |= 8192;
                        }
                    }
                    c12984l.billing = i;
                    c12984l.amazon = isPro(str5, f2832l, null, map3, c14558l);
                    String strIsPro5 = isPro(str5, pattern, null, map3, c14558l);
                    Uri uriApplovin2 = strIsPro5 == null ? null : AbstractC12442l.applovin(string2, strIsPro5);
                    String str7 = string2;
                    Pattern pattern3 = pattern;
                    C7417l c7417l2 = new C7417l(new C3975l(strFirebase, strFirebase2, Collections.EMPTY_LIST));
                    switch (firebase(str5, f2796l, map3, c14558l)) {
                        case "SUBTITLES":
                            arrayList = arrayList17;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList14.size()) {
                                    c15979l = (C15979l) arrayList14.get(i15);
                                    if (!strFirebase.equals(c15979l.purchase)) {
                                        i15++;
                                    }
                                } else {
                                    c15979l = null;
                                }
                            }
                            if (c15979l != null) {
                                String strAd2 = AbstractC15323l.ad(3, c15979l.loadAd.firebase);
                                c12984l.isPro = strAd2;
                                strAmazon = AbstractC3825l.amazon(strAd2);
                            } else {
                                strAmazon = null;
                            }
                            if (strAmazon == null) {
                                strAmazon = "text/vtt";
                            }
                            c12984l.vip = AbstractC3825l.vip(strAmazon);
                            c12984l.firebase = c7417l2;
                            if (uriApplovin2 != null) {
                                arrayList19 = arrayList19;
                                arrayList19.add(new C4389l(uriApplovin2, new C5978l(c12984l), strFirebase2, strIsPro3));
                            } else {
                                arrayList19 = arrayList19;
                                AbstractC6427l.vip("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList23 = arrayList25;
                            c5978l2 = c5978l3;
                            break;
                        case "CLOSED-CAPTIONS":
                            ArrayList arrayList27 = arrayList18;
                            arrayList = arrayList17;
                            String strFirebase3 = firebase(str5, f2814l, map3, c14558l);
                            if (strFirebase3.startsWith("CC")) {
                                i2 = Integer.parseInt(strFirebase3.substring(2));
                                str = "application/cea-608";
                                c = 7;
                            } else {
                                c = 7;
                                i2 = Integer.parseInt(strFirebase3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList28 = arrayList25 == null ? new ArrayList() : arrayList25;
                            c12984l.vip = AbstractC3825l.vip(str);
                            c12984l.f25441native = i2;
                            arrayList28.add(new C5978l(c12984l));
                            arrayList18 = arrayList27;
                            arrayList23 = arrayList28;
                            arrayList19 = arrayList19;
                            c5978l2 = c5978l3;
                            break;
                        case "AUDIO":
                            arrayList = arrayList17;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList14.size()) {
                                    c15979l2 = (C15979l) arrayList14.get(i16);
                                    int i17 = i16;
                                    if (!strFirebase.equals(c15979l2.amazon)) {
                                        i16 = i17 + 1;
                                    }
                                } else {
                                    c15979l2 = null;
                                }
                            }
                            if (c15979l2 != null) {
                                String strAd3 = AbstractC15323l.ad(1, c15979l2.loadAd.firebase);
                                c12984l.isPro = strAd3;
                                strAmazon2 = AbstractC3825l.amazon(strAd3);
                            } else {
                                strAmazon2 = null;
                            }
                            C15979l c15979l5 = c15979l2;
                            String strIsPro6 = isPro(str5, f2824l, null, map3, c14558l);
                            if (strIsPro6 != null) {
                                String str8 = AbstractC15323l.yandex;
                                c12984l.f25447throws = Integer.parseInt(strIsPro6.split("/", 2)[0]);
                                if ("audio/eac3".equals(strAmazon2) && strIsPro6.endsWith("/JOC")) {
                                    c12984l.isPro = "ec+3";
                                    strAmazon2 = "audio/eac3-joc";
                                }
                            }
                            c12984l.vip = AbstractC3825l.vip(strAmazon2);
                            if (uriApplovin2 == null) {
                                ArrayList arrayList29 = arrayList18;
                                if (c15979l5 != null) {
                                    c5978l2 = new C5978l(c12984l);
                                    arrayList18 = arrayList29;
                                    arrayList19 = arrayList19;
                                    arrayList23 = arrayList25;
                                } else {
                                    arrayList18 = arrayList29;
                                }
                                break;
                            } else {
                                c12984l.firebase = c7417l2;
                                arrayList18.add(new C4389l(uriApplovin2, new C5978l(c12984l), strFirebase2, strIsPro3));
                            }
                            arrayList23 = arrayList25;
                            c5978l2 = c5978l3;
                            break;
                        case "VIDEO":
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList14.size()) {
                                    c15979l3 = (C15979l) arrayList14.get(i18);
                                    if (!strFirebase.equals(c15979l3.crashlytics)) {
                                        i18++;
                                    }
                                } else {
                                    c15979l3 = null;
                                }
                            }
                            if (c15979l3 != null) {
                                C5978l c5978l4 = c15979l3.loadAd;
                                String strAd4 = AbstractC15323l.ad(2, c5978l4.firebase);
                                c12984l.isPro = strAd4;
                                c12984l.vip = AbstractC3825l.vip(AbstractC3825l.amazon(strAd4));
                                c12984l.Signature = c5978l4.license;
                                c12984l.license = c5978l4.pro;
                                c12984l.advert = c5978l4.isVip;
                            }
                            if (uriApplovin2 != null) {
                                c12984l.firebase = c7417l2;
                                arrayList = arrayList17;
                                arrayList.add(new C4389l(uriApplovin2, new C5978l(c12984l), strFirebase2, strIsPro3));
                            }
                            arrayList23 = arrayList25;
                            c5978l2 = c5978l3;
                        default:
                            arrayList = arrayList17;
                            arrayList23 = arrayList25;
                            c5978l2 = c5978l3;
                            break;
                    }
                    i13 = i14 + 1;
                    arrayList17 = arrayList;
                    arrayList19 = arrayList19;
                    arrayList21 = arrayList26;
                    string2 = str7;
                    pattern = pattern3;
                }
                return new C9887l(uri.toString(), arrayList16, arrayList21, arrayList17, arrayList18, arrayList19, arrayList13, c5978l2, zContains ? Collections.EMPTY_LIST : arrayList23, z3, map3, arrayList20);
            }
            String strM643throw = c0554l.m643throw();
            ArrayList arrayList30 = arrayList8;
            if (strM643throw.startsWith("#EXT")) {
                arrayList12.add(strM643throw);
            }
            boolean zStartsWith = strM643throw.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList31 = arrayList12;
            if (strM643throw.startsWith("#EXT-X-DEFINE")) {
                String strIsPro7 = isPro(strM643throw, pattern2, null, map3, c14558l);
                if (strIsPro7 != null) {
                    remoteconfig(strIsPro7, map3);
                    map3.put(strIsPro7, firebase(strM643throw, f2818l, map3, c14558l));
                } else {
                    String strFirebase4 = firebase(strM643throw, f2781l, map3, c14558l);
                    remoteconfig(strFirebase4, map3);
                    String queryParameter = uri.getQueryParameter(strFirebase4);
                    if (queryParameter == null) {
                        throw C17655l.loadAd("QUERYPARAM \"" + strFirebase4 + "\" not found in playlist URI");
                    }
                    map3.put(strFirebase4, queryParameter);
                }
            } else {
                if (strM643throw.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    ArrayList arrayList32 = arrayList5;
                    map = map2;
                    arrayList3 = arrayList32;
                    arrayList10 = arrayList10;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList11 = arrayList11;
                    z = zContains;
                    z2 = true;
                } else if (strM643throw.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strM643throw);
                } else if (strM643throw.startsWith("#EXT-X-SESSION-KEY")) {
                    C12687l c12687lCrashlytics = crashlytics(strM643throw, isPro(strM643throw, f2786l, "identity", map3, c14558l), map3, c14558l);
                    if (c12687lCrashlytics != null) {
                        String strFirebase5 = firebase(strM643throw, f2782l, map3, c14558l);
                        arrayList11.add(new C17564l(("SAMPLE-AES-CENC".equals(strFirebase5) || "SAMPLE-AES-CTR".equals(strFirebase5)) ? "cenc" : "cbcs", true, c12687lCrashlytics));
                    }
                } else {
                    if (strM643throw.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strM643throw.contains("CLOSED-CAPTIONS=NONE");
                        int i19 = zStartsWith ? 16384 : 0;
                        int i20 = Integer.parseInt(firebase(strM643throw, f2778l, Collections.EMPTY_MAP, c14558l));
                        Matcher matcherYandex = C14558l.yandex(c14558l, strM643throw, f2772l);
                        if (matcherYandex.find()) {
                            String strGroup = matcherYandex.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strIsPro8 = isPro(strM643throw, f2803l, null, map3, c14558l);
                        String strIsPro9 = isPro(strM643throw, f2829l, null, map3, c14558l);
                        String strIsPro10 = isPro(strM643throw, f2822l, null, map3, c14558l);
                        if (strIsPro10 != null) {
                            String str9 = AbstractC15323l.yandex;
                            String[] strArrSplit2 = strIsPro10.split(",", 2)[0].split("/", -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                map2 = map2;
                                i4 = 2;
                            } else {
                                i4 = 2;
                            }
                            strAd = AbstractC15323l.ad(i4, strIsPro9);
                            if (AbstractC3825l.isPro(strAd, str2)) {
                                if (str2 == null) {
                                    arrayList2 = arrayList5;
                                } else {
                                    if (strIsPro8 != null || str3 == null) {
                                        arrayList2 = arrayList5;
                                    } else {
                                        arrayList2 = arrayList5;
                                        if ((!strIsPro8.equals("PQ") || str3.equals("db1p")) && ((!strIsPro8.equals("SDR") || str3.equals("db2g")) && (!strIsPro8.equals("HLG") || str3.startsWith("db4")))) {
                                        }
                                    }
                                    c1591l2 = null;
                                }
                                if (strIsPro9 == null && AbstractC3825l.isPro(strIsPro9, str2)) {
                                    i5 = 6;
                                    if (!strIsPro9.startsWith("dvhe") || strIsPro9.startsWith("dvh1") || strIsPro9.startsWith("dav1")) {
                                        i6 = 6;
                                        i7 = -1;
                                        i8 = 1;
                                    } else if (str3 == null) {
                                        i7 = -1;
                                        i5 = -1;
                                        i8 = -1;
                                        i6 = -1;
                                    } else if (str3.equals("db1p")) {
                                        i6 = 6;
                                        i7 = -1;
                                        i8 = 2;
                                    } else if (str3.startsWith("db4")) {
                                        i7 = -1;
                                        i8 = 2;
                                        i6 = 7;
                                    } else {
                                        i7 = -1;
                                        i5 = -1;
                                        i8 = -1;
                                        i6 = -1;
                                    }
                                    if (i5 == i7) {
                                        c1591l = null;
                                    } else {
                                        c1591l = new C1591l(i5, i8, i6, null, -1, -1);
                                    }
                                } else {
                                    c1591l = null;
                                }
                                if (str2 == null) {
                                    str2 = strAd;
                                }
                                strArrM3977public = AbstractC15323l.m3977public(strIsPro9);
                                if (strArrM3977public.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM3977public.length;
                                    i9 = 0;
                                    while (i9 < length) {
                                        str4 = strArrM3977public[i9];
                                        String[] strArr = strArrM3977public;
                                        if (2 == AbstractC3825l.admob(AbstractC3825l.amazon(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str4);
                                        }
                                        i9++;
                                        strArrM3977public = strArr;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strIsPro9 = AbstractC9361l.pro(str2, ",", string);
                                } else {
                                    strIsPro9 = str2;
                                }
                                c1591l2 = c1591l;
                            } else {
                                arrayList2 = arrayList5;
                                c1591l2 = null;
                            }
                            strIsPro = isPro(strM643throw, f2769l, null, map3, c14558l);
                            if (strIsPro != null) {
                                String[] strArrSplit3 = strIsPro.split("x", -1);
                                i11 = Integer.parseInt(strArrSplit3[0]);
                                i10 = Integer.parseInt(strArrSplit3[1]);
                                if (i11 > 0 || i10 <= 0) {
                                    i10 = -1;
                                    i11 = -1;
                                }
                            } else {
                                i10 = -1;
                                i11 = -1;
                            }
                            strIsPro2 = isPro(strM643throw, f2833l, null, map3, c14558l);
                            if (strIsPro2 != null) {
                                f = Float.parseFloat(strIsPro2);
                            } else {
                                f = -1.0f;
                            }
                            String strIsPro11 = isPro(strM643throw, f2806l, null, map3, c14558l);
                            String strIsPro12 = isPro(strM643throw, f2808l, null, map3, c14558l);
                            String strIsPro13 = isPro(strM643throw, f2807l, null, map3, c14558l);
                            String strIsPro14 = isPro(strM643throw, f2827l, null, map3, c14558l);
                            String strIsPro15 = isPro(strM643throw, f2773l, null, map3, c14558l);
                            String strIsPro16 = isPro(strM643throw, f2785l, null, map3, c14558l);
                            if (zStartsWith) {
                                uriApplovin = AbstractC12442l.applovin(string2, firebase(strM643throw, pattern, map3, c14558l));
                            } else {
                                if (c0554l.m634for()) {
                                    throw C17655l.loadAd("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriApplovin = AbstractC12442l.applovin(string2, smaato(c0554l.m643throw(), map3, c14558l));
                            }
                            uri2 = uriApplovin;
                            C12984l c12984l2 = new C12984l();
                            c12984l2.yandex = Integer.toString(arrayList2.size());
                            c12984l2.remoteconfig = AbstractC3825l.vip("application/x-mpegURL");
                            c12984l2.isPro = strIsPro9;
                            c12984l2.admob = i3;
                            c12984l2.subs = i20;
                            c12984l2.Signature = i11;
                            c12984l2.license = i10;
                            c12984l2.advert = f;
                            c12984l2.billing = i19;
                            c12984l2.appmetrica = c1591l2;
                            arrayList3 = arrayList2;
                            arrayList3.add(new C15979l(uri2, new C5978l(c12984l2), strIsPro12, strIsPro13, strIsPro14, strIsPro15, strIsPro11, strIsPro16));
                            map = map2;
                            arrayList4 = (ArrayList) map.get(uri2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri2, arrayList4);
                            }
                            arrayList4.add(new C13519l(i3, i20, strIsPro12, strIsPro13, strIsPro14, strIsPro15));
                        } else {
                            i4 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strAd = AbstractC15323l.ad(i4, strIsPro9);
                        if (AbstractC3825l.isPro(strAd, str2)) {
                            if (str2 == null) {
                                arrayList2 = arrayList5;
                            } else {
                                if (strIsPro8 != null) {
                                    arrayList2 = arrayList5;
                                } else {
                                    arrayList2 = arrayList5;
                                }
                                c1591l2 = null;
                            }
                            if (strIsPro9 == null) {
                                c1591l = null;
                            } else {
                                i5 = 6;
                                if (strIsPro9.startsWith("dvhe")) {
                                    i6 = 6;
                                    i7 = -1;
                                    i8 = 1;
                                } else {
                                    i6 = 6;
                                    i7 = -1;
                                    i8 = 1;
                                }
                                if (i5 == i7) {
                                    c1591l = null;
                                } else {
                                    c1591l = new C1591l(i5, i8, i6, null, -1, -1);
                                }
                            }
                            if (str2 == null) {
                                str2 = strAd;
                            }
                            strArrM3977public = AbstractC15323l.m3977public(strIsPro9);
                            if (strArrM3977public.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrM3977public.length;
                                i9 = 0;
                                while (i9 < length) {
                                    str4 = strArrM3977public[i9];
                                    String[] strArr2 = strArrM3977public;
                                    if (2 == AbstractC3825l.admob(AbstractC3825l.amazon(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str4);
                                    }
                                    i9++;
                                    strArrM3977public = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strIsPro9 = AbstractC9361l.pro(str2, ",", string);
                            } else {
                                strIsPro9 = str2;
                            }
                            c1591l2 = c1591l;
                        } else {
                            arrayList2 = arrayList5;
                            c1591l2 = null;
                        }
                        strIsPro = isPro(strM643throw, f2769l, null, map3, c14558l);
                        if (strIsPro != null) {
                            String[] strArrSplit4 = strIsPro.split("x", -1);
                            i11 = Integer.parseInt(strArrSplit4[0]);
                            i10 = Integer.parseInt(strArrSplit4[1]);
                            if (i11 > 0) {
                                i10 = -1;
                                i11 = -1;
                            } else {
                                i10 = -1;
                                i11 = -1;
                            }
                        } else {
                            i10 = -1;
                            i11 = -1;
                        }
                        strIsPro2 = isPro(strM643throw, f2833l, null, map3, c14558l);
                        if (strIsPro2 != null) {
                            f = Float.parseFloat(strIsPro2);
                        } else {
                            f = -1.0f;
                        }
                        String strIsPro17 = isPro(strM643throw, f2806l, null, map3, c14558l);
                        String strIsPro18 = isPro(strM643throw, f2808l, null, map3, c14558l);
                        String strIsPro19 = isPro(strM643throw, f2807l, null, map3, c14558l);
                        String strIsPro110 = isPro(strM643throw, f2827l, null, map3, c14558l);
                        String strIsPro111 = isPro(strM643throw, f2773l, null, map3, c14558l);
                        String strIsPro112 = isPro(strM643throw, f2785l, null, map3, c14558l);
                        if (zStartsWith) {
                            uriApplovin = AbstractC12442l.applovin(string2, firebase(strM643throw, pattern, map3, c14558l));
                        } else {
                            if (c0554l.m634for()) {
                                throw C17655l.loadAd("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriApplovin = AbstractC12442l.applovin(string2, smaato(c0554l.m643throw(), map3, c14558l));
                        }
                        uri2 = uriApplovin;
                        C12984l c12984l3 = new C12984l();
                        c12984l3.yandex = Integer.toString(arrayList2.size());
                        c12984l3.remoteconfig = AbstractC3825l.vip("application/x-mpegURL");
                        c12984l3.isPro = strIsPro9;
                        c12984l3.admob = i3;
                        c12984l3.subs = i20;
                        c12984l3.Signature = i11;
                        c12984l3.license = i10;
                        c12984l3.advert = f;
                        c12984l3.billing = i19;
                        c12984l3.appmetrica = c1591l2;
                        arrayList3 = arrayList2;
                        arrayList3.add(new C15979l(uri2, new C5978l(c12984l3), strIsPro18, strIsPro19, strIsPro110, strIsPro111, strIsPro17, strIsPro112));
                        map = map2;
                        arrayList4 = (ArrayList) map.get(uri2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri2, arrayList4);
                        }
                        arrayList4.add(new C13519l(i3, i20, strIsPro18, strIsPro19, strIsPro110, strIsPro111));
                    }
                    z = zContains;
                    z2 = z3;
                }
                HashMap map5 = map;
                arrayList5 = arrayList3;
                map2 = map5;
                arrayList9 = arrayList13;
                arrayList8 = arrayList30;
                arrayList12 = arrayList31;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList10;
            }
            ArrayList arrayList33 = arrayList5;
            map = map2;
            arrayList3 = arrayList33;
            arrayList11 = arrayList11;
            z = zContains;
            z2 = z3;
            HashMap map6 = map;
            arrayList5 = arrayList3;
            map2 = map6;
            arrayList9 = arrayList13;
            arrayList8 = arrayList30;
            arrayList12 = arrayList31;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList10;
        }
    }

    public static void remoteconfig(String str, HashMap map) throws C17655l {
        if (map.containsKey(str)) {
            throw C17655l.loadAd("duplicate variable name \"" + str + "\"");
        }
    }

    public static String smaato(String str, Map map, C14558l c14558l) {
        Matcher matcherYandex = C14558l.yandex(c14558l, str, f2834l);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherYandex.find()) {
            String strGroup = matcherYandex.group(1);
            if (map.containsKey(strGroup)) {
                matcherYandex.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcherYandex.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static Pattern yandex(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2, B:66:0x0100, B:67:0x0106, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:70:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x009b, LOOP:2: B:17:0x0046->B:22:0x0052, LOOP_END, TryCatch #0 {all -> 0x009b, blocks: (B:3:0x0019, B:5:0x0022, B:7:0x002a, B:10:0x0033, B:31:0x0072, B:33:0x0078, B:36:0x0083, B:38:0x008b, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:60:0x00de, B:61:0x00e2, B:66:0x0100, B:67:0x0106, B:13:0x003a, B:15:0x0040, B:19:0x0049, B:22:0x0052, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:29:0x006c), top: B:70:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0051 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC6646l
    public final Object subs(Uri uri, C8162l c8162l) throws C17655l {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c8162l));
        ArrayDeque arrayDeque = new ArrayDeque();
        C14558l c14558l = new C14558l(16, 0.75f, true, 1);
        try {
            int i2 = bufferedReader.read();
            boolean zM3960catch = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zM3960catch = AbstractC15323l.m3960catch(i2);
                            break;
                        }
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        while (i2 != -1 && Character.isWhitespace(i2) && !AbstractC15323l.m3960catch(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM3960catch = AbstractC15323l.m3960catch(i2);
                        break;
                    }
                    if (i2 != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    i2 = bufferedReader.read();
                    i++;
                }
            }
            if (!zM3960catch) {
                throw C17655l.loadAd("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    AbstractC15323l.admob(bufferedReader);
                    throw C17655l.loadAd("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        C9887l c9887lPurchase = purchase(new C0554l(arrayDeque, bufferedReader), uri, c14558l);
                        AbstractC15323l.admob(bufferedReader);
                        return c9887lPurchase;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    C16272l c16272lAmazon = amazon(this.f2843l, this.f2842l, new C0554l(arrayDeque, bufferedReader), uri, c14558l);
                    AbstractC15323l.admob(bufferedReader);
                    return c16272lAmazon;
                }
            }
        } catch (Throwable th) {
            AbstractC15323l.admob(bufferedReader);
            throw th;
        }
    }
}
