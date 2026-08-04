package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lؗؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4675l {
    public final ArrayList billing;
    public int yandex;
    public final ArrayList loadAd = new ArrayList();
    public final ArrayList crashlytics = new ArrayList(0);
    public final LinkedHashMap amazon = new LinkedHashMap(0);
    public final ArrayList purchase = new ArrayList(0);

    public C4675l(int i) {
        this.yandex = i;
        InterfaceC12157l.yandex.getClass();
        List listYandex = C17744l.yandex();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listYandex, 10));
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            ((C9703l) ((InterfaceC12157l) it.next())).getClass();
            arrayList.add(new C5243l());
        }
        this.billing = arrayList;
    }
}
