package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4934l extends Binder implements InterfaceC3669l {
    public static final /* synthetic */ int billing = 0;
    public final /* synthetic */ MultiInstanceInvalidationService purchase;

    public BinderC4934l(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.purchase = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC3669l.loadAd);
    }

    @Override // defpackage.InterfaceC3669l
    public final int appmetrica(InterfaceC6779l interfaceC6779l, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.purchase;
        synchronized (multiInstanceInvalidationService.f473l) {
            try {
                int i2 = multiInstanceInvalidationService.f475l + 1;
                multiInstanceInvalidationService.f475l = i2;
                if (multiInstanceInvalidationService.f473l.register(interfaceC6779l, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f474l.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f475l--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC3669l
    /* JADX INFO: renamed from: lٍؘؘ */
    public final void mo1408l(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.purchase;
        synchronized (multiInstanceInvalidationService.f473l) {
            try {
                String str = (String) multiInstanceInvalidationService.f474l.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f473l.beginBroadcast();
                int i2 = 0;
                while (true) {
                    RemoteCallbackListC15118l remoteCallbackListC15118l = multiInstanceInvalidationService.f473l;
                    if (i2 >= iBeginBroadcast) {
                        remoteCallbackListC15118l.finishBroadcast();
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    try {
                        Integer num = (Integer) remoteCallbackListC15118l.getBroadcastCookie(i2);
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f474l.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC6779l) multiInstanceInvalidationService.f473l.getBroadcastItem(i2)).pro(strArr);
                                Unit unit2 = Unit.INSTANCE;
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f473l.finishBroadcast();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC3669l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final void mo1409l(InterfaceC6779l interfaceC6779l, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.purchase;
        synchronized (multiInstanceInvalidationService.f473l) {
            multiInstanceInvalidationService.f473l.unregister(interfaceC6779l);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC3669l.loadAd;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC6779l interfaceC6779l = null;
        InterfaceC6779l interfaceC6779l2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC6779l.yandex);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC6779l)) {
                    C16709l c16709l = new C16709l();
                    c16709l.purchase = strongBinder;
                    interfaceC6779l = c16709l;
                } else {
                    interfaceC6779l = (InterfaceC6779l) iInterfaceQueryLocalInterface;
                }
            }
            int iAppmetrica = appmetrica(interfaceC6779l, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iAppmetrica);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo1408l(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC6779l.yandex);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC6779l)) {
                C16709l c16709l2 = new C16709l();
                c16709l2.purchase = strongBinder2;
                interfaceC6779l2 = c16709l2;
            } else {
                interfaceC6779l2 = (InterfaceC6779l) iInterfaceQueryLocalInterface2;
            }
        }
        mo1409l(interfaceC6779l2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
