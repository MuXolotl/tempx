package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lؖۦۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4522l extends AbstractC13676l implements RandomAccess, InterfaceC7913l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C4522l f9159l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final int[] f9160l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f9161l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f9162l;

    static {
        int[] iArr = new int[0];
        f9160l = iArr;
        f9159l = new C4522l(iArr, 0, false);
    }

    public C4522l(int[] iArr, int i, boolean z) {
        super(z);
        this.f9162l = iArr;
        this.f9161l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        if (i < 0 || i > (i2 = this.f9161l)) {
            C18262l.adcel(AbstractC7741l.smaato(this.f9161l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.f9162l;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f9162l, 0, iArr2, 0, i);
            System.arraycopy(this.f9162l, i, iArr2, i3, this.f9161l - i);
            this.f9162l = iArr2;
        }
        this.f9162l[i] = iIntValue;
        this.f9161l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC11966l.yandex;
        collection.getClass();
        if (!(collection instanceof C4522l)) {
            return super.addAll(collection);
        }
        C4522l c4522l = (C4522l) collection;
        int i = c4522l.f9161l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f9161l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f9162l;
        if (i3 > iArr.length) {
            this.f9162l = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c4522l.f9162l, 0, this.f9162l, this.f9161l, c4522l.f9161l);
        this.f9161l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void admob(int i) {
        amazon();
        int i2 = this.f9161l;
        int length = this.f9162l.length;
        if (i2 == length) {
            int[] iArr = new int[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f9162l, 0, iArr, 0, this.f9161l);
            this.f9162l = iArr;
        }
        int[] iArr2 = this.f9162l;
        int i3 = this.f9161l;
        this.f9161l = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // defpackage.InterfaceC12239l
    /* JADX INFO: renamed from: billing, reason: merged with bridge method [inline-methods] */
    public final C4522l subs(int i) {
        if (i >= this.f9161l) {
            return new C4522l(i == 0 ? f9160l : Arrays.copyOf(this.f9162l, i), this.f9161l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4522l)) {
            return super.equals(obj);
        }
        C4522l c4522l = (C4522l) obj;
        if (this.f9161l != c4522l.f9161l) {
            return false;
        }
        int[] iArr = c4522l.f9162l;
        for (int i = 0; i < this.f9161l; i++) {
            if (this.f9162l[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void firebase(int i) {
        if (i < 0 || i >= this.f9161l) {
            C18262l.adcel(AbstractC7741l.smaato(this.f9161l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        firebase(i);
        return Integer.valueOf(this.f9162l[i]);
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f9161l; i2++) {
            i = (i * 31) + this.f9162l[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f9161l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9162l[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final int mopub(int i) {
        firebase(i);
        return this.f9162l[i];
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        firebase(i);
        int[] iArr = this.f9162l;
        int i2 = iArr[i];
        int i3 = this.f9161l;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f9161l--;
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
        int[] iArr = this.f9162l;
        System.arraycopy(iArr, i2, iArr, i, this.f9161l - i2);
        this.f9161l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        amazon();
        firebase(i);
        int[] iArr = this.f9162l;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9161l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        admob(((Integer) obj).intValue());
        return true;
    }
}
