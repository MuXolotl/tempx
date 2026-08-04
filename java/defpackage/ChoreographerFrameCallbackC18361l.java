package defpackage;

import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: renamed from: lً٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC18361l extends AbstractC16097l implements Choreographer.FrameCallback {
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f31552l = j;
        this.f31554l.postFrameCallbackDelayed(this, 500L);
    }

    @Override // defpackage.AbstractC16097l
    public final void loadAd() {
        this.f31553l.unregisterDisplayListener(this);
        this.f31554l.removeFrameCallback(this);
        this.f31552l = -9223372036854775807L;
        this.f31555l = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long refreshRate;
        if (i == 0) {
            this.f31554l.postFrameCallback(this);
            Display display = this.f31553l.getDisplay(0);
            if (display != null) {
                refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            } else {
                AbstractC6427l.vip("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                refreshRate = -9223372036854775807L;
            }
            this.f31555l = refreshRate;
        }
    }

    @Override // defpackage.AbstractC16097l
    public final void yandex() {
        long refreshRate;
        this.f31553l.registerDisplayListener(this, AbstractC15323l.ads(null));
        this.f31554l.postFrameCallback(this);
        Display display = this.f31553l.getDisplay(0);
        if (display != null) {
            refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
        } else {
            AbstractC6427l.vip("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            refreshRate = -9223372036854775807L;
        }
        this.f31555l = refreshRate;
    }
}
