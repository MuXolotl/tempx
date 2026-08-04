package defpackage;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lًؚۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7854l {
    public static C7854l crashlytics;
    public static final Object loadAd = new Object();
    public C15615l yandex;

    public static C7854l amazon(Context context, Executor executor) {
        C7854l c7854l;
        synchronized (loadAd) {
            boolean z = false;
            AbstractC1051l.firebase("MlKitContext is already initialized", crashlytics == null);
            C7854l c7854l2 = new C7854l();
            crashlytics = c7854l2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListAd = new C10023l(context, new C3585l(8, MlKitComponentDiscoveryService.class), z).ad();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C8936l c8936l = InterfaceC17087l.isPro;
            arrayList.addAll(arrayListAd);
            arrayList2.add(C4652l.crashlytics(context, Context.class, new Class[0]));
            arrayList2.add(C4652l.crashlytics(c7854l2, C7854l.class, new Class[0]));
            C15615l c15615l = new C15615l(executor, arrayList, arrayList2, c8936l);
            c7854l2.yandex = c15615l;
            c15615l.adcel(true);
            c7854l = crashlytics;
        }
        return c7854l;
    }

    public static C7854l crashlytics() {
        C7854l c7854l;
        synchronized (loadAd) {
            AbstractC1051l.firebase("MlKitContext has not been initialized", crashlytics != null);
            c7854l = crashlytics;
            AbstractC1051l.subs(c7854l);
        }
        return c7854l;
    }

    public final Context loadAd() {
        return (Context) yandex(Context.class);
    }

    public final Object yandex(Class cls) {
        AbstractC1051l.firebase("MlKitContext has been deleted", crashlytics == this);
        AbstractC1051l.subs(this.yandex);
        return this.yandex.remoteconfig(cls);
    }
}
