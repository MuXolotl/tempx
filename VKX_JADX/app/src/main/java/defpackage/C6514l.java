package defpackage;

import androidx.car.app.model.Alert;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؙْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6514l extends AbstractC1277l implements RandomAccess, InterfaceC11831l, InterfaceC9073l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6514l f13583l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final long[] f13584l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13585l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long[] f13586l;

    static {
        long[] jArr = new long[0];
        f13584l = jArr;
        f13583l = new C6514l(jArr, 0, false);
    }

    public C6514l(long[] jArr, int i, boolean z) {
        super(z);
        this.f13586l = jArr;
        this.f13585l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        amazon();
        if (i < 0 || i > (i2 = this.f13585l)) {
            C18262l.adcel(C16292l.yandex(this.f13585l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f13586l;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13586l, 0, jArr2, 0, i);
            System.arraycopy(this.f13586l, i, jArr2, i3, this.f13585l - i);
            this.f13586l = jArr2;
        }
        this.f13586l[i] = jLongValue;
        this.f13585l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC1277l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        collection.getClass();
        if (!(collection instanceof C6514l)) {
            return super.addAll(collection);
        }
        C6514l c6514l = (C6514l) collection;
        int i = c6514l.f13585l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13585l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f13586l;
        if (i3 > jArr.length) {
            this.f13586l = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c6514l.f13586l, 0, this.f13586l, this.f13585l, c6514l.f13585l);
        this.f13585l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void admob(long j) {
        amazon();
        int i = this.f13585l;
        int length = this.f13586l.length;
        if (i == length) {
            long[] jArr = new long[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f13586l, 0, jArr, 0, this.f13585l);
            this.f13586l = jArr;
        }
        long[] jArr2 = this.f13586l;
        int i2 = this.f13585l;
        this.f13585l = i2 + 1;
        jArr2[i2] = j;
    }

    public final long billing(int i) {
        firebase(i);
        return this.f13586l[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC1277l, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6514l)) {
            return super.equals(obj);
        }
        C6514l c6514l = (C6514l) obj;
        if (this.f13585l != c6514l.f13585l) {
            return false;
        }
        long[] jArr = c6514l.f13586l;
        for (int i = 0; i < this.f13585l; i++) {
            if (this.f13586l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void firebase(int i) {
        if (i < 0 || i >= this.f13585l) {
            C18262l.adcel(C16292l.yandex(this.f13585l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        firebase(i);
        return Long.valueOf(this.f13586l[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13585l; i2++) {
            long j = this.f13586l[i2];
            byte[] bArr = AbstractC16728l.yandex;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f13585l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13586l[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9971l
    /* JADX INFO: renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public final C6514l license(int i) {
        if (i >= this.f13585l) {
            return new C6514l(i == 0 ? f13584l : Arrays.copyOf(this.f13586l, i), this.f13585l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // defpackage.AbstractC1277l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        firebase(i);
        long[] jArr = this.f13586l;
        long j = jArr[i];
        int i2 = this.f13585l;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13585l--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        amazon();
        if (i2 < i) {
            C18262l.adcel("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.f13586l;
        System.arraycopy(jArr, i2, jArr, i, this.f13585l - i2);
        this.f13585l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        amazon();
        firebase(i);
        long[] jArr = this.f13586l;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13585l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        admob(((Long) obj).longValue());
        return true;
    }
}
