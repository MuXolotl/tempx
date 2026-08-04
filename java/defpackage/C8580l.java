package defpackage;

/* JADX INFO: renamed from: lٌٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8580l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17694l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f17695l;

    public C8580l(Object obj) {
        super(0);
        this.f17695l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f17694l;
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f17694l) {
            C4875l.firebase();
            return null;
        }
        this.f17694l = true;
        return this.f17695l;
    }
}
