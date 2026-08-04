package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lَُؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ScheduledFutureC0975l extends AbstractC4867l implements ScheduledFuture {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final ScheduledFuture f2689l;

    public ScheduledFutureC0975l(InterfaceC2140l interfaceC2140l) {
        this.f2689l = interfaceC2140l.yandex(new C5138l(11, this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f2689l.compareTo(delayed);
    }

    @Override // defpackage.AbstractC4867l
    public final void crashlytics() {
        ScheduledFuture scheduledFuture = this.f2689l;
        Object obj = this.f9932l;
        scheduledFuture.cancel((obj instanceof C13118l) && ((C13118l) obj).yandex);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2689l.getDelay(timeUnit);
    }
}
