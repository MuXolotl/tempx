package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَٜۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10428l extends AbstractC17054l {
    public final boolean equals(Object obj) {
        if (!(obj instanceof C10428l)) {
            return false;
        }
        C10428l c10428l = (C10428l) obj;
        return AbstractC8576l.yandex((String) this.f33215l, (String) c10428l.f33215l) && AbstractC8576l.yandex((List) this.f33214l, (List) c10428l.f33214l);
    }

    public final int hashCode() {
        return ((List) this.f33214l).hashCode() + (((String) this.f33215l).hashCode() * 31);
    }
}
