package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lَٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَٓۨ;", "Llَّؓ;", "Llؙؕۚ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C10286l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f20928l;

    public C10286l(boolean z) {
        this.f20928l = z;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C3243l c3243l = (C3243l) abstractC14971l;
        c3243l.f6937l = 1.0f;
        c3243l.f6936l = this.f20928l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10286l ? (C10286l) obj : null) == null) {
            return false;
        }
        return this.f20928l == ((C10286l) obj).f20928l;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + (this.f20928l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C3243l c3243l = new C3243l();
        c3243l.f6937l = 1.0f;
        c3243l.f6936l = this.f20928l;
        return c3243l;
    }
}
