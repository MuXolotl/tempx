package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: renamed from: lؘّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC5994l implements ServiceConnection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f12719l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Bundle f12720l;

    public ServiceConnectionC5994l(C13208l c13208l, Bundle bundle) {
        this.f12719l = c13208l;
        this.f12720l = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C16811l c16811l = this.f12719l.yandex;
        Objects.requireNonNull(c16811l);
        c16811l.m4197abstract(new RunnableC11297l(18, c16811l));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        RunnableC11297l runnableC11297l;
        C13208l c13208l = this.f12719l;
        C12962l c12962l = c13208l.purchase;
        C16811l c16811l = c13208l.yandex;
        int i = 18;
        try {
            try {
                if (c12962l.yandex.mopub().equals(componentName.getPackageName())) {
                    InterfaceC17765l interfaceC17765lCrashlytics = BinderC7189l.crashlytics(iBinder);
                    if (interfaceC17765lCrashlytics != null) {
                        String packageName = c13208l.amazon.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.f12720l;
                        c16811l.getClass();
                        interfaceC17765lCrashlytics.mo2184l(c13208l.crashlytics, new C0176l(packageName, iMyPid, bundle).loadAd());
                        return;
                    }
                    AbstractC6427l.admob("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(c16811l);
                    runnableC11297l = new RunnableC11297l(i, c16811l);
                } else {
                    AbstractC6427l.admob("MCImplBase", "Expected connection to " + c12962l.yandex.mopub() + " but is connected to " + componentName);
                    Objects.requireNonNull(c16811l);
                    runnableC11297l = new RunnableC11297l(i, c16811l);
                }
            } catch (RemoteException unused) {
                AbstractC6427l.vip("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(c16811l);
                runnableC11297l = new RunnableC11297l(i, c16811l);
            }
            c16811l.m4197abstract(runnableC11297l);
        } catch (Throwable th) {
            Objects.requireNonNull(c16811l);
            c16811l.m4197abstract(new RunnableC11297l(i, c16811l));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C16811l c16811l = this.f12719l.yandex;
        Objects.requireNonNull(c16811l);
        c16811l.m4197abstract(new RunnableC11297l(18, c16811l));
    }
}
