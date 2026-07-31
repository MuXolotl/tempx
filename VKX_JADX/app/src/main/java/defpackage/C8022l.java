package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lًٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llًٕۘ;", "Llَّؓ;", "Llؚْٕ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C8022l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC2186l f16705l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2403l f16706l;

    public C8022l(C2403l c2403l, InterfaceC2186l interfaceC2186l) {
        this.f16706l = c2403l;
        this.f16705l = interfaceC2186l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C15539l c15539l = (C15539l) abstractC14971l;
        InterfaceC8605l interfaceC8605lLoadAd = this.f16705l.loadAd(this.f16706l);
        c15539l.m3073l(c15539l.f30356l);
        c15539l.f30356l = interfaceC8605lLoadAd;
        c15539l.m3069l(interfaceC8605lLoadAd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8022l)) {
            return false;
        }
        C8022l c8022l = (C8022l) obj;
        return AbstractC8576l.yandex(this.f16706l, c8022l.f16706l) && AbstractC8576l.yandex(this.f16705l, c8022l.f16705l);
    }

    public final int hashCode() {
        return this.f16705l.hashCode() + (this.f16706l.hashCode() * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        InterfaceC8605l interfaceC8605lLoadAd = this.f16705l.loadAd(this.f16706l);
        C15539l c15539l = new C15539l();
        c15539l.f30356l = interfaceC8605lLoadAd;
        c15539l.m3069l(interfaceC8605lLoadAd);
        return c15539l;
    }
}
