package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؚِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7245l extends AbstractC9453l {
    public static final Parcelable.Creator<C7245l> CREATOR = new C15160l(11);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f15070l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f15071l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f15071l);
        AbstractC9968l.vip(parcel, 3, this.f15070l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
