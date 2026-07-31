package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: renamed from: lّؑٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0309l extends AbstractC1642l implements ListIterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractList f1355l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1356l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0309l(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f1356l = i;
        this.f1355l = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f3983l).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f3983l).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return yandex(((ListIterator) this.f3983l).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f3983l).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC1642l
    public final Object yandex(Object obj) {
        int i = this.f1356l;
        AbstractList abstractList = this.f1355l;
        switch (i) {
            case 0:
                return ((C7002l) abstractList).f14661l.apply(obj);
            default:
                return ((C16253l) abstractList).f31809l.apply(obj);
        }
    }
}
