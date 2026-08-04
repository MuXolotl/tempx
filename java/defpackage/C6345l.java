package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lٌؙِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6345l extends AbstractC17780l {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ int crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ AbstractC11918l purchase;

    public /* synthetic */ C6345l(AbstractC11918l abstractC11918l, int i, Object obj, int i2) {
        this.loadAd = i2;
        this.purchase = abstractC11918l;
        this.crashlytics = i;
        this.amazon = obj;
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l billing(int i) {
        int i2 = this.loadAd;
        AbstractC11918l abstractC11918l = this.purchase;
        Object obj = this.amazon;
        int i3 = this.crashlytics;
        switch (i2) {
            case 0:
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = ((i5 ^ i) - 1) >> 31;
                    for (int i7 = 0; i7 < 8; i7++) {
                        int[] iArr3 = (int[]) obj;
                        iArr[i7] = iArr[i7] ^ (iArr3[i4 + i7] & i6);
                        iArr2[i7] = iArr2[i7] ^ (iArr3[(i4 + 8) + i7] & i6);
                    }
                    i4 += 16;
                }
                return new C15213l((C1342l) abstractC11918l, new C3515l(iArr), new C3515l(iArr2), C1342l.remoteconfig, 0);
            case 1:
                int[] iArr4 = new int[8];
                int[] iArr5 = new int[8];
                int i8 = 0;
                for (int i9 = 0; i9 < i3; i9++) {
                    int i10 = ((i9 ^ i) - 1) >> 31;
                    for (int i11 = 0; i11 < 8; i11++) {
                        int[] iArr6 = (int[]) obj;
                        iArr4[i11] = iArr4[i11] ^ (iArr6[i8 + i11] & i10);
                        iArr5[i11] = iArr5[i11] ^ (iArr6[(i8 + 8) + i11] & i10);
                    }
                    i8 += 16;
                }
                return new C15213l((C2445l) abstractC11918l, new C15568l(iArr4), new C15568l(iArr5), C2445l.firebase, 2);
            case 2:
                int[] iArr7 = new int[4];
                int[] iArr8 = new int[4];
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = ((i13 ^ i) - 1) >> 31;
                    for (int i15 = 0; i15 < 4; i15++) {
                        int[] iArr9 = (int[]) obj;
                        iArr7[i15] = iArr7[i15] ^ (iArr9[i12 + i15] & i14);
                        iArr8[i15] = iArr8[i15] ^ (iArr9[(i12 + 4) + i15] & i14);
                    }
                    i12 += 8;
                }
                return new C15213l((C3591l) abstractC11918l, new C8649l(iArr7), new C8649l(iArr8), C3591l.firebase, 3);
            case 3:
                int[] iArr10 = new int[5];
                int[] iArr11 = new int[5];
                int i16 = 0;
                for (int i17 = 0; i17 < i3; i17++) {
                    int i18 = ((i17 ^ i) - 1) >> 31;
                    for (int i19 = 0; i19 < 5; i19++) {
                        int[] iArr12 = (int[]) obj;
                        iArr10[i19] = iArr10[i19] ^ (iArr12[i16 + i19] & i18);
                        iArr11[i19] = iArr11[i19] ^ (iArr12[(i16 + 5) + i19] & i18);
                    }
                    i16 += 10;
                }
                return new C15213l((C4351l) abstractC11918l, new C5489l(iArr10), new C5489l(iArr11), C4351l.firebase, 4);
            case 4:
                int[] iArr13 = new int[5];
                int[] iArr14 = new int[5];
                int i20 = 0;
                for (int i21 = 0; i21 < i3; i21++) {
                    int i22 = ((i21 ^ i) - 1) >> 31;
                    for (int i23 = 0; i23 < 5; i23++) {
                        int[] iArr15 = (int[]) obj;
                        iArr13[i23] = iArr13[i23] ^ (iArr15[i20 + i23] & i22);
                        iArr14[i23] = iArr14[i23] ^ (iArr15[(i20 + 5) + i23] & i22);
                    }
                    i20 += 10;
                }
                return new C15213l((C11728l) abstractC11918l, new C0448l(iArr13), new C0448l(iArr14), C11728l.firebase, 5);
            case 5:
                int[] iArr16 = new int[5];
                int[] iArr17 = new int[5];
                int i24 = 0;
                for (int i25 = 0; i25 < i3; i25++) {
                    int i26 = ((i25 ^ i) - 1) >> 31;
                    for (int i27 = 0; i27 < 5; i27++) {
                        int[] iArr18 = (int[]) obj;
                        iArr16[i27] = iArr16[i27] ^ (iArr18[i24 + i27] & i26);
                        iArr17[i27] = iArr17[i27] ^ (iArr18[(i24 + 5) + i27] & i26);
                    }
                    i24 += 10;
                }
                return new C15213l((C10951l) abstractC11918l, new C5489l(iArr16), new C5489l(iArr17), C10951l.firebase, 6);
            case 6:
                int[] iArr19 = new int[6];
                int[] iArr20 = new int[6];
                int i28 = 0;
                for (int i29 = 0; i29 < i3; i29++) {
                    int i30 = ((i29 ^ i) - 1) >> 31;
                    for (int i31 = 0; i31 < 6; i31++) {
                        int[] iArr21 = (int[]) obj;
                        iArr19[i31] = iArr19[i31] ^ (iArr21[i28 + i31] & i30);
                        iArr20[i31] = iArr20[i31] ^ (iArr21[(i28 + 6) + i31] & i30);
                    }
                    i28 += 12;
                }
                return new C15213l((C13510l) abstractC11918l, new C11245l(iArr19), new C11245l(iArr20), C13510l.firebase, 7);
            case 7:
                int[] iArr22 = new int[6];
                int[] iArr23 = new int[6];
                int i32 = 0;
                for (int i33 = 0; i33 < i3; i33++) {
                    int i34 = ((i33 ^ i) - 1) >> 31;
                    for (int i35 = 0; i35 < 6; i35++) {
                        int[] iArr24 = (int[]) obj;
                        iArr22[i35] = iArr22[i35] ^ (iArr24[i32 + i35] & i34);
                        iArr23[i35] = iArr23[i35] ^ (iArr24[(i32 + 6) + i35] & i34);
                    }
                    i32 += 12;
                }
                return new C15213l((C13449l) abstractC11918l, new C6766l(iArr22), new C6766l(iArr23), C13449l.firebase, 8);
            case 8:
                int[] iArr25 = new int[7];
                int[] iArr26 = new int[7];
                int i36 = 0;
                for (int i37 = 0; i37 < i3; i37++) {
                    int i38 = ((i37 ^ i) - 1) >> 31;
                    for (int i39 = 0; i39 < 7; i39++) {
                        int[] iArr27 = (int[]) obj;
                        iArr25[i39] = iArr25[i39] ^ (iArr27[i36 + i39] & i38);
                        iArr26[i39] = iArr26[i39] ^ (iArr27[(i36 + 7) + i39] & i38);
                    }
                    i36 += 14;
                }
                return new C15213l((C11863l) abstractC11918l, new C0369l(iArr25), new C0369l(iArr26), C11863l.firebase, 9);
            case 9:
                int[] iArr28 = new int[7];
                int[] iArr29 = new int[7];
                int i40 = 0;
                for (int i41 = 0; i41 < i3; i41++) {
                    int i42 = ((i41 ^ i) - 1) >> 31;
                    for (int i43 = 0; i43 < 7; i43++) {
                        int[] iArr30 = (int[]) obj;
                        iArr28[i43] = iArr28[i43] ^ (iArr30[i40 + i43] & i42);
                        iArr29[i43] = iArr29[i43] ^ (iArr30[(i40 + 7) + i43] & i42);
                    }
                    i40 += 14;
                }
                return new C15213l((C8407l) abstractC11918l, new C5420l(iArr28), new C5420l(iArr29), C8407l.firebase, 10);
            case 10:
                int[] iArr31 = new int[8];
                int[] iArr32 = new int[8];
                int i44 = 0;
                for (int i45 = 0; i45 < i3; i45++) {
                    int i46 = ((i45 ^ i) - 1) >> 31;
                    for (int i47 = 0; i47 < 8; i47++) {
                        int[] iArr33 = (int[]) obj;
                        iArr31[i47] = iArr31[i47] ^ (iArr33[i44 + i47] & i46);
                        iArr32[i47] = iArr32[i47] ^ (iArr33[(i44 + 8) + i47] & i46);
                    }
                    i44 += 16;
                }
                return new C15213l((C12137l) abstractC11918l, new C11431l(iArr31), new C11431l(iArr32), C12137l.firebase, 11);
            case 11:
                int[] iArr34 = new int[8];
                int[] iArr35 = new int[8];
                int i48 = 0;
                for (int i49 = 0; i49 < i3; i49++) {
                    int i50 = ((i49 ^ i) - 1) >> 31;
                    for (int i51 = 0; i51 < 8; i51++) {
                        int[] iArr36 = (int[]) obj;
                        iArr34[i51] = iArr34[i51] ^ (iArr36[i48 + i51] & i50);
                        iArr35[i51] = iArr35[i51] ^ (iArr36[(i48 + 8) + i51] & i50);
                    }
                    i48 += 16;
                }
                return new C15213l((C18668l) abstractC11918l, new C10438l(iArr34), new C10438l(iArr35), C18668l.firebase, 12);
            case 12:
                int[] iArr37 = new int[12];
                int[] iArr38 = new int[12];
                int i52 = 0;
                for (int i53 = 0; i53 < i3; i53++) {
                    int i54 = ((i53 ^ i) - 1) >> 31;
                    for (int i55 = 0; i55 < 12; i55++) {
                        int[] iArr39 = (int[]) obj;
                        iArr37[i55] = iArr37[i55] ^ (iArr39[i52 + i55] & i54);
                        iArr38[i55] = iArr38[i55] ^ (iArr39[(i52 + 12) + i55] & i54);
                    }
                    i52 += 24;
                }
                return new C15213l((C13032l) abstractC11918l, new C3849l(iArr37), new C3849l(iArr38), C13032l.firebase, 13);
            case 13:
                int[] iArr40 = new int[17];
                int[] iArr41 = new int[17];
                int i56 = 0;
                for (int i57 = 0; i57 < i3; i57++) {
                    int i58 = ((i57 ^ i) - 1) >> 31;
                    for (int i59 = 0; i59 < 17; i59++) {
                        int[] iArr42 = (int[]) obj;
                        iArr40[i59] = iArr40[i59] ^ (iArr42[i56 + i59] & i58);
                        iArr41[i59] = iArr41[i59] ^ (iArr42[(i56 + 17) + i59] & i58);
                    }
                    i56 += 34;
                }
                return new C15213l((C8131l) abstractC11918l, new C8489l(iArr40), new C8489l(iArr41), C8131l.firebase, 14);
            case 14:
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i60 = 0;
                for (int i61 = 0; i61 < i3; i61++) {
                    long j = ((i61 ^ i) - 1) >> 31;
                    for (int i62 = 0; i62 < 2; i62++) {
                        long[] jArr3 = (long[]) obj;
                        jArr[i62] = jArr[i62] ^ (jArr3[i60 + i62] & j);
                        jArr2[i62] = jArr2[i62] ^ (jArr3[(i60 + 2) + i62] & j);
                    }
                    i60 += 4;
                }
                return new C13683l((C16878l) abstractC11918l, new C17366l(jArr), new C17366l(jArr2), C16878l.firebase, 1);
            case 15:
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[2];
                int i63 = 0;
                for (int i64 = 0; i64 < i3; i64++) {
                    long j2 = ((i64 ^ i) - 1) >> 31;
                    for (int i65 = 0; i65 < 2; i65++) {
                        long[] jArr6 = (long[]) obj;
                        jArr4[i65] = jArr4[i65] ^ (jArr6[i63 + i65] & j2);
                        jArr5[i65] = jArr5[i65] ^ (jArr6[(i63 + 2) + i65] & j2);
                    }
                    i63 += 4;
                }
                return new C13683l((C4476l) abstractC11918l, new C17366l(jArr4), new C17366l(jArr5), C4476l.firebase, 2);
            case 16:
                long[] jArr7 = new long[3];
                long[] jArr8 = new long[3];
                int i66 = 0;
                for (int i67 = 0; i67 < i3; i67++) {
                    long j3 = ((i67 ^ i) - 1) >> 31;
                    for (int i68 = 0; i68 < 3; i68++) {
                        long[] jArr9 = (long[]) obj;
                        jArr7[i68] = jArr7[i68] ^ (jArr9[i66 + i68] & j3);
                        jArr8[i68] = jArr8[i68] ^ (jArr9[(i66 + 3) + i68] & j3);
                    }
                    i66 += 6;
                }
                return new C13683l((C17478l) abstractC11918l, new C7908l(jArr7), new C7908l(jArr8), C17478l.firebase, 3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long[] jArr10 = new long[3];
                long[] jArr11 = new long[3];
                int i69 = 0;
                for (int i70 = 0; i70 < i3; i70++) {
                    long j4 = ((i70 ^ i) - 1) >> 31;
                    for (int i71 = 0; i71 < 3; i71++) {
                        long[] jArr12 = (long[]) obj;
                        jArr10[i71] = jArr10[i71] ^ (jArr12[i69 + i71] & j4);
                        jArr11[i71] = jArr11[i71] ^ (jArr12[(i69 + 3) + i71] & j4);
                    }
                    i69 += 6;
                }
                return new C13683l((C0345l) abstractC11918l, new C7908l(jArr10), new C7908l(jArr11), C0345l.firebase, 4);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long[] jArr13 = new long[3];
                long[] jArr14 = new long[3];
                int i72 = 0;
                for (int i73 = 0; i73 < i3; i73++) {
                    long j5 = ((i73 ^ i) - 1) >> 31;
                    for (int i74 = 0; i74 < 3; i74++) {
                        long[] jArr15 = (long[]) obj;
                        jArr13[i74] = jArr13[i74] ^ (jArr15[i72 + i74] & j5);
                        jArr14[i74] = jArr14[i74] ^ (jArr15[(i72 + 3) + i74] & j5);
                    }
                    i72 += 6;
                }
                return new C13683l((C8851l) abstractC11918l, new C12917l(jArr13), new C12917l(jArr14), C8851l.firebase, 5);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                long[] jArr16 = new long[3];
                long[] jArr17 = new long[3];
                int i75 = 0;
                for (int i76 = 0; i76 < i3; i76++) {
                    long j6 = ((i76 ^ i) - 1) >> 31;
                    for (int i77 = 0; i77 < 3; i77++) {
                        long[] jArr18 = (long[]) obj;
                        jArr16[i77] = jArr16[i77] ^ (jArr18[i75 + i77] & j6);
                        jArr17[i77] = jArr17[i77] ^ (jArr18[(i75 + 3) + i77] & j6);
                    }
                    i75 += 6;
                }
                return new C13683l((C0681l) abstractC11918l, new C12917l(jArr16), new C12917l(jArr17), C0681l.firebase, 6);
            case 20:
                long[] jArr19 = new long[3];
                long[] jArr20 = new long[3];
                int i78 = 0;
                for (int i79 = 0; i79 < i3; i79++) {
                    long j7 = ((i79 ^ i) - 1) >> 31;
                    for (int i80 = 0; i80 < 3; i80++) {
                        long[] jArr21 = (long[]) obj;
                        jArr19[i80] = jArr19[i80] ^ (jArr21[i78 + i80] & j7);
                        jArr20[i80] = jArr20[i80] ^ (jArr21[(i78 + 3) + i80] & j7);
                    }
                    i78 += 6;
                }
                return new C13683l((C13875l) abstractC11918l, new C12917l(jArr19), new C12917l(jArr20), C13875l.firebase, 7);
            case 21:
                long[] jArr22 = new long[4];
                long[] jArr23 = new long[4];
                int i81 = 0;
                for (int i82 = 0; i82 < i3; i82++) {
                    long j8 = ((i82 ^ i) - 1) >> 31;
                    for (int i83 = 0; i83 < 4; i83++) {
                        long[] jArr24 = (long[]) obj;
                        jArr22[i83] = jArr22[i83] ^ (jArr24[i81 + i83] & j8);
                        jArr23[i83] = jArr23[i83] ^ (jArr24[(i81 + 4) + i83] & j8);
                    }
                    i81 += 8;
                }
                return new C13683l((C7604l) abstractC11918l, new C1099l(jArr22), new C1099l(jArr23), C7604l.firebase, 8);
            case 22:
                long[] jArr25 = new long[4];
                long[] jArr26 = new long[4];
                int i84 = 0;
                for (int i85 = 0; i85 < i3; i85++) {
                    long j9 = ((i85 ^ i) - 1) >> 31;
                    for (int i86 = 0; i86 < 4; i86++) {
                        long[] jArr27 = (long[]) obj;
                        jArr25[i86] = jArr25[i86] ^ (jArr27[i84 + i86] & j9);
                        jArr26[i86] = jArr26[i86] ^ (jArr27[(i84 + 4) + i86] & j9);
                    }
                    i84 += 8;
                }
                return new C13683l((C15163l) abstractC11918l, new C1099l(jArr25), new C1099l(jArr26), C15163l.firebase, 9);
            case 23:
                long[] jArr28 = new long[4];
                long[] jArr29 = new long[4];
                int i87 = 0;
                for (int i88 = 0; i88 < i3; i88++) {
                    long j10 = ((i88 ^ i) - 1) >> 31;
                    for (int i89 = 0; i89 < 4; i89++) {
                        long[] jArr30 = (long[]) obj;
                        jArr28[i89] = jArr28[i89] ^ (jArr30[i87 + i89] & j10);
                        jArr29[i89] = jArr29[i89] ^ (jArr30[(i87 + 4) + i89] & j10);
                    }
                    i87 += 8;
                }
                return new C13683l((C15240l) abstractC11918l, new C9194l(jArr28), new C9194l(jArr29), C15240l.firebase, 10);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                long[] jArr31 = new long[4];
                long[] jArr32 = new long[4];
                int i90 = 0;
                for (int i91 = 0; i91 < i3; i91++) {
                    long j11 = ((i91 ^ i) - 1) >> 31;
                    for (int i92 = 0; i92 < 4; i92++) {
                        long[] jArr33 = (long[]) obj;
                        jArr31[i92] = jArr31[i92] ^ (jArr33[i90 + i92] & j11);
                        jArr32[i92] = jArr32[i92] ^ (jArr33[(i90 + 4) + i92] & j11);
                    }
                    i90 += 8;
                }
                return new C13683l((C10248l) abstractC11918l, new C9194l(jArr31), new C9194l(jArr32), C10248l.firebase, 11);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                long[] jArr34 = new long[4];
                long[] jArr35 = new long[4];
                int i93 = 0;
                for (int i94 = 0; i94 < i3; i94++) {
                    long j12 = ((i94 ^ i) - 1) >> 31;
                    for (int i95 = 0; i95 < 4; i95++) {
                        long[] jArr36 = (long[]) obj;
                        jArr34[i95] = jArr34[i95] ^ (jArr36[i93 + i95] & j12);
                        jArr35[i95] = jArr35[i95] ^ (jArr36[(i93 + 4) + i95] & j12);
                    }
                    i93 += 8;
                }
                return new C13683l((C18237l) abstractC11918l, new C4410l(jArr34), new C4410l(jArr35), C18237l.firebase, 12);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                long[] jArr37 = new long[5];
                long[] jArr38 = new long[5];
                int i96 = 0;
                for (int i97 = 0; i97 < i3; i97++) {
                    long j13 = ((i97 ^ i) - 1) >> 31;
                    for (int i98 = 0; i98 < 5; i98++) {
                        long[] jArr39 = (long[]) obj;
                        jArr37[i98] = jArr37[i98] ^ (jArr39[i96 + i98] & j13);
                        jArr38[i98] = jArr38[i98] ^ (jArr39[(i96 + 5) + i98] & j13);
                    }
                    i96 += 10;
                }
                return new C13683l((C12293l) abstractC11918l, new C13897l(jArr37), new C13897l(jArr38), C12293l.firebase, 13);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long[] jArr40 = new long[5];
                long[] jArr41 = new long[5];
                int i99 = 0;
                for (int i100 = 0; i100 < i3; i100++) {
                    long j14 = ((i100 ^ i) - 1) >> 31;
                    for (int i101 = 0; i101 < 5; i101++) {
                        long[] jArr42 = (long[]) obj;
                        jArr40[i101] = jArr40[i101] ^ (jArr42[i99 + i101] & j14);
                        jArr41[i101] = jArr41[i101] ^ (jArr42[(i99 + 5) + i101] & j14);
                    }
                    i99 += 10;
                }
                return new C13683l((C16868l) abstractC11918l, new C13897l(jArr40), new C13897l(jArr41), C16868l.firebase, 14);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long[] jArr43 = new long[7];
                long[] jArr44 = new long[7];
                int i102 = 0;
                for (int i103 = 0; i103 < i3; i103++) {
                    long j15 = ((i103 ^ i) - 1) >> 31;
                    for (int i104 = 0; i104 < 7; i104++) {
                        long[] jArr45 = (long[]) obj;
                        jArr43[i104] = jArr43[i104] ^ (jArr45[i102 + i104] & j15);
                        jArr44[i104] = jArr44[i104] ^ (jArr45[(i102 + 7) + i104] & j15);
                    }
                    i102 += 14;
                }
                return new C13683l((C17938l) abstractC11918l, new C7385l(jArr43), new C7385l(jArr44), C17938l.firebase, 15);
            default:
                long[] jArr46 = new long[7];
                long[] jArr47 = new long[7];
                int i105 = 0;
                for (int i106 = 0; i106 < i3; i106++) {
                    long j16 = ((i106 ^ i) - 1) >> 31;
                    for (int i107 = 0; i107 < 7; i107++) {
                        long[] jArr48 = (long[]) obj;
                        jArr46[i107] = jArr46[i107] ^ (jArr48[i105 + i107] & j16);
                        jArr47[i107] = jArr47[i107] ^ (jArr48[(i105 + 7) + i107] & j16);
                    }
                    i105 += 14;
                }
                return new C13683l((C10587l) abstractC11918l, new C7385l(jArr46), new C7385l(jArr47), C10587l.firebase, 16);
        }
    }

    @Override // defpackage.AbstractC17780l
    public final AbstractC8859l mopub(int i) {
        int i2 = this.loadAd;
        AbstractC11918l abstractC11918l = this.purchase;
        Object obj = this.amazon;
        int i3 = 0;
        switch (i2) {
            case 0:
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i4 = i * 16;
                while (i3 < 8) {
                    int[] iArr3 = (int[]) obj;
                    iArr[i3] = iArr3[i4 + i3];
                    iArr2[i3] = iArr3[i4 + 8 + i3];
                    i3++;
                }
                return new C15213l((C1342l) abstractC11918l, new C3515l(iArr), new C3515l(iArr2), C1342l.remoteconfig, 0);
            case 1:
                int[] iArr4 = new int[8];
                int[] iArr5 = new int[8];
                int i5 = i * 16;
                while (i3 < 8) {
                    int[] iArr6 = (int[]) obj;
                    iArr4[i3] = iArr6[i5 + i3];
                    iArr5[i3] = iArr6[i5 + 8 + i3];
                    i3++;
                }
                return new C15213l((C2445l) abstractC11918l, new C15568l(iArr4), new C15568l(iArr5), C2445l.firebase, 2);
            case 2:
                int[] iArr7 = new int[4];
                int[] iArr8 = new int[4];
                int i6 = i * 8;
                while (i3 < 4) {
                    int[] iArr9 = (int[]) obj;
                    iArr7[i3] = iArr9[i6 + i3];
                    iArr8[i3] = iArr9[i6 + 4 + i3];
                    i3++;
                }
                return new C15213l((C3591l) abstractC11918l, new C8649l(iArr7), new C8649l(iArr8), C3591l.firebase, 3);
            case 3:
                int[] iArr10 = new int[5];
                int[] iArr11 = new int[5];
                int i7 = i * 10;
                while (i3 < 5) {
                    int[] iArr12 = (int[]) obj;
                    iArr10[i3] = iArr12[i7 + i3];
                    iArr11[i3] = iArr12[i7 + 5 + i3];
                    i3++;
                }
                return new C15213l((C4351l) abstractC11918l, new C5489l(iArr10), new C5489l(iArr11), C4351l.firebase, 4);
            case 4:
                int[] iArr13 = new int[5];
                int[] iArr14 = new int[5];
                int i8 = i * 10;
                while (i3 < 5) {
                    int[] iArr15 = (int[]) obj;
                    iArr13[i3] = iArr15[i8 + i3];
                    iArr14[i3] = iArr15[i8 + 5 + i3];
                    i3++;
                }
                return new C15213l((C11728l) abstractC11918l, new C0448l(iArr13), new C0448l(iArr14), C11728l.firebase, 5);
            case 5:
                int[] iArr16 = new int[5];
                int[] iArr17 = new int[5];
                int i9 = i * 10;
                while (i3 < 5) {
                    int[] iArr18 = (int[]) obj;
                    iArr16[i3] = iArr18[i9 + i3];
                    iArr17[i3] = iArr18[i9 + 5 + i3];
                    i3++;
                }
                return new C15213l((C10951l) abstractC11918l, new C5489l(iArr16), new C5489l(iArr17), C10951l.firebase, 6);
            case 6:
                int[] iArr19 = new int[6];
                int[] iArr20 = new int[6];
                int i10 = i * 12;
                while (i3 < 6) {
                    int[] iArr21 = (int[]) obj;
                    iArr19[i3] = iArr21[i10 + i3];
                    iArr20[i3] = iArr21[i10 + 6 + i3];
                    i3++;
                }
                return new C15213l((C13510l) abstractC11918l, new C11245l(iArr19), new C11245l(iArr20), C13510l.firebase, 7);
            case 7:
                int[] iArr22 = new int[6];
                int[] iArr23 = new int[6];
                int i11 = i * 12;
                while (i3 < 6) {
                    int[] iArr24 = (int[]) obj;
                    iArr22[i3] = iArr24[i11 + i3];
                    iArr23[i3] = iArr24[i11 + 6 + i3];
                    i3++;
                }
                return new C15213l((C13449l) abstractC11918l, new C6766l(iArr22), new C6766l(iArr23), C13449l.firebase, 8);
            case 8:
                int[] iArr25 = new int[7];
                int[] iArr26 = new int[7];
                int i12 = 0;
                for (int i13 = 0; i13 < this.crashlytics; i13++) {
                    int i14 = ((i13 ^ i) - 1) >> 31;
                    for (int i15 = 0; i15 < 7; i15++) {
                        int[] iArr27 = (int[]) obj;
                        iArr25[i15] = iArr25[i15] ^ (iArr27[i12 + i15] & i14);
                        iArr26[i15] = iArr26[i15] ^ (iArr27[(i12 + 7) + i15] & i14);
                    }
                    i12 += 14;
                }
                return new C15213l((C11863l) abstractC11918l, new C0369l(iArr25), new C0369l(iArr26), C11863l.firebase, 9);
            case 9:
                int[] iArr28 = new int[7];
                int[] iArr29 = new int[7];
                int i16 = i * 14;
                while (i3 < 7) {
                    int[] iArr30 = (int[]) obj;
                    iArr28[i3] = iArr30[i16 + i3];
                    iArr29[i3] = iArr30[i16 + 7 + i3];
                    i3++;
                }
                return new C15213l((C8407l) abstractC11918l, new C5420l(iArr28), new C5420l(iArr29), C8407l.firebase, 10);
            case 10:
                int[] iArr31 = new int[8];
                int[] iArr32 = new int[8];
                int i17 = i * 16;
                while (i3 < 8) {
                    int[] iArr33 = (int[]) obj;
                    iArr31[i3] = iArr33[i17 + i3];
                    iArr32[i3] = iArr33[i17 + 8 + i3];
                    i3++;
                }
                return new C15213l((C12137l) abstractC11918l, new C11431l(iArr31), new C11431l(iArr32), C12137l.firebase, 11);
            case 11:
                int[] iArr34 = new int[8];
                int[] iArr35 = new int[8];
                int i18 = i * 16;
                while (i3 < 8) {
                    int[] iArr36 = (int[]) obj;
                    iArr34[i3] = iArr36[i18 + i3];
                    iArr35[i3] = iArr36[i18 + 8 + i3];
                    i3++;
                }
                return new C15213l((C18668l) abstractC11918l, new C10438l(iArr34), new C10438l(iArr35), C18668l.firebase, 12);
            case 12:
                int[] iArr37 = new int[12];
                int[] iArr38 = new int[12];
                int i19 = i * 24;
                while (i3 < 12) {
                    int[] iArr39 = (int[]) obj;
                    iArr37[i3] = iArr39[i19 + i3];
                    iArr38[i3] = iArr39[i19 + 12 + i3];
                    i3++;
                }
                return new C15213l((C13032l) abstractC11918l, new C3849l(iArr37), new C3849l(iArr38), C13032l.firebase, 13);
            case 13:
                int[] iArr40 = new int[17];
                int[] iArr41 = new int[17];
                int i20 = i * 34;
                while (i3 < 17) {
                    int[] iArr42 = (int[]) obj;
                    iArr40[i3] = iArr40[i3] ^ iArr42[i20 + i3];
                    iArr41[i3] = iArr41[i3] ^ iArr42[(i20 + 17) + i3];
                    i3++;
                }
                return new C15213l((C8131l) abstractC11918l, new C8489l(iArr40), new C8489l(iArr41), C8131l.firebase, 14);
            case 14:
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i21 = i * 4;
                while (i3 < 2) {
                    long[] jArr3 = (long[]) obj;
                    jArr[i3] = jArr3[i21 + i3];
                    jArr2[i3] = jArr3[i21 + 2 + i3];
                    i3++;
                }
                return new C13683l((C16878l) abstractC11918l, new C17366l(jArr), new C17366l(jArr2), C16878l.firebase, 1);
            case 15:
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[2];
                int i22 = i * 4;
                while (i3 < 2) {
                    long[] jArr6 = (long[]) obj;
                    jArr4[i3] = jArr6[i22 + i3];
                    jArr5[i3] = jArr6[i22 + 2 + i3];
                    i3++;
                }
                return new C13683l((C4476l) abstractC11918l, new C17366l(jArr4), new C17366l(jArr5), C4476l.firebase, 2);
            case 16:
                long[] jArr7 = new long[3];
                long[] jArr8 = new long[3];
                int i23 = i * 6;
                while (i3 < 3) {
                    long[] jArr9 = (long[]) obj;
                    jArr7[i3] = jArr9[i23 + i3];
                    jArr8[i3] = jArr9[i23 + 3 + i3];
                    i3++;
                }
                return new C13683l((C17478l) abstractC11918l, new C7908l(jArr7), new C7908l(jArr8), C17478l.firebase, 3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long[] jArr10 = new long[3];
                long[] jArr11 = new long[3];
                int i24 = i * 6;
                while (i3 < 3) {
                    long[] jArr12 = (long[]) obj;
                    jArr10[i3] = jArr12[i24 + i3];
                    jArr11[i3] = jArr12[i24 + 3 + i3];
                    i3++;
                }
                return new C13683l((C0345l) abstractC11918l, new C7908l(jArr10), new C7908l(jArr11), C0345l.firebase, 4);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long[] jArr13 = new long[3];
                long[] jArr14 = new long[3];
                int i25 = i * 6;
                while (i3 < 3) {
                    long[] jArr15 = (long[]) obj;
                    jArr13[i3] = jArr15[i25 + i3];
                    jArr14[i3] = jArr15[i25 + 3 + i3];
                    i3++;
                }
                return new C13683l((C8851l) abstractC11918l, new C12917l(jArr13), new C12917l(jArr14), C8851l.firebase, 5);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                long[] jArr16 = new long[3];
                long[] jArr17 = new long[3];
                int i26 = i * 6;
                while (i3 < 3) {
                    long[] jArr18 = (long[]) obj;
                    jArr16[i3] = jArr18[i26 + i3];
                    jArr17[i3] = jArr18[i26 + 3 + i3];
                    i3++;
                }
                return new C13683l((C0681l) abstractC11918l, new C12917l(jArr16), new C12917l(jArr17), C0681l.firebase, 6);
            case 20:
                long[] jArr19 = new long[3];
                long[] jArr20 = new long[3];
                int i27 = i * 6;
                while (i3 < 3) {
                    long[] jArr21 = (long[]) obj;
                    jArr19[i3] = jArr21[i27 + i3];
                    jArr20[i3] = jArr21[i27 + 3 + i3];
                    i3++;
                }
                return new C13683l((C13875l) abstractC11918l, new C12917l(jArr19), new C12917l(jArr20), C13875l.firebase, 7);
            case 21:
                long[] jArr22 = new long[4];
                long[] jArr23 = new long[4];
                int i28 = i * 8;
                while (i3 < 4) {
                    long[] jArr24 = (long[]) obj;
                    jArr22[i3] = jArr24[i28 + i3];
                    jArr23[i3] = jArr24[i28 + 4 + i3];
                    i3++;
                }
                return new C13683l((C7604l) abstractC11918l, new C1099l(jArr22), new C1099l(jArr23), C7604l.firebase, 8);
            case 22:
                long[] jArr25 = new long[4];
                long[] jArr26 = new long[4];
                int i29 = i * 8;
                while (i3 < 4) {
                    long[] jArr27 = (long[]) obj;
                    jArr25[i3] = jArr25[i3] ^ jArr27[i29 + i3];
                    jArr26[i3] = jArr26[i3] ^ jArr27[(i29 + 4) + i3];
                    i3++;
                }
                return new C13683l((C15163l) abstractC11918l, new C1099l(jArr25), new C1099l(jArr26), C15163l.firebase, 9);
            case 23:
                long[] jArr28 = new long[4];
                long[] jArr29 = new long[4];
                int i30 = i * 8;
                while (i3 < 4) {
                    long[] jArr30 = (long[]) obj;
                    jArr28[i3] = jArr30[i30 + i3];
                    jArr29[i3] = jArr30[i30 + 4 + i3];
                    i3++;
                }
                return new C13683l((C15240l) abstractC11918l, new C9194l(jArr28), new C9194l(jArr29), C15240l.firebase, 10);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                long[] jArr31 = new long[4];
                long[] jArr32 = new long[4];
                int i31 = i * 8;
                while (i3 < 4) {
                    long[] jArr33 = (long[]) obj;
                    jArr31[i3] = jArr33[i31 + i3];
                    jArr32[i3] = jArr33[i31 + 4 + i3];
                    i3++;
                }
                return new C13683l((C10248l) abstractC11918l, new C9194l(jArr31), new C9194l(jArr32), C10248l.firebase, 11);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                long[] jArr34 = new long[4];
                long[] jArr35 = new long[4];
                int i32 = i * 8;
                while (i3 < 4) {
                    long[] jArr36 = (long[]) obj;
                    jArr34[i3] = jArr36[i32 + i3];
                    jArr35[i3] = jArr36[i32 + 4 + i3];
                    i3++;
                }
                return new C13683l((C18237l) abstractC11918l, new C4410l(jArr34), new C4410l(jArr35), C18237l.firebase, 12);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                long[] jArr37 = new long[5];
                long[] jArr38 = new long[5];
                int i33 = i * 10;
                while (i3 < 5) {
                    long[] jArr39 = (long[]) obj;
                    jArr37[i3] = jArr39[i33 + i3];
                    jArr38[i3] = jArr39[i33 + 5 + i3];
                    i3++;
                }
                return new C13683l((C12293l) abstractC11918l, new C13897l(jArr37), new C13897l(jArr38), C12293l.firebase, 13);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long[] jArr40 = new long[5];
                long[] jArr41 = new long[5];
                int i34 = i * 10;
                while (i3 < 5) {
                    long[] jArr42 = (long[]) obj;
                    jArr40[i3] = jArr42[i34 + i3];
                    jArr41[i3] = jArr42[i34 + 5 + i3];
                    i3++;
                }
                return new C13683l((C16868l) abstractC11918l, new C13897l(jArr40), new C13897l(jArr41), C16868l.firebase, 14);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long[] jArr43 = new long[7];
                long[] jArr44 = new long[7];
                int i35 = i * 14;
                while (i3 < 7) {
                    long[] jArr45 = (long[]) obj;
                    jArr43[i3] = jArr45[i35 + i3];
                    jArr44[i3] = jArr45[i35 + 7 + i3];
                    i3++;
                }
                return new C13683l((C17938l) abstractC11918l, new C7385l(jArr43), new C7385l(jArr44), C17938l.firebase, 15);
            default:
                long[] jArr46 = new long[7];
                long[] jArr47 = new long[7];
                int i36 = i * 14;
                while (i3 < 7) {
                    long[] jArr48 = (long[]) obj;
                    jArr46[i3] = jArr48[i36 + i3];
                    jArr47[i3] = jArr48[i36 + 7 + i3];
                    i3++;
                }
                return new C13683l((C10587l) abstractC11918l, new C7385l(jArr46), new C7385l(jArr47), C10587l.firebase, 16);
        }
    }

    @Override // defpackage.AbstractC17780l
    public final int purchase() {
        switch (this.loadAd) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
        }
        return this.crashlytics;
    }
}
