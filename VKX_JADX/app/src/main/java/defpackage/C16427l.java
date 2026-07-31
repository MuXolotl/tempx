package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: renamed from: lَٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16427l extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ C2815l yandex;

    public C16427l(C2815l c2815l) {
        this.yandex = c2815l;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.yandex.crashlytics.isPro.mopub(-1, new C8339l(19));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.yandex.crashlytics.isPro.mopub(-1, new C8339l(20));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.yandex.crashlytics.isPro.mopub(-1, new C8339l(19));
    }
}
