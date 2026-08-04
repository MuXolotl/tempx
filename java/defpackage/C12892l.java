package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lّ۟ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12892l {
    public final AtomicBoolean crashlytics = new AtomicBoolean(true);
    public final Executor loadAd;
    public final C14952l yandex;

    public C12892l(C14952l c14952l, ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l) {
        this.yandex = c14952l;
        this.loadAd = scheduledExecutorServiceC10335l;
    }
}
