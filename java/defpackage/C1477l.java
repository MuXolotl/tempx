package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؒۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC16588l f3684l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13101l f3685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC8237l f3686l;

    public C1477l(AbstractC8237l abstractC8237l, C13101l c13101l, InterfaceC16588l interfaceC16588l) {
        this.f3686l = abstractC8237l;
        this.f3685l = c13101l;
        this.f3684l = interfaceC16588l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3685l.advert() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC16588l interfaceC16588l = this.f3684l;
        return new C6125l(this.f3686l, EnumC4737l.OBJ, this.f3685l, interfaceC16588l.purchase(), null).mopub(interfaceC16588l);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
