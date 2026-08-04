package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: renamed from: lِّؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11785l extends AbstractC0933l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C8418l f23594l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11785l(C8418l c8418l) {
        super(2);
        this.f23594l = c8418l;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C8418l c8418l = this.f23594l;
        AbstractC4603l.subs(i, c8418l.f17427l);
        Object[] objArr = c8418l.f17426l;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23594l.f17427l;
    }
}
