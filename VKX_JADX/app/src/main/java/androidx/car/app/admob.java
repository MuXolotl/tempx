package androidx.car.app;

import defpackage.InterfaceC17155l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class admob implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f280l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f281l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f282l;

    public /* synthetic */ admob(Object obj, Object obj2, int i) {
        this.f282l = i;
        this.f281l = obj;
        this.f280l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f282l) {
            case 0:
                CarAppService carAppService = (CarAppService) this.f281l;
                SessionInfo sessionInfo = (SessionInfo) this.f280l;
                synchronized (carAppService.f279l) {
                    try {
                        CarAppBinder carAppBinder = (CarAppBinder) carAppService.f279l.remove(sessionInfo);
                        if (carAppBinder != null) {
                            carAppBinder.onDestroyLifecycle();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((InterfaceC17155l) null).yandex();
                return;
        }
    }
}
