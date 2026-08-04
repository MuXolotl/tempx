package defpackage;

/* JADX INFO: renamed from: lۣؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143l {
    public final Object loadAd;
    public final int yandex;

    public C1143l(int i, Object obj) {
        this.yandex = i;
        this.loadAd = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1143l)) {
            return false;
        }
        C1143l c1143l = (C1143l) obj;
        return this.yandex == c1143l.yandex && AbstractC8576l.yandex(this.loadAd, c1143l.loadAd);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        Object obj = this.loadAd;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.yandex + ", value=" + this.loadAd + ')';
    }
}
