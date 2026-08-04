package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lُ۟ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC11374l implements Executor {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22947l;

    public /* synthetic */ ExecutorC11374l(int i) {
        this.f22947l = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22947l) {
            case 0:
                C0508l.purchase().crashlytics.amazon.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void yandex(Runnable runnable) {
    }
}
