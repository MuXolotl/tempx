package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lّؔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2577l extends AbstractC0853l implements InterfaceC5668l, RandomAccess, InterfaceC16123l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C2577l f5611l = new C2577l(new int[0], 0, false);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f5612l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f5613l;

    public C2577l(int[] iArr, int i, boolean z) {
        super(z);
        this.f5613l = iArr;
        this.f5612l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        if (i < 0 || i > (i2 = this.f5612l)) {
            C11983l.mopub(this.f5612l, AbstractC2812l.Signature("Index:", i, ", Size:"));
            return;
        }
        int[] iArr = this.f5613l;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f5613l, i, iArr2, i + 1, this.f5612l - i);
            this.f5613l = iArr2;
        }
        this.f5613l[i] = iIntValue;
        this.f5612l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC0853l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC6320l.yandex;
        collection.getClass();
        if (!(collection instanceof C2577l)) {
            return super.addAll(collection);
        }
        C2577l c2577l = (C2577l) collection;
        int i = c2577l.f5612l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f5612l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f5613l;
        if (i3 > iArr.length) {
            this.f5613l = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c2577l.f5613l, 0, this.f5613l, this.f5612l, c2577l.f5612l);
        this.f5612l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int admob(int i) {
        mopub(i);
        return this.f5613l[i];
    }

    public final void billing(int i) {
        amazon();
        int i2 = this.f5612l;
        int[] iArr = this.f5613l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f5613l = iArr2;
        }
        int[] iArr3 = this.f5613l;
        int i3 = this.f5612l;
        this.f5612l = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC0853l, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2577l)) {
            return super.equals(obj);
        }
        C2577l c2577l = (C2577l) obj;
        if (this.f5612l != c2577l.f5612l) {
            return false;
        }
        int[] iArr = c2577l.f5613l;
        for (int i = 0; i < this.f5612l; i++) {
            if (this.f5613l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(admob(i));
    }

    @Override // defpackage.AbstractC0853l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5612l; i2++) {
            i = (i * 31) + this.f5613l[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f5612l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f5613l[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void mopub(int i) {
        if (i < 0 || i >= this.f5612l) {
            C11983l.mopub(this.f5612l, AbstractC2812l.Signature("Index:", i, ", Size:"));
        }
    }

    @Override // defpackage.AbstractC0853l, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        amazon();
        mopub(i);
        int[] iArr = this.f5613l;
        int i2 = iArr[i];
        int i3 = this.f5612l;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f5612l--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        amazon();
        if (i2 < i) {
            C18262l.adcel("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.f5613l;
        System.arraycopy(iArr, i2, iArr, i, this.f5612l - i2);
        this.f5612l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        mopub(i);
        int[] iArr = this.f5613l;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5612l;
    }

    @Override // defpackage.InterfaceC10996l
    public final InterfaceC10996l yandex(int i) {
        if (i >= this.f5612l) {
            return new C2577l(Arrays.copyOf(this.f5613l, i), this.f5612l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        billing(((Integer) obj).intValue());
        return true;
    }
}
