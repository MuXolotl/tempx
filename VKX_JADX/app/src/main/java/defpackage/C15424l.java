package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15424l extends AbstractC14904l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f30139l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f30140l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f30141l;

    public C15424l(int i, Object[] objArr) {
        this.f30139l = objArr;
        this.f30141l = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4654l.adcel(i, this.f30140l);
        Object obj = this.f30139l[i + i + this.f30141l];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30140l;
    }
}
