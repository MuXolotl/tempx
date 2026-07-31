package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُؖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10844l extends AbstractC2660l {
    public static final C0022l billing = new C0022l("MRDiscoveryCallback", null);
    public final C7847l purchase;
    public final Map crashlytics = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet amazon = new LinkedHashSet();
    public final Set loadAd = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final C17800l yandex = new C17800l(this);

    public C10844l(Context context) {
        this.purchase = new C7847l(context);
    }

    public final void admob(C12736l c12736l, boolean z) {
        boolean z2;
        Set setMetrica;
        boolean zRemove;
        C0022l c0022l = billing;
        c0022l.loadAd("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), c12736l);
        Map map = this.crashlytics;
        synchronized (map) {
            try {
                String strValueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(strValueOf);
                c0022l.loadAd(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    C10962l c10962l = (C10962l) entry.getValue();
                    if (c12736l.purchase(c10962l.loadAd)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            c0022l.loadAd(sb2.toString(), new Object[0]);
                            zRemove = c10962l.yandex.add(c12736l);
                            if (!zRemove) {
                                String strValueOf2 = String.valueOf(c12736l);
                                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(strValueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                Log.w(c0022l.yandex, c0022l.amazon(sb3.toString(), new Object[0]));
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            c0022l.loadAd(sb4.toString(), new Object[0]);
                            zRemove = c10962l.yandex.remove(c12736l);
                            if (!zRemove) {
                                String strValueOf3 = String.valueOf(c12736l);
                                StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(strValueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                Log.w(c0022l.yandex, c0022l.amazon(sb5.toString(), new Object[0]));
                            }
                        }
                        z2 = zRemove;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            billing.loadAd("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.loadAd) {
                try {
                    HashMap map2 = new HashMap();
                    Map map3 = this.crashlytics;
                    synchronized (map3) {
                        try {
                            for (String str2 : map3.keySet()) {
                                C10962l c10962l2 = (C10962l) map3.get(AbstractC8320l.purchase(str2));
                                if (c10962l2 == null) {
                                    int i = AbstractC8909l.f18303l;
                                    setMetrica = C9059l.f18640l;
                                } else {
                                    LinkedHashSet linkedHashSet = c10962l2.yandex;
                                    int i2 = AbstractC8909l.f18303l;
                                    Object[] array = linkedHashSet.toArray();
                                    setMetrica = AbstractC8909l.metrica(array.length, array);
                                }
                                if (!setMetrica.isEmpty()) {
                                    map2.put(str2, setMetrica);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    AbstractC6140l.yandex(map2.entrySet());
                    Iterator it = this.loadAd.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void isPro() {
        C7847l c7847l = this.purchase;
        if (((C9961l) c7847l.f16369l) == null) {
            c7847l.f16369l = C9961l.amazon((Context) c7847l.f16370l);
        }
        C9961l c9961l = (C9961l) c7847l.f16369l;
        if (c9961l != null) {
            c9961l.purchase(this);
        }
        LinkedHashSet<String> linkedHashSet = this.amazon;
        synchronized (linkedHashSet) {
            try {
                for (String str : linkedHashSet) {
                    String strAmazon = AbstractC0555l.amazon(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(strAmazon)) {
                        arrayList.add(strAmazon);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    C16710l c16710l = new C16710l(bundle, arrayList);
                    Map map = this.crashlytics;
                    if (((C10962l) map.get(str)) == null) {
                        map.put(str, new C10962l(c16710l));
                    }
                    C0022l c0022l = billing;
                    String strAmazon2 = AbstractC0555l.amazon(str);
                    StringBuilder sb = new StringBuilder(strAmazon2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(strAmazon2);
                    c0022l.loadAd(sb.toString(), new Object[0]);
                    if (((C9961l) c7847l.f16369l) == null) {
                        c7847l.f16369l = C9961l.amazon((Context) c7847l.f16370l);
                    }
                    ((C9961l) c7847l.f16369l).yandex(c16710l, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.crashlytics;
        billing.loadAd("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }

    @Override // defpackage.AbstractC2660l
    public final void loadAd(C9961l c9961l, C12736l c12736l) {
        billing.loadAd("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        admob(c12736l, true);
    }

    @Override // defpackage.AbstractC2660l
    public final void purchase(C9961l c9961l, C12736l c12736l) {
        billing.loadAd("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        admob(c12736l, false);
    }

    public final void subs() {
        int size = this.amazon.size();
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 33);
        sb.append("Starting RouteDiscovery with ");
        sb.append(size);
        sb.append(" IDs");
        int i = 0;
        C0022l c0022l = billing;
        c0022l.loadAd(sb.toString(), new Object[0]);
        c0022l.loadAd("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.crashlytics.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            isPro();
        } else {
            new HandlerC4052l(Looper.getMainLooper(), 6).post(new RunnableC10926l(this, i));
        }
    }

    @Override // defpackage.AbstractC2660l
    public final void yandex(C9961l c9961l, C12736l c12736l) {
        billing.loadAd("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        admob(c12736l, true);
    }
}
