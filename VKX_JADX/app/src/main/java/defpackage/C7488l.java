package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lَؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7488l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f15486l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f15487l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f15488l;

    public C7488l(int i, int i2, int i3) {
        if (i3 == 0) {
            C8339l.metrica("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            C8339l.metrica("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f15488l = i;
        this.f15487l = AbstractC17764l.amazon(i, i2, i3);
        this.f15486l = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7488l)) {
            return false;
        }
        if (isEmpty() && ((C7488l) obj).isEmpty()) {
            return true;
        }
        C7488l c7488l = (C7488l) obj;
        return this.f15488l == c7488l.f15488l && this.f15487l == c7488l.f15487l && this.f15486l == c7488l.f15486l;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f15488l * 31) + this.f15487l) * 31) + this.f15486l;
    }

    public boolean isEmpty() {
        int i = this.f15487l;
        int i2 = this.f15486l;
        int i3 = this.f15488l;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C16991l(this.f15488l, this.f15487l, this.f15486l);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f15487l;
        int i2 = this.f15486l;
        int i3 = this.f15488l;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
