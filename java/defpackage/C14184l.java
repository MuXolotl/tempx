package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٖٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14184l {
    public static final Object firebase = new Object();
    public static final C11154l smaato = new C11154l(0);
    public final InterfaceC15189l admob;
    public final C15615l amazon;
    public final AtomicBoolean billing;
    public final C1042l crashlytics;
    public final CopyOnWriteArrayList isPro;
    public final String loadAd;
    public final C13252l mopub;
    public final AtomicBoolean purchase;
    public final CopyOnWriteArrayList subs;
    public final Context yandex;

    public C14184l(Context context, String str, C1042l c1042l) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.purchase = atomicBoolean;
        this.billing = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.subs = copyOnWriteArrayList;
        this.isPro = new CopyOnWriteArrayList();
        this.yandex = context;
        AbstractC1051l.billing(str);
        this.loadAd = str;
        this.crashlytics = c1042l;
        C15735l c15735l = FirebaseInitProvider.f770l;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListAd = new C10023l((Object) context, (Object) new C3585l(8, ComponentDiscoveryService.class), false).ad();
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC8239l enumC8239l = EnumC8239l.f17128l;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListAd);
        int i = 1;
        arrayList.add(new C13256l(i, new FirebaseCommonRegistrar()));
        arrayList.add(new C13256l(i, new ExecutorsRegistrar()));
        arrayList2.add(C4652l.crashlytics(context, Context.class, new Class[0]));
        arrayList2.add(C4652l.crashlytics(this, C14184l.class, new Class[0]));
        arrayList2.add(C4652l.crashlytics(c1042l, C1042l.class, new Class[0]));
        C6168l c6168l = new C6168l(27);
        if (AbstractC17002l.amazon(context) && FirebaseInitProvider.f769l.get()) {
            arrayList2.add(C4652l.crashlytics(c15735l, C15735l.class, new Class[0]));
        }
        C15615l c15615l = new C15615l(enumC8239l, arrayList, arrayList2, c6168l);
        this.amazon = c15615l;
        Trace.endSection();
        this.mopub = new C13252l(new C16865l(this, context, 2));
        this.admob = c15615l.mo619l(C2762l.class);
        C10397l c10397l = new C10397l(this);
        yandex();
        if (atomicBoolean.get()) {
            ComponentCallbacks2C4704l.f9551l.f9554l.get();
        }
        copyOnWriteArrayList.add(c10397l);
        Trace.endSection();
    }

    public static C14184l billing(Context context) {
        synchronized (firebase) {
            try {
                if (smaato.containsKey("[DEFAULT]")) {
                    return crashlytics();
                }
                C1042l c1042lYandex = C1042l.yandex(context);
                if (c1042lYandex == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return mopub(context, c1042lYandex);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C14184l crashlytics() {
        C14184l c14184l;
        synchronized (firebase) {
            try {
                c14184l = (C14184l) smaato.get("[DEFAULT]");
                if (c14184l == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC13950l.license() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C2762l) c14184l.admob.get()).crashlytics();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c14184l;
    }

    public static C14184l mopub(Context context, C1042l c1042l) {
        C14184l c14184l;
        AtomicReference atomicReference = C0991l.yandex;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C0991l.yandex;
            if (atomicReference2.get() == null) {
                C0991l c0991l = new C0991l();
                do {
                    if (atomicReference2.compareAndSet(null, c0991l)) {
                        ComponentCallbacks2C4704l.loadAd(application);
                        ComponentCallbacks2C4704l.f9551l.yandex(c0991l);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (firebase) {
            C11154l c11154l = smaato;
            AbstractC1051l.firebase("FirebaseApp name [DEFAULT] already exists!", !c11154l.containsKey("[DEFAULT]"));
            AbstractC1051l.isPro(context, "Application context cannot be null.");
            c14184l = new C14184l(context, "[DEFAULT]", c1042l);
            c11154l.put("[DEFAULT]", c14184l);
        }
        c14184l.purchase();
        return c14184l;
    }

    public final boolean admob() {
        boolean z;
        yandex();
        C1261l c1261l = (C1261l) this.mopub.get();
        synchronized (c1261l) {
            z = c1261l.yandex;
        }
        return z;
    }

    public final String amazon() {
        StringBuilder sb = new StringBuilder();
        yandex();
        byte[] bytes = this.loadAd.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        yandex();
        byte[] bytes2 = this.crashlytics.loadAd.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14184l)) {
            return false;
        }
        C14184l c14184l = (C14184l) obj;
        c14184l.yandex();
        return this.loadAd.equals(c14184l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode();
    }

    public final Object loadAd(Class cls) {
        yandex();
        return this.amazon.remoteconfig(cls);
    }

    public final void purchase() {
        Context context = this.yandex;
        boolean zAmazon = AbstractC17002l.amazon(context);
        String str = this.loadAd;
        if (zAmazon) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            yandex();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            yandex();
            this.amazon.adcel("[DEFAULT]".equals(str));
            ((C2762l) this.admob.get()).crashlytics();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        yandex();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = C9815l.loadAd;
        if (atomicReference.get() == null) {
            C9815l c9815l = new C9815l(context);
            while (!atomicReference.compareAndSet(null, c9815l)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(c9815l, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final String toString() {
        C13568l c13568l = new C13568l(this);
        c13568l.loadAd(this.loadAd, "name");
        c13568l.loadAd(this.crashlytics, "options");
        return c13568l.toString();
    }

    public final void yandex() {
        AbstractC1051l.firebase("FirebaseApp was deleted", !this.billing.get());
    }
}
