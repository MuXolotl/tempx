package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؙْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13426l extends AbstractC9453l {
    public static final Parcelable.Creator<C13426l> CREATOR = new C1800l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f26336l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f26337l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f26338l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f26339l;

    public C13426l(int i, String str, String str2, String str3) {
        this.f26338l = i;
        this.f26337l = str;
        this.f26336l = str2;
        this.f26339l = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f26338l);
        AbstractC9968l.vip(parcel, 2, this.f26337l);
        AbstractC9968l.vip(parcel, 3, this.f26336l);
        AbstractC9968l.vip(parcel, 4, this.f26339l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
