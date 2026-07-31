package defpackage;

import android.media.MediaCodec;
import android.os.Build;

/* JADX INFO: renamed from: lّؖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4276l {
    public int admob;
    public int[] amazon;
    public int billing;
    public int crashlytics;
    public final C10903l isPro;
    public byte[] loadAd;
    public int mopub;
    public int[] purchase;
    public final MediaCodec.CryptoInfo subs;
    public byte[] yandex;

    public C4276l() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.subs = cryptoInfo;
        this.isPro = Build.VERSION.SDK_INT >= 24 ? new C10903l(cryptoInfo) : null;
    }
}
