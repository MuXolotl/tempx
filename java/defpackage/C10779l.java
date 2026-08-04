package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lُؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10779l extends AbstractC12194l implements InterfaceC17362l {
    public final ArrayList yandex;

    public C10779l(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C10779l) {
                AbstractC3984l.license(arrayList, ((InterfaceC17362l) obj).yandex());
            } else {
                arrayList.add(obj);
            }
        }
        this.yandex = arrayList;
    }

    @Override // defpackage.InterfaceC17362l
    public final List yandex() {
        return this.yandex;
    }
}
