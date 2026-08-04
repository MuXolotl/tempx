package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC10366l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Handler f21165l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21166l;

    public /* synthetic */ ExecutorC10366l(Handler handler, int i) {
        this.f21166l = i;
        this.f21165l = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f21166l;
        this.f21165l.post(runnable);
    }
}
