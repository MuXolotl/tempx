package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4746l extends AbstractC3343l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C4746l f9770l = new C4746l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient int f9771l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final transient Object[] f9772l;

    public C4746l(int i, Object[] objArr) {
        super(0);
        this.f9772l = objArr;
        this.f9771l = i;
    }

    @Override // defpackage.AbstractC3810l
    public final int admob() {
        return 0;
    }

    @Override // defpackage.AbstractC3343l, defpackage.AbstractC3810l
    public final int amazon(Object[] objArr) {
        Object[] objArr2 = this.f9772l;
        int i = this.f9771l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC3810l
    public final int billing() {
        return this.f9771l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3105l.vip(i, this.f9771l);
        Object obj = this.f9772l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9771l;
    }

    @Override // defpackage.AbstractC3810l
    public final Object[] smaato() {
        return this.f9772l;
    }
}
