package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٓٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14162l extends AbstractC2704l {
    public static final Parcelable.Creator<C14162l> CREATOR = new C9499l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f27694l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f27695l;

    public C14162l(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f27694l = parcel.readInt();
        this.f27695l = parcel.readInt() != 0;
    }

    @Override // defpackage.AbstractC2704l, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f27694l);
        parcel.writeInt(this.f27695l ? 1 : 0);
    }
}
