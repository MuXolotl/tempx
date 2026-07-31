package androidx.media;

import android.media.AudioAttributes;
import defpackage.AbstractC5223l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC5223l abstractC5223l) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.yandex = (AudioAttributes) abstractC5223l.mopub(audioAttributesImplApi26.yandex, 1);
        audioAttributesImplApi26.loadAd = abstractC5223l.billing(audioAttributesImplApi26.loadAd, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        abstractC5223l.firebase(audioAttributesImplApi26.yandex, 1);
        abstractC5223l.isPro(audioAttributesImplApi26.loadAd, 2);
    }
}
