package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: renamed from: lٖٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC16121l extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final RunnableC4025l f31575l;

    public /* synthetic */ RunnableC16121l(RunnableC4025l runnableC4025l) {
        this.f31575l = runnableC4025l;
    }

    public final String toString() {
        return this.f31575l.toString();
    }

    public final /* synthetic */ void yandex(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
