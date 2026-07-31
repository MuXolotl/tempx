package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؑۗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؑۗٓ;", "Llَّؓ;", "Llًٍُ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0520l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC11780l f1842l;

    public C0520l(InterfaceC11780l interfaceC11780l, C1306l c1306l) {
        this.f1842l = interfaceC11780l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C9399l) abstractC14971l).f19244l = this.f1842l;
    }

    public final boolean equals(Object obj) {
        C0520l c0520l = obj instanceof C0520l ? (C0520l) obj : null;
        if (c0520l == null) {
            return false;
        }
        return AbstractC8576l.yandex(this.f1842l, c0520l.f1842l);
    }

    public final int hashCode() {
        return this.f1842l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C9399l c9399l = new C9399l();
        c9399l.f19244l = this.f1842l;
        return c9399l;
    }
}
