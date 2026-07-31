package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17485l {
    public final C12810l loadAd;
    public final Object yandex = new Object();
    public final LinkedHashMap crashlytics = new LinkedHashMap();
    public volatile int amazon = -1;

    public C17485l(Context context) {
        this.loadAd = new C12810l(context, this);
    }

    public final void loadAd(C4568l c4568l) {
        synchronized (this.yandex) {
            try {
                C5212l c5212l = (C5212l) this.crashlytics.get(c4568l);
                if (c5212l != null) {
                    c5212l.crashlytics.set(false);
                    this.crashlytics.remove(c4568l);
                }
                if (this.crashlytics.isEmpty()) {
                    this.loadAd.disable();
                    this.amazon = -1;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l, C4568l c4568l) {
        synchronized (this.yandex) {
            try {
                if (this.loadAd.canDetectOrientation()) {
                    C5212l c5212l = new C5212l(c4568l, scheduledExecutorServiceC10335l);
                    this.crashlytics.put(c4568l, c5212l);
                    if (this.amazon != -1) {
                        c5212l.yandex(this.amazon);
                    }
                    if (this.crashlytics.size() == 1) {
                        this.loadAd.enable();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
