package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9752l extends AbstractC8909l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient C14885l f19886l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient C13034l f19887l;

    public C9752l(C14885l c14885l, C13034l c13034l) {
        super(2);
        this.f19886l = c14885l;
        this.f19887l = c13034l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19886l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f19887l.listIterator(0);
    }

    @Override // defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        return this.f19887l.remoteconfig(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19886l.f29272l;
    }
}
