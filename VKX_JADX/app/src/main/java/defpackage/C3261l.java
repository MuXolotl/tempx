package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lًؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3261l extends AbstractC9453l {
    public static final Parcelable.Creator<C3261l> CREATOR = new C1800l(23);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f6985l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f6986l;

    public C3261l(int i, String str) {
        this.f6986l = i;
        this.f6985l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f6986l);
        AbstractC9968l.vip(parcel, 2, this.f6985l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
