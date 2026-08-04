package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؙؙۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6305l implements InterfaceC7674l {
    public static boolean amazon;
    public final C11360l crashlytics;
    public final int loadAd;
    public final InterfaceC11766l yandex;

    public C6305l(InterfaceC11766l interfaceC11766l) {
        C11360l c11360l = C11360l.f22904l;
        this.yandex = interfaceC11766l;
        this.loadAd = Math.max(5, 10);
        this.crashlytics = c11360l;
    }

    @Override // defpackage.InterfaceC7674l
    public final void zza() {
        synchronized (C6305l.class) {
            try {
                if (!amazon) {
                    RunnableC10799l runnableC10799l = new RunnableC10799l(18, this);
                    long j = this.loadAd;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l = (ScheduledExecutorServiceC6354l) this.yandex.get();
                    RunnableC3094l runnableC3094l = new RunnableC3094l(this, runnableC10799l, scheduledExecutorServiceC6354l, j);
                    scheduledExecutorServiceC6354l.getClass();
                    RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(Executors.callable(runnableC3094l, null));
                    ScheduledFutureC7054l scheduledFutureC7054l = new ScheduledFutureC7054l(runnableFutureC13286l, scheduledExecutorServiceC6354l.f13317l.schedule(runnableFutureC13286l, j, timeUnit));
                    scheduledFutureC7054l.yandex(new RunnableC6011l(1, scheduledFutureC7054l), EnumC1535l.f3808l);
                    amazon = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
