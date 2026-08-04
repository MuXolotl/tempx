package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: lؘۖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5883l {
    public final /* synthetic */ int yandex;
    public static final C15578l loadAd = new C15578l(-1817223554, false, new C8337l(21));
    public static final C15578l crashlytics = new C15578l(-497599082, false, new C11813l(10));
    public static final C15578l amazon = new C15578l(-201574897, false, new C8337l(22));
    public static final C15578l purchase = new C15578l(-1147660974, false, new C8337l(23));
    public static final C15578l billing = new C15578l(1789517518, false, new C11813l(11));

    public /* synthetic */ C5883l(int i) {
        this.yandex = i;
    }

    public static Object billing(InterfaceC15879l interfaceC15879l, InterfaceC1388l interfaceC1388l) {
        if (interfaceC15879l instanceof InterfaceC5899l) {
            return ((InterfaceC5899l) interfaceC15879l).mo842while(interfaceC1388l);
        }
        if (!(interfaceC15879l instanceof InterfaceC15879l)) {
            return null;
        }
        InterfaceC15879l interfaceC15879l2 = interfaceC15879l;
        if (interfaceC15879l2.subs() != interfaceC15879l) {
            return billing(interfaceC15879l2.subs(), interfaceC1388l);
        }
        return null;
    }

    public static final AbstractC14165l loadAd(InterfaceC1286l interfaceC1286l, Context context, int i) {
        if (interfaceC1286l instanceof C13028l) {
            return AbstractC6604l.yandex(new C14115l(((C13028l) interfaceC1286l).yandex), i);
        }
        return interfaceC1286l instanceof C16688l ? new C13466l(AbstractC3230l.loadAd(interfaceC1286l, context.getResources()).mutate()) : new C2370l(interfaceC1286l);
    }

    public static final int purchase(C16761l c16761l) {
        int iCrashlytics;
        int i = c16761l.loadAd;
        int iCrashlytics2 = c16761l.crashlytics(0);
        while (c16761l.loadAd != 0 && c16761l.crashlytics(0) == iCrashlytics2) {
            c16761l.billing(0, c16761l.amazon());
            c16761l.purchase(c16761l.loadAd - 1);
            int i2 = c16761l.loadAd;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iCrashlytics3 = c16761l.crashlytics(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iCrashlytics4 = c16761l.crashlytics(i6);
                if (i5 < i2 && (iCrashlytics = c16761l.crashlytics(i5)) > iCrashlytics4) {
                    if (iCrashlytics <= iCrashlytics3) {
                        break;
                    }
                    c16761l.billing(i4, iCrashlytics);
                    c16761l.billing(i5, iCrashlytics3);
                    i4 = i5;
                } else {
                    if (iCrashlytics4 <= iCrashlytics3) {
                        break;
                    }
                    c16761l.billing(i4, iCrashlytics4);
                    c16761l.billing(i6, iCrashlytics3);
                    i4 = i6;
                }
            }
        }
        return iCrashlytics2;
    }

    public static final void yandex(C16761l c16761l, int i) {
        if (c16761l.loadAd == 0 || !(c16761l.crashlytics(0) == i || c16761l.crashlytics(c16761l.loadAd - 1) == i)) {
            int i2 = c16761l.loadAd;
            c16761l.yandex(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iCrashlytics = c16761l.crashlytics(i3);
                if (i <= iCrashlytics) {
                    break;
                }
                c16761l.billing(i2, iCrashlytics);
                i2 = i3;
            }
            c16761l.billing(i2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    public final int amazon(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        String str2;
        int i5;
        int i6;
        char cCharAt3;
        char c = 2048;
        int i7 = 0;
        char c2 = 55296;
        char c3 = 57343;
        String str3 = "Not enough space in output buffer to encode UTF-8 string";
        switch (this.yandex) {
            case 0:
                int length = str.length();
                int i8 = i2 + i;
                while (i7 < length) {
                    int i9 = i7 + i;
                    if (i9 >= i8 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i8) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i8 - 2) {
                                int i10 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i10] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i8 - 3) {
                                    if (i3 > i8 - 4) {
                                        if (55296 > cCharAt || cCharAt > 57343 || ((i4 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                        }
                                        throw new C8255l(i7, length);
                                    }
                                    int i11 = i7 + 1;
                                    if (i11 != str.length()) {
                                        char cCharAt4 = str.charAt(i11);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i12 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                                            i7 = i11;
                                        } else {
                                            i7 = i11;
                                        }
                                    }
                                    throw new C8255l(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i9] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i19 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i19] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i111 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i111] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j2 = i;
                long j3 = ((long) i2) + j2;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                }
                while (true) {
                    j = 1;
                    if (i7 < length2 && (cCharAt3 = str.charAt(i7)) < 128) {
                        AbstractC0357l.isPro(bArr, j2, (byte) cCharAt3);
                        i7++;
                        j2 = 1 + j2;
                    }
                }
                if (i7 != length2) {
                    while (i7 < length2) {
                        char cCharAt5 = str.charAt(i7);
                        if (cCharAt5 >= 128 || j2 >= j3) {
                            if (cCharAt5 >= c || j2 > j3 - 2) {
                                int i20 = i7;
                                j = j;
                                if ((cCharAt5 >= c2 && c3 >= cCharAt5) || j2 > j3 - 3) {
                                    str2 = str3;
                                    if (j2 > j3 - 4) {
                                        if (c2 > cCharAt5 || cCharAt5 > 57343 || ((i5 = i20 + 1) != length2 && Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                            throw new ArrayIndexOutOfBoundsException(str2);
                                        }
                                        throw new C8255l(i20, length2);
                                    }
                                    int i21 = i20 + 1;
                                    if (i21 != length2) {
                                        char cCharAt6 = str.charAt(i21);
                                        if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                            int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                            AbstractC0357l.isPro(bArr, j2, (byte) ((codePoint2 >>> 18) | 240));
                                            AbstractC0357l.isPro(bArr, j2 + j, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j4 = j2 + 3;
                                            AbstractC0357l.isPro(bArr, j2 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j2 += 4;
                                            AbstractC0357l.isPro(bArr, j4, (byte) ((codePoint2 & 63) | 128));
                                            i7 = i21;
                                        } else {
                                            i6 = i21;
                                        }
                                    } else {
                                        i6 = i20;
                                    }
                                    throw new C8255l(i6 - 1, length2);
                                }
                                AbstractC0357l.isPro(bArr, j2, (byte) ((cCharAt5 >>> '\f') | 480));
                                str2 = str3;
                                long j5 = j2 + 2;
                                AbstractC0357l.isPro(bArr, j2 + j, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                j2 += 3;
                                AbstractC0357l.isPro(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                i7 = i20;
                            } else {
                                long j6 = j2 + j;
                                AbstractC0357l.isPro(bArr, j2, (byte) ((cCharAt5 >>> 6) | 960));
                                j2 += 2;
                                AbstractC0357l.isPro(bArr, j6, (byte) ((cCharAt5 & '?') | 128));
                                i7 = i7;
                            }
                            i7++;
                            str3 = str2;
                            c = 2048;
                            c2 = 55296;
                            c3 = 57343;
                            j = j;
                        } else {
                            AbstractC0357l.isPro(bArr, j2, (byte) cCharAt5);
                            j2 += j;
                        }
                        str2 = str3;
                        i7++;
                        str3 = str2;
                        c = 2048;
                        c2 = 55296;
                        c3 = 57343;
                        j = j;
                    }
                }
                return (int) j2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    public final String crashlytics(int i, int i2, byte[] bArr) throws C5957l {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.yandex) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw C5957l.yandex();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || AbstractC4596l.billing(b6)) {
                                    throw C5957l.yandex();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else if (b < -16) {
                                if (i3 < i5 - 1) {
                                    throw C5957l.yandex();
                                }
                                int i8 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b7 = bArr[i8];
                                int i9 = i6 + 1;
                                if (!AbstractC4596l.billing(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || AbstractC4596l.billing(b7)))) {
                                    throw C5957l.yandex();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b7 & 63));
                                i6 = i9;
                            } else {
                                if (i3 < i5 - 2) {
                                    throw C5957l.yandex();
                                }
                                b4 = bArr[i3];
                                int i10 = i + 3;
                                byte b8 = bArr[i + 2];
                                i += 4;
                                byte b9 = bArr[i10];
                                int i11 = i6 + 1;
                                if (!AbstractC4596l.billing(b4) || (((b4 + 112) + (b << 28)) >> 30) != 0 || AbstractC4596l.billing(b8) || AbstractC4596l.billing(b9)) {
                                    throw C5957l.yandex();
                                }
                                int i12 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                cArr[i6] = (char) ((i12 >>> 10) + 55232);
                                cArr[i11] = (char) ((i12 & 1023) + 56320);
                                i6 += 2;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw C5957l.yandex();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw C5957l.yandex();
                        }
                        if (b < -16) {
                            if (i3 < i5 - 1) {
                                throw C5957l.yandex();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (AbstractC4596l.billing(b3)) {
                            }
                            throw C5957l.yandex();
                        }
                        if (i3 < i5 - 2) {
                            throw C5957l.yandex();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (AbstractC4596l.billing(b4)) {
                        }
                        throw C5957l.yandex();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC4579l.yandex;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw C5957l.yandex();
                }
                return str;
        }
    }
}
