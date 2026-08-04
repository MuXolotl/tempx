package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lْ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13442l {
    public static final byte[] amazon;
    public static final C13975l crashlytics;
    public int loadAd;
    public int yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        crashlytics = new C13975l(4);
        amazon = new byte[]{86, 66, 82, 73};
    }

    public static C13442l loadAd(C0869l c0869l) {
        C13442l c13442l = new C13442l();
        c13442l.yandex = -1;
        c13442l.loadAd = -1;
        c0869l.skip(10L);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = c0869l.readByte();
        }
        c13442l.loadAd = (bArr[3] & 255) | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280);
        byte[] bArr2 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr2[i2] = c0869l.readByte();
        }
        c13442l.yandex = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        return c13442l;
    }

    public static C0869l yandex(C0869l c0869l) {
        c0869l.skip(36L);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = c0869l.ads(i);
        }
        if (!Arrays.equals(bArr, amazon)) {
            return null;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        crashlytics.getClass();
        int i2 = C17500l.yandex;
        return c0869l;
    }

    public final String toString() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.license("vbr", String.valueOf(true));
        c18449lBilling.subscription(this.yandex, "frameCount");
        c18449lBilling.subscription(this.loadAd, "audioSize");
        return c18449lBilling.toString();
    }
}
