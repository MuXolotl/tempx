package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lُؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4039l {
    public C8930l admob;
    public final BinderC11031l crashlytics;
    public final C8181l loadAd;
    public C11117l mopub;
    public Long purchase;
    public final C17667l yandex;
    public static final C0022l isPro = new C0022l("ClientCastAnalytics", null);
    public static boolean firebase = true;
    public int subs = 1;
    public final String amazon = UUID.randomUUID().toString();
    public final ExecutorService billing = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public C4039l(Context context, C7560l c7560l, C17667l c17667l, C8181l c8181l, BinderC11031l binderC11031l) {
        this.yandex = c17667l;
        this.loadAd = c8181l;
        this.crashlytics = binderC11031l;
    }

    public final void yandex(C18278l c18278l, int i) {
        this.billing.execute(new RunnableC16824l(this, c18278l, i, 4));
    }
}
