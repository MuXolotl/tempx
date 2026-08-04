package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16566l extends AbstractC9453l {
    public static final Parcelable.Creator<C16566l> CREATOR = new C13546l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f32514l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f32515l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32516l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f32517l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f32518l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f32519l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f32520l;

    public C16566l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f32517l = str;
        this.f32516l = str2;
        this.f32514l = str3;
        this.f32519l = str4;
        this.f32518l = str5;
        this.f32520l = str6;
        this.f32515l = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f32517l);
        AbstractC9968l.vip(parcel, 2, this.f32516l);
        AbstractC9968l.vip(parcel, 3, this.f32514l);
        AbstractC9968l.vip(parcel, 4, this.f32519l);
        AbstractC9968l.vip(parcel, 5, this.f32518l);
        AbstractC9968l.vip(parcel, 6, this.f32520l);
        AbstractC9968l.vip(parcel, 7, this.f32515l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
