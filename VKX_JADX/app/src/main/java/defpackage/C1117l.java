package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: lؒ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1117l extends BroadcastReceiver {
    public final /* synthetic */ C11919l crashlytics;
    public final C14500l loadAd;
    public final SurfaceHolderCallbackC18330l yandex;

    public C1117l(C11919l c11919l, C14500l c14500l, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l) {
        this.crashlytics = c11919l;
        this.loadAd = c14500l;
        this.yandex = surfaceHolderCallbackC18330l;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.loadAd.amazon(new RunnableC16112l(6, this));
        }
    }
}
