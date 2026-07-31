package defpackage;

import android.os.Build;
import androidx.car.app.model.Alert;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lِۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12211l {
    public final int firebase;
    public final int isPro;
    public final C15617l remoteconfig;
    public final boolean smaato;
    public final ExecutorService yandex = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC8164l(false));
    public final C16552l loadAd = AbstractC11463l.yandex;
    public final ExecutorService crashlytics = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC8164l(true));
    public final C6565l amazon = new C6565l(11);
    public final C2782l purchase = C2782l.f6064l;
    public final C17334l billing = C17334l.f33649l;
    public final C5008l mopub = new C5008l(6);
    public final int admob = 4;
    public final int subs = Alert.DURATION_SHOW_INDEFINITELY;

    public C12211l() {
        byte b = 0;
        this.firebase = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.isPro = 8;
        this.smaato = true;
        this.remoteconfig = new C15617l(b, 27);
    }
}
