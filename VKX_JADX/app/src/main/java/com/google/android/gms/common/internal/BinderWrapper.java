package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import defpackage.BinderC2788l;
import defpackage.C5422l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C5422l(28);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final IBinder f586l;

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f586l = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f586l);
    }

    public BinderWrapper(BinderC2788l binderC2788l) {
        this.f586l = binderC2788l;
    }
}
