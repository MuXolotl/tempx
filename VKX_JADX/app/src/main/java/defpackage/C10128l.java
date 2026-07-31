package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lَؙؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10128l extends AbstractC9453l {
    public static final Parcelable.Creator<C10128l> CREATOR = new C5422l(25);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String[] f20633l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f20634l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f20634l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.metrica(parcel, 3, this.f20633l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
