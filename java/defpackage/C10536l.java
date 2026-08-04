package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lًَۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10536l implements InterfaceC2140l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f21441l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ScheduledExecutorServiceC6423l f21442l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21443l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f21444l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f21445l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ TimeUnit f21446l;

    public /* synthetic */ C10536l(ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f21443l = i;
        this.f21442l = scheduledExecutorServiceC6423l;
        this.f21441l = runnable;
        this.f21445l = j;
        this.f21444l = j2;
        this.f21446l = timeUnit;
    }

    @Override // defpackage.InterfaceC2140l
    public final ScheduledFuture yandex(C5138l c5138l) {
        int i = this.f21443l;
        Runnable runnable = this.f21441l;
        ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l = this.f21442l;
        switch (i) {
            case 0:
                return scheduledExecutorServiceC6423l.f13443l.scheduleAtFixedRate(new RunnableC7816l(scheduledExecutorServiceC6423l, runnable, c5138l, 0), this.f21445l, this.f21444l, this.f21446l);
            default:
                return scheduledExecutorServiceC6423l.f13443l.scheduleWithFixedDelay(new RunnableC7816l(scheduledExecutorServiceC6423l, runnable, c5138l, 2), this.f21445l, this.f21444l, this.f21446l);
        }
    }
}
