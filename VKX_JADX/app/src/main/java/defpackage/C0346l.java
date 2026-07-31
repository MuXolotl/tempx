package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lٕؑٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0346l {
    public final byte[] yandex;

    public C0346l(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.yandex = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C0346l yandex(byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("data must be non-null");
            return null;
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new C0346l(bArr, length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0346l) {
            return Arrays.equals(((C0346l) obj).yandex, this.yandex);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.yandex);
    }

    public final byte[] loadAd() {
        byte[] bArr = this.yandex;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final String toString() {
        return AbstractC15560l.Signature("Bytes(", AbstractC1315l.amazon(this.yandex), ")");
    }
}
