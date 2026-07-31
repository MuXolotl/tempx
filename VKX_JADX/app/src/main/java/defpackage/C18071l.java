package defpackage;

/* JADX INFO: renamed from: l٘ٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18071l extends AbstractC16682l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C14529l f35363l = new C14529l(7);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f35364l;

    public C18071l(String str) {
        super(f35363l);
        this.f35364l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18071l) && this.f35364l.equals(((C18071l) obj).f35364l);
    }

    public final int hashCode() {
        return this.f35364l.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("PluginName("), this.f35364l, ')');
    }
}
