package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌٌّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8736l extends AbstractC9453l {
    public static final Parcelable.Creator<C8736l> CREATOR = new C18485l(28);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f17983l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public String f17984l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public byte[] f17985l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f17986l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17987l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Bundle f17988l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final long f17989l;

    public C8736l(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f17986l = j;
        this.f17985l = bArr;
        this.f17983l = str;
        this.f17988l = bundle;
        this.f17987l = i;
        this.f17989l = j2;
        this.f17984l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(this.f17986l);
        AbstractC9968l.billing(parcel, 2, this.f17985l);
        AbstractC9968l.vip(parcel, 3, this.f17983l);
        AbstractC9968l.purchase(parcel, 4, this.f17988l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f17987l);
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(this.f17989l);
        AbstractC9968l.vip(parcel, 7, this.f17984l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
