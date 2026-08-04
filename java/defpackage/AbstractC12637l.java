package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌّٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12637l {
    public static final HashMap amazon;
    public static final HashMap crashlytics;
    public static final HashMap loadAd;
    public static final HashMap purchase;
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap();
        yandex = map;
        HashMap map2 = new HashMap();
        loadAd = map2;
        HashMap map3 = new HashMap();
        crashlytics = map3;
        HashMap map4 = new HashMap();
        amazon = map4;
        HashMap map5 = new HashMap();
        purchase = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        C15421l c15421l = C15421l.amazon;
        map6.put(c15421l, 1);
        C15421l c15421l2 = C15421l.purchase;
        map6.put(c15421l2, 2);
        C15421l c15421l3 = C15421l.billing;
        map6.put(c15421l3, 4096);
        C15421l c15421l4 = C15421l.mopub;
        map6.put(c15421l4, 8192);
        HashMap map7 = new HashMap();
        map7.put(c15421l, 1);
        map7.put(c15421l2, 2);
        map7.put(c15421l3, 4096);
        map7.put(c15421l4, 8192);
        HashMap map8 = new HashMap();
        map8.put(c15421l, 1);
        map8.put(c15421l2, 4);
        map8.put(c15421l3, 4096);
        map8.put(c15421l4, 16384);
        HashMap map9 = new HashMap();
        map9.put(C15421l.admob, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        map9.put(C15421l.subs, Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean yandex(C6410l c6410l, C15421l c15421l) {
        int i = c6410l.admob;
        Set set = (Set) yandex.get(Integer.valueOf(c15421l.loadAd));
        if (set == null || !set.contains(Integer.valueOf(i))) {
            return false;
        }
        int i2 = c6410l.isPro;
        Set set2 = (Set) loadAd.get(Integer.valueOf(c15421l.yandex));
        return set2 != null && set2.contains(Integer.valueOf(i2));
    }
}
