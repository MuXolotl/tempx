package defpackage;

import java.util.RandomAccess;

/* JADX INFO: renamed from: lؘۖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5884l extends AbstractC9813l implements RandomAccess {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int[] f12401l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3844l[] f12402l;

    public C5884l(C3844l[] c3844lArr, int[] iArr) {
        this.f12402l = c3844lArr;
        this.f12401l = iArr;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C3844l) {
            return super.contains((C3844l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f12402l[i];
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C3844l) {
            return super.indexOf((C3844l) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C3844l) {
            return super.lastIndexOf((C3844l) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f12402l.length;
    }
}
