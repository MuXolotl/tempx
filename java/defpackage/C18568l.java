package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lۚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18568l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f36255l = true;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f36256l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36257l;

    public /* synthetic */ C18568l(int i, Object obj) {
        this.f36257l = i;
        this.f36256l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f36257l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f36255l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f36257l;
        Object obj = this.f36256l;
        switch (i) {
            case 0:
                if (this.f36255l) {
                    this.f36255l = false;
                    return obj;
                }
                C4875l.firebase();
                return null;
            case 1:
                if (this.f36255l) {
                    this.f36255l = false;
                    return obj;
                }
                C4875l.firebase();
                return null;
            default:
                if (this.f36255l) {
                    this.f36255l = false;
                    return ((C1675l) obj).f4040l;
                }
                C4875l.firebase();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f36257l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
