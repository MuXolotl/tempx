package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lٍؚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7542l {
    public static final C7542l crashlytics;
    public static final C7542l loadAd;
    public final LinkedHashSet yandex;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C13893l(0));
        loadAd = new C7542l(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C13893l(1));
        crashlytics = new C7542l(linkedHashSet2);
    }

    public C7542l(LinkedHashSet linkedHashSet) {
        this.yandex = linkedHashSet;
    }

    public final InterfaceC18690l crashlytics(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC18690l) it.next()).loadAd());
        }
        ArrayList arrayListYandex = yandex(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC18690l interfaceC18690l = (InterfaceC18690l) it2.next();
            if (arrayListYandex.contains(interfaceC18690l.loadAd())) {
                linkedHashSet2.add(interfaceC18690l);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (InterfaceC18690l) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            InterfaceC15879l interfaceC15879lAdcel = ((InterfaceC18690l) it4.next()).adcel();
            sb.append(" Id:" + interfaceC15879lAdcel.mopub() + "  Lens:" + interfaceC15879lAdcel.metrica());
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        LinkedHashSet<C13893l> linkedHashSet3 = this.yandex;
        sb2.append("PhyId:null  Filters:" + linkedHashSet3.size());
        for (C13893l c13893l : linkedHashSet3) {
            sb2.append(" Id:");
            c13893l.getClass();
            sb2.append(C13893l.loadAd);
            if (c13893l instanceof C13893l) {
                sb2.append(" LensFilter:");
                sb2.append(c13893l.yandex);
            }
        }
        C8339l.metrica(AbstractC14814l.adcel("No available camera can be found. ", string, " ", sb2.toString()));
        return null;
    }

    public final Integer loadAd() {
        Integer num = null;
        for (C13893l c13893l : this.yandex) {
            if (c13893l instanceof C13893l) {
                Integer numValueOf = Integer.valueOf(c13893l.yandex);
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    C8339l.smaato("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final ArrayList yandex(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (C13893l c13893l : this.yandex) {
            List<InterfaceC15879l> listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
            c13893l.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC15879l interfaceC15879l : listUnmodifiableList) {
                AbstractC5641l.loadAd(interfaceC15879l instanceof InterfaceC15879l, "The camera info doesn't contain internal implementation.");
                if (interfaceC15879l.metrica() == c13893l.yandex) {
                    arrayList3.add(interfaceC15879l);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }
}
