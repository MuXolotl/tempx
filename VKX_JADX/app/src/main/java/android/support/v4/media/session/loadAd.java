package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import androidx.car.app.navigation.model.Maneuver;
import defpackage.C11586l;
import defpackage.C14190l;
import defpackage.C3070l;
import defpackage.C7272l;
import defpackage.InterfaceC1662l;
import defpackage.InterfaceC4716l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class loadAd extends Binder implements InterfaceC4716l {
    public static final /* synthetic */ int billing = 0;
    public final AtomicReference purchase;

    public loadAd(C7272l c7272l) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.purchase = new AtomicReference(c7272l);
    }

    public final void crashlytics(InterfaceC1662l interfaceC1662l) {
        C7272l c7272l = (C7272l) this.purchase.get();
        if (c7272l == null) {
            return;
        }
        c7272l.purchase.register(interfaceC1662l, new C3070l("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c7272l.amazon) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC1662l interfaceC1662l = null;
        PlaybackStateCompat playbackStateCompat = null;
        InterfaceC1662l interfaceC1662l2 = null;
        switch (i) {
            case 1:
                parcel.readString();
                C11586l.yandex();
                return false;
            case 2:
                C11586l.yandex();
                return false;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1662l)) {
                        C14190l c14190l = new C14190l();
                        c14190l.purchase = strongBinder;
                        interfaceC1662l = c14190l;
                    } else {
                        interfaceC1662l = (InterfaceC1662l) iInterfaceQueryLocalInterface;
                    }
                }
                crashlytics(interfaceC1662l);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1662l)) {
                        C14190l c14190l2 = new C14190l();
                        c14190l2.purchase = strongBinder2;
                        interfaceC1662l2 = c14190l2;
                    } else {
                        interfaceC1662l2 = (InterfaceC1662l) iInterfaceQueryLocalInterface2;
                    }
                }
                C7272l c7272l = (C7272l) this.purchase.get();
                if (c7272l != null) {
                    c7272l.purchase.unregister(interfaceC1662l2);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (c7272l.amazon) {
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
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
                C11586l.yandex();
                return false;
            case 10:
                C11586l.yandex();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                C11586l.yandex();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                C11586l.yandex();
                return false;
            case 13:
                C11586l.yandex();
                return false;
            case 14:
                parcel.readString();
                C11586l.yandex();
                return false;
            case 15:
                parcel.readString();
                C11586l.yandex();
                return false;
            case 16:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                parcel.readLong();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C11586l.yandex();
                return false;
            case 20:
                C11586l.yandex();
                return false;
            case 21:
                C11586l.yandex();
                return false;
            case 22:
                C11586l.yandex();
                return false;
            case 23:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                parcel.readLong();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                parcel.readString();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C7272l c7272l2 = (C7272l) this.purchase.get();
                if (c7272l2 != null) {
                    playbackStateCompat = c7272l2.billing;
                    MediaMetadataCompat mediaMetadataCompat = c7272l2.mopub;
                    if (playbackStateCompat != null) {
                        float f = playbackStateCompat.f53l;
                        long j2 = playbackStateCompat.f48l;
                        int i4 = playbackStateCompat.f50l;
                        long j3 = playbackStateCompat.f49l;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = ((long) (f * (jElapsedRealtime - j2))) + j3;
                            if (mediaMetadataCompat != null) {
                                Bundle bundle = mediaMetadataCompat.f30l;
                                if (bundle.containsKey("android.media.metadata.DURATION")) {
                                    j4 = bundle.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j4 < 0 || j5 <= j4) {
                                j = j5 < 0 ? 0L : j5;
                            } else {
                                j = j4;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j6 = playbackStateCompat.f46l;
                            long j7 = playbackStateCompat.f52l;
                            int i5 = playbackStateCompat.f56l;
                            CharSequence charSequence = playbackStateCompat.f47l;
                            ArrayList arrayList2 = playbackStateCompat.f55l;
                            if (arrayList2 != null) {
                                arrayList.addAll(arrayList2);
                            }
                            playbackStateCompat = new PlaybackStateCompat(playbackStateCompat.f50l, j, j6, playbackStateCompat.f53l, j7, i5, charSequence, jElapsedRealtime, arrayList, playbackStateCompat.f51l, playbackStateCompat.f57l);
                        }
                    }
                }
                parcel2.writeNoException();
                if (playbackStateCompat == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                playbackStateCompat.writeToParcel(parcel2, 1);
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                C11586l.yandex();
                return false;
            case 31:
                C11586l.yandex();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                parcel.readString();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                parcel.readString();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                i3 = ((C7272l) this.purchase.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                parcel.readInt();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                parcel.readInt();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                parcel.readInt();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                parcel.readInt();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                i3 = ((C7272l) this.purchase.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                parcel.readInt();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                parcel.readFloat();
                C11586l.yandex();
                return false;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                ((C7272l) this.purchase.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 51:
                C11586l.yandex();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
