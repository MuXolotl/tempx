package defpackage;

/* JADX INFO: renamed from: lؚٜٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7381l {
    public final C12130l loadAd;
    public final int yandex;

    public C7381l(int i, C12130l c12130l) {
        this.yandex = i;
        if (c12130l != null) {
            this.loadAd = c12130l;
        } else {
            C6541l.subs("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7381l) {
            C7381l c7381l = (C7381l) obj;
            if (this.yandex == c7381l.yandex && this.loadAd.equals(c7381l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.yandex + ", cameraIdentifier=" + this.loadAd + "}";
    }
}
