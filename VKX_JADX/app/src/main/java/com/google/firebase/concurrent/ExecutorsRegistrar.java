package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC11064l;
import defpackage.C12638l;
import defpackage.C13252l;
import defpackage.C15616l;
import defpackage.C1652l;
import defpackage.C4652l;
import defpackage.C8876l;
import defpackage.InterfaceC1444l;
import defpackage.InterfaceC2028l;
import defpackage.InterfaceC2293l;
import defpackage.InterfaceC8866l;
import defpackage.ScheduledExecutorServiceC6423l;
import defpackage.ThreadFactoryC11481l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final C13252l yandex = new C13252l(new C15616l(1));
    public static final C13252l loadAd = new C13252l(new C15616l(2));
    public static final C13252l crashlytics = new C13252l(new C15616l(3));
    public static final C13252l amazon = new C13252l(new C15616l(4));

    public static ScheduledExecutorServiceC6423l yandex() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new ScheduledExecutorServiceC6423l(Executors.newFixedThreadPool(4, new ThreadFactoryC11481l("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) amazon.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C12638l c12638l = new C12638l(InterfaceC1444l.class, ScheduledExecutorService.class);
        C12638l[] c12638lArr = {new C12638l(InterfaceC1444l.class, ExecutorService.class), new C12638l(InterfaceC1444l.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c12638l);
        for (C12638l c12638l2 : c12638lArr) {
            AbstractC11064l.loadAd(c12638l2, "Null interface");
        }
        Collections.addAll(hashSet, c12638lArr);
        C4652l c4652l = new C4652l(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C8876l(11), hashSet3);
        C12638l c12638l3 = new C12638l(InterfaceC8866l.class, ScheduledExecutorService.class);
        C12638l[] c12638lArr2 = {new C12638l(InterfaceC8866l.class, ExecutorService.class), new C12638l(InterfaceC8866l.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c12638l3);
        for (C12638l c12638l4 : c12638lArr2) {
            AbstractC11064l.loadAd(c12638l4, "Null interface");
        }
        Collections.addAll(hashSet4, c12638lArr2);
        C4652l c4652l2 = new C4652l(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C8876l(12), hashSet6);
        C12638l c12638l5 = new C12638l(InterfaceC2028l.class, ScheduledExecutorService.class);
        C12638l[] c12638lArr3 = {new C12638l(InterfaceC2028l.class, ExecutorService.class), new C12638l(InterfaceC2028l.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c12638l5);
        for (C12638l c12638l6 : c12638lArr3) {
            AbstractC11064l.loadAd(c12638l6, "Null interface");
        }
        Collections.addAll(hashSet7, c12638lArr3);
        C4652l c4652l3 = new C4652l(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C8876l(13), hashSet9);
        C1652l c1652lYandex = C4652l.yandex(new C12638l(InterfaceC2293l.class, Executor.class));
        c1652lYandex.mopub = new C8876l(14);
        return Arrays.asList(c4652l, c4652l2, c4652l3, c1652lYandex.loadAd());
    }
}
