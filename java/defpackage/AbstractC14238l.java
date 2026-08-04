package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import android.view.Surface;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SNIHostName;

/* JADX INFO: renamed from: lْٓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC14238l {
    public static /* synthetic */ void Signature() {
    }

    public static /* synthetic */ SNIHostName adcel(String str) {
        return new SNIHostName(str);
    }

    public static /* synthetic */ void admob(ExecutorC5094l executorC5094l) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorC5094l != ForkJoinPool.commonPool()) && !(zIsTerminated = executorC5094l.isTerminated())) {
            executorC5094l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorC5094l.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorC5094l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void ads() {
        if (Build.VERSION.SDK_INT <= 23 || ForkJoinPool.commonPool() != null) {
            throw null;
        }
    }

    public static /* synthetic */ LocaleList amazon(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ SNIHostName billing(String str) {
        return new SNIHostName(str);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern crashlytics() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static void firebase(ExecutorServiceC18081l executorServiceC18081l) {
        boolean zIsTerminated;
        ThreadPoolExecutor threadPoolExecutor = executorServiceC18081l.f35373l;
        if ((Build.VERSION.SDK_INT <= 23 || executorServiceC18081l != ForkJoinPool.commonPool()) && !(zIsTerminated = threadPoolExecutor.isTerminated())) {
            executorServiceC18081l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorServiceC18081l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void isPro(ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l) {
        if (Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC10335l != ForkJoinPool.commonPool()) {
            scheduledExecutorServiceC10335l.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ OutputConfiguration loadAd(Surface surface) {
        return new OutputConfiguration(surface);
    }

    public static void metrica(ExecutorServiceC11264l executorServiceC11264l) {
        boolean zIsTerminated;
        ExecutorService executorService = executorServiceC11264l.f22699l;
        if ((Build.VERSION.SDK_INT <= 23 || executorServiceC11264l != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorServiceC11264l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorServiceC11264l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void mopub() {
    }

    public static /* synthetic */ LocaleSpan purchase(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static void remoteconfig(ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l) {
        boolean zIsTerminated;
        ExecutorService executorService = scheduledExecutorServiceC6354l.f33988l;
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC6354l != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            scheduledExecutorServiceC6354l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        scheduledExecutorServiceC6354l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void smaato(C17438l c17438l) {
        boolean zIsTerminated;
        ExecutorService executorService = c17438l.f33988l;
        if ((Build.VERSION.SDK_INT <= 23 || c17438l != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            c17438l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        c17438l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void startapp(ScheduledExecutorServiceC10795l scheduledExecutorServiceC10795l) {
        boolean zIsTerminated;
        ExecutorService executorService = scheduledExecutorServiceC10795l.f22699l;
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC10795l != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            scheduledExecutorServiceC10795l.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        scheduledExecutorServiceC10795l.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void subs(ScheduledExecutorServiceC6423l scheduledExecutorServiceC6423l) {
        if ((Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC6423l != ForkJoinPool.commonPool()) && !scheduledExecutorServiceC6423l.f13444l.isTerminated()) {
            scheduledExecutorServiceC6423l.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void subscription(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void tapsense() {
    }

    public static /* synthetic */ void vip(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ OutputConfiguration yandex(int i, Surface surface) {
        return new OutputConfiguration(i, surface);
    }
}
