package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC18388l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f35900l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35901l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C15053l f35902l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C5008l f35903l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f35904l;

    public RunnableC18388l(C5008l c5008l, C15053l c15053l, int i, String str, int i2, Bundle bundle) {
        this.f35903l = c5008l;
        this.f35902l = c15053l;
        this.f35901l = i;
        this.f35900l = str;
        this.f35904l = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7996l c7996l;
        C15053l c15053l = this.f35902l;
        IBinder binder = ((Messenger) c15053l.f29576l).getBinder();
        C5008l c5008l = this.f35903l;
        ((ServiceC16415l) c5008l.f10245l).f32110l.remove(binder);
        ServiceC16415l serviceC16415l = (ServiceC16415l) c5008l.f10245l;
        Iterator it = serviceC16415l.f32111l.iterator();
        while (true) {
            c7996l = null;
            if (!it.hasNext()) {
                break;
            }
            C7996l c7996l2 = (C7996l) it.next();
            if (c7996l2.crashlytics == this.f35901l) {
                c7996l = (TextUtils.isEmpty(this.f35900l) || this.f35904l <= 0) ? new C7996l(serviceC16415l, c7996l2.yandex, c7996l2.loadAd, c7996l2.crashlytics, c15053l) : null;
                it.remove();
                break;
            }
        }
        if (c7996l == null) {
            c7996l = new C7996l(serviceC16415l, this.f35900l, this.f35904l, this.f35901l, c15053l);
        }
        serviceC16415l.f32110l.put(binder, c7996l);
        try {
            binder.linkToDeath(c7996l, 0);
        } catch (RemoteException unused) {
            AbstractC6427l.vip("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
