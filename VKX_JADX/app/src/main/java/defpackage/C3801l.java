package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؕۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3801l extends AbstractC9453l {
    public static final Parcelable.Creator<C3801l> CREATOR = new C18485l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f7914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C9138l[] f7915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Bundle f7916l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C16526l f7917l;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.purchase(parcel, 1, this.f7916l);
        AbstractC9968l.adcel(parcel, 2, this.f7915l, i);
        int i2 = this.f7914l;
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(i2);
        AbstractC9968l.remoteconfig(parcel, 4, this.f7917l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
