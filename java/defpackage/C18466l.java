package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18466l extends AbstractC9453l {
    public static final Parcelable.Creator<C18466l> CREATOR = new C10538l(18);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f36065l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f36066l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f36067l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f36068l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f36069l;

    public C18466l(int i, int i2, long j, String str, boolean z) {
        this.f36067l = i;
        this.f36066l = str;
        this.f36065l = j;
        this.f36069l = i2;
        this.f36068l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f36067l);
        AbstractC9968l.vip(parcel, 2, this.f36066l);
        AbstractC9968l.subscription(parcel, 3, 8);
        parcel.writeLong(this.f36065l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f36069l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f36068l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
