package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18698l implements InterfaceC18579l {
    public final Set yandex;

    public C18698l(Set set) {
        this.yandex = set;
        if (set.isEmpty()) {
            C8339l.metrica("The set of sizes cannot be empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return C18698l.class.equals(obj != null ? obj.getClass() : null) && this.yandex.equals(((C18698l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.yandex + ')';
    }
}
