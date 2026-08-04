package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lّٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12604l implements InterfaceC13362l {
    public final /* synthetic */ C13734l yandex;

    public C12604l(C13734l c13734l) {
        this.yandex = c13734l;
    }

    @Override // defpackage.InterfaceC13362l
    public final boolean yandex(ArrayList arrayList, ArrayList arrayList2) {
        boolean zM3729case;
        C13734l c13734l = this.yandex;
        ArrayList arrayList3 = c13734l.vip;
        if (C13734l.m3727volatile(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + c13734l.yandex);
        }
        if (c13734l.amazon.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM3729case = false;
        } else {
            C6821l c6821l = (C6821l) AbstractC14814l.firebase(1, c13734l.amazon);
            c13734l.admob = c6821l;
            Iterator it = c6821l.yandex.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) it.next()).loadAd;
                if (abstractComponentCallbacksC4411l != null) {
                    abstractComponentCallbacksC4411l.f8950l = true;
                }
            }
            zM3729case = c13734l.m3729case(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(C13734l.inmobi((C6821l) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    C18725l.loadAd();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zM3729case;
    }
}
