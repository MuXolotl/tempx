package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؙۘۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6706l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Parcelable f14058l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14059l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14060l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f14061l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f14062l;

    public RunnableC6706l(C11860l c11860l, C10462l c10462l, boolean z, C17509l c17509l) {
        this.f14060l = 3;
        this.f14058l = c10462l;
        this.f14059l = z;
        this.f14062l = c17509l;
        Objects.requireNonNull(c11860l);
        this.f14061l = c11860l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iYandex;
        switch (this.f14060l) {
            case 0:
                Intent intent = (Intent) this.f14058l;
                Context context = (Context) this.f14062l;
                boolean z = this.f14059l;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f14061l;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            C2220l c2220l = new C2220l(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.loadAd;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6995l("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.loadAd = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new RunnableC7706l(context, c2220l, countDownLatch, false, 5));
                            try {
                                iIntValue = ((Integer) AbstractC4311l.crashlytics(new C18595l(context).pro(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iYandex = iIntValue;
                        break;
                    } else {
                        iYandex = FirebaseInstanceIdReceiver.yandex(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iYandex);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                C11860l c11860l = (C11860l) this.f14061l;
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                if (interfaceC5496l != null) {
                    c11860l.m3268l(interfaceC5496l, this.f14059l ? null : (C6899l) this.f14062l, (C10462l) this.f14058l);
                    c11860l.m3266l();
                    return;
                } else {
                    C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.yandex("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                C11860l c11860l2 = (C11860l) this.f14061l;
                InterfaceC5496l interfaceC5496l2 = c11860l2.f23690l;
                if (interfaceC5496l2 != null) {
                    c11860l2.m3268l(interfaceC5496l2, this.f14059l ? null : (C13236l) this.f14062l, (C10462l) this.f14058l);
                    c11860l2.m3266l();
                    return;
                } else {
                    C8118l c8118l2 = ((C17417l) c11860l2.f833l).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16908l.yandex("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                C11860l c11860l3 = (C11860l) this.f14061l;
                InterfaceC5496l interfaceC5496l3 = c11860l3.f23690l;
                if (interfaceC5496l3 != null) {
                    c11860l3.m3268l(interfaceC5496l3, this.f14059l ? null : (C17509l) this.f14062l, (C10462l) this.f14058l);
                    c11860l3.m3266l();
                    return;
                } else {
                    C8118l c8118l3 = ((C17417l) c11860l3.f833l).f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.yandex("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC6706l(C11860l c11860l, C10462l c10462l, boolean z, AbstractC9453l abstractC9453l, int i) {
        this.f14060l = i;
        this.f14058l = c10462l;
        this.f14059l = z;
        this.f14062l = abstractC9453l;
        this.f14061l = c11860l;
    }

    public /* synthetic */ RunnableC6706l(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f14060l = 0;
        this.f14058l = intent;
        this.f14062l = context;
        this.f14059l = z;
        this.f14061l = pendingResult;
    }
}
