package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؚٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14456l extends AbstractC9453l {
    public static final Parcelable.Creator<C14456l> CREATOR = new C1800l(22);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f28321l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f28322l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f28323l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f28324l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f28325l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f28326l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f28327l;

    public C14456l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f28324l = str;
        this.f28323l = str2;
        this.f28321l = str3;
        this.f28326l = str4;
        this.f28325l = str5;
        this.f28327l = str6;
        this.f28322l = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f28324l);
        AbstractC9968l.vip(parcel, 2, this.f28323l);
        AbstractC9968l.vip(parcel, 3, this.f28321l);
        AbstractC9968l.vip(parcel, 4, this.f28326l);
        AbstractC9968l.vip(parcel, 5, this.f28325l);
        AbstractC9968l.vip(parcel, 6, this.f28327l);
        AbstractC9968l.vip(parcel, 7, this.f28322l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
