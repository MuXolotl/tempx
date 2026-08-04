package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: lٜٓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14277l implements InterfaceC11791l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ScheduledFuture f27960l;

    public C14277l(ScheduledFuture scheduledFuture) {
        this.f27960l = scheduledFuture;
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f27960l + ']';
    }

    @Override // defpackage.InterfaceC11791l
    public final void yandex() {
        this.f27960l.cancel(false);
    }
}
