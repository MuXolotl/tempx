package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: lَؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4187l extends AbstractSet {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17762l f8602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8603l;

    public C4187l(C17762l c17762l, int i) {
        this.f8602l = c17762l;
        this.f8603l = i;
    }

    public final int amazon() {
        int i = this.f8603l;
        if (i == -1) {
            return 0;
        }
        return this.f8602l.f34588l[i];
    }

    public final int billing() {
        return this.f8602l.f34588l[this.f8603l + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f8602l.f34589l, amazon(), billing(), obj, this.f8603l == -1 ? C17762l.f34586l : C13059l.loadAd) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15037l(2, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return billing() - amazon();
    }
}
