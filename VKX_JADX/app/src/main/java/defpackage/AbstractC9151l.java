package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌۣۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9151l {
    public static volatile C10756l crashlytics;
    public static volatile C10756l loadAd;
    public static final Object yandex = new Object();

    public static InterfaceC16922l admob(C13381l c13381l) {
        return purchase(c13381l.loadAd, c13381l.billing);
    }

    public static InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, String str, Function0 function0, C2403l c2403l, Function0 function1, int i) {
        return interfaceC17242l.premium(new C17236l(null, (i & 128) != 0 ? null : c2403l, (i & 8) != 0 ? null : str, function1, function0, true, true));
    }

    public static final C13432l billing(Context context, C12211l c12211l) {
        C18664l c18664l;
        int i;
        String name;
        AbstractC9963l abstractC9963lPurchase;
        boolean zContainsKey;
        C3307l c3307l = new C3307l(c12211l.crashlytics);
        Context applicationContext = context.getApplicationContext();
        C6565l c6565l = c12211l.amazon;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            c18664l = new C18664l(applicationContext, null);
            c18664l.subs = true;
        } else {
            if (AbstractC12024l.m3315catch("androidx.work.workdb")) {
                C8339l.metrica("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                return null;
            }
            C18664l c18664l2 = new C18664l(applicationContext, "androidx.work.workdb");
            c18664l2.admob = new C6012l(applicationContext);
            c18664l = c18664l2;
        }
        c18664l.billing = c3307l.yandex;
        C5350l c5350l = new C5350l(0, c6565l);
        ArrayList arrayList = c18664l.amazon;
        arrayList.add(c5350l);
        c18664l.yandex(C4120l.admob);
        int i2 = 2;
        c18664l.yandex(new C3921l(applicationContext, 2, 3));
        c18664l.yandex(C4120l.subs);
        c18664l.yandex(C4120l.isPro);
        c18664l.yandex(new C3921l(applicationContext, 5, 6));
        c18664l.yandex(C4120l.firebase);
        c18664l.yandex(C4120l.smaato);
        c18664l.yandex(C4120l.remoteconfig);
        c18664l.yandex(new C3921l(applicationContext));
        c18664l.yandex(new C3921l(applicationContext, 10, 11));
        c18664l.yandex(C4120l.amazon);
        c18664l.yandex(C4120l.purchase);
        c18664l.yandex(C4120l.billing);
        c18664l.yandex(C4120l.mopub);
        c18664l.yandex(new C3921l(applicationContext, 21, 22));
        c18664l.metrica = false;
        c18664l.startapp = true;
        c18664l.adcel = true;
        Executor executor = c18664l.billing;
        if (executor == null && c18664l.mopub == null) {
            ExecutorC11374l executorC11374l = C0508l.purchase;
            c18664l.mopub = executorC11374l;
            c18664l.billing = executorC11374l;
        } else if (executor != null && c18664l.mopub == null) {
            c18664l.mopub = executor;
        } else if (executor == null) {
            c18664l.billing = c18664l.mopub;
        }
        LinkedHashSet linkedHashSet = c18664l.remoteconfig;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = c18664l.smaato;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    C10754l.metrica(AbstractC0653l.vip(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        InterfaceC17619l c14529l = c18664l.admob;
        if (c14529l == null) {
            c14529l = new C14529l(i2);
        }
        InterfaceC17619l interfaceC17619l = c14529l;
        if (c18664l.isPro > 0) {
            if (c18664l.crashlytics != null) {
                C8339l.metrica("Required value was null.");
                return null;
            }
            C8339l.metrica("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = c18664l.subs;
        int i3 = c18664l.subscription;
        if (i3 == 0) {
            throw null;
        }
        Context context2 = c18664l.loadAd;
        if (i3 != 1) {
            i = i3;
        } else {
            Object systemService = context2.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = c18664l.billing;
        if (executor2 == null) {
            C8339l.metrica("Required value was null.");
            return null;
        }
        Executor executor3 = c18664l.mopub;
        if (executor3 == null) {
            C8339l.metrica("Required value was null.");
            return null;
        }
        C8508l c8508l = new C8508l(context2, c18664l.crashlytics, interfaceC17619l, c18664l.firebase, arrayList, z, i, executor2, executor3, null, c18664l.metrica, c18664l.startapp, linkedHashSet2, null, null, null, c18664l.purchase, c18664l.vip, c18664l.adcel, null, null);
        c8508l.ads = c18664l.ads;
        Class clsMo1730private = ((InterfaceC13937l) c18664l.yandex).mo1730private();
        Package r0 = clsMo1730private.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsMo1730private.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = canonicalName.replace('.', '_').concat("_Impl");
        try {
            AbstractC15781l abstractC15781l = (AbstractC15781l) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsMo1730private.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            abstractC15781l.isPro = c8508l.ads;
            try {
                abstractC9963lPurchase = abstractC15781l.purchase();
            } catch (C13165l unused) {
                abstractC9963lPurchase = null;
            }
            if (abstractC9963lPurchase == null) {
                new C3512l(c8508l, new C5266l(abstractC15781l));
                throw null;
            }
            abstractC15781l.amazon = new C3512l(c8508l, abstractC9963lPurchase);
            abstractC15781l.purchase = abstractC15781l.amazon();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setMopub = abstractC15781l.mopub();
            int size = setMopub.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setMopub.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                int i4 = -1;
                List list = c8508l.metrica;
                if (zHasNext) {
                    InterfaceC1388l interfaceC1388l = (InterfaceC1388l) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i5 = size2 - 1;
                            if (interfaceC1388l.mo886strictfp(list.get(size2))) {
                                zArr[size2] = true;
                                i4 = size2;
                                break;
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size2 = i5;
                        }
                    }
                    if (i4 < 0) {
                        C10754l.license(interfaceC1388l.billing(), ") is missing in the database configuration.", "A required auto migration spec (");
                        return null;
                    }
                    linkedHashMap.put(interfaceC1388l, list.get(i4));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i6 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                C8339l.metrica("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i6 < 0) {
                                break;
                            }
                            size3 = i6;
                        }
                    }
                    for (AbstractC8590l abstractC8590l : abstractC15781l.crashlytics(linkedHashMap)) {
                        int i7 = abstractC8590l.yandex;
                        int i8 = abstractC8590l.loadAd;
                        C0099l c0099l = c8508l.amazon;
                        LinkedHashMap linkedHashMap2 = c0099l.loadAd;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i7))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i7));
                            if (map == null) {
                                map = C14054l.f27396l;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i8));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            c0099l.yandex(abstractC8590l);
                        }
                    }
                    LinkedHashMap linkedHashMapAdmob = abstractC15781l.admob();
                    boolean[] zArr2 = new boolean[linkedHashMapAdmob.size()];
                    Iterator it3 = linkedHashMapAdmob.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        List list2 = c8508l.vip;
                        if (!zHasNext2) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i9 = size4 - 1;
                                    if (!zArr2[size4]) {
                                        C10754l.startapp(list2.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                        return null;
                                    }
                                    if (i9 < 0) {
                                        break;
                                    }
                                    size4 = i9;
                                }
                            }
                            abstractC15781l.loadAd = c8508l.admob;
                            abstractC15781l.crashlytics = new ExecutorC8064l(1, c8508l.subs);
                            Executor executor4 = abstractC15781l.loadAd;
                            if (executor4 == null) {
                                executor4 = null;
                            }
                            C18662l c18662lYandex = AbstractC11990l.yandex(AbstractC10586l.billing(AbstractC5103l.billing(executor4), AbstractC1295l.crashlytics()));
                            abstractC15781l.yandex = c18662lYandex;
                            InterfaceC12932l interfaceC12932l = c18662lYandex.f36440l;
                            ExecutorC8064l executorC8064l = abstractC15781l.crashlytics;
                            if (executorC8064l == null) {
                                executorC8064l = null;
                            }
                            interfaceC12932l.mo246l(AbstractC5103l.billing(executorC8064l));
                            abstractC15781l.mopub = c8508l.billing;
                            C3512l c3512l = abstractC15781l.amazon;
                            if (c3512l == null) {
                                c3512l = null;
                            }
                            InterfaceC11449l interfaceC11449lCrashlytics = c3512l.crashlytics();
                            if (interfaceC11449lCrashlytics == null) {
                                interfaceC11449lCrashlytics = null;
                                break;
                            }
                            while (!(interfaceC11449lCrashlytics instanceof AbstractC6062l)) {
                                if (!(interfaceC11449lCrashlytics instanceof InterfaceC0009l)) {
                                    interfaceC11449lCrashlytics = null;
                                    break;
                                }
                                interfaceC11449lCrashlytics = ((InterfaceC0009l) interfaceC11449lCrashlytics).yandex();
                            }
                            C3512l c3512l2 = abstractC15781l.amazon;
                            if (c3512l2 == null) {
                                c3512l2 = null;
                            }
                            InterfaceC11449l interfaceC11449lCrashlytics2 = c3512l2.crashlytics();
                            if (interfaceC11449lCrashlytics2 == null) {
                                interfaceC11449lCrashlytics2 = null;
                                break;
                            }
                            while (!(interfaceC11449lCrashlytics2 instanceof AbstractC4448l)) {
                                if (!(interfaceC11449lCrashlytics2 instanceof InterfaceC0009l)) {
                                    interfaceC11449lCrashlytics2 = null;
                                    break;
                                }
                                interfaceC11449lCrashlytics2 = ((InterfaceC0009l) interfaceC11449lCrashlytics2).yandex();
                            }
                            Intent intent = c8508l.isPro;
                            if (intent != null) {
                                String str = c8508l.loadAd;
                                if (str == null) {
                                    C8339l.metrica("Required value was null.");
                                    return null;
                                }
                                C15813l c15813l = abstractC15781l.purchase;
                                if (c15813l == null) {
                                    c15813l = null;
                                }
                                c15813l.admob = intent;
                                c15813l.subs = new C12158l(c8508l.yandex, str, c15813l);
                            }
                            WorkDatabase workDatabase = (WorkDatabase) abstractC15781l;
                            C13312l c13312l = new C13312l(context.getApplicationContext(), c3307l);
                            C5648l c5648l = new C5648l(context.getApplicationContext(), c12211l, c3307l, workDatabase);
                            return new C13432l(context.getApplicationContext(), c12211l, c3307l, workDatabase, (List) C12725l.f25094l.invoke(context, c12211l, c3307l, workDatabase, c13312l, c5648l), c5648l, c13312l);
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        InterfaceC1388l interfaceC1388l2 = (InterfaceC1388l) entry.getKey();
                        for (InterfaceC1388l interfaceC1388l3 : (List) entry.getValue()) {
                            int size5 = list2.size() - 1;
                            if (size5 < 0) {
                                size5 = -1;
                                break;
                            }
                            while (true) {
                                int i10 = size5 - 1;
                                if (interfaceC1388l3.mo886strictfp(list2.get(size5))) {
                                    zArr2[size5] = true;
                                    break;
                                }
                                if (i10 < 0) {
                                    size5 = -1;
                                    break;
                                }
                                size5 = i10;
                            }
                            if (size5 < 0) {
                                C11983l.startapp("A required type converter (", interfaceC1388l3.billing(), ") for ", interfaceC1388l2.billing(), " is missing in the database configuration.");
                                return null;
                            }
                            abstractC15781l.subs.put(interfaceC1388l3, list2.get(size5));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsMo1730private.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsMo1730private.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsMo1730private.getCanonicalName(), e3);
        }
    }

    public static InterfaceC17242l crashlytics(InterfaceC17242l interfaceC17242l, C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z, Function0 function0, Function0 function1, int i) {
        InterfaceC17242l interfaceC17242lPremium;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            function0 = null;
        }
        Function0 function2 = function0;
        if (interfaceC2186l instanceof InterfaceC2186l) {
            interfaceC17242lPremium = new C17236l(interfaceC2186l, c2403l, null, function1, function2, false, z2);
        } else if (interfaceC2186l == null) {
            interfaceC17242lPremium = new C17236l(null, c2403l, null, function1, function2, false, z2);
        } else {
            C4346l c4346l = C4346l.f8873l;
            interfaceC17242lPremium = c2403l != null ? AbstractC14631l.yandex(c4346l, c2403l, interfaceC2186l).premium(new C17236l(null, c2403l, null, function1, function2, false, z2)) : AbstractC17541l.loadAd(c4346l, new C2344l(interfaceC2186l, z2, function1, function2));
        }
        return interfaceC17242l.premium(interfaceC17242lPremium);
    }

    public static void firebase() {
        synchronized (yandex) {
        }
    }

    public static double[] isPro(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    public static InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, boolean z, String str, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return interfaceC17242l.premium(new C8057l(null, null, true, z2, str, null, function0));
    }

    public static InterfaceC16922l purchase(int i, Cfor cfor) {
        InterfaceC17898l c17951l;
        if (cfor.ad(InterfaceC8134l.yandex)) {
            c17951l = new C2657l();
        } else {
            if (!cfor.ad(InterfaceC8134l.adcel)) {
                C8339l.metrica(AbstractC9361l.license("unrecognized digest OID: ", cfor));
                return null;
            }
            c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return (InterfaceC8134l.adcel.ad(cfor) || c17951l.getDigestSize() != i) ? new C8816l(c17951l, i) : c17951l;
    }

    public static final boolean subs(KeyEvent keyEvent) {
        long jAmazon = AbstractC16422l.amazon(keyEvent);
        int i = AbstractC5072l.f11081throw;
        return AbstractC5072l.yandex(jAmazon, AbstractC5072l.admob) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.ads) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.inmobi) || AbstractC5072l.yandex(jAmazon, AbstractC5072l.adcel);
    }

    public static InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, C2403l c2403l, InterfaceC2186l interfaceC2186l, boolean z, C6402l c6402l, Function0 function0, int i) {
        InterfaceC17242l interfaceC17242lPremium;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            c6402l = null;
        }
        C6402l c6402l2 = c6402l;
        if (interfaceC2186l instanceof InterfaceC2186l) {
            interfaceC17242lPremium = new C8057l(c2403l, interfaceC2186l, false, z2, null, c6402l2, function0);
        } else if (interfaceC2186l == null) {
            interfaceC17242lPremium = new C8057l(c2403l, null, false, z2, null, c6402l2, function0);
        } else {
            C4346l c4346l = C4346l.f8873l;
            interfaceC17242lPremium = c2403l != null ? AbstractC14631l.yandex(c4346l, c2403l, interfaceC2186l).premium(new C8057l(c2403l, null, false, z2, null, c6402l2, function0)) : AbstractC17541l.loadAd(c4346l, new C2344l(interfaceC2186l, z2, c6402l2, function0));
        }
        return interfaceC17242l.premium(interfaceC17242lPremium);
    }

    public abstract SocketAddress mopub();
}
