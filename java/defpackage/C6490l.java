package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؙٖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6490l extends AbstractC8996l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6490l f13541l = new C6490l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f13542l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f13543l;

    public C6490l(int i, Object[] objArr) {
        this.f13542l = objArr;
        this.f13543l = i;
    }

    @Override // defpackage.AbstractC4477l
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.AbstractC8996l, defpackage.AbstractC4477l
    public final int amazon(Object[] objArr) {
        Object[] objArr2 = this.f13542l;
        int i = this.f13543l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC4477l
    public final int billing() {
        return this.f13543l;
    }

    @Override // defpackage.AbstractC4477l
    public final Object[] firebase() {
        return this.f13542l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC5088l.license(i, this.f13543l);
        Object obj = this.f13542l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC4477l
    public final int mopub() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13543l;
    }
}
