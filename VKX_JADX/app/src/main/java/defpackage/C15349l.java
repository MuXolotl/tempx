package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lٖٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15349l extends AbstractC9453l {
    public static final Parcelable.Creator<C15349l> CREATOR = new C13546l(2);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15905l f30014l;

    public C15349l(C15905l c15905l) {
        this.f30014l = c15905l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.remoteconfig(parcel, 1, this.f30014l, i);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
