package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؙؗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5209l extends AbstractC9453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f11288l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f11289l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f11290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f11291l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f11292l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C0022l f11287l = new C0022l("AdBreakStatus", null);
    public static final Parcelable.Creator<C5209l> CREATOR = new C13546l(27);

    public C5209l(long j, long j2, String str, String str2, long j3) {
        this.f11290l = j;
        this.f11289l = j2;
        this.f11288l = str;
        this.f11292l = str2;
        this.f11291l = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5209l)) {
            return false;
        }
        C5209l c5209l = (C5209l) obj;
        return this.f11290l == c5209l.f11290l && this.f11289l == c5209l.f11289l && AbstractC15091l.crashlytics(this.f11288l, c5209l.f11288l) && AbstractC15091l.crashlytics(this.f11292l, c5209l.f11292l) && this.f11291l == c5209l.f11291l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f11290l), Long.valueOf(this.f11289l), this.f11288l, this.f11292l, Long.valueOf(this.f11291l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f11290l);
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(this.f11289l);
        AbstractC9968l.vip(parcel, 4, this.f11288l);
        AbstractC9968l.vip(parcel, 5, this.f11292l);
        AbstractC9968l.subscription(parcel, 6, 8);
        parcel.writeLong(this.f11291l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
