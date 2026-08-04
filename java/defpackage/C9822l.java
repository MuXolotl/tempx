package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: lٍۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9822l implements OnBackAnimationCallback {
    public final /* synthetic */ AbstractC13833l yandex;

    public C9822l(AbstractC13833l abstractC13833l) {
        this.yandex = abstractC13833l;
    }

    public final void onBackCancelled() {
        AbstractC13833l abstractC13833l = this.yandex;
        C1527l c1527l = abstractC13833l.yandex;
        if (c1527l == null) {
            C8339l.smaato("This input is not added to any dispatcher.");
            return;
        }
        if (!abstractC13833l.loadAd) {
            c1527l.purchase(abstractC13833l, null);
        }
        c1527l.amazon();
        if (c1527l.crashlytics) {
            C8048l c8048l = c1527l.amazon;
            if (abstractC13833l.equals(c8048l.admob) && -1 == c8048l.mopub) {
                AbstractC5288l abstractC5288lCrashlytics = c8048l.billing;
                if (abstractC5288lCrashlytics == null) {
                    abstractC5288lCrashlytics = c8048l.crashlytics(-1);
                }
                c8048l.billing = null;
                c8048l.mopub = 0;
                c8048l.admob = null;
                if (abstractC5288lCrashlytics != null) {
                    abstractC5288lCrashlytics.loadAd();
                }
                C1008l c1008l = c8048l.yandex;
                c1008l.getClass();
                c1008l.remoteconfig(null, C2455l.crashlytics);
            }
        }
        abstractC13833l.loadAd = false;
    }

    public final void onBackInvoked() {
        this.yandex.yandex();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        C0005l c0005lMopub = AbstractC12479l.mopub(backEvent);
        AbstractC13833l abstractC13833l = this.yandex;
        C1527l c1527l = abstractC13833l.yandex;
        if (c1527l == null) {
            C8339l.smaato("This input is not added to any dispatcher.");
            return;
        }
        if (abstractC13833l.loadAd) {
            c1527l.amazon();
            if (c1527l.crashlytics) {
                C8048l c8048l = c1527l.amazon;
                if (abstractC13833l.equals(c8048l.admob) && -1 == c8048l.mopub) {
                    AbstractC5288l abstractC5288lCrashlytics = c8048l.billing;
                    if (abstractC5288lCrashlytics == null) {
                        abstractC5288lCrashlytics = c8048l.crashlytics(-1);
                    }
                    if (abstractC5288lCrashlytics != null) {
                        abstractC5288lCrashlytics.amazon(c0005lMopub);
                    }
                    C1008l c1008l = c8048l.yandex;
                    C2819l c2819l = new C2819l(c0005lMopub);
                    c1008l.getClass();
                    c1008l.remoteconfig(null, c2819l);
                }
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        C0005l c0005lMopub = AbstractC12479l.mopub(backEvent);
        AbstractC13833l abstractC13833l = this.yandex;
        C1527l c1527l = abstractC13833l.yandex;
        if (c1527l == null) {
            C8339l.smaato("This input is not added to any dispatcher.");
        } else {
            if (abstractC13833l.loadAd) {
                return;
            }
            c1527l.purchase(abstractC13833l, c0005lMopub);
            abstractC13833l.loadAd = true;
        }
    }
}
