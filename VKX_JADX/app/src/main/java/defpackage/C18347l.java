package defpackage;

/* JADX INFO: renamed from: l٘ۥۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18347l implements InterfaceC0476l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9192l f35860l;

    public C18347l(C9192l c9192l) {
        this.f35860l = c9192l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18347l) && this.f35860l.equals(((C18347l) obj).f35860l);
    }

    public final int hashCode() {
        return this.f35860l.hashCode();
    }

    @Override // defpackage.InterfaceC0476l
    public final Object loadAd(AbstractC0283l abstractC0283l) {
        return this.f35860l;
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f35860l + ")";
    }
}
