package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6258l implements InterfaceC6063l {
    public final LinkedHashMap amazon;
    public final LinkedHashMap billing;
    public final C6238l crashlytics;
    public final Function1 loadAd;
    public final LinkedHashMap purchase;
    public final C12875l yandex;

    public C6258l(C12875l c12875l, Function1 function1) {
        this.yandex = c12875l;
        this.loadAd = function1;
        C6238l c6238l = new C6238l(10, this);
        this.crashlytics = c6238l;
        C14432l c14432lFirebase = AbstractC17587l.firebase(new C17798l(1, c12875l.amazon()), c6238l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C12588l c12588l = new C12588l(c14432lFirebase);
        while (c12588l.hasNext()) {
            Object next = c12588l.next();
            C3498l c3498lCrashlytics = ((C1734l) next).crashlytics();
            Object arrayList = linkedHashMap.get(c3498lCrashlytics);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c3498lCrashlytics, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.amazon = linkedHashMap;
        C14432l c14432lFirebase2 = AbstractC17587l.firebase(new C17798l(1, this.yandex.yandex()), this.loadAd);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C12588l c12588l2 = new C12588l(c14432lFirebase2);
        while (c12588l2.hasNext()) {
            Object next2 = c12588l2.next();
            linkedHashMap2.put(((C0865l) next2).crashlytics(), next2);
        }
        this.purchase = linkedHashMap2;
        ArrayList arrayListBilling = this.yandex.billing();
        Function1 function2 = this.loadAd;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListBilling) {
            if (((Boolean) function2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase < 16 ? 16 : iFirebase);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((C8571l) obj2).crashlytics(), obj2);
        }
        this.billing = linkedHashMap3;
    }

    @Override // defpackage.InterfaceC6063l
    public final C0865l amazon(C3498l c3498l) {
        return (C0865l) this.purchase.get(c3498l);
    }

    @Override // defpackage.InterfaceC6063l
    public final Set billing() {
        C14432l c14432lFirebase = AbstractC17587l.firebase(new C17798l(1, this.yandex.yandex()), this.loadAd);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C12588l c12588l = new C12588l(c14432lFirebase);
        while (c12588l.hasNext()) {
            linkedHashSet.add(((C0865l) c12588l.next()).crashlytics());
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC6063l
    public final Collection crashlytics(C3498l c3498l) {
        List list = (List) this.amazon.get(c3498l);
        return list != null ? list : C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC6063l
    public final C8571l loadAd(C3498l c3498l) {
        return (C8571l) this.billing.get(c3498l);
    }

    @Override // defpackage.InterfaceC6063l
    public final Set purchase() {
        return this.billing.keySet();
    }

    @Override // defpackage.InterfaceC6063l
    public final Set yandex() {
        C14432l c14432lFirebase = AbstractC17587l.firebase(new C17798l(1, this.yandex.amazon()), this.crashlytics);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C12588l c12588l = new C12588l(c14432lFirebase);
        while (c12588l.hasNext()) {
            linkedHashSet.add(((C1734l) c12588l.next()).crashlytics());
        }
        return linkedHashSet;
    }
}
