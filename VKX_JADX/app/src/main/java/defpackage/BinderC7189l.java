package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lُؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7189l extends Binder implements InterfaceC17765l {
    public final Handler billing;
    public final Set mopub;
    public final WeakReference purchase;

    public BinderC7189l(AbstractServiceC3639l abstractServiceC3639l) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.purchase = new WeakReference(abstractServiceC3639l);
        this.billing = new Handler(abstractServiceC3639l.getApplicationContext().getMainLooper());
        this.mopub = DesugarCollections.synchronizedSet(new HashSet());
    }

    public static InterfaceC17765l crashlytics(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC17765l)) {
            return (InterfaceC17765l) iInterfaceQueryLocalInterface;
        }
        C18056l c18056l = new C18056l();
        c18056l.purchase = iBinder;
        return c18056l;
    }

    @Override // defpackage.InterfaceC17765l
    /* JADX INFO: renamed from: lْۥٞ, reason: contains not printable characters */
    public final void mo2184l(InterfaceC1087l interfaceC1087l, Bundle bundle) {
        if (interfaceC1087l == null || bundle == null) {
            AbstractC2632l.purchase(interfaceC1087l);
            return;
        }
        try {
            C0176l c0176lYandex = C0176l.yandex(bundle);
            String str = c0176lYandex.crashlytics;
            AbstractServiceC3639l abstractServiceC3639l = (AbstractServiceC3639l) this.purchase.get();
            if (abstractServiceC3639l == null) {
                AbstractC2632l.purchase(interfaceC1087l);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = c0176lYandex.amazon;
            }
            if (AbstractC2632l.loadAd(callingUid, abstractServiceC3639l, str) == 0) {
                C16701l c16701l = new C16701l(str, callingPid, callingUid);
                boolean zSmaato = C1770l.firebase(abstractServiceC3639l.getApplicationContext()).smaato(c16701l);
                this.mopub.add(interfaceC1087l);
                try {
                    this.billing.post(new RunnableC3009l(this, interfaceC1087l, c16701l, c0176lYandex, zSmaato));
                    return;
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            AbstractC6427l.vip("MSessionService", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
            AbstractC2632l.purchase(interfaceC1087l);
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            AbstractC2632l.purchase(interfaceC1087l);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo2184l(BinderC11857l.crashlytics(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
