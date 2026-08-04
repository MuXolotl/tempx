package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؗۢٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5229l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7025l f11307l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11308l;

    public /* synthetic */ RunnableC5229l(C7025l c7025l, int i) {
        this.f11308l = i;
        this.f11307l = c7025l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture c11077l;
        int i = this.f11308l;
        int i2 = 7;
        int i3 = 0;
        C7025l c7025l = this.f11307l;
        switch (i) {
            case 0:
                ExecutorC7870l executorC7870l = c7025l.admob;
                AbstractC5088l.yandex(c7025l.yandex, "signalEndOfInputStream");
                switch (AbstractC5020l.inmobi(c7025l.f14718throws)) {
                    case 0:
                        c11077l = new C11077l(1, new IllegalStateException("Encoder is not started yet."));
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        AtomicReference atomicReference = new AtomicReference();
                        C5807l c5807l = new C5807l();
                        c5807l.crashlytics = new C0011l();
                        C16565l c16565l = new C16565l(c5807l);
                        c5807l.loadAd = c16565l;
                        c5807l.yandex = AbstractC5020l.class;
                        try {
                            atomicReference.set(c5807l);
                            c5807l.yandex = "acquireInputBuffer";
                        } catch (Exception e) {
                            c16565l.loadAd(e);
                        }
                        C5807l c5807l2 = (C5807l) atomicReference.get();
                        c5807l2.getClass();
                        c7025l.smaato.offer(c5807l2);
                        c5807l2.yandex(new RunnableC0336l(c7025l, c5807l2, 14), executorC7870l);
                        c7025l.loadAd();
                        c11077l = c16565l;
                        break;
                    case 7:
                        c11077l = new C11077l(1, new IllegalStateException("Encoder is in error state."));
                        break;
                    case 8:
                        c11077l = new C11077l(1, new IllegalStateException("Encoder is released."));
                        break;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l.f14718throws)));
                        break;
                }
                c11077l.yandex(new RunnableC9929l(c11077l, new C7026l(i2, c7025l), i3), executorC7870l);
                break;
            case 1:
                int iInmobi = AbstractC5020l.inmobi(c7025l.f14718throws);
                if (iInmobi == 1) {
                    c7025l.purchase();
                } else if (iInmobi == 6 || iInmobi == 8) {
                    C8339l.smaato("Encoder is released");
                }
                break;
            case 2:
                switch (AbstractC5020l.inmobi(c7025l.f14718throws)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c7025l.amazon();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        c7025l.admob(7);
                        break;
                    case 6:
                    case 8:
                        break;
                    default:
                        C8339l.smaato("Unknown state: ".concat(AbstractC9361l.m2637strictfp(c7025l.f14718throws)));
                        break;
                }
                break;
            case 3:
                c7025l.applovin = true;
                if (c7025l.premium) {
                    if (!c7025l.subscription) {
                        AbstractC5088l.yandex(c7025l.yandex, "mMediaCodec.stop()");
                        c7025l.purchase.stop();
                    }
                    c7025l.billing();
                }
                break;
            case 4:
                c7025l.admob.execute(new RunnableC5229l(c7025l, 5));
                break;
            default:
                if (c7025l.ad) {
                    AbstractC5088l.tapsense(c7025l.yandex, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    c7025l.advert = null;
                    c7025l.subs();
                    c7025l.ad = false;
                }
                break;
        }
    }
}
