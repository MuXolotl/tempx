package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَۚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10548l {
    public final SecureRandom yandex;

    public C10548l(SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        this.yandex = secureRandom;
    }

    public final C4249l yandex(C1658l c1658l) {
        byte[] bArr = new byte[32];
        this.yandex.nextBytes(bArr);
        C13409l c13409lCrashlytics = C13409l.crashlytics((C18493l) c1658l.f16541l);
        c13409lCrashlytics.getClass();
        byte[] bArrMopub = AbstractC14024l.mopub(c1658l.f4002l, c1658l.f4003l);
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        int length = bArrMopub.length;
        C4604l c4604l = new C4604l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        c4604l.billing(0, length, bArrMopub);
        c4604l.doFinal(bArr2, 32);
        C4604l c4604l2 = new C4604l(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        c4604l2.billing(0, 64, bArr2);
        c4604l2.doFinal(bArr3, 0);
        byte[] bArrM2246throws = c13409lCrashlytics.yandex.m2246throws(bArrMopub, 0, bArr2, bArr3);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr3, 0, bArr4, 0, 32);
        byte[][] bArr5 = {bArr4, bArrM2246throws};
        return new C4249l(bArr5[0], bArr5[1]);
    }
}
