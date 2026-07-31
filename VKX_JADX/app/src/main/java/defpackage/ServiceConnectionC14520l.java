package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؙٓۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC14520l implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Handler f28421l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f28422l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final HashMap f28420l = new HashMap();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Set f28423l = new HashSet();

    public ServiceConnectionC14520l(Context context) {
        this.f28422l = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f28421l = new Handler(handlerThread.getLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        InterfaceC16527l interfaceC16527l = null;
        Context context = this.f28422l;
        HashMap map = this.f28420l;
        if (i == 0) {
            C3684l c3684l = (C3684l) message.obj;
            Set setYandex = C7406l.yandex(context);
            if (!setYandex.equals(this.f28423l)) {
                this.f28423l = setYandex;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (((HashSet) setYandex).contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        map.put(componentName2, new C6372l(componentName2));
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        C6372l c6372l = (C6372l) entry.getValue();
                        if (c6372l.loadAd) {
                            context.unbindService(this);
                            c6372l.loadAd = false;
                        }
                        c6372l.crashlytics = null;
                        it.remove();
                    }
                }
            }
            for (C6372l c6372l2 : map.values()) {
                c6372l2.amazon.add(c3684l);
                yandex(c6372l2);
            }
        } else if (i == 1) {
            C5318l c5318l = (C5318l) message.obj;
            ComponentName componentName3 = c5318l.yandex;
            IBinder iBinder = c5318l.loadAd;
            C6372l c6372l3 = (C6372l) map.get(componentName3);
            if (c6372l3 != null) {
                int i2 = AbstractBinderC4552l.purchase;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC16527l.crashlytics);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC16527l)) {
                        C8805l c8805l = new C8805l();
                        c8805l.purchase = iBinder;
                        interfaceC16527l = c8805l;
                    } else {
                        interfaceC16527l = (InterfaceC16527l) iInterfaceQueryLocalInterface;
                    }
                }
                c6372l3.crashlytics = interfaceC16527l;
                c6372l3.purchase = 0;
                yandex(c6372l3);
                return true;
            }
        } else if (i == 2) {
            C6372l c6372l4 = (C6372l) map.get((ComponentName) message.obj);
            if (c6372l4 != null) {
                if (c6372l4.loadAd) {
                    context.unbindService(this);
                    c6372l4.loadAd = false;
                }
                c6372l4.crashlytics = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            C6372l c6372l5 = (C6372l) map.get((ComponentName) message.obj);
            if (c6372l5 != null) {
                yandex(c6372l5);
                return true;
            }
        }
        return true;
    }

    public final void loadAd(C6372l c6372l) {
        ComponentName componentName = c6372l.yandex;
        ArrayDeque arrayDeque = c6372l.amazon;
        Handler handler = this.f28421l;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c6372l.purchase;
        int i2 = i + 1;
        c6372l.purchase = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + c6372l.purchase + " retries");
        arrayDeque.clear();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f28421l.obtainMessage(1, new C5318l(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f28421l.obtainMessage(2, componentName).sendToTarget();
    }

    public final void yandex(C6372l c6372l) {
        boolean z;
        ArrayDeque arrayDeque = c6372l.amazon;
        ComponentName componentName = c6372l.yandex;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c6372l.loadAd) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f28422l;
            boolean zBindService = context.bindService(component, this, 33);
            c6372l.loadAd = zBindService;
            if (zBindService) {
                c6372l.purchase = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c6372l.loadAd;
        }
        if (!z || c6372l.crashlytics == null) {
            loadAd(c6372l);
            return;
        }
        while (true) {
            C3684l c3684l = (C3684l) arrayDeque.peek();
            if (c3684l == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + c3684l);
                }
                c3684l.yandex(c6372l.crashlytics);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        loadAd(c6372l);
    }
}
