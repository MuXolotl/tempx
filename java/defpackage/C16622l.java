package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٖۚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16622l extends AbstractC14401l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient C12903l f32598l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient C10813l f32599l;

    public C16622l(C12903l c12903l, C10813l c10813l) {
        this.f32598l = c12903l;
        this.f32599l = c10813l;
    }

    @Override // defpackage.AbstractC10277l
    public final int amazon(Object[] objArr) {
        return this.f32599l.amazon(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f32598l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f32599l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f32598l.getClass();
        return 1;
    }
}
