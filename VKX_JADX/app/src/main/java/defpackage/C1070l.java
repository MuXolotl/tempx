package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: lٕؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1070l extends AbstractC13676l implements RandomAccess, InterfaceC10356l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1070l f2951l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final float[] f2952l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f2953l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public float[] f2954l;

    static {
        float[] fArr = new float[0];
        f2952l = fArr;
        f2951l = new C1070l(fArr, 0, false);
    }

    public C1070l(float[] fArr, int i, boolean z) {
        super(z);
        this.f2954l = fArr;
        this.f2953l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        amazon();
        if (i < 0 || i > (i2 = this.f2953l)) {
            C18262l.adcel(AbstractC7741l.smaato(this.f2953l, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        float[] fArr = this.f2954l;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f2954l, 0, fArr2, 0, i);
            System.arraycopy(this.f2954l, i, fArr2, i3, this.f2953l - i);
            this.f2954l = fArr2;
        }
        this.f2954l[i] = fFloatValue;
        this.f2953l++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        amazon();
        Charset charset = AbstractC11966l.yandex;
        collection.getClass();
        if (!(collection instanceof C1070l)) {
            return super.addAll(collection);
        }
        C1070l c1070l = (C1070l) collection;
        int i = c1070l.f2953l;
        if (i == 0) {
            return false;
        }
        int i2 = this.f2953l;
        if (Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f2954l;
        if (i3 > fArr.length) {
            this.f2954l = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c1070l.f2954l, 0, this.f2954l, this.f2953l, c1070l.f2953l);
        this.f2953l = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void billing(int i) {
        if (i < 0 || i >= this.f2953l) {
            C18262l.adcel(AbstractC7741l.smaato(this.f2953l, i, (byte) 13, "Index:", ", Size:"));
        }
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
        if (!(obj instanceof C1070l)) {
            return super.equals(obj);
        }
        C1070l c1070l = (C1070l) obj;
        if (this.f2953l != c1070l.f2953l) {
            return false;
        }
        float[] fArr = c1070l.f2954l;
        for (int i = 0; i < this.f2953l; i++) {
            if (Float.floatToIntBits(this.f2954l[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        billing(i);
        return Float.valueOf(this.f2954l[i]);
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f2953l; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f2954l[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f2953l;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f2954l[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC13676l, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        amazon();
        billing(i);
        float[] fArr = this.f2954l;
        float f = fArr[i];
        int i2 = this.f2953l;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f2953l--;
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
        float[] fArr = this.f2954l;
        System.arraycopy(fArr, i2, fArr, i, this.f2953l - i2);
        this.f2953l -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        amazon();
        billing(i);
        float[] fArr = this.f2954l;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2953l;
    }

    @Override // defpackage.InterfaceC12239l
    public final InterfaceC12239l subs(int i) {
        if (i >= this.f2953l) {
            return new C1070l(i == 0 ? f2952l : Arrays.copyOf(this.f2954l, i), this.f2953l, true);
        }
        C11983l.crashlytics();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        amazon();
        int i = this.f2953l;
        int length = this.f2954l.length;
        if (i == length) {
            float[] fArr = new float[AbstractC15560l.vip(length, 3, 2, 1, 10)];
            System.arraycopy(this.f2954l, 0, fArr, 0, this.f2953l);
            this.f2954l = fArr;
        }
        float[] fArr2 = this.f2954l;
        int i2 = this.f2953l;
        this.f2953l = i2 + 1;
        fArr2[i2] = fFloatValue;
        return true;
    }
}
