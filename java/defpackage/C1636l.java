package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lؓؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1636l extends AbstractC11653l {
    public final Messenger admob;
    public final String billing;
    public final Handler firebase;
    public C13187l metrica;
    public final MediaRouter2.RoutingController mopub;
    public final Messenger subs;
    public final SparseArray isPro = new SparseArray();
    public final AtomicInteger smaato = new AtomicInteger(1);
    public final RunnableC11297l remoteconfig = new RunnableC11297l(19, this);
    public int vip = -1;

    public C1636l(MediaRouter2.RoutingController routingController, String str) {
        this.mopub = routingController;
        this.billing = str;
        Messenger messengerAdmob = C3288l.admob(routingController);
        this.admob = messengerAdmob;
        this.subs = messengerAdmob == null ? null : new Messenger(new HandlerC8616l(this));
        this.firebase = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.AbstractC16531l
    public final void amazon() {
        this.mopub.release();
    }

    @Override // defpackage.AbstractC16531l
    public final void billing(int i) {
        MediaRouter2.RoutingController routingController = this.mopub;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.vip = i;
        Handler handler = this.firebase;
        RunnableC11297l runnableC11297l = this.remoteconfig;
        handler.removeCallbacks(runnableC11297l);
        handler.postDelayed(runnableC11297l, 1000L);
    }

    public final String firebase() {
        C13187l c13187l = this.metrica;
        return c13187l != null ? c13187l.amazon() : this.mopub.getId();
    }

    public final void remoteconfig(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.mopub;
        if (routingController == null || routingController.isReleased() || (messenger = this.admob) == null) {
            return;
        }
        int andIncrement = this.smaato.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.subs;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    public final void smaato(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.mopub;
        if (routingController == null || routingController.isReleased() || (messenger = this.admob) == null) {
            return;
        }
        int andIncrement = this.smaato.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.subs;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    @Override // defpackage.AbstractC16531l
    public final void subs(int i) {
        MediaRouter2.RoutingController routingController = this.mopub;
        if (routingController == null) {
            return;
        }
        int volume = this.vip;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.mopub.getVolumeMax()));
        this.vip = iMax;
        this.mopub.setVolume(iMax);
        Handler handler = this.firebase;
        RunnableC11297l runnableC11297l = this.remoteconfig;
        handler.removeCallbacks(runnableC11297l);
        handler.postDelayed(runnableC11297l, 1000L);
    }
}
