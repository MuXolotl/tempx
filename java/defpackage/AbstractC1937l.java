package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: lؚؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1937l {
    public static volatile C12248l amazon;
    public static final String[] purchase;
    public static volatile int yandex;
    public static final C12248l loadAd = new C12248l(1);
    public static final C12248l crashlytics = new C12248l(0);

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase("true");
        }
        purchase = new String[]{"2.0"};
    }

    public static void amazon() {
        C12248l c12248l = loadAd;
        synchronized (c12248l) {
            try {
                ((C3029l) c12248l.loadAd).f6543l = true;
                C3029l c3029l = (C3029l) c12248l.loadAd;
                c3029l.getClass();
                for (C0903l c0903l : new ArrayList(c3029l.f6542l.values())) {
                    c0903l.f2556l = loadAd(c0903l.f2557l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((C3029l) loadAd.loadAd).f6541l;
        int size = linkedBlockingQueue.size();
        ArrayList<C8260l> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C8260l c8260l : arrayList) {
                if (c8260l != null) {
                    C0903l c0903l2 = c8260l.loadAd;
                    String str = c0903l2.f2557l;
                    if (c0903l2.f2556l == null) {
                        C8339l.smaato("Delegate logger cannot be null at this state.");
                        return;
                    } else if (!(c0903l2.f2556l instanceof C2929l)) {
                        if (!c0903l2.adcel()) {
                            AbstractC1768l.crashlytics(str);
                        } else if (c0903l2.metrica(c8260l.yandex) && c0903l2.adcel()) {
                            try {
                                c0903l2.f2559l.invoke(c0903l2.f2556l, c8260l);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c8260l.loadAd.adcel()) {
                        AbstractC1768l.crashlytics("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        AbstractC1768l.crashlytics("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        AbstractC1768l.crashlytics("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c8260l.loadAd.f2556l instanceof C2929l)) {
                        AbstractC1768l.crashlytics("The following set of substitute loggers may have been accessed");
                        AbstractC1768l.crashlytics("during the initialization phase. Logging calls during this");
                        AbstractC1768l.crashlytics("phase were not honored. However, subsequent logging calls to these");
                        AbstractC1768l.crashlytics("loggers will work as normally expected.");
                        AbstractC1768l.crashlytics("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C3029l c3029l2 = (C3029l) loadAd.loadAd;
        c3029l2.f6542l.clear();
        c3029l2.f6541l.clear();
    }

    public static void billing(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        AbstractC1768l.crashlytics("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            AbstractC1768l.crashlytics("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        AbstractC1768l.crashlytics("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static final void crashlytics() {
        try {
            ArrayList arrayListYandex = yandex();
            mopub(arrayListYandex);
            if (arrayListYandex.isEmpty()) {
                yandex = 4;
                AbstractC1768l.crashlytics("No SLF4J providers were found.");
                AbstractC1768l.crashlytics("Defaulting to no-operation (NOP) logger implementation");
                AbstractC1768l.crashlytics("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = AbstractC1937l.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    AbstractC1768l.yandex("Error getting resources from path", e);
                }
                billing(linkedHashSet);
            } else {
                amazon = (C12248l) arrayListYandex.get(0);
                amazon.getClass();
                amazon.getClass();
                yandex = 3;
                purchase(arrayListYandex);
            }
            amazon();
            if (yandex == 3) {
                try {
                    switch (amazon.yandex) {
                        case 0:
                            boolean z = false;
                            for (String str : purchase) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return;
                            }
                            AbstractC1768l.crashlytics("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(purchase).toString());
                            AbstractC1768l.crashlytics("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    AbstractC1768l.yandex("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            yandex = 2;
            AbstractC1768l.yandex("Failed to instantiate SLF4J LoggerFactory", e2);
            C4875l.remoteconfig("Unexpected initialization failure", e2);
        }
    }

    public static InterfaceC6272l loadAd(String str) {
        C12248l c12248l;
        InterfaceC14145l interfaceC14145l;
        if (yandex == 0) {
            synchronized (AbstractC1937l.class) {
                try {
                    if (yandex == 0) {
                        yandex = 1;
                        crashlytics();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i = yandex;
        if (i == 1) {
            c12248l = loadAd;
        } else {
            if (i == 2) {
                C8339l.smaato("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
            if (i == 3) {
                c12248l = amazon;
            } else {
                if (i != 4) {
                    C8339l.smaato("Unreachable code");
                    return null;
                }
                c12248l = crashlytics;
            }
        }
        switch (c12248l.yandex) {
            case 0:
                interfaceC14145l = (C4269l) c12248l.loadAd;
                break;
            default:
                interfaceC14145l = (C3029l) c12248l.loadAd;
                break;
        }
        return interfaceC14145l.isPro(str);
    }

    public static void mopub(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            AbstractC1768l.crashlytics("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC1768l.crashlytics("Found provider [" + ((C12248l) it.next()) + "]");
            }
            AbstractC1768l.crashlytics("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void purchase(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            C8339l.smaato("No providers were found which is impossible after successful initialization.");
            return;
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i = AbstractC1768l.yandex;
            if (AbstractC5020l.inmobi(2) >= AbstractC5020l.inmobi(AbstractC1768l.loadAd)) {
                AbstractC1768l.loadAd().println("SLF4J(I): ".concat(str));
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((C12248l) arrayList.get(0)).getClass().getName() + "]";
        int i2 = AbstractC1768l.yandex;
        if (AbstractC5020l.inmobi(1) >= AbstractC5020l.inmobi(AbstractC1768l.loadAd)) {
            AbstractC1768l.loadAd().println("SLF4J(D): ".concat(str2));
        }
    }

    public static ArrayList yandex() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = AbstractC1937l.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C12248l c12248l = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i = AbstractC1768l.yandex;
                if (AbstractC5020l.inmobi(2) >= AbstractC5020l.inmobi(AbstractC1768l.loadAd)) {
                    AbstractC1768l.loadAd().println("SLF4J(I): ".concat(str));
                }
                c12248l = (C12248l) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e) {
                AbstractC1768l.yandex("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC1768l.yandex("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC1768l.yandex("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC1768l.yandex("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC1768l.yandex("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e6) {
                e = e6;
                AbstractC1768l.yandex("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (c12248l != null) {
            arrayList.add(c12248l);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(C12248l.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: lْۛۢ
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(C12248l.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((C12248l) it.next());
            } catch (ServiceConfigurationError e7) {
                AbstractC1768l.loadAd().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e7.getMessage()));
            }
        }
        return arrayList;
    }
}
