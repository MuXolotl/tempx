package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lِۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12037l extends C12736l {
    public final C11154l ad;
    public final ArrayList pro;

    public C12037l(C12545l c12545l, String str, String str2) {
        super(c12545l, str, str2, false);
        this.pro = new ArrayList();
        this.ad = new C11154l(0);
    }

    public final void subs(Collection collection) {
        C12736l c12736l;
        this.license.clear();
        ArrayList arrayList = this.pro;
        arrayList.clear();
        C11154l c11154l = this.ad;
        c11154l.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5717l c5717l = (C5717l) it.next();
            String strAmazon = c5717l.yandex.amazon();
            Iterator it2 = this.yandex.loadAd.iterator();
            do {
                if (!it2.hasNext()) {
                    c12736l = null;
                    break;
                }
                c12736l = (C12736l) it2.next();
            } while (!c12736l.loadAd.equals(strAmazon));
            if (c12736l != null) {
                arrayList.add(c12736l);
                c11154l.put(c12736l.crashlytics, c5717l);
                int i = c5717l.loadAd;
                if (i == 2 || i == 3) {
                    this.license.add(c12736l);
                }
            }
        }
        C9961l.crashlytics().yandex.loadAd(259, this);
    }
}
