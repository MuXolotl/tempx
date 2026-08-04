package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lُ۟٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11365l extends AbstractC13676l implements RandomAccess, InterfaceC1479l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C11365l f22915l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final long[] f22916l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f22917l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public long[] f22918l;

    static {
        long[] jArr = new long[0];
        f22916l = jArr;
        f22915l = new C11365l(jArr, 0, false);
    }

    public C11365l(long[] jArr, int i, boolean z) {
        super(z);
        this.f22918l = jArr;
        this.f22917l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        amazon();
        if (i < 0 || i > (i2 = this.f22917l)) {
            C18262l.adcel(AbstractC7741l.smaato(this.f22917l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.f22918l;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22918l, 0, jArr2, 0, i);
            System.arraycopy(this.f22918l, i, jArr2, i3, this.f22917l - i);
            this.f22918l = jArr2;
        }
        this.f22918l[i] = jLongValue;
        this.f22917l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC11966l.yandex;
        collection.getClass();
        if (!(collection instanceof C11365l)) {
            return super.addAll(collection);
        }
        C11365l c11365l = (C11365l) collection;
        int i = c11365l.f22917l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22917l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f22918l;
        if (i3 > jArr.length) {
            this.f22918l = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c11365l.f22918l, 0, this.f22918l, this.f22917l, c11365l.f22917l);
        this.f22917l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long billing(int i) {
        mopub(i);
        return this.f22918l[i];
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
        if (!(obj instanceof C11365l)) {
            return super.equals(obj);
        }
        C11365l c11365l = (C11365l) obj;
        if (this.f22917l != c11365l.f22917l) {
            return false;
        }
        long[] jArr = c11365l.f22918l;
        for (int i = 0; i < this.f22917l; i++) {
            if (this.f22918l[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        mopub(i);
        return Long.valueOf(this.f22918l[i]);
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22917l; i2++) {
            long j = this.f22918l[i2];
            Charset charset = AbstractC11966l.yandex;
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
        int i = this.f22917l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22918l[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void mopub(int i) {
        if (i < 0 || i >= this.f22917l) {
            C18262l.adcel(AbstractC7741l.smaato(this.f22917l, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        mopub(i);
        long[] jArr = this.f22918l;
        long j = jArr[i];
        int i2 = this.f22917l;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f22917l--;
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
        long[] jArr = this.f22918l;
        System.arraycopy(jArr, i2, jArr, i, this.f22917l - i2);
        this.f22917l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        amazon();
        mopub(i);
        long[] jArr = this.f22918l;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22917l;
    }

    @Override // defpackage.InterfaceC12239l
    public final InterfaceC12239l subs(int i) {
        if (i >= this.f22917l) {
            return new C11365l(i == 0 ? f22916l : Arrays.copyOf(this.f22918l, i), this.f22917l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        amazon();
        int i = this.f22917l;
        int length = this.f22918l.length;
        if (i == length) {
            long[] jArr = new long[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f22918l, 0, jArr, 0, this.f22917l);
            this.f22918l = jArr;
        }
        long[] jArr2 = this.f22918l;
        int i2 = this.f22917l;
        this.f22917l = i2 + 1;
        jArr2[i2] = jLongValue;
        return true;
    }
}
