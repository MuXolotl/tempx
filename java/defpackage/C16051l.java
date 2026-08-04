package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٕۥٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16051l extends AbstractC9453l {
    public static final Parcelable.Creator<C16051l> CREATOR = new C13546l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f31445l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C16674l f31446l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f31447l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f31448l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f31449l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f31450l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C16674l f31451l;

    public C16051l(String str, String str2, String str3, String str4, String str5, C16674l c16674l, C16674l c16674l2) {
        this.f31448l = str;
        this.f31447l = str2;
        this.f31445l = str3;
        this.f31450l = str4;
        this.f31449l = str5;
        this.f31451l = c16674l;
        this.f31446l = c16674l2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 1, this.f31448l);
        AbstractC9968l.vip(parcel, 2, this.f31447l);
        AbstractC9968l.vip(parcel, 3, this.f31445l);
        AbstractC9968l.vip(parcel, 4, this.f31450l);
        AbstractC9968l.vip(parcel, 5, this.f31449l);
        AbstractC9968l.remoteconfig(parcel, 6, this.f31451l, i);
        AbstractC9968l.remoteconfig(parcel, 7, this.f31446l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
