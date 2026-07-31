package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؙؐۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6174l extends AbstractC9453l {
    public static final Parcelable.Creator<C6174l> CREATOR = new C1800l(11);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f13015l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C8175l f13016l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f13017l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f13018l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f13019l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f13020l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C8175l f13021l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f13018l);
        AbstractC9968l.vip(parcel, 3, this.f13017l);
        AbstractC9968l.vip(parcel, 4, this.f13015l);
        AbstractC9968l.vip(parcel, 5, this.f13020l);
        AbstractC9968l.vip(parcel, 6, this.f13019l);
        AbstractC9968l.remoteconfig(parcel, 7, this.f13021l, i);
        AbstractC9968l.remoteconfig(parcel, 8, this.f13016l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
