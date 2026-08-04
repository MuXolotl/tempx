package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٌْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13229l extends AbstractList implements RandomAccess, InterfaceC5258l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C7088l f26007l;

    public C13229l(C7088l c7088l) {
        this.f26007l = c7088l;
    }

    @Override // defpackage.InterfaceC5258l
    public final List crashlytics() {
        return DesugarCollections.unmodifiableList(this.f26007l.f14853l);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f26007l.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        C14572l c14572l = new C14572l();
        c14572l.f28535l = this.f26007l.iterator();
        return c14572l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C2894l c2894l = new C2894l();
        c2894l.f6297l = this.f26007l.listIterator(i);
        return c2894l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26007l.size();
    }

    @Override // defpackage.InterfaceC5258l
    public final AbstractC7735l startapp(int i) {
        return this.f26007l.startapp(i);
    }

    @Override // defpackage.InterfaceC5258l
    public final void subscription(C7362l c7362l) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC5258l
    public final C13229l adcel() {
        return this;
    }
}
