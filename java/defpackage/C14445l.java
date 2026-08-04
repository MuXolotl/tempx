package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٓ۟ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14445l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC16588l f28300l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13101l f28301l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC8237l f28302l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f28303l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f28304l = true;

    public C14445l(AbstractC8237l abstractC8237l, C13101l c13101l, InterfaceC16588l interfaceC16588l) {
        this.f28302l = abstractC8237l;
        this.f28301l = c13101l;
        this.f28300l = interfaceC16588l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f28303l) {
            return false;
        }
        C13101l c13101l = this.f28301l;
        if (c13101l.advert() == 9) {
            this.f28303l = true;
            c13101l.subs((byte) 9);
            if (c13101l.advert() == 10) {
                return false;
            }
            if (c13101l.advert() != 8) {
                c13101l.ads();
                return false;
            }
            AbstractC0576l.tapsense(c13101l, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (c13101l.advert() != 10 || this.f28303l) {
            return true;
        }
        String strMopub = AbstractC14205l.mopub((byte) 9);
        int i = c13101l.f1972l;
        int i2 = i > 0 ? i - 1 : i;
        C7475l c7475l = c13101l.f25629l;
        AbstractC0576l.tapsense(c13101l, AbstractC14814l.ads("Expected ", strMopub, ", but had '", (i == c7475l.f15477l || i2 < 0) ? "EOF" : String.valueOf(c7475l.f15478l[i2]), "' instead"), i2, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z = this.f28304l;
        C13101l c13101l = this.f28301l;
        if (z) {
            this.f28304l = false;
        } else {
            c13101l.firebase(',');
        }
        InterfaceC16588l interfaceC16588l = this.f28300l;
        return new C6125l(this.f28302l, EnumC4737l.OBJ, c13101l, interfaceC16588l.purchase(), null).mopub(interfaceC16588l);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
