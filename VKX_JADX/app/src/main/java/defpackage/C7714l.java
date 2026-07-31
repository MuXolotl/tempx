package defpackage;

/* JADX INFO: renamed from: lًؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C7714l {
    public final int amazon;
    public final int crashlytics;
    public final boolean loadAd;
    public final int purchase;
    public final boolean yandex;
    public static final C16353l billing = new C16353l(false, false, -1, 1);
    public static final byte[] mopub = {13, 10};
    public static final C7714l admob = new C7714l(true, false, -1, 1);

    static {
        new C7714l(false, true, 76, 1);
        new C7714l(false, true, 64, 1);
    }

    public C7714l(boolean z, boolean z2, int i, int i2) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = i;
        this.amazon = i2;
        if (z && z2) {
            C8339l.metrica("Failed requirement.");
            throw null;
        }
        this.purchase = i / 4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0141 A[EDGE_INSN: B:142:0x0141->B:77:0x0141 BREAK  A[LOOP:2: B:72:0x0131->B:76:0x013e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131 A[ADDED_TO_REGION, LOOP:2: B:72:0x0131->B:76:0x013e, LOOP_START, PHI: r15
  0x0131: PHI (r15v15 int) = (r15v12 int), (r15v16 int) binds: [B:70:0x012e, B:76:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e A[LOOP:2: B:72:0x0131->B:76:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0178  */
    /* JADX WARN: Code duplicated, block: B:95:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01af  */
    public static byte[] yandex(C7714l c7714l, CharSequence charSequence, int i, int i2) {
        byte[] bytes;
        int i3;
        int i4;
        boolean z;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char c;
        char c2;
        int i8;
        int i9;
        int i10 = (i2 & 2) != 0 ? 0 : i;
        int length = charSequence.length();
        c7714l.getClass();
        int i11 = c7714l.amazon;
        boolean z2 = c7714l.loadAd;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            AbstractC15918l.admob(i10, length, str.length());
            bytes = str.substring(i10, length).getBytes(AbstractC9050l.amazon);
        } else {
            AbstractC15918l.admob(i10, length, charSequence.length());
            byte[] bArr = new byte[length - i10];
            int i12 = 0;
            while (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt <= 255) {
                    bArr[i12] = (byte) cCharAt;
                    i12++;
                } else {
                    bArr[i12] = 63;
                    i12++;
                }
                i10++;
            }
            bytes = bArr;
        }
        int length2 = bytes.length;
        AbstractC15918l.admob(0, length2, bytes.length);
        int i13 = -2;
        if (length2 == 0) {
            i4 = 0;
        } else {
            if (length2 == 1) {
                C8339l.metrica(AbstractC0653l.vip(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z2) {
                i3 = length2;
                for (int i14 = 0; i14 < length2; i14++) {
                    int i15 = AbstractC5306l.loadAd[bytes[i14] & 255];
                    if (i15 < 0) {
                        if (i15 == -2) {
                            i3 -= length2 - i14;
                            break;
                        }
                        i3--;
                    }
                }
            } else if (bytes[length2 - 1] == 61) {
                i3 = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i3 = length2 - 2;
                }
            } else {
                i3 = length2;
            }
            i4 = (int) ((((long) i3) * 6) / 8);
        }
        byte[] bArr2 = new byte[i4];
        int[] iArr2 = c7714l.yandex ? AbstractC5306l.amazon : AbstractC5306l.loadAd;
        int i16 = -8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -8;
        while (true) {
            if (i18 >= length2) {
                z = false;
                break;
            }
            if (i20 == i16) {
                i5 = 8;
                int i21 = i18 + 3;
                if (i21 < length2) {
                    int i22 = iArr2[bytes[i18] & 255];
                    iArr = iArr2;
                    int i23 = i18 + 4;
                    int i24 = (iArr[bytes[i18 + 2] & 255] << 6) | (iArr2[bytes[i18 + 1] & 255] << 12) | (i22 << 18) | iArr[bytes[i21] & 255];
                    if (i24 >= 0) {
                        bArr2[i17] = (byte) (i24 >> 16);
                        int i25 = i17 + 2;
                        bArr2[i17 + 1] = (byte) (i24 >> 8);
                        i17 += 3;
                        bArr2[i25] = (byte) i24;
                        iArr2 = iArr;
                        i18 = i23;
                    }
                    i13 = -2;
                    i16 = -8;
                }
                i6 = bytes[i18] & 255;
                i7 = iArr[i6];
                if (i7 < 0) {
                    c = '=';
                    c2 = 2;
                    i18++;
                    i19 = (i19 << 6) | i7;
                    i8 = i20 + 6;
                    if (i8 >= 0) {
                        bArr2[i17] = (byte) (i19 >>> i8);
                        i19 &= (1 << i8) - 1;
                        i20 -= 2;
                        i17++;
                    } else {
                        i20 = i8;
                    }
                } else {
                    if (i7 == -2) {
                        if (i20 != -8) {
                            C8339l.metrica(AbstractC0653l.vip(i18, "Redundant pad character at index "));
                            return null;
                        }
                        if (i20 != -6) {
                            if (i20 != -4) {
                                if (i11 != 2) {
                                    C8339l.metrica(AbstractC0653l.vip(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                    return null;
                                }
                                i9 = i18 + 1;
                                if (z2) {
                                    while (i9 < length2) {
                                        if (AbstractC5306l.loadAd[bytes[i9] & 255] != -1) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                                if (i9 != length2 || bytes[i9] != 61) {
                                    C8339l.metrica(AbstractC0653l.vip(i9, "Missing one pad character at index "));
                                    return null;
                                }
                                i18 = i9 + 1;
                            } else if (i20 != -2) {
                                C8339l.smaato("Unreachable");
                                return null;
                            }
                            z = true;
                            i13 = -2;
                            break;
                        }
                        if (i11 == 2) {
                            C8339l.metrica(AbstractC0653l.vip(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            return null;
                        }
                        i18++;
                        z = true;
                        i13 = -2;
                        break;
                    }
                    c = '=';
                    c2 = 2;
                    if (z2) {
                        char c3 = (char) i6;
                        AbstractC8576l.loadAd(i5);
                        throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + Integer.toString(i6, i5) + ") at index " + i18);
                    }
                    i18++;
                }
                iArr2 = iArr;
                i13 = -2;
                i16 = -8;
            } else {
                i5 = 8;
            }
            iArr = iArr2;
            i6 = bytes[i18] & 255;
            i7 = iArr[i6];
            if (i7 < 0) {
                c = '=';
                c2 = 2;
                i18++;
                i19 = (i19 << 6) | i7;
                i8 = i20 + 6;
                if (i8 >= 0) {
                    bArr2[i17] = (byte) (i19 >>> i8);
                    i19 &= (1 << i8) - 1;
                    i20 -= 2;
                    i17++;
                } else {
                    i20 = i8;
                }
            } else {
                if (i7 == -2) {
                    if (i20 != -8) {
                        C8339l.metrica(AbstractC0653l.vip(i18, "Redundant pad character at index "));
                        return null;
                    }
                    if (i20 != -6) {
                        if (i20 != -4) {
                            if (i11 != 2) {
                                C8339l.metrica(AbstractC0653l.vip(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                                return null;
                            }
                            i9 = i18 + 1;
                            if (z2) {
                                while (i9 < length2) {
                                    if (AbstractC5306l.loadAd[bytes[i9] & 255] != -1) {
                                        break;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            if (i9 != length2) {
                            }
                            C8339l.metrica(AbstractC0653l.vip(i9, "Missing one pad character at index "));
                            return null;
                        }
                        if (i20 != -2) {
                            C8339l.smaato("Unreachable");
                            return null;
                        }
                        z = true;
                        i13 = -2;
                        break;
                    }
                    if (i11 == 2) {
                        C8339l.metrica(AbstractC0653l.vip(i18, "The padding option is set to ABSENT, but the input has a pad character at index "));
                        return null;
                    }
                    i18++;
                    z = true;
                    i13 = -2;
                    break;
                }
                c = '=';
                c2 = 2;
                if (z2) {
                    char c4 = (char) i6;
                    AbstractC8576l.loadAd(i5);
                    throw new IllegalArgumentException("Invalid symbol '" + c4 + "'(" + Integer.toString(i6, i5) + ") at index " + i18);
                }
                i18++;
            }
            iArr2 = iArr;
            i13 = -2;
            i16 = -8;
        }
        if (i20 == i13) {
            C8339l.metrica("The last unit of input does not have enough bits");
            return null;
        }
        if (i20 != -8 && !z && i11 == 1) {
            C8339l.metrica("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i19 != 0) {
            C8339l.metrica("The pad bits must be zeros");
            return null;
        }
        if (z2) {
            while (i18 < length2) {
                if (AbstractC5306l.loadAd[bytes[i18] & 255] != -1) {
                    break;
                }
                i18++;
            }
        }
        if (i18 >= length2) {
            if (i17 == i4) {
                return bArr2;
            }
            C8339l.smaato("Check failed.");
            return null;
        }
        int i26 = bytes[i18] & 255;
        StringBuilder sb = new StringBuilder("Symbol '");
        sb.append((char) i26);
        sb.append("'(");
        AbstractC8576l.loadAd(8);
        sb.append(Integer.toString(i26, 8));
        sb.append(") at index ");
        C8339l.metrica(AbstractC14814l.remoteconfig(i18 - 1, " is prohibited after the pad character", sb));
        return null;
    }

    public final int loadAd(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = 4;
        int iRemoteconfig = i2 * 4;
        if (i3 != 0) {
            int i5 = this.amazon;
            if (i5 != 1 && i5 != 3) {
                i4 = i3 + 1;
            }
            iRemoteconfig += i4;
        }
        if (iRemoteconfig < 0) {
            C8339l.metrica("Input is too big");
            return 0;
        }
        if (this.loadAd) {
            iRemoteconfig = AbstractC15560l.remoteconfig(iRemoteconfig - 1, this.crashlytics, 2, iRemoteconfig);
        }
        if (iRemoteconfig >= 0) {
            return iRemoteconfig;
        }
        C8339l.metrica("Input is too big");
        return 0;
    }
}
