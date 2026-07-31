package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5361l {
    public static final byte[] billing = {0, 0, 1};
    public int amazon;
    public int crashlytics;
    public int loadAd;
    public byte[] purchase;
    public boolean yandex;

    public final void yandex(int i, int i2, byte[] bArr) {
        if (this.yandex) {
            int i3 = i2 - i;
            byte[] bArr2 = this.purchase;
            int length = bArr2.length;
            int i4 = this.crashlytics + i3;
            if (length < i4) {
                this.purchase = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.purchase, this.crashlytics, i3);
            this.crashlytics += i3;
        }
    }
}
