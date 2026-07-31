package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lّؗۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5156l extends AbstractC9453l {
    public static final Parcelable.Creator<C5156l> CREATOR = new C10538l(12);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f11203l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f11204l;

    public C5156l(boolean z, int i) {
        this.f11204l = z;
        this.f11203l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f11204l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f11203l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
