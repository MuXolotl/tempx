package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؕۢ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3720l extends AbstractC4829l {
    public final /* synthetic */ C16774l amazon;
    public final /* synthetic */ C5807l crashlytics;
    public final /* synthetic */ AtomicBoolean loadAd;
    public boolean yandex = true;

    public C3720l(AtomicBoolean atomicBoolean, C5807l c5807l, C16774l c16774l) {
        this.loadAd = atomicBoolean;
        this.crashlytics = c5807l;
        this.amazon = c16774l;
    }

    @Override // defpackage.AbstractC4829l
    public final void loadAd(int i, InterfaceC7299l interfaceC7299l) {
        Object obj;
        if (this.yandex) {
            this.yandex = false;
            AbstractC5088l.yandex("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC7299l.crashlytics() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
        }
        AtomicBoolean atomicBoolean = this.loadAd;
        if (atomicBoolean.get() || (obj = interfaceC7299l.yandex().yandex.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        C5807l c5807l = this.crashlytics;
        if (iIntValue == c5807l.hashCode() && c5807l.loadAd(null) && !atomicBoolean.getAndSet(true)) {
            AbstractC12272l.admob().execute(new RunnableC10311l(this, this.amazon, 21));
        }
    }
}
