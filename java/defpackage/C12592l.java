package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lّٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12592l implements InterfaceC3804l {
    public final ArrayList yandex;

    public C12592l(ArrayList arrayList) {
        this.yandex = arrayList;
    }

    @Override // defpackage.InterfaceC3804l
    public final boolean test(Object obj) {
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC3804l) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
