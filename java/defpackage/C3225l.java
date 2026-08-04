package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؘؕ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؘؕ۟;", "Llَّؓ;", "Llُؓٚ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C3225l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10089l f6925l;

    public C3225l(InterfaceC18556l interfaceC18556l) {
        this.f6925l = interfaceC18556l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C1938l c1938l = (C1938l) abstractC14971l;
        InterfaceC10089l interfaceC10089l = this.f6925l;
        c1938l.f4407l = interfaceC10089l;
        AbstractC5573l.metrica(c1938l).m1384instanceof(interfaceC10089l);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3225l) && AbstractC8576l.yandex(((C3225l) obj).f6925l, this.f6925l);
    }

    public final int hashCode() {
        return this.f6925l.hashCode();
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C1938l c1938l = new C1938l();
        c1938l.f4407l = this.f6925l;
        return c1938l;
    }
}
