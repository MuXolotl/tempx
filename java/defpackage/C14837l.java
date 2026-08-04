package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lِٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llِٔۗ;", "Llَّؓ;", "Llَٓٞ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C14837l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3000l f29046l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15738l f29047l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18656l f29048l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13551l f29049l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0274l f29050l;

    public C14837l(C18656l c18656l, C15738l c15738l, C3000l c3000l, C0274l c0274l, C13551l c13551l) {
        this.f29048l = c18656l;
        this.f29047l = c15738l;
        this.f29046l = c3000l;
        this.f29050l = c0274l;
        this.f29049l = c13551l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C10281l c10281l = (C10281l) abstractC14971l;
        c10281l.getClass();
        c10281l.f20922l = this.f29047l;
        c10281l.f20920l = this.f29046l;
        c10281l.f20921l = this.f29050l;
        c10281l.f20923l = this.f29049l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14837l) {
            C14837l c14837l = (C14837l) obj;
            return this.f29048l.equals(c14837l.f29048l) && AbstractC8576l.yandex(this.f29047l, c14837l.f29047l) && this.f29046l.equals(c14837l.f29046l) && AbstractC8576l.yandex(this.f29050l, c14837l.f29050l) && this.f29049l == c14837l.f29049l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29049l.hashCode() + ((this.f29050l.yandex.hashCode() + ((this.f29046l.yandex.hashCode() + ((this.f29047l.hashCode() + (this.f29048l.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C10281l c10281l = new C10281l();
        c10281l.f20922l = this.f29047l;
        c10281l.f20920l = this.f29046l;
        c10281l.f20921l = this.f29050l;
        c10281l.f20923l = this.f29049l;
        return c10281l;
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.f29048l + ", veilAnimation=" + this.f29047l + ", enter=" + this.f29046l + ", exit=" + this.f29050l + ", mutableTransformState=" + this.f29049l + ")";
    }
}
