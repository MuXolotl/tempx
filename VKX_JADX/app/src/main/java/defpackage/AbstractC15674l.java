package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٕۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15674l implements Iterator, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f30648l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f30649l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object[] f30650l = C7250l.purchase.amazon;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30648l < this.f30649l;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void yandex(int i, int i2, Object[] objArr) {
        this.f30650l = objArr;
        this.f30649l = i;
        this.f30648l = i2;
    }
}
