package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘؖۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4344l extends AbstractC2837l implements Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C4344l f8869l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17963l f8870l;

    static {
        C17963l c17963l = C17963l.f34955l;
        f8869l = new C4344l(C17963l.f34955l);
    }

    public C4344l() {
        this(new C17963l());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f8870l.yandex(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.f8870l.amazon();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8870l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8870l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8870l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C17963l c17963l = this.f8870l;
        c17963l.getClass();
        return new C0437l(c17963l, 1);
    }

    @Override // defpackage.AbstractC2837l
    public final int pro() {
        return this.f8870l.f34966l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C17963l c17963l = this.f8870l;
        c17963l.amazon();
        int iMopub = c17963l.mopub(obj);
        if (iMopub < 0) {
            return false;
        }
        c17963l.firebase(iMopub);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.f8870l.amazon();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.f8870l.amazon();
        return super.retainAll(collection);
    }

    public C4344l(C17963l c17963l) {
        this.f8870l = c17963l;
    }
}
