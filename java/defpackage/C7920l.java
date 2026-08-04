package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lًَۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7920l {
    public final C4690l admob;
    public final FirebaseMessaging amazon;
    public final ScheduledThreadPoolExecutor billing;
    public final C1424l crashlytics;
    public final C1577l loadAd;
    public final Context yandex;
    public final C11154l purchase = new C11154l(0);
    public boolean mopub = false;

    public C7920l(FirebaseMessaging firebaseMessaging, C1577l c1577l, C4690l c4690l, C1424l c1424l, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.amazon = firebaseMessaging;
        this.loadAd = c1577l;
        this.admob = c4690l;
        this.crashlytics = c1424l;
        this.yandex = context;
        this.billing = scheduledThreadPoolExecutor;
    }

    public static boolean amazon() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public static void yandex(C3823l c3823l) throws IOException {
        try {
            AbstractC4311l.amazon(c3823l, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void admob(long j) {
        this.billing.schedule(new RunnableC17276l(this, this.yandex, this.loadAd, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        billing(true);
    }

    public final synchronized void billing(boolean z) {
        this.mopub = z;
    }

    public final void crashlytics(String str) throws IOException {
        String strYandex = this.amazon.yandex();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        C1424l c1424l = this.crashlytics;
        yandex(c1424l.m904case(c1424l.m920l(strYandex, "/topics/" + str, bundle)));
    }

    public final void loadAd(String str) throws IOException {
        String strYandex = this.amazon.yandex();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        C1424l c1424l = this.crashlytics;
        yandex(c1424l.m904case(c1424l.m920l(strYandex, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: IOException -> 0x005d, TryCatch #1 {IOException -> 0x005d, blocks: (B:15:0x0028, B:32:0x0083, B:34:0x0089, B:20:0x0039, B:22:0x0041, B:24:0x004a, B:27:0x005f, B:29:0x0067, B:31:0x0070), top: B:54:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[Catch: IOException -> 0x005d, TRY_LEAVE, TryCatch #1 {IOException -> 0x005d, blocks: (B:15:0x0028, B:32:0x0083, B:34:0x0089, B:20:0x0039, B:22:0x0041, B:24:0x004a, B:27:0x005f, B:29:0x0067, B:31:0x0070), top: B:54:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x009d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0089, please report this as an issue */
    public final boolean mopub() throws IOException {
        C6016l c6016lYandex;
        while (true) {
            synchronized (this) {
                try {
                    c6016lYandex = this.admob.yandex();
                    if (c6016lYandex == null) {
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                String str = c6016lYandex.loadAd;
                String str2 = c6016lYandex.yandex;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        crashlytics(str2);
                        if (amazon()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (amazon()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + c6016lYandex + ".");
                    }
                } else if (str.equals("S")) {
                    loadAd(str2);
                    if (amazon()) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                    }
                } else if (amazon()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + c6016lYandex + ".");
                }
                this.admob.crashlytics(c6016lYandex);
                purchase(c6016lYandex);
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
        if (amazon()) {
            Log.d("FirebaseMessaging", "topic sync succeeded");
        }
        return true;
    }

    public final void purchase(C6016l c6016l) {
        synchronized (this.purchase) {
            try {
                String str = c6016l.crashlytics;
                if (this.purchase.containsKey(str)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.purchase.get(str);
                    C2350l c2350l = (C2350l) arrayDeque.poll();
                    if (c2350l != null) {
                        c2350l.loadAd(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.purchase.remove(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
