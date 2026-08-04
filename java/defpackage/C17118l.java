package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٗٓۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17118l extends AbstractC9453l {
    public static final Parcelable.Creator<C17118l> CREATOR = new C15160l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f33294l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f33295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f33296l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f33297l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        int i2 = this.f33296l;
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC9968l.vip(parcel, 3, this.f33295l);
        AbstractC9968l.vip(parcel, 4, this.f33294l);
        AbstractC9968l.vip(parcel, 5, this.f33297l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
