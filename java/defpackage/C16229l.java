package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؙٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16229l implements InterfaceC1507l {
    public final ArrayList loadAd;
    public final List yandex;

    public C16229l(List list) {
        this.yandex = list;
        if (list.isEmpty()) {
            C8339l.metrica("Configuration stack must not be empty");
            throw null;
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList.add(new C9846l(obj, i == AbstractC14055l.smaato(this.yandex) ? EnumC17389l.f33856l : EnumC17389l.f33857l));
            i = i2;
        }
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16229l) && AbstractC8576l.yandex(this.yandex, ((C16229l) obj).yandex);
    }

    @Override // defpackage.InterfaceC1507l
    public final ArrayList getChildren() {
        return this.loadAd;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("StackNavState(configurations="), this.yandex, ')');
    }
}
