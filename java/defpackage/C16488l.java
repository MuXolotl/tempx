package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16488l {
    public C16528l amazon;
    public C16528l billing;
    public final C13143l crashlytics;
    public final int loadAd;
    public long mopub;
    public C16528l purchase;
    public final InterfaceC3783l yandex;

    public C16488l(InterfaceC3783l interfaceC3783l) {
        this.yandex = interfaceC3783l;
        int iAdcel = interfaceC3783l.adcel();
        this.loadAd = iAdcel;
        this.crashlytics = new C13143l(32);
        C16528l c16528l = new C16528l(0L, iAdcel);
        this.amazon = c16528l;
        this.purchase = c16528l;
        this.billing = c16528l;
    }

    public static C16528l amazon(C16528l c16528l, long j, byte[] bArr, int i) {
        while (j >= c16528l.f32306l) {
            c16528l = (C16528l) c16528l.f32305l;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (c16528l.f32306l - j));
            C8099l c8099l = (C8099l) c16528l.f32302l;
            System.arraycopy(c8099l.yandex, ((int) (j - c16528l.f32303l)) + c8099l.loadAd, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == c16528l.f32306l) {
                c16528l = (C16528l) c16528l.f32305l;
            }
        }
        return c16528l;
    }

    public static C16528l crashlytics(C16528l c16528l, long j, ByteBuffer byteBuffer, int i) {
        while (j >= c16528l.f32306l) {
            c16528l = (C16528l) c16528l.f32305l;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (c16528l.f32306l - j));
            C8099l c8099l = (C8099l) c16528l.f32302l;
            byteBuffer.put(c8099l.yandex, ((int) (j - c16528l.f32303l)) + c8099l.loadAd, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == c16528l.f32306l) {
                c16528l = (C16528l) c16528l.f32305l;
            }
        }
        return c16528l;
    }

    public static C16528l purchase(C16528l c16528l, C4136l c4136l, C9489l c9489l, C13143l c13143l) {
        if (c4136l.crashlytics(1073741824)) {
            long j = c9489l.loadAd;
            int iM3567synchronized = 1;
            c13143l.m3563native(1);
            C16528l c16528lAmazon = amazon(c16528l, j, c13143l.yandex, 1);
            long j2 = j + 1;
            byte b = c13143l.yandex[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            C4276l c4276l = c4136l.f8499l;
            byte[] bArr = c4276l.yandex;
            if (bArr == null) {
                c4276l.yandex = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c16528l = amazon(c16528lAmazon, j2, c4276l.yandex, i);
            long j3 = j2 + ((long) i);
            if (z) {
                c13143l.m3563native(2);
                c16528l = amazon(c16528l, j3, c13143l.yandex, 2);
                j3 += 2;
                iM3567synchronized = c13143l.m3567synchronized();
            }
            int[] iArr = c4276l.amazon;
            if (iArr == null || iArr.length < iM3567synchronized) {
                iArr = new int[iM3567synchronized];
            }
            int[] iArr2 = c4276l.purchase;
            if (iArr2 == null || iArr2.length < iM3567synchronized) {
                iArr2 = new int[iM3567synchronized];
            }
            if (z) {
                int i2 = iM3567synchronized * 6;
                c13143l.m3563native(i2);
                c16528l = amazon(c16528l, j3, c13143l.yandex, i2);
                j3 += (long) i2;
                c13143l.m3562for(0);
                for (int i3 = 0; i3 < iM3567synchronized; i3++) {
                    iArr[i3] = c13143l.m3567synchronized();
                    iArr2[i3] = c13143l.inmobi();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c9489l.yandex - ((int) (j3 - c9489l.loadAd));
            }
            C0472l c0472l = (C0472l) c9489l.crashlytics;
            String str = AbstractC15323l.yandex;
            byte[] bArr2 = c0472l.loadAd;
            byte[] bArr3 = c4276l.yandex;
            int i4 = c0472l.yandex;
            int i5 = c0472l.crashlytics;
            int i6 = c0472l.amazon;
            c4276l.billing = iM3567synchronized;
            c4276l.amazon = iArr;
            c4276l.purchase = iArr2;
            c4276l.loadAd = bArr2;
            c4276l.yandex = bArr3;
            c4276l.crashlytics = i4;
            c4276l.mopub = i5;
            c4276l.admob = i6;
            MediaCodec.CryptoInfo cryptoInfo = c4276l.subs;
            cryptoInfo.numSubSamples = iM3567synchronized;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            if (Build.VERSION.SDK_INT >= 24) {
                C10903l c10903l = c4276l.isPro;
                c10903l.getClass();
                C10903l.yandex(c10903l, i5, i6);
            }
            long j4 = c9489l.loadAd;
            int i7 = (int) (j3 - j4);
            c9489l.loadAd = j4 + ((long) i7);
            c9489l.yandex -= i7;
        }
        if (!c4136l.crashlytics(268435456)) {
            c4136l.startapp(c9489l.yandex);
            return crashlytics(c16528l, c9489l.loadAd, c4136l.f8498l, c9489l.yandex);
        }
        c13143l.m3563native(4);
        C16528l c16528lAmazon2 = amazon(c16528l, c9489l.loadAd, c13143l.yandex, 4);
        int iInmobi = c13143l.inmobi();
        c9489l.loadAd += 4;
        c9489l.yandex -= 4;
        c4136l.startapp(iInmobi);
        C16528l c16528lCrashlytics = crashlytics(c16528lAmazon2, c9489l.loadAd, c4136l.f8498l, iInmobi);
        c9489l.loadAd += (long) iInmobi;
        int i8 = c9489l.yandex - iInmobi;
        c9489l.yandex = i8;
        ByteBuffer byteBuffer = c4136l.f8497l;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            c4136l.f8497l = ByteBuffer.allocate(i8);
        } else {
            c4136l.f8497l.clear();
        }
        return crashlytics(c16528lCrashlytics, c9489l.loadAd, c4136l.f8497l, c9489l.yandex);
    }

    public final int loadAd(int i) {
        C16528l c16528l = this.billing;
        if (((C8099l) c16528l.f32302l) == null) {
            C8099l c8099lSmaato = this.yandex.smaato();
            C16528l c16528l2 = new C16528l(this.billing.f32306l, this.loadAd);
            c16528l.f32302l = c8099lSmaato;
            c16528l.f32305l = c16528l2;
        }
        return Math.min(i, (int) (this.billing.f32306l - this.mopub));
    }

    public final void yandex(long j) {
        C16528l c16528l;
        if (j == -1) {
            return;
        }
        while (true) {
            c16528l = this.amazon;
            if (j < c16528l.f32306l) {
                break;
            }
            this.yandex.firebase((C8099l) c16528l.f32302l);
            C16528l c16528l2 = this.amazon;
            c16528l2.f32302l = null;
            C16528l c16528l3 = (C16528l) c16528l2.f32305l;
            c16528l2.f32305l = null;
            this.amazon = c16528l3;
        }
        if (this.purchase.f32303l < c16528l.f32303l) {
            this.purchase = c16528l;
        }
    }
}
