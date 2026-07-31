package defpackage;

/* JADX INFO: renamed from: lًۜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8277l {
    public final int loadAd;
    public final C18680l yandex;

    public C8277l(C18680l c18680l, int i) {
        if (c18680l == null) {
            C6541l.subs("Null quality");
            throw null;
        }
        this.yandex = c18680l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8277l) {
            C8277l c8277l = (C8277l) obj;
            if (this.yandex.equals(c8277l.yandex) && this.loadAd == c8277l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.yandex);
        sb.append(", aspectRatio=");
        return AbstractC14814l.remoteconfig(this.loadAd, "}", sb);
    }
}
