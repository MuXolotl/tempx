package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lّ۠ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC12908l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile ExecutorC12908l f25366l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25369l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ExecutorC12908l f25365l = new ExecutorC12908l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC12908l f25368l = new ExecutorC12908l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC12908l f25367l = new ExecutorC12908l(3);

    public /* synthetic */ ExecutorC12908l(int i) {
        this.f25369l = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25369l) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
