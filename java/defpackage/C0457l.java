package defpackage;

/* JADX INFO: renamed from: lٜؑۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0457l implements InterfaceC2938l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f1687l;

    public C0457l(float f) {
        this.f1687l = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0457l)) {
            return false;
        }
        return C14467l.loadAd(this.f1687l, ((C0457l) obj).f1687l);
    }

    @Override // defpackage.InterfaceC2938l
    public final int firebase(C17385l c17385l, int i) {
        return c17385l.f33850l.mo870l(this.f1687l);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1687l);
    }
}
