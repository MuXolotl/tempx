package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: renamed from: lُٙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11129l implements Iterator, InterfaceC14029l, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Iterator f22340l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f22341l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f22342l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC14029l f22343l;

    public final void amazon(InterfaceC14029l interfaceC14029l, Object obj) {
        this.f22341l = obj;
        this.f22342l = 3;
        this.f22343l = interfaceC14029l;
    }

    public final RuntimeException crashlytics() {
        int i = this.f22342l;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f22342l);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f22342l;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw crashlytics();
                }
                if (this.f22340l.hasNext()) {
                    this.f22342l = 2;
                    return true;
                }
                this.f22340l = null;
            }
            this.f22342l = 5;
            InterfaceC14029l interfaceC14029l = this.f22343l;
            this.f22343l = null;
            interfaceC14029l.subs(Unit.INSTANCE);
        }
    }

    @Override // defpackage.InterfaceC14029l
    public final InterfaceC12932l metrica() {
        return C17218l.f33421l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f22342l;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            C4875l.firebase();
            return null;
        }
        if (i == 2) {
            this.f22342l = 1;
            return this.f22340l.next();
        }
        if (i != 3) {
            throw crashlytics();
        }
        this.f22342l = 0;
        Object obj = this.f22341l;
        this.f22341l = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.InterfaceC14029l
    public final void subs(Object obj) {
        AbstractC2829l.crashlytics(obj);
        this.f22342l = 4;
    }
}
