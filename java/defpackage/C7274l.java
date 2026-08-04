package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lؚٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7274l extends C11521l implements ListIterator {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9813l f15117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7274l(AbstractC9813l abstractC9813l, int i) {
        super(0, abstractC9813l);
        this.f15117l = abstractC9813l;
        int iPro = abstractC9813l.pro();
        if (i < 0 || i > iPro) {
            C18262l.adcel(AbstractC12589l.premium(i, iPro, "index: ", ", size: "));
            throw null;
        }
        this.f23174l = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23174l > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23174l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f23174l - 1;
        this.f23174l = i;
        return this.f15117l.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23174l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
