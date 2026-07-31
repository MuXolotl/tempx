package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؙْٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6627l extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f13865l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f13866l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int[] f13867l;

    public C6627l(int i, int i2, int[] iArr) {
        this.f13867l = iArr;
        this.f13866l = i;
        this.f13865l = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC9966l.firebase(((Integer) obj).intValue(), this.f13866l, this.f13865l, this.f13867l) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6627l)) {
            return super.equals(obj);
        }
        C6627l c6627l = (C6627l) obj;
        int size = size();
        if (c6627l.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f13867l[this.f13866l + i] != c6627l.f13867l[c6627l.f13866l + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC12442l.smaato(i, size());
        return Integer.valueOf(this.f13867l[this.f13866l + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f13866l; i2 < this.f13865l; i2++) {
            i = (i * 31) + this.f13867l[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f13865l;
        int i2 = this.f13866l;
        int iFirebase = AbstractC9966l.firebase(iIntValue, i2, i, this.f13867l);
        if (iFirebase >= 0) {
            return iFirebase - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f13865l;
            do {
                i2--;
                i = this.f13866l;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
            } while (this.f13867l[i2] != iIntValue);
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        AbstractC12442l.smaato(i, size());
        int i2 = this.f13866l + i;
        int[] iArr = this.f13867l;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13865l - this.f13866l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractC12442l.adcel(i, i2, size());
        if (i == i2) {
            return Collections.EMPTY_LIST;
        }
        int i3 = this.f13866l;
        return new C6627l(i + i3, i3 + i2, this.f13867l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f13867l;
        int i = this.f13866l;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f13865l) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
