package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٕۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15996l extends AbstractC9453l {
    public static final Parcelable.Creator<C15996l> CREATOR = new C13546l(6);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f31367l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18504l[] f31368l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f31369l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C16566l f31370l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C13115l[] f31371l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C9652l[] f31372l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String[] f31373l;

    public C15996l(C16566l c16566l, String str, String str2, C9652l[] c9652lArr, C13115l[] c13115lArr, String[] strArr, C18504l[] c18504lArr) {
        this.f31370l = c16566l;
        this.f31369l = str;
        this.f31367l = str2;
        this.f31372l = c9652lArr;
        this.f31371l = c13115lArr;
        this.f31373l = strArr;
        this.f31368l = c18504lArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f31370l, i);
        AbstractC9968l.vip(parcel, 2, this.f31369l);
        AbstractC9968l.vip(parcel, 3, this.f31367l);
        AbstractC9968l.adcel(parcel, 4, this.f31372l, i);
        AbstractC9968l.adcel(parcel, 5, this.f31371l, i);
        AbstractC9968l.metrica(parcel, 6, this.f31373l);
        AbstractC9968l.adcel(parcel, 7, this.f31368l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
