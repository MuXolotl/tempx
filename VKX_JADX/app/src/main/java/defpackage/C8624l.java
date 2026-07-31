package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٌؙۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8624l extends AbstractC1277l implements RandomAccess {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8624l f17771l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final Object[] f17772l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f17773l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f17774l;

    static {
        Object[] objArr = new Object[0];
        f17772l = objArr;
        f17771l = new C8624l(objArr, 0, false);
    }

    public C8624l(Object[] objArr, int i, boolean z) {
        super(z);
        this.f17774l = objArr;
        this.f17773l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        amazon();
        if (i < 0 || i > (i2 = this.f17773l)) {
            C18262l.adcel(C16292l.yandex(this.f17773l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.f17774l;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f17774l, 0, objArr2, 0, i);
            System.arraycopy(this.f17774l, i, objArr2, i3, this.f17773l - i);
            this.f17774l = objArr2;
        }
        this.f17774l[i] = obj;
        this.f17773l++;
        ((AbstractList) this).modCount++;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f17773l) {
            C18262l.adcel(C16292l.yandex(this.f17773l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.AbstractC1277l, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f17773l;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof C8624l)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.f17774l[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        C8624l c8624l = (C8624l) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.f17774l[i3].equals(c8624l.f17774l[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f17774l[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f17773l;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.f17774l[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.InterfaceC9971l
    public final /* bridge */ /* synthetic */ InterfaceC9971l license(int i) {
        if (i >= this.f17773l) {
            return new C8624l(i == 0 ? f17772l : Arrays.copyOf(this.f17774l, i), this.f17773l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // defpackage.AbstractC1277l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        billing(i);
        Object[] objArr = this.f17774l;
        Object obj = objArr[i];
        int i2 = this.f17773l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f17773l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        amazon();
        billing(i);
        Object[] objArr = this.f17774l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17773l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        amazon();
        int i = this.f17773l;
        int length = this.f17774l.length;
        if (i == length) {
            this.f17774l = Arrays.copyOf(this.f17774l, AbstractC15560l.vip(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f17774l;
        int i2 = this.f17773l;
        this.f17773l = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
