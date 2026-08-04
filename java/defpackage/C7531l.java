package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: lؚۜٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7531l implements ListIterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15534l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f15535l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15536l;

    public C7531l(int i, int i2, List list) {
        this.f15536l = i2;
        switch (i2) {
            case 1:
                this.f15535l = list;
                this.f15534l = i;
                break;
            default:
                this.f15535l = list;
                this.f15534l = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                int i2 = this.f15534l + 1;
                this.f15534l = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.f15534l, obj);
                this.f15534l++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                return this.f15534l < list.size() - 1;
            default:
                return this.f15534l < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f15536l) {
            case 0:
                return this.f15534l >= 0;
            default:
                return this.f15534l > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                int i2 = this.f15534l + 1;
                this.f15534l = i2;
                return list.get(i2);
            default:
                int i3 = this.f15534l;
                this.f15534l = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f15536l) {
            case 0:
                return this.f15534l + 1;
            default:
                return this.f15534l;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                int i2 = this.f15534l;
                this.f15534l = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.f15534l - 1;
                this.f15534l = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f15536l) {
            case 0:
                return this.f15534l;
            default:
                return this.f15534l - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                list.remove(this.f15534l);
                this.f15534l--;
                break;
            default:
                int i2 = this.f15534l - 1;
                this.f15534l = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f15536l;
        List list = this.f15535l;
        switch (i) {
            case 0:
                list.set(this.f15534l, obj);
                break;
            default:
                list.set(this.f15534l, obj);
                break;
        }
    }
}
