package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؚ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17756l extends AbstractC0853l implements RandomAccess {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C17756l f34579l = new C17756l(new Object[0], 0, false);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f34580l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object[] f34581l;

    public C17756l(Object[] objArr, int i, boolean z) {
        super(z);
        this.f34581l = objArr;
        this.f34580l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        amazon();
        if (i < 0 || i > (i2 = this.f34580l)) {
            C11983l.mopub(this.f34580l, AbstractC2812l.Signature("Index:", i, ", Size:"));
            return;
        }
        Object[] objArr = this.f34581l;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f34581l, i, objArr2, i + 1, this.f34580l - i);
            this.f34581l = objArr2;
        }
        this.f34581l[i] = obj;
        this.f34580l++;
        ((AbstractList) this).modCount++;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f34580l) {
            C11983l.mopub(this.f34580l, AbstractC2812l.Signature("Index:", i, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        billing(i);
        return this.f34581l[i];
    }

    @Override // defpackage.AbstractC0853l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        billing(i);
        Object[] objArr = this.f34581l;
        Object obj = objArr[i];
        int i2 = this.f34580l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f34580l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        amazon();
        billing(i);
        Object[] objArr = this.f34581l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f34580l;
    }

    @Override // defpackage.InterfaceC10996l
    public final InterfaceC10996l yandex(int i) {
        if (i >= this.f34580l) {
            return new C17756l(Arrays.copyOf(this.f34581l, i), this.f34580l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        amazon();
        int i = this.f34580l;
        Object[] objArr = this.f34581l;
        if (i == objArr.length) {
            this.f34581l = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f34581l;
        int i2 = this.f34580l;
        this.f34580l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
