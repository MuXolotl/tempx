package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12335l extends AbstractC16800l {
    public final byte[] loadAd;

    public C12335l(String str, byte[] bArr) {
        super(str);
        this.loadAd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12335l.class != obj.getClass()) {
            return false;
        }
        C12335l c12335l = (C12335l) obj;
        return this.yandex.equals(c12335l.yandex) && Arrays.equals(this.loadAd, c12335l.loadAd);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.loadAd) + AbstractC12589l.advert(527, 31, this.yandex);
    }
}
