package defpackage;

/* JADX INFO: renamed from: lٗٞٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17296l {
    public final C13317l loadAd;
    public final String yandex;

    public C17296l(String str, C13317l c13317l) {
        this.yandex = str;
        this.loadAd = c13317l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17296l)) {
            return false;
        }
        C17296l c17296l = (C17296l) obj;
        return this.yandex.equals(c17296l.yandex) && this.loadAd.equals(c17296l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return this.yandex;
    }
}
