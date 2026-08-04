package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC10279l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3726l f20918l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20919l;

    public /* synthetic */ ExecutorC10279l(C3726l c3726l, int i) {
        this.f20919l = i;
        this.f20918l = c3726l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f20919l;
        C3726l c3726l = this.f20918l;
        switch (i) {
            case 0:
                C3726l.crashlytics(c3726l, runnable);
                break;
            case 1:
                AbstractC15323l.m3966final(c3726l.smaato, runnable);
                break;
            default:
                AbstractC15323l.m3966final(c3726l.smaato, runnable);
                break;
        }
    }
}
