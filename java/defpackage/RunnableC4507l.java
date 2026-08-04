package defpackage;

import android.os.RemoteException;

/* JADX INFO: renamed from: lؖۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4507l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11860l f9144l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9145l;

    public /* synthetic */ RunnableC4507l(C11860l c11860l, int i) {
        this.f9145l = i;
        this.f9144l = c11860l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9145l;
        C11860l c11860l = this.f9144l;
        switch (i) {
            case 0:
                c11860l.m3259l();
                break;
            case 1:
                C17417l c17417l = (C17417l) c11860l.f833l;
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                if (interfaceC5496l == null) {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.yandex("Failed to send Dma consent settings to service");
                } else {
                    try {
                        interfaceC5496l.mo1795catch(c11860l.m3269l(false));
                        c11860l.m3266l();
                    } catch (RemoteException e) {
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.loadAd(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                C17417l c17417l2 = (C17417l) c11860l.f833l;
                InterfaceC5496l interfaceC5496l2 = c11860l.f23690l;
                if (interfaceC5496l2 == null) {
                    C8118l c8118l3 = c17417l2.f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.yandex("Failed to send storage consent settings to service");
                } else {
                    try {
                        interfaceC5496l2.inmobi(c11860l.m3269l(false));
                        c11860l.m3266l();
                    } catch (RemoteException e2) {
                        C8118l c8118l4 = c17417l2.f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16908l.loadAd(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
