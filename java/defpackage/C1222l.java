package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؒٞۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1222l extends AbstractC17409l {
    public final List yandex;

    public C1222l(List list) {
        this.yandex = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17409l)) {
            return false;
        }
        return this.yandex.equals(((C1222l) ((AbstractC17409l) obj)).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.yandex + "}";
    }
}
