package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؘٙۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5775l {
    public final int adcel;
    public final int admob;
    public final C18396l ads;
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int firebase;
    public final int isPro;
    public final C17951l loadAd = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public final int metrica;
    public final int mopub;
    public final int purchase;
    public final int remoteconfig;
    public final int smaato;
    public final int startapp;
    public final int subs;
    public final int vip;
    public final SecureRandom yandex;

    public C5775l(int i, SecureRandom secureRandom) {
        if (i == 2) {
            this.billing = 4;
            this.mopub = 4;
            this.admob = 2;
            this.subs = 39;
            this.isPro = 78;
            this.firebase = 131072;
            this.smaato = 95232;
            this.remoteconfig = 80;
            this.crashlytics = 576;
            this.amazon = 192;
            this.purchase = 96;
            this.vip = 32;
        } else if (i == 3) {
            this.billing = 6;
            this.mopub = 5;
            this.admob = 4;
            this.subs = 49;
            this.isPro = 196;
            this.firebase = 524288;
            this.smaato = 261888;
            this.remoteconfig = 55;
            this.crashlytics = 640;
            this.amazon = 128;
            this.purchase = 128;
            this.vip = 48;
        } else {
            if (i != 5) {
                C8339l.metrica(AbstractC15560l.tapsense("The mode ", i, "is not supported by Crystals Dilithium!"));
                throw null;
            }
            this.billing = 8;
            this.mopub = 7;
            this.admob = 2;
            this.subs = 60;
            this.isPro = 120;
            this.firebase = 524288;
            this.smaato = 261888;
            this.remoteconfig = 75;
            this.crashlytics = 640;
            this.amazon = 128;
            this.purchase = 96;
            this.vip = 64;
        }
        this.ads = new C18396l(24);
        this.yandex = secureRandom;
        int i2 = this.remoteconfig;
        int i3 = this.billing;
        this.metrica = (i3 * 320) + 32;
        this.startapp = (this.mopub * this.crashlytics) + this.vip + i2 + i3;
        int i4 = this.firebase;
        if (i4 == 131072) {
            this.adcel = 5;
        } else if (i4 == 524288) {
            this.adcel = 5;
        } else {
            C18073l.license("Wrong Dilithium Gamma1!");
            throw null;
        }
    }

    public static C5775l amazon(C13812l c13812l, SecureRandom secureRandom) {
        return new C5775l(c13812l.yandex, secureRandom);
    }

    public final byte[] crashlytics(byte[] bArr, C17951l c17951l, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        C10111l[] c10111lArr;
        C10111l[] c10111lArr2;
        C10111l[] c10111lArr3;
        int i;
        byte[] bArr8 = new byte[this.startapp];
        byte[] bArr9 = new byte[64];
        C1770l c1770l = new C1770l(this);
        C1770l c1770l2 = new C1770l(this);
        C10111l[] c10111lArr4 = (C10111l[]) c1770l2.f4179l;
        C1770l c1770l3 = new C1770l(this);
        C10111l[] c10111lArr5 = (C10111l[]) c1770l3.f4179l;
        C10975l c10975l = new C10975l(this);
        C10975l c10975l2 = new C10975l(this);
        C10975l c10975l3 = new C10975l(this);
        C10111l[] c10111lArr6 = (C10111l[]) c10975l3.f22121l;
        C10975l c10975l4 = new C10975l(this);
        C10111l[] c10111lArr7 = (C10111l[]) c10975l4.f22121l;
        C10975l c10975l5 = new C10975l(this);
        C10111l[] c10111lArr8 = (C10111l[]) c10975l5.f22121l;
        C10975l c10975l6 = c10975l5;
        C10111l c10111l = new C10111l(this);
        C10111l[] c10111lArr9 = c10111lArr5;
        C3316l c3316l = new C3316l(this);
        C10111l[] c10111lArr10 = c10111lArr8;
        C10975l c10975l7 = c10975l4;
        C10111l c10111l2 = c10111l;
        byte[] bArr10 = bArr8;
        C10111l[] c10111lArr11 = c10111lArr6;
        C2287l.smaato(c10975l, c1770l, c10975l2, bArr4, bArr5, bArr6, this);
        byte[] bArrRemoteconfig = AbstractC14024l.remoteconfig(128, bArr3);
        int i2 = 0;
        System.arraycopy(bArr7, 0, bArrRemoteconfig, 32, 32);
        System.arraycopy(bArr, 0, bArrRemoteconfig, 64, 64);
        c17951l.billing(0, 128, bArrRemoteconfig);
        c17951l.crashlytics(0, 64, bArr9);
        c3316l.smaato(bArr2);
        c1770l.remoteconfig();
        c10975l2.m3020native();
        c10975l.m3020native();
        int i3 = 0;
        short s = 0;
        while (i3 < 1000) {
            int i4 = i3 + 1;
            short s2 = (short) (s + 1);
            int i5 = i2;
            while (true) {
                short s3 = s;
                if (i2 < c10111lArr4.length) {
                    C10111l c10111l3 = c10111lArr4[i2];
                    short length = (short) ((c10111lArr4.length * s3) + i2);
                    int i6 = i2;
                    C5775l c5775l = (C5775l) c10111l3.f20586l;
                    short s4 = s2;
                    int i7 = c5775l.adcel;
                    C10111l[] c10111lArr12 = c10111lArr4;
                    C18396l c18396l = (C18396l) c10111l3.f20589l;
                    c18396l.getClass();
                    C17951l c17951l2 = (C17951l) c18396l.f35933l;
                    C10975l c10975l8 = c10975l2;
                    byte[] bArr11 = new byte[i7 * 136];
                    c17951l2.reset();
                    C1770l c1770l4 = c1770l;
                    byte b = (byte) length;
                    byte b2 = (byte) (length >> 8);
                    char c = 2;
                    byte[] bArr12 = new byte[2];
                    bArr12[i5] = b;
                    bArr12[1] = b2;
                    int i8 = i5;
                    c17951l2.billing(i8, 64, bArr9);
                    c17951l2.billing(i8, 2, bArr12);
                    c17951l2.remoteconfig(i8, i7 * 136, bArr11);
                    int i9 = c5775l.firebase;
                    if (i9 == 131072) {
                        int i10 = 0;
                        for (int i11 = 64; i10 < i11; i11 = 64) {
                            int i12 = i10 * 4;
                            int i13 = i10 * 9;
                            int i14 = (bArr11[i13] & 255) | ((bArr11[i13 + 1] & 255) << 8);
                            int i15 = bArr11[i13 + 2] & 255;
                            char c2 = c;
                            int[] iArr = (int[]) c10111l3.f20587l;
                            iArr[i12] = (i14 | (i15 << 16)) & 262143;
                            int i16 = i12 + 1;
                            int i17 = ((bArr11[i13 + 3] & 255) << 6) | (i15 >> 2);
                            int i18 = bArr11[i13 + 4] & 255;
                            iArr[i16] = (i17 | (i18 << 14)) & 262143;
                            int i19 = i12 + 2;
                            int i20 = ((bArr11[i13 + 5] & 255) << 4) | (i18 >> 4);
                            int i21 = bArr11[i13 + 6] & 255;
                            iArr[i19] = (i20 | (i21 << 12)) & 262143;
                            int i22 = i12 + 3;
                            iArr[i22] = (((bArr11[i13 + 7] & 255) << 2) | (i21 >> 6) | ((bArr11[i13 + 8] & 255) << 10)) & 262143;
                            iArr[i12] = i9 - iArr[i12];
                            iArr[i16] = i9 - iArr[i16];
                            iArr[i19] = i9 - iArr[i19];
                            iArr[i22] = i9 - iArr[i22];
                            i10++;
                            c = c2;
                        }
                    } else {
                        if (i9 != 524288) {
                            C18073l.license("Wrong Dilithiumn Gamma1!");
                            return null;
                        }
                        int i23 = 0;
                        while (i23 < 128) {
                            int i24 = i23 * 2;
                            int i25 = i23 * 5;
                            int i26 = (bArr11[i25] & 255) | ((bArr11[i25 + 1] & 255) << 8);
                            int i27 = bArr11[i25 + 2] & 255;
                            int[] iArr2 = (int[]) c10111l3.f20587l;
                            iArr2[i24] = (i26 | (i27 << 16)) & 1048575;
                            int i28 = i24 + 1;
                            iArr2[i28] = (((bArr11[i25 + 3] & 255) << 4) | (i27 >> 4) | ((bArr11[i25 + 4] & 255) << 12)) & 1048575;
                            iArr2[i24] = i9 - iArr2[i24];
                            iArr2[i28] = i9 - iArr2[i28];
                            i23++;
                            c10111l3 = c10111l3;
                        }
                    }
                    i2 = i6 + 1;
                    s = s3;
                    s2 = s4;
                    c10111lArr4 = c10111lArr12;
                    c10975l2 = c10975l8;
                    c1770l = c1770l4;
                    i5 = 0;
                }
            }
            C1770l c1770l5 = c1770l;
            C10975l c10975l9 = c10975l2;
            short s5 = s2;
            C10111l[] c10111lArr13 = c10111lArr4;
            c1770l2.subs(c1770l3);
            c1770l3.remoteconfig();
            c3316l.metrica(c10975l3, c1770l3);
            c10975l3.m3012case();
            c10975l3.appmetrica();
            c10975l3.signatures();
            for (int i29 = 0; i29 < c10111lArr11.length; i29++) {
                C10111l c10111l4 = c10111lArr11[i29];
                C10111l c10111l5 = c10111lArr7[i29];
                int i30 = ((C5775l) c10111l4.f20586l).smaato;
                for (int i31 = 0; i31 < 256; i31++) {
                    int[] iArrCrashlytics = AbstractC4107l.crashlytics(((int[]) c10111l4.f20587l)[i31], i30);
                    ((int[]) c10111l4.f20587l)[i31] = iArrCrashlytics[1];
                    ((int[]) c10111l5.f20587l)[i31] = iArrCrashlytics[0];
                }
            }
            byte[] bArr13 = bArr10;
            c10975l3.m3023synchronized(this, bArr13, 0);
            c17951l.billing(0, 64, bArr);
            int i32 = this.amazon;
            int i33 = this.billing;
            c17951l.billing(0, i32 * i33, bArr13);
            int i34 = this.vip;
            c17951l.crashlytics(0, i34, bArr13);
            c10111l2 = c10111l2;
            c10111l2.smaato(i34, bArr13);
            c10111l2.signatures();
            C10111l[] c10111lArr14 = c10111lArr9;
            int i35 = 0;
            while (i35 < c10111lArr14.length) {
                c10111lArr14[i35].ad(c10111l2, ((C10111l[]) c1770l5.f4179l)[i35]);
                i35++;
                bArr13 = bArr13;
            }
            bArr10 = bArr13;
            C1770l c1770l6 = c1770l5;
            for (C10111l c10111l6 : c10111lArr14) {
                c10111l6.Signature();
            }
            int i36 = 0;
            while (i36 < c10111lArr14.length) {
                C10111l c10111l7 = c10111lArr14[i36];
                C10111l c10111l8 = c10111lArr13[i36];
                C1770l c1770l7 = c1770l6;
                int i37 = i34;
                int i38 = 0;
                while (i38 < 256) {
                    int[] iArr3 = (int[]) c10111l7.f20587l;
                    int i39 = i38;
                    iArr3[i39] = iArr3[i38] + ((int[]) c10111l8.f20587l)[i39];
                    i38 = i39 + 1;
                }
                c10111l7.getClass();
                i36++;
                i34 = i37;
                c1770l6 = c1770l7;
            }
            C1770l c1770l8 = c1770l6;
            int i40 = i34;
            for (C10111l c10111l9 : c10111lArr14) {
                c10111l9.inmobi();
            }
            int i41 = this.firebase;
            int i42 = this.isPro;
            int i43 = i41 - i42;
            int i44 = 0;
            while (true) {
                if (i44 >= c10111lArr14.length) {
                    C10975l c10975l10 = c10975l6;
                    c10975l10.m3025volatile(c10111l2, c10975l9);
                    c10975l10.appmetrica();
                    C10975l c10975l11 = c10975l7;
                    c10975l11.m3015continue(c10975l10);
                    c10975l11.m3012case();
                    int i45 = this.smaato;
                    int i46 = i45 - i42;
                    C10111l[] c10111lArr15 = c10111lArr7;
                    int i47 = 0;
                    c10111lArr = c10111lArr11;
                    while (true) {
                        if (i47 >= c10111lArr15.length) {
                            c10975l10.m3025volatile(c10111l2, c10975l);
                            c10975l10.appmetrica();
                            c10975l10.m3012case();
                            c10111lArr2 = c10111lArr10;
                            int i48 = 0;
                            while (true) {
                                if (i48 >= c10111lArr2.length) {
                                    c10975l11.isVip(c10975l10);
                                    c10975l11.signatures();
                                    int i49 = 0;
                                    int i50 = 0;
                                    while (i50 < c10111lArr2.length) {
                                        C10111l c10111l10 = c10111lArr2[i50];
                                        C10975l c10975l12 = c10975l11;
                                        C10111l c10111l11 = c10111lArr15[i50];
                                        C10975l c10975l13 = c10975l10;
                                        C10111l c10111l12 = c10111lArr[i50];
                                        c10111l10.getClass();
                                        C10111l c10111l13 = c10111l2;
                                        C10111l[] c10111lArr16 = c10111lArr15;
                                        int i51 = 0;
                                        int i52 = 0;
                                        while (i51 < 256) {
                                            int i53 = ((int[]) c10111l11.f20587l)[i51];
                                            C10111l c10111l14 = c10111l11;
                                            int i54 = ((int[]) c10111l12.f20587l)[i51];
                                            int i55 = ((C5775l) c10111l10.f20586l).smaato;
                                            int i56 = (i53 <= i55 || i53 > (i = 8380417 - i55) || (i53 == i && i54 == 0)) ? 0 : 1;
                                            ((int[]) c10111l10.f20587l)[i51] = i56;
                                            i52 += i56;
                                            i51++;
                                            c10111l11 = c10111l14;
                                        }
                                        i49 += i52;
                                        i50++;
                                        c10975l10 = c10975l13;
                                        c10111l2 = c10111l13;
                                        c10975l11 = c10975l12;
                                        c10111lArr15 = c10111lArr16;
                                    }
                                    c10975l7 = c10975l11;
                                    c10975l6 = c10975l10;
                                    c10111l2 = c10111l2;
                                    c10111lArr3 = c10111lArr15;
                                    int i57 = this.remoteconfig;
                                    if (i49 > i57) {
                                        break;
                                    }
                                    int i58 = i40;
                                    for (int i59 = 0; i59 < this.mopub; i59++) {
                                        C10111l c10111l15 = c10111lArr14[i59];
                                        int i60 = ((C5775l) c10111l15.f20586l).firebase;
                                        if (i60 == 131072) {
                                            for (int i61 = 0; i61 < 64; i61++) {
                                                int i62 = i61 * 4;
                                                int[] iArr4 = (int[]) c10111l15.f20587l;
                                                int i63 = i60 - iArr4[i62];
                                                int i64 = i60 - iArr4[i62 + 1];
                                                int i65 = i60 - iArr4[i62 + 2];
                                                int i66 = i60 - iArr4[i62 + 3];
                                                int i67 = (i61 * 9) + i58;
                                                bArr10[i67] = (byte) i63;
                                                bArr10[i67 + 1] = (byte) (i63 >> 8);
                                                bArr10[i67 + 2] = (byte) (((byte) (i63 >> 16)) | (i64 << 2));
                                                bArr10[i67 + 3] = (byte) (i64 >> 6);
                                                bArr10[i67 + 4] = (byte) (((byte) (i64 >> 14)) | (i65 << 4));
                                                bArr10[i67 + 5] = (byte) (i65 >> 4);
                                                bArr10[i67 + 6] = (byte) (((byte) (i65 >> 12)) | (i66 << 6));
                                                bArr10[i67 + 7] = (byte) (i66 >> 2);
                                                bArr10[i67 + 8] = (byte) (i66 >> 10);
                                            }
                                        } else {
                                            if (i60 != 524288) {
                                                C18073l.license("Wrong Dilithium Gamma1!");
                                                return null;
                                            }
                                            for (int i68 = 0; i68 < 128; i68++) {
                                                int i69 = i68 * 2;
                                                int[] iArr5 = (int[]) c10111l15.f20587l;
                                                int i70 = i60 - iArr5[i69];
                                                int i71 = i60 - iArr5[i69 + 1];
                                                int i72 = (i68 * 5) + i58;
                                                bArr10[i72] = (byte) i70;
                                                bArr10[i72 + 1] = (byte) (i70 >> 8);
                                                bArr10[i72 + 2] = (byte) (((byte) (i70 >> 16)) | (i71 << 4));
                                                bArr10[i72 + 3] = (byte) (i71 >> 4);
                                                bArr10[i72 + 4] = (byte) (i71 >> 12);
                                            }
                                        }
                                        i58 += this.crashlytics;
                                    }
                                    for (int i73 = 0; i73 < i57 + i33; i73++) {
                                        bArr10[i58 + i73] = 0;
                                    }
                                    int i74 = 0;
                                    for (int i75 = 0; i75 < i33; i75++) {
                                        for (int i76 = 0; i76 < 256; i76++) {
                                            if (((int[]) c10111lArr2[i75].f20587l)[i76] != 0) {
                                                bArr10[i74 + i58] = (byte) i76;
                                                i74++;
                                            }
                                        }
                                        bArr10[i58 + i57 + i75] = (byte) i74;
                                    }
                                    return bArr10;
                                }
                                if (c10111lArr2[i48].remoteconfig(i45)) {
                                    c10975l7 = c10975l11;
                                    c10975l6 = c10975l10;
                                    c10111l2 = c10111l2;
                                    c10111lArr3 = c10111lArr15;
                                    break;
                                }
                                i48++;
                            }
                        } else if (c10111lArr15[i47].remoteconfig(i46)) {
                            c10975l7 = c10975l11;
                            c10975l6 = c10975l10;
                            c10111lArr3 = c10111lArr15;
                        } else {
                            i47++;
                        }
                    }
                } else if (c10111lArr14[i44].remoteconfig(i43)) {
                    c10111lArr3 = c10111lArr7;
                    c10111lArr = c10111lArr11;
                } else {
                    i44++;
                }
                c10111lArr2 = c10111lArr10;
                break;
            }
            i3 = i4;
            c10111lArr10 = c10111lArr2;
            c10111lArr9 = c10111lArr14;
            c10111lArr11 = c10111lArr;
            c10111lArr7 = c10111lArr3;
            s = s5;
            c10111lArr4 = c10111lArr13;
            c10975l2 = c10975l9;
            c1770l = c1770l8;
            i2 = 0;
        }
        return null;
    }

    public final byte[][] loadAd(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        C3316l c3316l = new C3316l(this);
        C1770l c1770l = new C1770l(this);
        C10111l[] c10111lArr = (C10111l[]) c1770l.f4179l;
        C10975l c10975l = new C10975l(this);
        C10111l[] c10111lArr2 = (C10111l[]) c10975l.f22121l;
        C10975l c10975l2 = new C10975l(this);
        C10975l c10975l3 = new C10975l(this);
        C17951l c17951l = this.loadAd;
        c17951l.billing(0, 32, bArr);
        int i = this.billing;
        c17951l.update((byte) i);
        int i2 = this.mopub;
        c17951l.update((byte) i2);
        c17951l.crashlytics(0, 128, bArr2);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        c3316l.smaato(bArr4);
        int i3 = 0;
        short s = 0;
        while (i3 < c10111lArr.length) {
            c10111lArr[i3].m2884throw(bArr5, s);
            i3++;
            s = (short) (s + 1);
        }
        short s2 = (short) i2;
        int i4 = 0;
        while (i4 < c10111lArr2.length) {
            c10111lArr2[i4].m2884throw(bArr5, s2);
            i4++;
            s2 = (short) (s2 + 1);
        }
        C1770l c1770l2 = new C1770l(this);
        c1770l.subs(c1770l2);
        c1770l2.remoteconfig();
        c3316l.metrica(c10975l2, c1770l2);
        c10975l2.m3012case();
        c10975l2.appmetrica();
        c10975l2.isVip(c10975l);
        c10975l2.signatures();
        c10975l2.m3021private(c10975l3);
        byte[] bArrFirebase = C2287l.firebase(c10975l2, this);
        c17951l.billing(0, 32, bArr4);
        c17951l.billing(0, bArrFirebase.length, bArrFirebase);
        c17951l.crashlytics(0, 64, bArr3);
        char c = 6;
        byte[][] bArr7 = new byte[6][];
        bArr7[0] = bArr4;
        char c2 = 1;
        bArr7[1] = bArr6;
        char c3 = 2;
        bArr7[2] = bArr3;
        int i5 = this.purchase;
        char c4 = 3;
        bArr7[3] = new byte[i2 * i5];
        for (int i6 = 0; i6 < i2; i6++) {
            c10111lArr[i6].advert(i6 * i5, bArr7[3]);
        }
        char c5 = 4;
        bArr7[4] = new byte[i * i5];
        for (int i7 = 0; i7 < i; i7++) {
            c10111lArr2[i7].advert(i7 * i5, bArr7[4]);
        }
        char c6 = 5;
        bArr7[5] = new byte[i * 416];
        int i8 = 0;
        while (i8 < i) {
            C10111l c10111l = ((C10111l[]) c10975l3.f22121l)[i8];
            byte[] bArr8 = bArr7[c6];
            int i9 = i8 * 416;
            char c7 = c6;
            char c8 = c;
            int i10 = 0;
            while (i10 < 32) {
                int i11 = i10 * 8;
                int[] iArr = (int[]) c10111l.f20587l;
                char c9 = c5;
                char c10 = c2;
                char c11 = c3;
                char c12 = c4;
                int i12 = i8;
                int[] iArr2 = {4096 - iArr[i11], 4096 - iArr[i11 + 1], 4096 - iArr[i11 + 2], 4096 - iArr[i11 + 3], 4096 - iArr[i11 + 4], 4096 - iArr[i11 + 5], 4096 - iArr[i11 + 6], 4096 - iArr[i11 + 7]};
                int i13 = (i10 * 13) + i9;
                int i14 = iArr2[0];
                bArr8[i13] = (byte) i14;
                int i15 = i13 + 1;
                byte b = (byte) (i14 >> 8);
                bArr8[i15] = b;
                int i16 = iArr2[c10];
                bArr8[i15] = (byte) (b | ((byte) (i16 << 5)));
                bArr8[i13 + 2] = (byte) (i16 >> 3);
                int i17 = i13 + 3;
                byte b2 = (byte) (i16 >> 11);
                bArr8[i17] = b2;
                int i18 = iArr2[c11];
                bArr8[i17] = (byte) (b2 | ((byte) (i18 << 2)));
                int i19 = i13 + 4;
                byte b3 = (byte) (i18 >> 6);
                bArr8[i19] = b3;
                int i20 = iArr2[c12];
                bArr8[i19] = (byte) (b3 | ((byte) (i20 << 7)));
                bArr8[i13 + 5] = (byte) (i20 >> 1);
                int i21 = i13 + 6;
                byte b4 = (byte) (i20 >> 9);
                bArr8[i21] = b4;
                int i22 = iArr2[c9];
                bArr8[i21] = (byte) (b4 | ((byte) (i22 << 4)));
                bArr8[i13 + 7] = (byte) (i22 >> 4);
                int i23 = i13 + 8;
                byte b5 = (byte) (i22 >> 12);
                bArr8[i23] = b5;
                int i24 = iArr2[c7];
                bArr8[i23] = (byte) (b5 | ((byte) (i24 << 1)));
                int i25 = i13 + 9;
                byte b6 = (byte) (i24 >> 7);
                bArr8[i25] = b6;
                int i26 = iArr2[c8];
                bArr8[i25] = (byte) (b6 | ((byte) (i26 << 6)));
                bArr8[i13 + 10] = (byte) (i26 >> 2);
                int i27 = i13 + 11;
                byte b7 = (byte) (i26 >> 10);
                bArr8[i27] = b7;
                int i28 = iArr2[7];
                bArr8[i27] = (byte) (b7 | ((byte) (i28 << 3)));
                bArr8[i13 + 12] = (byte) (i28 >> 5);
                i10++;
                c5 = c9;
                c2 = c10;
                c3 = c11;
                c4 = c12;
                i8 = i12;
            }
            c10111l.getClass();
            i8++;
            c6 = c7;
            c = c8;
        }
        char c13 = c6;
        char c14 = c;
        char c15 = c5;
        char c16 = c2;
        char c17 = c3;
        char c18 = c4;
        byte[] bArr9 = bArr7[0];
        byte[] bArr10 = bArr7[c16];
        byte[] bArr11 = bArr7[c17];
        byte[] bArr12 = bArr7[c18];
        byte[] bArr13 = bArr7[c15];
        byte[] bArr14 = bArr7[c13];
        byte[][] bArr15 = new byte[8][];
        bArr15[0] = bArr9;
        bArr15[c16] = bArr10;
        bArr15[c17] = bArr11;
        bArr15[c18] = bArr12;
        bArr15[c15] = bArr13;
        bArr15[c13] = bArr14;
        bArr15[c14] = bArrFirebase;
        bArr15[7] = bArr;
        return bArr15;
    }

    public final boolean yandex(byte[] bArr, byte[] bArr2, int i, C17951l c17951l, byte[] bArr3, byte[] bArr4) {
        int i2;
        C10111l[] c10111lArr;
        if (i != this.startapp) {
            return false;
        }
        C10111l[] c10111lArr2 = (C10111l[]) new C10975l(this).f22121l;
        C1770l c1770l = new C1770l(this);
        C10111l[] c10111lArr3 = (C10111l[]) c1770l.f4179l;
        int i3 = 0;
        while (true) {
            int i4 = this.vip;
            int i5 = this.crashlytics;
            int i6 = this.mopub;
            if (i3 < i6) {
                C10111l c10111l = c10111lArr3[i3];
                int i7 = (i3 * i5) + i4;
                i3++;
                byte[] bArrVip = AbstractC14024l.vip(i7, (i5 * i3) + i4, bArr2);
                int i8 = ((C5775l) c10111l.f20586l).firebase;
                if (i8 == 131072) {
                    int i9 = 0;
                    for (int i10 = 64; i9 < i10; i10 = 64) {
                        int i11 = i9 * 4;
                        int i12 = i9 * 9;
                        int i13 = (bArrVip[i12] & 255) | ((bArrVip[i12 + 1] & 255) << 8);
                        int i14 = bArrVip[i12 + 2] & 255;
                        C10111l[] c10111lArr4 = c10111lArr2;
                        int[] iArr = (int[]) c10111l.f20587l;
                        iArr[i11] = (i13 | (i14 << 16)) & 262143;
                        int i15 = i11 + 1;
                        int i16 = ((bArrVip[i12 + 3] & 255) << 6) | (i14 >>> 2);
                        int i17 = bArrVip[i12 + 4] & 255;
                        iArr[i15] = (i16 | (i17 << 14)) & 262143;
                        int i18 = i11 + 2;
                        int i19 = ((bArrVip[i12 + 5] & 255) << 4) | (i17 >>> 4);
                        int i20 = bArrVip[i12 + 6] & 255;
                        iArr[i18] = (i19 | (i20 << 12)) & 262143;
                        int i21 = i11 + 3;
                        iArr[i21] = (((bArrVip[i12 + 7] & 255) << 2) | (i20 >>> 6) | ((bArrVip[i12 + 8] & 255) << 10)) & 262143;
                        iArr[i11] = i8 - iArr[i11];
                        iArr[i15] = i8 - iArr[i15];
                        iArr[i18] = i8 - iArr[i18];
                        iArr[i21] = i8 - iArr[i21];
                        i9++;
                        c10111lArr2 = c10111lArr4;
                    }
                    c10111lArr = c10111lArr2;
                } else {
                    c10111lArr = c10111lArr2;
                    if (i8 != 524288) {
                        C18073l.license("Wrong Dilithium Gamma1!");
                        return false;
                    }
                    for (int i22 = 0; i22 < 128; i22++) {
                        int i23 = i22 * 2;
                        int i24 = i22 * 5;
                        int i25 = (bArrVip[i24] & 255) | ((bArrVip[i24 + 1] & 255) << 8);
                        int i26 = bArrVip[i24 + 2] & 255;
                        int[] iArr2 = (int[]) c10111l.f20587l;
                        iArr2[i23] = (i25 | (i26 << 16)) & 1048575;
                        int i27 = i23 + 1;
                        iArr2[i27] = (((bArrVip[i24 + 3] & 255) << 4) | (i26 >>> 4) | ((bArrVip[i24 + 4] & 255) << 12)) & 1048575;
                        iArr2[i23] = i8 - iArr2[i23];
                        iArr2[i27] = i8 - iArr2[i27];
                    }
                }
                c10111lArr2 = c10111lArr;
            } else {
                C10111l[] c10111lArr5 = c10111lArr2;
                int i28 = (i6 * i5) + i4;
                int i29 = 0;
                int i30 = 0;
                while (true) {
                    int i31 = this.billing;
                    boolean z = true;
                    int i32 = this.remoteconfig;
                    if (i29 < i31) {
                        for (int i33 = 0; i33 < 256; i33++) {
                            ((int[]) c10111lArr5[i29].f20587l)[i33] = 0;
                        }
                        int i34 = i28 + i32 + i29;
                        int i35 = bArr2[i34] & 255;
                        if (i35 < i30 || i35 > i32) {
                            return false;
                        }
                        int i36 = i30;
                        while (true) {
                            i2 = bArr2[i34];
                            if (i36 < (i2 & 255)) {
                                if (i36 > i30) {
                                    int i37 = i28 + i36;
                                    if ((bArr2[i37] & 255) <= (bArr2[i37 - 1] & 255)) {
                                        return false;
                                    }
                                }
                                ((int[]) c10111lArr5[i29].f20587l)[bArr2[i28 + i36] & 255] = 1;
                                i36++;
                            }
                        }
                        i29++;
                        i30 = i2;
                    } else {
                        while (i30 < i32) {
                            if ((bArr2[i28 + i30] & 255) != 0) {
                                return false;
                            }
                            i30++;
                        }
                        int i38 = this.firebase - this.isPro;
                        for (C10111l c10111l2 : c10111lArr3) {
                            if (c10111l2.remoteconfig(i38)) {
                                return false;
                            }
                        }
                        C10111l c10111l3 = new C10111l(this);
                        C3316l c3316l = new C3316l(this);
                        C10975l c10975l = new C10975l(this);
                        C10111l[] c10111lArr6 = (C10111l[]) c10975l.f22121l;
                        C10975l c10975l2 = new C10975l(this);
                        int i39 = 0;
                        while (i39 < i31) {
                            C10111l c10111l4 = c10111lArr6[i39];
                            boolean z2 = z;
                            int i40 = i39 * 320;
                            i39++;
                            int i41 = i31;
                            byte[] bArrVip2 = AbstractC14024l.vip(i40, i39 * 320, bArr4);
                            c10111l4.getClass();
                            for (int i42 = 0; i42 < 64; i42++) {
                                int i43 = i42 * 4;
                                int i44 = i42 * 5;
                                int i45 = bArrVip2[i44] & 255;
                                int i46 = bArrVip2[i44 + 1] & 255;
                                int i47 = (i45 | (i46 << 8)) & 1023;
                                int[] iArr3 = (int[]) c10111l4.f20587l;
                                iArr3[i43] = i47;
                                int i48 = i43 + 1;
                                int i49 = i46 >> 2;
                                int i50 = bArrVip2[i44 + 2] & 255;
                                iArr3[i48] = (i49 | (i50 << 6)) & 1023;
                                int i51 = i43 + 2;
                                int i52 = i50 >> 4;
                                int i53 = bArrVip2[i44 + 3] & 255;
                                iArr3[i51] = (i52 | (i53 << 4)) & 1023;
                                iArr3[i43 + 3] = ((i53 >> 6) | ((bArrVip2[i44 + 4] & 255) << 2)) & 1023;
                            }
                            z = z2;
                            i31 = i41;
                        }
                        int i54 = i31;
                        boolean z3 = z;
                        c10111l3.smaato(i4, bArr2);
                        c3316l.smaato(bArr3);
                        c1770l.remoteconfig();
                        c3316l.metrica(c10975l2, c1770l);
                        c10111l3.signatures();
                        for (C10111l c10111l5 : c10111lArr6) {
                            for (int i55 = 0; i55 < 256; i55++) {
                                int[] iArr4 = (int[]) c10111l5.f20587l;
                                iArr4[i55] = iArr4[i55] << 13;
                            }
                            c10111l5.getClass();
                        }
                        c10975l.m3020native();
                        c10975l.m3025volatile(c10111l3, c10975l);
                        c10975l2.m3015continue(c10975l);
                        c10975l2.m3012case();
                        c10975l2.appmetrica();
                        c10975l2.signatures();
                        int i56 = 0;
                        while (true) {
                            C10111l[] c10111lArr7 = (C10111l[]) c10975l2.f22121l;
                            if (i56 >= c10111lArr7.length) {
                                c10975l2.m3023synchronized(this, bArr, 64);
                                c17951l.billing(0, (i54 * this.amazon) + 64, bArr);
                                c17951l.crashlytics(0, i4, bArr);
                                return AbstractC14024l.firebase(bArr2, i4, 0, bArr, 0);
                            }
                            C10111l c10111l6 = c10111lArr7[i56];
                            C10111l c10111l7 = c10111lArr5[i56];
                            c10111l6.getClass();
                            for (int i57 = 0; i57 < 256; i57++) {
                                int i58 = ((int[]) c10111l6.f20587l)[i57];
                                int i59 = ((int[]) c10111l7.f20587l)[i57];
                                int i60 = ((C5775l) c10111l6.f20586l).smaato;
                                int[] iArrCrashlytics = AbstractC4107l.crashlytics(i58, i60);
                                int i61 = iArrCrashlytics[0];
                                int i62 = iArrCrashlytics[z3 ? 1 : 0];
                                if (i59 != 0) {
                                    if (i60 == 261888) {
                                        i62 = (i61 > 0 ? i62 + 1 : i62 - 1) & 15;
                                    } else {
                                        if (i60 != 95232) {
                                            C18073l.license("Wrong Gamma2!");
                                            return false;
                                        }
                                        if (i61 > 0) {
                                            i62 = i62 == 43 ? 0 : i62 + 1;
                                        } else {
                                            i62 = i62 == 0 ? 43 : i62 - 1;
                                        }
                                    }
                                }
                                ((int[]) c10111l6.f20587l)[i57] = i62;
                            }
                            i56++;
                        }
                    }
                }
            }
        }
    }
}
