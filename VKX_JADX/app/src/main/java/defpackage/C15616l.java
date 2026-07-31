package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lٌِٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15616l implements InterfaceC15189l {
    public final /* synthetic */ int yandex;

    public /* synthetic */ C15616l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC15189l
    public final Object get() {
        switch (this.yandex) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.yandex();
            case 2:
                C13252l c13252l = ExecutorsRegistrar.yandex;
                return new ScheduledExecutorServiceC6423l(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC11481l("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.amazon.get());
            case 3:
                C13252l c13252l2 = ExecutorsRegistrar.yandex;
                return new ScheduledExecutorServiceC6423l(Executors.newCachedThreadPool(new ThreadFactoryC11481l("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.amazon.get());
            case 4:
                C13252l c13252l3 = ExecutorsRegistrar.yandex;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC11481l("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
