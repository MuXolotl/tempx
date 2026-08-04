package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: lٖؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4926l extends AbstractC9743l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Comparator[] f10036l;

    public C4926l(C11406l c11406l, C11406l c11406l2) {
        this.f10036l = new Comparator[]{c11406l, c11406l2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f10036l;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4926l) {
            return Arrays.equals(this.f10036l, ((C4926l) obj).f10036l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10036l);
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("Ordering.compound("), Arrays.toString(this.f10036l), ")");
    }
}
