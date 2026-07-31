package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: renamed from: lُٖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerVsyncCallbackC16680l extends AbstractC16097l implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Handler f32702l;

    public ChoreographerVsyncCallbackC16680l(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f32702l = AbstractC15323l.ads(null);
    }

    @Override // defpackage.AbstractC16097l
    public final void loadAd() {
        this.f31553l.unregisterDisplayListener(this);
        this.f32702l.removeCallbacksAndMessages(null);
        this.f31554l.removeVsyncCallback(this);
        this.f31552l = -9223372036854775807L;
        this.f31555l = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.f31554l.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f31552l = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f31555l = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f31555l = -9223372036854775807L;
        }
        this.f32702l.postDelayed(new RunnableC6665l(17, this), 500L);
    }

    @Override // defpackage.AbstractC16097l
    public final void yandex() {
        this.f31553l.registerDisplayListener(this, AbstractC15323l.ads(null));
        this.f31554l.postVsyncCallback(this);
    }
}
