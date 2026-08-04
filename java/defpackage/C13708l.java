package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lْ۠ؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13708l extends AbstractC1186l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C13708l f26763l = new C13708l(0, new Object[0]);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f26764l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f26765l;

    public C13708l(int i, Object[] objArr) {
        this.f26764l = objArr;
        this.f26765l = i;
    }

    @Override // defpackage.AbstractC5511l
    public final int admob() {
        return this.f26765l;
    }

    @Override // defpackage.AbstractC1186l, defpackage.AbstractC5511l
    public final int billing(int i, Object[] objArr) {
        Object[] objArr2 = this.f26764l;
        int i2 = this.f26765l;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC5511l
    public final int firebase() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC12442l.smaato(i, this.f26765l);
        Object obj = this.f26764l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.AbstractC5511l
    public final Object[] mopub() {
        return this.f26764l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26765l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return false;
    }
}
