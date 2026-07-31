package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14708l {
    public final C14708l amazon;
    public final String crashlytics;
    public final List loadAd;
    public final C16750l yandex;

    public C14708l(C16750l c16750l, List list, String str) {
        this.yandex = c16750l;
        this.loadAd = list;
        this.crashlytics = str;
        C14708l c14708l = null;
        if (str != null) {
            C16750l c16750lYandex = c16750l != null ? c16750l.yandex() : null;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C16750l c16750l2 = (C16750l) it.next();
                arrayList.add(c16750l2 != null ? c16750l2.yandex() : null);
            }
            c14708l = new C14708l(c16750lYandex, arrayList, null);
        }
        this.amazon = c14708l;
    }
}
