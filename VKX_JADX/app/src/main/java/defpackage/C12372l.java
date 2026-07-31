package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: lّؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12372l extends FutureTask {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10322l f24464l;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f24464l.purchase((C0607l) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f24464l.purchase(new C0607l(e));
            }
        } finally {
            this.f24464l = null;
        }
    }
}
