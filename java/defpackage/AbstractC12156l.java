package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lِ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12156l {
    public static final LinkedHashMap loadAd;
    public static final LinkedHashMap yandex;

    static {
        C15421l c15421l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yandex = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        loadAd = linkedHashMap2;
        C15421l c15421l2 = C15421l.amazon;
        linkedHashMap.put(1L, c15421l2);
        linkedHashMap2.put(c15421l2, Collections.singletonList(1L));
        linkedHashMap.put(2L, C15421l.purchase);
        linkedHashMap2.put(linkedHashMap.get(2L), Collections.singletonList(2L));
        C15421l c15421l3 = C15421l.billing;
        linkedHashMap.put(4L, c15421l3);
        linkedHashMap2.put(c15421l3, Collections.singletonList(4L));
        C15421l c15421l4 = C15421l.mopub;
        linkedHashMap.put(8L, c15421l4);
        linkedHashMap2.put(c15421l4, Collections.singletonList(8L));
        List listRemoteconfig = AbstractC14055l.remoteconfig(64L, 128L, 16L, 32L);
        Iterator it = listRemoteconfig.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c15421l = C15421l.admob;
            if (!zHasNext) {
                break;
            } else {
                yandex.put(Long.valueOf(((Number) it.next()).longValue()), c15421l);
            }
        }
        loadAd.put(c15421l, listRemoteconfig);
        List listRemoteconfig2 = AbstractC14055l.remoteconfig(1024L, 2048L, 256L, 512L);
        Iterator it2 = listRemoteconfig2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            C15421l c15421l5 = C15421l.subs;
            if (!zHasNext2) {
                loadAd.put(c15421l5, listRemoteconfig2);
                return;
            }
            yandex.put(Long.valueOf(((Number) it2.next()).longValue()), c15421l5);
        }
    }

    public static Long yandex(C15421l c15421l, DynamicRangeProfiles dynamicRangeProfiles) {
        List list = (List) loadAd.get(c15421l);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }
}
