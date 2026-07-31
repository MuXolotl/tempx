package defpackage;

/* JADX INFO: renamed from: lؑۡٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0648l {
    public final int loadAd;
    public final Object yandex;

    public C0648l(int i, Object obj) {
        this.yandex = obj;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0648l)) {
            return false;
        }
        C0648l c0648l = (C0648l) obj;
        return AbstractC8576l.yandex(this.yandex, c0648l.yandex) && this.loadAd == c0648l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemKey(value=");
        sb.append(this.yandex);
        sb.append(", index=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
