package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؚٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15094l extends AbstractC2704l {
    public static final Parcelable.Creator<C15094l> CREATOR = new C11384l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f29625l;

    public C15094l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C15094l.class.getClassLoader();
        }
        this.f29625l = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f29625l ? 1 : 0);
    }
}
