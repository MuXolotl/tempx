package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: renamed from: lِِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17066l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5047l f33221l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f33222l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f33223l;

    public C17066l(C5047l c5047l) {
        this.f33221l = c5047l;
        this.f33222l = ((AbstractList) c5047l).modCount;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f33223l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f33223l) {
            C4875l.firebase();
            return null;
        }
        this.f33223l = true;
        yandex();
        return this.f33221l.f10315l;
    }

    @Override // java.util.Iterator
    public final void remove() {
        yandex();
        this.f33221l.clear();
    }

    public final void yandex() {
        C5047l c5047l = this.f33221l;
        int i = ((AbstractList) c5047l).modCount;
        int i2 = this.f33222l;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c5047l).modCount + "; expected: " + i2);
    }
}
