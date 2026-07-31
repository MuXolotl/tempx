package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؚؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6944l {
    public AbstractC2520l amazon;
    public C9611l crashlytics;
    public final C10685l loadAd = new C10685l(26);
    public final ArrayList purchase = new ArrayList();
    public final List yandex;

    public C6944l(List list) {
        this.yandex = list;
    }

    public final String toString() {
        return "Trace for " + this.yandex;
    }

    public final void yandex(C9611l c9611l) {
        C10685l c10685l = this.loadAd;
        if (((ArrayList) c10685l.f21690l).isEmpty()) {
            this.crashlytics = c9611l;
            return;
        }
        ArrayList arrayList = (ArrayList) c10685l.f21690l;
        if (arrayList.isEmpty()) {
            C1759l.firebase("Unable to peek an element into empty stack");
            return;
        }
        C9611l c9611l2 = (C9611l) AbstractC16901l.m4214continue(arrayList);
        ArrayList arrayList2 = c9611l2.amazon;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c9611l2.amazon = arrayList2;
        }
        arrayList2.add(c9611l);
    }
}
