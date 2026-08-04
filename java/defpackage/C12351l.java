package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: renamed from: lّؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12351l extends AbstractC1186l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0547l f24453l;

    public C12351l(C0547l c0547l) {
        this.f24453l = c0547l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0547l c0547l = this.f24453l;
        AbstractC12442l.smaato(i, c0547l.f1928l);
        Object[] objArr = c0547l.f1929l;
        int i2 = i * 2;
        int i3 = c0547l.f1931l;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24453l.f1928l;
    }

    @Override // defpackage.AbstractC5511l
    public final boolean smaato() {
        return true;
    }
}
