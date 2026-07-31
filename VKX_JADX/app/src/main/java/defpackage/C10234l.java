package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍَِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10234l extends AbstractC2877l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8348l f20853l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f20854l = true;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C3752l f20855l;

    public C10234l(C8348l c8348l) {
        this.f20853l = c8348l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f20854l) {
            return this.f20853l.f17277l != null;
        }
        C3752l c3752l = this.f20855l;
        return (c3752l == null || c3752l.f7834l == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20854l) {
            this.f20854l = false;
            this.f20855l = this.f20853l.f17277l;
        } else {
            C3752l c3752l = this.f20855l;
            this.f20855l = c3752l != null ? c3752l.f7834l : null;
        }
        return this.f20855l;
    }

    @Override // defpackage.AbstractC2877l
    public final void yandex(C3752l c3752l) {
        C3752l c3752l2 = this.f20855l;
        if (c3752l == c3752l2) {
            C3752l c3752l3 = c3752l2.f7837l;
            this.f20855l = c3752l3;
            this.f20854l = c3752l3 == null;
        }
    }
}
