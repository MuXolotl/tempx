package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٖٚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC16475l implements ServiceConnection {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C7847l f32200l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Messenger f32201l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f32202l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final SparseArray f32203l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ArrayDeque f32204l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C17219l f32205l;

    public ServiceConnectionC16475l(C17219l c17219l) {
        this.f32205l = c17219l;
        HandlerC4052l handlerC4052l = new HandlerC4052l(Looper.getMainLooper(), new C4627l(1, this));
        Looper.getMainLooper();
        this.f32201l = new Messenger(handlerC4052l);
        this.f32204l = new ArrayDeque();
        this.f32203l = new SparseArray();
    }

    public final synchronized boolean amazon(C7075l c7075l) {
        int i = this.f32202l;
        byte b = 0;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.f32204l.add(c7075l);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f32204l.add(c7075l);
            ((ScheduledExecutorService) this.f32205l.f33427l).execute(new RunnableC13358l(this, b == true ? 1 : 0));
            return true;
        }
        this.f32204l.add(c7075l);
        AbstractC1051l.smaato(this.f32202l == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f32202l = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C8394l.loadAd().yandex((Context) this.f32205l.f33423l, intent, this, 1)) {
                ((ScheduledExecutorService) this.f32205l.f33427l).schedule(new RunnableC13358l(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                yandex("Unable to bind to service");
            }
        } catch (SecurityException e) {
            loadAd("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void crashlytics() {
        try {
            if (this.f32202l == 2 && this.f32204l.isEmpty() && this.f32203l.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f32202l = 3;
                C8394l.loadAd().crashlytics((Context) this.f32205l.f33423l, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void loadAd(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f32202l;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f32202l = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f32202l = 4;
            C8394l.loadAd().crashlytics((Context) this.f32205l.f33423l, this);
            C10756l c10756l = new C10756l(16, str, securityException);
            Iterator it = this.f32204l.iterator();
            while (it.hasNext()) {
                ((C7075l) it.next()).loadAd(c10756l);
            }
            this.f32204l.clear();
            int i2 = 0;
            while (true) {
                int size = this.f32203l.size();
                SparseArray sparseArray = this.f32203l;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((C7075l) sparseArray.valueAt(i2)).loadAd(c10756l);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f32205l.f33427l).execute(new RunnableC16301l((Object) this, (Object) iBinder, false, 5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f32205l.f33427l).execute(new RunnableC13358l(this, i));
    }

    public final synchronized void yandex(String str) {
        loadAd(str, null);
    }
}
