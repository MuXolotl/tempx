package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: l٘ۤ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18324l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5172l f35835l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7221l f35836l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35837l;

    public /* synthetic */ C18324l(C7221l c7221l, C5172l c5172l, int i) {
        this.f35837l = i;
        this.f35836l = c7221l;
        this.f35835l = c5172l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f35837l;
        C5172l c5172l = this.f35835l;
        C7221l c7221l = this.f35836l;
        switch (i) {
            case 0:
                ((C10717l) c7221l.f15053l).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", c7221l.f15052l);
                handlerThread.start();
                c5172l.crashlytics(3, new RunnableC6665l(12, handlerThread));
                return new Handler(handlerThread.getLooper());
            default:
                Executor executor = ((C10717l) c7221l.f15053l).yandex;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new ThreadFactoryC8910l(c7221l.f15052l, new ThreadFactoryC4430l(AbstractC14140l.loadAd, "CXCP-Camera-E", AbstractC1805l.loadAd(0))));
                c5172l.crashlytics(3, new RunnableC6665l(13, executorServiceNewFixedThreadPool));
                return executorServiceNewFixedThreadPool;
        }
    }
}
