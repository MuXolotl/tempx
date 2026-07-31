package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import j$.util.Objects;

/* JADX INFO: renamed from: lَؓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1750l {
    public final C13736l amazon;
    public final Object billing;
    public final Handler crashlytics;
    public final AudioManager.OnAudioFocusChangeListener loadAd;
    public final boolean purchase;
    public final int yandex;

    public C1750l(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C13736l c13736l, boolean z, boolean z2) {
        this.yandex = i;
        this.crashlytics = handler;
        this.amazon = c13736l;
        this.purchase = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.loadAd = new C9722l(onAudioFocusChangeListener, handler);
        } else {
            this.loadAd = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.billing = new AudioFocusRequest.Builder(i).setAudioAttributes(c13736l.crashlytics()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.billing = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1750l)) {
            return false;
        }
        C1750l c1750l = (C1750l) obj;
        return this.yandex == c1750l.yandex && this.purchase == c1750l.purchase && Objects.equals(this.loadAd, c1750l.loadAd) && Objects.equals(this.crashlytics, c1750l.crashlytics) && Objects.equals(this.amazon, c1750l.amazon);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.yandex), this.loadAd, this.crashlytics, this.amazon, Boolean.valueOf(this.purchase));
    }
}
