package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lَؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llَؚؐ;", "Llَّؓ;", "Llؚؒؐ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C9994l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10137l f20395l;

    public C9994l(InterfaceC10137l interfaceC10137l) {
        this.f20395l = interfaceC10137l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C6967l c6967l = (C6967l) abstractC14971l;
        InterfaceC10137l interfaceC10137l = c6967l.f14640l;
        InterfaceC10137l interfaceC10137l2 = this.f20395l;
        if (AbstractC8576l.yandex(interfaceC10137l2, interfaceC10137l)) {
            return;
        }
        c6967l.f14640l = interfaceC10137l2;
        c6967l.mo2588l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9994l) {
            return AbstractC8576l.yandex(((C9994l) obj).f20395l, this.f20395l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20395l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C6967l c6967l = new C6967l();
        c6967l.f14640l = this.f20395l;
        return c6967l;
    }
}
