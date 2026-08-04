package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٌْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13244l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f26016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f26017l;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f26017l;
        if (i == 0) {
            this.f26017l = 3;
            yandex();
            return this.f26017l == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        C8339l.metrica("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f26017l;
        if (i == 1) {
            this.f26017l = 0;
            return this.f26016l;
        }
        if (i != 2) {
            this.f26017l = 3;
            yandex();
            if (this.f26017l == 1) {
                this.f26017l = 0;
                return this.f26016l;
            }
        }
        C4875l.firebase();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void yandex();
}
