package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: l٘ؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17667l {
    public static final C0022l crashlytics = new C0022l("SessionManager", null);
    public final Context loadAd;
    public final C5529l yandex;

    public C17667l(C5529l c5529l, Context context) {
        this.yandex = c5529l;
        this.loadAd = context;
    }

    public final AbstractC11229l crashlytics() {
        AbstractC1051l.purchase("Must be called from the main thread.");
        try {
            C5529l c5529l = this.yandex;
            Parcel parcelM746l = c5529l.m746l(c5529l.m743l(), 1);
            InterfaceC3396l interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM746l.readStrongBinder());
            parcelM746l.recycle();
            return (AbstractC11229l) BinderC14844l.m3897l(interfaceC3396lM3896l);
        } catch (RemoteException e) {
            crashlytics.yandex(e, "Unable to call %s on %s.", "getWrappedCurrentSession", C5529l.class.getSimpleName());
            return null;
        }
    }

    public final void loadAd(boolean z) {
        C0022l c0022l = crashlytics;
        AbstractC1051l.purchase("Must be called from the main thread.");
        try {
            Log.i(c0022l.yandex, c0022l.amazon("End session for %s", this.loadAd.getPackageName()));
            C5529l c5529l = this.yandex;
            Parcel parcelM743l = c5529l.m743l();
            int i = AbstractC14627l.yandex;
            parcelM743l.writeInt(1);
            parcelM743l.writeInt(z ? 1 : 0);
            c5529l.m741l(parcelM743l, 6);
        } catch (RemoteException e) {
            c0022l.yandex(e, "Unable to call %s on %s.", "endCurrentSession", C5529l.class.getSimpleName());
        }
    }

    public final void yandex(InterfaceC14623l interfaceC14623l) {
        AbstractC1051l.purchase("Must be called from the main thread.");
        try {
            C5529l c5529l = this.yandex;
            BinderC2379l binderC2379l = new BinderC2379l(interfaceC14623l);
            Parcel parcelM743l = c5529l.m743l();
            AbstractC14627l.crashlytics(parcelM743l, binderC2379l);
            c5529l.m741l(parcelM743l, 2);
        } catch (RemoteException e) {
            crashlytics.yandex(e, "Unable to call %s on %s.", "addSessionManagerListener", C5529l.class.getSimpleName());
        }
    }
}
