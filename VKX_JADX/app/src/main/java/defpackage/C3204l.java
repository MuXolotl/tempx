package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: lؕؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3204l extends View.BaseSavedState {
    public static final Parcelable.Creator<C3204l> CREATOR = new C17440l(3);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f6863l;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f6863l ? (byte) 1 : (byte) 0);
    }
}
