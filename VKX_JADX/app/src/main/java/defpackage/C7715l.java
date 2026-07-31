package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: lًؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7715l {
    public final Object amazon = new Object();
    public final Context billing;
    public boolean crashlytics;
    public InterfaceC4316l loadAd;
    public final long mopub;
    public C3219l purchase;
    public ServiceConnectionC2470l yandex;

    public C7715l(Context context) {
        AbstractC1051l.subs(context);
        Context applicationContext = context.getApplicationContext();
        this.billing = applicationContext != null ? applicationContext : context;
        this.crashlytics = false;
        this.mopub = -1L;
    }

    public static void amazon(C10997l c10997l, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c10997l != null) {
                map.put("limit_ad_tracking", true != c10997l.loadAd ? "0" : "1");
                String str = c10997l.crashlytics;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new C12839l(map).start();
        }
    }

    public static C10997l yandex(Context context) {
        C7715l c7715l = new C7715l(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c7715l.crashlytics();
            C10997l c10997lPurchase = c7715l.purchase();
            amazon(c10997lPurchase, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            c7715l.loadAd();
            return c10997lPurchase;
        } catch (Throwable th) {
            try {
                amazon(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                c7715l.loadAd();
                throw th2;
            }
        }
    }

    public final void billing() {
        synchronized (this.amazon) {
            C3219l c3219l = this.purchase;
            if (c3219l != null) {
                c3219l.f6917l.countDown();
                try {
                    this.purchase.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.mopub;
            if (j > 0) {
                this.purchase = new C3219l(this, j);
            }
        }
    }

    public final void crashlytics() {
        AbstractC1051l.admob("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.crashlytics) {
                    loadAd();
                }
                Context context = this.billing;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iCrashlytics = C13268l.loadAd.crashlytics(context, 12451000);
                    if (iCrashlytics != 0 && iCrashlytics != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2470l serviceConnectionC2470l = new ServiceConnectionC2470l();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C8394l.loadAd().yandex(context, intent, serviceConnectionC2470l, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.yandex = serviceConnectionC2470l;
                        try {
                            IBinder iBinderYandex = serviceConnectionC2470l.yandex();
                            int i = AbstractBinderC4578l.purchase;
                            IInterface iInterfaceQueryLocalInterface = iBinderYandex.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.loadAd = iInterfaceQueryLocalInterface instanceof InterfaceC4316l ? (InterfaceC4316l) iInterfaceQueryLocalInterface : new C2288l(iBinderYandex);
                            this.crashlytics = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C3412l(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        loadAd();
        super.finalize();
    }

    public final void loadAd() {
        AbstractC1051l.admob("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.billing == null || this.yandex == null) {
                    return;
                }
                try {
                    if (this.crashlytics) {
                        C8394l.loadAd().crashlytics(this.billing, this.yandex);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.crashlytics = false;
                this.loadAd = null;
                this.yandex = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C10997l purchase() {
        C10997l c10997l;
        AbstractC1051l.admob("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.crashlytics) {
                    synchronized (this.amazon) {
                        C3219l c3219l = this.purchase;
                        if (c3219l == null || !c3219l.f6920l) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        crashlytics();
                        if (!this.crashlytics) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                AbstractC1051l.subs(this.yandex);
                AbstractC1051l.subs(this.loadAd);
                try {
                    C2288l c2288l = (C2288l) this.loadAd;
                    c2288l.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelCrashlytics = c2288l.crashlytics(parcelObtain, 1);
                    String string = parcelCrashlytics.readString();
                    parcelCrashlytics.recycle();
                    C2288l c2288l2 = (C2288l) this.loadAd;
                    c2288l2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = AbstractC10290l.yandex;
                    parcelObtain2.writeInt(1);
                    Parcel parcelCrashlytics2 = c2288l2.crashlytics(parcelObtain2, 2);
                    if (parcelCrashlytics2.readInt() == 0) {
                        z = false;
                    }
                    parcelCrashlytics2.recycle();
                    c10997l = new C10997l(string, z, 0);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        billing();
        return c10997l;
    }
}
