package defpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lؙٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4720l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f9580l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9581l = 0;

    public C4720l(C0046l c0046l) {
        AbstractC15674l[] abstractC15674lArr = new AbstractC15674l[8];
        for (int i = 0; i < 8; i++) {
            abstractC15674lArr[i] = new C10326l(this);
        }
        this.f9580l = new C9468l(c0046l, abstractC15674lArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9581l;
        Object obj = this.f9580l;
        switch (i) {
            case 0:
                return ((Enumeration) obj).hasMoreElements();
            case 1:
                return ((C9468l) obj).f15113l;
            case 2:
                return ((C11521l) obj).hasNext();
            default:
                return ((Iterator) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9581l;
        Object obj = this.f9580l;
        switch (i) {
            case 0:
                return ((Enumeration) obj).nextElement();
            case 1:
                return (Map.Entry) ((C9468l) obj).next();
            case 2:
                return ((C11521l) obj).next();
            default:
                return (AbstractC14782l) ((Iterator) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9581l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((C9468l) this.f9580l).remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C4720l(Object[] objArr) {
        this.f9580l = new C11521l(1, objArr);
    }

    public C4720l(Enumeration enumeration) {
        this.f9580l = enumeration;
    }

    public C4720l(C4623l c4623l) {
        this.f9580l = c4623l.f9392l.iterator();
    }
}
