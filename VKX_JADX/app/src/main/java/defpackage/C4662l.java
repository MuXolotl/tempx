package defpackage;

/* JADX INFO: renamed from: lّؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4662l {
    public final String loadAd;
    public final String yandex;

    public C4662l(String str, String str2) {
        this.yandex = str;
        if (str2 != null) {
            this.loadAd = str2;
        } else {
            C6541l.subs("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4662l)) {
            return false;
        }
        C4662l c4662l = (C4662l) obj;
        return this.yandex.equals(c4662l.yandex) && this.loadAd.equals(c4662l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.yandex);
        sb.append(", version=");
        return AbstractC0653l.ads(sb, this.loadAd, "}");
    }
}
