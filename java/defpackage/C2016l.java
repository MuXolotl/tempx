package defpackage;

/* JADX INFO: renamed from: lٟٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2016l extends AbstractC13582l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C2016l f4539l = new C2016l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f4540l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f4541l;

    public C2016l(int i, Object[] objArr) {
        this.f4540l = objArr;
        this.f4541l = i;
    }

    @Override // defpackage.AbstractC10277l
    public final Object[] admob() {
        return this.f4540l;
    }

    @Override // defpackage.AbstractC13582l, defpackage.AbstractC10277l
    public final int amazon(Object[] objArr) {
        Object[] objArr2 = this.f4540l;
        int i = this.f4541l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC10277l
    public final int billing() {
        return this.f4541l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC17122l.mopub(i, this.f4541l);
        Object obj = this.f4540l[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.AbstractC10277l
    public final int mopub() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4541l;
    }
}
