package defpackage;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: renamed from: lؗؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4644l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11860l f9445l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C10462l f9446l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9447l;

    public RunnableC4644l(C11860l c11860l, C10462l c10462l) {
        this.f9447l = 4;
        this.f9446l = c10462l;
        Objects.requireNonNull(c11860l);
        this.f9445l = c11860l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f9447l;
        C10462l c10462l = this.f9446l;
        C11860l c11860l = this.f9445l;
        switch (i) {
            case 0:
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                C17417l c17417l = (C17417l) c11860l.f833l;
                if (interfaceC5496l != null) {
                    try {
                        interfaceC5496l.mo1800l(c10462l);
                    } catch (RemoteException e) {
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.loadAd(e, "Failed to reset data on the service: remote exception");
                    }
                    c11860l.m3266l();
                } else {
                    C8118l c8118l2 = c17417l.f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.yandex("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                InterfaceC5496l interfaceC5496l2 = c11860l.f23690l;
                C17417l c17417l2 = (C17417l) c11860l.f833l;
                if (interfaceC5496l2 == null) {
                    C8118l c8118l3 = c17417l2.f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.yandex("Discarding data. Failed to send app launch");
                } else {
                    try {
                        C5051l c5051l = c17417l2.f33945l;
                        C3032l c3032l = AbstractC5981l.f12688l;
                        if (c5051l.m1682l(null, c3032l)) {
                            c11860l.m3268l(interfaceC5496l2, null, c10462l);
                        }
                        interfaceC5496l2.license(c10462l);
                        c17417l2.isPro().m3208l();
                        c17417l2.f33945l.m1682l(null, c3032l);
                        c11860l.m3268l(interfaceC5496l2, null, c10462l);
                        c11860l.m3266l();
                    } catch (RemoteException e2) {
                        C8118l c8118l4 = c17417l2.f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16908l.loadAd(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                InterfaceC5496l interfaceC5496l3 = c11860l.f23690l;
                C17417l c17417l3 = (C17417l) c11860l.f833l;
                if (interfaceC5496l3 == null) {
                    C8118l c8118l5 = c17417l3.f33950l;
                    C17417l.admob(c8118l5);
                    c8118l5.f16910l.yandex("Failed to send app backgrounded");
                } else {
                    try {
                        interfaceC5496l3.mo1799l(c10462l);
                        c11860l.m3266l();
                    } catch (RemoteException e3) {
                        C8118l c8118l6 = c17417l3.f33950l;
                        C17417l.admob(c8118l6);
                        c8118l6.f16908l.loadAd(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                InterfaceC5496l interfaceC5496l4 = c11860l.f23690l;
                C17417l c17417l4 = (C17417l) c11860l.f833l;
                if (interfaceC5496l4 == null) {
                    C8118l c8118l7 = c17417l4.f33950l;
                    C17417l.admob(c8118l7);
                    c8118l7.f16908l.yandex("Failed to send measurementEnabled to service");
                } else {
                    try {
                        interfaceC5496l4.mo1797else(c10462l);
                        c11860l.m3266l();
                    } catch (RemoteException e4) {
                        C8118l c8118l8 = c17417l4.f33950l;
                        C17417l.admob(c8118l8);
                        c8118l8.f16908l.loadAd(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                InterfaceC5496l interfaceC5496l5 = c11860l.f23690l;
                C17417l c17417l5 = (C17417l) c11860l.f833l;
                if (interfaceC5496l5 == null) {
                    C8118l c8118l9 = c17417l5.f33950l;
                    C17417l.admob(c8118l9);
                    c8118l9.f16908l.yandex("Failed to send consent settings to service");
                } else {
                    try {
                        interfaceC5496l5.mo1804l(c10462l);
                        c11860l.m3266l();
                    } catch (RemoteException e5) {
                        C8118l c8118l10 = c17417l5.f33950l;
                        C17417l.admob(c8118l10);
                        c8118l10.f16908l.loadAd(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC4644l(C11860l c11860l, C10462l c10462l, int i) {
        this.f9447l = i;
        this.f9446l = c10462l;
        this.f9445l = c11860l;
    }
}
