package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lِؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11556l extends AbstractC12128l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C11556l f23230l = new C11556l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f23231l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f23232l;

    public C11556l(int i, Object[] objArr) {
        super(1);
        this.f23232l = objArr;
        this.f23231l = i;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return 0;
    }

    @Override // defpackage.AbstractC3810l
    public final int firebase() {
        return this.f23231l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC13693l.remoteconfig(i, this.f23231l);
        Object obj = this.f23232l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] mopub() {
        return this.f23232l;
    }

    @Override // defpackage.AbstractC12128l, defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        Object[] objArr2 = this.f23232l;
        int i = this.f23231l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23231l;
    }
}
