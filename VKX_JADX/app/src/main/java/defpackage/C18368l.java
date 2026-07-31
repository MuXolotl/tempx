package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l٘ۧٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18368l extends AbstractC7021l implements RandomAccess {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18368l f35882l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f35883l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f35884l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f35885l;

    static {
        Object[] objArr = new Object[0];
        f35883l = objArr;
        f35882l = new C18368l(objArr, 0, false);
    }

    public C18368l(Object[] objArr, int i, boolean z) {
        this.f14716l = z;
        this.f35885l = objArr;
        this.f35884l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        amazon();
        if (i < 0 || i > (i2 = this.f35884l)) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f35884l, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f35885l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC15560l.vip(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f35885l, 0, objArr2, 0, i);
            System.arraycopy(this.f35885l, i, objArr2, i + 1, this.f35884l - i);
            this.f35885l = objArr2;
        }
        this.f35885l[i] = obj;
        this.f35884l++;
        ((AbstractList) this).modCount++;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f35884l) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f35884l, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f35885l[i];
    }

    @Override // defpackage.AbstractC7021l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        billing(i);
        Object[] objArr = this.f35885l;
        Object obj = objArr[i];
        int i2 = this.f35884l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f35884l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        amazon();
        billing(i);
        Object[] objArr = this.f35885l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35884l;
    }

    @Override // defpackage.InterfaceC9858l
    public final InterfaceC9858l yandex(int i) {
        if (i >= this.f35884l) {
            return new C18368l(i == 0 ? f35883l : Arrays.copyOf(this.f35885l, i), this.f35884l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        amazon();
        int i = this.f35884l;
        Object[] objArr = this.f35885l;
        if (i == objArr.length) {
            this.f35885l = Arrays.copyOf(this.f35885l, AbstractC15560l.vip(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f35885l;
        int i2 = this.f35884l;
        this.f35884l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
