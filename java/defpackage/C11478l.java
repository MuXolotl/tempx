package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lُۥٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11478l implements InterfaceC11766l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11766l f23068l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23069l;

    public /* synthetic */ C11478l(InterfaceC11766l interfaceC11766l, int i) {
        this.f23069l = i;
        this.f23068l = interfaceC11766l;
    }

    @Override // defpackage.InterfaceC11766l
    public final Object get() {
        int i = this.f23069l;
        InterfaceC11766l interfaceC11766l = this.f23068l;
        switch (i) {
            case 0:
                Object obj = C7447l.isPro;
                return (InterfaceC7674l) ((AbstractC17238l) interfaceC11766l.get()).billing();
            default:
                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l = (ScheduledExecutorServiceC6354l) interfaceC11766l.get();
                scheduledExecutorServiceC6354l.getClass();
                RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(CallableC14486l.amazon);
                return new ScheduledFutureC7054l(runnableFutureC13286l, scheduledExecutorServiceC6354l.f13317l.schedule(runnableFutureC13286l, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
