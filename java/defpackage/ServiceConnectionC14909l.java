package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: renamed from: lٕٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC14909l implements ServiceConnection, InterfaceC9710l, InterfaceC14795l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C11860l f29351l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile C0594l f29352l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public volatile boolean f29353l;

    public ServiceConnectionC14909l(C11860l c11860l) {
        this.f29351l = c11860l;
    }

    @Override // defpackage.InterfaceC14795l
    public final void crashlytics(C10602l c10602l) {
        C11860l c11860l = this.f29351l;
        C17923l c17923l = ((C17417l) c11860l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4442l();
        C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
        if (c8118l == null || !c8118l.f36144l) {
            c8118l = null;
        }
        if (c8118l != null) {
            c8118l.f16911l.loadAd(c10602l, "Service connection failed");
        }
        synchronized (this) {
            this.f29353l = false;
            this.f29352l = null;
        }
        C17923l c17923l2 = ((C17417l) this.f29351l.f833l).f33929l;
        C17417l.admob(c17923l2);
        c17923l2.m4449l(new RunnableC16301l(this, c10602l, 19));
    }

    @Override // defpackage.InterfaceC9710l
    public final void firebase(Bundle bundle) {
        C17923l c17923l = ((C17417l) this.f29351l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4442l();
        synchronized (this) {
            try {
                AbstractC1051l.subs(this.f29352l);
                InterfaceC5496l interfaceC5496l = (InterfaceC5496l) this.f29352l.metrica();
                C17923l c17923l2 = ((C17417l) this.f29351l.f833l).f33929l;
                C17417l.admob(c17923l2);
                c17923l2.m4449l(new RunnableC13263l(this, interfaceC5496l, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f29352l = null;
                this.f29353l = false;
            }
        }
    }

    @Override // defpackage.InterfaceC9710l
    public final void isPro(int i) {
        C17417l c17417l = (C17417l) this.f29351l.f833l;
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4442l();
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.yandex("Service connection suspended");
        C17923l c17923l2 = c17417l.f33929l;
        C17417l.admob(c17923l2);
        c17923l2.m4449l(new RunnableC10799l(10, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C17923l c17923l = ((C17417l) this.f29351l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4442l();
        synchronized (this) {
            int i = 0;
            if (iBinder == null) {
                this.f29353l = false;
                C8118l c8118l = ((C17417l) this.f29351l.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16908l.yandex("Service connected with null binder");
                return;
            }
            InterfaceC5496l c9574l = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c9574l = iInterfaceQueryLocalInterface instanceof InterfaceC5496l ? (InterfaceC5496l) iInterfaceQueryLocalInterface : new C9574l(iBinder);
                    C8118l c8118l2 = ((C17417l) this.f29351l.f833l).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.yandex("Bound to IMeasurementService interface");
                } else {
                    C8118l c8118l3 = ((C17417l) this.f29351l.f833l).f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.loadAd(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                C8118l c8118l4 = ((C17417l) this.f29351l.f833l).f33950l;
                C17417l.admob(c8118l4);
                c8118l4.f16908l.yandex("Service connect failed to get IMeasurementService");
            }
            if (c9574l == null) {
                this.f29353l = false;
                try {
                    C8394l c8394lLoadAd = C8394l.loadAd();
                    C11860l c11860l = this.f29351l;
                    c8394lLoadAd.crashlytics(((C17417l) c11860l.f833l).f33936l, c11860l.f23691l);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C17923l c17923l2 = ((C17417l) this.f29351l.f833l).f33929l;
                C17417l.admob(c17923l2);
                c17923l2.m4449l(new RunnableC13263l(this, c9574l, i));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C17417l c17417l = (C17417l) this.f29351l.f833l;
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4442l();
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.yandex("Service disconnected");
        C17923l c17923l2 = c17417l.f33929l;
        C17417l.admob(c17923l2);
        c17923l2.m4449l(new RunnableC16301l(this, componentName, 17));
    }

    public final void yandex() throws Throwable {
        ServiceConnectionC14909l serviceConnectionC14909l;
        C11860l c11860l = this.f29351l;
        c11860l.mo211l();
        Context context = ((C17417l) c11860l.f833l).f33936l;
        synchronized (this) {
            try {
                try {
                    if (this.f29353l) {
                        C8118l c8118l = ((C17417l) this.f29351l.f833l).f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16911l.yandex("Connection attempt already in progress");
                        return;
                    }
                    if (this.f29352l != null && (this.f29352l.tapsense() || this.f29352l.subscription())) {
                        C8118l c8118l2 = ((C17417l) this.f29351l.f833l).f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16911l.yandex("Already awaiting connection attempt");
                        return;
                    }
                    try {
                        try {
                            serviceConnectionC14909l = this;
                            try {
                                serviceConnectionC14909l.f29352l = new C0594l(context, Looper.getMainLooper(), C13304l.yandex(context), C13268l.loadAd, 93, serviceConnectionC14909l, this, null);
                                try {
                                    C8118l c8118l3 = ((C17417l) serviceConnectionC14909l.f29351l.f833l).f33950l;
                                    C17417l.admob(c8118l3);
                                    c8118l3.f16911l.yandex("Connecting to remote service");
                                    serviceConnectionC14909l.f29353l = true;
                                    AbstractC1051l.subs(serviceConnectionC14909l.f29352l);
                                    serviceConnectionC14909l.f29352l.amazon();
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            serviceConnectionC14909l = this;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        serviceConnectionC14909l = this;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    serviceConnectionC14909l = this;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }
}
