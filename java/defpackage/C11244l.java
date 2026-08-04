package defpackage;

/* JADX INFO: renamed from: lُۖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11244l {
    public final C14264l amazon;
    public final C14264l crashlytics;
    public final C14264l loadAd;
    public final C14264l yandex;

    public C11244l(C14264l c14264l, C14264l c14264l2, C14264l c14264l3, C14264l c14264l4) {
        this.yandex = c14264l;
        this.loadAd = c14264l2;
        this.crashlytics = c14264l3;
        this.amazon = c14264l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11244l)) {
            return false;
        }
        C11244l c11244l = (C11244l) obj;
        return AbstractC8576l.yandex(this.yandex, c11244l.yandex) && AbstractC8576l.yandex(this.loadAd, c11244l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11244l.crashlytics) && AbstractC8576l.yandex(this.amazon, c11244l.amazon);
    }

    public final int hashCode() {
        C14264l c14264l = this.yandex;
        int iHashCode = (c14264l != null ? c14264l.hashCode() : 0) * 31;
        C14264l c14264l2 = this.loadAd;
        int iHashCode2 = (iHashCode + (c14264l2 != null ? c14264l2.hashCode() : 0)) * 31;
        C14264l c14264l3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (c14264l3 != null ? c14264l3.hashCode() : 0)) * 31;
        C14264l c14264l4 = this.amazon;
        return iHashCode3 + (c14264l4 != null ? c14264l4.hashCode() : 0);
    }
}
