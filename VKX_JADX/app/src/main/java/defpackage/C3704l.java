package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: renamed from: lؕۡۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3704l extends AbstractC14904l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5526l f7776l;

    public C3704l(C5526l c5526l) {
        this.f7776l = c5526l;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C5526l c5526l = this.f7776l;
        AbstractC4654l.adcel(i, c5526l.f11798l);
        Object[] objArr = c5526l.f11799l;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7776l.f11798l;
    }
}
