package defpackage;

import android.view.Surface;

/* JADX INFO: renamed from: lؚۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7478l {
    public final Surface loadAd;
    public final int yandex;

    public C7478l(int i, Surface surface) {
        this.yandex = i;
        if (surface != null) {
            this.loadAd = surface;
        } else {
            C6541l.subs("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7478l)) {
            return false;
        }
        C7478l c7478l = (C7478l) obj;
        return this.yandex == c7478l.yandex && this.loadAd.equals(c7478l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.yandex + ", surface=" + this.loadAd + "}";
    }
}
