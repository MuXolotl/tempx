package defpackage;

/* JADX INFO: renamed from: lًؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1128l {
    public final String loadAd;
    public final String yandex;

    public C1128l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1128l)) {
            return false;
        }
        C1128l c1128l = (C1128l) obj;
        return this.yandex.equals(c1128l.yandex) && this.loadAd.equals(c1128l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
