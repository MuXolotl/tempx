package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؖۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4517l implements InterfaceC4182l {
    public final ArrayList yandex;

    public C4517l(ArrayList arrayList) {
        this.yandex = arrayList;
    }

    @Override // defpackage.InterfaceC4182l
    public final void crashlytics(C2312l c2312l, ArrayList arrayList) {
        for (Object obj : this.yandex) {
            if (AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) obj)).f7826l, c2312l)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // defpackage.InterfaceC4182l
    public final boolean loadAd(C2312l c2312l) {
        ArrayList arrayList = this.yandex;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) it.next())).f7826l, c2312l)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC4182l
    public final Collection remoteconfig(C2312l c2312l, Function1 function1) {
        return AbstractC17587l.adcel(AbstractC17587l.firebase(new C11100l(new C17798l(1, this.yandex), C1490l.f3734l), new C1258l(c2312l, 1)));
    }

    @Override // defpackage.InterfaceC4182l
    public final List yandex(C2312l c2312l) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.yandex) {
            if (AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) obj)).f7826l, c2312l)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
