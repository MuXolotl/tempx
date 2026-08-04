package defpackage;

import java.util.AbstractMap;

/* JADX INFO: renamed from: lِؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2871l extends AbstractC13582l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C18126l f6235l;

    public C2871l(C18126l c18126l) {
        this.f6235l = c18126l;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C18126l c18126l = this.f6235l;
        AbstractC17122l.mopub(i, c18126l.f35418l);
        Object[] objArr = c18126l.f35419l;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6235l.f35418l;
    }
}
