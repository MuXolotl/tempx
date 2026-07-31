package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lؗۨؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5312l {
    public static Boolean loadAd;
    public static final C10707l yandex = new C10707l(new C7703l(19));

    public static final boolean loadAd(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (loadAd == null) {
                loadAd = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            if (loadAd.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void yandex(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, List list, boolean z, C6956l c6956l) {
        Executor executor = (Executor) c6956l.isPro(yandex);
        if (executor == null || !loadAd(c3625l.f7563l.length())) {
            c6956l.m2123default(317137883);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(315439796);
            try {
                executor.execute(new RunnableC2218l(c11090l, (EnumC9931l) c6956l.isPro(AbstractC4751l.vip), list, c3625l, (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob), interfaceC16061l, z));
            } catch (RejectedExecutionException unused) {
            }
            c6956l.startapp(false);
        }
    }
}
