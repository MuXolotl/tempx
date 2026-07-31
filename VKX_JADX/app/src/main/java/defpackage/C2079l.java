package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lِؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2079l {
    public volatile C15138l admob;
    public final InterfaceC11766l amazon;
    public final InterfaceC11766l billing;
    public final InterfaceC11766l crashlytics;
    public final InterfaceC11766l loadAd;
    public final Uri mopub;
    public final InterfaceC11766l purchase;
    public final Uri subs;
    public final Context yandex;
    public static final Object isPro = new Object();
    public static final Object firebase = new Object();

    public C2079l(Context context, InterfaceC11766l interfaceC11766l, InterfaceC11766l interfaceC11766l2, InterfaceC11766l interfaceC11766l3) {
        this.yandex = context;
        this.crashlytics = interfaceC11766l;
        this.loadAd = interfaceC11766l3;
        this.amazon = interfaceC11766l2;
        Pattern pattern = AbstractC15467l.yandex;
        C1424l c1424l = new C1424l(context, 24);
        c1424l.m916l("phenotype_storage_info");
        c1424l.m950l("storage-info.pb");
        this.mopub = c1424l.m943l();
        C1424l c1424l2 = new C1424l(context, 24);
        c1424l2.m916l("phenotype_storage_info");
        c1424l2.m950l("device-encrypted-storage-info.pb");
        UserManager userManager = AbstractC18452l.yandex;
        int i = 1;
        if (Build.VERSION.SDK_INT >= 24) {
            Set set = AbstractC15467l.amazon;
            AbstractC16181l.isPro(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
            c1424l2.f3602l = "directboot-files";
        }
        this.subs = c1424l2.m943l();
        this.purchase = AbstractC15788l.purchase(new C15752l(i, this));
        this.billing = AbstractC15788l.purchase(new C11478l(interfaceC11766l, i));
    }

    public final C15138l crashlytics() {
        C15138l c15138lM3937synchronized;
        C15138l c15138l = this.admob;
        if (c15138l != null) {
            return c15138l;
        }
        synchronized (isPro) {
            c15138lM3937synchronized = this.admob;
            if (c15138lM3937synchronized == null) {
                c15138lM3937synchronized = C15138l.m3937synchronized();
                if (AbstractC18452l.yandex(this.yandex)) {
                    InterfaceC1400l interfaceC1400l = (InterfaceC1400l) c15138lM3937synchronized.subscription(7);
                    C11337l c11337l = C11337l.yandex;
                    int i = AbstractC5004l.yandex;
                    C11337l c11337l2 = C11337l.loadAd;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream inputStreamRemoteconfig = AbstractC6660l.remoteconfig(((C2830l) this.amazon.get()).loadAd(this.mopub));
                        try {
                            AbstractC0288l abstractC0288lYandex = ((C4194l) interfaceC1400l).yandex(inputStreamRemoteconfig, c11337l2);
                            if (inputStreamRemoteconfig != null) {
                                inputStreamRemoteconfig.close();
                            }
                            C15138l c15138l2 = (C15138l) abstractC0288lYandex;
                            StrictMode.setThreadPolicy(threadPolicy);
                            c15138lM3937synchronized = c15138l2;
                            this.admob = c15138lM3937synchronized;
                        } catch (Throwable th) {
                            if (inputStreamRemoteconfig != null) {
                                try {
                                    inputStreamRemoteconfig.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    } catch (Throwable th3) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th3;
                    }
                }
            }
        }
        return c15138lM3937synchronized;
    }

    public final C8746l loadAd() {
        C15138l c15138lCrashlytics = crashlytics();
        return new C8746l(c15138lCrashlytics.license(), AbstractC1186l.Signature(c15138lCrashlytics.signatures()), c15138lCrashlytics.Signature(), c15138lCrashlytics.pro(), (c15138lCrashlytics.premium() && c15138lCrashlytics.applovin().Signature() == ((long) Build.VERSION.SDK_INT)) ? c15138lCrashlytics.applovin().tapsense() : "", AbstractC1186l.Signature(c15138lCrashlytics.advert()), AbstractC1186l.Signature(c15138lCrashlytics.isVip()), c15138lCrashlytics.tapsense(), c15138lCrashlytics.inmobi(), c15138lCrashlytics.appmetrica(), c15138lCrashlytics.m3939throws());
    }

    public final void yandex() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (AbstractC18452l.crashlytics(this.yandex)) {
            }
            C5113l c5113l = C5113l.f11111l;
        }
        UserManager userManager = AbstractC18452l.yandex;
        if (crashlytics().ad() + 86400000 < System.currentTimeMillis()) {
            ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l = (ScheduledExecutorServiceC6354l) this.crashlytics.get();
            scheduledExecutorServiceC6354l.getClass();
            ListenableFuture listenableFutureBilling = AbstractC7151l.billing((ListenableFuture) this.billing.get());
            int i = AbstractC11257l.f22682l;
            AbstractC7151l.admob(listenableFutureBilling instanceof AbstractC11257l ? (AbstractC11257l) listenableFutureBilling : new C0814l(listenableFutureBilling), new C11651l(2, this), scheduledExecutorServiceC6354l);
            return;
        }
        C5113l c5113l2 = C5113l.f11111l;
    }
}
