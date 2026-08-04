package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lِۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12281l extends AbstractC11217l {
    public final byte[] loadAd;
    public final byte[] yandex;

    public C12281l(byte[] bArr, byte[] bArr2) {
        this.yandex = bArr;
        this.loadAd = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11217l) {
            AbstractC11217l abstractC11217l = (AbstractC11217l) obj;
            boolean z = abstractC11217l instanceof C12281l;
            C12281l c12281l = (C12281l) abstractC11217l;
            if (Arrays.equals(this.yandex, z ? c12281l.yandex : c12281l.yandex)) {
                C12281l c12281l2 = (C12281l) abstractC11217l;
                if (Arrays.equals(this.loadAd, z ? c12281l2.loadAd : c12281l2.loadAd)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) ^ ((Arrays.hashCode(this.yandex) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.yandex) + ", encryptedBlob=" + Arrays.toString(this.loadAd) + "}";
    }
}
