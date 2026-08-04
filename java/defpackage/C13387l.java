package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: lؘْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13387l extends AbstractC12990l {
    public static final ConcurrentLinkedQueue admob;
    public static final boolean amazon;
    public static final AtomicReference billing;
    public static final boolean crashlytics;
    public static final AtomicLong mopub;
    public static final boolean purchase;
    public volatile AbstractC12990l loadAd;

    static {
        String str = Build.FINGERPRINT;
        crashlytics = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        amazon = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        purchase = "eng".equals(str3) || "userdebug".equals(str3);
        billing = new AtomicReference();
        mopub = new AtomicLong();
        admob = new ConcurrentLinkedQueue();
    }

    public static void amazon() {
        while (true) {
            C2967l c2967l = (C2967l) admob.poll();
            if (c2967l == null) {
                return;
            }
            mopub.getAndDecrement();
            C13387l c13387l = c2967l.yandex;
            C4299l c4299l = c2967l.loadAd;
            C18533l c18533l = c4299l.crashlytics;
            if ((c18533l != null && Boolean.TRUE.equals(c18533l.isPro(AbstractC13814l.mopub))) || c13387l.yandex(c4299l.yandex)) {
                c13387l.loadAd(c4299l);
            }
        }
    }

    @Override // defpackage.AbstractC12990l
    public final void crashlytics(RuntimeException runtimeException, C4299l c4299l) {
        if (this.loadAd != null) {
            this.loadAd.crashlytics(runtimeException, c4299l);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.AbstractC12990l
    public final void loadAd(C4299l c4299l) {
        if (this.loadAd != null) {
            this.loadAd.loadAd(c4299l);
            return;
        }
        if (mopub.incrementAndGet() > 20) {
            admob.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        admob.offer(new C2967l(this, c4299l));
        if (this.loadAd != null) {
            amazon();
        }
    }

    @Override // defpackage.AbstractC12990l
    public final boolean yandex(Level level) {
        return this.loadAd == null || this.loadAd.yandex(level);
    }
}
