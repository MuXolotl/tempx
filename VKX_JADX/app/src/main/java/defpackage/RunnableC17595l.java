package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٜ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC17595l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17059l f34251l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34252l;

    public /* synthetic */ RunnableC17595l(C17059l c17059l, int i) {
        this.f34252l = i;
        this.f34251l = c17059l;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C16745l c16745lM4529throws;
        C16745l c16745lSubs;
        int i = this.f34252l;
        C17059l c17059l = this.f34251l;
        switch (i) {
            case 0:
                c17059l.loadAd();
                return;
            case 1:
                c17059l.loadAd();
                return;
            default:
                synchronized (C17059l.remoteconfig) {
                    try {
                        C14184l c14184l = c17059l.yandex;
                        c14184l.yandex();
                        C3797l c3797lYandex = C3797l.yandex(c14184l.yandex);
                        try {
                            c16745lM4529throws = c17059l.crashlytics.m4529throws();
                            if (c3797lYandex != null) {
                                c3797lYandex.m1428strictfp();
                            }
                        } catch (Throwable th) {
                            if (c3797lYandex != null) {
                                c3797lYandex.m1428strictfp();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i2 = c16745lM4529throws.loadAd;
                    if (i2 == 5) {
                        c16745lSubs = c17059l.subs(c16745lM4529throws);
                    } else {
                        if (i2 == 3) {
                            c16745lSubs = c17059l.subs(c16745lM4529throws);
                        } else if (!c17059l.amazon.yandex(c16745lM4529throws)) {
                            return;
                        } else {
                            c16745lSubs = c17059l.crashlytics(c16745lM4529throws);
                        }
                    }
                    c17059l.billing(c16745lSubs);
                    c17059l.remoteconfig(c16745lM4529throws, c16745lSubs);
                    if (c16745lSubs.loadAd == 4) {
                        c17059l.smaato(c16745lSubs.yandex);
                    }
                    int i3 = c16745lSubs.loadAd;
                    if (i3 == 5) {
                        c17059l.isPro(new C18626l());
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        c17059l.isPro(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        c17059l.firebase(c16745lSubs);
                        return;
                    }
                } catch (C18626l e) {
                    c17059l.isPro(e);
                    return;
                }
        }
    }
}
