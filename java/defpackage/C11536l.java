package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lِؚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11536l extends AbstractC9453l {
    public static final Parcelable.Creator<C11536l> CREATOR = new C18485l(27);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f23202l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f23203l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f23204l;

    public C11536l(long j, int i, String str) {
        this.f23204l = str;
        this.f23203l = j;
        this.f23202l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f23204l);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f23203l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f23202l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
