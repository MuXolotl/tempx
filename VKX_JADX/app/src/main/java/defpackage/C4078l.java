package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lّؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4078l extends AbstractC9453l {
    public static final Parcelable.Creator<C4078l> CREATOR = new C10538l(23);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10742l f8384l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f8385l;

    public C4078l(int i, C10742l c10742l) {
        this.f8385l = i;
        this.f8384l = c10742l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f8385l);
        AbstractC9968l.remoteconfig(parcel, 2, this.f8384l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
