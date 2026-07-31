package defpackage;

/* JADX INFO: renamed from: lؚۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6980l {
    public final int loadAd;
    public final String yandex;

    public C6980l(String str, int i) {
        this.yandex = str;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6980l)) {
            return false;
        }
        C6980l c6980l = (C6980l) obj;
        return AbstractC8576l.yandex(this.yandex, c6980l.yandex) && this.loadAd == c6980l.loadAd;
    }

    public final int hashCode() {
        return AbstractC5020l.inmobi(this.loadAd) + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoutingPathSegment(value=");
        sb.append(this.yandex);
        sb.append(", kind=");
        int i = this.loadAd;
        if (i != 1) {
            str = i != 2 ? "null" : "Parameter";
        } else {
            str = "Constant";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
