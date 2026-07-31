package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lُ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11361l extends AbstractC9453l {
    public static final Parcelable.Creator<C11361l> CREATOR = new C15160l(12);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f22907l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f22908l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f22909l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f22910l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f22911l;

    public C11361l(int i, boolean z, boolean z2, int i2, int i3) {
        this.f22909l = i;
        this.f22908l = z;
        this.f22907l = z2;
        this.f22911l = i2;
        this.f22910l = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.subscription(parcel, 1, 4);
        parcel.writeInt(this.f22909l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f22908l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(this.f22907l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f22911l);
        AbstractC9968l.subscription(parcel, 5, 4);
        parcel.writeInt(this.f22910l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
