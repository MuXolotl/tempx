package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lِْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12276l {
    public final ArrayList crashlytics;
    public final C3716l loadAd;
    public final C3716l yandex;

    public C12276l(C3716l c3716l, C3716l c3716l2, ArrayList arrayList) {
        if (c3716l == null) {
            C6541l.subs("Null primarySurfaceEdge");
            throw null;
        }
        this.yandex = c3716l;
        if (c3716l2 == null) {
            C6541l.subs("Null secondarySurfaceEdge");
            throw null;
        }
        this.loadAd = c3716l2;
        this.crashlytics = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12276l)) {
            return false;
        }
        C12276l c12276l = (C12276l) obj;
        return this.yandex.equals(c12276l.yandex) && this.loadAd.equals(c12276l.loadAd) && this.crashlytics.equals(c12276l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.yandex + ", secondarySurfaceEdge=" + this.loadAd + ", outConfigs=" + this.crashlytics + "}";
    }
}
