package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lُؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC10981l implements ServiceConnection {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4620l f22126l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f22127l;

    public ServiceConnectionC10981l(AbstractC4620l abstractC4620l, int i) {
        this.f22126l = abstractC4620l;
        this.f22127l = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC4620l abstractC4620l = this.f22126l;
        if (iBinder == null) {
            abstractC4620l.premium();
            return;
        }
        synchronized (abstractC4620l.subs) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC4620l.isPro = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C14110l)) ? new C14110l(iBinder) : (C14110l) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC4620l abstractC4620l2 = this.f22126l;
        int i = this.f22127l;
        abstractC4620l2.getClass();
        C2870l c2870l = new C2870l(abstractC4620l2, 0, null);
        HandlerC0911l handlerC0911l = abstractC4620l2.mopub;
        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(7, i, -1, c2870l));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4620l abstractC4620l = this.f22126l;
        synchronized (abstractC4620l.subs) {
            abstractC4620l.isPro = null;
        }
        AbstractC4620l abstractC4620l2 = this.f22126l;
        int i = this.f22127l;
        HandlerC0911l handlerC0911l = abstractC4620l2.mopub;
        handlerC0911l.sendMessage(handlerC0911l.obtainMessage(6, i, 1));
    }
}
