package defpackage;

import android.os.Handler;

/* JADX INFO: renamed from: lٍٍٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9654l {
    public static volatile HandlerC4052l amazon;
    public volatile long crashlytics;
    public final RunnableC9929l loadAd;
    public final InterfaceC17182l yandex;

    public AbstractC9654l(InterfaceC17182l interfaceC17182l) {
        AbstractC1051l.subs(interfaceC17182l);
        this.yandex = interfaceC17182l;
        this.loadAd = new RunnableC9929l(this, interfaceC17182l, false, 25);
    }

    public final Handler amazon() {
        HandlerC4052l handlerC4052l;
        if (amazon != null) {
            return amazon;
        }
        synchronized (AbstractC9654l.class) {
            try {
                if (amazon == null) {
                    amazon = new HandlerC4052l(this.yandex.mo213l().getMainLooper(), 4);
                }
                handlerC4052l = amazon;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC4052l;
    }

    public final void crashlytics() {
        this.crashlytics = 0L;
        amazon().removeCallbacks(this.loadAd);
    }

    public final void loadAd(long j) {
        crashlytics();
        if (j >= 0) {
            InterfaceC17182l interfaceC17182l = this.yandex;
            interfaceC17182l.mo198abstract().getClass();
            this.crashlytics = System.currentTimeMillis();
            if (amazon().postDelayed(this.loadAd, j)) {
                return;
            }
            interfaceC17182l.mo200else().f16908l.loadAd(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public abstract void yandex();
}
