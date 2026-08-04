package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: lِؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11631l {
    public static final String yandex = loadAd(24, "video/hevc");
    public static final String loadAd = loadAd(24, "video/x-vnd.on2.vp9");
    public static final String crashlytics = loadAd(29, "audio/opus");
    public static final String amazon = loadAd(33, "video/dolby-vision");
    public static final String purchase = loadAd(34, "video/av01");
    public static final String billing = loadAd(36, "video/apv");
    public static final C8688l mopub = new C8688l(new C3321l(20));
    public static final C8688l admob = new C8688l(new C3321l(21));
    public static final C8688l subs = new C8688l(new C3321l(22));

    public static String loadAd(int i, String str) {
        if (Build.VERSION.SDK_INT >= i) {
            return str;
        }
        return null;
    }

    public static C13672l yandex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object linkedHashMap2 = linkedHashMap.get(0);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(0, linkedHashMap2);
        }
        new C14785l(0, (Map) linkedHashMap2, 6).signatures(AbstractC14055l.vip(amazon), (List) admob.getValue());
        Unit unit = Unit.INSTANCE;
        return new C13672l(linkedHashMap);
    }
}
