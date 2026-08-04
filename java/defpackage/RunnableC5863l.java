package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: renamed from: lٍؘٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5863l extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractRunnableC11612l f12355l;

    public RunnableC5863l(AbstractRunnableC11612l abstractRunnableC11612l) {
        this.f12355l = abstractRunnableC11612l;
    }

    public static void yandex(RunnableC5863l runnableC5863l, Thread thread) {
        runnableC5863l.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f12355l.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
