package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: renamed from: lًؘْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7815l implements IBinder.DeathRecipient {
    public int billing;
    public final Messenger crashlytics;
    public final HandlerC2628l loadAd;
    public int mopub;
    public final /* synthetic */ ServiceConnectionC2783l subs;
    public final Messenger yandex;
    public int amazon = 1;
    public int purchase = 1;
    public final SparseArray admob = new SparseArray();

    public C7815l(ServiceConnectionC2783l serviceConnectionC2783l, Messenger messenger) {
        this.subs = serviceConnectionC2783l;
        this.yandex = messenger;
        HandlerC2628l handlerC2628l = new HandlerC2628l(this);
        this.loadAd = handlerC2628l;
        this.crashlytics = new Messenger(handlerC2628l);
    }

    public final void amazon(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.amazon;
        this.amazon = i3 + 1;
        loadAd(8, i3, i, null, bundle);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.subs.f6076l.post(new RunnableC8756l(this, 1));
    }

    public final void crashlytics(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.amazon;
        this.amazon = i3 + 1;
        loadAd(7, i3, i, null, bundle);
    }

    public final boolean loadAd(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.crashlytics;
        try {
            this.yandex.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }

    public final void yandex(int i) {
        int i2 = this.amazon;
        this.amazon = i2 + 1;
        loadAd(5, i2, i, null, null);
    }
}
