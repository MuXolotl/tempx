package defpackage;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.lang.reflect.Array;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؕؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3206l {
    public static final C10557l yandex = new C10557l(28);
    public static final C12513l loadAd = new C12513l((byte) 0, 10);

    public static byte[] admob(short[][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        byte[] bArr = new byte[length * length2];
        for (int i = 0; i < length2; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                bArr[(i * length) + i2] = (byte) sArr[i2][i];
            }
        }
        return bArr;
    }

    public static final C16124l amazon(InterfaceC6942l interfaceC6942l, Function1 function1, Function2 function2) {
        if (interfaceC6942l instanceof C16124l) {
            C16124l c16124l = (C16124l) interfaceC6942l;
            if (c16124l.f31577l == function1 && c16124l.f31576l == function2) {
                return c16124l;
            }
        }
        return new C16124l(interfaceC6942l, function1, function2);
    }

    public static short[][][] billing(C2875l c2875l, int i, int i2, int i3, boolean z) {
        byte[] bArr = new byte[z ? (((i2 + 1) * i2) / 2) * i : i * i2 * i3];
        c2875l.nextBytes(bArr);
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, i, i2, i3);
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    if (!z || i5 <= i6) {
                        sArr[i7][i5][i6] = (short) (bArr[i4] & 255);
                        i4++;
                    }
                }
            }
        }
        return sArr;
    }

    public static short[][][] crashlytics(short[][][] sArr) {
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) short[].class, sArr.length, sArr[0].length);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                sArr2[i][i2] = AbstractC14024l.billing(sArr[i][i2]);
            }
        }
        return sArr2;
    }

    public static int firebase(short[][] sArr, byte[] bArr, int i) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                sArr[i3][i2] = (short) (bArr[(i2 * length) + i + i3] & 255);
            }
        }
        return length * length2;
    }

    public static boolean isPro(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= '0' && c <= '9';
        }
        return true;
    }

    public static short[][] loadAd(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = AbstractC14024l.billing(sArr[i]);
        }
        return sArr2;
    }

    public static short[][] mopub(C2875l c2875l, int i, int i2) {
        byte[] bArr = new byte[i * i2];
        c2875l.nextBytes(bArr);
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sArr[i4][i3] = (short) (bArr[(i3 * i) + i4] & 255);
            }
        }
        return sArr;
    }

    public static InterfaceC13662l purchase(InterfaceC13662l interfaceC13662l, Size size) {
        if (!(interfaceC13662l instanceof C8685l)) {
            if (AbstractC1469l.yandex.loadAd(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                interfaceC13662l = new C8685l(interfaceC13662l);
            } else if (size != null && !interfaceC13662l.inmobi(size.getWidth(), size.getHeight())) {
                AbstractC5088l.tapsense("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + interfaceC13662l.mo1975l() + '/' + interfaceC13662l.mo1972l());
                interfaceC13662l = new C8685l(interfaceC13662l);
            }
        }
        if (size != null && (interfaceC13662l instanceof C8685l)) {
            ((C8685l) interfaceC13662l).f17891l.add(size);
        }
        return interfaceC13662l;
    }

    public static int smaato(short[][][] sArr, byte[] bArr, int i, boolean z) {
        short[][] sArr2 = sArr[0];
        int length = sArr2.length;
        int length2 = sArr2[0].length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            for (int i4 = 0; i4 < length2; i4++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i3 <= i4) {
                        sArr3[i3][i4] = (short) (bArr[i2 + i] & 255);
                        i2++;
                    }
                }
            }
        }
        return i2;
    }

    public static byte[] subs(short[][][] sArr, boolean z) {
        int length = sArr.length;
        short[][] sArr2 = sArr[0];
        int length2 = sArr2.length;
        int length3 = sArr2[0].length;
        byte[] bArr = new byte[z ? (((length2 + 1) * length2) / 2) * length : length * length2 * length3];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length3; i3++) {
                for (short[][] sArr3 : sArr) {
                    if (!z || i2 <= i3) {
                        bArr[i] = (byte) sArr3[i2][i3];
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    public static final int yandex(int i, C17893l c17893l) {
        int i2 = c17893l.f34846l - 1;
        int i3 = 0;
        while (i3 < i2) {
            int iRemoteconfig = AbstractC5020l.remoteconfig(i2, i3, 2, i3);
            Object[] objArr = c17893l.f34848l;
            int i4 = ((C2443l) objArr[iRemoteconfig]).yandex;
            if (i4 != i) {
                if (i4 < i) {
                    i3 = iRemoteconfig + 1;
                    if (i < ((C2443l) objArr[i3]).yandex) {
                    }
                } else {
                    i2 = iRemoteconfig - 1;
                }
            }
            return iRemoteconfig;
        }
        return i3;
    }
}
