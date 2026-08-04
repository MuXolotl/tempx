package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: lٌؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8542l {
    public static final HashMap loadAd;
    public static final SparseArray yandex = new SparseArray();

    static {
        HashMap map = new HashMap();
        loadAd = map;
        map.put(EnumC14251l.f27853l, 0);
        map.put(EnumC14251l.f27852l, 1);
        map.put(EnumC14251l.f27851l, 2);
        for (EnumC14251l enumC14251l : map.keySet()) {
            yandex.append(((Integer) loadAd.get(enumC14251l)).intValue(), enumC14251l);
        }
    }

    public static EnumC14251l loadAd(int i) {
        EnumC14251l enumC14251l = (EnumC14251l) yandex.get(i);
        if (enumC14251l != null) {
            return enumC14251l;
        }
        C8339l.metrica(AbstractC0653l.vip(i, "Unknown Priority for value "));
        return null;
    }

    public static int yandex(EnumC14251l enumC14251l) {
        Integer num = (Integer) loadAd.get(enumC14251l);
        if (num != null) {
            return num.intValue();
        }
        C11983l.ad(enumC14251l, "PriorityMapping is missing known Priority value ");
        return 0;
    }
}
