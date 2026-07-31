package defpackage;

/* JADX INFO: renamed from: lًؘٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7816l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f16335l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC6423l f16336l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16337l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C5138l f16338l;

    public /* synthetic */ RunnableC7816l(ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l, Runnable runnable, C5138l c5138l, int i) {
        this.f16337l = i;
        this.f16336l = scheduledExecutorServiceC6423l;
        this.f16335l = runnable;
        this.f16338l = c5138l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16337l;
        final C5138l c5138l = this.f16338l;
        final Runnable runnable = this.f16335l;
        ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l = this.f16336l;
        switch (i) {
            case 0:
                final int i2 = 0;
                scheduledExecutorServiceC6423l.f13444l.execute(new Runnable() { // from class: lؚٕؗ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i3 = i2;
                        C5138l c5138l2 = c5138l;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0975l scheduledFutureC0975l = (ScheduledFutureC0975l) c5138l2.f11181l;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0975l.isPro(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0975l.firebase(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                scheduledExecutorServiceC6423l.f13444l.execute(new Runnable() { // from class: lؚٕؗ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i4 = i3;
                        C5138l c5138l2 = c5138l;
                        Runnable runnable2 = runnable;
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0975l scheduledFutureC0975l = (ScheduledFutureC0975l) c5138l2.f11181l;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0975l.isPro(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0975l.firebase(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                scheduledExecutorServiceC6423l.f13444l.execute(new Runnable() { // from class: lؚٕؗ
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i5 = i4;
                        C5138l c5138l2 = c5138l;
                        Runnable runnable2 = runnable;
                        switch (i5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((ScheduledFutureC0975l) c5138l2.f11181l).firebase(e2);
                                    return;
                                }
                            default:
                                ScheduledFutureC0975l scheduledFutureC0975l = (ScheduledFutureC0975l) c5138l2.f11181l;
                                try {
                                    runnable2.run();
                                    scheduledFutureC0975l.isPro(null);
                                    return;
                                } catch (Exception e3) {
                                    scheduledFutureC0975l.firebase(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
