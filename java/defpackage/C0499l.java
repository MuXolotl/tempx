package defpackage;

/* JADX INFO: renamed from: lؑۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0499l extends AbstractC16682l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C11485l f1807l = new C11485l(27);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f1808l;

    public C0499l(String str) {
        super(f1807l);
        this.f1808l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0499l) && this.f1808l.equals(((C0499l) obj).f1808l);
    }

    public final int hashCode() {
        return this.f1808l.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("CoroutineName("), this.f1808l, ')');
    }
}
