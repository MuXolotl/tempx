package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: lُٟۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11229l {
    public static final C0022l loadAd = new C0022l("Session", null);
    public final InterfaceC13996l yandex;

    public AbstractC11229l(Context context, String str, String str2) {
        InterfaceC13996l interfaceC13996lM3506l;
        try {
            interfaceC13996lM3506l = AbstractC10649l.loadAd(context).m3506l(str, str2, new BinderC3285l(this));
        } catch (RemoteException | C1237l e) {
            AbstractC10649l.yandex.yandex(e, "Unable to call %s on %s.", "newSessionImpl", C12808l.class.getSimpleName());
            interfaceC13996lM3506l = null;
        }
        this.yandex = interfaceC13996lM3506l;
    }

    public final InterfaceC3396l crashlytics() {
        InterfaceC13996l interfaceC13996l = this.yandex;
        if (interfaceC13996l != null) {
            try {
                C10679l c10679l = (C10679l) interfaceC13996l;
                Parcel parcelM746l = c10679l.m746l(c10679l.m743l(), 1);
                InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM746l.readStrongBinder());
                parcelM746l.recycle();
                return interfaceC3396lM3896l;
            } catch (RemoteException e) {
                loadAd.yandex(e, "Unable to call %s on %s.", "getWrappedObject", InterfaceC13996l.class.getSimpleName());
            }
        }
        return null;
    }

    public final int loadAd() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        InterfaceC13996l interfaceC13996l = this.yandex;
        if (interfaceC13996l != null) {
            try {
                C10679l c10679l = (C10679l) interfaceC13996l;
                Parcel parcelM746l = c10679l.m746l(c10679l.m743l(), 17);
                int i = parcelM746l.readInt();
                parcelM746l.recycle();
                if (i >= 211100000) {
                    C10679l c10679l2 = (C10679l) interfaceC13996l;
                    Parcel parcelM746l2 = c10679l2.m746l(c10679l2.m743l(), 18);
                    int i2 = parcelM746l2.readInt();
                    parcelM746l2.recycle();
                    return i2;
                }
            } catch (RemoteException e) {
                loadAd.yandex(e, "Unable to call %s on %s.", "getSessionStartType", InterfaceC13996l.class.getSimpleName());
            }
        }
        return 0;
    }

    public final void yandex(int i) {
        InterfaceC13996l interfaceC13996l = this.yandex;
        if (interfaceC13996l == null) {
            return;
        }
        try {
            C10679l c10679l = (C10679l) interfaceC13996l;
            Parcel parcelM743l = c10679l.m743l();
            parcelM743l.writeInt(i);
            c10679l.m741l(parcelM743l, 13);
        } catch (RemoteException e) {
            loadAd.yandex(e, "Unable to call %s on %s.", "notifySessionEnded", InterfaceC13996l.class.getSimpleName());
        }
    }
}
