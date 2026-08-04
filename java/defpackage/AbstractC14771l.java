package defpackage;

/* JADX INFO: renamed from: lٌٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14771l {
    public boolean loadAd;
    public C1527l yandex;

    public final void yandex() {
        C1527l c1527l = this.yandex;
        if (c1527l == null) {
            C8339l.smaato("This input is not added to any dispatcher.");
            return;
        }
        if (!this.loadAd) {
            c1527l.purchase(this, null);
        }
        c1527l.amazon();
        if (c1527l.crashlytics) {
            C8048l c8048l = c1527l.amazon;
            C6536l c6536l = c1527l.yandex;
            if (equals(c8048l.admob) && -1 == c8048l.mopub) {
                AbstractC5288l abstractC5288lCrashlytics = c8048l.billing;
                if (abstractC5288lCrashlytics == null) {
                    abstractC5288lCrashlytics = c8048l.crashlytics(-1);
                }
                c8048l.billing = null;
                c8048l.mopub = 0;
                c8048l.admob = null;
                if (abstractC5288lCrashlytics != null) {
                    abstractC5288lCrashlytics.crashlytics();
                } else if (c6536l != null) {
                    ((C16390l) c6536l.f13620l).yandex.run();
                }
                C1008l c1008l = c8048l.yandex;
                c1008l.getClass();
                c1008l.remoteconfig(null, C2455l.crashlytics);
            }
        }
        this.loadAd = false;
    }

    public void crashlytics() {
    }

    public void loadAd(boolean z) {
    }
}
