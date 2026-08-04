package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: lٕٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC14290l implements ServiceConnection {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C12158l f27969l;

    public ServiceConnectionC14290l(C12158l c12158l) {
        this.f27969l = c12158l;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC3669l interfaceC3669l;
        int i = BinderC4934l.billing;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC3669l.loadAd);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3669l)) {
            C14395l c14395l = new C14395l();
            c14395l.purchase = iBinder;
            interfaceC3669l = c14395l;
        } else {
            interfaceC3669l = (InterfaceC3669l) iInterfaceQueryLocalInterface;
        }
        C12158l c12158l = this.f27969l;
        c12158l.admob = interfaceC3669l;
        try {
            c12158l.loadAd = interfaceC3669l.appmetrica((BinderC16987l) c12158l.firebase, (String) c12158l.crashlytics);
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f27969l.admob = null;
    }
}
