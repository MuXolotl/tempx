package defpackage;

/* JADX INFO: renamed from: lِؓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11572l implements InterfaceC16011l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17477l f23246l;

    public C11572l(InterfaceC17477l interfaceC17477l) {
        this.f23246l = interfaceC17477l;
    }

    public final boolean equals(Object obj) {
        C11572l c11572l = obj instanceof C11572l ? (C11572l) obj : null;
        return this.f23246l.equals(c11572l != null ? c11572l.f23246l : null);
    }

    public final int hashCode() {
        return this.f23246l.hashCode();
    }

    public final String toString() {
        return "Class{" + this.f23246l.ad() + '}';
    }

    @Override // defpackage.InterfaceC16011l
    public final AbstractC18041l yandex() {
        return this.f23246l.ad();
    }
}
