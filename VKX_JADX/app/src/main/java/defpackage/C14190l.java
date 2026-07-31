package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: lٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14190l implements InterfaceC1662l {
    public IBinder purchase;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC1662l
    /* JADX INFO: renamed from: lؚؚؔ */
    public final void mo843l(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            playbackStateCompat.writeToParcel(parcelObtain, 0);
            this.purchase.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
