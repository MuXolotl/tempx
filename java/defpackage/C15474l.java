package defpackage;

/* JADX INFO: renamed from: lٕۣؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15474l extends AbstractC12911l {
    public final String loadAd;
    public final String yandex;

    public C15474l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12911l)) {
            return false;
        }
        C15474l c15474l = (C15474l) ((AbstractC12911l) obj);
        return this.yandex.equals(c15474l.yandex) && this.loadAd.equals(c15474l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.yandex);
        sb.append(", value=");
        return AbstractC0653l.ads(sb, this.loadAd, "}");
    }
}
