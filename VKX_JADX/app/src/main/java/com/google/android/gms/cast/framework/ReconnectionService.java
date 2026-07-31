package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.AbstractC1051l;
import defpackage.AbstractC10649l;
import defpackage.AbstractC14627l;
import defpackage.BinderC14844l;
import defpackage.C0022l;
import defpackage.C1237l;
import defpackage.C1248l;
import defpackage.C12808l;
import defpackage.C1334l;
import defpackage.C15504l;
import defpackage.C17667l;
import defpackage.C1942l;
import defpackage.C5529l;
import defpackage.InterfaceC3396l;
import defpackage.InterfaceC9741l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C0022l f573l = new C0022l("ReconnectionService", null);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC9741l f574l;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        InterfaceC9741l interfaceC9741l = this.f574l;
        if (interfaceC9741l != null) {
            try {
                C1942l c1942l = (C1942l) interfaceC9741l;
                Parcel parcelM743l = c1942l.m743l();
                AbstractC14627l.loadAd(parcelM743l, intent);
                Parcel parcelM746l = c1942l.m746l(parcelM743l, 3);
                IBinder strongBinder = parcelM746l.readStrongBinder();
                parcelM746l.recycle();
                return strongBinder;
            } catch (RemoteException e) {
                f573l.yandex(e, "Unable to call %s on %s.", "onBind", InterfaceC9741l.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC3396l interfaceC3396lM3896l;
        InterfaceC3396l interfaceC3396lM3896l2;
        C15504l c15504lYandex = C15504l.yandex(this);
        c15504lYandex.getClass();
        AbstractC1051l.purchase("Must be called from the main thread.");
        C17667l c17667l = c15504lYandex.loadAd;
        c17667l.getClass();
        InterfaceC9741l interfaceC9741lM3503l = null;
        try {
            C5529l c5529l = c17667l.yandex;
            Parcel parcelM746l = c5529l.m746l(c5529l.m743l(), 7);
            interfaceC3396lM3896l = BinderC14844l.m3896l(parcelM746l.readStrongBinder());
            parcelM746l.recycle();
        } catch (RemoteException e) {
            C17667l.crashlytics.yandex(e, "Unable to call %s on %s.", "getWrappedThis", C5529l.class.getSimpleName());
            interfaceC3396lM3896l = null;
        }
        AbstractC1051l.purchase("Must be called from the main thread.");
        C1248l c1248l = c15504lYandex.crashlytics;
        c1248l.getClass();
        try {
            C1334l c1334l = c1248l.yandex;
            Parcel parcelM746l2 = c1334l.m746l(c1334l.m743l(), 5);
            interfaceC3396lM3896l2 = BinderC14844l.m3896l(parcelM746l2.readStrongBinder());
            parcelM746l2.recycle();
        } catch (RemoteException e2) {
            C1248l.loadAd.yandex(e2, "Unable to call %s on %s.", "getWrappedThis", C1334l.class.getSimpleName());
            interfaceC3396lM3896l2 = null;
        }
        C0022l c0022l = AbstractC10649l.yandex;
        if (interfaceC3396lM3896l != null && interfaceC3396lM3896l2 != null) {
            try {
                interfaceC9741lM3503l = AbstractC10649l.loadAd(getApplicationContext()).m3503l(new BinderC14844l(this), interfaceC3396lM3896l, interfaceC3396lM3896l2);
            } catch (RemoteException | C1237l e3) {
                AbstractC10649l.yandex.yandex(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", C12808l.class.getSimpleName());
            }
        }
        this.f574l = interfaceC9741lM3503l;
        if (interfaceC9741lM3503l != null) {
            try {
                C1942l c1942l = (C1942l) interfaceC9741lM3503l;
                c1942l.m741l(c1942l.m743l(), 1);
            } catch (RemoteException e4) {
                f573l.yandex(e4, "Unable to call %s on %s.", "onCreate", InterfaceC9741l.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        InterfaceC9741l interfaceC9741l = this.f574l;
        if (interfaceC9741l != null) {
            try {
                C1942l c1942l = (C1942l) interfaceC9741l;
                c1942l.m741l(c1942l.m743l(), 4);
            } catch (RemoteException e) {
                f573l.yandex(e, "Unable to call %s on %s.", "onDestroy", InterfaceC9741l.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        InterfaceC9741l interfaceC9741l = this.f574l;
        if (interfaceC9741l != null) {
            try {
                C1942l c1942l = (C1942l) interfaceC9741l;
                Parcel parcelM743l = c1942l.m743l();
                AbstractC14627l.loadAd(parcelM743l, intent);
                parcelM743l.writeInt(i);
                parcelM743l.writeInt(i2);
                Parcel parcelM746l = c1942l.m746l(parcelM743l, 2);
                int i3 = parcelM746l.readInt();
                parcelM746l.recycle();
                return i3;
            } catch (RemoteException e) {
                f573l.yandex(e, "Unable to call %s on %s.", "onStartCommand", InterfaceC9741l.class.getSimpleName());
            }
        }
        return 2;
    }
}
