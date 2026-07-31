package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؖؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3862l extends AbstractC6005l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f8003l;

    public C3862l(ArrayList arrayList) {
        this.f8003l = arrayList;
    }

    @Override // defpackage.AbstractC6005l
    public final Object ad(int i) {
        return this.f8003l.remove(AbstractC16901l.premium(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f8003l.add(AbstractC16901l.applovin(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f8003l.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f8003l.get(AbstractC16901l.premium(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C8772l(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C8772l(this, 0);
    }

    @Override // defpackage.AbstractC6005l
    public final int pro() {
        return this.f8003l.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f8003l.set(AbstractC16901l.premium(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C8772l(this, i);
    }
}
