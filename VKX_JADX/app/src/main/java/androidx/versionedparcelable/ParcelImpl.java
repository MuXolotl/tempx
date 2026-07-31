package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.C17440l;
import defpackage.C9890l;
import defpackage.InterfaceC12713l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C17440l(27);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC12713l f477l;

    public ParcelImpl(Parcel parcel) {
        this.f477l = new C9890l(parcel).admob();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C9890l(parcel).smaato(this.f477l);
    }

    public ParcelImpl(InterfaceC12713l interfaceC12713l) {
        this.f477l = interfaceC12713l;
    }
}
