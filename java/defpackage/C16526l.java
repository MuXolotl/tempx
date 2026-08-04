package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16526l extends AbstractC9453l {
    public static final Parcelable.Creator<C16526l> CREATOR = new C18485l(22);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f32296l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f32297l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11361l f32298l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f32299l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int[] f32300l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int[] f32301l;

    public C16526l(C11361l c11361l, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f32298l = c11361l;
        this.f32297l = z;
        this.f32296l = z2;
        this.f32300l = iArr;
        this.f32299l = i;
        this.f32301l = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f32298l, i);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f32297l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f32296l ? 1 : 0);
        AbstractC9968l.subs(parcel, 4, this.f32300l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f32299l);
        AbstractC9968l.subs(parcel, 6, this.f32301l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
