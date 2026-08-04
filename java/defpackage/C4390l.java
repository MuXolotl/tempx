package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: renamed from: lؖۛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4390l {
    public C6749l amazon;
    public final Handler crashlytics;
    public final C3316l loadAd;
    public final AudioTrack yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.AudioRouting$OnRoutingChangedListener, lؙۛۗ] */
    public C4390l(AudioTrack audioTrack, C3316l c3316l) {
        this.yandex = audioTrack;
        this.loadAd = c3316l;
        Handler handlerAds = AbstractC15323l.ads(null);
        this.crashlytics = handlerAds;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() { // from class: lؙۛۗ
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C4390l c4390l = this.yandex;
                if (c4390l.amazon == null) {
                    return;
                }
                AbstractC2991l.firebase().execute(new RunnableC7762l(c4390l, audioRouting, 9));
            }
        };
        this.amazon = r0;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, handlerAds);
    }

    public static void loadAd(C4390l c4390l) {
        AudioTrack audioTrack = c4390l.yandex;
        C6749l c6749l = c4390l.amazon;
        c6749l.getClass();
        audioTrack.removeOnRoutingChangedListener(c6749l);
        c4390l.amazon = null;
    }

    public static /* synthetic */ void yandex(C4390l c4390l, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            c4390l.crashlytics.post(new RunnableC7762l(c4390l, routedDevice, 10));
        }
    }
}
