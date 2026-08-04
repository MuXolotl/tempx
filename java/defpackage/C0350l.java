package defpackage;

/* JADX INFO: renamed from: lٕؑۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0350l {
    public final int loadAd;
    public final String yandex;

    public C0350l(String str, int i) {
        this.yandex = str;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0350l)) {
            return false;
        }
        C0350l c0350l = (C0350l) obj;
        return AbstractC8576l.yandex(this.yandex, c0350l.yandex) && this.loadAd == c0350l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.yandex);
        sb.append(", generation=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
