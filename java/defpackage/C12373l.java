package defpackage;

/* JADX INFO: renamed from: lّؕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12373l {
    public final C18176l crashlytics;
    public final C1794l loadAd;
    public final InterfaceC15725l yandex;

    public C12373l(InterfaceC15725l interfaceC15725l, C1794l c1794l, C18176l c18176l, int i) {
        c1794l = (i & 2) != 0 ? null : c1794l;
        c18176l = (i & 64) != 0 ? null : c18176l;
        this.yandex = interfaceC15725l;
        this.loadAd = c1794l;
        this.crashlytics = c18176l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12373l)) {
            return false;
        }
        C12373l c12373l = (C12373l) obj;
        return AbstractC8576l.yandex(this.yandex, c12373l.yandex) && AbstractC8576l.yandex(this.loadAd, c12373l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c12373l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C1794l c1794l = this.loadAd;
        int iHashCode2 = (iHashCode + (c1794l != null ? c1794l.hashCode() : 0)) * 28629151;
        C18176l c18176l = this.crashlytics;
        return iHashCode2 + (c18176l != null ? c18176l.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + this.yandex + ", fontSize=" + this.loadAd + ", fontWeight=null, fontStyle=null, textDecoration=null, textAlign=null, fontFamily=" + this.crashlytics + ')';
    }
}
