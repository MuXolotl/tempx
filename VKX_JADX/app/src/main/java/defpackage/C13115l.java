package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lْؕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13115l extends AbstractC9453l {
    public static final Parcelable.Creator<C13115l> CREATOR = new C13546l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f25648l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f25649l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f25650l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f25651l;

    public C13115l(int i, String str, String str2, String str3) {
        this.f25650l = i;
        this.f25649l = str;
        this.f25648l = str2;
        this.f25651l = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f25650l);
        AbstractC9968l.vip(parcel, 2, this.f25649l);
        AbstractC9968l.vip(parcel, 3, this.f25648l);
        AbstractC9968l.vip(parcel, 4, this.f25651l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
