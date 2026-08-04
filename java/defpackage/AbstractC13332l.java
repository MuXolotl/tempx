package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lْْؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13332l {
    public static final ConcurrentHashMap yandex = new ConcurrentHashMap();

    public static final C8603l yandex(Class cls) {
        InterfaceC9630l interfaceC9630lM1959volatile;
        InterfaceC10240l interfaceC10240lM1959volatile;
        ClassLoader classLoaderAmazon = AbstractC1845l.amazon(cls);
        C8408l c8408l = new C8408l(classLoaderAmazon);
        ConcurrentHashMap concurrentHashMap = yandex;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c8408l);
        if (weakReference != null) {
            C8603l c8603l = (C8603l) weakReference.get();
            if (c8603l != null) {
                return c8603l;
            }
            concurrentHashMap.remove(c8408l, weakReference);
        }
        C13772l c13772l = C13772l.f26868l;
        C15053l c15053l = new C15053l(classLoaderAmazon);
        C15053l c15053l2 = new C15053l(Unit.class.getClassLoader());
        C5008l c5008l = new C5008l(21, classLoaderAmazon);
        C13772l c13772l2 = C13772l.f26876l;
        C11140l c11140l = C11140l.f22369l;
        C16412l c16412l = new C16412l("DeserializationComponentsForJava.ModuleData");
        C6141l c6141l = new C6141l(c16412l);
        C10202l c10202l = new C10202l(C3498l.mopub("<" + ("runtime module for " + classLoaderAmazon) + '>'), c16412l, c6141l, 56);
        InterfaceC2082l interfaceC2082l = c16412l.yandex;
        interfaceC2082l.lock();
        try {
            if (c6141l.yandex != null) {
                throw new AssertionError("Built-ins module is already set: " + c6141l.yandex + " (attempting to reset to " + c10202l + ")");
            }
            c6141l.yandex = c10202l;
            interfaceC2082l.unlock();
            c6141l.billing = new C10750l(c10202l, 0);
            C17367l c17367l = new C17367l();
            C10685l c10685l = new C10685l();
            C12014l c12014l = new C12014l(c16412l, c10202l);
            C14823l c14823l = C14823l.f29011l;
            int i = 1;
            C8855l c8855l = new C8855l(1, 9, 0);
            C12543l c12543l = AbstractC4753l.amazon;
            C8855l c8855l2 = c12543l.loadAd;
            EnumC5244l enumC5244l = (c8855l2 == null || c8855l2.f18206l - c8855l.f18206l > 0) ? c12543l.yandex : c12543l.crashlytics;
            C8634l c8634l = new C8634l(new C13807l(enumC5244l, enumC5244l == EnumC5244l.f11321l ? null : enumC5244l), new C6238l(18, c8855l));
            C13863l c13863l = C13863l.f27116l;
            C1461l c1461l = C1461l.f3666l;
            C2582l c2582l = new C2582l();
            C1461l c1461l2 = C1461l.f3652l;
            C8565l c8565l = C8565l.f17659l;
            C3182l c3182l = new C3182l(c10202l, c12014l);
            C12178l c12178l = new C12178l(c8634l);
            C8565l c8565l2 = C8565l.f17656l;
            C9912l c9912l = new C9912l(10, new C16222l(4));
            C6928l c6928l = C6928l.f14517l;
            InterfaceC11175l.loadAd.getClass();
            C5215l c5215l = C11900l.loadAd;
            C15610l c15610l = new C15610l(new C7757l(c16412l, c5008l, c15053l, c17367l, c13863l, c13772l2, c1461l, c2582l, c11140l, c10685l, c14823l, c1461l2, c8565l, c10202l, c3182l, c12178l, c9912l, c6928l, c8565l2, c5215l, c8634l, new C6928l(29)));
            C4995l c4995l = C4995l.mopub;
            C18396l c18396l = new C18396l(c15053l, c17367l, i);
            C1424l c1424l = new C1424l();
            c1424l.f3603l = c15053l;
            c1424l.f3602l = c16412l.loadAd(new C6238l(0, c1424l));
            c1424l.f3601l = c10202l;
            c1424l.f3605l = c12014l;
            c1424l.f3604l = new C0458l(c10202l, c12014l, 5);
            c1424l.f3606l = C4995l.mopub;
            c1424l.f3606l = c4995l;
            List listSingletonList = Collections.singletonList(C8382l.yandex);
            AbstractC16860l abstractC16860l = c10202l.f20792l;
            C6141l c6141l2 = abstractC16860l instanceof C6141l ? (C6141l) abstractC16860l : null;
            C7472l c7472l = C7472l.f15465l;
            if (c6141l2 == null || (interfaceC9630lM1959volatile = c6141l2.m1959volatile()) == null) {
                interfaceC9630lM1959volatile = C13772l.f26873l;
            }
            if (c6141l2 == null || (interfaceC10240lM1959volatile = c6141l2.m1959volatile()) == null) {
                interfaceC10240lM1959volatile = C11485l.f23088l;
            }
            C3429l c3429l = C11682l.yandex;
            String str = C16412l.amazon;
            C8408l c8408l2 = c8408l;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            new ConcurrentHashMap(3, 1.0f, 2);
            C0511l c0511l = new C0511l(c16412l, c10202l, c18396l, c1424l, c15610l, c13772l2, c7472l, C2580l.f5619l, c12014l, interfaceC9630lM1959volatile, interfaceC10240lM1959volatile, c3429l, c5215l, listSingletonList, c13772l);
            c17367l.yandex = c0511l;
            c10685l.f21690l = new C5501l(13, c15610l);
            C11410l c11410lM1959volatile = c6141l.m1959volatile();
            C11410l c11410lM1959volatile2 = c6141l.m1959volatile();
            String str2 = C16412l.amazon;
            new ConcurrentHashMap(3, 1.0f, 2);
            C17712l c17712l = new C17712l(c16412l, c15053l2, c10202l);
            C1770l c1770l = new C1770l(11, c17712l);
            C7780l c7780l = C7780l.remoteconfig;
            c17712l.crashlytics = new C0511l(c16412l, c10202l, c1770l, new C10023l(c10202l, c12014l, c7780l), c17712l, AbstractC14055l.remoteconfig(new C10589l(c16412l, c10202l), new C13518l(c16412l, c10202l)), c12014l, c11410lM1959volatile, c11410lM1959volatile2, c7780l.yandex, c5215l, 262144);
            c10202l.f20790l = new C5501l(18, AbstractC8669l.m2415super(new C10202l[]{c10202l}));
            c10202l.f20795l = new C2518l(AbstractC14055l.remoteconfig(c15610l, c17712l), "CompositeProvider@RuntimeModuleData for " + c10202l);
            C8603l c8603l2 = new C8603l(c0511l, new C18449l(c17367l, c15053l));
            while (true) {
                C8408l c8408l3 = c8408l2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(c8408l3, new WeakReference(c8603l2));
                if (weakReference2 == null) {
                    return c8603l2;
                }
                C8603l c8603l3 = (C8603l) weakReference2.get();
                if (c8603l3 != null) {
                    return c8603l3;
                }
                concurrentHashMap3.remove(c8408l3, weakReference2);
                c8408l2 = c8408l3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (Throwable th) {
            try {
                c16412l.loadAd.getClass();
                throw th;
            } catch (Throwable th2) {
                interfaceC2082l.unlock();
                throw th2;
            }
        }
    }
}
