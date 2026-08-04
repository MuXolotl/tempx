package defpackage;

import java.util.ListIterator;

/* JADX INFO: renamed from: lٖۘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16594l implements ListIterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f32566l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f32567l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32568l;

    public /* synthetic */ AbstractC16594l(int i, int i2, int i3) {
        this.f32568l = i3;
        this.f32567l = i;
        this.f32566l = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        switch (this.f32568l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32568l) {
            case 0:
                return this.f32567l < this.f32566l;
            default:
                return this.f32567l < this.f32566l;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f32568l) {
            case 0:
                return this.f32567l > 0;
            default:
                return this.f32567l > 0;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f32568l) {
            case 0:
                break;
        }
        return this.f32567l;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f32568l) {
            case 0:
                i = this.f32567l;
                break;
            default:
                i = this.f32567l;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        switch (this.f32568l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        switch (this.f32568l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
