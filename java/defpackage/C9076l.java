package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9076l extends AbstractC12698l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient C4006l f18662l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient C15424l f18663l;

    public C9076l(C4006l c4006l, C15424l c15424l) {
        this.f18662l = c4006l;
        this.f18663l = c15424l;
    }

    @Override // defpackage.AbstractC11819l
    public final int amazon(int i, Object[] objArr) {
        return this.f18663l.amazon(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18662l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f18663l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
