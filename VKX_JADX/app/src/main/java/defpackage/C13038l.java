package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٌْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13038l extends AbstractC0933l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C13038l f25538l = new C13038l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f25539l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f25540l;

    public C13038l(int i, Object[] objArr) {
        super(2);
        this.f25540l = objArr;
        this.f25539l = i;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return 0;
    }

    @Override // defpackage.AbstractC3810l
    public final int firebase() {
        return this.f25539l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC4603l.subs(i, this.f25539l);
        Object obj = this.f25540l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] mopub() {
        return this.f25540l;
    }

    @Override // defpackage.AbstractC0933l, defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        Object[] objArr2 = this.f25540l;
        int i = this.f25539l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25539l;
    }
}
