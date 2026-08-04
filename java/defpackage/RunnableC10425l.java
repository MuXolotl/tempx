package defpackage;

import android.os.Process;
import android.os.StrictMode;

/* JADX INFO: renamed from: lًَٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10425l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f21243l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21244l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21245l;

    public /* synthetic */ RunnableC10425l(Object obj, Object obj2, int i) {
        this.f21245l = i;
        this.f21244l = obj;
        this.f21243l = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f21245l;
        Object obj = this.f21243l;
        Object obj2 = this.f21244l;
        switch (i) {
            case 0:
                C8447l c8447l = (C8447l) obj2;
                AbstractC6475l abstractC6475l = (AbstractC6475l) obj;
                if (!c8447l.f17450l) {
                    c8447l.f17454l = abstractC6475l;
                    abstractC6475l.yandex(c8447l);
                }
                break;
            default:
                ThreadFactoryC11481l threadFactoryC11481l = (ThreadFactoryC11481l) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(threadFactoryC11481l.crashlytics);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC11481l.amazon;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                break;
        }
    }
}
