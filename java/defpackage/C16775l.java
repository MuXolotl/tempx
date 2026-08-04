package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٖۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16775l extends BroadcastReceiver {
    public final /* synthetic */ C2290l amazon;
    public final /* synthetic */ C1090l crashlytics;
    public final /* synthetic */ Context loadAd;
    public final /* synthetic */ Executor purchase;
    public final /* synthetic */ AtomicBoolean yandex;

    public C16775l(AtomicBoolean atomicBoolean, Context context, C1090l c1090l, C2290l c2290l, Executor executor) {
        this.yandex = atomicBoolean;
        this.loadAd = context;
        this.crashlytics = c1090l;
        this.amazon = c2290l;
        this.purchase = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.yandex.compareAndSet(false, true)) {
            try {
                this.loadAd.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            C1090l c1090l = this.crashlytics;
            C2290l c2290l = this.amazon;
            Executor executor = this.purchase;
            RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l();
            runnableFutureC13286l.f26066l = new C16753l(runnableFutureC13286l, c2290l);
            executor.execute(runnableFutureC13286l);
            c1090l.vip(runnableFutureC13286l);
        }
    }
}
