package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؑؐۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0008l extends AbstractC9453l {
    public static final Parcelable.Creator<C0008l> CREATOR = new C5422l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f859l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f860l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f861l;

    public C0008l(String str, int i, String str2) {
        this.f861l = str;
        this.f860l = str2;
        this.f859l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f861l);
        AbstractC9968l.vip(parcel, 2, this.f860l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f859l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
