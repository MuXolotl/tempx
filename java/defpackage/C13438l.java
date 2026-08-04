package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lْٗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13438l extends AbstractC9453l {
    public static final Parcelable.Creator<C13438l> CREATOR = new C1800l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f26375l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f26376l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f26377l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f26378l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f26379l;

    public C13438l(int i, int i2, long j, String str, boolean z) {
        this.f26377l = z;
        this.f26376l = str;
        this.f26375l = AbstractC8532l.smaato(i) - 1;
        this.f26379l = AbstractC11994l.metrica(i2) - 1;
        this.f26378l = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f26377l ? 1 : 0);
        AbstractC9968l.vip(parcel, 2, this.f26376l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f26375l);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f26379l);
        AbstractC9968l.subscription(parcel, 5, 8);
        parcel.writeLong(this.f26378l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
