package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؗؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4650l extends AbstractC13676l implements RandomAccess {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C4650l f9468l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f9469l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9470l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f9471l;

    static {
        Object[] objArr = new Object[0];
        f9469l = objArr;
        f9468l = new C4650l(objArr, 0, false);
    }

    public C4650l(Object[] objArr, int i, boolean z) {
        super(z);
        this.f9471l = objArr;
        this.f9470l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        amazon();
        if (i < 0 || i > (i2 = this.f9470l)) {
            C18262l.adcel(AbstractC7741l.smaato(this.f9470l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f9471l;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f9471l, 0, objArr2, 0, i);
            System.arraycopy(this.f9471l, i, objArr2, i3, this.f9470l - i);
            this.f9471l = objArr2;
        }
        this.f9471l[i] = obj;
        this.f9470l++;
        ((AbstractList) this).modCount++;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f9470l) {
            C18262l.adcel(AbstractC7741l.smaato(this.f9470l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f9471l[i];
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        billing(i);
        Object[] objArr = this.f9471l;
        Object obj = objArr[i];
        int i2 = this.f9470l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f9470l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        amazon();
        billing(i);
        Object[] objArr = this.f9471l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9470l;
    }

    @Override // defpackage.InterfaceC12239l
    public final /* bridge */ /* synthetic */ InterfaceC12239l subs(int i) {
        if (i >= this.f9470l) {
            return new C4650l(i == 0 ? f9469l : Arrays.copyOf(this.f9471l, i), this.f9470l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        amazon();
        int i = this.f9470l;
        int length = this.f9471l.length;
        if (i == length) {
            this.f9471l = Arrays.copyOf(this.f9471l, AbstractC15560l.vip(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f9471l;
        int i2 = this.f9470l;
        this.f9470l = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
