package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lٗٝٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC17276l implements Runnable {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Object f33511l = new Object();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static Boolean f33512l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static Boolean f33513l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f33514l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f33515l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33516l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f33517l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f33518l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f33519l;

    public RunnableC17276l(C7920l c7920l, Context context, C1577l c1577l, long j) {
        this.f33516l = 0;
        this.f33519l = c7920l;
        this.f33514l = context;
        this.f33515l = j;
        this.f33518l = c1577l;
        this.f33517l = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean crashlytics(Context context) {
        boolean zBooleanValue;
        synchronized (f33511l) {
            try {
                Boolean bool = f33512l;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? loadAd(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f33512l = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean loadAd(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean yandex(Context context) {
        boolean zBooleanValue;
        synchronized (f33511l) {
            try {
                Boolean bool = f33513l;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? loadAd(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f33513l = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public synchronized boolean amazon() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.f33514l).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zCrashlytics;
        boolean z = true;
        switch (this.f33516l) {
            case 0:
                C7920l c7920l = (C7920l) this.f33519l;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f33517l;
                Context context = (Context) this.f33514l;
                if (crashlytics(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    c7920l.billing(true);
                    if (!((C1577l) this.f33518l).firebase()) {
                        c7920l.billing(false);
                        if (!zCrashlytics) {
                            return;
                        }
                    } else if (!yandex(context) || amazon()) {
                        if (c7920l.mopub()) {
                            c7920l.billing(false);
                        } else {
                            c7920l.admob(this.f33515l);
                        }
                        if (!zCrashlytics) {
                            return;
                        }
                    } else {
                        new C9165l(this, this).yandex();
                        if (!zCrashlytics) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    c7920l.billing(false);
                    if (!zCrashlytics) {
                        return;
                    }
                } finally {
                    if (crashlytics(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 1:
                try {
                    InputStream inputStream = (InputStream) this.f33514l;
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f33518l;
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 65536);
                        if (i != -1) {
                            autoCloseOutputStream.write(bArr, 0, i);
                        } else {
                            AbstractC1051l.remoteconfig((InputStream) this.f33514l);
                            C7945l.yandex((ParcelFileDescriptor.AutoCloseOutputStream) this.f33517l, false, this.f33515l);
                        }
                        AbstractC1051l.remoteconfig((ParcelFileDescriptor.AutoCloseOutputStream) this.f33518l);
                        return;
                    }
                } catch (IOException e2) {
                    try {
                        if (((C7945l) this.f33519l).crashlytics) {
                            Log.d("NearbyConnections", String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.f33515l)));
                        } else {
                            Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.f33515l)), e2);
                        }
                        AbstractC1051l.remoteconfig((InputStream) this.f33514l);
                        C7945l.yandex((ParcelFileDescriptor.AutoCloseOutputStream) this.f33517l, true, this.f33515l);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC1051l.remoteconfig((InputStream) this.f33514l);
                        C7945l.yandex((ParcelFileDescriptor.AutoCloseOutputStream) this.f33517l, z, this.f33515l);
                        AbstractC1051l.remoteconfig((ParcelFileDescriptor.AutoCloseOutputStream) this.f33518l);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    AbstractC1051l.remoteconfig((InputStream) this.f33514l);
                    C7945l.yandex((ParcelFileDescriptor.AutoCloseOutputStream) this.f33517l, z, this.f33515l);
                    AbstractC1051l.remoteconfig((ParcelFileDescriptor.AutoCloseOutputStream) this.f33518l);
                    throw th;
                }
                break;
            case 2:
                String str = (String) this.f33518l;
                BinderC15526l binderC15526l = (BinderC15526l) this.f33519l;
                String str2 = (String) this.f33514l;
                if (str2 == null) {
                    C6901l c6901l = binderC15526l.purchase;
                    c6901l.mo224l().mo211l();
                    String str3 = c6901l.f14447l;
                    if (str3 == null || str3.equals(str)) {
                        c6901l.f14447l = str;
                        c6901l.f14474l = null;
                        return;
                    }
                    return;
                }
                C6373l c6373l = new C6373l(this.f33515l, (String) this.f33517l, str2);
                C6901l c6901l2 = binderC15526l.purchase;
                c6901l2.mo224l().mo211l();
                String str4 = c6901l2.f14447l;
                if (str4 != null) {
                    str4.equals(str);
                }
                c6901l2.f14447l = str;
                c6901l2.f14474l = c6373l;
                return;
            case 3:
                ((C11675l) this.f33519l).m3197l(this.f33515l, this.f33517l, (String) this.f33514l, (String) this.f33518l);
                return;
            default:
                Bundle bundle = (Bundle) this.f33514l;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C3148l c3148l = (C3148l) this.f33519l;
                C17410l c17410l = ((C17417l) c3148l.f833l).f33949l;
                C17417l.billing(c17410l);
                c3148l.m1295l((C6373l) this.f33518l, (C6373l) this.f33517l, this.f33515l, true, c17410l.m4364l("screen_view", bundle, null, false));
                return;
        }
    }

    public RunnableC17276l(C7945l c7945l, InputStream inputStream, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, long j, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2) {
        this.f33516l = 1;
        this.f33514l = inputStream;
        this.f33518l = autoCloseOutputStream;
        this.f33515l = j;
        this.f33517l = autoCloseOutputStream2;
        this.f33519l = c7945l;
    }

    public RunnableC17276l(C3148l c3148l, Bundle bundle, C6373l c6373l, C6373l c6373l2, long j) {
        this.f33516l = 4;
        this.f33514l = bundle;
        this.f33518l = c6373l;
        this.f33517l = c6373l2;
        this.f33515l = j;
        Objects.requireNonNull(c3148l);
        this.f33519l = c3148l;
    }

    public /* synthetic */ RunnableC17276l(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f33516l = i;
        this.f33514l = str;
        this.f33518l = str2;
        this.f33517l = obj2;
        this.f33515l = j;
        this.f33519l = obj;
    }
}
