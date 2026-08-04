package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: lؗؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4643l {
    public static final byte[] purchase = {0, 0, 1};
    public Serializable amazon;
    public boolean crashlytics;
    public int loadAd;
    public int yandex;

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void loadAd(int i, int i2, byte[] bArr) {
        if (this.crashlytics) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.amazon;
            int length = bArr2.length;
            int i4 = this.yandex + i3;
            if (length < i4) {
                this.amazon = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.amazon, this.yandex, i3);
            this.yandex += i3;
        }
    }

    public Size yandex(InterfaceC4089l interfaceC4089l) {
        int iMo1483finally = interfaceC4089l.mo1483finally(0);
        Size sizeMo1487volatile = interfaceC4089l.mo1487volatile();
        int i = this.loadAd;
        int i2 = this.yandex;
        if (sizeMo1487volatile != null) {
            int iLoadAd = AbstractC7799l.loadAd(AbstractC7799l.purchase(iMo1483finally), i2, 1 == i);
            if (iLoadAd == 90 || iLoadAd == 270) {
                return new Size(sizeMo1487volatile.getHeight(), sizeMo1487volatile.getWidth());
            }
        }
        return sizeMo1487volatile;
    }
}
