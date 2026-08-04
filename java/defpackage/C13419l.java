package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lْٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llْٖ۠;", "Llَّؓ;", "Llؑۤٓ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C13419l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14541l f26323l;

    public C13419l(C14541l c14541l) {
        this.f26323l = c14541l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        ((C0687l) abstractC14971l).f2172l = this.f26323l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13419l) && AbstractC8576l.yandex(this.f26323l, ((C13419l) obj).f26323l);
    }

    public final int hashCode() {
        return this.f26323l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C0687l c0687l = new C0687l();
        c0687l.f2172l = this.f26323l;
        return c0687l;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f26323l + ")";
    }
}
