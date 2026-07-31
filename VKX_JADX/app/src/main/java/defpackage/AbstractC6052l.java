package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؘۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6052l {
    public static final List adcel;
    public static final Pattern admob;
    public static final Pattern amazon;
    public static final Pattern billing;
    public static final Pattern crashlytics;
    public static final Pattern firebase;
    public static final Pattern isPro;
    public static final String loadAd;
    public static final Pattern metrica;
    public static final Pattern mopub;
    public static final Pattern purchase;
    public static final Pattern remoteconfig;
    public static final Pattern smaato;
    public static final Pattern startapp;
    public static final Pattern subs;
    public static final Pattern vip;
    public static final String yandex;

    static {
        String string = Character.toString(',');
        yandex = string;
        loadAd = string;
        crashlytics = Pattern.compile("^0[x|X]([0-9A-F]+)$");
        amazon = Pattern.compile("^(\\d+)x(\\d+)$");
        purchase = Pattern.compile("^#EXT-X-VERSION:(\\d+)$");
        billing = Pattern.compile("^#EXT-X-TARGETDURATION:(\\d+)$");
        mopub = Pattern.compile("^#EXT-X-MEDIA-SEQUENCE:(\\d+)$");
        admob = Pattern.compile("^#EXT-X-PLAYLIST-TYPE:(EVENT|VOD)$");
        subs = Pattern.compile("^#EXT-X-PROGRAM-DATE-TIME:(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(?:\\.\\d{3})?(?:Z?|[\\+-]\\d{2}(:?\\d{2})?)?)$");
        isPro = Pattern.compile("^CC[1-4]|SERVICE(?:[1-9]|[1-5]\\d|6[0-3])$");
        firebase = Pattern.compile("^#EXTINF:(-?\\d*\\.?\\d*)(?:,(.+)?)?$");
        smaato = Pattern.compile("^#EXT-X-ENDLIST$");
        remoteconfig = Pattern.compile("^#EXT-X-I-FRAMES-ONLY");
        vip = Pattern.compile("^#EXT-X-DISCONTINUITY$");
        metrica = Pattern.compile("^#EXT-X-BYTERANGE:(\\d+)(?:@(\\d+))?$");
        startapp = Pattern.compile("^(\\d+)(?:@(\\d+))?$");
        adcel = Arrays.asList(1);
    }
}
