package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٌؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7774l implements InterfaceC2790l {
    public final ArrayList yandex;

    public C7774l(Context context, C4434l c4434l) {
        ArrayList arrayList = new ArrayList();
        this.yandex = arrayList;
        arrayList.add(new C10122l(context, c4434l));
    }

    @Override // defpackage.InterfaceC2790l
    public final void yandex(C7847l c7847l) {
        Iterator it = this.yandex.iterator();
        while (it.hasNext()) {
            ((InterfaceC2790l) it.next()).yandex(c7847l);
        }
    }
}
