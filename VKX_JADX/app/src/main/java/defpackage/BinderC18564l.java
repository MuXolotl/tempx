package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lۚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC18564l extends Binder implements InterfaceC3145l {
    public static final /* synthetic */ int billing = 0;
    public final WeakReference purchase;

    public BinderC18564l(C17977l c17977l) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.purchase = new WeakReference(c17977l);
    }

    @Override // defpackage.InterfaceC3145l
    /* JADX INFO: renamed from: lْ٘ۚ */
    public final void mo1291l(int i) {
        C17977l c17977l = (C17977l) this.purchase.get();
        if (c17977l != null) {
            c17977l.crashlytics(12, Integer.valueOf(i));
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            subscription(parcel.readInt() != 0 ? C16830l.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            subs(parcel.readInt());
            return true;
        }
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.purchase;
        switch (i) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                C17977l c17977l = (C17977l) weakReference.get();
                if (c17977l != null) {
                    c17977l.crashlytics(11, Boolean.valueOf(z));
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                mo1291l(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                C17977l c17977l2 = (C17977l) weakReference.get();
                if (c17977l2 != null) {
                    c17977l2.crashlytics(13, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.InterfaceC3145l
    public final void subs(int i) {
        C17977l c17977l = (C17977l) this.purchase.get();
        if (c17977l != null) {
            c17977l.crashlytics(9, Integer.valueOf(i));
        }
    }

    @Override // defpackage.InterfaceC3145l
    public final void subscription(C16830l c16830l) {
        C17977l c17977l = (C17977l) this.purchase.get();
        if (c17977l != null) {
            c17977l.crashlytics(2, c16830l);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
