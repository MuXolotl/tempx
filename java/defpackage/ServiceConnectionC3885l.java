package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* JADX INFO: renamed from: lؖؔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC3885l implements ServiceConnection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11262l f8025l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f8026l;

    public ServiceConnectionC3885l(C11262l c11262l, String str) {
        Objects.requireNonNull(c11262l);
        this.f8025l = c11262l;
        this.f8026l = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C11262l c11262l = this.f8025l;
        if (iBinder == null) {
            C8118l c8118l = ((C17417l) c11262l.f22693l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC13192l.purchase;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC6486l c11508l = iInterfaceQueryLocalInterface instanceof InterfaceC6486l ? (InterfaceC6486l) iInterfaceQueryLocalInterface : new C11508l(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 5);
            C17417l c17417l = (C17417l) c11262l.f22693l;
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16911l.yandex("Install Referrer Service connected");
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC16301l(this, c11508l, this));
        } catch (RuntimeException e) {
            C8118l c8118l3 = ((C17417l) c11262l.f22693l).f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16910l.loadAd(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C8118l c8118l = ((C17417l) this.f8025l.f22693l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16911l.yandex("Install Referrer Service disconnected");
    }
}
