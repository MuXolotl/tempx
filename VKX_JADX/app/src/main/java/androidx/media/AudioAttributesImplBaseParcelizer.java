package androidx.media;

import defpackage.AbstractC5223l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC5223l abstractC5223l) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.yandex = 0;
        audioAttributesImplBase.loadAd = 0;
        audioAttributesImplBase.crashlytics = 0;
        audioAttributesImplBase.amazon = -1;
        audioAttributesImplBase.yandex = abstractC5223l.billing(0, 1);
        audioAttributesImplBase.loadAd = abstractC5223l.billing(audioAttributesImplBase.loadAd, 2);
        audioAttributesImplBase.crashlytics = abstractC5223l.billing(audioAttributesImplBase.crashlytics, 3);
        audioAttributesImplBase.amazon = abstractC5223l.billing(audioAttributesImplBase.amazon, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        abstractC5223l.isPro(audioAttributesImplBase.yandex, 1);
        abstractC5223l.isPro(audioAttributesImplBase.loadAd, 2);
        abstractC5223l.isPro(audioAttributesImplBase.crashlytics, 3);
        abstractC5223l.isPro(audioAttributesImplBase.amazon, 4);
    }
}
