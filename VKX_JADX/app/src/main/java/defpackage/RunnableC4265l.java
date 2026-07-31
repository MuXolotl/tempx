package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lٌؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4265l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13572l f8753l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractServiceC3639l f8754l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8755l;

    public /* synthetic */ RunnableC4265l(AbstractServiceC3639l abstractServiceC3639l, C13572l c13572l, int i) {
        this.f8755l = i;
        this.f8754l = abstractServiceC3639l;
        this.f8753l = c13572l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8755l;
        AbstractServiceC3639l abstractServiceC3639l = this.f8754l;
        switch (i) {
            case 0:
                C13572l c13572l = this.f8753l;
                C3726l c3726l = c13572l.yandex;
                C9716l c9716lBilling = abstractServiceC3639l.billing(null);
                AbstractServiceC3639l abstractServiceC3639l2 = c9716lBilling.f19805l;
                HashMap map = c9716lBilling.f19802l;
                if (!map.containsKey(c13572l)) {
                    C10243l c10243l = new C10243l(c9716lBilling, abstractServiceC3639l2, c13572l);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    C12962l c12962l = c3726l.isPro;
                    c12962l.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    AbstractC15323l.isVip();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    C6845l c6845l = new C6845l(mainLooper);
                    AbstractC15323l.m3966final(new Handler(mainLooper), new RunnableC8670l(c6845l, new C16811l(abstractServiceC3639l2, c12962l, bundle3, c10243l, mainLooper, c6845l, c12962l.yandex.purchase() ? new C3797l(new C2205l(new appmetrica(abstractServiceC3639l2))) : null), 0));
                    map.put(c13572l, new C4806l(c6845l));
                    c6845l.yandex(new RunnableC4063l(c9716lBilling, c6845l, c10243l, c13572l, 8), c9716lBilling.f19808l);
                }
                c3726l.pro = new C7026l(13, abstractServiceC3639l);
                break;
            default:
                HashMap map2 = abstractServiceC3639l.billing(null).f19802l;
                C13572l c13572l2 = this.f8753l;
                C4806l c4806l = (C4806l) map2.remove(c13572l2);
                if (c4806l != null) {
                    C6845l c6845l2 = c4806l.yandex;
                    if (!c6845l2.cancel(false)) {
                        try {
                            ((C16811l) AbstractC7151l.crashlytics(c6845l2)).release();
                        } catch (CancellationException | ExecutionException e) {
                            AbstractC6427l.metrica("MediaController", "MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                c13572l2.yandex.pro = null;
                break;
        }
    }
}
