package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lَّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12289l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f24358l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C7515l f24359l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5191l f24360l;

    public C12289l(C8710l c8710l) {
        C5191l c5191l = new C5191l(c8710l);
        this.f24360l = c5191l;
        this.f24359l = new C7515l(c5191l.yandex());
        this.f24358l = c8710l.f17921l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24358l > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f24359l.hasNext()) {
            this.f24359l = new C7515l(this.f24360l.yandex());
        }
        this.f24358l--;
        return Byte.valueOf(this.f24359l.yandex());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
