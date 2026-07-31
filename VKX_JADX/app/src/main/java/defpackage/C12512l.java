package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12512l {
    public final List loadAd;
    public final C3716l yandex;

    public C12512l(C3716l c3716l, List list) {
        if (c3716l == null) {
            C6541l.subs("Null surfaceEdge");
            throw null;
        }
        this.yandex = c3716l;
        if (list != null) {
            this.loadAd = list;
        } else {
            C6541l.subs("Null outConfigs");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12512l) {
            C12512l c12512l = (C12512l) obj;
            if (this.yandex.equals(c12512l.yandex) && this.loadAd.equals(c12512l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.yandex + ", outConfigs=" + this.loadAd + "}";
    }
}
