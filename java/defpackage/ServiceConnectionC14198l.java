package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC14198l implements ServiceConnection {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f27788l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C13304l f27789l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5219l f27792l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public IBinder f27793l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ComponentName f27794l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final HashMap f27791l = new HashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f27790l = 2;

    public ServiceConnectionC14198l(C13304l c13304l, C5219l c5219l) {
        this.f27789l = c13304l;
        this.f27792l = c5219l;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C13304l c13304l = this.f27789l;
        synchronized (c13304l.yandex) {
            try {
                c13304l.crashlytics.removeMessages(1, this.f27792l);
                this.f27793l = iBinder;
                this.f27794l = componentName;
                Iterator it = this.f27791l.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f27790l = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C13304l c13304l = this.f27789l;
        synchronized (c13304l.yandex) {
            try {
                c13304l.crashlytics.removeMessages(1, this.f27792l);
                this.f27793l = null;
                this.f27794l = componentName;
                Iterator it = this.f27791l.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f27790l = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C10602l yandex(String str, Executor executor) {
        try {
            Intent intentYandex = AbstractC16900l.yandex(this.f27789l.loadAd, this.f27792l);
            this.f27790l = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC14773l.yandex(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C13304l c13304l = this.f27789l;
                C8394l c8394l = c13304l.amazon;
                Context context = c13304l.loadAd;
                C5219l c5219l = this.f27792l;
                boolean zAmazon = c8394l.amazon(context, str, intentYandex, this, 4225, executor);
                this.f27788l = zAmazon;
                if (zAmazon) {
                    c13304l.crashlytics.sendMessageDelayed(c13304l.crashlytics.obtainMessage(1, c5219l), c13304l.billing);
                    return C10602l.f21518l;
                }
                this.f27790l = 2;
                try {
                    c13304l.amazon.crashlytics(c13304l.loadAd, this);
                } catch (IllegalArgumentException unused) {
                }
                return new C10602l(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (C1005l e) {
            return e.f2750l;
        }
    }
}
