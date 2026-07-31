package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؕ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3679l extends C11506l implements ListIterator {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C0819l f7762l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3679l(C0819l c0819l, int i) {
        super(c0819l, ((List) c0819l.f2457l).listIterator(i));
        this.f7762l = c0819l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0819l c0819l = this.f7762l;
        boolean zIsEmpty = c0819l.isEmpty();
        crashlytics();
        ((ListIterator) this.f23128l).add(obj);
        if (zIsEmpty) {
            c0819l.amazon();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        crashlytics();
        return ((ListIterator) this.f23128l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        crashlytics();
        return ((ListIterator) this.f23128l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        crashlytics();
        return ((ListIterator) this.f23128l).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        crashlytics();
        return ((ListIterator) this.f23128l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        crashlytics();
        ((ListIterator) this.f23128l).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3679l(C0819l c0819l) {
        super(c0819l);
        this.f7762l = c0819l;
    }
}
