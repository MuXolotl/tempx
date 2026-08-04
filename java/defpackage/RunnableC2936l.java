package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;

/* JADX INFO: renamed from: lؔ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2936l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C2112l f6393l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6394l;

    public /* synthetic */ RunnableC2936l(C2112l c2112l, C15615l c15615l) {
        this.f6394l = 0;
        this.f6393l = c2112l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6394l;
        C2112l c2112l = this.f6393l;
        switch (i) {
            case 0:
                AbstractC16901l.m4229l(c2112l.firebase).isEmpty();
                return;
            case 1:
                synchronized (c2112l.amazon) {
                    try {
                        ScheduledFuture scheduledFuture = c2112l.purchase;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        AbstractC5088l.yandex("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        c2112l.purchase(3, c2112l.firebase);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Iterator it = c2112l.firebase.iterator();
                while (it.hasNext()) {
                    c2112l.loadAd(((C12130l) it.next()).yandex());
                }
                return;
        }
    }

    public /* synthetic */ RunnableC2936l(C2112l c2112l, int i) {
        this.f6394l = i;
        this.f6393l = c2112l;
    }
}
