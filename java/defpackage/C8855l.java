package defpackage;

/* JADX INFO: renamed from: lٌْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8855l implements Comparable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8855l f18202l = new C8855l(2, 3, 21);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f18203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f18204l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f18205l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f18206l;

    public C8855l(int i, int i2, int i3) {
        this.f18205l = i;
        this.f18204l = i2;
        this.f18203l = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f18206l = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18206l - ((C8855l) obj).f18206l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C8855l c8855l = obj instanceof C8855l ? (C8855l) obj : null;
        return c8855l != null && this.f18206l == c8855l.f18206l;
    }

    public final int hashCode() {
        return this.f18206l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18205l);
        sb.append('.');
        sb.append(this.f18204l);
        sb.append('.');
        sb.append(this.f18203l);
        return sb.toString();
    }
}
