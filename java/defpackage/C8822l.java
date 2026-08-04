package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8822l extends AbstractC2704l {
    public static final Parcelable.Creator<C8822l> CREATOR = new C11384l(6);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f18112l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final ClassLoader f18113l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Parcelable f18114l;

    public C8822l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C8822l.class.getClassLoader() : classLoader;
        this.f18112l = parcel.readInt();
        this.f18114l = parcel.readParcelable(classLoader);
        this.f18113l = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC14814l.remoteconfig(this.f18112l, "}", sb);
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f18112l);
        parcel.writeParcelable(this.f18114l, i);
    }
}
