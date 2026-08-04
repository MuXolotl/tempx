package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: renamed from: lؘؕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3208l extends AbstractC3343l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10606l f6884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3208l(C10606l c10606l) {
        super(0);
        this.f6884l = c10606l;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        C10606l c10606l = this.f6884l;
        AbstractC3105l.vip(i, c10606l.f21527l);
        Object[] objArr = c10606l.f21526l;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6884l.f21527l;
    }
}
