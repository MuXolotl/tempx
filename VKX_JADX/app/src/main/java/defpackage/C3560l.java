package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؕۖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3560l implements InterfaceC2026l {
    public final List yandex;

    public C3560l(List list) {
        this.yandex = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3560l) && this.yandex.equals(((C3560l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("Success(vkCategories="), this.yandex, ')');
    }
}
