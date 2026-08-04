package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: lؘۦٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6105l implements InterfaceC0629l, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f12890l;

    public C6105l(List list) {
        this.f12890l = list;
    }

    @Override // defpackage.InterfaceC0629l
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f12890l;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC0629l) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6105l) {
            return this.f12890l.equals(((C6105l) obj).f12890l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12890l.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f12890l) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
