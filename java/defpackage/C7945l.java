package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lًِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7945l {
    public final C5128l amazon;
    public volatile boolean crashlytics;
    public final C5128l loadAd;
    public final C5128l purchase;
    public final ExecutorService yandex;

    public C7945l() {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryDefaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.yandex = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.loadAd = new C5128l(0);
        this.crashlytics = false;
        this.amazon = new C5128l(0);
        this.purchase = new C5128l(0);
    }

    public static /* bridge */ /* synthetic */ void yandex(ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, boolean z, long j) {
        try {
            try {
                autoCloseOutputStream.write(z ? 1 : 0);
            } catch (IOException e) {
                Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j)), e);
            }
        } finally {
            AbstractC1051l.remoteconfig(autoCloseOutputStream);
        }
    }

    public final synchronized void crashlytics() {
        C5128l c5128l;
        C5128l c5128l2;
        try {
            this.crashlytics = true;
            this.yandex.shutdownNow();
            int i = 0;
            int i2 = 0;
            while (true) {
                c5128l = this.loadAd;
                if (i2 >= c5128l.f11161l) {
                    break;
                }
                AbstractC1051l.remoteconfig((Closeable) c5128l.subs(i2));
                i2++;
            }
            c5128l.clear();
            int i3 = 0;
            while (true) {
                c5128l2 = this.amazon;
                if (i3 >= c5128l2.f11161l) {
                    break;
                }
                AbstractC1051l.remoteconfig((Closeable) c5128l2.subs(i3));
                i3++;
            }
            c5128l2.clear();
            while (true) {
                C5128l c5128l3 = this.purchase;
                if (i < c5128l3.f11161l) {
                    C17484l c17484l = (C17484l) c5128l3.subs(i);
                    ParcelFileDescriptor parcelFileDescriptor = c17484l.f34062l;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptor2 = c17484l.f34056l;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    i++;
                } else {
                    c5128l3.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void loadAd(long j) {
        C5128l c5128l = this.loadAd;
        Long lValueOf = Long.valueOf(j);
        AbstractC1051l.remoteconfig((Closeable) c5128l.get(lValueOf));
        this.loadAd.remove(lValueOf);
        AbstractC1051l.remoteconfig((Closeable) this.amazon.get(lValueOf));
        this.amazon.remove(lValueOf);
        C17484l c17484l = (C17484l) this.purchase.remove(lValueOf);
        if (c17484l != null) {
            ParcelFileDescriptor parcelFileDescriptor = c17484l.f34062l;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            ParcelFileDescriptor parcelFileDescriptor2 = c17484l.f34056l;
            if (parcelFileDescriptor2 != null) {
                try {
                    parcelFileDescriptor2.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
