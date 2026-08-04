package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖؔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16161l {
    public static final int admob;
    public static final byte[] isPro;
    public static final C13975l mopub;
    public static final byte[] subs;
    public boolean amazon;
    public C11534l billing;
    public int crashlytics;
    public boolean loadAd;
    public int purchase;
    public boolean yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        mopub = new C13975l(4);
        admob = Math.max(Math.max(Math.max(Math.max(4, 4), 4), 4), 9);
        subs = new byte[]{88, 105, 110, 103};
        isPro = new byte[]{73, 110, 102, 111};
    }

    public static C16161l loadAd(C0869l c0869l) {
        C13975l c13975l;
        int i;
        C16161l c16161l = new C16161l();
        c16161l.yandex = false;
        c16161l.loadAd = false;
        c16161l.crashlytics = -1;
        c16161l.amazon = false;
        c16161l.purchase = -1;
        int i2 = admob;
        byte[] bArr = new byte[i2];
        c0869l.read(bArr, 0, 4);
        byte[] bArr2 = subs;
        int length = bArr2.length;
        if (length > i2 || length > bArr2.length) {
            StringBuilder sbSignature = AbstractC2812l.Signature("a:", i2, " b:");
            sbSignature.append(bArr2.length);
            sbSignature.append(" length:");
            sbSignature.append(length);
            throw new ArrayIndexOutOfBoundsException(sbSignature.toString());
        }
        int i3 = 0;
        while (true) {
            c13975l = mopub;
            if (i3 >= length) {
                EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
                c13975l.getClass();
                int i4 = C17500l.yandex;
                c16161l.yandex = true;
                break;
            }
            if (bArr[i3] != bArr2[i3]) {
                break;
            }
            i3++;
        }
        Arrays.fill(bArr, (byte) 0);
        c0869l.read(bArr, 0, 4);
        byte b = bArr[3];
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        if (z) {
            c16161l.crashlytics = c0869l.readInt();
            c16161l.loadAd = true;
            i = 12;
        } else {
            i = 8;
        }
        if (z2) {
            c16161l.purchase = c0869l.readInt();
            c16161l.amazon = true;
            i += 4;
        }
        if (c0869l.f2526l >= 156) {
            try {
                c0869l.skip(120 - i);
                c16161l.billing = C11534l.loadAd(c0869l, bArr);
                return c16161l;
            } catch (EOFException unused) {
                EnumC8711l[] enumC8711lArr2 = EnumC8711l.f17925l;
                c13975l.getClass();
                int i5 = C17500l.yandex;
            }
        }
        return c16161l;
    }

    public static C0869l yandex(C0869l c0869l, C16468l c16468l) {
        int i = c16468l.loadAd;
        int i2 = c16468l.mopub;
        if (i == 3) {
            if (i2 == 3) {
                c0869l.skip(21L);
            } else {
                c0869l.skip(36L);
            }
        } else if (i2 == 3) {
            c0869l.skip(13L);
        } else {
            c0869l.skip(21L);
        }
        byte[] bArr = new byte[4];
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i3] = c0869l.ads(i3);
        }
        if (!Arrays.equals(bArr, subs) && !Arrays.equals(bArr, isPro)) {
            return null;
        }
        EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
        mopub.getClass();
        int i4 = C17500l.yandex;
        return c0869l;
    }

    public final String toString() {
        return "xingheader vbr:" + this.yandex + " frameCountEnabled:" + this.loadAd + " frameCount:" + this.crashlytics + " audioSizeEnabled:" + this.amazon + " audioFileSize:" + this.purchase;
    }
}
