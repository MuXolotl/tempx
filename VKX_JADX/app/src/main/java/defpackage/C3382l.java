package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؕٓٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382l extends AbstractC9453l {
    public static final Parcelable.Creator<C3382l> CREATOR = new C15160l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f7207l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public String f7208l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f7209l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f7210l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f7211l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f7212l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public String f7213l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f7210l);
        AbstractC9968l.vip(parcel, 3, this.f7209l);
        AbstractC9968l.vip(parcel, 4, this.f7207l);
        AbstractC9968l.vip(parcel, 5, this.f7212l);
        AbstractC9968l.vip(parcel, 6, this.f7211l);
        AbstractC9968l.vip(parcel, 7, this.f7213l);
        AbstractC9968l.vip(parcel, 8, this.f7208l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
