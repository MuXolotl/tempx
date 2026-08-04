package defpackage;

/* JADX INFO: renamed from: lٙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18405l {
    public final C9426l loadAd;
    public final int yandex;

    public C18405l(int i, C9426l c9426l) {
        this.yandex = i;
        this.loadAd = c9426l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18405l)) {
            return false;
        }
        C18405l c18405l = (C18405l) obj;
        return this.yandex == c18405l.yandex && AbstractC8576l.yandex(this.loadAd, c18405l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        return "RequestSignal(requestNo=" + this.yandex + ", signal=" + this.loadAd + ')';
    }
}
