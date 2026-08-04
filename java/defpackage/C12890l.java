package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lّ۟٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llّ۟٘;", "Llَّؓ;", "Llٌؘؙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C12890l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final EnumC7283l f25347l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5138l f25348l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC5793l f25349l;

    public C12890l(InterfaceC5793l interfaceC5793l, C5138l c5138l, EnumC7283l enumC7283l) {
        this.f25349l = interfaceC5793l;
        this.f25348l = c5138l;
        this.f25347l = enumC7283l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C8604l c8604l = (C8604l) abstractC14971l;
        c8604l.f17751l = this.f25349l;
        c8604l.f17749l = this.f25348l;
        c8604l.f17750l = this.f25347l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12890l)) {
            return false;
        }
        C12890l c12890l = (C12890l) obj;
        return AbstractC8576l.yandex(this.f25349l, c12890l.f25349l) && AbstractC8576l.yandex(this.f25348l, c12890l.f25348l) && this.f25347l == c12890l.f25347l;
    }

    public final int hashCode() {
        return this.f25347l.hashCode() + ((((this.f25348l.hashCode() + (this.f25349l.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C8604l c8604l = new C8604l();
        c8604l.f17751l = this.f25349l;
        c8604l.f17749l = this.f25348l;
        c8604l.f17750l = this.f25347l;
        return c8604l;
    }
}
