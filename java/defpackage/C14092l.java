package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lِٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14092l extends AbstractC9813l implements InterfaceC5319l, RandomAccess, Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Enum[] f27452l;

    public C14092l(Enum[] enumArr) {
        this.f27452l = enumArr;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) AbstractC8669l.m2418throw(r2.ordinal(), this.f27452l)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f27452l;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        C18262l.adcel(AbstractC12589l.premium(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC8669l.m2418throw(iOrdinal, this.f27452l)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) AbstractC8669l.m2418throw(iOrdinal, this.f27452l)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f27452l.length;
    }
}
