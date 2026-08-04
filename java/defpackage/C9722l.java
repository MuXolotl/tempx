package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: lٍٞۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9722l implements AudioManager.OnAudioFocusChangeListener {
    public final AudioManager.OnAudioFocusChangeListener loadAd;
    public final Handler yandex;

    public C9722l(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.loadAd = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = AbstractC15323l.yandex;
        this.yandex = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AbstractC15323l.m3966final(this.yandex, new RunnableC9534l(this, i, 1));
    }
}
