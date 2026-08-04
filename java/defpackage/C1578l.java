package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؓؔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1578l {
    public static final C1578l loadAd = new C1578l(AbstractC14055l.remoteconfig(C1015l.amazon, C9392l.amazon, C0097l.amazon, C4988l.amazon));
    public final LinkedHashMap yandex;

    public C1578l(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C2312l c2312l = ((AbstractC1514l) obj).yandex;
            Object arrayList = linkedHashMap.get(c2312l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c2312l, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.yandex = linkedHashMap;
    }

    public final C2473l yandex(C2312l c2312l, String str) {
        Integer numValueOf;
        List<AbstractC1514l> list = (List) this.yandex.get(c2312l);
        if (list == null) {
            return null;
        }
        for (AbstractC1514l abstractC1514l : list) {
            int i = 0;
            if (AbstractC16648l.isVip(str, abstractC1514l.loadAd, false)) {
                String strSubstring = str.substring(abstractC1514l.loadAd.length());
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length = strSubstring.length();
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        numValueOf = Integer.valueOf(i2);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i2 = (i2 * 10) + iCharAt;
                    i++;
                }
                if (numValueOf != null) {
                    return new C2473l(abstractC1514l, numValueOf.intValue());
                }
            }
        }
        return null;
    }
}
