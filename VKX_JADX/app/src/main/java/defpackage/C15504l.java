package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: lؘٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15504l {
    public static volatile C15504l smaato;
    public final C8181l admob;
    public final C12100l amazon;
    public final BinderC11031l billing;
    public final C1248l crashlytics;
    public final C17667l loadAd;
    public final C10844l mopub;
    public final C7560l purchase;
    public final C15318l subs;
    public final Context yandex;
    public static final C0022l isPro = new C0022l("CastContext", null);
    public static final Object firebase = new Object();

    public C15504l(Context context, C12100l c12100l, List list, BinderC2728l binderC2728l, C7560l c7560l) {
        C1334l c1334l;
        C5529l c5529l;
        this.yandex = context;
        this.amazon = c12100l;
        this.purchase = c7560l;
        this.mopub = new C10844l(context);
        this.admob = binderC2728l.subs;
        if (TextUtils.isEmpty(c12100l.f24036l)) {
            this.subs = null;
        } else {
            this.subs = new C15318l(context, c12100l, binderC2728l);
        }
        HashMap map = new HashMap();
        C15318l c15318l = this.subs;
        if (c15318l != null) {
            map.put(c15318l.loadAd, c15318l.crashlytics);
        }
        int i = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C15318l c15318l2 = (C15318l) it.next();
                AbstractC1051l.isPro(c15318l2, "Additional SessionProvider must not be null.");
                String str = c15318l2.loadAd;
                AbstractC1051l.mopub(str, "Category for SessionProvider must not be null or empty string.");
                AbstractC1051l.crashlytics(!map.containsKey(str), "SessionProvider for category " + str + " already added");
                map.put(str, c15318l2.crashlytics);
            }
        }
        c12100l.f24034l = new C13119l(1);
        try {
            InterfaceC5490l interfaceC5490lYandex = AbstractC10649l.yandex(context, c12100l, binderC2728l, map);
            try {
                C9844l c9844l = (C9844l) interfaceC5490lYandex;
                Parcel parcelM746l = c9844l.m746l(c9844l.m743l(), 6);
                IBinder strongBinder = parcelM746l.readStrongBinder();
                if (strongBinder == null) {
                    c1334l = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    c1334l = iInterfaceQueryLocalInterface instanceof C1334l ? (C1334l) iInterfaceQueryLocalInterface : new C1334l(strongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                parcelM746l.recycle();
                this.crashlytics = new C1248l(c1334l);
                try {
                    C9844l c9844l2 = (C9844l) interfaceC5490lYandex;
                    Parcel parcelM746l2 = c9844l2.m746l(c9844l2.m743l(), 5);
                    IBinder strongBinder2 = parcelM746l2.readStrongBinder();
                    if (strongBinder2 == null) {
                        c5529l = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        c5529l = iInterfaceQueryLocalInterface2 instanceof C5529l ? (C5529l) iInterfaceQueryLocalInterface2 : new C5529l(strongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    parcelM746l2.recycle();
                    C17667l c17667l = new C17667l(c5529l, context);
                    this.loadAd = c17667l;
                    AbstractC1051l.mopub("PrecacheManager", "The log tag cannot be null or empty.");
                    C8181l c8181l = this.admob;
                    int i2 = 0;
                    if (c8181l != null) {
                        c8181l.billing = c17667l;
                        HandlerC4052l handlerC4052l = c8181l.crashlytics;
                        AbstractC1051l.subs(handlerC4052l);
                        handlerC4052l.post(new RunnableC5033l(c8181l, i2));
                    }
                    ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
                    C7558l c7558l = new C7558l(context, executorServiceNewFixedThreadPool instanceof ExecutorServiceC11264l ? (ExecutorServiceC11264l) executorServiceNewFixedThreadPool : executorServiceNewFixedThreadPool instanceof ScheduledExecutorService ? new ScheduledExecutorServiceC10795l((ScheduledExecutorService) executorServiceNewFixedThreadPool) : new ExecutorServiceC11264l(executorServiceNewFixedThreadPool));
                    AbstractC1051l.mopub("BaseNetUtils", "The log tag cannot be null or empty.");
                    c7558l.yandex();
                    BinderC11031l binderC11031l = new BinderC11031l();
                    this.billing = binderC11031l;
                    try {
                        C9844l c9844l3 = (C9844l) interfaceC5490lYandex;
                        Parcel parcelM743l = c9844l3.m743l();
                        AbstractC14627l.crashlytics(parcelM743l, binderC11031l);
                        c9844l3.m741l(parcelM743l, 3);
                        binderC11031l.billing.add(this.mopub.yandex);
                        if (!DesugarCollections.unmodifiableList(c12100l.f24042l).isEmpty()) {
                            C0022l c0022l = isPro;
                            Log.i(c0022l.yandex, c0022l.amazon("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.amazon.f24042l))), new Object[0]));
                            C10844l c10844l = this.mopub;
                            List listUnmodifiableList = DesugarCollections.unmodifiableList(this.amazon.f24042l);
                            c10844l.getClass();
                            C0022l c0022l2 = C10844l.billing;
                            int size = listUnmodifiableList.size();
                            StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
                            sb.append("SetRouteDiscovery for ");
                            sb.append(size);
                            sb.append(" IDs");
                            c0022l2.loadAd(sb.toString(), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(AbstractC8320l.purchase((String) it2.next()));
                            }
                            Map map2 = c10844l.crashlytics;
                            c0022l2.loadAd("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
                            HashMap map3 = new HashMap();
                            synchronized (map2) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        C10962l c10962l = (C10962l) map2.get(AbstractC8320l.purchase(str2));
                                        if (c10962l != null) {
                                            map3.put(str2, c10962l);
                                        }
                                    }
                                    map2.clear();
                                    map2.putAll(map3);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            c0022l2.loadAd("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = c10844l.amazon;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            c10844l.subs();
                        }
                        c7560l.admob(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).purchase(new C2290l(this));
                        C10147l c10147lYandex = C8662l.yandex();
                        c10147lYandex.yandex = new C6391l(c7560l, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, i);
                        c10147lYandex.amazon = new C9138l[]{AbstractC13106l.purchase};
                        c10147lYandex.crashlytics = true;
                        c10147lYandex.loadAd = false;
                        c10147lYandex.purchase = 8427;
                        c7560l.purchase(0, c10147lYandex.yandex()).purchase(new C4269l(24, this));
                    } catch (RemoteException e) {
                        C4875l.remoteconfig("Failed to call addAppVisibilityListener", e);
                        throw null;
                    }
                } catch (RemoteException e2) {
                    C4875l.remoteconfig("Failed to call getSessionManagerImpl", e2);
                    throw null;
                }
            } catch (RemoteException e3) {
                C4875l.remoteconfig("Failed to call getDiscoveryManagerImpl", e3);
                throw null;
            }
        } catch (RemoteException e4) {
            C4875l.remoteconfig("Failed to call newCastContextImpl", e4);
            throw null;
        }
    }

    public static InterfaceC3563l loadAd(Context context) {
        try {
            Bundle bundle = C16797l.yandex(context).yandex(128, context.getPackageName()).metaData;
            if (bundle == null) {
                isPro.crashlytics(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (InterfaceC3563l) Class.forName(string).asSubclass(InterfaceC3563l.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            C4875l.remoteconfig("Failed to initialize CastContext.", e);
            return null;
        }
    }

    public static C15504l yandex(Context context) {
        AbstractC1051l.purchase("Must be called from the main thread.");
        if (smaato == null) {
            synchronized (firebase) {
                if (smaato == null) {
                    Context applicationContext = context.getApplicationContext();
                    InterfaceC3563l interfaceC3563lLoadAd = loadAd(applicationContext);
                    C12100l castOptions = interfaceC3563lLoadAd.getCastOptions(applicationContext);
                    C7560l c7560l = new C7560l(applicationContext, C7560l.vip, InterfaceC13945l.yandex, C1308l.crashlytics);
                    try {
                        smaato = new C15504l(applicationContext, castOptions, interfaceC3563lLoadAd.getAdditionalSessionProviders(applicationContext), new BinderC2728l(applicationContext, C9961l.amazon(applicationContext), castOptions, c7560l), c7560l);
                    } catch (C1237l e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return smaato;
    }
}
