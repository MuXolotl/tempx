package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٔؐۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14596l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f28577l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Iterator f28578l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28579l = 1;

    public C14596l(C13276l c13276l, byte b) {
        this.f28577l = c13276l.crashlytics;
        this.f28578l = c13276l.loadAd.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f28579l;
        Iterator it = this.f28578l;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.f28577l > 0 && it.hasNext();
        }
        while (this.f28577l > 0 && it.hasNext()) {
            it.next();
            this.f28577l--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f28579l;
        Iterator it = this.f28578l;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.f28577l;
                this.f28577l = i2 + 1;
                if (i2 >= 0) {
                    return new C1143l(i2, it.next());
                }
                AbstractC14055l.subscription();
                throw null;
            default:
                int i3 = this.f28577l;
                if (i3 != 0) {
                    this.f28577l = i3 - 1;
                    return it.next();
                }
                C4875l.firebase();
                return null;
        }
        while (this.f28577l > 0 && it.hasNext()) {
            it.next();
            this.f28577l--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28579l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14596l(Iterator it) {
        this.f28578l = it;
    }

    public C14596l(C13276l c13276l) {
        this.f28578l = c13276l.loadAd.iterator();
        this.f28577l = c13276l.crashlytics;
    }
}
