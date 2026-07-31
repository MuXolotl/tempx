package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: lؖۦ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4518l extends AbstractC2704l {
    public static final Parcelable.Creator<C4518l> CREATOR = new C9499l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public SparseArray f9158l;

    public C4518l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f9158l = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f9158l.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f9158l;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f9158l.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f9158l.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
