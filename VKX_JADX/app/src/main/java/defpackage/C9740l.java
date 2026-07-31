package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٍَۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9740l extends AbstractC9813l implements RandomAccess {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f19880l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f19881l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f19882l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f19883l;

    public C9740l(int i, Object[] objArr) {
        this.f19882l = objArr;
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.f19881l = objArr.length;
            this.f19883l = i;
        } else {
            C10754l.remoteconfig(objArr.length, AbstractC2812l.Signature("ring buffer filled size: ", i, " cannot be larger than the buffer size: "));
            throw null;
        }
    }

    public final void ad(int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.f19883l) {
            C10754l.remoteconfig(this.f19883l, AbstractC2812l.Signature("n shouldn't be greater than the buffer size: n = ", i, ", size = "));
            return;
        }
        if (i > 0) {
            int i2 = this.f19880l;
            int i3 = this.f19881l;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f19882l;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f19880l = i4;
            this.f19883l -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f19883l;
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f19882l[(this.f19880l + i) % this.f19881l];
    }

    @Override // defpackage.AbstractC9813l, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C11143l(this);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f19883l;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.f19883l;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.f19883l;
        int i3 = this.f19880l;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.f19882l;
            if (i5 >= i2 || i3 >= this.f19881l) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.AbstractC7095l, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[pro()]);
    }
}
