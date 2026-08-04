package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lٟؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1157l extends Binder implements InterfaceC1662l {
    public final WeakReference purchase;

    public BinderC1157l() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.purchase = new WeakReference(null);
    }

    @Override // defpackage.InterfaceC1662l
    /* JADX INFO: renamed from: lؚؚؔ, reason: contains not printable characters */
    public final void mo843l(PlaybackStateCompat playbackStateCompat) {
        if (this.purchase.get() == null) {
            return;
        }
        C18725l.loadAd();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.purchase.get() != null) {
                    C18725l.loadAd();
                    return false;
                }
                return true;
            case 2:
                C11586l.yandex();
                return false;
            case 3:
                mo843l((PlaybackStateCompat) AbstractC1762l.yandex(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                C11586l.yandex();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                C11586l.yandex();
                return false;
            case 6:
                C11586l.yandex();
                return false;
            case 7:
                C11586l.yandex();
                return false;
            case 8:
                C11586l.yandex();
                return false;
            case 9:
                parcel.readInt();
                if (this.purchase.get() != null) {
                    C18725l.loadAd();
                    return false;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.purchase.get() != null) {
                    C18725l.loadAd();
                    return false;
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.purchase.get() != null) {
                    C18725l.loadAd();
                    return false;
                }
                return true;
            case 13:
                if (this.purchase.get() != null) {
                    C18725l.loadAd();
                    return false;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
