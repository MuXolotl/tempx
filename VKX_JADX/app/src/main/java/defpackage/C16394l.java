package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: lٖٔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16394l implements InterfaceC5644l {
    public final List amazon;
    public final List crashlytics;
    public final String loadAd;
    public final AbstractC7188l purchase;
    public final Class yandex;

    public C16394l(Class cls, String str, List list, List list2, AbstractC7188l abstractC7188l) {
        this.yandex = cls;
        this.loadAd = str;
        this.crashlytics = list;
        this.amazon = list2;
        this.purchase = abstractC7188l;
    }

    public final C16394l crashlytics(Class cls, String str) {
        List list = this.crashlytics;
        if (list.contains(str)) {
            C8339l.metrica("Labels must be unique.");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.amazon);
        arrayList2.add(cls);
        return new C16394l(this.yandex, this.loadAd, arrayList, arrayList2, this.purchase);
    }

    public final C16394l loadAd(Object obj) {
        C5011l c5011l = new C5011l(this, obj);
        return new C16394l(this.yandex, this.loadAd, this.crashlytics, this.amazon, c5011l);
    }

    @Override // defpackage.InterfaceC5644l
    public final AbstractC7188l yandex(Type type, Set set, C12952l c12952l) {
        if (AbstractC15639l.purchase(type) != this.yandex || !set.isEmpty()) {
            return null;
        }
        List list = this.amazon;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(c12952l.yandex((Type) list.get(i)));
        }
        return new C5372l(this.loadAd, this.crashlytics, this.amazon, arrayList, this.purchase).amazon();
    }
}
