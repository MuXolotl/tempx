package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًۤۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8383l extends AbstractC3343l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f17339l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final transient int f17340l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f17341l;

    public C8383l(int i, int i2, Object[] objArr) {
        super(0);
        this.f17341l = objArr;
        this.f17339l = i;
        this.f17340l = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3105l.vip(i, this.f17340l);
        Object obj = this.f17341l[i + i + this.f17339l];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17340l;
    }
}
