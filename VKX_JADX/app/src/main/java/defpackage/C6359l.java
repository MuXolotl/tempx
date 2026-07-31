package defpackage;

/* JADX INFO: renamed from: lٍؙۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6359l extends AbstractC17569l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13161l f13327l;

    public C6359l(C13161l c13161l) {
        this.f13327l = c13161l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6359l) {
            return this.f13327l == ((C6359l) obj).f13327l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13327l.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f13327l + ")";
    }
}
