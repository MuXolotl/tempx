package androidx.media;

import defpackage.AbstractC5223l;
import defpackage.InterfaceC12713l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC5223l abstractC5223l) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC12713l interfaceC12713lAdmob = audioAttributesCompat.yandex;
        if (abstractC5223l.purchase(1)) {
            interfaceC12713lAdmob = abstractC5223l.admob();
        }
        audioAttributesCompat.yandex = (AudioAttributesImpl) interfaceC12713lAdmob;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC5223l abstractC5223l) {
        abstractC5223l.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.yandex;
        abstractC5223l.subs(1);
        abstractC5223l.smaato(audioAttributesImpl);
    }
}
