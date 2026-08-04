package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lّۖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC12781l implements Callable {
    public final /* synthetic */ C7644l amazon;
    public final /* synthetic */ Thread crashlytics;
    public final /* synthetic */ Throwable loadAd;
    public final /* synthetic */ C17503l purchase;
    public final /* synthetic */ long yandex;

    public CallableC12781l(C17503l c17503l, long j, Throwable th, Thread thread, C7644l c7644l) {
        this.purchase = c17503l;
        this.yandex = j;
        this.loadAd = th;
        this.crashlytics = thread;
        this.amazon = c7644l;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        long j = this.yandex;
        long j2 = j / 1000;
        C17503l c17503l = this.purchase;
        String strPurchase = c17503l.purchase();
        if (strPurchase == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return AbstractC4311l.mopub(null);
        }
        c17503l.crashlytics.license();
        C12714l c12714l = c17503l.remoteconfig;
        c12714l.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strPurchase);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        c12714l.isPro(this.loadAd, this.crashlytics, "crash", new C18724l(strPurchase, j2, C14054l.f27396l), true);
        try {
            C12714l c12714l2 = c17503l.mopub;
            String str = ".ae" + j;
            c12714l2.getClass();
            if (!new File((File) c12714l2.f25072l, str).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        C7644l c7644l = this.amazon;
        c17503l.loadAd(false, c7644l, false);
        c17503l.crashlytics(new C2043l().yandex, Boolean.FALSE);
        return !c17503l.loadAd.yandex() ? AbstractC4311l.mopub(null) : ((C2350l) ((AtomicReference) c7644l.f15741l).get()).yandex.remoteconfig((ExecutorC4850l) c17503l.purchase.f1958l, new C10975l(this, strPurchase));
    }
}
