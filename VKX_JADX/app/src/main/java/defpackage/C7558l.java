package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lؚْ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7558l {
    public static final C0022l smaato = new C0022l("ConnectivityMonitor", null);
    public boolean billing;
    public final ConnectivityManager crashlytics;
    public final HashSet firebase;
    public final C13773l isPro;
    public final Context mopub;
    public final boolean subs;
    public final ExecutorServiceC11264l yandex;
    public final C10447l loadAd = new C10447l(2, this);
    public final HashMap amazon = new HashMap();
    public final ArrayList purchase = new ArrayList();
    public final Object admob = new Object();

    public C7558l(Context context, ExecutorServiceC11264l executorServiceC11264l) {
        this.subs = Build.VERSION.SDK_INT >= 31;
        this.isPro = new C13773l(8, this);
        this.firebase = new HashSet();
        this.yandex = executorServiceC11264l;
        this.mopub = context;
        this.crashlytics = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void crashlytics() {
        ExecutorServiceC11264l executorServiceC11264l = this.yandex;
        if (executorServiceC11264l == null) {
            return;
        }
        HashSet hashSet = this.firebase;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!executorServiceC11264l.f22699l.isShutdown()) {
                        executorServiceC11264l.execute(new RunnableC10799l(6, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void loadAd(Network network, LinkProperties linkProperties) {
        synchronized (this.admob) {
            try {
                smaato.loadAd("a new network is available", new Object[0]);
                HashMap map = this.amazon;
                if (map.containsKey(network)) {
                    this.purchase.remove(network);
                }
                map.put(network, linkProperties);
                this.purchase.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        crashlytics();
    }

    public final void yandex() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        smaato.loadAd("Start monitoring connectivity changes", new Object[0]);
        if (this.billing || (connectivityManager = this.crashlytics) == null) {
            return;
        }
        Context context = this.mopub;
        if (AbstractC7720l.loadAd(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                loadAd(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.subs) {
                builderAddTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.isPro, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(builderAddTransportType.build(), this.loadAd);
            this.billing = true;
        }
    }
}
