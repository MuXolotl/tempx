package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: renamed from: lَٖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10334l implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ C16957l yandex;

    public C10334l(C16957l c16957l) {
        this.yandex = c16957l;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.yandex.loadAd.getClass();
        return bundle;
    }
}
