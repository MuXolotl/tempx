package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lؘ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6000l implements InterfaceC16588l {
    public static final C6000l yandex = new C6000l();
    public static final C17606l loadAd = AbstractC16814l.crashlytics("SerializableContainer");

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        String string;
        int i;
        C7695l c7695l = (C7695l) obj;
        C2494l c2494l = c7695l.loadAd;
        byte[] bArrVip = c2494l != null ? AbstractC14289l.vip((InterfaceC16588l) c2494l.f5290l, c2494l.f5291l) : c7695l.yandex;
        if (bArrVip != null) {
            StringBuilder sb = new StringBuilder(AbstractC15560l.remoteconfig(bArrVip.length, 3, 4, 1));
            int i2 = 0;
            int i3 = 0;
            while (i3 < bArrVip.length && (i = i3 + 3) <= bArrVip.length) {
                int i4 = (bArrVip[i3 + 2] & 255) | ((bArrVip[i3] & 255) << 16) | ((bArrVip[i3 + 1] & 255) << 8);
                char[] cArr = AbstractC18066l.yandex;
                sb.append(cArr[i4 >> 18]);
                sb.append(cArr[(i4 >> 12) & 63]);
                sb.append(cArr[(i4 >> 6) & 63]);
                sb.append(cArr[i4 & 63]);
                i3 = i;
            }
            if (i3 < bArrVip.length) {
                while (i3 < bArrVip.length) {
                    i2 = (i2 << 8) | (bArrVip[i3] & 255);
                    i3++;
                }
                int i5 = 3 - (i3 % 3);
                int i6 = i2 << (i5 * 8);
                char[] cArr2 = AbstractC18066l.yandex;
                sb.append(cArr2[i6 >> 18]);
                sb.append(cArr2[(i6 >> 12) & 63]);
                char c = cArr2[(i6 >> 6) & 63];
                char c2 = cArr2[i6 & 63];
                if (i5 == 0) {
                    sb.append(c);
                    sb.append(c2);
                } else if (i5 == 1) {
                    sb.append(c);
                    sb.append('=');
                } else if (i5 == 2) {
                    sb.append("==");
                }
            }
            string = sb.toString();
        } else {
            string = ".";
        }
        interfaceC17739l.subscription(string);
    }

    @Override // defpackage.InterfaceC16588l
    public final Object loadAd(InterfaceC10726l interfaceC10726l) {
        byte[] bArrCopyOf;
        String strTapsense = interfaceC10726l.tapsense();
        byte[] bArr = null;
        if (AbstractC8576l.yandex(strTapsense, ".")) {
            strTapsense = null;
        }
        if (strTapsense != null) {
            int i = 0;
            if (AbstractC12024l.m3315catch(strTapsense)) {
                bArrCopyOf = new byte[0];
            } else {
                int length = strTapsense.length();
                byte[] bArr2 = new byte[length];
                int[] iArr = AbstractC18066l.loadAd;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i2 < strTapsense.length()) {
                    int i6 = i2 + 1;
                    char cCharAt = strTapsense.charAt(i2);
                    if (AbstractC8576l.subs(cCharAt, 32) > 0) {
                        if (cCharAt == '=') {
                            break;
                        }
                        int i7 = (cCharAt < 0 || cCharAt >= iArr.length) ? -1 : iArr[cCharAt];
                        if (i7 == -1) {
                            throw new IllegalStateException(("Unexpected character " + cCharAt + " (" + ((int) cCharAt) + ")) in " + strTapsense).toString());
                        }
                        i4 = (i4 << 6) | i7;
                        i5++;
                        if (i5 == 4) {
                            bArr2[i3] = (byte) (i4 >> 16);
                            bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                            bArr2[i3 + 2] = (byte) (i4 & 255);
                            i3 += 3;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                    i2 = i6;
                }
                int i8 = 0;
                while (i2 < strTapsense.length()) {
                    int i9 = i2 + 1;
                    char cCharAt2 = strTapsense.charAt(i2);
                    if (AbstractC8576l.subs(cCharAt2, 32) > 0) {
                        if (cCharAt2 != '=') {
                            C8339l.smaato("Check failed.");
                            return null;
                        }
                        i8++;
                        i4 <<= 6;
                        i5++;
                    }
                    i2 = i9;
                }
                if (i5 == 4) {
                    bArr2[i3] = (byte) (i4 >> 16);
                    bArr2[i3 + 1] = (byte) ((i4 >> 8) & 255);
                    bArr2[i3 + 2] = (byte) (i4 & 255);
                    i3 = (i3 + 3) - i8;
                } else {
                    i = i5;
                }
                if (i != 0) {
                    C8936l.subs(AbstractC0653l.vip(i, "buffered: "));
                    return null;
                }
                if (i3 < length) {
                    bArrCopyOf = Arrays.copyOf(bArr2, i3);
                } else {
                    bArr = bArr2;
                }
            }
            bArr = bArrCopyOf;
        }
        return new C7695l(bArr);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
