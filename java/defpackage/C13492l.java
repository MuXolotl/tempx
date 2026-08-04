package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lْٛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13492l extends AbstractC14165l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f26489l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public AbstractC8939l f26490l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C14174l f26491l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f26492l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final List f26493l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C1412l f26494l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final long f26495l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C2549l f26496l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C0093l f26497l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public float f26498l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final String f26499l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C7375l f26500l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final List f26501l;

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    /* JADX WARN: Code duplicated, block: B:382:0x0605  */
    /* JADX WARN: Code duplicated, block: B:385:0x0618  */
    /* JADX WARN: Code duplicated, block: B:388:0x0629  */
    /* JADX WARN: Code duplicated, block: B:391:0x0636  */
    /* JADX WARN: Code duplicated, block: B:394:0x0643  */
    /* JADX WARN: Code duplicated, block: B:397:0x064c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0651  */
    /* JADX WARN: Code duplicated, block: B:403:0x0656  */
    /* JADX WARN: Code duplicated, block: B:405:0x065e  */
    /* JADX WARN: Code duplicated, block: B:408:0x0666  */
    /* JADX WARN: Code duplicated, block: B:409:0x066c  */
    /* JADX WARN: Code duplicated, block: B:412:0x067a  */
    /* JADX WARN: Code duplicated, block: B:504:0x0601 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v1, types: [java.lang.Throwable] */
    public C13492l(String str, C2549l c2549l) {
        EnumC3738l enumC3738l;
        AbstractC5890l c13561l;
        AbstractC5890l c13561l2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C9754l[] c9754lArr;
        int i7;
        boolean z;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        C14706l[] c14706lArr;
        C14706l c14706l;
        int[] iArr;
        int i12;
        C11775l c11775l = c2549l.crashlytics;
        this.f26498l = 1.0f;
        this.f26497l = new C0093l();
        this.f26494l = new C1412l(20, this);
        this.f26499l = str;
        this.f26496l = c2549l;
        C16222l c16222l = c2549l.yandex.yandex;
        float f = c11775l.yandex;
        C9389l c9389l = c11775l.loadAd;
        c9389l.getClass();
        float f2 = f * 1.0f;
        int i13 = 3;
        if (AbstractC8576l.yandex(c9389l, C9389l.yandex)) {
            enumC3738l = EnumC3738l.Low;
        } else if (0.0f > 1.25f) {
            enumC3738l = EnumC3738l.High;
        } else {
            double d = f2;
            if (d > 0.3d) {
                enumC3738l = EnumC3738l.High;
            } else {
                enumC3738l = (0.2d > d || d > 0.3d || AbstractC5020l.subs(1, 3) >= 0) ? (f2 <= 0.05f || AbstractC5020l.subs(1, 2) >= 0) ? EnumC3738l.Auto : EnumC3738l.Medium : EnumC3738l.MediumHigh;
            }
        }
        int i14 = enumC3738l.f7824l;
        int iInmobi = AbstractC5020l.inmobi(Pattern.compile("^[0-9A-Z $%*+\\-./:]+$").matcher(str).matches() ? Pattern.compile("^\\d+$").matcher(str).matches() ? 1 : 2 : 3);
        int i15 = 0;
        C14706l c14706l2 = null;
        if (iInmobi == 0) {
            c13561l = new C13561l(1, 1, str);
        } else if (iInmobi == 1) {
            c13561l = new C13561l(2, 0, str);
        } else {
            if (iInmobi != 2) {
                C18725l.billing();
                throw null;
            }
            c13561l = new C4811l(str);
        }
        int i16 = Pattern.compile("^[0-9A-Z $%*+\\-./:]+$").matcher(str).matches() ? Pattern.compile("^\\d+$").matcher(str).matches() ? 1 : 2 : 3;
        int iInmobi2 = AbstractC5020l.inmobi(i16);
        if (iInmobi2 == 0) {
            c13561l2 = new C13561l(1, 1, str);
        } else if (iInmobi2 == 1) {
            c13561l2 = new C13561l(2, 0, str);
        } else {
            if (iInmobi2 != 2) {
                C18725l.billing();
                throw null;
            }
            c13561l2 = new C4811l(str);
        }
        int iYandex = c13561l2.yandex();
        if (i14 == 1) {
            i = 21;
        } else if (i14 == 2) {
            i = 25;
        } else if (i14 == 3) {
            i = 30;
        } else {
            if (i14 != 4) {
                throw null;
            }
            i = 34;
        }
        int i17 = 1;
        while (true) {
            if (i17 >= i) {
                i17 = 40;
                break;
            } else if (iYandex <= AbstractC13628l.loadAd[i17 - 1][AbstractC5020l.inmobi(i14)][AbstractC5020l.inmobi(i16)]) {
                break;
            } else {
                i17++;
            }
        }
        int i18 = i17 * 4;
        int i19 = i18 + 17;
        C14706l[][] c14706lArr2 = new C14706l[i19][];
        int i20 = 0;
        while (i20 < i19) {
            C14706l[] c14706lArr3 = new C14706l[i19];
            C14706l c14706l3 = c14706l2;
            for (int i21 = 0; i21 < i19; i21++) {
                c14706lArr3[i21] = c14706l3;
            }
            c14706lArr2[i20] = c14706lArr3;
            i20++;
            c14706l2 = c14706l3;
        }
        ?? r41 = c14706l2;
        AbstractC0441l.isPro(0, 0, c14706lArr2);
        int i22 = i18 + 10;
        AbstractC0441l.isPro(i22, 0, c14706lArr2);
        AbstractC0441l.isPro(0, i22, c14706lArr2);
        int i23 = i17 - 1;
        int[] iArr2 = AbstractC13628l.yandex[i23];
        int length = iArr2.length;
        while (i15 < length) {
            int length2 = iArr2.length;
            int i24 = 0;
            while (i24 < length2) {
                int i25 = iArr2[i15];
                int i26 = iArr2[i24];
                if (c14706lArr2[i25][i26] == null) {
                    int i27 = -2;
                    while (i27 < i13) {
                        int i28 = i18;
                        int i29 = -2;
                        while (i29 < i13) {
                            C16222l c16222l2 = c16222l;
                            int i30 = length2;
                            c14706lArr2[i25 + i27][i26 + i29] = new C14706l(i27 == -2 || i27 == 2 || i29 == -2 || i29 == 2 || (i27 == 0 && i29 == 0), 5);
                            i29++;
                            length2 = i30;
                            c16222l = c16222l2;
                            i13 = 3;
                        }
                        i27++;
                        i18 = i28;
                        i13 = 3;
                    }
                }
                i24++;
                length2 = length2;
                i18 = i18;
                c16222l = c16222l;
                i13 = 3;
            }
            i15++;
            i13 = 3;
        }
        int i31 = i18;
        C16222l c16222l3 = c16222l;
        int i32 = i31 + 9;
        int i33 = 8;
        for (int i34 = 8; i34 < i32; i34++) {
            C14706l[] c14706lArr4 = c14706lArr2[i34];
            if (c14706lArr4[6] == null) {
                c14706lArr4[6] = new C14706l(i34 % 2 == 0, 5);
            }
        }
        for (int i35 = 8; i35 < i32; i35++) {
            C14706l[] c14706lArr5 = c14706lArr2[6];
            if (c14706lArr5[i35] == null) {
                c14706lArr5[i35] = new C14706l(i35 % 2 == 0, 5);
            }
        }
        if (i14 == 1) {
            i2 = 3;
            i3 = 1;
        } else if (i14 != 2) {
            i2 = 3;
            if (i14 == 3) {
                i3 = 3;
            } else {
                if (i14 != 4) {
                    throw r41;
                }
                i3 = 2;
            }
        } else {
            i2 = 3;
            i3 = 0;
        }
        int iInmobi3 = (i3 << i2) | AbstractC5020l.inmobi(1);
        int i36 = 10;
        int i37 = iInmobi3 << 10;
        int i38 = i37;
        while (true) {
            int i39 = 0;
            for (int i40 = i38; i40 != 0; i40 >>>= 1) {
                i39++;
            }
            int i41 = 0;
            for (int i42 = 1335; i42 != 0; i42 >>>= 1) {
                i41++;
            }
            if (i39 - i41 < 0) {
                break;
            }
            int i43 = 0;
            for (int i44 = i38; i44 != 0; i44 >>>= 1) {
                i43++;
            }
            int i45 = 0;
            for (int i46 = 1335; i46 != 0; i46 >>>= 1) {
                i45++;
            }
            i38 ^= 1335 << (i43 - i45);
        }
        int i47 = (i37 | i38) ^ 21522;
        int i48 = 0;
        while (true) {
            if (i48 >= 15) {
                break;
            }
            boolean z3 = ((i47 >> i48) & 1) == 1;
            if (i48 < 6) {
                AbstractC0441l.subs(i48, 8, z3, c14706lArr2);
            } else if (i48 < 8) {
                AbstractC0441l.subs(i48 + 1, 8, z3, c14706lArr2);
            } else {
                AbstractC0441l.subs(i31 + 2 + i48, 8, z3, c14706lArr2);
            }
            i48++;
        }
        int i49 = 0;
        for (i4 = 15; i49 < i4; i4 = 15) {
            boolean z4 = ((i47 >> i49) & 1) == 1;
            if (i49 < 8) {
                AbstractC0441l.subs(8, (i19 - i49) - 1, z4, c14706lArr2);
            } else if (i49 < 9) {
                AbstractC0441l.subs(8, 15 - i49, z4, c14706lArr2);
            } else {
                AbstractC0441l.subs(8, 14 - i49, z4, c14706lArr2);
            }
            i49++;
        }
        AbstractC0441l.subs(i32, 8, true, c14706lArr2);
        int i50 = 7;
        int i51 = 11;
        if (i17 >= 7) {
            int i52 = i17 << 12;
            int i53 = i52;
            while (true) {
                int i54 = 0;
                for (int i55 = i53; i55 != 0; i55 >>>= 1) {
                    i54++;
                }
                int i56 = 0;
                for (int i57 = 7973; i57 != 0; i57 >>>= 1) {
                    i56++;
                }
                if (i54 - i56 < 0) {
                    break;
                }
                int i58 = 0;
                for (int i59 = i53; i59 != 0; i59 >>>= 1) {
                    i58++;
                }
                int i60 = 0;
                for (int i61 = 7973; i61 != 0; i61 >>>= 1) {
                    i60++;
                }
                i53 ^= 7973 << (i58 - i60);
            }
            int i62 = i52 | i53;
            int i63 = 0;
            while (true) {
                if (i63 >= 18) {
                    break;
                }
                int i64 = i50;
                boolean z5 = ((i62 >> i63) & 1) == 1;
                int i65 = ((i63 % 3) + i19) - 11;
                C14706l[] c14706lArr6 = c14706lArr2[i63 / 3];
                int i66 = i51;
                C14706l c14706l4 = c14706lArr6[i65];
                if (c14706l4 != null) {
                    c14706l4.f28767l = z5;
                } else {
                    c14706lArr6[i65] = new C14706l(z5, 5);
                }
                i63++;
                i50 = i64;
                i51 = i66;
            }
            i5 = i50;
            i6 = i51;
            int i67 = 0;
            for (i12 = 18; i67 < i12; i12 = 18) {
                boolean z6 = ((i62 >> i67) & 1) == 1;
                int i68 = i67 / 3;
                C14706l[] c14706lArr7 = c14706lArr2[((i67 % 3) + i19) - 11];
                C14706l c14706l5 = c14706lArr7[i68];
                if (c14706l5 != null) {
                    c14706l5.f28767l = z6;
                } else {
                    c14706lArr7[i68] = new C14706l(z6, 5);
                }
                i67++;
            }
        } else {
            i5 = 7;
            i6 = 11;
        }
        int[] iArr3 = C9754l.f19890l[AbstractC5020l.inmobi(i14) + (i23 * 4)];
        if (iArr3.length == 3) {
            C9754l c9754l = new C9754l(iArr3[1], iArr3[2], 1);
            int i69 = iArr3[0];
            c9754lArr = new C9754l[i69];
            for (int i70 = 0; i70 < i69; i70++) {
                c9754lArr[i70] = c9754l;
            }
        } else {
            int i71 = iArr3[0] + iArr3[3];
            C9754l c9754l2 = new C9754l(iArr3[1], iArr3[2], 1);
            C9754l c9754l3 = new C9754l(iArr3[4], iArr3[5], 1);
            C9754l[] c9754lArr2 = new C9754l[i71];
            int i72 = 0;
            while (i72 < i71) {
                c9754lArr2[i72] = i72 < iArr3[0] ? c9754l2 : c9754l3;
                i72++;
            }
            c9754lArr = c9754lArr2;
        }
        C16535l c16535l = new C16535l((byte) 0, 0);
        char c = ' ';
        c16535l.loadAd = new int[32];
        c16535l.crashlytics = 0;
        int i73 = c13561l.loadAd;
        if (i73 == 1) {
            i7 = 1;
        } else if (i73 == 2) {
            i7 = 2;
        } else {
            if (i73 != 3) {
                throw r41;
            }
            i7 = 4;
        }
        c16535l.admob(i7, 4);
        int iYandex2 = c13561l.yandex();
        if (1 <= i17 && i17 < 10) {
            int iInmobi4 = AbstractC5020l.inmobi(i73);
            if (iInmobi4 != 0) {
                if (iInmobi4 == 1) {
                    i36 = 9;
                } else {
                    if (iInmobi4 != 2) {
                        C18725l.billing();
                        throw r41;
                    }
                    i36 = 8;
                }
            }
        } else if (1 <= i17 && i17 < 27) {
            int iInmobi5 = AbstractC5020l.inmobi(i73);
            if (iInmobi5 == 0) {
                i36 = 12;
            } else if (iInmobi5 != 1) {
                if (iInmobi5 != 2) {
                    C18725l.billing();
                    throw r41;
                }
                i36 = 16;
            } else {
                i36 = i6;
            }
        } else {
            if (1 > i17 || i17 >= 41) {
                C8339l.metrica(AbstractC0653l.vip(i17, "'type' must be greater than 0 and cannot be greater than 40: "));
                throw r41;
            }
            int iInmobi6 = AbstractC5020l.inmobi(i73);
            if (iInmobi6 == 0) {
                i36 = 14;
            } else if (iInmobi6 != 1) {
                if (iInmobi6 != 2) {
                    C18725l.billing();
                    throw r41;
                }
                i36 = 16;
            } else {
                i36 = 13;
            }
        }
        c16535l.admob(iYandex2, i36);
        c13561l.loadAd(c16535l);
        int i74 = 0;
        for (C9754l c9754l4 : c9754lArr) {
            i74 += c9754l4.f19892l;
        }
        int i75 = i74 * 8;
        int i76 = c16535l.crashlytics;
        if (i76 > i75) {
            C8339l.metrica(AbstractC12589l.applovin(i76, i75, "Code length overflow (", " > ", ")"));
            throw r41;
        }
        if (i76 + 4 <= i75) {
            z = false;
            c16535l.admob(0, 4);
        } else {
            z = false;
        }
        while (c16535l.crashlytics % 8 != 0) {
            c16535l.subs(z);
        }
        while (c16535l.crashlytics < i75) {
            c16535l.admob(236, i33);
            if (c16535l.crashlytics >= i75) {
                break;
            }
            char c2 = c;
            int i77 = i33;
            c16535l.admob(17, i77);
            i33 = i77;
            c = c2;
        }
        int length3 = c9754lArr.length;
        int[][] iArr4 = new int[length3][];
        for (int i78 = 0; i78 < length3; i78++) {
            iArr4[i78] = new int[0];
        }
        int i79 = 0;
        int length4 = c9754lArr.length;
        int[][] iArr5 = new int[length4][];
        int i80 = 0;
        while (i80 < length4) {
            iArr5[i80] = new int[i79];
            i80++;
            i79 = 0;
        }
        int length5 = c9754lArr.length;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = 0;
        int i85 = 0;
        int i86 = 0;
        while (i81 < length5) {
            char c3 = c;
            C9754l c9754l5 = c9754lArr[i81];
            int i87 = i84 + 1;
            int i88 = c9754l5.f19892l;
            int i89 = c9754l5.f19893l;
            int i90 = length5;
            int i91 = i89 - i88;
            i82 += i89;
            i83 = i83 < i88 ? i88 : i83;
            i85 = i85 < i91 ? i91 : i85;
            int[] iArr6 = new int[i88];
            int[][] iArr7 = iArr4;
            int i92 = 0;
            while (i92 < i88) {
                int i93 = i92;
                iArr6[i93] = c16535l.loadAd[i93 + i86] & 255;
                i92 = i93 + 1;
            }
            iArr7[i84] = iArr6;
            i86 += i88;
            C5501l c5501l = new C5501l(new int[]{1}, 0);
            int i94 = 0;
            while (true) {
                iArr = (int[]) c5501l.f11764l;
                if (i94 >= i91) {
                    break;
                }
                int i95 = i91;
                int[][] iArr8 = iArr5;
                C5501l c5501l2 = new C5501l(new int[]{1, AbstractC8422l.yandex(i94)}, 0);
                int length6 = iArr.length;
                int[] iArr9 = (int[]) c5501l2.f11764l;
                int i96 = 0;
                int length7 = (length6 + iArr9.length) - 1;
                int[] iArr10 = new int[length7];
                int i97 = i81;
                int i98 = 0;
                while (i98 < length7) {
                    iArr10[i98] = i96;
                    i98++;
                    i96 = 0;
                }
                int length8 = iArr.length;
                int i99 = 0;
                while (i99 < length8) {
                    int i100 = length8;
                    int length9 = iArr9.length;
                    int[] iArr11 = iArr9;
                    for (int i101 = 0; i101 < length9; i101++) {
                        int i102 = i99 + i101;
                        int i103 = iArr10[i102];
                        int i104 = iArr[i99];
                        int[] iArr12 = AbstractC8422l.loadAd;
                        iArr10[i102] = i103 ^ AbstractC8422l.yandex(iArr12[i104] + iArr12[iArr11[i101]]);
                    }
                    i99++;
                    length8 = i100;
                    iArr9 = iArr11;
                }
                c5501l = new C5501l(iArr10, 0);
                i94++;
                i91 = i95;
                iArr5 = iArr8;
                i81 = i97;
            }
            int[][] iArr13 = iArr5;
            int i105 = i81;
            C5501l c5501lM1816l = new C5501l(iArr7[i84], iArr.length - 1).m1816l(c5501l);
            int length10 = iArr.length - 1;
            int[] iArr14 = new int[length10];
            for (int i106 = 0; i106 < length10; i106++) {
                int[] iArr15 = (int[]) c5501lM1816l.f11764l;
                int length11 = (iArr15.length + i106) - length10;
                iArr14[i106] = length11 >= 0 ? iArr15[length11] : 0;
            }
            iArr13[i84] = iArr14;
            i81 = i105 + 1;
            c = c3;
            i84 = i87;
            length5 = i90;
            iArr4 = iArr7;
            iArr5 = iArr13;
        }
        int[][] iArr16 = iArr4;
        char c4 = c;
        int[][] iArr17 = iArr5;
        int[] iArr18 = new int[i82];
        int i107 = 0;
        for (int i108 = 0; i108 < i83; i108++) {
            int length12 = c9754lArr.length;
            for (int i109 = 0; i109 < length12; i109++) {
                int[] iArr19 = iArr16[i109];
                if (i108 < iArr19.length) {
                    iArr18[i107] = iArr19[i108];
                    i107++;
                }
            }
        }
        for (int i110 = 0; i110 < i85; i110++) {
            int length13 = c9754lArr.length;
            for (int i111 = 0; i111 < length13; i111++) {
                int[] iArr20 = iArr17[i111];
                if (i110 < iArr20.length) {
                    iArr18[i107] = iArr20[i110];
                    i107++;
                }
            }
        }
        int i112 = i31 + 16;
        int i113 = i112;
        int i114 = -1;
        int i115 = i5;
        int i116 = 0;
        while (i112 > 0) {
            i112 = i112 == 6 ? i112 - 1 : i112;
            while (true) {
                int i117 = 0;
                while (i117 < 2) {
                    int i118 = i112 - i117;
                    if (c14706lArr2[i113][i118] == null) {
                        if (i116 < i82) {
                            i9 = 1;
                            z2 = ((iArr18[i116] >>> i115) & 1) == 1;
                            switch (AbstractC5020l.inmobi(i9)) {
                                case 0:
                                    if ((i113 + i118) % 2 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 1:
                                    if (i113 % 2 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 2:
                                    if (i118 % 3 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 3:
                                    if ((i113 + i118) % 3 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 4:
                                    if (((i118 / 3) + (i113 / 2)) % 2 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 5:
                                    i10 = i113 * i118;
                                    if ((i10 % 3) + (i10 % 2) == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 6:
                                    i11 = i113 * i118;
                                    if (((i11 % 3) + (i11 % 2)) % 2 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                case 7:
                                    if ((((i113 + i118) % 2) + ((i113 * i118) % 3)) % 2 == 0) {
                                        z2 = !z2;
                                    }
                                    c14706lArr = c14706lArr2[i113];
                                    c14706l = c14706lArr[i118];
                                    if (c14706l != null) {
                                        c14706l.f28767l = z2;
                                    } else {
                                        c14706lArr[i118] = new C14706l(z2, 5);
                                    }
                                    i115--;
                                    if (i115 == -1) {
                                        i116++;
                                        i115 = i5;
                                    }
                                    break;
                                default:
                                    C18725l.billing();
                                    throw r41;
                            }
                        } else {
                            i9 = 1;
                        }
                        switch (AbstractC5020l.inmobi(i9)) {
                            case 0:
                                if ((i113 + i118) % 2 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 1:
                                if (i113 % 2 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 2:
                                if (i118 % 3 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 3:
                                if ((i113 + i118) % 3 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 4:
                                if (((i118 / 3) + (i113 / 2)) % 2 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 5:
                                i10 = i113 * i118;
                                if ((i10 % 3) + (i10 % 2) == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 6:
                                i11 = i113 * i118;
                                if (((i11 % 3) + (i11 % 2)) % 2 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            case 7:
                                if ((((i113 + i118) % 2) + ((i113 * i118) % 3)) % 2 == 0) {
                                    z2 = !z2;
                                }
                                c14706lArr = c14706lArr2[i113];
                                c14706l = c14706lArr[i118];
                                if (c14706l != null) {
                                    c14706l.f28767l = z2;
                                } else {
                                    c14706lArr[i118] = new C14706l(z2, 5);
                                }
                                i115--;
                                if (i115 == -1) {
                                    i116++;
                                    i115 = i5;
                                }
                                break;
                            default:
                                C18725l.billing();
                                throw r41;
                        }
                    } else {
                        i112 = i112;
                    }
                    i117++;
                    i112 = i112;
                }
                i8 = i112;
                i113 += i114;
                if (i113 < 0 || i19 <= i113) {
                    break;
                } else {
                    i112 = i8;
                }
            }
            i113 -= i114;
            i114 = -i114;
            i112 = i8 - 2;
        }
        ArrayList arrayList = new ArrayList(i19);
        for (int i119 = 0; i119 < i19; i119++) {
            C14706l[] c14706lArr8 = c14706lArr2[i119];
            ArrayList arrayList2 = new ArrayList(c14706lArr8.length);
            int length14 = c14706lArr8.length;
            for (int i120 = 0; i120 < length14; i120++) {
                C14706l c14706l6 = c14706lArr8[i120];
                arrayList2.add((c14706l6 == null || !c14706l6.f28767l) ? EnumC10718l.f21715l : EnumC10718l.f21716l);
            }
            arrayList.add(arrayList2);
        }
        C7375l c7375l = new C7375l(1, arrayList);
        int i121 = c7375l.yandex;
        this.f26489l = i121;
        c16222l3.getClass();
        this.f26500l = c7375l;
        float f3 = i121 * 10.0f;
        this.f26495l = (((long) Float.floatToRawIntBits(f3)) << c4) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
        int i122 = 0 / 2;
        this.f26492l = i122;
        int i123 = i122 + 2;
        int i124 = (i121 - 5) + i122;
        ArrayList arrayListMetrica = AbstractC14055l.metrica(new C8195l(Integer.valueOf(i123), Integer.valueOf(i123)), new C8195l(Integer.valueOf(i123), Integer.valueOf(i124)), new C8195l(Integer.valueOf(i124), Integer.valueOf(i123)));
        this.f26496l.getClass();
        this.f26493l = AbstractC16901l.m4213const(arrayListMetrica);
        int i125 = (i121 - 7) + i122;
        ArrayList arrayListMetrica2 = AbstractC14055l.metrica(new C8195l(Integer.valueOf(i122), Integer.valueOf(i122)), new C8195l(Integer.valueOf(i122), Integer.valueOf(i125)), new C8195l(Integer.valueOf(i125), Integer.valueOf(i122)));
        this.f26496l.getClass();
        this.f26501l = AbstractC16901l.m4213const(arrayListMetrica2);
    }

    public final boolean adcel() {
        return this.f26496l.loadAd.loadAd.loadAd() == 2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public final boolean ads(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f26492l;
        int i8 = i - i7;
        if (-1 > i8 || i8 >= 8 || -1 > (i6 = i2 - i7) || i6 >= 8) {
            int i9 = i - i7;
            int i10 = this.f26489l;
            if (-1 > i9 || i9 >= 8) {
                i3 = i10 - 8;
                int i11 = i10 + 1;
                i4 = i - i7;
                if (i3 <= i4 || i4 >= i11 || -1 > (i5 = i2 - i7) || i5 >= 8) {
                    this.f26496l.getClass();
                    return false;
                }
            } else {
                int i12 = i10 + 1;
                int i13 = i2 - i7;
                if (i10 - 8 > i13 || i13 >= i12) {
                    i3 = i10 - 8;
                    int i14 = i10 + 1;
                    i4 = i - i7;
                    if (i3 <= i4) {
                    }
                    this.f26496l.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f26498l = f;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13492l.class != obj.getClass()) {
            return false;
        }
        C13492l c13492l = (C13492l) obj;
        return AbstractC8576l.yandex(this.f26499l, c13492l.f26499l) && AbstractC8576l.yandex(this.f26496l, c13492l.f26496l);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0171  */
    public final C8195l firebase(float f) {
        int i;
        int i2;
        int i3;
        C9902l c9902l;
        C13492l c13492l = this;
        float f2 = f;
        C9902l c9902lYandex = AbstractC3478l.yandex();
        c9902lYandex.isPro(1);
        C9902l c9902lYandex2 = AbstractC3478l.yandex();
        c9902lYandex2.isPro(1);
        C2549l c2549l = c13492l.f26496l;
        float f3 = 7.0f * f2;
        C1045l c1045l = new C1045l(new C12123l(AbstractC3478l.yandex(), c2549l.yandex.purchase, f3), new C9987l(), c13492l, f3);
        float f4 = 3.0f * f2;
        C1045l c1045l2 = new C1045l(new C12123l(AbstractC3478l.yandex(), c2549l.yandex.amazon, f4), new C9987l(), c13492l, f4);
        InterfaceC1519l interfaceC1519l = c2549l.yandex.loadAd;
        C9902l c9902lYandex3 = AbstractC3478l.yandex();
        InterfaceC1519l interfaceC1519l2 = c2549l.yandex.crashlytics;
        C9902l c9902lYandex4 = AbstractC3478l.yandex();
        C7375l c7375l = c13492l.f26500l;
        int i4 = c7375l.yandex;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = 0;
            for (int i7 = c7375l.yandex; i6 < i7; i7 = i3) {
                C1045l c1045l3 = c1045l;
                C4565l c4565lSubs = AbstractC13457l.subs(c7375l, i5, i6);
                C1045l c1045l4 = c1045l2;
                boolean zAdmob = AbstractC5711l.admob(c2549l.loadAd.amazon);
                int i8 = c13492l.f26492l;
                int i9 = c13492l.f26489l;
                if (zAdmob || c13492l.startapp()) {
                    i = i9;
                    i2 = i4;
                    i3 = i7;
                } else {
                    i = i9;
                    int i10 = i5 - i8;
                    if (i10 == 0 && i6 - i8 == 0) {
                        i2 = i4;
                        i3 = i7;
                    } else {
                        i2 = i4;
                        if (i10 == 0) {
                            i3 = i7;
                            if (i6 - i8 != i - 7) {
                            }
                        } else {
                            i3 = i7;
                        }
                        if (i10 != i - 7 || i6 - i8 != 0) {
                            c2549l.getClass();
                        }
                        c9902l = c9902lYandex4;
                        i6++;
                        c13492l = this;
                        f2 = f;
                        c9902lYandex4 = c9902l;
                        interfaceC1519l2 = interfaceC1519l2;
                        c1045l = c1045l3;
                        c1045l2 = c1045l4;
                        i4 = i2;
                    }
                    interfaceC1519l2 = interfaceC1519l2;
                    c9902lYandex4 = c9902lYandex4;
                    c9902lYandex.yandex((C9902l) c1045l3.invoke(), (((long) Float.floatToRawIntBits(i5 * f2)) << 32) | (((long) Float.floatToRawIntBits(i6 * f2)) & 4294967295L));
                    c9902l = c9902lYandex4;
                    i6++;
                    c13492l = this;
                    f2 = f;
                    c9902lYandex4 = c9902l;
                    interfaceC1519l2 = interfaceC1519l2;
                    c1045l = c1045l3;
                    c1045l2 = c1045l4;
                    i4 = i2;
                }
                if (!AbstractC5711l.admob(c2549l.loadAd.crashlytics) && !c13492l.startapp()) {
                    int i11 = i5 - i8;
                    if ((i11 == 2 && i6 - i8 == i - 5) || ((i11 == i - 5 && i6 - i8 == 2) || (i11 == 2 && i6 - i8 == 2))) {
                        c9902lYandex.yandex((C9902l) c1045l4.invoke(), (Float.floatToRawIntBits(i5 * f2) << 32) | (((long) Float.floatToRawIntBits(i6 * f2)) & 4294967295L));
                    } else {
                        c2549l.getClass();
                        if (c13492l.ads(i5, i6)) {
                            if (!c13492l.startapp()) {
                                if (c13492l.adcel()) {
                                }
                            } else if (c13492l.adcel()) {
                            }
                        }
                    }
                    c9902l = c9902lYandex4;
                } else if (c13492l.ads(i5, i6)) {
                    if (!c13492l.startapp() && c7375l.loadAd(i5, i6) == EnumC10718l.f21716l) {
                        c9902lYandex3.subs();
                        interfaceC1519l.admob(c9902lYandex3, f2, c4565lSubs);
                        c9902lYandex.yandex(c9902lYandex3, (((long) Float.floatToRawIntBits(i6 * f2)) & 4294967295L) | (Float.floatToRawIntBits(i5 * f2) << 32));
                    } else if (c13492l.adcel() && c7375l.loadAd(i5, i6) == EnumC10718l.f21715l) {
                        c9902lYandex4.subs();
                        c9902l = c9902lYandex4;
                        interfaceC1519l2.admob(c9902l, f2, c4565lSubs);
                        c9902lYandex2.yandex(c9902l, (((long) Float.floatToRawIntBits(i5 * f2)) << 32) | (((long) Float.floatToRawIntBits(i6 * f2)) & 4294967295L));
                    }
                    c9902l = c9902lYandex4;
                } else {
                    c9902l = c9902lYandex4;
                }
                i6++;
                c13492l = this;
                f2 = f;
                c9902lYandex4 = c9902l;
                interfaceC1519l2 = interfaceC1519l2;
                c1045l = c1045l3;
                c1045l2 = c1045l4;
                i4 = i2;
            }
            i5++;
            c13492l = this;
            f2 = f;
            c1045l2 = c1045l2;
        }
        return new C8195l(c9902lYandex, c9902lYandex2);
    }

    public final int hashCode() {
        return this.f26496l.hashCode() + (this.f26499l.hashCode() * 31);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        C14174l c14174l = this.f26491l;
        boolean zLoadAd = c14174l == null ? false : C14174l.loadAd(c14174l.yandex, interfaceC13349l.admob());
        C0093l c0093l = this.f26497l;
        if (!zLoadAd) {
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() & 4294967295L))))) & 4294967295L) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32))))) << 32);
            EnumC9931l layoutDirection = interfaceC13349l.getLayoutDirection();
            C14115l c14115lYandex = (C14115l) c0093l.f1005l;
            C2151l c2151lYandex = (C2151l) c0093l.f1004l;
            if (c14115lYandex == null || c2151lYandex == null) {
                c14115lYandex = AbstractC3925l.yandex((int) (jCeil >> 32), (int) (4294967295L & jCeil), 0, 28);
                c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
                c0093l.f1005l = c14115lYandex;
                c0093l.f1004l = c2151lYandex;
            } else {
                int i = (int) (jCeil >> 32);
                Bitmap bitmap = c14115lYandex.yandex;
                if (i > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight()) {
                    c14115lYandex = AbstractC3925l.yandex((int) (jCeil >> 32), (int) (4294967295L & jCeil), 0, 28);
                    c2151lYandex = AbstractC4918l.yandex(c14115lYandex);
                    c0093l.f1005l = c14115lYandex;
                    c0093l.f1004l = c2151lYandex;
                }
            }
            c0093l.f1006l = jCeil;
            C13601l c13601l = (C13601l) c0093l.f1007l;
            long jMopub = AbstractC14707l.mopub(jCeil);
            C4417l c4417l = c13601l.f26630l;
            InterfaceC13490l interfaceC13490l = c4417l.yandex;
            EnumC9931l enumC9931l = c4417l.loadAd;
            InterfaceC14859l interfaceC14859l = c4417l.crashlytics;
            long j = c4417l.amazon;
            c4417l.yandex = interfaceC13349l;
            c4417l.loadAd = layoutDirection;
            c4417l.crashlytics = c2151lYandex;
            c4417l.amazon = jMopub;
            c2151lYandex.mopub();
            AbstractC9361l.metrica(c13601l, C9735l.loadAd, 0L, 0L, 0.0f, null, null, 0, 62);
            this.f26494l.invoke(c13601l);
            c2151lYandex.ads();
            C4417l c4417l2 = c13601l.f26630l;
            c4417l2.yandex = interfaceC13490l;
            c4417l2.loadAd = enumC9931l;
            c4417l2.crashlytics = interfaceC14859l;
            c4417l2.amazon = j;
            c14115lYandex.yandex.prepareToDraw();
            this.f26491l = new C14174l(interfaceC13349l.admob());
        }
        float f = this.f26498l;
        AbstractC8939l abstractC8939l = this.f26490l;
        C14115l c14115l = (C14115l) c0093l.f1005l;
        if (c14115l != null) {
            AbstractC9361l.subs(interfaceC13349l, c14115l, c0093l.f1006l, 0L, f, abstractC8939l, 0, 858);
        } else {
            C8339l.smaato("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
    }

    public final C6171l metrica(InterfaceC6407l interfaceC6407l, float f) {
        if (!AbstractC5711l.admob(interfaceC6407l)) {
            interfaceC6407l = null;
        }
        if (interfaceC6407l == null) {
            InterfaceC6407l.yandex.getClass();
            interfaceC6407l = C8298l.crashlytics;
        }
        return new C6171l(new C1045l(interfaceC6407l, f, new C9987l(), this));
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f26490l = abstractC8939l;
        return true;
    }

    public final void remoteconfig(InterfaceC13349l interfaceC13349l, float f) throws Throwable {
        InterfaceC13349l interfaceC13349l2;
        C2549l c2549l = this.f26496l;
        C6171l c6171lMetrica = metrica(c2549l.loadAd.amazon, f);
        InterfaceC7386l interfaceC7386l = c2549l.yandex.purchase;
        float f2 = 7.0f * f;
        C1045l c1045l = new C1045l(new C12123l(AbstractC3478l.yandex(), interfaceC7386l, f2), new C9987l(), this, f2);
        for (C8195l c8195l : this.f26501l) {
            float fFloatValue = ((Number) c8195l.f17098l).floatValue() * f;
            float fFloatValue2 = ((Number) c8195l.f17097l).floatValue() * f;
            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fFloatValue, fFloatValue2);
            try {
                interfaceC13349l2 = interfaceC13349l;
                try {
                    AbstractC9361l.smaato(interfaceC13349l2, (C9902l) c1045l.invoke(), (AbstractC9544l) c6171lMetrica.f13014l.invoke(), 0.0f, null, null, 60);
                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fFloatValue, -fFloatValue2);
                    interfaceC13349l = interfaceC13349l2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fFloatValue, -fFloatValue2);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC13349l2 = interfaceC13349l;
            }
        }
    }

    public final void smaato(InterfaceC13349l interfaceC13349l, float f) throws Throwable {
        InterfaceC13349l interfaceC13349l2;
        C2549l c2549l = this.f26496l;
        C6171l c6171lMetrica = metrica(c2549l.loadAd.crashlytics, f);
        InterfaceC3538l interfaceC3538l = c2549l.yandex.amazon;
        float f2 = 3.0f * f;
        C1045l c1045l = new C1045l(new C12123l(AbstractC3478l.yandex(), interfaceC3538l, f2), new C9987l(), this, f2);
        for (C8195l c8195l : this.f26493l) {
            float fFloatValue = ((Number) c8195l.f17098l).floatValue() * f;
            float fFloatValue2 = ((Number) c8195l.f17097l).floatValue() * f;
            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(fFloatValue, fFloatValue2);
            try {
                interfaceC13349l2 = interfaceC13349l;
                try {
                    AbstractC9361l.smaato(interfaceC13349l2, (C9902l) c1045l.invoke(), (AbstractC9544l) c6171lMetrica.f13014l.invoke(), 0.0f, null, null, 60);
                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fFloatValue, -fFloatValue2);
                    interfaceC13349l = interfaceC13349l2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    ((C16543l) interfaceC13349l2.mo2065break().f36010l).inmobi(-fFloatValue, -fFloatValue2);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC13349l2 = interfaceC13349l;
            }
        }
    }

    public final boolean startapp() {
        return this.f26496l.loadAd.yandex.loadAd() == 2;
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        return this.f26495l;
    }

    public final String toString() {
        return AbstractC15560l.Signature("QrCodePainter(data = ", this.f26499l, ")");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ea A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:18:0x0087, B:20:0x008d, B:22:0x0097, B:24:0x00a3, B:26:0x00ae, B:31:0x00d0, B:33:0x00d6, B:35:0x00de, B:37:0x00ea, B:40:0x00f8, B:39:0x00f1, B:25:0x00a8), top: B:47:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f1 A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:18:0x0087, B:20:0x008d, B:22:0x0097, B:24:0x00a3, B:26:0x00ae, B:31:0x00d0, B:33:0x00d6, B:35:0x00de, B:37:0x00ea, B:40:0x00f8, B:39:0x00f1, B:25:0x00a8), top: B:47:0x0087 }] */
    public final void vip(InterfaceC13349l interfaceC13349l, float f) {
        C8688l c8688l;
        boolean z;
        int i;
        C4565l c4565lSubs;
        AbstractC9544l abstractC9544lYandex;
        C13492l c13492l = this;
        C2549l c2549l = c13492l.f26496l;
        InterfaceC6407l interfaceC6407l = c2549l.loadAd.yandex;
        boolean zStartapp = c13492l.startapp();
        C7375l c7375l = c13492l.f26500l;
        float f2 = zStartapp ? f : c7375l.yandex * f;
        int i2 = 2;
        C8688l c8688l2 = new C8688l(new C13485l(interfaceC6407l, f2, i2));
        InterfaceC6407l interfaceC6407l2 = c2549l.loadAd.loadAd;
        boolean zAdcel = c13492l.adcel();
        float f3 = zAdcel ? f : c7375l.yandex * f;
        C8688l c8688l3 = new C8688l(new C13485l(interfaceC6407l2, f3, i2));
        InterfaceC1519l interfaceC1519l = c2549l.yandex.loadAd;
        C9902l c9902lYandex = AbstractC3478l.yandex();
        InterfaceC1519l interfaceC1519l2 = c2549l.yandex.crashlytics;
        C9902l c9902lYandex2 = AbstractC3478l.yandex();
        int i3 = c7375l.yandex;
        int i4 = 0;
        while (i4 < i3) {
            boolean z2 = zStartapp;
            int i5 = c7375l.yandex;
            C8688l c8688l4 = c8688l3;
            int i6 = 0;
            while (i6 < i5) {
                if (c13492l.ads(i4, i6)) {
                    c8688l = c8688l2;
                    z = zAdcel;
                    i3 = i3;
                    i = i4;
                    c9902lYandex2 = c9902lYandex2;
                } else {
                    float f4 = i4 * f;
                    c8688l = c8688l2;
                    float f5 = i6 * f;
                    ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(f4, f5);
                    try {
                        if (startapp()) {
                            z = zAdcel;
                            if (c7375l.loadAd(i4, i6) == EnumC10718l.f21716l) {
                                C4565l c4565lSubs2 = AbstractC13457l.subs(c7375l, i4, i6);
                                c9902lYandex.subs();
                                interfaceC1519l.admob(c9902lYandex, f, c4565lSubs2);
                                int i7 = i4;
                                AbstractC9544l abstractC9544lYandex2 = z2 ? interfaceC6407l.yandex(f2, c4565lSubs2) : (AbstractC9544l) c8688l.getValue();
                                i = i7;
                                AbstractC9361l.smaato(interfaceC13349l, c9902lYandex, abstractC9544lYandex2, 0.0f, null, null, 60);
                            }
                            if (adcel() && c7375l.loadAd(i, i6) == EnumC10718l.f21715l) {
                                c4565lSubs = AbstractC13457l.subs(c7375l, i, i6);
                                c9902lYandex2.subs();
                                interfaceC1519l2.admob(c9902lYandex2, f, c4565lSubs);
                                if (z) {
                                    abstractC9544lYandex = interfaceC6407l2.yandex(f3, c4565lSubs);
                                } else {
                                    abstractC9544lYandex = (AbstractC9544l) c8688l4.getValue();
                                }
                                AbstractC9361l.smaato(interfaceC13349l, c9902lYandex2, abstractC9544lYandex, 0.0f, null, null, 60);
                            }
                            ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f4, -f5);
                        } else {
                            z = zAdcel;
                        }
                        i = i4;
                        if (adcel()) {
                            c4565lSubs = AbstractC13457l.subs(c7375l, i, i6);
                            c9902lYandex2.subs();
                            interfaceC1519l2.admob(c9902lYandex2, f, c4565lSubs);
                            if (z) {
                                abstractC9544lYandex = interfaceC6407l2.yandex(f3, c4565lSubs);
                            } else {
                                abstractC9544lYandex = (AbstractC9544l) c8688l4.getValue();
                            }
                            AbstractC9361l.smaato(interfaceC13349l, c9902lYandex2, abstractC9544lYandex, 0.0f, null, null, 60);
                        }
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f4, -f5);
                    } catch (Throwable th) {
                        ((C16543l) interfaceC13349l.mo2065break().f36010l).inmobi(-f4, -f5);
                        throw th;
                    }
                }
                i6++;
                i4 = i;
                c9902lYandex2 = c9902lYandex2;
                i5 = i5;
                c8688l2 = c8688l;
                zAdcel = z;
                i3 = i3;
                c13492l = this;
            }
            i4++;
            c13492l = this;
            zStartapp = z2;
            c8688l3 = c8688l4;
            zAdcel = zAdcel;
        }
    }
}
