package defpackage;

/* JADX INFO: renamed from: lْٓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13906l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f27207l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f27208l;

    public C13906l(Object obj) {
        super(6);
        this.f27208l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f27207l;
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f27207l) {
            C4875l.firebase();
            return null;
        }
        this.f27207l = true;
        return this.f27208l;
    }
}
