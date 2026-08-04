package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lٗۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17479l {
    public static final HashMap crashlytics;
    public static final HashMap loadAd;
    public final HashMap yandex = new HashMap();

    static {
        HashMap map = new HashMap();
        loadAd = map;
        map.put(C18680l.admob, Range.create(2160, 4319));
        map.put(C18680l.mopub, Range.create(1080, 1439));
        map.put(C18680l.billing, Range.create(720, 1079));
        map.put(C18680l.purchase, Range.create(241, 719));
        HashMap map2 = new HashMap();
        crashlytics = map2;
        map2.put(0, AbstractC14608l.yandex);
        map2.put(1, AbstractC14608l.crashlytics);
    }

    public C17479l(List list, HashMap map) {
        HashMap map2;
        Integer num;
        C18680l c18680l;
        HashMap map3 = loadAd;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = crashlytics;
            if (!zHasNext) {
                break;
            }
            C18680l c18680l2 = (C18680l) it.next();
            this.yandex.put(new C8277l(c18680l2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.yandex.put(new C8277l(c18680l2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.yandex.get(new C8277l((C18680l) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    c18680l = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    c18680l = (C18680l) entry2.getKey();
                    break;
                }
            }
            if (c18680l != null) {
                for (Map.Entry entry3 : map2.entrySet()) {
                    if (AbstractC14608l.yandex(size, (Rational) entry3.getValue(), AbstractC5513l.loadAd)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.yandex.get(new C8277l(c18680l, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.yandex.entrySet()) {
            Size size2 = (Size) map.get(((C8277l) entry4.getKey()).yandex);
            if (size2 != null) {
                Size size3 = AbstractC5513l.yandex;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: lِٔؑ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iYandex = AbstractC5513l.yandex((Size) obj);
                        int i = height;
                        return Math.abs(iYandex - i) - Math.abs(AbstractC5513l.yandex((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
