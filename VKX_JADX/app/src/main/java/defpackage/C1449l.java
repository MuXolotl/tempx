package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٌؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٌؒۤ;", "Llَّؓ;", "Llٗۦۤ;", "tv-material"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1449l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2209l f3632l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC6347l f3633l;

    public C1449l(InterfaceC6347l interfaceC6347l, C2209l c2209l) {
        this.f3633l = interfaceC6347l;
        this.f3632l = c2209l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C17558l c17558l = (C17558l) abstractC14971l;
        c17558l.f34181l = this.f3633l;
        c17558l.f34179l = this.f3632l;
    }

    public final boolean equals(Object obj) {
        C1449l c1449l = obj instanceof C1449l ? (C1449l) obj : null;
        return c1449l != null && AbstractC8576l.yandex(this.f3633l, c1449l.f3633l) && AbstractC8576l.yandex(this.f3632l, c1449l.f3632l);
    }

    public final int hashCode() {
        return this.f3632l.hashCode() + (this.f3633l.hashCode() * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C17558l c17558l = new C17558l();
        c17558l.f34181l = this.f3633l;
        c17558l.f34179l = this.f3632l;
        return c17558l;
    }
}
