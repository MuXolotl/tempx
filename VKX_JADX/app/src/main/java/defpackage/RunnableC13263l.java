package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lٍْۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC13263l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC14909l f26038l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5496l f26039l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26040l;

    public /* synthetic */ RunnableC13263l(ServiceConnectionC14909l serviceConnectionC14909l, InterfaceC5496l interfaceC5496l, int i) {
        this.f26040l = i;
        this.f26039l = interfaceC5496l;
        this.f26038l = serviceConnectionC14909l;
    }

    private final void yandex() {
        ServiceConnectionC14909l serviceConnectionC14909l = this.f26038l;
        synchronized (serviceConnectionC14909l) {
            try {
                serviceConnectionC14909l.f29353l = false;
                C11860l c11860l = serviceConnectionC14909l.f29351l;
                if (!c11860l.m3262l()) {
                    C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16911l.yandex("Connected to service");
                    InterfaceC5496l interfaceC5496l = this.f26039l;
                    c11860l.mo211l();
                    c11860l.f23690l = interfaceC5496l;
                    c11860l.m3266l();
                    c11860l.m3258l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26040l) {
            case 0:
                yandex();
                return;
            default:
                ServiceConnectionC14909l serviceConnectionC14909l = this.f26038l;
                synchronized (serviceConnectionC14909l) {
                    try {
                        serviceConnectionC14909l.f29353l = false;
                        C11860l c11860l = serviceConnectionC14909l.f29351l;
                        if (!c11860l.m3262l()) {
                            C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16918l.yandex("Connected to remote service");
                            InterfaceC5496l interfaceC5496l = this.f26039l;
                            c11860l.mo211l();
                            c11860l.f23690l = interfaceC5496l;
                            c11860l.m3266l();
                            c11860l.m3258l();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                C11860l c11860l2 = this.f26038l.f29351l;
                ScheduledExecutorService scheduledExecutorService = c11860l2.f23688l;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c11860l2.f23688l = null;
                    return;
                }
                return;
        }
    }
}
