package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؚؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965l extends AbstractC1186l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final transient Object[] f8147l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final transient int f8148l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final transient int f8149l;

    public C3965l(int i, int i2, Object[] objArr) {
        this.f8147l = objArr;
        this.f8149l = i;
        this.f8148l = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC12442l.smaato(i, this.f8148l);
        Object obj = this.f8147l[(i * 2) + this.f8149l];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8148l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return true;
    }
}
