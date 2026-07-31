package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: lَۧۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C10730l {
    public final C5057l purchase;
    public final MediaController yandex;
    public final Object loadAd = new Object();
    public final ArrayList crashlytics = new ArrayList();
    public final HashMap amazon = new HashMap();

    public C10730l(Context context, C5057l c5057l) {
        this.purchase = c5057l;
        MediaController mediaController = new MediaController(context, c5057l.f10328l);
        this.yandex = mediaController;
        if (c5057l.yandex() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC6229l(this));
        }
    }

    public final void crashlytics(C17977l c17977l) {
        MediaController mediaController = this.yandex;
        C2516l c2516l = c17977l.yandex;
        c2516l.getClass();
        mediaController.unregisterCallback(c2516l);
        synchronized (this.loadAd) {
            InterfaceC10867l interfaceC10867lYandex = this.purchase.yandex();
            if (interfaceC10867lYandex != null) {
                BinderC18564l binderC18564l = (BinderC18564l) this.amazon.remove(c17977l);
                if (binderC18564l != null) {
                    c17977l.crashlytics = null;
                    if (interfaceC10867lYandex.asBinder().isBinderAlive()) {
                        try {
                            interfaceC10867lYandex.mo1135finally(binderC18564l);
                        } catch (RemoteException | SecurityException e) {
                            AbstractC6427l.metrica("MediaControllerCompat", "Dead object in unregisterCallbackListener.", e);
                        }
                    }
                }
            } else {
                this.crashlytics.remove(c17977l);
            }
        }
    }

    public final void loadAd() {
        InterfaceC10867l interfaceC10867lYandex = this.purchase.yandex();
        if (interfaceC10867lYandex == null) {
            return;
        }
        ArrayList<C17977l> arrayList = this.crashlytics;
        for (C17977l c17977l : arrayList) {
            BinderC18564l binderC18564l = new BinderC18564l(c17977l);
            this.amazon.put(c17977l, binderC18564l);
            c17977l.crashlytics = binderC18564l;
            try {
                interfaceC10867lYandex.mo1136l(binderC18564l);
                c17977l.crashlytics(13, null);
            } catch (RemoteException | SecurityException e) {
                AbstractC6427l.subs("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }

    public final C13052l yandex() {
        MediaController.PlaybackInfo playbackInfo = this.yandex.getPlaybackInfo();
        if (playbackInfo != null) {
            return new C13052l(playbackInfo.getPlaybackType(), C13736l.loadAd(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null);
        }
        return null;
    }
}
