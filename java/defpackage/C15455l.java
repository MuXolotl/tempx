package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: lٕۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15455l extends AbstractC9453l {
    public static final Parcelable.Creator<C15455l> CREATOR = new C15160l(25);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f30217l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f30218l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f30219l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f30220l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String[] f30221l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f30222l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f30223l;

    public C15455l(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.f30220l = j;
        this.f30219l = str;
        this.f30217l = j2;
        this.f30222l = z;
        this.f30221l = strArr;
        this.f30223l = z2;
        this.f30218l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15455l)) {
            return false;
        }
        C15455l c15455l = (C15455l) obj;
        return AbstractC15091l.crashlytics(this.f30219l, c15455l.f30219l) && this.f30220l == c15455l.f30220l && this.f30217l == c15455l.f30217l && this.f30222l == c15455l.f30222l && Arrays.equals(this.f30221l, c15455l.f30221l) && this.f30223l == c15455l.f30223l && this.f30218l == c15455l.f30218l;
    }

    public final int hashCode() {
        return this.f30219l.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f30220l);
        AbstractC9968l.vip(parcel, 3, this.f30219l);
        AbstractC9968l.subscription(parcel, 4, 8);
        parcel.writeLong(this.f30217l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f30222l ? 1 : 0);
        AbstractC9968l.metrica(parcel, 6, this.f30221l);
        AbstractC9968l.subscription(parcel, 7, 4);
        parcel.writeInt(this.f30223l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f30218l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
