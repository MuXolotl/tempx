package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lُْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13281l {
    public final CopyOnWriteArrayList crashlytics;
    public final C5019l loadAd;
    public final int yandex;

    public C13281l(CopyOnWriteArrayList copyOnWriteArrayList, int i, C5019l c5019l) {
        this.crashlytics = copyOnWriteArrayList;
        this.yandex = i;
        this.loadAd = c5019l;
    }

    public final void amazon(Exception exc) {
        for (C15465l c15465l : this.crashlytics) {
            AbstractC15323l.m3966final(c15465l.yandex, new RunnableC10613l(this, c15465l.loadAd, exc, 11));
        }
    }

    public final void crashlytics(int i) {
        for (C15465l c15465l : this.crashlytics) {
            AbstractC15323l.m3966final(c15465l.yandex, new RunnableC2027l(this, c15465l.loadAd, i, 4));
        }
    }

    public final void loadAd() {
        for (C15465l c15465l : this.crashlytics) {
            AbstractC15323l.m3966final(c15465l.yandex, new RunnableC16401l(this, c15465l.loadAd, 1));
        }
    }

    public final void purchase() {
        for (C15465l c15465l : this.crashlytics) {
            AbstractC15323l.m3966final(c15465l.yandex, new RunnableC16401l(this, c15465l.loadAd, 0));
        }
    }

    public final void yandex(C2183l c2183l) {
        for (C15465l c15465l : this.crashlytics) {
            AbstractC15323l.m3966final(c15465l.yandex, new RunnableC10613l(this, c15465l.loadAd, c2183l, 12));
        }
    }
}
