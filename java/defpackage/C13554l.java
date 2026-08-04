package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْٟ;", "Llَّؓ;", "Llؘِٛ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C13554l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14632l f26571l;

    public C13554l(C14632l c14632l) {
        this.f26571l = c14632l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C11665l c11665l = (C11665l) abstractC14971l;
        C14632l c14632l = c11665l.f23379l;
        C14632l c14632l2 = this.f26571l;
        if (!AbstractC8576l.yandex(c14632l2, c14632l)) {
            AbstractC3700l.admob(c11665l, c14632l2.f28637l);
        }
        c11665l.f23379l = c14632l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13554l) && AbstractC8576l.yandex(this.f26571l, ((C13554l) obj).f26571l);
    }

    public final int hashCode() {
        return this.f26571l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C11665l c11665l = new C11665l();
        c11665l.f23379l = this.f26571l;
        return c11665l;
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.f26571l + ")";
    }
}
