package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0152l extends AbstractC9453l {
    public static final Parcelable.Creator<C0152l> CREATOR = new C10538l(25);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f1063l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final String f1064l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f1065l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f1066l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f1067l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f1068l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f1069l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f1070l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f1071l;

    public C0152l(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f1067l = i;
        this.f1066l = i2;
        this.f1063l = i3;
        this.f1069l = j;
        this.f1068l = j2;
        this.f1071l = str;
        this.f1064l = str2;
        this.f1065l = i4;
        this.f1070l = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f1067l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f1066l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f1063l);
        AbstractC9968l.subscription(parcel, 4, 8);
        parcel.writeLong(this.f1069l);
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(this.f1068l);
        AbstractC9968l.vip(parcel, 6, this.f1071l);
        AbstractC9968l.vip(parcel, 7, this.f1064l);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f1065l);
        AbstractC9968l.subscription(parcel, 9, 4);
        parcel.writeInt(this.f1070l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
