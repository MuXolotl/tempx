package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؔٛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2742l extends AbstractC3486l implements RandomAccess {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2742l f5945l = new C2742l(new Object[0], 0, false);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f5946l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f5947l;

    public C2742l(Object[] objArr, int i, boolean z) {
        super(z);
        this.f5947l = objArr;
        this.f5946l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        amazon();
        if (i < 0 || i > (i2 = this.f5946l)) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f5946l, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f5947l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f5947l, i, objArr2, i3, this.f5946l - i);
            this.f5947l = objArr2;
        }
        this.f5947l[i] = obj;
        this.f5946l++;
        ((AbstractList) this).modCount++;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f5946l) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f5946l, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f5947l[i];
    }

    @Override // defpackage.InterfaceC14009l
    public final /* bridge */ /* synthetic */ InterfaceC14009l purchase(int i) {
        if (i >= this.f5946l) {
            return new C2742l(Arrays.copyOf(this.f5947l, i), this.f5946l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        billing(i);
        Object[] objArr = this.f5947l;
        Object obj = objArr[i];
        int i2 = this.f5946l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f5946l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        amazon();
        billing(i);
        Object[] objArr = this.f5947l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5946l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        amazon();
        int i = this.f5946l;
        Object[] objArr = this.f5947l;
        if (i == objArr.length) {
            this.f5947l = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5947l;
        int i2 = this.f5946l;
        this.f5946l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
