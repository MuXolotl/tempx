package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٕۘۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15905l extends AbstractC9453l {
    public static final Parcelable.Creator<C15905l> CREATOR = new C13546l(14);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f31213l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f31214l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f31215l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f31216l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final float f31217l;

    public C15905l(boolean z, byte[] bArr, boolean z2, float f, boolean z3) {
        this.f31215l = z;
        this.f31214l = bArr;
        this.f31213l = z2;
        this.f31217l = f;
        this.f31216l = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f31215l ? 1 : 0);
        AbstractC9968l.billing(parcel, 2, this.f31214l);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f31213l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeFloat(this.f31217l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f31216l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
