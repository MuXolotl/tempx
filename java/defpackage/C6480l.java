package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؙِٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6480l extends AbstractC5117l {
    public final ArrayList yandex;

    public C6480l(ArrayList arrayList) {
        this.yandex = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5117l)) {
            return false;
        }
        return this.yandex.equals(((C6480l) ((AbstractC5117l) obj)).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.yandex + "}";
    }
}
