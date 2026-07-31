package androidx.media;

import android.media.AudioAttributes;
import defpackage.AbstractC5223l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC5223l abstractC5223l) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.yandex = (AudioAttributes) abstractC5223l.mopub(audioAttributesImplApi21.yandex, 1);
        audioAttributesImplApi21.loadAd = abstractC5223l.billing(audioAttributesImplApi21.loadAd, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        abstractC5223l.firebase(audioAttributesImplApi21.yandex, 1);
        abstractC5223l.isPro(audioAttributesImplApi21.loadAd, 2);
    }
}
