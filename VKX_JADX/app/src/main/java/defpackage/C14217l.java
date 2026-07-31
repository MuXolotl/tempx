package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٓ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14217l extends AbstractC3486l implements RandomAccess, InterfaceC9596l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C14217l f27817l = new C14217l(new float[0], 0, false);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f27818l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float[] f27819l;

    public C14217l(float[] fArr, int i, boolean z) {
        super(z);
        this.f27819l = fArr;
        this.f27818l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        amazon();
        if (i < 0 || i > (i2 = this.f27818l)) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f27818l, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f27819l;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC12900l.amazon(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f27819l, i, fArr2, i3, this.f27818l - i);
            this.f27819l = fArr2;
        }
        this.f27819l[i] = fFloatValue;
        this.f27818l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC11565l.yandex;
        collection.getClass();
        if (!(collection instanceof C14217l)) {
            return super.addAll(collection);
        }
        C14217l c14217l = (C14217l) collection;
        int i = c14217l.f27818l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f27818l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f27819l;
        if (i3 > fArr.length) {
            this.f27819l = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c14217l.f27819l, 0, this.f27819l, this.f27818l, c14217l.f27818l);
        this.f27818l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(float f) {
        amazon();
        int i = this.f27818l;
        float[] fArr = this.f27819l;
        if (i == fArr.length) {
            float[] fArr2 = new float[AbstractC12900l.amazon(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f27819l = fArr2;
        }
        float[] fArr3 = this.f27819l;
        int i2 = this.f27818l;
        this.f27818l = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof C14217l)) {
            return super.equals(obj);
        }
        C14217l c14217l = (C14217l) obj;
        if (this.f27818l != c14217l.f27818l) {
            return false;
        }
        float[] fArr = c14217l.f27819l;
        for (int i = 0; i < this.f27818l; i++) {
            if (Float.floatToIntBits(this.f27819l[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        mopub(i);
        return Float.valueOf(this.f27819l[i]);
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f27818l; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f27819l[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f27818l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f27819l[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void mopub(int i) {
        if (i < 0 || i >= this.f27818l) {
            C18262l.adcel(AbstractC12589l.premium(i, this.f27818l, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.InterfaceC14009l
    public final InterfaceC14009l purchase(int i) {
        if (i >= this.f27818l) {
            return new C14217l(Arrays.copyOf(this.f27819l, i), this.f27818l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // defpackage.AbstractC3486l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        mopub(i);
        float[] fArr = this.f27819l;
        float f = fArr[i];
        int i2 = this.f27818l;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f27818l--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        amazon();
        if (i2 < i) {
            C18262l.adcel("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.f27819l;
        System.arraycopy(fArr, i2, fArr, i, this.f27818l - i2);
        this.f27818l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        amazon();
        mopub(i);
        float[] fArr = this.f27819l;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27818l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        billing(((Float) obj).floatValue());
        return true;
    }
}
