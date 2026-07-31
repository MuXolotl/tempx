package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lؙؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6255l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13201l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13202l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f13203l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17501l f13204l;

    public C6255l(C17501l c17501l) {
        this.f13204l = c17501l;
        this.f13203l = c17501l.f34088l;
        this.f13202l = c17501l.isEmpty() ? -1 : 0;
        this.f13201l = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13202l >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17501l c17501l = this.f13204l;
        if (c17501l.f34088l != this.f13203l) {
            C8339l.mopub();
            return null;
        }
        if (!hasNext()) {
            C4875l.firebase();
            return null;
        }
        int i = this.f13202l;
        this.f13201l = i;
        Object obj = c17501l.admob()[i];
        int i2 = this.f13202l + 1;
        if (i2 >= c17501l.f34087l) {
            i2 = -1;
        }
        this.f13202l = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C17501l c17501l = this.f13204l;
        if (c17501l.f34088l != this.f13203l) {
            C8339l.mopub();
            return;
        }
        AbstractC12442l.ads("no calls to next() since the last call to remove()", this.f13201l >= 0);
        this.f13203l += 32;
        c17501l.remove(c17501l.admob()[this.f13201l]);
        this.f13202l--;
        this.f13201l = -1;
    }
}
