package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8119l implements InterfaceC1507l {
    public final ArrayList crashlytics;
    public final Function2 loadAd;
    public final C14378l yandex;

    public C8119l(C14378l c14378l, Function2 function2) {
        this.yandex = c14378l;
        this.loadAd = function2;
        int size = c14378l.yandex.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C9846l(this.yandex.yandex.get(i), (EnumC17389l) this.loadAd.invoke(Integer.valueOf(i), this.yandex)));
        }
        this.crashlytics = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8119l)) {
            return false;
        }
        C8119l c8119l = (C8119l) obj;
        return AbstractC8576l.yandex(this.yandex, c8119l.yandex) && AbstractC8576l.yandex(this.loadAd, c8119l.loadAd);
    }

    @Override // defpackage.InterfaceC1507l
    public final ArrayList getChildren() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "PagesNavState(pages=" + this.yandex + ", pageStatus=" + this.loadAd + ')';
    }
}
