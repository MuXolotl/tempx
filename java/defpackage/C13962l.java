package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٓؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13962l {
    public static final ArrayList purchase = new ArrayList();
    public boolean amazon;
    public List crashlytics;
    public final AbstractC17653l loadAd;
    public final C12222l yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public C13962l(C12222l c12222l, AbstractC17653l abstractC17653l) {
        ArrayList arrayList = purchase;
        if ((arrayList instanceof InterfaceC2356l) && !(arrayList instanceof InterfaceC4742l)) {
            AbstractC9464l.vip(arrayList, "kotlin.collections.MutableList");
            throw null;
        }
        this(c12222l, abstractC17653l, arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        C8339l.smaato("The shared empty array list has been modified");
        throw null;
    }

    public final String toString() {
        return "Phase `" + this.yandex.yandex + "`, " + this.crashlytics.size() + " handlers";
    }

    public final void yandex(List list) {
        List list2 = this.crashlytics;
        if (list instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.ensureCapacity(list2.size() + arrayList.size());
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            list.add(list2.get(i));
        }
    }

    public C13962l(C12222l c12222l, AbstractC17653l abstractC17653l, List list) {
        this.yandex = c12222l;
        this.loadAd = abstractC17653l;
        this.crashlytics = list;
        this.amazon = true;
    }
}
