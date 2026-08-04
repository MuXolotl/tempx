package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8834l extends AbstractC10465l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient C8383l f18140l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient C14727l f18141l;

    public C8834l(C14727l c14727l, C8383l c8383l) {
        super(0);
        this.f18141l = c14727l;
        this.f18140l = c8383l;
    }

    @Override // defpackage.AbstractC3810l
    public final int amazon(Object[] objArr) {
        return this.f18140l.amazon(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18141l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f18140l.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18141l.f28799l;
    }
}
