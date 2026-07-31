package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٌُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17840l extends AbstractC9453l {
    public static final Parcelable.Creator<C17840l> CREATOR = new C13546l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f34767l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18243l f34768l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3434l f34769l;

    public C17840l(C3434l c3434l, C18243l c18243l, boolean z) {
        this.f34769l = c3434l;
        this.f34768l = c18243l;
        this.f34767l = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f34769l, i);
        AbstractC9968l.remoteconfig(parcel, 2, this.f34768l, i);
        AbstractC9968l.subscription(parcel, 3, 4);
        parcel.writeInt(1);
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f34767l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
