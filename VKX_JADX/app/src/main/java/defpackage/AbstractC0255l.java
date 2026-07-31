package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؘِؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0255l {
    public static final C3625l yandex = new C3625l("");

    public static final boolean loadAd(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }

    public static final List yandex(C3625l c3625l, int i, int i2, C13206l c13206l) {
        List list;
        if (i == i2 || (list = c3625l.f7564l) == null) {
            return null;
        }
        if (i != 0 || i2 < c3625l.f7563l.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C15012l c15012l = (C15012l) list.get(i3);
                if ((c13206l != null ? ((Boolean) c13206l.invoke(c15012l.yandex)).booleanValue() : true) && loadAd(i, i2, c15012l.loadAd, c15012l.crashlytics)) {
                    arrayList.add(new C15012l(AbstractC8576l.purchase(c15012l.loadAd, i, i2) - i, AbstractC8576l.purchase(c15012l.crashlytics, i, i2) - i, (InterfaceC18302l) c15012l.yandex, c15012l.amazon));
                }
            }
            return arrayList;
        }
        if (c13206l == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = list.get(i4);
            if (((Boolean) c13206l.invoke(((C15012l) obj).yandex)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
