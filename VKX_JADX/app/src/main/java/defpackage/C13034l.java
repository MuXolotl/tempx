package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lْؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13034l extends AbstractC0933l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f25530l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient int f25531l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f25532l;

    public C13034l(int i, int i2, Object[] objArr) {
        super(2);
        this.f25532l = objArr;
        this.f25530l = i;
        this.f25531l = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4603l.subs(i, this.f25531l);
        Object obj = this.f25532l[i + i + this.f25530l];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25531l;
    }
}
