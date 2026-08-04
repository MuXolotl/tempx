package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lَٔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَٔۦ;", "Llَّؓ;", "Ll۠ٛ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C10300l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f20986l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14855l f20987l;

    public C10300l(C14855l c14855l, boolean z) {
        this.f20987l = c14855l;
        this.f20986l = z;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C18619l c18619l = (C18619l) abstractC14971l;
        c18619l.f36377l = this.f20987l;
        c18619l.f36376l = this.f20986l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10300l c10300l = obj instanceof C10300l ? (C10300l) obj : null;
        return c10300l != null && this.f20987l.equals(c10300l.f20987l) && this.f20986l == c10300l.f20986l;
    }

    public final int hashCode() {
        return (this.f20987l.hashCode() * 31) + (this.f20986l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C18619l c18619l = new C18619l();
        c18619l.f36377l = this.f20987l;
        c18619l.f36376l = this.f20986l;
        return c18619l;
    }
}
