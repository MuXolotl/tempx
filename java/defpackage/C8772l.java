package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٌٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772l implements ListIterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18066l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f18067l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18068l = 0;

    public C8772l(C8892l c8892l, int i) {
        this.f18066l = c8892l;
        this.f18067l = ((List) c8892l.f18267l).listIterator(AbstractC16901l.applovin(i, c8892l));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f18068l) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f18067l;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f18068l;
        Object obj = this.f18067l;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((C9987l) obj).f20387l < ((C15590l) this.f18066l).f30441l - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f18068l;
        Object obj = this.f18067l;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((C9987l) obj).f20387l >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f18068l;
        Object obj = this.f18067l;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                C9987l c9987l = (C9987l) obj;
                int i2 = c9987l.f20387l + 1;
                C15590l c15590l = (C15590l) this.f18066l;
                AbstractC18263l.crashlytics(i2, c15590l.f30441l);
                c9987l.f20387l = i2;
                return c15590l.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int iSmaato;
        int i = this.f18068l;
        Object obj = this.f18066l;
        Object obj2 = this.f18067l;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iSmaato = AbstractC14055l.smaato((C3862l) obj);
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                iSmaato = AbstractC14055l.smaato((C8892l) obj);
                break;
            default:
                return ((C9987l) obj2).f20387l + 1;
        }
        return iSmaato - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f18068l;
        Object obj = this.f18067l;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                C9987l c9987l = (C9987l) obj;
                int i2 = c9987l.f20387l;
                C15590l c15590l = (C15590l) this.f18066l;
                AbstractC18263l.crashlytics(i2, c15590l.f30441l);
                c9987l.f20387l = i2 - 1;
                return c15590l.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int iSmaato;
        int i = this.f18068l;
        Object obj = this.f18066l;
        Object obj2 = this.f18067l;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iSmaato = AbstractC14055l.smaato((C3862l) obj);
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                iSmaato = AbstractC14055l.smaato((C8892l) obj);
                break;
            default:
                return ((C9987l) obj2).f20387l;
        }
        return iSmaato - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f18068l) {
            case 0:
                ((ListIterator) this.f18067l).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f18068l) {
            case 0:
                ((ListIterator) this.f18067l).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C8772l(C3862l c3862l, int i) {
        this.f18066l = c3862l;
        this.f18067l = c3862l.f8003l.listIterator(AbstractC16901l.applovin(i, c3862l));
    }

    public C8772l(C9987l c9987l, C15590l c15590l) {
        this.f18067l = c9987l;
        this.f18066l = c15590l;
    }
}
