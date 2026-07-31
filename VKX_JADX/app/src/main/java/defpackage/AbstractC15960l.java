package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: lٕ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15960l {
    public static final byte[] yandex = {83, 105, 103, 69, 100, 52, 52, 56};
    public static final int[] loadAd = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] crashlytics = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    public static final int[] amazon = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    public static final int[] purchase = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    public static final int[] billing = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    public static final Object mopub = new Object();
    public static C12507l[] admob = null;
    public static C12507l[] subs = null;
    public static int[] isPro = null;

    public static void adcel(C12507l c12507l, C10111l[] c10111lArr, int i, int i2, C14169l c14169l) {
        C10111l c10111l = new C10111l(16);
        metrica(c12507l, c10111l);
        startapp(c10111l, c14169l);
        C10111l c10111l2 = new C10111l(16);
        c10111lArr[i] = c10111l2;
        metrica(c12507l, c10111l2);
        for (int i3 = 1; i3 < i2; i3++) {
            int i4 = i + i3;
            C10111l c10111l3 = new C10111l(16);
            c10111lArr[i4] = c10111l3;
            vip(c10111lArr[i4 - 1], c10111l3);
            firebase(c10111l, c10111lArr[i4], c14169l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean admob(byte[] bArr, C7972l c7972l, byte[] bArr2, byte b, byte[] bArr3, int i) {
        boolean z;
        boolean z2;
        C12507l c12507l;
        int[] iArr;
        int i2;
        int[] iArr2;
        char c;
        int[] iArr3;
        boolean z3;
        int i3;
        boolean z4;
        if (bArr2 == null || bArr2.length >= 256) {
            C8339l.metrica("ctx");
            return false;
        }
        byte[] bArr4 = new byte[57];
        System.arraycopy(bArr, 0, bArr4, 0, 57);
        byte[] bArr5 = new byte[57];
        System.arraycopy(bArr, 57, bArr5, 0, 57);
        if ((bArr4[56] & 127) != 0) {
            z = false;
        } else {
            int iCrashlytics = AbstractC16655l.crashlytics(52, bArr4);
            int[] iArr4 = loadAd;
            if (iCrashlytics != iArr4[13]) {
                z = true;
            } else {
                int[] iArr5 = new int[14];
                AbstractC16655l.amazon(14, bArr4, iArr5);
                z = !AbstractC4952l.adcel(14, iArr5, iArr4);
            }
        }
        if (z) {
            int[] iArr6 = new int[14];
            byte b2 = bArr5[56];
            int[] iArr7 = AbstractC1896l.yandex;
            if (b2 != 0) {
                z2 = false;
            } else {
                AbstractC1896l.purchase(bArr5, iArr6);
                z2 = !AbstractC4952l.adcel(14, iArr6, iArr7);
            }
            if (z2) {
                C12507l c12507l2 = new C12507l(1);
                if (amazon(bArr4, true, c12507l2)) {
                    C12507l c12507l3 = new C12507l(1);
                    AbstractC6791l.advert(new int[16], (int[]) c7972l.f16631l, c12507l3.f24647l);
                    AbstractC6791l.billing(16, 0, (int[]) c7972l.f16631l, c12507l3.f24646l);
                    byte[] bArr6 = new byte[57];
                    billing(c7972l, bArr6, 0);
                    C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                    byte[] bArr7 = new byte[114];
                    purchase(b, c17951l, bArr2);
                    c17951l.billing(0, 57, bArr4);
                    c17951l.billing(0, 57, bArr6);
                    c17951l.billing(0, i, bArr3);
                    c17951l.crashlytics(0, 114, bArr7);
                    int[] iArr8 = new int[14];
                    AbstractC1896l.purchase(AbstractC1896l.billing(bArr7), iArr8);
                    int[] iArr9 = new int[8];
                    int[] iArr10 = new int[8];
                    int[] iArr11 = new int[28];
                    System.arraycopy(AbstractC1896l.loadAd, 0, iArr11, 0, 28);
                    int[] iArr12 = new int[28];
                    AbstractC3292l.license(iArr8, iArr12);
                    long j = ((long) iArr8[7]) & 4294967295L;
                    int i4 = 6;
                    int i5 = 0;
                    int i6 = 14;
                    while (true) {
                        int i7 = i4 - 1;
                        c12507l = c12507l3;
                        long j2 = ((long) iArr8[i4 + 7]) & 4294967295L;
                        long j3 = j2 * j2;
                        iArr12[i6 + 13] = (i5 << 31) | ((int) (j3 >>> 33));
                        int i8 = i6 - 2;
                        iArr = iArr9;
                        iArr12[i6 + 12] = (int) (j3 >>> 1);
                        i2 = (int) j3;
                        if (i7 <= 0) {
                            break;
                        }
                        i6 = i8;
                        iArr9 = iArr;
                        c12507l3 = c12507l;
                        i5 = i2;
                        i4 = i7;
                    }
                    long j4 = j * j;
                    iArr12[14] = (int) j4;
                    long j5 = ((long) iArr8[8]) & 4294967295L;
                    long j6 = ((long) iArr12[16]) & 4294967295L;
                    long j7 = (j5 * j) + ((((long) (i2 << 31)) & 4294967295L) | (j4 >>> 33));
                    int i9 = (int) j7;
                    iArr12[15] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                    int i10 = i9 >>> 31;
                    long j8 = j6 + (j7 >>> 32);
                    long j9 = ((long) iArr8[9]) & 4294967295L;
                    long j10 = ((long) iArr12[17]) & 4294967295L;
                    long j11 = ((long) iArr12[18]) & 4294967295L;
                    long j12 = (j9 * j) + j8;
                    int i11 = (int) j12;
                    iArr12[16] = (i11 << 1) | i10;
                    long jRemoteconfig = AbstractC0653l.remoteconfig(j9, j5, j12 >>> 32, j10);
                    long j13 = j11 + (jRemoteconfig >>> 32);
                    long j14 = ((long) iArr8[10]) & 4294967295L;
                    long j15 = (((long) iArr12[19]) & 4294967295L) + (j13 >>> 32);
                    long j16 = (((long) iArr12[20]) & 4294967295L) + (j15 >>> 32);
                    long j17 = (j14 * j) + (jRemoteconfig & 4294967295L);
                    int i12 = (int) j17;
                    iArr12[17] = (i12 << 1) | (i11 >>> 31);
                    long jRemoteconfig2 = AbstractC0653l.remoteconfig(j14, j5, j17 >>> 32, j13 & 4294967295L);
                    long jRemoteconfig3 = AbstractC0653l.remoteconfig(j14, j9, jRemoteconfig2 >>> 32, j15 & 4294967295L);
                    long j18 = j16 + (jRemoteconfig3 >>> 32);
                    long j19 = ((long) iArr8[11]) & 4294967295L;
                    long j20 = (((long) iArr12[21]) & 4294967295L) + (j18 >>> 32);
                    long j21 = j18 & 4294967295L;
                    long j22 = (((long) iArr12[22]) & 4294967295L) + (j20 >>> 32);
                    long j23 = (j19 * j) + (jRemoteconfig2 & 4294967295L);
                    int i13 = (int) j23;
                    iArr12[18] = (i13 << 1) | (i12 >>> 31);
                    long jRemoteconfig4 = AbstractC0653l.remoteconfig(j19, j5, j23 >>> 32, jRemoteconfig3 & 4294967295L);
                    long jRemoteconfig5 = AbstractC0653l.remoteconfig(j19, j9, jRemoteconfig4 >>> 32, j21);
                    long jRemoteconfig6 = AbstractC0653l.remoteconfig(j19, j14, jRemoteconfig5 >>> 32, j20 & 4294967295L);
                    long j24 = jRemoteconfig5 & 4294967295L;
                    long j25 = j22 + (jRemoteconfig6 >>> 32);
                    long j26 = jRemoteconfig6 & 4294967295L;
                    long j27 = ((long) iArr8[12]) & 4294967295L;
                    long j28 = (((long) iArr12[23]) & 4294967295L) + (j25 >>> 32);
                    long j29 = (((long) iArr12[24]) & 4294967295L) + (j28 >>> 32);
                    long j30 = (j27 * j) + (jRemoteconfig4 & 4294967295L);
                    int i14 = (int) j30;
                    iArr12[19] = (i13 >>> 31) | (i14 << 1);
                    long jRemoteconfig7 = AbstractC0653l.remoteconfig(j27, j5, j30 >>> 32, j24);
                    long jRemoteconfig8 = AbstractC0653l.remoteconfig(j27, j9, jRemoteconfig7 >>> 32, j26);
                    long jRemoteconfig9 = AbstractC0653l.remoteconfig(j27, j14, jRemoteconfig8 >>> 32, j25 & 4294967295L);
                    long j31 = jRemoteconfig8 & 4294967295L;
                    long jRemoteconfig10 = AbstractC0653l.remoteconfig(j27, j19, jRemoteconfig9 >>> 32, j28 & 4294967295L);
                    long j32 = j29 + (jRemoteconfig10 >>> 32);
                    long j33 = ((long) iArr8[13]) & 4294967295L;
                    long j34 = (((long) iArr12[25]) & 4294967295L) + (j32 >>> 32);
                    long j35 = j32 & 4294967295L;
                    long j36 = (((long) iArr12[26]) & 4294967295L) + (j34 >>> 32);
                    long j37 = j34 & 4294967295L;
                    long j38 = (j33 * j) + (jRemoteconfig7 & 4294967295L);
                    int i15 = (int) j38;
                    iArr12[20] = (i15 << 1) | (i14 >>> 31);
                    long jRemoteconfig11 = AbstractC0653l.remoteconfig(j33, j5, j38 >>> 32, j31);
                    long jRemoteconfig12 = AbstractC0653l.remoteconfig(j33, j9, jRemoteconfig11 >>> 32, jRemoteconfig9 & 4294967295L);
                    long jRemoteconfig13 = AbstractC0653l.remoteconfig(j33, j14, jRemoteconfig12 >>> 32, jRemoteconfig10 & 4294967295L);
                    long jRemoteconfig14 = AbstractC0653l.remoteconfig(j33, j19, jRemoteconfig13 >>> 32, j35);
                    long jRemoteconfig15 = AbstractC0653l.remoteconfig(j33, j27, jRemoteconfig14 >>> 32, j37);
                    long j39 = j36 + (jRemoteconfig15 >>> 32);
                    int i16 = (int) jRemoteconfig11;
                    iArr12[21] = (i15 >>> 31) | (i16 << 1);
                    int i17 = i16 >>> 31;
                    int i18 = (int) jRemoteconfig12;
                    iArr12[22] = i17 | (i18 << 1);
                    int i19 = (int) jRemoteconfig13;
                    iArr12[23] = (i19 << 1) | (i18 >>> 31);
                    int i20 = (int) jRemoteconfig14;
                    iArr12[24] = (i19 >>> 31) | (i20 << 1);
                    int i21 = i20 >>> 31;
                    int i22 = (int) jRemoteconfig15;
                    iArr12[25] = i21 | (i22 << 1);
                    int i23 = i22 >>> 31;
                    int i24 = (int) j39;
                    iArr12[26] = i23 | (i24 << 1);
                    iArr12[27] = (i24 >>> 31) | ((iArr12[27] + ((int) (j39 >>> 32))) << 1);
                    int iMopub = AbstractC3292l.mopub(iArr12, iArr12);
                    int iBilling = AbstractC3292l.billing(21, 14, iArr12, iArr12, AbstractC3292l.billing(0, 7, iArr12, iArr12, 0) + iMopub) + iMopub;
                    int[] iArr13 = new int[7];
                    AbstractC3292l.isPro(iArr8, iArr8, iArr13);
                    int[] iArr14 = new int[14];
                    AbstractC3292l.license(iArr13, iArr14);
                    AbstractC4952l.admob(28, AbstractC4952l.m1650package(14, 7, iArr14, iArr12) + iBilling, 21, iArr12);
                    iArr12[0] = iArr12[0] + 1;
                    int[] iArr15 = new int[28];
                    AbstractC3292l.tapsense(iArr7, iArr8, iArr15);
                    long j40 = ((long) iArr8[7]) & 4294967295L;
                    long j41 = ((long) iArr8[8]) & 4294967295L;
                    long j42 = ((long) iArr8[9]) & 4294967295L;
                    long j43 = ((long) iArr8[10]) & 4294967295L;
                    long j44 = ((long) iArr8[11]) & 4294967295L;
                    long j45 = ((long) iArr8[12]) & 4294967295L;
                    long j46 = ((long) iArr8[13]) & 4294967295L;
                    long j47 = ((long) iArr7[7]) & 4294967295L;
                    int[] iArr16 = iArr8;
                    long j48 = j47 * j40;
                    iArr15[14] = (int) j48;
                    long j49 = (j47 * j41) + (j48 >>> 32);
                    iArr15[15] = (int) j49;
                    long j50 = (j47 * j42) + (j49 >>> 32);
                    iArr15[16] = (int) j50;
                    long j51 = (j47 * j43) + (j50 >>> 32);
                    iArr15[17] = (int) j51;
                    long j52 = (j47 * j44) + (j51 >>> 32);
                    iArr15[18] = (int) j52;
                    long j53 = (j47 * j45) + (j52 >>> 32);
                    iArr15[19] = (int) j53;
                    long j54 = (j47 * j46) + (j53 >>> 32);
                    iArr15[20] = (int) j54;
                    iArr15[21] = (int) (j54 >>> 32);
                    int i25 = 1;
                    int i26 = 14;
                    while (i25 < 7) {
                        int i27 = i26 + 1;
                        long j55 = ((long) iArr7[7 + i25]) & 4294967295L;
                        int i28 = i25;
                        int i29 = i26;
                        long j56 = (j55 * j40) + (((long) iArr15[i27]) & 4294967295L);
                        iArr15[i27] = (int) j56;
                        int i30 = i29 + 2;
                        long j57 = (j55 * j41) + (((long) iArr15[i30]) & 4294967295L) + (j56 >>> 32);
                        iArr15[i30] = (int) j57;
                        int i31 = i29 + 3;
                        long j58 = (j55 * j42) + (((long) iArr15[i31]) & 4294967295L) + (j57 >>> 32);
                        iArr15[i31] = (int) j58;
                        int i32 = i29 + 4;
                        long j59 = (j55 * j43) + (((long) iArr15[i32]) & 4294967295L) + (j58 >>> 32);
                        iArr15[i32] = (int) j59;
                        int i33 = i29 + 5;
                        long j60 = (j55 * j44) + (((long) iArr15[i33]) & 4294967295L) + (j59 >>> 32);
                        iArr15[i33] = (int) j60;
                        int i34 = i29 + 6;
                        long j61 = (j55 * j45) + (((long) iArr15[i34]) & 4294967295L) + (j60 >>> 32);
                        iArr15[i34] = (int) j61;
                        int i35 = i29 + 7;
                        long j62 = (j55 * j46) + (((long) iArr15[i35]) & 4294967295L) + (j61 >>> 32);
                        iArr15[i35] = (int) j62;
                        iArr15[i29 + 8] = (int) (j62 >>> 32);
                        i25 = i28 + 1;
                        iArr16 = iArr16;
                        i26 = i27;
                    }
                    int[] iArr17 = iArr16;
                    int iMopub2 = AbstractC3292l.mopub(iArr15, iArr15);
                    int iBilling2 = AbstractC3292l.billing(21, 14, iArr15, iArr15, AbstractC3292l.billing(0, 7, iArr15, iArr15, 0) + iMopub2) + iMopub2;
                    int[] iArr18 = new int[7];
                    int[] iArr19 = new int[7];
                    boolean z5 = AbstractC3292l.isPro(iArr7, iArr7, iArr18) != AbstractC3292l.isPro(iArr17, iArr17, iArr19);
                    int[] iArr20 = new int[14];
                    AbstractC3292l.tapsense(iArr18, iArr19, iArr20);
                    AbstractC4952l.admob(28, iBilling2 + (z5 ? AbstractC4952l.billing(14, 7, iArr20, iArr15) : AbstractC4952l.m1650package(14, 7, iArr20, iArr15)), 21, iArr15);
                    int[] iArr21 = new int[28];
                    int[] iArr22 = new int[8];
                    System.arraycopy(iArr7, 0, iArr22, 0, 8);
                    int[] iArr23 = new int[8];
                    System.arraycopy(iArr17, 0, iArr23, 0, 8);
                    int[] iArr24 = new int[8];
                    iArr24[0] = 1;
                    int i36 = 27;
                    int iAdmob = AbstractC3979l.admob(iArr12, 27);
                    int[] iArr25 = iArr11;
                    int[] iArr26 = iArr23;
                    int[] iArr27 = iArr12;
                    int[] iArr28 = iArr24;
                    int[] iArr29 = iArr22;
                    int i37 = 1788;
                    int[] iArr30 = new int[8];
                    while (true) {
                        if (iAdmob <= 447) {
                            iArr2 = iArr;
                            c = 0;
                            System.arraycopy(iArr26, 0, iArr2, 0, 8);
                            iArr3 = iArr10;
                            System.arraycopy(iArr28, 0, iArr3, 0, 8);
                            z3 = true;
                            break;
                        }
                        i37--;
                        if (i37 < 0) {
                            iArr3 = iArr10;
                            iArr2 = iArr;
                            c = 0;
                            z3 = false;
                            break;
                        }
                        int iMopub3 = AbstractC3979l.mopub(iArr15, i36) - iAdmob;
                        int i38 = iMopub3 & (~(iMopub3 >> 31));
                        int[] iArr31 = iArr15;
                        int[] iArr32 = iArr21;
                        int i39 = i36;
                        if (iArr15[i36] < 0) {
                            AbstractC3979l.yandex(i39, i38, iArr25, iArr27, iArr31, iArr32);
                            AbstractC3979l.loadAd(7, i38, iArr29, iArr30, iArr26, iArr28);
                        } else {
                            AbstractC3979l.startapp(i39, i38, iArr25, iArr27, iArr31, iArr32);
                            AbstractC3979l.adcel(7, i38, iArr29, iArr30, iArr26, iArr28);
                        }
                        int i40 = i39;
                        while (true) {
                            int i41 = iArr25[i40] + RecyclerView.UNDEFINED_DURATION;
                            int i42 = iArr27[i40] + RecyclerView.UNDEFINED_DURATION;
                            if (i41 < i42) {
                                z4 = true;
                                break;
                            }
                            if (i41 > i42 || (i40 = i40 - 1) < 0) {
                                z4 = false;
                                break;
                            }
                        }
                        if (z4) {
                            int i43 = iAdmob >>> 5;
                            int[] iArr33 = iArr26;
                            iArr26 = iArr29;
                            iArr29 = iArr33;
                            int[] iArr34 = iArr28;
                            iArr28 = iArr30;
                            iArr30 = iArr34;
                            i36 = i43;
                            iAdmob = AbstractC3979l.admob(iArr25, i43);
                            iArr25 = iArr27;
                            iArr27 = iArr25;
                        } else {
                            iArr25 = iArr25;
                            i36 = i39;
                        }
                        iArr15 = iArr31;
                        iArr21 = iArr32;
                    }
                    if (!z3) {
                        boolean z6 = c;
                        C18073l.admob();
                        return z6;
                    }
                    int[] iArr35 = new int[22];
                    long j63 = ((long) iArr3[c]) & 4294967295L;
                    long j64 = 0;
                    int i44 = 0;
                    while (true) {
                        long j65 = j63;
                        long j66 = (j65 * (((long) iArr6[i44]) & 4294967295L)) + j64;
                        iArr35[i44] = (int) j66;
                        j64 = j66 >>> 32;
                        i44++;
                        if (i44 >= 14) {
                            break;
                        }
                        j63 = j65;
                        iArr3 = iArr3;
                    }
                    iArr35[14] = (int) j64;
                    for (int i45 = 1; i45 < 8; i45++) {
                        iArr35[i45 + 14] = AbstractC4952l.advert(14, iArr3[i45], iArr6, iArr35, i45);
                    }
                    if (iArr3[7] < 0) {
                        AbstractC4952l.billing(14, 8, iArr7, iArr35);
                        AbstractC4952l.m1650package(14, 8, iArr6, iArr35);
                    }
                    byte[] bArr8 = new byte[88];
                    AbstractC16655l.billing(22, bArr8, iArr35);
                    long jCrashlytics = ((long) AbstractC16655l.crashlytics(0, bArr8)) & 4294967295L;
                    long jLoadAd = ((long) (AbstractC16655l.loadAd(4, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics2 = ((long) AbstractC16655l.crashlytics(7, bArr8)) & 4294967295L;
                    long jLoadAd2 = ((long) (AbstractC16655l.loadAd(11, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics3 = ((long) AbstractC16655l.crashlytics(14, bArr8)) & 4294967295L;
                    long jLoadAd3 = ((long) (AbstractC16655l.loadAd(18, bArr8) << 4)) & 4294967295L;
                    int[] iArr36 = iArr3;
                    long jCrashlytics4 = ((long) AbstractC16655l.crashlytics(21, bArr8)) & 4294967295L;
                    long jLoadAd4 = ((long) (AbstractC16655l.loadAd(25, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics5 = ((long) AbstractC16655l.crashlytics(28, bArr8)) & 4294967295L;
                    long jLoadAd5 = ((long) (AbstractC16655l.loadAd(32, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics6 = ((long) AbstractC16655l.crashlytics(35, bArr8)) & 4294967295L;
                    long jLoadAd6 = ((long) (AbstractC16655l.loadAd(39, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics7 = ((long) AbstractC16655l.crashlytics(42, bArr8)) & 4294967295L;
                    long jLoadAd7 = ((long) (AbstractC16655l.loadAd(46, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics8 = ((long) AbstractC16655l.crashlytics(49, bArr8)) & 4294967295L;
                    long jLoadAd8 = ((long) (AbstractC16655l.loadAd(53, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics9 = ((long) AbstractC16655l.crashlytics(56, bArr8)) & 4294967295L;
                    long jLoadAd9 = AbstractC16655l.loadAd(60, bArr8) << 4;
                    long j67 = jLoadAd9 & 4294967295L;
                    long jCrashlytics10 = ((long) AbstractC16655l.crashlytics(63, bArr8)) & 4294967295L;
                    long jLoadAd10 = ((long) (AbstractC16655l.loadAd(67, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics11 = AbstractC16655l.crashlytics(70, bArr8);
                    long j68 = jCrashlytics11 & 4294967295L;
                    long jLoadAd11 = ((long) (AbstractC16655l.loadAd(74, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics12 = ((long) AbstractC16655l.crashlytics(77, bArr8)) & 4294967295L;
                    long jLoadAd12 = ((long) (AbstractC16655l.loadAd(81, bArr8) << 4)) & 4294967295L;
                    long jCrashlytics13 = AbstractC16655l.crashlytics(84, bArr8);
                    long j69 = (jCrashlytics13 & 4294967295L) >>> 28;
                    long j70 = jLoadAd11 + (j68 >>> 28);
                    long j71 = jCrashlytics12 + (j70 >>> 28);
                    long j72 = jLoadAd12 + (j71 >>> 28);
                    long j73 = j71 & 268435455;
                    long j74 = (jCrashlytics13 & 268435455) + (j72 >>> 28);
                    long j75 = j72 & 268435455;
                    long j76 = (j75 * 43969588) + jLoadAd4;
                    long j77 = (j75 * 30366549) + (j74 * 43969588) + jCrashlytics5;
                    long j78 = (j75 * 163752818) + (j74 * 30366549) + (j69 * 43969588) + jLoadAd5;
                    long j79 = (j75 * 258169998) + (j74 * 163752818) + (j69 * 30366549) + jCrashlytics6;
                    long j80 = (j75 * 96434764) + (j74 * 258169998) + (j69 * 163752818) + jLoadAd6;
                    long j81 = (j75 * 227822194) + (j74 * 96434764) + (j69 * 258169998) + jCrashlytics7;
                    long j82 = (j75 * 149865618) + (j74 * 227822194) + (j69 * 96434764) + jLoadAd7;
                    long j83 = (j75 * 550336261) + (j74 * 149865618) + (j69 * 227822194) + jCrashlytics8;
                    long j84 = (j73 * 43969588) + jCrashlytics4;
                    long j85 = (j73 * 30366549) + j76;
                    long j86 = (j73 * 163752818) + j77;
                    long j87 = (j73 * 258169998) + j78;
                    long j88 = (j73 * 96434764) + j79;
                    long j89 = (j73 * 227822194) + j80;
                    long j90 = (j73 * 149865618) + j81;
                    long j91 = (j73 * 550336261) + j82;
                    long j92 = jCrashlytics10 + (j67 >>> 28);
                    long j93 = jLoadAd10 + (j92 >>> 28);
                    long j94 = (jCrashlytics11 & 268435455) + (j93 >>> 28);
                    long j95 = j93 & 268435455;
                    long j96 = (j70 & 268435455) + (j94 >>> 28);
                    long j97 = j94 & 268435455;
                    long j98 = (j96 * 43969588) + jLoadAd3;
                    long j99 = (j96 * 30366549) + j84;
                    long j100 = (j96 * 163752818) + j85;
                    long j101 = (j96 * 258169998) + j86;
                    long j102 = (j96 * 96434764) + j87;
                    long j103 = (j96 * 227822194) + j88;
                    long j104 = (j96 * 149865618) + j89;
                    long j105 = (j96 * 550336261) + j90;
                    long j106 = (j97 * 43969588) + jCrashlytics3;
                    long j107 = (j97 * 30366549) + j98;
                    long j108 = (j97 * 163752818) + j99;
                    long j109 = (j97 * 258169998) + j100;
                    long j110 = (j97 * 96434764) + j101;
                    long j111 = (j97 * 227822194) + j102;
                    long j112 = (j97 * 149865618) + j103;
                    long j113 = (j97 * 550336261) + j104;
                    long j114 = (j95 * 43969588) + jLoadAd2;
                    long j115 = (j95 * 30366549) + j106;
                    long j116 = (j95 * 163752818) + j107;
                    long j117 = (j95 * 258169998) + j108;
                    long j118 = (j95 * 96434764) + j109;
                    long j119 = (j95 * 227822194) + j110;
                    long j120 = (j95 * 149865618) + j111;
                    long j121 = (j74 * 550336261) + (j69 * 149865618) + jLoadAd8 + (j83 >>> 28);
                    long j122 = j83 & 268435455;
                    long j123 = (j69 * 550336261) + jCrashlytics9 + (j121 >>> 28);
                    long j124 = (jLoadAd9 & 268435455) + (j123 >>> 28);
                    long j125 = (j92 & 268435455) + (j124 >>> 28);
                    long j126 = j124 & 268435455;
                    long j127 = (j125 * 43969588) + jCrashlytics2;
                    long j128 = (j125 * 30366549) + j114;
                    long j129 = (j125 * 163752818) + j115;
                    long j130 = (j125 * 258169998) + j116;
                    long j131 = (j125 * 96434764) + j117;
                    long j132 = (j125 * 227822194) + j118;
                    long j133 = (j125 * 149865618) + j119;
                    long j134 = (j125 * 550336261) + j120;
                    long j135 = (43969588 * j126) + jLoadAd;
                    long j136 = (30366549 * j126) + j127;
                    long j137 = (163752818 * j126) + j128;
                    long j138 = (258169998 * j126) + j129;
                    long j139 = (96434764 * j126) + j130;
                    long j140 = (227822194 * j126) + j131;
                    long j141 = (149865618 * j126) + j132;
                    long j142 = (j126 * 550336261) + j133;
                    long j143 = ((j123 & 268435455) * 4) + ((j121 & 268435455) >>> 26) + 1;
                    long j144 = (j143 * 78101261) + jCrashlytics;
                    long j145 = (j143 * 141809365) + j135;
                    long j146 = (j143 * 175155932) + j136;
                    long j147 = (j143 * 64542499) + j137;
                    long j148 = (j143 * 158326419) + j138;
                    long j149 = (j143 * 191173276) + j139;
                    long j150 = (j143 * 104575268) + j140;
                    long j151 = (j143 * 137584065) + j141;
                    long j152 = j145 + (j144 >>> 28);
                    long j153 = j146 + (j152 >>> 28);
                    long j154 = j147 + (j153 >>> 28);
                    long j155 = j148 + (j154 >>> 28);
                    long j156 = j154 & 268435455;
                    long j157 = j149 + (j155 >>> 28);
                    long j158 = j155 & 268435455;
                    long j159 = j150 + (j157 >>> 28);
                    long j160 = j157 & 268435455;
                    long j161 = j151 + (j159 >>> 28);
                    long j162 = j159 & 268435455;
                    long j163 = j142 + (j161 >>> 28);
                    long j164 = j134 + (j163 >>> 28);
                    long j165 = (j95 * 550336261) + j112 + (j164 >>> 28);
                    long j166 = j113 + (j165 >>> 28);
                    long j167 = j105 + (j166 >>> 28);
                    long j168 = j91 + (j167 >>> 28);
                    long j169 = j122 + (j168 >>> 28);
                    long j170 = (j121 & 67108863) + (j169 >>> 28);
                    long j171 = (j170 >>> 26) - 1;
                    long j172 = (j144 & 268435455) - (j171 & 78101261);
                    long j173 = ((j152 & 268435455) - (j171 & 141809365)) + (j172 >> 28);
                    long j174 = ((j153 & 268435455) - (j171 & 175155932)) + (j173 >> 28);
                    long j175 = (j156 - (j171 & 64542499)) + (j174 >> 28);
                    long j176 = (j158 - (j171 & 158326419)) + (j175 >> 28);
                    long j177 = (j160 - (j171 & 191173276)) + (j176 >> 28);
                    long j178 = (j162 - (j171 & 104575268)) + (j177 >> 28);
                    long j179 = ((j161 & 268435455) - (j171 & 137584065)) + (j178 >> 28);
                    long j180 = (j163 & 268435455) + (j179 >> 28);
                    long j181 = (j164 & 268435455) + (j180 >> 28);
                    long j182 = (j165 & 268435455) + (j181 >> 28);
                    long j183 = (j166 & 268435455) + (j182 >> 28);
                    long j184 = (j167 & 268435455) + (j183 >> 28);
                    long j185 = (j168 & 268435455) + (j184 >> 28);
                    long j186 = (j169 & 268435455) + (j185 >> 28);
                    byte[] bArr9 = new byte[57];
                    AbstractC16655l.mopub((j172 & 268435455) | ((j173 & 268435455) << 28), bArr9, 0);
                    AbstractC16655l.mopub(((j175 & 268435455) << 28) | (j174 & 268435455), bArr9, 7);
                    AbstractC16655l.mopub((j176 & 268435455) | ((j177 & 268435455) << 28), bArr9, 14);
                    AbstractC16655l.mopub((j178 & 268435455) | ((j179 & 268435455) << 28), bArr9, 21);
                    AbstractC16655l.mopub((j180 & 268435455) | ((j181 & 268435455) << 28), bArr9, 28);
                    AbstractC16655l.mopub((j182 & 268435455) | ((j183 & 268435455) << 28), bArr9, 35);
                    AbstractC16655l.mopub((j184 & 268435455) | ((j185 & 268435455) << 28), bArr9, 42);
                    AbstractC16655l.mopub((((j170 & 67108863) + (j186 >> 28)) << 28) | (j186 & 268435455), bArr9, 49);
                    AbstractC1896l.purchase(bArr9, iArr6);
                    C10111l c10111l = new C10111l(16);
                    ads();
                    byte[] bArr10 = new byte[450];
                    int i46 = 225;
                    byte[] bArr11 = new byte[225];
                    byte[] bArr12 = new byte[225];
                    AbstractC8238l.crashlytics(7, bArr10, iArr6);
                    AbstractC8238l.crashlytics(5, bArr11, iArr2);
                    AbstractC8238l.crashlytics(5, bArr12, iArr36);
                    C10111l[] c10111lArr = new C10111l[8];
                    C10111l[] c10111lArr2 = new C10111l[8];
                    C14169l c14169l = new C14169l(1);
                    int i47 = 0;
                    adcel(c12507l, c10111lArr, 0, 8, c14169l);
                    adcel(c12507l2, c10111lArr2, 0, 8, c14169l);
                    int[] iArr37 = (int[]) c10111l.f20587l;
                    for (int i48 = 0; i48 < 16; i48++) {
                        iArr37[i48] = 0;
                    }
                    int[] iArr38 = (int[]) c10111l.f20586l;
                    iArr38[0] = 1;
                    for (int i49 = 1; i49 < 16; i49++) {
                        iArr38[i49] = 0;
                    }
                    int[] iArr39 = (int[]) c10111l.f20589l;
                    iArr39[0] = 1;
                    int i50 = 1;
                    for (int i51 = 16; i50 < i51; i51 = 16) {
                        iArr39[i50] = i47;
                        i50++;
                        i47 = 0;
                    }
                    while (true) {
                        i3 = i46 - 1;
                        if (i3 < 0) {
                            break;
                        }
                        if ((bArr10[i46 + 224] | bArr10[i3] | bArr11[i3] | bArr12[i3]) != 0) {
                            break;
                        }
                        i46 = i3;
                    }
                    while (i3 >= 0) {
                        byte b3 = bArr10[i3];
                        if (b3 != 0) {
                            remoteconfig(b3 < 0, admob[(b3 >> 1) ^ (b3 >> 31)], c10111l, c14169l);
                        }
                        byte b4 = bArr10[i3 + 225];
                        if (b4 != 0) {
                            remoteconfig(b4 < 0, subs[(b4 >> 1) ^ (b4 >> 31)], c10111l, c14169l);
                        }
                        byte b5 = bArr11[i3];
                        if (b5 != 0) {
                            smaato(b5 < 0, c10111lArr[(b5 >> 1) ^ (b5 >> 31)], c10111l, c14169l);
                        }
                        byte b6 = bArr12[i3];
                        if (b6 != 0) {
                            smaato(b6 < 0, c10111lArr2[(b6 >> 1) ^ (b6 >> 31)], c10111l, c14169l);
                        }
                        startapp(c10111l, c14169l);
                        i3--;
                    }
                    startapp(c10111l, c14169l);
                    int[] iArr40 = (int[]) c10111l.f20587l;
                    AbstractC6791l.license(iArr40, 1);
                    AbstractC6791l.license(iArr40, -1);
                    int[] iArr41 = (int[]) c10111l.f20586l;
                    AbstractC6791l.license(iArr41, 1);
                    AbstractC6791l.license(iArr41, -1);
                    int[] iArr42 = (int[]) c10111l.f20589l;
                    AbstractC6791l.license(iArr42, 1);
                    AbstractC6791l.license(iArr42, -1);
                    if (AbstractC6791l.ads((int[]) c10111l.f20587l) != 0) {
                        if (!(AbstractC6791l.ads(iArr41) != 0)) {
                            int i52 = 0;
                            for (int i53 = 0; i53 < 16; i53++) {
                                i52 |= iArr41[i53] ^ iArr42[i53];
                            }
                            if ((((i52 - 1) & (~i52)) >> 31) != 0) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public static void ads() {
        synchronized (mopub) {
            try {
                if (isPro != null) {
                    return;
                }
                C10111l[] c10111lArr = new C10111l[144];
                C14169l c14169l = new C14169l(1);
                C12507l c12507l = new C12507l(1);
                AbstractC6791l.billing(0, 0, crashlytics, c12507l.f24647l);
                AbstractC6791l.billing(0, 0, amazon, c12507l.f24646l);
                adcel(c12507l, c10111lArr, 0, 32, c14169l);
                C12507l c12507l2 = new C12507l(1);
                AbstractC6791l.billing(0, 0, purchase, c12507l2.f24647l);
                AbstractC6791l.billing(0, 0, billing, c12507l2.f24646l);
                adcel(c12507l2, c10111lArr, 32, 32, c14169l);
                int i = 16;
                C10111l c10111l = new C10111l(16);
                metrica(c12507l, c10111l);
                int i2 = 5;
                C10111l[] c10111lArr2 = new C10111l[5];
                for (int i3 = 0; i3 < 5; i3++) {
                    c10111lArr2[i3] = new C10111l(16);
                }
                int i4 = 0;
                int i5 = 64;
                while (i4 < i2) {
                    C10111l c10111l2 = new C10111l(i);
                    int i6 = 0;
                    while (i6 < i2) {
                        if (i6 == 0) {
                            vip(c10111l, c10111l2);
                        } else {
                            firebase(c10111l, c10111l2, c14169l);
                        }
                        startapp(c10111l, c14169l);
                        vip(c10111l, c10111lArr2[i6]);
                        if (i4 + i6 != 8) {
                            for (int i7 = 1; i7 < 18; i7++) {
                                startapp(c10111l, c14169l);
                            }
                        }
                        i6++;
                        i2 = 5;
                    }
                    int[] iArr = (int[]) c10111l2.f20587l;
                    AbstractC6791l.advert(new int[i], iArr, iArr);
                    c10111lArr[i5] = c10111l2;
                    i5++;
                    int i8 = 0;
                    while (i8 < 4) {
                        int i9 = 1 << i8;
                        int i10 = 0;
                        while (i10 < i9) {
                            C10111l c10111l3 = new C10111l(i);
                            c10111lArr[i5] = c10111l3;
                            vip(c10111lArr[i5 - i9], c10111l3);
                            firebase(c10111lArr2[i8], c10111lArr[i5], c14169l);
                            i10++;
                            i5++;
                            i = 16;
                        }
                        i8++;
                        i = 16;
                    }
                    i4++;
                    i2 = 5;
                    i = 16;
                }
                subs(c10111lArr);
                admob = new C12507l[32];
                for (int i11 = 0; i11 < 32; i11++) {
                    C10111l c10111l4 = c10111lArr[i11];
                    C12507l c12507l3 = new C12507l(1);
                    AbstractC6791l.tapsense((int[]) c10111l4.f20587l, (int[]) c10111l4.f20589l, c12507l3.f24647l);
                    int[] iArr2 = c12507l3.f24647l;
                    AbstractC6791l.license(iArr2, 1);
                    AbstractC6791l.license(iArr2, -1);
                    AbstractC6791l.tapsense((int[]) c10111l4.f20586l, (int[]) c10111l4.f20589l, c12507l3.f24646l);
                    int[] iArr3 = c12507l3.f24646l;
                    AbstractC6791l.license(iArr3, 1);
                    AbstractC6791l.license(iArr3, -1);
                    admob[i11] = c12507l3;
                }
                subs = new C12507l[32];
                for (int i12 = 0; i12 < 32; i12++) {
                    C10111l c10111l5 = c10111lArr[32 + i12];
                    C12507l c12507l4 = new C12507l(1);
                    AbstractC6791l.tapsense((int[]) c10111l5.f20587l, (int[]) c10111l5.f20589l, c12507l4.f24647l);
                    int[] iArr4 = c12507l4.f24647l;
                    AbstractC6791l.license(iArr4, 1);
                    AbstractC6791l.license(iArr4, -1);
                    AbstractC6791l.tapsense((int[]) c10111l5.f20586l, (int[]) c10111l5.f20589l, c12507l4.f24646l);
                    int[] iArr5 = c12507l4.f24646l;
                    AbstractC6791l.license(iArr5, 1);
                    AbstractC6791l.license(iArr5, -1);
                    subs[i12] = c12507l4;
                }
                isPro = new int[2560];
                int i13 = 0;
                for (int i14 = 64; i14 < 144; i14++) {
                    C10111l c10111l6 = c10111lArr[i14];
                    int[] iArr6 = (int[]) c10111l6.f20587l;
                    AbstractC6791l.tapsense(iArr6, (int[]) c10111l6.f20589l, iArr6);
                    int[] iArr7 = (int[]) c10111l6.f20587l;
                    AbstractC6791l.license(iArr7, 1);
                    AbstractC6791l.license(iArr7, -1);
                    int[] iArr8 = (int[]) c10111l6.f20586l;
                    AbstractC6791l.tapsense(iArr8, (int[]) c10111l6.f20589l, iArr8);
                    int[] iArr9 = (int[]) c10111l6.f20586l;
                    AbstractC6791l.license(iArr9, 1);
                    AbstractC6791l.license(iArr9, -1);
                    AbstractC6791l.billing(0, i13, (int[]) c10111l6.f20587l, isPro);
                    AbstractC6791l.billing(0, i13 + 16, (int[]) c10111l6.f20586l, isPro);
                    i13 += 32;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean amazon(byte[] bArr, boolean z, C12507l c12507l) {
        int i = (bArr[56] & 128) >>> 7;
        int[] iArr = c12507l.f24646l;
        AbstractC6791l.smaato(bArr, iArr);
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        AbstractC6791l.ad(iArr, iArr2);
        AbstractC6791l.subscription(39081, iArr2, iArr3);
        AbstractC6791l.advert(new int[16], iArr2, iArr2);
        iArr2[0] = iArr2[0] + 1;
        iArr3[0] = iArr3[0] + 1;
        int[] iArr4 = c12507l.f24647l;
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        AbstractC6791l.ad(iArr2, iArr5);
        AbstractC6791l.tapsense(iArr5, iArr3, iArr5);
        AbstractC6791l.ad(iArr5, iArr6);
        AbstractC6791l.tapsense(iArr5, iArr2, iArr5);
        AbstractC6791l.tapsense(iArr6, iArr2, iArr6);
        AbstractC6791l.tapsense(iArr6, iArr3, iArr6);
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        AbstractC6791l.ad(iArr6, iArr8);
        AbstractC6791l.tapsense(iArr6, iArr8, iArr8);
        int[] iArr9 = new int[16];
        AbstractC6791l.ad(iArr8, iArr9);
        AbstractC6791l.tapsense(iArr6, iArr9, iArr9);
        int[] iArr10 = new int[16];
        AbstractC6791l.pro(3, iArr9, iArr10);
        AbstractC6791l.tapsense(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[16];
        AbstractC6791l.pro(3, iArr10, iArr11);
        AbstractC6791l.tapsense(iArr9, iArr11, iArr11);
        int[] iArr12 = new int[16];
        AbstractC6791l.pro(9, iArr11, iArr12);
        AbstractC6791l.tapsense(iArr11, iArr12, iArr12);
        int[] iArr13 = new int[16];
        AbstractC6791l.ad(iArr12, iArr13);
        AbstractC6791l.tapsense(iArr6, iArr13, iArr13);
        int[] iArr14 = new int[16];
        AbstractC6791l.pro(18, iArr13, iArr14);
        AbstractC6791l.tapsense(iArr12, iArr14, iArr14);
        int[] iArr15 = new int[16];
        AbstractC6791l.pro(37, iArr14, iArr15);
        AbstractC6791l.tapsense(iArr14, iArr15, iArr15);
        int[] iArr16 = new int[16];
        AbstractC6791l.pro(37, iArr15, iArr16);
        AbstractC6791l.tapsense(iArr14, iArr16, iArr16);
        int[] iArr17 = new int[16];
        AbstractC6791l.pro(111, iArr16, iArr17);
        AbstractC6791l.tapsense(iArr16, iArr17, iArr17);
        int[] iArr18 = new int[16];
        AbstractC6791l.ad(iArr17, iArr18);
        AbstractC6791l.tapsense(iArr6, iArr18, iArr18);
        int[] iArr19 = new int[16];
        AbstractC6791l.pro(223, iArr18, iArr19);
        AbstractC6791l.tapsense(iArr19, iArr17, iArr7);
        AbstractC6791l.tapsense(iArr7, iArr5, iArr7);
        int[] iArr20 = new int[16];
        AbstractC6791l.ad(iArr7, iArr20);
        AbstractC6791l.tapsense(iArr20, iArr3, iArr20);
        AbstractC6791l.advert(iArr2, iArr20, iArr20);
        AbstractC6791l.license(iArr20, 1);
        AbstractC6791l.license(iArr20, -1);
        if (AbstractC6791l.ads(iArr20) == 0) {
            return false;
        }
        AbstractC6791l.billing(0, 0, iArr7, iArr4);
        AbstractC6791l.license(iArr4, 1);
        AbstractC6791l.license(iArr4, -1);
        if (i == 1 && AbstractC6791l.ads(iArr4) != 0) {
            return false;
        }
        if (z ^ (i != (iArr4[0] & 1))) {
            AbstractC6791l.advert(new int[16], iArr4, iArr4);
            AbstractC6791l.license(iArr4, 1);
            AbstractC6791l.license(iArr4, -1);
        }
        return true;
    }

    public static void billing(C7972l c7972l, byte[] bArr, int i) {
        int[] iArr = (int[]) c7972l.f16631l;
        AbstractC6791l.startapp(16, i, bArr, iArr);
        AbstractC6791l.startapp(18, i + 7, bArr, iArr);
        AbstractC6791l.startapp(20, i + 14, bArr, iArr);
        AbstractC6791l.startapp(22, i + 21, bArr, iArr);
        AbstractC6791l.startapp(24, i + 28, bArr, iArr);
        AbstractC6791l.startapp(26, i + 35, bArr, iArr);
        AbstractC6791l.startapp(28, i + 42, bArr, iArr);
        AbstractC6791l.startapp(30, i + 49, bArr, iArr);
        bArr[i + 56] = (byte) ((((int[]) c7972l.f16631l)[0] & 1) << 7);
    }

    public static final InterfaceC14681l crashlytics(InterfaceC2329l interfaceC2329l) {
        if (interfaceC2329l instanceof InterfaceC2851l) {
            C1332l f36787l = ((InterfaceC2851l) ((InterfaceC9671l) interfaceC2329l)).getF36799l();
            if (f36787l != null) {
                return f36787l;
            }
            C8339l.metrica("Cannot delete unmanaged objects.");
            return null;
        }
        if (interfaceC2329l instanceof InterfaceC14681l) {
            return (InterfaceC14681l) interfaceC2329l;
        }
        C8339l.metrica(AbstractC14814l.startapp("Cannot delete custom Deleteable objects: ", AbstractC18202l.yandex.loadAd(interfaceC2329l.getClass()).license()));
        return null;
    }

    public static void firebase(C10111l c10111l, C10111l c10111l2, C14169l c14169l) {
        int[] iArr = (int[]) c14169l.yandex;
        int[] iArr2 = (int[]) c14169l.loadAd;
        int[] iArr3 = (int[]) c14169l.crashlytics;
        int[] iArr4 = (int[]) c14169l.amazon;
        int[] iArr5 = (int[]) c14169l.purchase;
        int[] iArr6 = (int[]) c14169l.billing;
        int[] iArr7 = (int[]) c14169l.mopub;
        int[] iArr8 = (int[]) c14169l.admob;
        AbstractC6791l.tapsense((int[]) c10111l.f20589l, (int[]) c10111l2.f20589l, iArr);
        AbstractC6791l.ad(iArr, iArr2);
        int[] iArr9 = (int[]) c10111l.f20587l;
        int[] iArr10 = (int[]) c10111l2.f20587l;
        AbstractC6791l.tapsense(iArr9, iArr10, iArr3);
        int[] iArr11 = (int[]) c10111l.f20586l;
        int[] iArr12 = (int[]) c10111l2.f20586l;
        AbstractC6791l.tapsense(iArr11, iArr12, iArr4);
        AbstractC6791l.tapsense(iArr3, iArr4, iArr5);
        AbstractC6791l.subscription(39081, iArr5, iArr5);
        AbstractC6791l.crashlytics(iArr2, iArr5, iArr6);
        AbstractC6791l.advert(iArr2, iArr5, iArr7);
        AbstractC6791l.crashlytics(iArr11, iArr9, iArr8);
        AbstractC6791l.crashlytics(iArr12, iArr10, iArr5);
        AbstractC6791l.tapsense(iArr8, iArr5, iArr8);
        AbstractC6791l.crashlytics(iArr4, iArr3, iArr2);
        AbstractC6791l.advert(iArr4, iArr3, iArr5);
        AbstractC6791l.amazon(iArr2);
        AbstractC6791l.advert(iArr8, iArr2, iArr8);
        AbstractC6791l.tapsense(iArr8, iArr, iArr8);
        AbstractC6791l.tapsense(iArr5, iArr, iArr5);
        AbstractC6791l.tapsense(iArr6, iArr8, iArr10);
        AbstractC6791l.tapsense(iArr5, iArr7, iArr12);
        AbstractC6791l.tapsense(iArr6, iArr7, (int[]) c10111l2.f20589l);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:121:0x033b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0340  */
    /* JADX WARN: Code duplicated, block: B:128:0x035c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x035e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0366  */
    /* JADX WARN: Code duplicated, block: B:137:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0383  */
    /* JADX WARN: Code duplicated, block: B:139:0x038b  */
    /* JADX WARN: Code duplicated, block: B:142:0x039d  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a9  */
    public static final C0269l isPro(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        long jLoadAd;
        int i2;
        int i3;
        int i4;
        int i5;
        AbstractC9544l abstractC9544l;
        int i6;
        int i7;
        int i8;
        C13698l c13698lVip;
        int i9;
        Shader shader;
        AbstractC9544l c8990l;
        Shader shader2;
        AbstractC9544l c8990l2;
        int i10;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        C0726l c0726l = new C0726l(xmlResourceParser2);
        TypedArray typedArraySignature = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC17549l.yandex);
        c0726l.loadAd(typedArraySignature.getChangingConfigurations());
        boolean z = !AbstractC10310l.startapp(xmlResourceParser2, "autoMirrored") ? false : typedArraySignature.getBoolean(5, false);
        c0726l.loadAd(typedArraySignature.getChangingConfigurations());
        float fYandex = c0726l.yandex(typedArraySignature, "viewportWidth", 7, 0.0f);
        float fYandex2 = c0726l.yandex(typedArraySignature, "viewportHeight", 8, 0.0f);
        if (fYandex <= 0.0f) {
            throw new XmlPullParserException(AbstractC12900l.firebase(typedArraySignature.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (fYandex2 <= 0.0f) {
            throw new XmlPullParserException(AbstractC12900l.firebase(typedArraySignature.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        int i11 = 3;
        float dimension = typedArraySignature.getDimension(3, 0.0f);
        c0726l.loadAd(typedArraySignature.getChangingConfigurations());
        float dimension2 = typedArraySignature.getDimension(2, 0.0f);
        c0726l.loadAd(typedArraySignature.getChangingConfigurations());
        if (typedArraySignature.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            typedArraySignature.getValue(1, typedValue);
            if (typedValue.type == 2) {
                jLoadAd = C9735l.firebase;
            } else {
                ColorStateList colorStateListRemoteconfig = AbstractC10310l.remoteconfig(typedArraySignature, xmlResourceParser2, theme);
                c0726l.loadAd(typedArraySignature.getChangingConfigurations());
                jLoadAd = colorStateListRemoteconfig != null ? AbstractC12953l.loadAd(colorStateListRemoteconfig.getDefaultColor()) : C9735l.firebase;
            }
        } else {
            jLoadAd = C9735l.firebase;
        }
        long j = jLoadAd;
        int i12 = typedArraySignature.getInt(6, -1);
        c0726l.loadAd(typedArraySignature.getChangingConfigurations());
        if (i12 == -1) {
            i2 = 5;
        } else if (i12 == 3) {
            i2 = 3;
        } else if (i12 == 5) {
            i2 = 5;
        } else if (i12 != 9) {
            switch (i12) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case 16:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f = dimension / resources.getDisplayMetrics().density;
        float f2 = dimension2 / resources.getDisplayMetrics().density;
        typedArraySignature.recycle();
        int i13 = 2;
        int i14 = 1;
        C10943l c10943l = new C10943l(null, f, f2, fYandex, fYandex2, j, i2, z, 1);
        int i15 = 0;
        while (xmlResourceParser2.getEventType() != i14 && (xmlResourceParser2.getDepth() >= i14 || xmlResourceParser2.getEventType() != i11)) {
            XmlPullParser xmlPullParser = c0726l.yandex;
            int eventType = xmlPullParser.getEventType();
            ArrayList arrayList = c10943l.subs;
            if (eventType != i13) {
                if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                    int i16 = i15 + 1;
                    int i17 = 0;
                    while (i17 < i16) {
                        if (c10943l.firebase) {
                            AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        C17697l c17697l = (C17697l) arrayList.remove(arrayList.size() - i14);
                        ((C17697l) AbstractC14814l.firebase(i14, arrayList)).isPro.add(new C4623l(c17697l.yandex, c17697l.loadAd, c17697l.crashlytics, c17697l.amazon, c17697l.purchase, c17697l.billing, c17697l.mopub, c17697l.admob, c17697l.subs, c17697l.isPro));
                        i17++;
                        i14 = 1;
                        i11 = 3;
                        i13 = 2;
                    }
                    i5 = i11;
                    i4 = i13;
                    i15 = 0;
                } else {
                    i5 = i11;
                    i4 = i13;
                }
                i3 = i14;
            } else {
                String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    List listM3011strictfp = C2580l.f5619l;
                    C10975l c10975l = c0726l.crashlytics;
                    if (iHashCode != -1649314686) {
                        if (iHashCode != 3433509) {
                            if (iHashCode == 98629247 && name.equals("group")) {
                                TypedArray typedArraySignature2 = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC17549l.loadAd);
                                c0726l.loadAd(typedArraySignature2.getChangingConfigurations());
                                float fYandex3 = c0726l.yandex(typedArraySignature2, "rotation", 5, 0.0f);
                                float f3 = typedArraySignature2.getFloat(1, 0.0f);
                                c0726l.loadAd(typedArraySignature2.getChangingConfigurations());
                                float f4 = typedArraySignature2.getFloat(2, 0.0f);
                                c0726l.loadAd(typedArraySignature2.getChangingConfigurations());
                                float fYandex4 = c0726l.yandex(typedArraySignature2, "scaleX", 3, 1.0f);
                                float fYandex5 = c0726l.yandex(typedArraySignature2, "scaleY", 4, 1.0f);
                                float fYandex6 = c0726l.yandex(typedArraySignature2, "translateX", 6, 0.0f);
                                float fYandex7 = c0726l.yandex(typedArraySignature2, "translateY", 7, 0.0f);
                                String string = typedArraySignature2.getString(0);
                                c0726l.loadAd(typedArraySignature2.getChangingConfigurations());
                                String str = string == null ? "" : string;
                                typedArraySignature2.recycle();
                                int i18 = AbstractC8192l.yandex;
                                if (c10943l.firebase) {
                                    AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                arrayList.add(new C17697l(str, fYandex3, f3, f4, fYandex4, fYandex5, fYandex6, fYandex7, listM3011strictfp, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
                            } else {
                                i3 = 1;
                            }
                            i5 = 3;
                            i4 = 2;
                        } else if (name.equals("path")) {
                            TypedArray typedArraySignature3 = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC17549l.crashlytics);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                C8339l.metrica("No path data available");
                                return null;
                            }
                            String string2 = typedArraySignature3.getString(0);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            String str2 = string2 == null ? "" : string2;
                            String string3 = typedArraySignature3.getString(2);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            if (string3 == null) {
                                int i19 = AbstractC8192l.yandex;
                            } else {
                                listM3011strictfp = C10975l.m3011strictfp(c10975l, string3);
                            }
                            List list = listM3011strictfp;
                            C13698l c13698lVip2 = AbstractC10310l.vip(typedArraySignature3, xmlPullParser, theme, "fillColor", 1);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            float fYandex8 = c0726l.yandex(typedArraySignature3, "fillAlpha", 12, 1.0f);
                            if (AbstractC10310l.startapp(xmlPullParser, "strokeLineCap")) {
                                abstractC9544l = null;
                                i6 = typedArraySignature3.getInt(8, -1);
                            } else {
                                i6 = -1;
                                abstractC9544l = null;
                            }
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            if (i6 == 0) {
                                i7 = 0;
                            } else if (i6 == 1) {
                                i7 = 1;
                            } else if (i6 != 2) {
                                i7 = 0;
                            } else {
                                i7 = 2;
                            }
                            int i20 = !AbstractC10310l.startapp(xmlPullParser, "strokeLineJoin") ? -1 : typedArraySignature3.getInt(9, -1);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            if (i20 != 0) {
                                if (i20 == 1) {
                                    i8 = 1;
                                } else if (i20 == 2) {
                                    i8 = 2;
                                }
                                float fYandex9 = c0726l.yandex(typedArraySignature3, "strokeMiterLimit", 10, 4.0f);
                                c13698lVip = AbstractC10310l.vip(typedArraySignature3, xmlPullParser, theme, "strokeColor", 3);
                                c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                                float fYandex10 = c0726l.yandex(typedArraySignature3, "strokeAlpha", 11, 1.0f);
                                float fYandex11 = c0726l.yandex(typedArraySignature3, "strokeWidth", 4, 1.0f);
                                float fYandex12 = c0726l.yandex(typedArraySignature3, "trimPathEnd", 6, 1.0f);
                                float fYandex13 = c0726l.yandex(typedArraySignature3, "trimPathOffset", 7, 0.0f);
                                float fYandex14 = c0726l.yandex(typedArraySignature3, "trimPathStart", 5, 0.0f);
                                if (AbstractC10310l.startapp(xmlPullParser, "fillType")) {
                                    i9 = typedArraySignature3.getInt(13, 0);
                                } else {
                                    i9 = 0;
                                }
                                c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                                typedArraySignature3.recycle();
                                shader = (Shader) c13698lVip2.f26743l;
                                if (shader == null && c13698lVip2.f26744l == 0) {
                                    c8990l = abstractC9544l;
                                } else if (shader != null) {
                                    c8990l = new C7918l(shader);
                                } else {
                                    c8990l = new C8990l(AbstractC12953l.loadAd(c13698lVip2.f26744l));
                                }
                                shader2 = (Shader) c13698lVip.f26743l;
                                if (shader2 == null && c13698lVip.f26744l == 0) {
                                    c8990l2 = abstractC9544l;
                                } else if (shader2 != null) {
                                    c8990l2 = new C7918l(shader2);
                                } else {
                                    c8990l2 = new C8990l(AbstractC12953l.loadAd(c13698lVip.f26744l));
                                }
                                if (i9 == 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                if (c10943l.firebase) {
                                    AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((C17697l) AbstractC14814l.firebase(1, arrayList)).isPro.add(new C3205l(str2, list, i10, c8990l, fYandex8, c8990l2, fYandex10, fYandex11, i7, i8, fYandex9, fYandex14, fYandex12, fYandex13));
                                i3 = 1;
                                i5 = 3;
                                i4 = 2;
                            }
                            i8 = 0;
                            float fYandex15 = c0726l.yandex(typedArraySignature3, "strokeMiterLimit", 10, 4.0f);
                            c13698lVip = AbstractC10310l.vip(typedArraySignature3, xmlPullParser, theme, "strokeColor", 3);
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            float fYandex16 = c0726l.yandex(typedArraySignature3, "strokeAlpha", 11, 1.0f);
                            float fYandex17 = c0726l.yandex(typedArraySignature3, "strokeWidth", 4, 1.0f);
                            float fYandex18 = c0726l.yandex(typedArraySignature3, "trimPathEnd", 6, 1.0f);
                            float fYandex19 = c0726l.yandex(typedArraySignature3, "trimPathOffset", 7, 0.0f);
                            float fYandex110 = c0726l.yandex(typedArraySignature3, "trimPathStart", 5, 0.0f);
                            if (AbstractC10310l.startapp(xmlPullParser, "fillType")) {
                                i9 = 0;
                            } else {
                                i9 = typedArraySignature3.getInt(13, 0);
                            }
                            c0726l.loadAd(typedArraySignature3.getChangingConfigurations());
                            typedArraySignature3.recycle();
                            shader = (Shader) c13698lVip2.f26743l;
                            if (shader == null) {
                                c8990l = abstractC9544l;
                            } else if (shader != null) {
                                c8990l = new C7918l(shader);
                            } else {
                                c8990l = new C8990l(AbstractC12953l.loadAd(c13698lVip2.f26744l));
                            }
                            shader2 = (Shader) c13698lVip.f26743l;
                            if (shader2 == null) {
                                c8990l2 = abstractC9544l;
                            } else if (shader2 != null) {
                                c8990l2 = new C7918l(shader2);
                            } else {
                                c8990l2 = new C8990l(AbstractC12953l.loadAd(c13698lVip.f26744l));
                            }
                            if (i9 == 0) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            if (c10943l.firebase) {
                                AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            ((C17697l) AbstractC14814l.firebase(1, arrayList)).isPro.add(new C3205l(str2, list, i10, c8990l, fYandex8, c8990l2, fYandex16, fYandex17, i7, i8, fYandex15, fYandex110, fYandex18, fYandex19));
                            i3 = 1;
                            i5 = 3;
                            i4 = 2;
                        }
                        i3 = 1;
                        i5 = 3;
                        i4 = 2;
                    } else {
                        i5 = 3;
                        i4 = 2;
                        if (name.equals("clip-path")) {
                            TypedArray typedArraySignature4 = AbstractC10310l.Signature(resources, theme, attributeSetAsAttributeSet, AbstractC17549l.amazon);
                            c0726l.loadAd(typedArraySignature4.getChangingConfigurations());
                            String string4 = typedArraySignature4.getString(0);
                            c0726l.loadAd(typedArraySignature4.getChangingConfigurations());
                            String str3 = string4 == null ? "" : string4;
                            i3 = 1;
                            String string5 = typedArraySignature4.getString(1);
                            c0726l.loadAd(typedArraySignature4.getChangingConfigurations());
                            if (string5 == null) {
                                int i21 = AbstractC8192l.yandex;
                            } else {
                                listM3011strictfp = C10975l.m3011strictfp(c10975l, string5);
                            }
                            List list2 = listM3011strictfp;
                            typedArraySignature4.recycle();
                            if (c10943l.firebase) {
                                AbstractC0081l.crashlytics("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            arrayList.add(new C17697l(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE));
                            i15++;
                        } else {
                            i3 = 1;
                        }
                    }
                } else {
                    i3 = 1;
                    i5 = 3;
                    i4 = 2;
                }
            }
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i14 = i3;
            i11 = i5;
            i13 = i4;
        }
        return new C0269l(c10943l.loadAd(), i | c0726l.loadAd);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void loadAd(C10664l c10664l, C4847l c4847l, ArrayList arrayList, int i) {
        int i2;
        C17375l[] c17375lArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        C11338l c11338l;
        C4847l c4847l2;
        C11338l c11338l2;
        C4657l c4657l;
        C14946l c14946l;
        C4657l c4657l2;
        C11338l c11338l3;
        int i6;
        C14946l[] c14946lArr;
        C14946l c14946l2;
        C4657l c4657l3;
        int i7;
        C14946l[] c14946lArr2;
        int i8;
        C14946l c14946l3;
        C14946l c14946l4;
        C4657l c4657l4;
        C14946l c14946l5;
        C4657l c4657l5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        C4657l c4657l6;
        C4657l c4657l7;
        C4657l c4657l8;
        C4657l c4657l9;
        C1846l c1846lSmaato;
        float f2;
        C14946l c14946l6;
        C11338l c11338l4;
        int i12;
        int i13;
        C11338l c11338l5;
        C10664l c10664l2 = c10664l;
        if (i == 0) {
            i2 = c10664l2.f21645l;
            c17375lArr = c10664l2.f21648l;
            i3 = 0;
        } else {
            i2 = c10664l2.f21633l;
            c17375lArr = c10664l2.f21635l;
            i3 = 2;
        }
        int i14 = i2;
        C17375l[] c17375lArr2 = c17375lArr;
        int i15 = 0;
        while (i15 < i14) {
            C17375l c17375l = c17375lArr2[i15];
            boolean z4 = c17375l.adcel;
            C11338l c11338l6 = c17375l.yandex;
            C14946l[] c14946lArr3 = c11338l6.f22842catch;
            int i16 = 3;
            int i17 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = c17375l.smaato;
                int i19 = i18 * 2;
                C11338l c11338l7 = c11338l6;
                C11338l c11338l8 = c11338l7;
                boolean z5 = false;
                while (!z5) {
                    c17375l.subs++;
                    C11338l[] c11338lArr = c11338l7.f22861protected;
                    C14946l[] c14946lArr4 = c11338l7.f22842catch;
                    c11338lArr[i18] = null;
                    c11338l7.f22871transient[i18] = null;
                    if (c11338l7.f22862public != i17) {
                        c11338l7.admob(i18);
                        c14946lArr4[i19].amazon();
                        int i20 = i19 + 1;
                        c14946lArr4[i20].amazon();
                        c14946lArr4[i19].amazon();
                        c14946lArr4[i20].amazon();
                        if (c17375l.loadAd == null) {
                            c17375l.loadAd = c11338l7;
                        }
                        c17375l.amazon = c11338l7;
                        int i21 = c11338l7.f22844const[i18];
                        if (i21 == i16) {
                            int i22 = c11338l7.tapsense[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                c17375l.isPro++;
                                float f4 = c11338l7.f22840break[i18];
                                if (f4 > 0.0f) {
                                    c17375l.firebase += f4;
                                }
                                i13 = i18;
                                if (c11338l7.f22862public != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < 0.0f) {
                                        c17375l.vip = true;
                                    } else {
                                        c17375l.metrica = true;
                                    }
                                    if (c17375l.admob == null) {
                                        c17375l.admob = new ArrayList();
                                    }
                                    c17375l.admob.add(c11338l7);
                                }
                                if (c17375l.billing == null) {
                                    c17375l.billing = c11338l7;
                                }
                                C11338l c11338l9 = c17375l.mopub;
                                if (c11338l9 != null) {
                                    c11338l9.f22871transient[i13] = c11338l7;
                                }
                                c17375l.mopub = c11338l7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (c11338l7.ads == 0 && c11338l7.Signature == 0) {
                                    int i23 = c11338l7.license;
                                }
                            } else if (c11338l7.subscription == 0 && c11338l7.ad == 0) {
                                int i24 = c11338l7.advert;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    C11338l c11338l10 = c11338l8;
                    if (c11338l10 != c11338l7) {
                        c11338l10.f22861protected[i13] = c11338l7;
                    }
                    C14946l c14946l7 = c14946lArr4[i19 + 1].billing;
                    if (c14946l7 != null) {
                        c11338l5 = c14946l7.amazon;
                        C14946l c14946l8 = c11338l5.f22842catch[i19].billing;
                        if (c14946l8 == null || c14946l8.amazon != c11338l7) {
                            c11338l5 = null;
                        }
                    } else {
                        c11338l5 = null;
                    }
                    if (c11338l5 == null) {
                        c11338l5 = c11338l7;
                        z5 = true;
                    }
                    c11338l8 = c11338l7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    c11338l7 = c11338l5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                C11338l c11338l11 = c17375l.loadAd;
                if (c11338l11 != null) {
                    c11338l11.f22842catch[i19].amazon();
                }
                C11338l c11338l12 = c17375l.amazon;
                if (c11338l12 != null) {
                    c11338l12.f22842catch[i19 + 1].amazon();
                }
                c17375l.crashlytics = c11338l7;
                if (i25 == 0 && c17375l.remoteconfig) {
                    c17375l.purchase = c11338l7;
                } else {
                    c17375l.purchase = c11338l6;
                }
                c17375l.startapp = c17375l.metrica && c17375l.vip;
            }
            c17375l.adcel = true;
            if (arrayList == 0 || arrayList.contains(c11338l6)) {
                C11338l c11338l13 = c17375l.crashlytics;
                C11338l c11338l14 = c17375l.loadAd;
                C11338l c11338l15 = c17375l.amazon;
                C11338l c11338l16 = c17375l.purchase;
                float f5 = c17375l.firebase;
                int[] iArr = c10664l2.f22844const;
                C14946l[] c14946lArr5 = c10664l2.f22842catch;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = c11338l16.f22868this;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = c11338l16.f22872try;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    C14946l[] c14946lArr6 = c11338l6.f22842catch;
                    int[] iArr2 = c11338l6.f22844const;
                    C14946l c14946l9 = c14946lArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iAmazon = c14946l9.amazon();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && c11338l6.tapsense[i] == 0;
                    C14946l c14946l10 = c14946l9.billing;
                    if (c14946l10 != null && c11338l6 != c11338l6) {
                        iAmazon = c14946l10.amazon() + iAmazon;
                    }
                    int i29 = iAmazon;
                    if (z13 && c11338l6 != c11338l6 && c11338l6 != c11338l14) {
                        i28 = 8;
                    }
                    C11338l c11338l17 = c11338l6;
                    C14946l c14946l11 = c14946l9.billing;
                    if (c14946l11 != null) {
                        boolean z15 = z14;
                        C4657l c4657l10 = c14946l9.subs;
                        C4657l c4657l11 = c14946l11.subs;
                        if (c11338l6 == c11338l14) {
                            c4847l.billing(c4657l10, c4657l11, i29, 6);
                        } else {
                            c4847l.billing(c4657l10, c4657l11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        c4847l.purchase(c14946l9.subs, c14946l9.billing.subs, i29, (c11338l6 == c11338l14 && z13 && c11338l6.f22841case[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (c11338l6.f22862public == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            c4847l.billing(c14946lArr6[i3 + 1].subs, c14946lArr6[i3].subs, 0, 5);
                        }
                        c4847l.billing(c14946lArr6[i3].subs, c14946lArr5[i3].subs, i12, 8);
                    }
                    C14946l c14946l12 = c14946lArr6[i3 + 1].billing;
                    if (c14946l12 != null) {
                        c11338l4 = c14946l12.amazon;
                        C14946l c14946l13 = c11338l4.f22842catch[i3].billing;
                        if (c14946l13 == null || c14946l13.amazon != c11338l6) {
                            c11338l4 = null;
                        }
                    } else {
                        c11338l4 = null;
                    }
                    if (c11338l4 != null) {
                        c11338l6 = c11338l4;
                    } else {
                        z11 = true;
                    }
                    c11338l6 = c11338l17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (c11338l15 != null) {
                    int i30 = i3 + 1;
                    if (c11338l13.f22842catch[i30].billing != null) {
                        C14946l c14946l14 = c11338l15.f22842catch[i30];
                        if (c11338l15.f22844const[i] == 3 && c11338l15.tapsense[i] == 0 && !z17) {
                            C14946l c14946l15 = c14946l14.billing;
                            if (c14946l15.amazon == c10664l2) {
                                c4847l.purchase(c14946l14.subs, c14946l15.subs, -c14946l14.amazon(), 5);
                            } else if (z17) {
                                c14946l6 = c14946l14.billing;
                                if (c14946l6.amazon == c10664l2) {
                                    c4847l.purchase(c14946l14.subs, c14946l6.subs, -c14946l14.amazon(), 4);
                                }
                            }
                        } else if (z17) {
                            c14946l6 = c14946l14.billing;
                            if (c14946l6.amazon == c10664l2) {
                                c4847l.purchase(c14946l14.subs, c14946l6.subs, -c14946l14.amazon(), 4);
                            }
                        }
                        c4847l.mopub(c14946l14.subs, c11338l13.f22842catch[i30].billing.subs, -c14946l14.amazon(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    C4657l c4657l12 = c14946lArr5[i31].subs;
                    C14946l c14946l16 = c11338l13.f22842catch[i31];
                    c4847l.billing(c4657l12, c14946l16.subs, c14946l16.amazon(), 8);
                }
                ArrayList arrayList3 = c17375l.admob;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (c17375l.vip && !c17375l.startapp) {
                        f5 = c17375l.isPro;
                    }
                    C11338l c11338l18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C11338l c11338l19 = (C11338l) arrayList3.get(i32);
                        float[] fArr = c11338l19.f22840break;
                        C14946l[] c14946lArr7 = c11338l19.f22842catch;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                c4847l.purchase(c14946lArr7[i3 + 1].subs, c14946lArr7[i3].subs, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (c11338l18 != null) {
                                    C14946l[] c14946lArr8 = c11338l18.f22842catch;
                                    c4657l6 = c14946lArr8[i3].subs;
                                    int i33 = i3 + 1;
                                    c4657l7 = c14946lArr8[i33].subs;
                                    c4657l8 = c14946lArr7[i3].subs;
                                    c4657l9 = c14946lArr7[i33].subs;
                                    c1846lSmaato = c4847l.smaato();
                                    f2 = f3;
                                    c1846lSmaato.loadAd = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        c1846lSmaato.amazon.mopub(c4657l6, 1.0f);
                                        c1846lSmaato.amazon.mopub(c4657l7, -1.0f);
                                        c1846lSmaato.amazon.mopub(c4657l9, 1.0f);
                                        c1846lSmaato.amazon.mopub(c4657l8, -1.0f);
                                    } else {
                                        C2581l c2581l = c1846lSmaato.amazon;
                                        if (f8 == f) {
                                            i11 = i32;
                                            c2581l.mopub(c4657l6, 1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                c2581l.mopub(c4657l8, 1.0f);
                                                c1846lSmaato.amazon.mopub(c4657l9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                c2581l.mopub(c4657l6, 1.0f);
                                                c1846lSmaato.amazon.mopub(c4657l7, -1.0f);
                                                c1846lSmaato.amazon.mopub(c4657l9, f9);
                                                c1846lSmaato.amazon.mopub(c4657l8, -f9);
                                            }
                                        }
                                    }
                                    c4847l.crashlytics(c1846lSmaato);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                c11338l18 = c11338l19;
                            }
                        } else {
                            if (c17375l.startapp) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                c4847l.purchase(c14946lArr7[i3 + 1].subs, c14946lArr7[i3].subs, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    c4847l.purchase(c14946lArr7[i3 + 1].subs, c14946lArr7[i3].subs, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (c11338l18 != null) {
                                        C14946l[] c14946lArr9 = c11338l18.f22842catch;
                                        c4657l6 = c14946lArr9[i3].subs;
                                        int i34 = i3 + 1;
                                        c4657l7 = c14946lArr9[i34].subs;
                                        c4657l8 = c14946lArr7[i3].subs;
                                        c4657l9 = c14946lArr7[i34].subs;
                                        c1846lSmaato = c4847l.smaato();
                                        f2 = f3;
                                        c1846lSmaato.loadAd = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            c1846lSmaato.amazon.mopub(c4657l6, 1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l7, -1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l9, 1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            c1846lSmaato.amazon.mopub(c4657l6, 1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l7, -1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l9, 1.0f);
                                            c1846lSmaato.amazon.mopub(c4657l8, -1.0f);
                                        }
                                        c4847l.crashlytics(c1846lSmaato);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    c11338l18 = c11338l19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (c11338l14 == null || !(c11338l14 == c11338l15 || z17)) {
                    c11338l = c11338l15;
                    if (z2 && c11338l14 != null) {
                        int i35 = c17375l.isPro;
                        boolean z18 = i35 > 0 && c17375l.subs == i35;
                        C11338l c11338l20 = c11338l14;
                        C11338l c11338l21 = c11338l20;
                        while (true) {
                            C14946l[] c14946lArr10 = c11338l21.f22842catch;
                            if (c11338l20 == null) {
                                break;
                            }
                            C14946l[] c14946lArr11 = c11338l20.f22842catch;
                            C11338l c11338l22 = c11338l20.f22861protected[i];
                            while (true) {
                                if (c11338l22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (c11338l22.f22862public != 8) {
                                    break;
                                } else {
                                    c11338l22 = c11338l22.f22861protected[i];
                                }
                            }
                            if (c11338l22 != null || c11338l20 == c11338l) {
                                C14946l c14946l17 = c14946lArr11[i3];
                                C4657l c4657l13 = c14946l17.subs;
                                C14946l c14946l18 = c14946l17.billing;
                                C4657l c4657l14 = c14946l18 != null ? c14946l18.subs : null;
                                if (c11338l21 != c11338l20) {
                                    c4657l14 = c14946lArr10[i3 + 1].subs;
                                } else if (c11338l20 == c11338l14) {
                                    C14946l c14946l19 = c14946lArr3[i3].billing;
                                    c4657l14 = c14946l19 != null ? c14946l19.subs : null;
                                }
                                int iAmazon2 = c14946l17.amazon();
                                int i36 = i3 + 1;
                                int iAmazon3 = c14946lArr11[i36].amazon();
                                if (c11338l22 != null) {
                                    c14946l2 = c11338l22.f22842catch[i3];
                                    c14946lArr = c14946lArr10;
                                    c4657l3 = c14946l2.subs;
                                } else {
                                    c14946lArr = c14946lArr10;
                                    c14946l2 = c11338l13.f22842catch[i36].billing;
                                    c4657l3 = c14946l2 != null ? c14946l2.subs : null;
                                }
                                C4657l c4657l15 = c14946lArr11[i36].subs;
                                if (c14946l2 != null) {
                                    iAmazon3 += c14946l2.amazon();
                                }
                                int iAmazon4 = c14946lArr[i36].amazon() + iAmazon2;
                                if (c4657l13 == null || c4657l14 == null || c4657l3 == null || c4657l15 == null) {
                                    i7 = 8;
                                } else {
                                    if (c11338l20 == c11338l14) {
                                        iAmazon4 = c11338l14.f22842catch[i3].amazon();
                                    }
                                    int i37 = iAmazon4;
                                    if (c11338l20 == c11338l) {
                                        iAmazon3 = c11338l.f22842catch[i36].amazon();
                                    }
                                    i7 = 8;
                                    c4847l.loadAd(c4657l13, c4657l14, i37, 0.5f, c4657l3, c4657l15, iAmazon3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (c11338l20.f22862public != i7) {
                                c11338l21 = c11338l20;
                            }
                            c11338l20 = c11338l22;
                            c11338l21 = c11338l21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && c11338l14 != null) {
                            int i39 = c17375l.isPro;
                            boolean z19 = i39 > 0 && c17375l.subs == i39;
                            C11338l c11338l23 = c11338l14;
                            C11338l c11338l24 = c11338l23;
                            while (true) {
                                C14946l[] c14946lArr12 = c11338l23.f22842catch;
                                if (c11338l24 == null) {
                                    break;
                                }
                                C14946l[] c14946lArr13 = c11338l24.f22842catch;
                                C11338l c11338l25 = c11338l24.f22861protected[i];
                                while (c11338l25 != null && c11338l25.f22862public == i38) {
                                    c11338l25 = c11338l25.f22861protected[i];
                                }
                                if (c11338l24 == c11338l14 || c11338l24 == c11338l || c11338l25 == null) {
                                    c11338l2 = c11338l23;
                                } else {
                                    if (c11338l25 == c11338l) {
                                        c11338l25 = null;
                                    }
                                    C14946l c14946l20 = c14946lArr13[i3];
                                    C4657l c4657l16 = c14946l20.subs;
                                    int i40 = i3 + 1;
                                    C4657l c4657l17 = c14946lArr12[i40].subs;
                                    int iAmazon5 = c14946l20.amazon();
                                    int iAmazon6 = c14946lArr13[i40].amazon();
                                    if (c11338l25 != null) {
                                        c14946l = c11338l25.f22842catch[i3];
                                        c4657l = c14946l.subs;
                                        c11338l2 = c11338l23;
                                        C14946l c14946l21 = c14946l.billing;
                                        c4657l2 = c14946l21 != null ? c14946l21.subs : null;
                                    } else {
                                        c11338l2 = c11338l23;
                                        C14946l c14946l22 = c11338l.f22842catch[i3];
                                        c4657l = c14946l22 != null ? c14946l22.subs : null;
                                        C4657l c4657l18 = c14946lArr13[i40].subs;
                                        c14946l = c14946l22;
                                        c4657l2 = c4657l18;
                                    }
                                    if (c14946l != null) {
                                        iAmazon6 += c14946l.amazon();
                                    }
                                    int iAmazon7 = c14946lArr12[i40].amazon() + iAmazon5;
                                    C11338l c11338l26 = c11338l25;
                                    int i41 = iAmazon6;
                                    int i42 = z19 ? 8 : 4;
                                    if (c4657l16 == null || c4657l17 == null || c4657l == null || c4657l2 == null) {
                                        c11338l3 = c11338l26;
                                    } else {
                                        C4657l c4657l19 = c4657l;
                                        c11338l3 = c11338l26;
                                        c4847l.loadAd(c4657l16, c4657l17, iAmazon7, 0.5f, c4657l19, c4657l2, i41, i42);
                                    }
                                    c11338l25 = c11338l3;
                                }
                                if (c11338l24.f22862public != 8) {
                                    c11338l2 = c11338l24;
                                }
                                c11338l24 = c11338l25;
                                i38 = 8;
                                c11338l23 = c11338l2;
                            }
                            c4847l2 = c4847l;
                            C14946l c14946l23 = c11338l14.f22842catch[i3];
                            C14946l c14946l24 = c14946lArr3[i3].billing;
                            int i43 = i3 + 1;
                            C14946l c14946l25 = c11338l.f22842catch[i43];
                            C14946l c14946l26 = c11338l13.f22842catch[i43].billing;
                            if (c14946l24 != null) {
                                if (c11338l14 != c11338l) {
                                    c4847l2.purchase(c14946l23.subs, c14946l24.subs, c14946l23.amazon(), 5);
                                } else if (c14946l26 != null) {
                                    c4847l2.loadAd(c14946l23.subs, c14946l24.subs, c14946l23.amazon(), 0.5f, c14946l25.subs, c14946l26.subs, c14946l25.amazon(), 5);
                                }
                            }
                            if (c14946l26 != null && c11338l14 != c11338l) {
                                c4847l2.purchase(c14946l25.subs, c14946l26.subs, -c14946l25.amazon(), 5);
                            }
                        }
                        if ((z2 || z3) && c11338l14 != null && c11338l14 != c11338l) {
                            c14946lArr2 = c11338l14.f22842catch;
                            C14946l c14946l27 = c14946lArr2[i3];
                            if (c11338l == null) {
                                c11338l = c11338l14;
                            }
                            C14946l[] c14946lArr14 = c11338l.f22842catch;
                            i8 = i3 + 1;
                            c14946l3 = c14946lArr14[i8];
                            c14946l4 = c14946l27.billing;
                            if (c14946l4 != null) {
                                c4657l4 = c14946l4.subs;
                            } else {
                                c4657l4 = null;
                            }
                            c14946l5 = c14946l3.billing;
                            if (c14946l5 != null) {
                                c4657l5 = c14946l5.subs;
                            } else {
                                c4657l5 = null;
                            }
                            if (c11338l13 != c11338l) {
                                C14946l c14946l28 = c11338l13.f22842catch[i8].billing;
                                c4657l5 = c14946l28 != null ? c14946l28.subs : null;
                            }
                            if (c11338l14 == c11338l) {
                                c14946l3 = c14946lArr2[i8];
                            }
                            if (c4657l4 == null && c4657l5 != null) {
                                c4847l2.loadAd(c14946l27.subs, c4657l4, c14946l27.amazon(), 0.5f, c4657l5, c14946l3.subs, c14946lArr14[i8].amazon(), 5);
                            }
                        }
                    }
                } else {
                    C14946l c14946l29 = c14946lArr3[i3];
                    int i44 = i3 + 1;
                    C14946l c14946l30 = c11338l13.f22842catch[i44];
                    C14946l c14946l31 = c14946l29.billing;
                    C4657l c4657l20 = c14946l31 != null ? c14946l31.subs : null;
                    C14946l c14946l32 = c14946l30.billing;
                    C4657l c4657l21 = c14946l32 != null ? c14946l32.subs : null;
                    C14946l c14946l33 = c11338l14.f22842catch[i3];
                    if (c11338l15 != null) {
                        c14946l30 = c11338l15.f22842catch[i44];
                    }
                    if (c4657l20 == null || c4657l21 == null) {
                        c11338l = c11338l15;
                    } else {
                        float f11 = i == 0 ? c11338l16.f22854import : c11338l16.f22839abstract;
                        int iAmazon8 = c14946l33.amazon();
                        int iAmazon9 = c14946l30.amazon();
                        C4657l c4657l22 = c14946l33.subs;
                        C4657l c4657l23 = c14946l30.subs;
                        C4657l c4657l24 = c4657l20;
                        c11338l = c11338l15;
                        c4847l.loadAd(c4657l22, c4657l24, iAmazon8, f11, c4657l21, c4657l23, iAmazon9, 7);
                    }
                }
                c4847l2 = c4847l;
                if (z2) {
                    c14946lArr2 = c11338l14.f22842catch;
                    C14946l c14946l210 = c14946lArr2[i3];
                    if (c11338l == null) {
                        c11338l = c11338l14;
                    }
                    C14946l[] c14946lArr15 = c11338l.f22842catch;
                    i8 = i3 + 1;
                    c14946l3 = c14946lArr15[i8];
                    c14946l4 = c14946l210.billing;
                    if (c14946l4 != null) {
                        c4657l4 = c14946l4.subs;
                    } else {
                        c4657l4 = null;
                    }
                    c14946l5 = c14946l3.billing;
                    if (c14946l5 != null) {
                        c4657l5 = c14946l5.subs;
                    } else {
                        c4657l5 = null;
                    }
                    if (c11338l13 != c11338l) {
                        C14946l c14946l211 = c11338l13.f22842catch[i8].billing;
                        c4657l5 = c14946l211 != null ? c14946l211.subs : null;
                    }
                    if (c11338l14 == c11338l) {
                        c14946l3 = c14946lArr2[i8];
                    }
                    if (c4657l4 == null) {
                    }
                } else {
                    c14946lArr2 = c11338l14.f22842catch;
                    C14946l c14946l212 = c14946lArr2[i3];
                    if (c11338l == null) {
                        c11338l = c11338l14;
                    }
                    C14946l[] c14946lArr16 = c11338l.f22842catch;
                    i8 = i3 + 1;
                    c14946l3 = c14946lArr16[i8];
                    c14946l4 = c14946l212.billing;
                    if (c14946l4 != null) {
                        c4657l4 = c14946l4.subs;
                    } else {
                        c4657l4 = null;
                    }
                    c14946l5 = c14946l3.billing;
                    if (c14946l5 != null) {
                        c4657l5 = c14946l5.subs;
                    } else {
                        c4657l5 = null;
                    }
                    if (c11338l13 != c11338l) {
                        C14946l c14946l213 = c11338l13.f22842catch[i8].billing;
                        c4657l5 = c14946l213 != null ? c14946l213.subs : null;
                    }
                    if (c11338l14 == c11338l) {
                        c14946l3 = c14946lArr2[i8];
                    }
                    if (c4657l4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            c10664l2 = c10664l;
            i14 = i5;
        }
    }

    public static void metrica(C12507l c12507l, C10111l c10111l) {
        AbstractC6791l.billing(0, 0, c12507l.f24647l, (int[]) c10111l.f20587l);
        AbstractC6791l.billing(0, 0, c12507l.f24646l, (int[]) c10111l.f20586l);
        int[] iArr = (int[]) c10111l.f20589l;
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static C7972l mopub(byte[] bArr) {
        C17951l c17951l = new C17951l(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        byte[] bArr2 = new byte[114];
        c17951l.billing(0, 57, bArr);
        c17951l.crashlytics(0, 114, bArr2);
        byte[] bArr3 = new byte[57];
        subscription(bArr2, bArr3);
        C10111l c10111l = new C10111l(16);
        tapsense(bArr3, c10111l);
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        AbstractC6791l.adcel((int[]) c10111l.f20589l, iArr2);
        AbstractC6791l.tapsense(iArr2, (int[]) c10111l.f20587l, iArr);
        AbstractC6791l.tapsense(iArr2, (int[]) c10111l.f20586l, iArr2);
        AbstractC6791l.license(iArr, 1);
        AbstractC6791l.license(iArr, -1);
        AbstractC6791l.license(iArr2, 1);
        AbstractC6791l.license(iArr2, -1);
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        AbstractC6791l.ad(iArr, iArr4);
        AbstractC6791l.ad(iArr2, iArr5);
        AbstractC6791l.tapsense(iArr4, iArr5, iArr3);
        AbstractC6791l.crashlytics(iArr4, iArr5, iArr4);
        AbstractC6791l.subscription(39081, iArr3, iArr3);
        int[] iArr6 = new int[16];
        iArr6[0] = 1;
        AbstractC6791l.advert(iArr3, iArr6, iArr3);
        AbstractC6791l.crashlytics(iArr3, iArr4, iArr3);
        AbstractC6791l.license(iArr3, 1);
        AbstractC6791l.license(iArr3, -1);
        AbstractC6791l.license(iArr5, 1);
        AbstractC6791l.license(iArr5, -1);
        if ((AbstractC6791l.ads(iArr3) & (~AbstractC6791l.ads(iArr5))) == 0) {
            C18073l.admob();
            return null;
        }
        int[] iArr7 = new int[32];
        AbstractC6791l.billing(0, 0, iArr, iArr7);
        AbstractC6791l.billing(0, 16, iArr2, iArr7);
        return new C7972l(10, iArr7);
    }

    public static void purchase(byte b, C17951l c17951l, byte[] bArr) {
        int length = bArr.length + 10;
        byte[] bArr2 = new byte[length];
        System.arraycopy(yandex, 0, bArr2, 0, 8);
        bArr2[8] = b;
        bArr2[9] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 10, bArr.length);
        c17951l.billing(0, length, bArr2);
    }

    public static void remoteconfig(boolean z, C12507l c12507l, C10111l c10111l, C14169l c14169l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = (int[]) c14169l.loadAd;
        int[] iArr6 = (int[]) c14169l.crashlytics;
        int[] iArr7 = (int[]) c14169l.amazon;
        int[] iArr8 = (int[]) c14169l.purchase;
        int[] iArr9 = (int[]) c14169l.billing;
        int[] iArr10 = (int[]) c14169l.mopub;
        int[] iArr11 = (int[]) c14169l.admob;
        if (z) {
            AbstractC6791l.advert(c12507l.f24646l, c12507l.f24647l, iArr11);
            iArr2 = iArr5;
            iArr = iArr8;
            iArr4 = iArr9;
            iArr3 = iArr10;
        } else {
            AbstractC6791l.crashlytics(c12507l.f24646l, c12507l.f24647l, iArr11);
            iArr = iArr5;
            iArr2 = iArr8;
            iArr3 = iArr9;
            iArr4 = iArr10;
        }
        int[] iArr12 = (int[]) c10111l.f20589l;
        int[] iArr13 = (int[]) c10111l.f20586l;
        int[] iArr14 = (int[]) c10111l.f20587l;
        AbstractC6791l.ad(iArr12, iArr5);
        AbstractC6791l.tapsense(c12507l.f24647l, iArr14, iArr6);
        AbstractC6791l.tapsense(c12507l.f24646l, iArr13, iArr7);
        AbstractC6791l.tapsense(iArr6, iArr7, iArr8);
        AbstractC6791l.subscription(39081, iArr8, iArr8);
        AbstractC6791l.crashlytics(iArr5, iArr8, iArr3);
        AbstractC6791l.advert(iArr5, iArr8, iArr4);
        AbstractC6791l.crashlytics(iArr13, iArr14, iArr8);
        AbstractC6791l.tapsense(iArr11, iArr8, iArr11);
        AbstractC6791l.crashlytics(iArr7, iArr6, iArr);
        AbstractC6791l.advert(iArr7, iArr6, iArr2);
        AbstractC6791l.amazon(iArr);
        AbstractC6791l.advert(iArr11, iArr5, iArr11);
        AbstractC6791l.tapsense(iArr11, iArr12, iArr11);
        AbstractC6791l.tapsense(iArr8, iArr12, iArr8);
        AbstractC6791l.tapsense(iArr9, iArr11, iArr14);
        AbstractC6791l.tapsense(iArr8, iArr10, iArr13);
        AbstractC6791l.tapsense(iArr9, iArr10, iArr12);
    }

    public static void smaato(boolean z, C10111l c10111l, C10111l c10111l2, C14169l c14169l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = (int[]) c10111l2.f20589l;
        int[] iArr6 = (int[]) c14169l.yandex;
        int[] iArr7 = (int[]) c14169l.loadAd;
        int[] iArr8 = (int[]) c14169l.crashlytics;
        int[] iArr9 = (int[]) c14169l.amazon;
        int[] iArr10 = (int[]) c14169l.purchase;
        int[] iArr11 = (int[]) c14169l.billing;
        int[] iArr12 = (int[]) c14169l.mopub;
        int[] iArr13 = (int[]) c14169l.admob;
        int[] iArr14 = (int[]) c10111l.f20586l;
        int[] iArr15 = (int[]) c10111l.f20587l;
        if (z) {
            AbstractC6791l.advert(iArr14, iArr15, iArr13);
            iArr2 = iArr7;
            iArr = iArr10;
            iArr4 = iArr11;
            iArr3 = iArr12;
        } else {
            AbstractC6791l.crashlytics(iArr14, iArr15, iArr13);
            iArr = iArr7;
            iArr2 = iArr10;
            iArr3 = iArr11;
            iArr4 = iArr12;
        }
        int[] iArr16 = (int[]) c10111l.f20589l;
        int[] iArr17 = (int[]) c10111l2.f20586l;
        int[] iArr18 = (int[]) c10111l2.f20587l;
        AbstractC6791l.tapsense(iArr16, iArr5, iArr6);
        AbstractC6791l.ad(iArr6, iArr7);
        AbstractC6791l.tapsense((int[]) c10111l.f20587l, iArr18, iArr8);
        AbstractC6791l.tapsense((int[]) c10111l.f20586l, iArr17, iArr9);
        AbstractC6791l.tapsense(iArr8, iArr9, iArr10);
        AbstractC6791l.subscription(39081, iArr10, iArr10);
        AbstractC6791l.crashlytics(iArr7, iArr10, iArr3);
        AbstractC6791l.advert(iArr7, iArr10, iArr4);
        AbstractC6791l.crashlytics(iArr17, iArr18, iArr10);
        AbstractC6791l.tapsense(iArr13, iArr10, iArr13);
        AbstractC6791l.crashlytics(iArr9, iArr8, iArr);
        AbstractC6791l.advert(iArr9, iArr8, iArr2);
        AbstractC6791l.amazon(iArr);
        AbstractC6791l.advert(iArr13, iArr7, iArr13);
        AbstractC6791l.tapsense(iArr13, iArr6, iArr13);
        AbstractC6791l.tapsense(iArr10, iArr6, iArr10);
        AbstractC6791l.tapsense(iArr11, iArr13, iArr18);
        AbstractC6791l.tapsense(iArr10, iArr12, iArr17);
        AbstractC6791l.tapsense(iArr11, iArr12, iArr5);
    }

    public static void startapp(C10111l c10111l, C14169l c14169l) {
        int[] iArr = (int[]) c14169l.loadAd;
        int[] iArr2 = (int[]) c14169l.crashlytics;
        int[] iArr3 = (int[]) c14169l.amazon;
        int[] iArr4 = (int[]) c14169l.purchase;
        int[] iArr5 = (int[]) c14169l.admob;
        int[] iArr6 = (int[]) c14169l.yandex;
        int[] iArr7 = (int[]) c10111l.f20587l;
        int[] iArr8 = (int[]) c10111l.f20586l;
        AbstractC6791l.crashlytics(iArr7, iArr8, iArr);
        AbstractC6791l.ad(iArr, iArr);
        AbstractC6791l.ad(iArr7, iArr2);
        AbstractC6791l.ad(iArr8, iArr3);
        AbstractC6791l.crashlytics(iArr2, iArr3, iArr4);
        AbstractC6791l.amazon(iArr4);
        int[] iArr9 = (int[]) c10111l.f20589l;
        AbstractC6791l.ad(iArr9, iArr5);
        AbstractC6791l.crashlytics(iArr5, iArr5, iArr5);
        AbstractC6791l.amazon(iArr5);
        AbstractC6791l.advert(iArr4, iArr5, iArr6);
        AbstractC6791l.advert(iArr, iArr4, iArr);
        AbstractC6791l.advert(iArr2, iArr3, iArr2);
        AbstractC6791l.tapsense(iArr, iArr6, iArr7);
        AbstractC6791l.tapsense(iArr4, iArr2, iArr8);
        AbstractC6791l.tapsense(iArr4, iArr6, iArr9);
    }

    public static void subs(C10111l[] c10111lArr) {
        int length = c10111lArr.length;
        int[] iArr = new int[length * 16];
        int[] iArr2 = new int[16];
        AbstractC6791l.billing(0, 0, (int[]) c10111lArr[0].f20589l, iArr2);
        AbstractC6791l.billing(0, 0, iArr2, iArr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            AbstractC6791l.tapsense(iArr2, (int[]) c10111lArr[i2].f20589l, iArr2);
            AbstractC6791l.billing(0, i2 * 16, iArr2, iArr);
            i = i2;
        }
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[14];
        AbstractC6791l.billing(0, 0, iArr2, iArr3);
        AbstractC6791l.license(iArr3, 1);
        AbstractC6791l.license(iArr3, -1);
        AbstractC6791l.metrica(0, 0, iArr3, iArr4);
        AbstractC6791l.metrica(8, 7, iArr3, iArr4);
        AbstractC6974l.vip(AbstractC6791l.subs, iArr4, iArr4);
        AbstractC6791l.isPro(0, 0, iArr4, iArr2);
        AbstractC6791l.isPro(7, 8, iArr4, iArr2);
        int[] iArr5 = new int[16];
        while (i > 0) {
            int i3 = i - 1;
            AbstractC6791l.billing(i3 * 16, 0, iArr, iArr5);
            AbstractC6791l.tapsense(iArr5, iArr2, iArr5);
            AbstractC6791l.tapsense(iArr2, (int[]) c10111lArr[i].f20589l, iArr2);
            AbstractC6791l.billing(0, 0, iArr5, (int[]) c10111lArr[i].f20589l);
            i = i3;
        }
        AbstractC6791l.billing(0, 0, iArr2, (int[]) c10111lArr[0].f20589l);
    }

    public static void subscription(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    public static void tapsense(byte[] bArr, C10111l c10111l) {
        int[] iArr = (int[]) c10111l.f20589l;
        int[] iArr2 = (int[]) c10111l.f20586l;
        int[] iArr3 = (int[]) c10111l.f20587l;
        ads();
        int i = 15;
        int[] iArr4 = new int[15];
        AbstractC1896l.purchase(bArr, iArr4);
        int i2 = 0;
        int i3 = 1;
        long j = ((long) (-((~iArr4[0]) & 1))) & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        while (i4 < 14) {
            int i5 = i;
            int[] iArr5 = iArr4;
            long j3 = j;
            long j4 = (((long) iArr4[i4]) & 4294967295L) + (((long) AbstractC1896l.yandex[i4]) & j3) + j2;
            iArr5[i4] = (int) j4;
            j2 = j4 >>> 32;
            i4++;
            i3 = i3;
            i = i5;
            iArr4 = iArr5;
            j = j3;
        }
        int[] iArr6 = iArr4;
        int i6 = i3;
        iArr6[14] = 4 + ((int) j2);
        int i7 = i;
        int i8 = 0;
        while (true) {
            i7--;
            if (i7 < 0) {
                break;
            }
            int i9 = iArr6[i7];
            iArr6[i7] = (i8 << 31) | (i9 >>> 1);
            i8 = i9;
        }
        int[] iArr7 = new int[16];
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[16];
        int[] iArr10 = new int[16];
        int[] iArr11 = new int[16];
        int[] iArr12 = new int[16];
        int[] iArr13 = new int[16];
        int[] iArr14 = new int[16];
        int[] iArr15 = new int[16];
        int[] iArr16 = new int[16];
        for (int i10 = 0; i10 < 16; i10++) {
            iArr3[i10] = 0;
        }
        iArr2[0] = i6;
        for (int i11 = i6; i11 < 16; i11++) {
            iArr2[i11] = 0;
        }
        iArr[0] = i6;
        for (int i12 = i6; i12 < 16; i12++) {
            iArr[i12] = 0;
        }
        int i13 = 17;
        while (true) {
            int i14 = i13;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                int i15 = i13;
                int i16 = 0;
                int i17 = 0;
                for (int i18 = 5; i16 < i18; i18 = 5) {
                    i17 = (i17 & (~(i6 << i16))) ^ ((iArr6[i14 >>> 5] >>> (i14 & 31)) << i16);
                    i14 += 18;
                    i16++;
                }
                int i19 = -((i17 >>> 4) & 1);
                int i20 = (i17 ^ i19) & 15;
                int i21 = i2 * AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                int i22 = i2;
                int[] iArr17 = iArr9;
                for (int i23 = 0; i23 < 16; i23++) {
                    int i24 = ((i23 ^ i20) - 1) >> 31;
                    AbstractC6791l.purchase(i24, i21, isPro, iArr7);
                    AbstractC6791l.purchase(i24, i21 + 16, isPro, iArr8);
                    i21 += 32;
                }
                int[] iArr18 = new int[16];
                AbstractC6791l.advert(iArr18, iArr7, iArr18);
                AbstractC6791l.purchase(i19, 0, iArr18, iArr7);
                AbstractC6791l.ad(iArr, iArr10);
                AbstractC6791l.tapsense(iArr7, iArr3, iArr11);
                AbstractC6791l.tapsense(iArr8, iArr2, iArr12);
                AbstractC6791l.tapsense(iArr11, iArr12, iArr13);
                AbstractC6791l.subscription(39081, iArr13, iArr13);
                AbstractC6791l.crashlytics(iArr10, iArr13, iArr14);
                AbstractC6791l.advert(iArr10, iArr13, iArr15);
                AbstractC6791l.crashlytics(iArr8, iArr7, iArr16);
                AbstractC6791l.crashlytics(iArr2, iArr3, iArr13);
                AbstractC6791l.tapsense(iArr16, iArr13, iArr16);
                AbstractC6791l.crashlytics(iArr12, iArr11, iArr10);
                AbstractC6791l.advert(iArr12, iArr11, iArr13);
                AbstractC6791l.amazon(iArr10);
                AbstractC6791l.advert(iArr16, iArr10, iArr16);
                AbstractC6791l.tapsense(iArr16, iArr, iArr16);
                AbstractC6791l.tapsense(iArr13, iArr, iArr13);
                AbstractC6791l.tapsense(iArr14, iArr16, iArr3);
                AbstractC6791l.tapsense(iArr13, iArr15, iArr2);
                AbstractC6791l.tapsense(iArr14, iArr15, iArr);
                i2 = i22 + 1;
                i13 = i15;
                iArr9 = iArr17;
            }
            int[] iArr19 = iArr9;
            int i25 = i13 - 1;
            if (i25 < 0) {
                return;
            }
            AbstractC6791l.crashlytics(iArr3, iArr2, iArr10);
            AbstractC6791l.ad(iArr10, iArr10);
            AbstractC6791l.ad(iArr3, iArr11);
            AbstractC6791l.ad(iArr2, iArr12);
            AbstractC6791l.crashlytics(iArr11, iArr12, iArr13);
            AbstractC6791l.amazon(iArr13);
            AbstractC6791l.ad(iArr, iArr16);
            AbstractC6791l.crashlytics(iArr16, iArr16, iArr16);
            AbstractC6791l.amazon(iArr16);
            AbstractC6791l.advert(iArr13, iArr16, iArr19);
            AbstractC6791l.advert(iArr10, iArr13, iArr10);
            AbstractC6791l.advert(iArr11, iArr12, iArr11);
            AbstractC6791l.tapsense(iArr10, iArr19, iArr3);
            AbstractC6791l.tapsense(iArr13, iArr11, iArr2);
            AbstractC6791l.tapsense(iArr13, iArr19, iArr);
            i13 = i25;
            iArr9 = iArr19;
            i2 = 0;
        }
    }

    public static void vip(C10111l c10111l, C10111l c10111l2) {
        AbstractC6791l.billing(0, 0, (int[]) c10111l.f20587l, (int[]) c10111l2.f20587l);
        AbstractC6791l.billing(0, 0, (int[]) c10111l.f20586l, (int[]) c10111l2.f20586l);
        AbstractC6791l.billing(0, 0, (int[]) c10111l.f20589l, (int[]) c10111l2.f20589l);
    }

    public static final void yandex(EnumC3909l enumC3909l, C8896l c8896l, InterfaceC17242l interfaceC17242l, C15578l c15578l, C6956l c6956l, int i) {
        c6956l.m2133new(860637404);
        int i2 = (c6956l.amazon(enumC3909l.ordinal()) ? 4 : 2) | i | (c6956l.billing(c8896l) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C3244l();
                c6956l.m2147try(objM2132native);
            }
            AbstractC11308l.yandex(interfaceC17242l, null, AbstractC14566l.amazon(-1043727438, new C11223l((C3244l) objM2132native, enumC3909l, c8896l, c15578l, 19), c6956l), c6956l, 3078, 6);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(enumC3909l, c8896l, interfaceC17242l, c15578l, i, 14);
        }
    }
}
