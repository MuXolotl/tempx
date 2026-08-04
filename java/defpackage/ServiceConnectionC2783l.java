package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؔٞؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2783l extends AbstractC3621l implements ServiceConnection {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final /* synthetic */ int f6073l = 0;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f6074l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C4568l f6075l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final HandlerC4052l f6076l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f6077l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f6078l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final ComponentName f6079l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final ArrayList f6080l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C7815l f6081l;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public ServiceConnectionC2783l(Context context, ComponentName componentName) {
        super(context, new C5008l(15, componentName));
        this.f6080l = new ArrayList();
        this.f6079l = componentName;
        this.f6076l = new HandlerC4052l();
    }

    public final void admob() {
        if (this.f6074l) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f6079l);
        try {
            this.f6074l = this.f7557l.bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
        } catch (SecurityException unused) {
        }
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC16531l amazon(String str, String str2) {
        if (str == null) {
            C8339l.metrica("routeId cannot be null");
            return null;
        }
        if (str2 != null) {
            return subs(str, str2, C15536l.loadAd);
        }
        C8339l.metrica("routeGroupId cannot be null");
        return null;
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC16531l crashlytics(String str, C15536l c15536l) {
        if (str != null) {
            return subs(str, null, c15536l);
        }
        C8339l.metrica("routeId cannot be null");
        return null;
    }

    public final void firebase() {
        if (this.f6074l) {
            this.f6074l = false;
            isPro();
            try {
                this.f7557l.unbindService(this);
            } catch (IllegalArgumentException e) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e);
            }
        }
    }

    public final void isPro() {
        if (this.f6081l != null) {
            billing(null);
            this.f6077l = false;
            ArrayList arrayList = this.f6080l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC8526l) arrayList.get(i)).crashlytics();
            }
            C7815l c7815l = this.f6081l;
            c7815l.loadAd(2, 0, 0, null, null);
            c7815l.loadAd.loadAd.clear();
            c7815l.yandex.getBinder().unlinkToDeath(c7815l, 0);
            c7815l.subs.f6076l.post(new RunnableC8756l(c7815l, 0));
            this.f6081l = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6074l) {
            isPro();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        C7815l c7815l = new C7815l(this, messenger);
                        int i = c7815l.amazon;
                        c7815l.amazon = i + 1;
                        c7815l.mopub = i;
                        if (c7815l.loadAd(1, i, 4, null, null)) {
                            try {
                                c7815l.yandex.getBinder().linkToDeath(c7815l, 0);
                                this.f6081l = c7815l;
                                return;
                            } catch (RemoteException unused) {
                                c7815l.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        isPro();
    }

    @Override // defpackage.AbstractC3621l
    public final void purchase(C4658l c4658l) {
        if (this.f6077l) {
            C7815l c7815l = this.f6081l;
            int i = c7815l.amazon;
            c7815l.amazon = i + 1;
            c7815l.loadAd(10, i, 0, c4658l != null ? c4658l.yandex : null, null);
        }
        smaato();
    }

    public final void smaato() {
        if (!this.f6078l || (this.f7558l == null && this.f6080l.isEmpty())) {
            firebase();
        } else {
            admob();
        }
    }

    public final C14644l subs(String str, String str2, C15536l c15536l) {
        C4300l c4300l = this.f7554l;
        if (c4300l == null) {
            return null;
        }
        List list = c4300l.loadAd;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C13187l) list.get(i)).amazon().equals(str)) {
                C14644l c14644l = new C14644l(this, str, str2, c15536l);
                this.f6080l.add(c14644l);
                if (this.f6077l) {
                    c14644l.loadAd(this.f6081l);
                }
                smaato();
                return c14644l;
            }
        }
        return null;
    }

    public final String toString() {
        return "Service connection " + this.f6079l.flattenToShortString();
    }

    @Override // defpackage.AbstractC3621l
    public final AbstractC11653l yandex(String str, C15536l c15536l) {
        if (str == null) {
            C8339l.metrica("initialMemberRouteId cannot be null.");
            return null;
        }
        C4300l c4300l = this.f7554l;
        if (c4300l != null) {
            List list = c4300l.loadAd;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C13187l) list.get(i)).amazon().equals(str)) {
                    C5939l c5939l = new C5939l(this, str, c15536l);
                    this.f6080l.add(c5939l);
                    if (this.f6077l) {
                        c5939l.loadAd(this.f6081l);
                    }
                    smaato();
                    return c5939l;
                }
            }
        }
        return null;
    }
}
