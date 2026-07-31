package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lًّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Llًّٗ;", "S", "Llَّؓ;", "Llؙْۢ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C12653l<S> extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14931l f24880l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC8714l f24881l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15738l f24882l;

    public C12653l(C15738l c15738l, InterfaceC8714l interfaceC8714l, C14931l c14931l) {
        this.f24882l = c15738l;
        this.f24881l = interfaceC8714l;
        this.f24880l = c14931l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C13191l c13191l = (C13191l) abstractC14971l;
        c13191l.f25801l = this.f24882l;
        c13191l.f25803l = this.f24881l;
        c13191l.f25804l = this.f24880l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12653l)) {
            return false;
        }
        C12653l c12653l = (C12653l) obj;
        return AbstractC8576l.yandex(c12653l.f24882l, this.f24882l) && c12653l.f24881l.equals(this.f24881l);
    }

    public final int hashCode() {
        int iHashCode = this.f24880l.hashCode() * 31;
        C15738l c15738l = this.f24882l;
        return this.f24881l.hashCode() + ((iHashCode + (c15738l != null ? c15738l.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C13191l c13191l = new C13191l(1);
        c13191l.f25801l = this.f24882l;
        c13191l.f25803l = this.f24881l;
        c13191l.f25804l = this.f24880l;
        c13191l.f25802l = -9223372034707292160L;
        return c13191l;
    }
}
