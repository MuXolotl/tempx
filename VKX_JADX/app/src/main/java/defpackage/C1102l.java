package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: lؒٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1102l implements Parcelable {
    public static final Parcelable.Creator<C1102l> CREATOR = new C10538l(7);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC0041l f3039l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f3039l == null) {
                    this.f3039l = new BinderC6847l(this);
                }
                parcel.writeStrongBinder(this.f3039l.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void yandex(int i, Bundle bundle) {
    }
}
