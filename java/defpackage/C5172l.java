package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5172l {
    public final InterfaceC7042l yandex;
    public final Object loadAd = new Object();
    public final ArrayList crashlytics = new ArrayList();
    public final Object amazon = new Object();
    public final ArrayList purchase = new ArrayList();
    public final Object billing = new Object();
    public final ArrayList mopub = new ArrayList();

    public C5172l(InterfaceC7042l interfaceC7042l) {
        this.yandex = interfaceC7042l;
    }

    public final void amazon() {
        synchronized (this.loadAd) {
            try {
                Log.d("CXCP", "Shutting down cameras...");
                Iterator it = this.crashlytics.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        purchase();
        billing();
    }

    public final void billing() {
        synchronized (this.billing) {
            try {
                Log.d("CXCP", "Shutting down threads...");
                Iterator it = this.mopub.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void crashlytics(int i, Runnable runnable) {
        boolean zYandex;
        String str;
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            zYandex = yandex(runnable);
        } else if (iInmobi == 1) {
            zYandex = loadAd(runnable);
        } else if (iInmobi != 2) {
            C18725l.billing();
            return;
        } else {
            synchronized (this.billing) {
                zYandex = this.mopub.add(runnable);
            }
        }
        if (zYandex) {
            return;
        }
        StringBuilder sb = new StringBuilder("CameraPipeLifetime already shut down. This is unexpected. Executing ");
        if (i == 1) {
            str = "CAMERA";
        } else if (i != 2) {
            str = i != 3 ? "null" : "THREAD";
        } else {
            str = "SCOPE";
        }
        sb.append(str);
        sb.append(" shutdown action immediately...");
        Log.e("CXCP", sb.toString());
        runnable.run();
    }

    public final boolean loadAd(Runnable runnable) {
        boolean zAdd;
        synchronized (this.amazon) {
            zAdd = this.purchase.add(runnable);
        }
        return zAdd;
    }

    public final void purchase() {
        synchronized (this.amazon) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it = this.purchase.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean yandex(Runnable runnable) {
        boolean zAdd;
        synchronized (this.loadAd) {
            zAdd = this.crashlytics.add(runnable);
        }
        return zAdd;
    }
}
