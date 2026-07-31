package defpackage;

/* JADX INFO: renamed from: lٔۢؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15253l {
    public final Integer loadAd;
    public final int yandex;

    public C15253l(int i, AbstractC12446l abstractC12446l, Integer num) {
        this.yandex = i;
        this.loadAd = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15253l)) {
            return false;
        }
        C15253l c15253l = (C15253l) obj;
        return this.yandex == c15253l.yandex && AbstractC8576l.yandex(null, null) && AbstractC8576l.yandex(this.loadAd, c15253l.loadAd);
    }

    public final int hashCode() {
        int i = ((this.yandex * 31) + 0) * 31;
        Integer num = this.loadAd;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.yandex + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.loadAd + ")";
    }
}
