package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lُ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11391l extends AbstractC8909l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final transient Object f22968l;

    public C11391l(Object obj) {
        super(2);
        this.f22968l = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22968l.equals(obj);
    }

    @Override // defpackage.AbstractC8909l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22968l.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C13906l(this.f22968l);
    }

    @Override // defpackage.AbstractC3810l
    public final int remoteconfig(Object[] objArr) {
        objArr[0] = this.f22968l;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f22968l.toString();
        return AbstractC9361l.ad(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
