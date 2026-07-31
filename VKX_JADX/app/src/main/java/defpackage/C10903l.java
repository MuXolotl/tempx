package defpackage;

import android.media.MediaCodec;

/* JADX INFO: renamed from: lًُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10903l {
    public final MediaCodec.CryptoInfo.Pattern loadAd = AbstractC14238l.crashlytics();
    public final MediaCodec.CryptoInfo yandex;

    public C10903l(MediaCodec.CryptoInfo cryptoInfo) {
        this.yandex = cryptoInfo;
    }

    public static void yandex(C10903l c10903l, int i, int i2) {
        c10903l.loadAd.set(i, i2);
        c10903l.yandex.setPattern(c10903l.loadAd);
    }
}
