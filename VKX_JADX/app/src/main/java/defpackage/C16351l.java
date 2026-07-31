package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lّٖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16351l extends AbstractC9453l {
    public static final Parcelable.Creator<C16351l> CREATOR = new C5422l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f31975l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f31976l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f31977l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f31978l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Bundle f31979l;

    public C16351l(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f31977l = j;
        this.f31976l = j2;
        this.f31975l = z;
        this.f31979l = bundle;
        this.f31978l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 8);
        parcel.writeLong(this.f31977l);
        AbstractC9968l.subscription(parcel, 2, 8);
        parcel.writeLong(this.f31976l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f31975l ? 1 : 0);
        AbstractC9968l.purchase(parcel, 7, this.f31979l);
        AbstractC9968l.vip(parcel, 8, this.f31978l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
