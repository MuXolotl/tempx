package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lٍٍۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9441l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f19303l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f19304l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11421l f19305l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C12518l f19306l;

    public /* synthetic */ C9441l(C12518l c12518l, C11421l c11421l, int i) {
        this.f19306l = c12518l;
        this.f19305l = c11421l;
        int i2 = i & 31;
        this.f19304l = i2;
        this.f19303l = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19304l >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f19304l;
        C12518l c12518l = this.f19306l;
        AbstractC1068l abstractC1068l = c12518l.loadAd;
        int iMopub = abstractC1068l.mopub();
        Object objCast = this.f19305l.loadAd.cast(i >= iMopub ? c12518l.crashlytics.subs(i - iMopub) : abstractC1068l.subs(i));
        int i2 = this.f19303l;
        if (i2 == 0) {
            this.f19304l = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.f19303l >>>= iNumberOfTrailingZeros;
        this.f19304l += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
