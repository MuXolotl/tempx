package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًٍْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13219l extends AbstractC15096l implements InterfaceC3488l {
    public final C0950l crashlytics;
    public final ArrayList loadAd;

    public C13219l(String str) {
        C4569l c4569l = C4569l.loadAd;
        List<C6980l> list = AbstractC13402l.amazon(str).yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (C6980l c6980l : list) {
            if (c6980l.loadAd != 1) {
                C8339l.metrica("rootPath should be constant, no wildcards supported.");
                throw null;
            }
            arrayList.add(c6980l.yandex);
        }
        this.loadAd = arrayList;
        this.crashlytics = new C0950l(1.0d, arrayList.size(), 2);
    }

    @Override // defpackage.AbstractC15096l
    public final AbstractC7444l mopub(C5740l c5740l, int i) {
        if (i != 0) {
            C8339l.smaato("Root selector should be evaluated first.");
            return null;
        }
        ArrayList arrayList = this.loadAd;
        if (arrayList.isEmpty()) {
            return AbstractC7444l.amazon;
        }
        List list = (List) c5740l.f12126l;
        if (list.size() < arrayList.size()) {
            return AbstractC7444l.yandex;
        }
        int size = arrayList.size() + i;
        while (i < size) {
            if (!AbstractC8576l.yandex(list.get(i), arrayList.get(i))) {
                return AbstractC7444l.yandex;
            }
            i++;
        }
        return this.crashlytics;
    }

    public final String toString() {
        return AbstractC16901l.m4210case(this.loadAd, "/", null, null, null, 62);
    }
}
