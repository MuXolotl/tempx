package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5647l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f11996l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ BinderC3747l f11997l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11998l;

    public /* synthetic */ RunnableC5647l(BinderC3747l binderC3747l, int i, int i2) {
        this.f11998l = i2;
        this.f11997l = binderC3747l;
        this.f11996l = i;
    }

    private final void loadAd() {
        C16014l c16014l = this.f11997l.mopub;
        c16014l.f31393throws = 4;
        List list = c16014l.inmobi;
        int i = this.f11996l;
        synchronized (list) {
            try {
                Iterator it = c16014l.inmobi.iterator();
                while (it.hasNext()) {
                    InterfaceC2695l interfaceC2695l = ((C1066l) it.next()).yandex.purchase;
                    if (interfaceC2695l != null) {
                        try {
                            C17513l c17513l = (C17513l) interfaceC2695l;
                            Parcel parcelM743l = c17513l.m743l();
                            parcelM743l.writeInt(i);
                            c17513l.m741l(parcelM743l, 2);
                        } catch (RemoteException e) {
                            C0189l.remoteconfig.yandex(e, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC2695l.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void yandex() {
        int i = this.f11996l;
        BinderC3747l binderC3747l = this.f11997l;
        C16014l c16014l = binderC3747l.mopub;
        if (i == 0) {
            c16014l.f31393throws = 3;
            c16014l.remoteconfig = true;
            c16014l.vip = true;
            synchronized (c16014l.inmobi) {
                try {
                    Iterator it = c16014l.inmobi.iterator();
                    while (it.hasNext()) {
                        ((C1066l) it.next()).yandex();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        c16014l.f31393throws = 1;
        synchronized (c16014l.inmobi) {
            try {
                Iterator it2 = c16014l.inmobi.iterator();
                while (it2.hasNext()) {
                    InterfaceC2695l interfaceC2695l = ((C1066l) it2.next()).yandex.purchase;
                    if (interfaceC2695l != null) {
                        try {
                            C10602l c10602l = new C10602l(i, null, null);
                            C17513l c17513l = (C17513l) interfaceC2695l;
                            Parcel parcelM743l = c17513l.m743l();
                            AbstractC14627l.loadAd(parcelM743l, c10602l);
                            c17513l.m741l(parcelM743l, 3);
                        } catch (RemoteException e) {
                            C0189l.remoteconfig.yandex(e, "Unable to call %s on %s.", "onConnectionFailed", InterfaceC2695l.class.getSimpleName());
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        binderC3747l.mopub.subs();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11998l) {
            case 0:
                yandex();
                return;
            case 1:
                loadAd();
                return;
            case 2:
                this.f11997l.mopub.appmetrica.loadAd(this.f11996l);
                return;
            default:
                BinderC3747l binderC3747l = this.f11997l;
                C16014l c16014l = binderC3747l.mopub;
                c16014l.ad = -1;
                c16014l.advert = -1;
                c16014l.tapsense = null;
                c16014l.Signature = null;
                c16014l.license = 0.0d;
                c16014l.firebase();
                c16014l.pro = false;
                c16014l.isVip = null;
                c16014l.f31393throws = 1;
                List list = c16014l.inmobi;
                int i = this.f11996l;
                synchronized (list) {
                    try {
                        Iterator it = c16014l.inmobi.iterator();
                        while (it.hasNext()) {
                            InterfaceC2695l interfaceC2695l = ((C1066l) it.next()).yandex.purchase;
                            if (interfaceC2695l != null) {
                                try {
                                    C10602l c10602l = new C10602l(i, null, null);
                                    C17513l c17513l = (C17513l) interfaceC2695l;
                                    Parcel parcelM743l = c17513l.m743l();
                                    AbstractC14627l.loadAd(parcelM743l, c10602l);
                                    c17513l.m741l(parcelM743l, 3);
                                } catch (RemoteException e) {
                                    C0189l.remoteconfig.yandex(e, "Unable to call %s on %s.", "onDisconnected", InterfaceC2695l.class.getSimpleName());
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                C16014l c16014l2 = binderC3747l.mopub;
                c16014l2.subs();
                C12648l c12648l = (C12648l) c16014l2.amazon(c16014l2.firebase, "castDeviceControllerListenerKey").loadAd;
                AbstractC1051l.isPro(c12648l, "Key must not be null");
                c16014l2.crashlytics(c12648l, 8415);
                return;
        }
    }
}
