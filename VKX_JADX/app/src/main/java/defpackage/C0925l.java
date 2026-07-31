package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌؒؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0925l extends AbstractC9453l {
    public static final Parcelable.Creator<C0925l> CREATOR = new C10538l(19);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f2603l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f2604l;

    public C0925l(int i, boolean z) {
        this.f2604l = i;
        this.f2603l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f2604l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f2603l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
