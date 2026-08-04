package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: lُۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11406l extends AbstractC9743l implements Serializable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC9743l f22969l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17302l f22970l;

    public C11406l(InterfaceC17302l interfaceC17302l, AbstractC9743l abstractC9743l) {
        this.f22970l = interfaceC17302l;
        this.f22969l = abstractC9743l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC17302l interfaceC17302l = this.f22970l;
        return this.f22969l.compare(interfaceC17302l.apply(obj), interfaceC17302l.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11406l)) {
            return false;
        }
        C11406l c11406l = (C11406l) obj;
        return this.f22970l.equals(c11406l.f22970l) && this.f22969l.equals(c11406l.f22969l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22970l, this.f22969l});
    }

    public final String toString() {
        return this.f22969l + ".onResultOf(" + this.f22970l + ")";
    }
}
