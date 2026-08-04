package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18541l extends AbstractC2877l implements Iterator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C3752l f36197l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C3752l f36198l;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36197l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3752l c3752l = this.f36197l;
        C3752l c3752l2 = this.f36198l;
        this.f36197l = (c3752l == c3752l2 || c3752l2 == null) ? null : c3752l.f7834l;
        return c3752l;
    }

    @Override // defpackage.AbstractC2877l
    public final void yandex(C3752l c3752l) {
        C3752l c3752l2 = null;
        if (this.f36198l == c3752l && c3752l == this.f36197l) {
            this.f36197l = null;
            this.f36198l = null;
        }
        C3752l c3752l3 = this.f36198l;
        if (c3752l3 == c3752l) {
            this.f36198l = c3752l3.f7837l;
        }
        C3752l c3752l4 = this.f36197l;
        if (c3752l4 == c3752l) {
            C3752l c3752l5 = this.f36198l;
            if (c3752l4 != c3752l5 && c3752l5 != null) {
                c3752l2 = c3752l4.f7834l;
            }
            this.f36197l = c3752l2;
        }
    }
}
