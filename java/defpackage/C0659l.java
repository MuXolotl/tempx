package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؑۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0659l implements InterfaceC16243l {
    public final List yandex;

    public C0659l(List list) {
        this.yandex = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0659l) {
            return AbstractC8576l.yandex(this.yandex, ((C0659l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.InterfaceC16243l
    public C14329l loadAd() {
        List list = this.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC18384l) it.next()).loadAd());
        }
        return AbstractC1889l.loadAd(arrayList);
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("ConcatenatedFormatStructure("), AbstractC16901l.m4210case(this.yandex, ", ", null, null, null, 62), ')');
    }

    @Override // defpackage.InterfaceC16243l
    public C1094l yandex() {
        List list = this.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC18384l) it.next()).yandex());
        }
        return arrayList.size() == 1 ? (C1094l) AbstractC16901l.m4208abstract(arrayList) : new C1094l();
    }
}
