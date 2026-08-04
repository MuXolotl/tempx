package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؙٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6531l {
    public static final C12899l crashlytics;
    public static final C14529l loadAd;
    public static final C4269l yandex;

    static {
        int i = 9;
        yandex = new C4269l(i);
        loadAd = new C14529l(i);
        crashlytics = new C12899l(i);
    }

    public static final C16482l crashlytics(InterfaceC0798l interfaceC0798l) {
        return (C16482l) new C7502l(interfaceC0798l.firebase(), new C6760l(9), interfaceC0798l instanceof InterfaceC7364l ? ((InterfaceC7364l) interfaceC0798l).crashlytics() : C12214l.loadAd).crashlytics(AbstractC18202l.yandex.loadAd(C16482l.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void loadAd(InterfaceC3187l interfaceC3187l) {
        EnumC8981l enumC8981l = ((C5268l) interfaceC3187l.loadAd()).subs;
        if (enumC8981l != EnumC8981l.f18521l && enumC8981l != EnumC8981l.f18520l) {
            C11983l.startapp("Failed to enable `SavedStateHandle` for `", interfaceC3187l, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", enumC8981l, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (interfaceC3187l.metrica().applovin("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C2705l c2705l = new C2705l(interfaceC3187l.metrica(), (InterfaceC0798l) interfaceC3187l);
            interfaceC3187l.metrica().m4528synchronized("androidx.lifecycle.internal.SavedStateHandlesProvider", c2705l);
            interfaceC3187l.loadAd().yandex(new C12517l(4, c2705l));
        }
    }

    public static final C1453l yandex(C3806l c3806l) {
        LinkedHashMap linkedHashMap = c3806l.yandex;
        InterfaceC3187l interfaceC3187l = (InterfaceC3187l) linkedHashMap.get(yandex);
        Bundle bundle = null;
        if (interfaceC3187l == null) {
            C8339l.metrica("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        InterfaceC0798l interfaceC0798l = (InterfaceC0798l) linkedHashMap.get(loadAd);
        if (interfaceC0798l == null) {
            C8339l.metrica("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(crashlytics);
        String str = (String) linkedHashMap.get(AbstractC7237l.yandex);
        if (str == null) {
            C8339l.metrica("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        InterfaceC3335l interfaceC3335lApplovin = interfaceC3187l.metrica().applovin("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2705l c2705l = interfaceC3335lApplovin instanceof C2705l ? (C2705l) interfaceC3335lApplovin : null;
        if (c2705l == null) {
            C8339l.smaato("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        C16482l c16482lCrashlytics = crashlytics(interfaceC0798l);
        C1453l c1453l = (C1453l) c16482lCrashlytics.loadAd.get(str);
        if (c1453l != null) {
            return c1453l;
        }
        c2705l.loadAd();
        Bundle bundle3 = c2705l.crashlytics;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(new C8195l[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                c2705l.crashlytics = null;
            }
            bundle = bundle4;
        }
        C1453l c1453lLoadAd = AbstractC18377l.loadAd(bundle, bundle2);
        c16482lCrashlytics.loadAd.put(str, c1453lLoadAd);
        return c1453lLoadAd;
    }
}
