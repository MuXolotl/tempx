package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lِؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3172l extends AbstractC9453l {
    public static final Parcelable.Creator<C3172l> CREATOR = new C15160l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f6815l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f6816l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f6817l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f6817l);
        AbstractC9968l.vip(parcel, 3, this.f6816l);
        int i2 = this.f6815l;
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
