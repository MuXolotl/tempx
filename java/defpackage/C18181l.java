package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18181l extends ConnectivityManager.NetworkCallback {
    public static NetworkCapabilities amazon;
    public static Boolean billing;
    public static boolean purchase;
    public static final C18181l yandex = new C18181l();
    public static final Object loadAd = new Object();
    public static final LinkedHashMap crashlytics = new LinkedHashMap();

    public static void loadAd() {
        ArrayList<C8195l> arrayList = new ArrayList();
        synchronized (loadAd) {
            try {
                if (purchase && billing != null) {
                    for (Map.Entry entry : crashlytics.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        C18181l c18181l = yandex;
                        NetworkCapabilities networkCapabilities = amazon;
                        c18181l.getClass();
                        arrayList.add(new C8195l(function1, !billing.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? C13487l.yandex : new C7685l(7)));
                    }
                    Unit unit = Unit.INSTANCE;
                    for (C8195l c8195l : arrayList) {
                        ((Function1) c8195l.f17098l).invoke((AbstractC13306l) c8195l.f17097l);
                    }
                    return;
                }
                C14513l.tapsense().vip(AbstractC10076l.yandex, "Not dispatching constraint state yet: isBlocked=" + billing + ", capabilitiesInitialized=" + purchase);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C8652l yandex(ConnectivityManager connectivityManager, NetworkRequest networkRequest, C8854l c8854l) {
        synchronized (loadAd) {
            try {
                LinkedHashMap linkedHashMap = crashlytics;
                boolean zIsEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(c8854l, networkRequest);
                if (zIsEmpty) {
                    C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController register shared callback");
                    connectivityManager.registerDefaultNetworkCallback(yandex);
                } else if (purchase && billing != null) {
                    C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController send initial capabilities");
                    NetworkCapabilities networkCapabilities = amazon;
                    yandex.getClass();
                    c8854l.invoke(!billing.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? C13487l.yandex : new C7685l(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C8652l(c8854l, connectivityManager, 19);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (loadAd) {
            if (AbstractC8576l.yandex(billing, Boolean.valueOf(z))) {
                return;
            }
            billing = Boolean.valueOf(z);
            Unit unit = Unit.INSTANCE;
            loadAd();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (loadAd) {
            amazon = networkCapabilities;
            purchase = true;
            Unit unit = Unit.INSTANCE;
        }
        loadAd();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController onLost callback");
        synchronized (loadAd) {
            try {
                amazon = null;
                Iterator it = crashlytics.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new C7685l(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
