package defpackage;

/* JADX INFO: renamed from: lُٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10813l extends AbstractC13582l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f21854l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f21855l = 1;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f21856l;

    public C10813l(int i, Object[] objArr) {
        this.f21854l = objArr;
        this.f21856l = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC17122l.mopub(i, this.f21855l);
        Object obj = this.f21854l[i + i + this.f21856l];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21855l;
    }
}
