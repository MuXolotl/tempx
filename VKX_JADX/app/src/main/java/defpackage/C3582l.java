package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: renamed from: lؕۘٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3582l {
    public final C3275l amazon;
    public final Handler crashlytics;
    public final boolean loadAd;
    public final Spatializer yandex;

    public C3582l(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerVip = context == null ? null : AbstractC13950l.vip(context);
        if (audioManagerVip == null || (bool != null && bool.booleanValue())) {
            this.yandex = null;
            this.loadAd = false;
            this.crashlytics = null;
            this.amazon = null;
            return;
        }
        Spatializer spatializer = audioManagerVip.getSpatializer();
        this.yandex = spatializer;
        this.loadAd = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.crashlytics = handler;
        C3275l c3275l = new C3275l(runnable);
        this.amazon = c3275l;
        spatializer.addOnSpatializerStateChangedListener(new ExecutorC10366l(handler, 0), c3275l);
    }

    public final boolean amazon() {
        Spatializer spatializer = this.yandex;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean crashlytics() {
        Spatializer spatializer = this.yandex;
        return spatializer != null && spatializer.isAvailable();
    }

    public final List loadAd() {
        if (this.yandex == null || !this.loadAd || !crashlytics() || !amazon()) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return AbstractC1186l.isVip(252);
        }
        Spatializer spatializer = this.yandex;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final void purchase() {
        C3275l c3275l;
        Handler handler;
        Spatializer spatializer = this.yandex;
        if (spatializer == null || (c3275l = this.amazon) == null || (handler = this.crashlytics) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(c3275l);
        handler.removeCallbacksAndMessages(null);
    }

    public final boolean yandex(C13736l c13736l, C5978l c5978l) {
        if (this.yandex == null || !this.loadAd || !crashlytics() || !amazon()) {
            return false;
        }
        String str = c5978l.metrica;
        int i = c5978l.f12619package;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int iSignature = AbstractC15323l.Signature(i);
        if (iSignature == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iSignature);
        int i2 = c5978l.f12622synchronized;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.yandex;
        spatializer.getClass();
        return spatializer.canBeSpatialized(c13736l.crashlytics(), channelMask.build());
    }
}
