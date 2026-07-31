package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٜؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1959l extends AbstractC9453l {
    public static final Parcelable.Creator<C1959l> CREATOR = new C1800l(17);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f4459l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C0291l f4460l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f4461l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f4462l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f4463l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f4464l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0291l f4465l;

    public C1959l(String str, String str2, String str3, String str4, String str5, C0291l c0291l, C0291l c0291l2) {
        this.f4462l = str;
        this.f4461l = str2;
        this.f4459l = str3;
        this.f4464l = str4;
        this.f4463l = str5;
        this.f4465l = c0291l;
        this.f4460l = c0291l2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f4462l);
        AbstractC9968l.vip(parcel, 2, this.f4461l);
        AbstractC9968l.vip(parcel, 3, this.f4459l);
        AbstractC9968l.vip(parcel, 4, this.f4464l);
        AbstractC9968l.vip(parcel, 5, this.f4463l);
        AbstractC9968l.remoteconfig(parcel, 6, this.f4465l, i);
        AbstractC9968l.remoteconfig(parcel, 7, this.f4460l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
