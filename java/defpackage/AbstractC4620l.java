package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؗؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4620l {
    public static final C9138l[] isVip = new C9138l[0];
    public volatile C1770l Signature;
    public final InterfaceC14795l adcel;
    public final int ads;
    public final Looper amazon;
    public final C13268l billing;
    public final Context crashlytics;
    public InterfaceC15479l firebase;
    public C14110l isPro;
    public C10997l loadAd;
    public final HandlerC0911l mopub;
    public final C13304l purchase;
    public IInterface smaato;
    public final InterfaceC9710l startapp;
    public final String subscription;
    public volatile String tapsense;
    public ServiceConnectionC10981l vip;
    public volatile String yandex = null;
    public final Object admob = new Object();
    public final Object subs = new Object();
    public final ArrayList remoteconfig = new ArrayList();
    public int metrica = 1;
    public C10602l license = null;
    public boolean pro = false;
    public volatile C3801l ad = null;
    public final AtomicInteger advert = new AtomicInteger(0);

    public AbstractC4620l(Context context, Looper looper, C13304l c13304l, C13268l c13268l, int i, InterfaceC9710l interfaceC9710l, InterfaceC14795l interfaceC14795l, String str) {
        AbstractC1051l.isPro(context, "Context must not be null");
        this.crashlytics = context;
        AbstractC1051l.isPro(looper, "Looper must not be null");
        this.amazon = looper;
        AbstractC1051l.isPro(c13304l, "Supervisor must not be null");
        this.purchase = c13304l;
        AbstractC1051l.isPro(c13268l, "API availability must not be null");
        this.billing = c13268l;
        this.mopub = new HandlerC0911l(this, looper);
        this.ads = i;
        this.startapp = interfaceC9710l;
        this.adcel = interfaceC14795l;
        this.subscription = str;
    }

    public void Signature(IInterface iInterface) {
        System.currentTimeMillis();
    }

    public void ad(int i, IBinder iBinder, Bundle bundle, int i2) {
        C2608l c2608l = new C2608l(this, i, iBinder, bundle);
        HandlerC0911l handlerC0911l = this.mopub;
        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(1, i2, -1, c2608l));
    }

    public abstract String adcel();

    public Account admob() {
        return null;
    }

    public boolean ads() {
        return loadAd() >= 211700000;
    }

    public boolean advert() {
        return this instanceof C18304l;
    }

    public final void amazon() {
        int iCrashlytics = this.billing.crashlytics(this.crashlytics, loadAd());
        if (iCrashlytics == 0) {
            this.firebase = new C15053l(this);
            applovin(2, null);
            return;
        }
        applovin(1, null);
        this.firebase = new C15053l(this);
        int i = this.advert.get();
        HandlerC0911l handlerC0911l = this.mopub;
        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(3, i, iCrashlytics, null));
    }

    public final void applovin(int i, IInterface iInterface) {
        C10997l c10997l;
        AbstractC1051l.loadAd((i == 4) == (iInterface != null));
        synchronized (this.admob) {
            try {
                this.metrica = i;
                this.smaato = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    ServiceConnectionC10981l serviceConnectionC10981l = this.vip;
                    if (serviceConnectionC10981l != null) {
                        C13304l c13304l = this.purchase;
                        String str = this.loadAd.crashlytics;
                        AbstractC1051l.subs(str);
                        this.loadAd.getClass();
                        isVip();
                        c13304l.amazon(new C5219l(str, this.loadAd.loadAd), serviceConnectionC10981l);
                        this.vip = null;
                    }
                } else if (i == 2 || i == 3) {
                    ServiceConnectionC10981l serviceConnectionC10981l2 = this.vip;
                    if (serviceConnectionC10981l2 != null && (c10997l = this.loadAd) != null) {
                        String str2 = c10997l.crashlytics;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C13304l c13304l2 = this.purchase;
                        String str3 = this.loadAd.crashlytics;
                        AbstractC1051l.subs(str3);
                        this.loadAd.getClass();
                        isVip();
                        boolean z = this.loadAd.loadAd;
                        c13304l2.getClass();
                        c13304l2.amazon(new C5219l(str3, z), serviceConnectionC10981l2);
                        this.advert.incrementAndGet();
                    }
                    ServiceConnectionC10981l serviceConnectionC10981l3 = new ServiceConnectionC10981l(this, this.advert.get());
                    this.vip = serviceConnectionC10981l3;
                    String strAdcel = adcel();
                    boolean zAds = ads();
                    this.loadAd = new C10997l(strAdcel, zAds, 2);
                    if (zAds && loadAd() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.loadAd.crashlytics)));
                    }
                    C13304l c13304l3 = this.purchase;
                    String str4 = this.loadAd.crashlytics;
                    AbstractC1051l.subs(str4);
                    this.loadAd.getClass();
                    C10602l c10602lCrashlytics = c13304l3.crashlytics(new C5219l(str4, this.loadAd.loadAd), serviceConnectionC10981l3, isVip(), isPro());
                    if (!(c10602lCrashlytics.f21520l == 0)) {
                        String str5 = this.loadAd.crashlytics;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = c10602lCrashlytics.f21520l;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (c10602lCrashlytics.f21519l != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c10602lCrashlytics.f21519l);
                        }
                        int i3 = this.advert.get();
                        C2870l c2870l = new C2870l(this, i2, bundle);
                        HandlerC0911l handlerC0911l = this.mopub;
                        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(7, i3, -1, c2870l));
                    }
                } else if (i == 4) {
                    AbstractC1051l.subs(iInterface);
                    Signature(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void billing() {
        this.advert.incrementAndGet();
        ArrayList arrayList = this.remoteconfig;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC10093l) arrayList.get(i)).amazon();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.subs) {
            this.isPro = null;
        }
        applovin(1, null);
    }

    public boolean crashlytics() {
        return false;
    }

    public Bundle firebase() {
        return null;
    }

    public Executor isPro() {
        return null;
    }

    public final String isVip() {
        String str = this.subscription;
        return str == null ? this.crashlytics.getClass().getName() : str;
    }

    public void license(C10602l c10602l) {
        c10602l.getClass();
        System.currentTimeMillis();
    }

    public abstract int loadAd();

    public final IInterface metrica() {
        IInterface iInterface;
        synchronized (this.admob) {
            try {
                if (this.metrica == 5) {
                    throw new DeadObjectException();
                }
                if (!subscription()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.smaato;
                AbstractC1051l.isPro(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public final void mopub(String str) {
        this.yandex = str;
        billing();
    }

    public final /* synthetic */ void premium() {
        int i;
        int i2;
        synchronized (this.admob) {
            i = this.metrica;
        }
        if (i == 3) {
            this.pro = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        HandlerC0911l handlerC0911l = this.mopub;
        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(i2, this.advert.get(), 16));
    }

    public void pro(int i) {
        System.currentTimeMillis();
    }

    public abstract IInterface purchase(IBinder iBinder);

    /* JADX WARN: Multi-variable type inference failed */
    public final void remoteconfig(InterfaceC12652l interfaceC12652l, Set set) {
        AttributionSource attributionSource;
        Bundle bundleSmaato = smaato();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.Signature == null || (attributionSource = (AttributionSource) this.Signature.f4179l) == null || attributionSource.getAttributionTag() == null) ? this.tapsense : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.ads;
        int i2 = C13268l.yandex;
        Scope[] scopeArr = C7613l.f15667l;
        Bundle bundle = new Bundle();
        C9138l[] c9138lArr = C7613l.f15666l;
        C7613l c7613l = new C7613l(6, i, i2, null, null, scopeArr, bundle, null, c9138lArr, c9138lArr, true, 0, false, str);
        c7613l.f15676l = this.crashlytics.getPackageName();
        c7613l.f15670l = bundleSmaato;
        if (set != null) {
            c7613l.f15679l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (crashlytics()) {
            Account accountAdmob = admob();
            if (accountAdmob == null) {
                accountAdmob = new Account("<<default account>>", "com.google");
            }
            c7613l.f15671l = accountAdmob;
            if (interfaceC12652l != 0) {
                c7613l.f15675l = ((AbstractC0895l) interfaceC12652l).billing;
            }
        }
        c7613l.f15678l = isVip;
        c7613l.f15674l = subs();
        if (advert()) {
            c7613l.f15668l = true;
        }
        try {
            synchronized (this.subs) {
                try {
                    C14110l c14110l = this.isPro;
                    if (c14110l != null) {
                        c14110l.crashlytics(new BinderC14935l(this, this.advert.get()), c7613l);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.advert.get();
            HandlerC0911l handlerC0911l = this.mopub;
            handlerC0911l.sendMessage(handlerC0911l.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            ad(8, null, null, this.advert.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            ad(8, null, null, this.advert.get());
        }
    }

    public final /* synthetic */ boolean signatures(int i, int i2, IInterface iInterface) {
        synchronized (this.admob) {
            try {
                if (this.metrica != i) {
                    return false;
                }
                applovin(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bundle smaato() {
        return new Bundle();
    }

    public abstract String startapp();

    public C9138l[] subs() {
        return isVip;
    }

    public final boolean subscription() {
        boolean z;
        synchronized (this.admob) {
            z = this.metrica == 4;
        }
        return z;
    }

    public final boolean tapsense() {
        boolean z;
        synchronized (this.admob) {
            int i = this.metrica;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public Set vip() {
        return Collections.EMPTY_SET;
    }

    public boolean yandex() {
        return true;
    }
}
