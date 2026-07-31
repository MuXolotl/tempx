package defpackage;

import j$.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: renamed from: lٍ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9852l extends AbstractC3302l {
    public final int yandex;

    public C9852l(int i) {
        this.yandex = i;
    }

    public static C9852l loadAd(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new C9852l(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9852l) && ((C9852l) obj).yandex == this.yandex;
    }

    public final int hashCode() {
        return Objects.hash(C9852l.class, Integer.valueOf(this.yandex));
    }

    public final String toString() {
        return AbstractC15560l.tapsense("AesCmac PRF Parameters (", this.yandex, "-byte key)");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return false;
    }
}
