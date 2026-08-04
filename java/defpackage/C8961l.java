package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lٌٟٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8961l {
    public final Object admob;
    public final Object amazon;
    public final Object billing;
    public final Object crashlytics;
    public boolean loadAd;
    public final AbstractCollection mopub;
    public final Object purchase;
    public final Object subs;
    public boolean yandex;

    public C8961l(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, C18527l c18527l, InterfaceC8671l interfaceC8671l, boolean z) {
        this.crashlytics = thread;
        this.billing = copyOnWriteArraySet;
        this.purchase = interfaceC8671l;
        this.subs = new Object();
        this.mopub = new ArrayDeque();
        this.admob = new ArrayDeque();
        if (looper == null || c18527l == null || interfaceC8671l == null) {
            this.amazon = null;
        } else {
            this.amazon = c18527l.yandex(looper, new C6352l(0, this));
        }
        this.loadAd = z;
    }

    public void amazon() {
        if (this.loadAd) {
            AbstractC12442l.subscription(Thread.currentThread() == ((Thread) this.crashlytics));
        }
        synchronized (this.subs) {
            this.yandex = true;
        }
        for (C18048l c18048l : (CopyOnWriteArraySet) this.billing) {
            InterfaceC8671l interfaceC8671l = (InterfaceC8671l) this.purchase;
            c18048l.amazon = true;
            if (interfaceC8671l != null && c18048l.crashlytics) {
                c18048l.crashlytics = false;
                interfaceC8671l.smaato(c18048l.yandex, c18048l.loadAd.purchase());
            }
        }
        ((CopyOnWriteArraySet) this.billing).clear();
    }

    public void billing() {
        int i;
        boolean z;
        C17646l c17646l = (C17646l) this.amazon;
        Context context = (Context) this.crashlytics;
        PackageManager packageManager = (PackageManager) this.billing;
        ArrayList arrayList = (ArrayList) this.mopub;
        if (this.loadAd) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.yandex || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (C9961l.crashlytics == null ? false : C9961l.crashlytics().admob()) {
                        if (arrayList2.isEmpty()) {
                            z = false;
                            break;
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                                break;
                            }
                            ServiceInfo serviceInfo3 = (ServiceInfo) it3.next();
                            if (serviceInfo2.packageName.equals(serviceInfo3.packageName) && serviceInfo2.name.equals(serviceInfo3.name)) {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((ServiceConnectionC2783l) arrayList.get(i3)).f6079l;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        ServiceConnectionC2783l serviceConnectionC2783l = new ServiceConnectionC2783l(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        serviceConnectionC2783l.f6075l = new C4568l(this, serviceConnectionC2783l);
                        if (!serviceConnectionC2783l.f6078l) {
                            serviceConnectionC2783l.f6078l = true;
                            serviceConnectionC2783l.smaato();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, serviceConnectionC2783l);
                        c17646l.yandex(serviceConnectionC2783l, false);
                    } else if (i3 >= i2) {
                        ServiceConnectionC2783l serviceConnectionC2783l2 = (ServiceConnectionC2783l) arrayList.get(i3);
                        if (!serviceConnectionC2783l2.f6078l) {
                            serviceConnectionC2783l2.f6078l = true;
                            serviceConnectionC2783l2.smaato();
                        }
                        if (serviceConnectionC2783l2.f6081l == null) {
                            if (!serviceConnectionC2783l2.f6078l || (serviceConnectionC2783l2.f7558l == null && serviceConnectionC2783l2.f6080l.isEmpty())) {
                                z2 = false;
                            }
                            if (z2) {
                                serviceConnectionC2783l2.firebase();
                                serviceConnectionC2783l2.admob();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    ServiceConnectionC2783l serviceConnectionC2783l3 = (ServiceConnectionC2783l) arrayList.get(size2);
                    C12545l c12545lAmazon = c17646l.amazon(serviceConnectionC2783l3);
                    if (c12545lAmazon != null) {
                        serviceConnectionC2783l3.getClass();
                        C9961l.loadAd();
                        serviceConnectionC2783l3.f7559l = null;
                        serviceConnectionC2783l3.mopub(null);
                        c17646l.vip(c12545lAmazon, null);
                        c17646l.yandex.loadAd(514, c12545lAmazon);
                        c17646l.smaato.remove(c12545lAmazon);
                    }
                    arrayList.remove(serviceConnectionC2783l3);
                    serviceConnectionC2783l3.f6075l = null;
                    if (serviceConnectionC2783l3.f6078l) {
                        serviceConnectionC2783l3.f6078l = false;
                        serviceConnectionC2783l3.smaato();
                    }
                }
            }
        }
    }

    public void crashlytics(int i, InterfaceC16975l interfaceC16975l) {
        if (this.loadAd) {
            AbstractC12442l.subscription(Thread.currentThread() == ((Thread) this.crashlytics));
        }
        ((ArrayDeque) this.admob).add(new RunnableC2027l(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.billing), i, interfaceC16975l, 5));
    }

    public void loadAd() {
        C14500l c14500l = (C14500l) this.amazon;
        ArrayDeque arrayDeque = (ArrayDeque) this.mopub;
        if (this.loadAd) {
            AbstractC12442l.subscription(Thread.currentThread() == ((Thread) this.crashlytics));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.admob;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((InterfaceC8671l) this.purchase) != null) {
            c14500l.getClass();
            Handler handler = c14500l.yandex;
            if (!handler.hasMessages(1)) {
                C3485l c3485lYandex = c14500l.yandex(1);
                Message message = c3485lYandex.yandex;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                c3485lYandex.yandex();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void mopub(int i, InterfaceC16975l interfaceC16975l) {
        crashlytics(i, interfaceC16975l);
        loadAd();
    }

    public void purchase(InterfaceC13521l interfaceC13521l) {
        if (this.loadAd) {
            AbstractC12442l.subscription(Thread.currentThread() == ((Thread) this.crashlytics));
        }
        CopyOnWriteArraySet<C18048l> copyOnWriteArraySet = (CopyOnWriteArraySet) this.billing;
        for (C18048l c18048l : copyOnWriteArraySet) {
            if (c18048l.yandex.equals(interfaceC13521l)) {
                InterfaceC8671l interfaceC8671l = (InterfaceC8671l) this.purchase;
                c18048l.amazon = true;
                if (interfaceC8671l != null && c18048l.crashlytics) {
                    c18048l.crashlytics = false;
                    interfaceC8671l.smaato(c18048l.yandex, c18048l.loadAd.purchase());
                }
                copyOnWriteArraySet.remove(c18048l);
            }
        }
    }

    public void yandex(Object obj) {
        obj.getClass();
        synchronized (this.subs) {
            try {
                if (this.yandex) {
                    return;
                }
                ((CopyOnWriteArraySet) this.billing).add(new C18048l(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8961l(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public C8961l(Looper looper, C18527l c18527l, InterfaceC8671l interfaceC8671l) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), c18527l, interfaceC8671l, true);
    }

    public C8961l(Context context, C17646l c17646l) {
        this.mopub = new ArrayList();
        this.admob = new C13773l(6, this);
        this.subs = new RunnableC5360l(19, this);
        this.crashlytics = context;
        this.amazon = c17646l;
        this.purchase = new Handler();
        this.billing = context.getPackageManager();
    }
}
