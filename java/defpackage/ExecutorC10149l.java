package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَؚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC10149l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static Context f20663l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static volatile ExecutorC10149l f20664l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC10149l f20665l = new ExecutorC10149l(1);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20666l;

    public /* synthetic */ ExecutorC10149l(int i) {
        this.f20666l = i;
    }

    public static ExecutorC10149l yandex(Context context) {
        ExecutorC10149l executorC10149l;
        ExecutorC10149l executorC10149l2 = f20664l;
        if (executorC10149l2 != null) {
            return executorC10149l2;
        }
        synchronized (ExecutorC10149l.class) {
            try {
                executorC10149l = f20664l;
                if (executorC10149l == null) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC1051l.subs(applicationContext);
                    f20663l = applicationContext;
                    executorC10149l = new ExecutorC10149l(0);
                    f20664l = executorC10149l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorC10149l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f20666l) {
            case 0:
                AbstractC7829l.yandex.post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
