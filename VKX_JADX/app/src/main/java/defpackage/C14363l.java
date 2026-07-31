package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٓۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14363l extends AbstractC3486l implements RandomAccess, InterfaceC0250l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C14363l f28110l = new C14363l(new int[0], 0, false);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f28111l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f28112l;

    public C14363l(int[] iArr, int i, boolean z) {
        super(z);
        this.f28112l = iArr;
        this.f28111l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        if (i < 0 || i > (i2 = this.f28111l)) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f28111l, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f28112l;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f28112l, i, iArr2, i3, this.f28111l - i);
            this.f28112l = iArr2;
        }
        this.f28112l[i] = iIntValue;
        this.f28111l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC11565l.yandex;
        collection.getClass();
        if (!(collection instanceof C14363l)) {
            return super.addAll(collection);
        }
        C14363l c14363l = (C14363l) collection;
        int i = c14363l.f28111l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f28111l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f28112l;
        if (i3 > iArr.length) {
            this.f28112l = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c14363l.f28112l, 0, this.f28112l, this.f28111l, c14363l.f28111l);
        this.f28111l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void admob(int i) {
        if (i < 0 || i >= this.f28111l) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f28111l, "Index:", ", Size:"));
        }
    }

    public final int billing(int i) {
        admob(i);
        return this.f28112l[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14363l)) {
            return super.equals(obj);
        }
        C14363l c14363l = (C14363l) obj;
        if (this.f28111l != c14363l.f28111l) {
            return false;
        }
        int[] iArr = c14363l.f28112l;
        for (int i = 0; i < this.f28111l; i++) {
            if (this.f28112l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        admob(i);
        return Integer.valueOf(this.f28112l[i]);
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f28111l; i2++) {
            i = (i * 31) + this.f28112l[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f28111l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f28112l[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void mopub(int i) {
        amazon();
        int i2 = this.f28111l;
        int[] iArr = this.f28112l;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f28112l = iArr2;
        }
        int[] iArr3 = this.f28112l;
        int i3 = this.f28111l;
        this.f28111l = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // defpackage.InterfaceC14009l
    public final /* bridge */ /* synthetic */ InterfaceC14009l purchase(int i) {
        if (i >= this.f28111l) {
            return new C14363l(Arrays.copyOf(this.f28112l, i), this.f28111l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        admob(i);
        int[] iArr = this.f28112l;
        int i2 = iArr[i];
        int i3 = this.f28111l;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f28111l--;
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
        int[] iArr = this.f28112l;
        System.arraycopy(iArr, i2, iArr, i, this.f28111l - i2);
        this.f28111l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        admob(i);
        int[] iArr = this.f28112l;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28111l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mopub(((Integer) obj).intValue());
        return true;
    }
}
