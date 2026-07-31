package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l٘ٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18038l extends AbstractC9453l {
    public static final Parcelable.Creator<C18038l> CREATOR = new C1800l(18);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f35323l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C5683l[] f35324l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f35325l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14456l f35326l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13426l[] f35327l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3261l[] f35328l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String[] f35329l;

    public C18038l(C14456l c14456l, String str, String str2, C3261l[] c3261lArr, C13426l[] c13426lArr, String[] strArr, C5683l[] c5683lArr) {
        this.f35326l = c14456l;
        this.f35325l = str;
        this.f35323l = str2;
        this.f35328l = c3261lArr;
        this.f35327l = c13426lArr;
        this.f35329l = strArr;
        this.f35324l = c5683lArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f35326l, i);
        AbstractC9968l.vip(parcel, 2, this.f35325l);
        AbstractC9968l.vip(parcel, 3, this.f35323l);
        AbstractC9968l.adcel(parcel, 4, this.f35328l, i);
        AbstractC9968l.adcel(parcel, 5, this.f35327l, i);
        AbstractC9968l.metrica(parcel, 6, this.f35329l);
        AbstractC9968l.adcel(parcel, 7, this.f35324l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
