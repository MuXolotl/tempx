package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lّٚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12688l {
    public static final List loadAd = AbstractC14055l.remoteconfig(EnumC3695l.f7773l, EnumC3695l.f7771l, EnumC3695l.f7772l, EnumC3695l.f7770l, EnumC3695l.f7768l);
    public final int yandex;

    public C12688l(int i) {
        Object next;
        this.yandex = i;
        Iterator it = loadAd.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
            }
        } while ((((EnumC3695l) next).f7774l & this.yandex) == 0);
        if (((EnumC3695l) next) != null) {
            return;
        }
        String.valueOf(this.yandex);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12688l) && this.yandex == ((C12688l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC15560l.tapsense("CategoryFlags(categoryFlags=", this.yandex, ")");
    }
}
