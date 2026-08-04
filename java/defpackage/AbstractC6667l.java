package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٌؙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6667l {
    public static final HashMap yandex;

    static {
        HashMap map = new HashMap(13);
        yandex = map;
        map.put("normal", 400);
        map.put("bold", 700);
        AbstractC11043l.firebase(1, map, "bolder", -1, "lighter");
        AbstractC11043l.firebase(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        AbstractC11043l.firebase(500, map, "500", 600, "600");
        AbstractC11043l.startapp(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
