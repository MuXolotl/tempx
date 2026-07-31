package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lؘؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5125l implements Iterator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C5125l f11159l = new C5125l(0);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11160l;

    public /* synthetic */ C5125l(int i) {
        this.f11160l = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11160l) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11160l) {
            case 0:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11160l) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
