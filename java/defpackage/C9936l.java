package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٍۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9936l extends C11506l implements ListIterator {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C9898l f20229l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9936l(C9898l c9898l, int i) {
        super(c9898l, ((List) c9898l.f4493l).listIterator(i));
        this.f20229l = c9898l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C9898l c9898l = this.f20229l;
        boolean zIsEmpty = c9898l.isEmpty();
        amazon().add(obj);
        c9898l.f20132l.f4809l++;
        if (zIsEmpty) {
            c9898l.amazon();
        }
    }

    public final ListIterator amazon() {
        loadAd();
        return (ListIterator) this.f23128l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return amazon().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return amazon().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return amazon().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return amazon().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        amazon().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9936l(C9898l c9898l) {
        super(c9898l);
        this.f20229l = c9898l;
    }
}
