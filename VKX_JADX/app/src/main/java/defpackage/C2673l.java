package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؔٗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2673l extends AbstractC14904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2673l f5806l = new C2673l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f5807l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f5808l;

    public C2673l(int i, Object[] objArr) {
        this.f5807l = objArr;
        this.f5808l = i;
    }

    @Override // defpackage.AbstractC11819l
    public final Object[] admob() {
        return this.f5807l;
    }

    @Override // defpackage.AbstractC14904l, defpackage.AbstractC11819l
    public final int amazon(int i, Object[] objArr) {
        Object[] objArr2 = this.f5807l;
        int i2 = this.f5808l;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC11819l
    public final int billing() {
        return this.f5808l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4654l.adcel(i, this.f5808l);
        Object obj = this.f5807l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC11819l
    public final int mopub() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5808l;
    }
}
