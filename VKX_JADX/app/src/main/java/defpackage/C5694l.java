package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘٔۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5694l implements InterfaceC11515l {
    public final ArrayList yandex;

    public C5694l(Context context, C17413l c17413l) {
        ArrayList arrayList = new ArrayList();
        this.yandex = arrayList;
        arrayList.add(new C18357l(context, c17413l));
    }

    @Override // defpackage.InterfaceC11515l
    public final void yandex(C2888l c2888l) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC11515l) it.next()).yandex(c2888l);
        }
    }
}
