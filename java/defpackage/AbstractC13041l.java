package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13041l {
    public static final int[] yandex = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] loadAd = {1886001095, 1339575613, 1980447930, 258412557, -95215574, -959694548, 2013120334, 2047061138};
    public static final int[] crashlytics = {-1886001114, -1339575614, -1980447931, -258412558, 95215573, 959694547, -2013120335, 100422509};
    public static final int[] amazon = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int[] purchase = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int[] billing = {12052516, 1174424, 4087752, 38672185, 20040971, 21899680, 55468344, 20105554, 66708015, 9981791};
    public static final int[] mopub = {66430571, 45040722, 4842939, 15895846, 18981244, 46308410, 4697481, 8903007, 53646190, 12474675};
    public static final int[] admob = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int[] subs = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int[] isPro = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final Object firebase = new Object();
    public static C0554l[] smaato = null;
    public static C0554l[] remoteconfig = null;
    public static int[] vip = null;

    public static void Signature(byte[] bArr, C11644l c11644l) {
        char c;
        int[] iArr = (int[]) c11644l.f23362l;
        int[] iArr2 = (int[]) c11644l.f23360l;
        int[] iArr3 = (int[]) c11644l.f23361l;
        int[] iArr4 = (int[]) c11644l.f23357l;
        int[] iArr5 = (int[]) c11644l.f23358l;
        adcel();
        int i = 8;
        int[] iArr6 = new int[8];
        AbstractC2219l.amazon(bArr, iArr6);
        int i2 = 0;
        int i3 = 1;
        long j = 4294967295L;
        long j2 = ((long) (-((~iArr6[0]) & 1))) & 4294967295L;
        long j3 = 0;
        int i4 = 0;
        while (i4 < 8) {
            int i5 = i3;
            long j4 = j2;
            long j5 = (((long) iArr6[i4]) & j) + (((long) AbstractC2219l.yandex[i4]) & j4) + j3;
            iArr6[i4] = (int) j5;
            j3 = j5 >>> 32;
            i4++;
            i2 = i2;
            i3 = i5;
            j2 = j4;
            j = 4294967295L;
        }
        int i6 = i2;
        int i7 = 8;
        int i8 = i3;
        while (true) {
            i7--;
            if (i7 < 0) {
                break;
            }
            int i9 = iArr6[i7];
            iArr6[i7] = (i8 << 31) | (i9 >>> 1);
            i8 = i9;
        }
        int i10 = i6;
        while (true) {
            c = 7;
            if (i10 >= 8) {
                break;
            }
            iArr6[i10] = AbstractC2438l.loadAd(AbstractC2438l.loadAd(AbstractC2438l.loadAd(AbstractC2438l.loadAd(iArr6[i10], 11141290, 7), 52428, 14), 15728880, 4), 65280, 8);
            i10++;
        }
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        int[] iArr9 = new int[10];
        int[] iArr10 = new int[10];
        for (int i11 = i6; i11 < 10; i11++) {
            iArr5[i11] = i6;
        }
        AbstractC11397l.advert(iArr4);
        AbstractC11397l.advert(iArr3);
        for (int i12 = i6; i12 < 10; i12++) {
            iArr2[i12] = i6;
        }
        AbstractC11397l.advert(iArr);
        int i13 = 28;
        int i14 = i6;
        while (true) {
            int i15 = i6;
            while (i15 < i) {
                int i16 = iArr6[i15] >>> i13;
                char c2 = c;
                int i17 = (i16 >>> 3) & 1;
                int i18 = (i16 ^ (-i17)) & 7;
                int i19 = i15 * 240;
                int[] iArr11 = iArr6;
                for (int i20 = i6; i20 < 8; i20++) {
                    int i21 = ((i20 ^ i18) - 1) >> 31;
                    AbstractC11397l.admob(i21, i19, vip, iArr7);
                    int i22 = i19;
                    AbstractC11397l.admob(i21, i19 + 10, vip, iArr8);
                    AbstractC11397l.admob(i21, i22 + 20, vip, iArr9);
                    i19 = i22 + 30;
                }
                int i23 = i14 ^ i17;
                AbstractC11397l.subs(iArr5, i23);
                AbstractC11397l.subs(iArr2, i23);
                AbstractC11397l.billing(iArr4, iArr5, iArr4, iArr5);
                AbstractC11397l.Signature(iArr5, iArr7, iArr5);
                AbstractC11397l.Signature(iArr4, iArr8, iArr4);
                AbstractC11397l.Signature(iArr2, iArr, iArr10);
                AbstractC11397l.Signature(iArr10, iArr9, iArr10);
                AbstractC11397l.billing(iArr4, iArr5, iArr, iArr2);
                AbstractC11397l.billing(iArr3, iArr10, iArr4, iArr5);
                AbstractC11397l.Signature(iArr5, iArr4, iArr3);
                AbstractC11397l.Signature(iArr5, iArr2, iArr5);
                AbstractC11397l.Signature(iArr4, iArr, iArr4);
                i15++;
                i14 = i17;
                iArr6 = iArr11;
                c = c2;
                i = 8;
            }
            int[] iArr12 = iArr6;
            char c3 = c;
            i13 -= 4;
            if (i13 < 0) {
                AbstractC11397l.subs(iArr5, i14);
                AbstractC11397l.subs(iArr2, i14);
                return;
            } else {
                metrica(c11644l);
                iArr6 = iArr12;
                c = c3;
                i = 8;
            }
        }
    }

    public static void adcel() {
        synchronized (firebase) {
            try {
                if (vip != null) {
                    return;
                }
                C10038l[] c10038lArr = new C10038l[96];
                C0458l c0458l = new C0458l(18);
                int[] iArr = new int[10];
                int[] iArr2 = new int[10];
                int[] iArr3 = amazon;
                int i = 0;
                AbstractC11397l.isPro(0, 0, iArr3, iArr);
                int[] iArr4 = purchase;
                AbstractC11397l.isPro(0, 0, iArr4, iArr2);
                int i2 = 12;
                C10038l c10038l = new C10038l(12);
                AbstractC11397l.isPro(0, 0, iArr, (int[]) c10038l.f20463l);
                AbstractC11397l.isPro(0, 0, iArr2, (int[]) c10038l.f20462l);
                AbstractC11397l.advert((int[]) c10038l.f20466l);
                AbstractC11397l.Signature(iArr, iArr2, (int[]) c10038l.f20465l);
                c10038lArr[0] = c10038l;
                C10038l c10038l2 = new C10038l(12);
                firebase(c10038l, c10038l, c10038l2, c0458l);
                for (int i3 = 1; i3 < 16; i3++) {
                    C10038l c10038l3 = new C10038l(12);
                    int i4 = 0 + i3;
                    firebase(c10038lArr[i4 - 1], c10038l2, c10038l3, c0458l);
                    c10038lArr[i4] = c10038l3;
                }
                int[] iArr5 = new int[10];
                int[] iArr6 = new int[10];
                AbstractC11397l.isPro(0, 0, billing, iArr5);
                AbstractC11397l.isPro(0, 0, mopub, iArr6);
                C10038l c10038l4 = new C10038l(12);
                AbstractC11397l.isPro(0, 0, iArr5, (int[]) c10038l4.f20463l);
                AbstractC11397l.isPro(0, 0, iArr6, (int[]) c10038l4.f20462l);
                AbstractC11397l.advert((int[]) c10038l4.f20466l);
                AbstractC11397l.Signature(iArr5, iArr6, (int[]) c10038l4.f20465l);
                c10038lArr[16] = c10038l4;
                C10038l c10038l5 = new C10038l(12);
                firebase(c10038l4, c10038l4, c10038l5, c0458l);
                for (int i5 = 1; i5 < 16; i5++) {
                    C10038l c10038l6 = new C10038l(12);
                    int i6 = 16 + i5;
                    firebase(c10038lArr[i6 - 1], c10038l5, c10038l6, c0458l);
                    c10038lArr[i6] = c10038l6;
                }
                C11644l c11644l = new C11644l(14);
                AbstractC11397l.isPro(0, 0, iArr3, (int[]) c11644l.f23358l);
                AbstractC11397l.isPro(0, 0, iArr4, (int[]) c11644l.f23357l);
                AbstractC11397l.advert((int[]) c11644l.f23361l);
                AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23358l, (int[]) c11644l.f23360l);
                AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23357l, (int[]) c11644l.f23362l);
                int i7 = 4;
                C10038l[] c10038lArr2 = new C10038l[4];
                for (int i8 = 0; i8 < 4; i8++) {
                    c10038lArr2[i8] = new C10038l(12);
                }
                C10038l c10038l7 = new C10038l(12);
                int i9 = 0;
                int i10 = 32;
                while (i9 < 8) {
                    C10038l c10038l8 = new C10038l(i2);
                    while (i < i7) {
                        if (i == 0) {
                            vip(c11644l, c10038l8);
                        } else {
                            vip(c11644l, c10038l7);
                            firebase(c10038l8, c10038l7, c10038l8, c0458l);
                        }
                        metrica(c11644l);
                        vip(c11644l, c10038lArr2[i]);
                        if (i9 + i != 10) {
                            for (int i11 = 1; i11 < 8; i11++) {
                                metrica(c11644l);
                            }
                        }
                        i++;
                        i7 = 4;
                    }
                    int[] iArr7 = (int[]) c10038l8.f20463l;
                    AbstractC11397l.pro(iArr7, iArr7);
                    int[] iArr8 = (int[]) c10038l8.f20465l;
                    AbstractC11397l.pro(iArr8, iArr8);
                    c10038lArr[i10] = c10038l8;
                    i10++;
                    int i12 = 0;
                    while (i12 < 3) {
                        int i13 = 1 << i12;
                        int i14 = 0;
                        while (i14 < i13) {
                            C10038l c10038l9 = new C10038l(i2);
                            c10038lArr[i10] = c10038l9;
                            firebase(c10038lArr[i10 - i13], c10038lArr2[i12], c10038l9, c0458l);
                            i14++;
                            i10++;
                            i2 = 12;
                        }
                        i12++;
                        i2 = 12;
                    }
                    i9++;
                    i7 = 4;
                    i = 0;
                    i2 = 12;
                }
                subs(c10038lArr);
                smaato = new C0554l[16];
                for (int i15 = 0; i15 < 16; i15++) {
                    C10038l c10038l10 = c10038lArr[i15];
                    C0554l c0554l = new C0554l(15);
                    int[] iArr9 = (int[]) c10038l10.f20463l;
                    AbstractC11397l.Signature(iArr9, (int[]) c10038l10.f20466l, iArr9);
                    int[] iArr10 = (int[]) c10038l10.f20462l;
                    AbstractC11397l.Signature(iArr10, (int[]) c10038l10.f20466l, iArr10);
                    AbstractC11397l.billing((int[]) c10038l10.f20462l, (int[]) c10038l10.f20463l, (int[]) c0554l.f1957l, (int[]) c0554l.f1958l);
                    AbstractC11397l.Signature((int[]) c10038l10.f20463l, (int[]) c10038l10.f20462l, (int[]) c0554l.f1956l);
                    int[] iArr11 = (int[]) c0554l.f1956l;
                    AbstractC11397l.Signature(iArr11, isPro, iArr11);
                    AbstractC11397l.ad((int[]) c0554l.f1958l);
                    AbstractC11397l.ad((int[]) c0554l.f1957l);
                    AbstractC11397l.ad((int[]) c0554l.f1956l);
                    smaato[i15] = c0554l;
                }
                remoteconfig = new C0554l[16];
                for (int i16 = 0; i16 < 16; i16++) {
                    C10038l c10038l11 = c10038lArr[16 + i16];
                    C0554l c0554l2 = new C0554l(15);
                    int[] iArr12 = (int[]) c10038l11.f20463l;
                    AbstractC11397l.Signature(iArr12, (int[]) c10038l11.f20466l, iArr12);
                    int[] iArr13 = (int[]) c10038l11.f20462l;
                    AbstractC11397l.Signature(iArr13, (int[]) c10038l11.f20466l, iArr13);
                    AbstractC11397l.billing((int[]) c10038l11.f20462l, (int[]) c10038l11.f20463l, (int[]) c0554l2.f1957l, (int[]) c0554l2.f1958l);
                    AbstractC11397l.Signature((int[]) c10038l11.f20463l, (int[]) c10038l11.f20462l, (int[]) c0554l2.f1956l);
                    int[] iArr14 = (int[]) c0554l2.f1956l;
                    AbstractC11397l.Signature(iArr14, isPro, iArr14);
                    AbstractC11397l.ad((int[]) c0554l2.f1958l);
                    AbstractC11397l.ad((int[]) c0554l2.f1957l);
                    AbstractC11397l.ad((int[]) c0554l2.f1956l);
                    remoteconfig[i16] = c0554l2;
                }
                vip = new int[1920];
                int[] iArr15 = new int[10];
                int[] iArr16 = new int[10];
                int[] iArr17 = new int[10];
                int i17 = 0;
                for (int i18 = 32; i18 < 96; i18++) {
                    C10038l c10038l12 = c10038lArr[i18];
                    int[] iArr18 = (int[]) c10038l12.f20463l;
                    AbstractC11397l.Signature(iArr18, (int[]) c10038l12.f20466l, iArr18);
                    int[] iArr19 = (int[]) c10038l12.f20462l;
                    AbstractC11397l.Signature(iArr19, (int[]) c10038l12.f20466l, iArr19);
                    AbstractC11397l.billing((int[]) c10038l12.f20462l, (int[]) c10038l12.f20463l, iArr16, iArr15);
                    AbstractC11397l.Signature((int[]) c10038l12.f20463l, (int[]) c10038l12.f20462l, iArr17);
                    AbstractC11397l.Signature(iArr17, isPro, iArr17);
                    AbstractC11397l.ad(iArr15);
                    AbstractC11397l.ad(iArr16);
                    AbstractC11397l.ad(iArr17);
                    AbstractC11397l.isPro(0, i17, iArr15, vip);
                    AbstractC11397l.isPro(0, i17 + 10, iArr16, vip);
                    AbstractC11397l.isPro(0, i17 + 20, iArr17, vip);
                    i17 += 30;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean admob(byte[] bArr, C13161l c13161l, byte b, byte[] bArr2, int i) {
        boolean z;
        boolean z2;
        int[] iArr;
        int i2;
        boolean z3;
        if (b != 0) {
            C8339l.metrica("ctx");
            return false;
        }
        byte[] bArr3 = new byte[32];
        System.arraycopy(bArr, 0, bArr3, 0, 32);
        byte[] bArr4 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        int iCrashlytics = AbstractC16655l.crashlytics(28, bArr3) & Alert.DURATION_SHOW_INDEFINITELY;
        int[] iArr2 = yandex;
        if (iCrashlytics < iArr2[7]) {
            z = true;
        } else {
            int[] iArr3 = new int[8];
            AbstractC16655l.amazon(8, bArr3, iArr3);
            iArr3[7] = Integer.MAX_VALUE & iArr3[7];
            z = !AbstractC5998l.metrica(iArr3, iArr2);
        }
        if (z) {
            int[] iArr4 = new int[8];
            AbstractC2219l.amazon(bArr4, iArr4);
            int[] iArr5 = AbstractC2219l.yandex;
            if (!AbstractC5998l.metrica(iArr4, iArr5)) {
                C10023l c10023l = new C10023l(19);
                if (amazon(bArr3, true, c10023l)) {
                    C10023l c10023l2 = new C10023l(19);
                    AbstractC11397l.pro((int[]) c13161l.f25776l, (int[]) c10023l2.f20419l);
                    AbstractC11397l.isPro(10, 0, (int[]) c13161l.f25776l, (int[]) c10023l2.f20418l);
                    byte[] bArr5 = new byte[32];
                    purchase(c13161l, bArr5, 0);
                    C17711l c17711l = new C17711l();
                    byte[] bArr6 = new byte[64];
                    c17711l.update(bArr3, 0, 32);
                    c17711l.update(bArr5, 0, 32);
                    c17711l.update(bArr2, 0, i);
                    c17711l.doFinal(bArr6, 0);
                    int[] iArr6 = new int[8];
                    AbstractC2219l.amazon(AbstractC2219l.admob(bArr6), iArr6);
                    int[] iArr7 = new int[4];
                    int[] iArr8 = new int[4];
                    int[] iArr9 = new int[16];
                    System.arraycopy(AbstractC2219l.loadAd, 0, iArr9, 0, 16);
                    int[] iArr10 = new int[16];
                    AbstractC5998l.pro(iArr6, iArr10);
                    iArr10[0] = iArr10[0] + 1;
                    int[] iArr11 = new int[16];
                    AbstractC5998l.tapsense(iArr5, iArr6, iArr11);
                    int[] iArr12 = new int[16];
                    int[] iArr13 = new int[4];
                    System.arraycopy(iArr5, 0, iArr13, 0, 4);
                    int[] iArr14 = new int[4];
                    System.arraycopy(iArr6, 0, iArr14, 0, 4);
                    int[] iArr15 = new int[4];
                    iArr15[0] = 1;
                    int i3 = 15;
                    int i4 = 1016;
                    int[] iArr16 = new int[4];
                    int[] iArr17 = iArr13;
                    int[] iArr18 = iArr15;
                    int[] iArr19 = iArr14;
                    int[] iArr20 = iArr9;
                    int[] iArr21 = iArr10;
                    int iAdmob = AbstractC3979l.admob(iArr10, 15);
                    while (true) {
                        if (iAdmob <= 254) {
                            System.arraycopy(iArr19, 0, iArr7, 0, 4);
                            System.arraycopy(iArr18, 0, iArr8, 0, 4);
                            z2 = true;
                            break;
                        }
                        int i5 = i4 - 1;
                        if (i5 < 0) {
                            z2 = false;
                            break;
                        }
                        int iMopub = AbstractC3979l.mopub(iArr11, i3) - iAdmob;
                        int i6 = iMopub & (~(iMopub >> 31));
                        int i7 = i3;
                        int[] iArr22 = iArr12;
                        int[] iArr23 = iArr11;
                        if (iArr11[i3] < 0) {
                            AbstractC3979l.yandex(i7, i6, iArr20, iArr21, iArr23, iArr22);
                            AbstractC3979l.loadAd(3, i6, iArr17, iArr16, iArr19, iArr18);
                        } else {
                            AbstractC3979l.startapp(i7, i6, iArr20, iArr21, iArr23, iArr22);
                            AbstractC3979l.adcel(3, i6, iArr17, iArr16, iArr19, iArr18);
                        }
                        int[] iArr24 = iArr19;
                        int[] iArr25 = iArr18;
                        int i8 = i7;
                        while (true) {
                            int i9 = iArr20[i8] + RecyclerView.UNDEFINED_DURATION;
                            int i10 = iArr21[i8] + RecyclerView.UNDEFINED_DURATION;
                            if (i9 < i10) {
                                z3 = true;
                                break;
                            }
                            if (i9 > i10 || (i8 = i8 - 1) < 0) {
                                z3 = false;
                                break;
                            }
                        }
                        if (z3) {
                            int i11 = iAdmob >>> 5;
                            i3 = i11;
                            iAdmob = AbstractC3979l.admob(iArr20, i11);
                            iArr20 = iArr21;
                            iArr19 = iArr17;
                            iArr18 = iArr16;
                            iArr16 = iArr25;
                            iArr17 = iArr24;
                            iArr21 = iArr20;
                        } else {
                            iArr18 = iArr25;
                            iArr19 = iArr24;
                            iArr20 = iArr20;
                            i3 = i7;
                        }
                        i4 = i5;
                        iArr11 = iArr23;
                        iArr12 = iArr22;
                    }
                    if (!z2) {
                        C18073l.admob();
                        return false;
                    }
                    int[] iArr26 = new int[12];
                    long j = ((long) iArr4[0]) & 4294967295L;
                    long j2 = ((long) iArr4[1]) & 4294967295L;
                    long j3 = ((long) iArr4[2]) & 4294967295L;
                    long j4 = ((long) iArr4[3]) & 4294967295L;
                    long j5 = ((long) iArr4[4]) & 4294967295L;
                    long j6 = ((long) iArr4[5]) & 4294967295L;
                    long j7 = ((long) iArr4[6]) & 4294967295L;
                    long j8 = ((long) iArr4[7]) & 4294967295L;
                    long j9 = ((long) iArr8[0]) & 4294967295L;
                    long j10 = j9 * j;
                    iArr26[0] = (int) j10;
                    long j11 = (j9 * j2) + (j10 >>> 32);
                    iArr26[1] = (int) j11;
                    long j12 = (j9 * j3) + (j11 >>> 32);
                    iArr26[2] = (int) j12;
                    long j13 = (j9 * j4) + (j12 >>> 32);
                    iArr26[3] = (int) j13;
                    long j14 = (j9 * j5) + (j13 >>> 32);
                    iArr26[4] = (int) j14;
                    long j15 = (j9 * j6) + (j14 >>> 32);
                    iArr26[5] = (int) j15;
                    long j16 = (j9 * j7) + (j15 >>> 32);
                    iArr26[6] = (int) j16;
                    long j17 = (j9 * j8) + (j16 >>> 32);
                    iArr26[7] = (int) j17;
                    iArr26[8] = (int) (j17 >>> 32);
                    int i12 = 1;
                    while (i12 < 4) {
                        int i13 = i12;
                        long j18 = ((long) iArr8[i12]) & 4294967295L;
                        long j19 = (j18 * j) + (((long) iArr26[i13]) & 4294967295L);
                        long j20 = j5;
                        iArr26[i13] = (int) j19;
                        int i14 = i13 + 1;
                        long j21 = (j18 * j2) + (((long) iArr26[i14]) & 4294967295L) + (j19 >>> 32);
                        iArr26[i14] = (int) j21;
                        int i15 = i13 + 2;
                        long j22 = (j18 * j3) + (((long) iArr26[i15]) & 4294967295L) + (j21 >>> 32);
                        iArr26[i15] = (int) j22;
                        int i16 = i13 + 3;
                        long j23 = (j18 * j4) + (((long) iArr26[i16]) & 4294967295L) + (j22 >>> 32);
                        iArr26[i16] = (int) j23;
                        int i17 = i13 + 4;
                        long j24 = (j18 * j20) + (((long) iArr26[i17]) & 4294967295L) + (j23 >>> 32);
                        iArr26[i17] = (int) j24;
                        int i18 = i13 + 5;
                        long j25 = (j18 * j6) + (((long) iArr26[i18]) & 4294967295L) + (j24 >>> 32);
                        iArr26[i18] = (int) j25;
                        int i19 = i13 + 6;
                        long j26 = (j18 * j7) + (((long) iArr26[i19]) & 4294967295L) + (j25 >>> 32);
                        iArr26[i19] = (int) j26;
                        int i20 = i13 + 7;
                        long j27 = (j18 * j8) + (((long) iArr26[i20]) & 4294967295L) + (j26 >>> 32);
                        iArr26[i20] = (int) j27;
                        iArr26[i13 + 8] = (int) (j27 >>> 32);
                        j5 = j20;
                        i12 = i14;
                    }
                    if (iArr8[3] < 0) {
                        iArr = iArr26;
                        AbstractC5998l.amazon(0, 4, iArr5, iArr, 0);
                        long j28 = (((long) iArr[4]) & 4294967295L) - (((long) iArr4[0]) & 4294967295L);
                        iArr[4] = (int) j28;
                        long j29 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr4[1]) & 4294967295L)) + (j28 >> 32);
                        iArr[5] = (int) j29;
                        long j30 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr4[2]) & 4294967295L)) + (j29 >> 32);
                        iArr[6] = (int) j30;
                        long j31 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr4[3]) & 4294967295L)) + (j30 >> 32);
                        iArr[7] = (int) j31;
                        long j32 = ((((long) iArr[8]) & 4294967295L) - (((long) iArr4[4]) & 4294967295L)) + (j31 >> 32);
                        iArr[8] = (int) j32;
                        long j33 = ((((long) iArr[9]) & 4294967295L) - (((long) iArr4[5]) & 4294967295L)) + (j32 >> 32);
                        iArr[9] = (int) j33;
                        long j34 = ((((long) iArr[10]) & 4294967295L) - (((long) iArr4[6]) & 4294967295L)) + (j33 >> 32);
                        iArr[10] = (int) j34;
                        iArr[11] = (int) (((((long) iArr[11]) & 4294967295L) - (((long) iArr4[7]) & 4294967295L)) + (j34 >> 32));
                    } else {
                        iArr = iArr26;
                    }
                    byte[] bArr7 = new byte[48];
                    AbstractC16655l.billing(12, bArr7, iArr);
                    long jCrashlytics = ((long) AbstractC16655l.crashlytics(0, bArr7)) & 4294967295L;
                    long jLoadAd = ((long) (AbstractC16655l.loadAd(4, bArr7) << 4)) & 4294967295L;
                    long jCrashlytics2 = ((long) AbstractC16655l.crashlytics(7, bArr7)) & 4294967295L;
                    long jLoadAd2 = ((long) (AbstractC16655l.loadAd(11, bArr7) << 4)) & 4294967295L;
                    long jCrashlytics3 = ((long) AbstractC16655l.crashlytics(14, bArr7)) & 4294967295L;
                    long jLoadAd3 = ((long) (AbstractC16655l.loadAd(18, bArr7) << 4)) & 4294967295L;
                    long jCrashlytics4 = ((long) AbstractC16655l.crashlytics(21, bArr7)) & 4294967295L;
                    long jLoadAd4 = ((long) (AbstractC16655l.loadAd(25, bArr7) << 4)) & 4294967295L;
                    long jCrashlytics5 = ((long) AbstractC16655l.crashlytics(28, bArr7)) & 4294967295L;
                    long jLoadAd5 = AbstractC16655l.loadAd(32, bArr7) << 4;
                    long j35 = jLoadAd5 & 4294967295L;
                    long jCrashlytics6 = AbstractC16655l.crashlytics(35, bArr7);
                    long j36 = jCrashlytics6 & 4294967295L;
                    long jLoadAd6 = AbstractC16655l.loadAd(39, bArr7) << 4;
                    long j37 = jLoadAd6 & 4294967295L;
                    long jCrashlytics7 = AbstractC16655l.crashlytics(42, bArr7);
                    long j38 = (((long) ((((bArr7[47] & 255) << 8) | (bArr7[46] & 255)) << 4)) & 4294967295L) + ((jCrashlytics7 & 4294967295L) >> 28);
                    long j39 = (jCrashlytics7 & 268435455) + (j37 >> 28);
                    long j40 = (jLoadAd4 - (j38 * (-6428113))) - (j39 * 5343);
                    long j41 = (jLoadAd6 & 268435455) + (j36 >> 28);
                    long j42 = jCrashlytics2 - (j41 * (-50998291));
                    long j43 = (jLoadAd2 - (j39 * (-50998291))) - (j41 * 19280294);
                    long j44 = ((jCrashlytics3 - (j38 * (-50998291))) - (j39 * 19280294)) - (j41 * 127719000);
                    long j45 = ((jLoadAd3 - (j38 * 19280294)) - (j39 * 127719000)) - (j41 * (-6428113));
                    long j46 = ((jCrashlytics4 - (j38 * 127719000)) - (j39 * (-6428113))) - (j41 * 5343);
                    long j47 = (jCrashlytics6 & 268435455) + (j35 >> 28);
                    long j48 = jLoadAd5 & 268435455;
                    long j49 = (jCrashlytics5 - (j38 * 5343)) + (j40 >> 28);
                    long j50 = j48 + (j49 >> 28);
                    long j51 = j49 & 268435455;
                    long j52 = j51 >>> 27;
                    long j53 = j50 + j52;
                    long j54 = jCrashlytics - (j53 * (-50998291));
                    long j55 = ((jLoadAd - (j47 * (-50998291))) - (j53 * 19280294)) + (j54 >> 28);
                    long j56 = ((j42 - (j47 * 19280294)) - (j53 * 127719000)) + (j55 >> 28);
                    long j57 = ((j43 - (j47 * 127719000)) - (j53 * (-6428113))) + (j56 >> 28);
                    long j58 = ((j44 - (j47 * (-6428113))) - (j53 * 5343)) + (j57 >> 28);
                    long j59 = (j45 - (j47 * 5343)) + (j58 >> 28);
                    long j60 = j46 + (j59 >> 28);
                    long j61 = (j40 & 268435455) + (j60 >> 28);
                    long j62 = j51 + (j61 >> 28);
                    long j63 = (j62 >> 28) - j52;
                    long j64 = (j54 & 268435455) + (j63 & (-50998291));
                    long j65 = (j55 & 268435455) + (j63 & 19280294) + (j64 >> 28);
                    long j66 = (j56 & 268435455) + (j63 & 127719000) + (j65 >> 28);
                    long j67 = (j57 & 268435455) + (j63 & (-6428113)) + (j66 >> 28);
                    long j68 = (j58 & 268435455) + (j63 & 5343) + (j67 >> 28);
                    long j69 = (j59 & 268435455) + (j68 >> 28);
                    long j70 = (j60 & 268435455) + (j69 >> 28);
                    long j71 = (j61 & 268435455) + (j70 >> 28);
                    byte[] bArr8 = new byte[64];
                    AbstractC16655l.mopub((j64 & 268435455) | ((j65 & 268435455) << 28), bArr8, 0);
                    AbstractC16655l.mopub(((j67 & 268435455) << 28) | (j66 & 268435455), bArr8, 7);
                    AbstractC16655l.mopub(((j69 & 268435455) << 28) | (j68 & 268435455), bArr8, 14);
                    AbstractC16655l.mopub((j70 & 268435455) | ((j71 & 268435455) << 28), bArr8, 21);
                    AbstractC16655l.purchase((int) ((j62 & 268435455) + (j71 >> 28)), 28, bArr8);
                    AbstractC2219l.amazon(bArr8, iArr4);
                    C11644l c11644l = new C11644l(14);
                    adcel();
                    byte[] bArr9 = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                    int i21 = 128;
                    byte[] bArr10 = new byte[128];
                    byte[] bArr11 = new byte[128];
                    AbstractC8238l.crashlytics(6, bArr9, iArr4);
                    AbstractC8238l.crashlytics(4, bArr10, iArr7);
                    AbstractC8238l.crashlytics(4, bArr11, iArr8);
                    C12014l[] c12014lArr = new C12014l[4];
                    C12014l[] c12014lArr2 = new C12014l[4];
                    C0458l c0458l = new C0458l(18);
                    startapp(c10023l2, c12014lArr, c0458l);
                    startapp(c10023l, c12014lArr2, c0458l);
                    int[] iArr27 = (int[]) c11644l.f23358l;
                    int i22 = 0;
                    for (int i23 = 10; i22 < i23; i23 = 10) {
                        iArr27[i22] = 0;
                        i22++;
                    }
                    AbstractC11397l.advert((int[]) c11644l.f23357l);
                    AbstractC11397l.advert((int[]) c11644l.f23361l);
                    int[] iArr28 = (int[]) c11644l.f23360l;
                    for (int i24 = 0; i24 < 10; i24++) {
                        iArr28[i24] = 0;
                    }
                    AbstractC11397l.advert((int[]) c11644l.f23362l);
                    while (true) {
                        i2 = i21 - 1;
                        if (i2 < 0) {
                            break;
                        }
                        if ((bArr9[i21 + 127] | bArr9[i2] | bArr10[i2] | bArr11[i2]) != 0) {
                            break;
                        }
                        i21 = i2;
                    }
                    while (i2 >= 0) {
                        byte b2 = bArr9[i2];
                        if (b2 != 0) {
                            smaato(b2 < 0, smaato[(b2 >> 1) ^ (b2 >> 31)], c11644l, c0458l);
                        }
                        byte b3 = bArr9[i2 + 128];
                        if (b3 != 0) {
                            smaato(b3 < 0, remoteconfig[(b3 >> 1) ^ (b3 >> 31)], c11644l, c0458l);
                        }
                        byte b4 = bArr10[i2];
                        if (b4 != 0) {
                            remoteconfig(b4 < 0, c12014lArr[(b4 >> 1) ^ (b4 >> 31)], c11644l, c0458l);
                        }
                        byte b5 = bArr11[i2];
                        if (b5 != 0) {
                            remoteconfig(b5 < 0, c12014lArr2[(b5 >> 1) ^ (b5 >> 31)], c11644l, c0458l);
                        }
                        metrica(c11644l);
                        i2--;
                    }
                    metrica(c11644l);
                    metrica(c11644l);
                    AbstractC11397l.ad((int[]) c11644l.f23358l);
                    int[] iArr29 = (int[]) c11644l.f23357l;
                    AbstractC11397l.ad(iArr29);
                    int[] iArr30 = (int[]) c11644l.f23361l;
                    AbstractC11397l.ad(iArr30);
                    if (AbstractC11397l.subscription((int[]) c11644l.f23358l) != 0) {
                        if (!(AbstractC11397l.subscription(iArr29) != 0)) {
                            int i25 = 0;
                            for (int i26 = 0; i26 < 10; i26++) {
                                i25 |= iArr29[i26] ^ iArr30[i26];
                            }
                            if ((((i25 - 1) & (~i25)) >> 31) != 0) {
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

    public static void ads(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & 127);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
    }

    public static boolean amazon(byte[] bArr, boolean z, C10023l c10023l) {
        int i = (bArr[31] & 128) >>> 7;
        int[] iArr = (int[]) c10023l.f20418l;
        AbstractC11397l.smaato(0, 0, bArr, iArr);
        AbstractC11397l.smaato(16, 5, bArr, iArr);
        iArr[9] = iArr[9] & 16777215;
        int[] iArr2 = new int[10];
        int[] iArr3 = new int[10];
        AbstractC11397l.applovin(iArr, iArr2);
        AbstractC11397l.Signature(admob, iArr2, iArr3);
        iArr2[0] = iArr2[0] - 1;
        iArr3[0] = iArr3[0] + 1;
        int[] iArr4 = (int[]) c10023l.f20419l;
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        AbstractC11397l.Signature(iArr2, iArr3, iArr5);
        AbstractC11397l.applovin(iArr3, iArr6);
        AbstractC11397l.Signature(iArr5, iArr6, iArr5);
        AbstractC11397l.applovin(iArr6, iArr6);
        AbstractC11397l.Signature(iArr6, iArr5, iArr6);
        int[] iArr7 = new int[10];
        int[] iArr8 = new int[10];
        AbstractC11397l.applovin(iArr6, iArr7);
        AbstractC11397l.Signature(iArr6, iArr7, iArr7);
        int[] iArr9 = new int[10];
        AbstractC11397l.applovin(iArr7, iArr9);
        AbstractC11397l.Signature(iArr6, iArr9, iArr9);
        AbstractC11397l.premium(2, iArr9, iArr9);
        AbstractC11397l.Signature(iArr7, iArr9, iArr9);
        int[] iArr10 = new int[10];
        AbstractC11397l.premium(5, iArr9, iArr10);
        AbstractC11397l.Signature(iArr9, iArr10, iArr10);
        int[] iArr11 = new int[10];
        AbstractC11397l.premium(5, iArr10, iArr11);
        AbstractC11397l.Signature(iArr9, iArr11, iArr11);
        AbstractC11397l.premium(10, iArr11, iArr9);
        AbstractC11397l.Signature(iArr10, iArr9, iArr9);
        AbstractC11397l.premium(25, iArr9, iArr10);
        AbstractC11397l.Signature(iArr9, iArr10, iArr10);
        AbstractC11397l.premium(25, iArr10, iArr11);
        AbstractC11397l.Signature(iArr9, iArr11, iArr11);
        AbstractC11397l.premium(50, iArr11, iArr9);
        AbstractC11397l.Signature(iArr10, iArr9, iArr9);
        AbstractC11397l.premium(125, iArr9, iArr10);
        AbstractC11397l.Signature(iArr9, iArr10, iArr10);
        AbstractC11397l.premium(2, iArr10, iArr9);
        AbstractC11397l.Signature(iArr9, iArr6, iArr8);
        AbstractC11397l.Signature(iArr8, iArr5, iArr8);
        int[] iArr12 = new int[10];
        AbstractC11397l.applovin(iArr8, iArr12);
        AbstractC11397l.Signature(iArr12, iArr3, iArr12);
        AbstractC11397l.appmetrica(iArr12, iArr2, iArr7);
        AbstractC11397l.ad(iArr7);
        if (AbstractC11397l.subscription(iArr7) != 0) {
            AbstractC11397l.isPro(0, 0, iArr8, iArr4);
        } else {
            AbstractC11397l.purchase(iArr12, iArr2, iArr7);
            AbstractC11397l.ad(iArr7);
            if (AbstractC11397l.subscription(iArr7) == 0) {
                return false;
            }
            AbstractC11397l.Signature(iArr8, AbstractC11397l.loadAd, iArr4);
        }
        AbstractC11397l.ad(iArr4);
        if (i == 1 && AbstractC11397l.subscription(iArr4) != 0) {
            return false;
        }
        if (z ^ (i != (iArr4[0] & 1))) {
            AbstractC11397l.pro(iArr4, iArr4);
            AbstractC11397l.ad(iArr4);
        }
        return true;
    }

    public static C13161l billing(byte[] bArr) {
        C17711l c17711l = new C17711l();
        byte[] bArr2 = new byte[64];
        c17711l.update(bArr, 0, 32);
        c17711l.doFinal(bArr2, 0);
        byte[] bArr3 = new byte[32];
        ads(bArr2, bArr3);
        C11644l c11644l = new C11644l(14);
        Signature(bArr3, c11644l);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        AbstractC11397l.ads((int[]) c11644l.f23361l, iArr2);
        AbstractC11397l.Signature(iArr2, (int[]) c11644l.f23358l, iArr);
        AbstractC11397l.Signature(iArr2, (int[]) c11644l.f23357l, iArr2);
        AbstractC11397l.ad(iArr);
        AbstractC11397l.ad(iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        AbstractC11397l.applovin(iArr, iArr4);
        AbstractC11397l.applovin(iArr2, iArr5);
        AbstractC11397l.Signature(iArr4, iArr5, iArr3);
        AbstractC11397l.appmetrica(iArr4, iArr5, iArr4);
        AbstractC11397l.Signature(iArr3, admob, iArr3);
        iArr3[0] = iArr3[0] + 1;
        AbstractC11397l.purchase(iArr3, iArr4, iArr3);
        AbstractC11397l.ad(iArr3);
        AbstractC11397l.ad(iArr5);
        if ((AbstractC11397l.subscription(iArr3) & (~AbstractC11397l.subscription(iArr5))) == 0) {
            C18073l.admob();
            return null;
        }
        int[] iArr6 = new int[20];
        AbstractC11397l.isPro(0, 0, iArr, iArr6);
        AbstractC11397l.isPro(0, 10, iArr2, iArr6);
        return new C13161l(iArr6);
    }

    public static final void crashlytics(C8006l c8006l, C4623l c4623l) {
        List list = c4623l.f9392l;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC14782l abstractC14782l = (AbstractC14782l) list.get(i);
            if (abstractC14782l instanceof C3205l) {
                C1508l c1508l = new C1508l();
                C3205l c3205l = (C3205l) abstractC14782l;
                c1508l.amazon = c3205l.f6868l;
                c1508l.vip = true;
                c1508l.crashlytics();
                c1508l.subscription.isPro(c3205l.f6865l);
                c1508l.crashlytics();
                c1508l.crashlytics();
                c1508l.loadAd = c3205l.f6872l;
                c1508l.crashlytics();
                c1508l.crashlytics = c3205l.f6871l;
                c1508l.crashlytics();
                c1508l.mopub = c3205l.f6875l;
                c1508l.crashlytics();
                c1508l.purchase = c3205l.f6866l;
                c1508l.crashlytics();
                c1508l.billing = c3205l.f6867l;
                c1508l.metrica = true;
                c1508l.crashlytics();
                c1508l.admob = c3205l.f6874l;
                c1508l.metrica = true;
                c1508l.crashlytics();
                c1508l.subs = c3205l.f6870l;
                c1508l.metrica = true;
                c1508l.crashlytics();
                c1508l.isPro = c3205l.f6876l;
                c1508l.metrica = true;
                c1508l.crashlytics();
                c1508l.firebase = c3205l.f6873l;
                c1508l.startapp = true;
                c1508l.crashlytics();
                c1508l.smaato = c3205l.f6864l;
                c1508l.startapp = true;
                c1508l.crashlytics();
                c1508l.remoteconfig = c3205l.f6877l;
                c1508l.startapp = true;
                c1508l.crashlytics();
                c8006l.purchase(i, c1508l);
            } else if (abstractC14782l instanceof C4623l) {
                C8006l c8006l2 = new C8006l();
                C4623l c4623l2 = (C4623l) abstractC14782l;
                c8006l2.firebase = c4623l2.f9391l;
                c8006l2.crashlytics();
                c8006l2.smaato = c4623l2.f9390l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.metrica = c4623l2.f9393l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.startapp = c4623l2.f9396l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.adcel = c4623l2.f9388l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.ads = c4623l2.f9389l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.remoteconfig = c4623l2.f9387l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.vip = c4623l2.f9394l;
                c8006l2.subscription = true;
                c8006l2.crashlytics();
                c8006l2.billing = c4623l2.f9395l;
                c8006l2.mopub = true;
                c8006l2.crashlytics();
                crashlytics(c8006l2, c4623l2);
                c8006l.purchase(i, c8006l2);
            }
        }
    }

    public static void firebase(C10038l c10038l, C10038l c10038l2, C10038l c10038l3, C0458l c0458l) {
        int[] iArr = (int[]) c10038l3.f20463l;
        int[] iArr2 = (int[]) c10038l3.f20462l;
        int[] iArr3 = (int[]) c0458l.f1691l;
        int[] iArr4 = (int[]) c0458l.f1690l;
        AbstractC11397l.billing((int[]) c10038l.f20462l, (int[]) c10038l.f20463l, iArr2, iArr);
        AbstractC11397l.billing((int[]) c10038l2.f20462l, (int[]) c10038l2.f20463l, iArr4, iArr3);
        AbstractC11397l.Signature(iArr, iArr3, iArr);
        AbstractC11397l.Signature(iArr2, iArr4, iArr2);
        AbstractC11397l.Signature((int[]) c10038l.f20465l, (int[]) c10038l2.f20465l, iArr3);
        AbstractC11397l.Signature(iArr3, subs, iArr3);
        int[] iArr5 = (int[]) c10038l.f20466l;
        AbstractC11397l.purchase(iArr5, iArr5, iArr4);
        AbstractC11397l.Signature(iArr4, (int[]) c10038l2.f20466l, iArr4);
        AbstractC11397l.billing(iArr2, iArr, iArr2, iArr);
        AbstractC11397l.billing(iArr4, iArr3, iArr4, iArr3);
        AbstractC11397l.Signature(iArr, iArr2, (int[]) c10038l3.f20465l);
        AbstractC11397l.Signature(iArr3, iArr4, (int[]) c10038l3.f20466l);
        AbstractC11397l.Signature(iArr, iArr3, iArr);
        AbstractC11397l.Signature(iArr2, iArr4, iArr2);
    }

    public static String isPro(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        int length = encoded.length;
        AbstractC9334l.crashlytics(encoded.length, 0L, length);
        byte[] bArrInmobi = AbstractC8669l.inmobi(0, length, encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrInmobi, 0, bArrInmobi.length);
        sb.append(yandex.yandex(messageDigest.digest(), yandex.yandex));
        return sb.toString();
    }

    public static final C8195l loadAd(C12105l c12105l) {
        Charset charset = AbstractC9050l.yandex;
        Charset charsetYandex = C12105l.yandex(c12105l);
        if (charsetYandex == null) {
            try {
                c12105l = AbstractC0775l.m674strictfp(c12105l + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                c12105l = null;
            }
        } else {
            charset = charsetYandex;
        }
        return new C8195l(charset, c12105l);
    }

    public static void metrica(C11644l c11644l) {
        int[] iArr = (int[]) c11644l.f23358l;
        int[] iArr2 = (int[]) c11644l.f23357l;
        int[] iArr3 = (int[]) c11644l.f23361l;
        int[] iArr4 = (int[]) c11644l.f23360l;
        int[] iArr5 = (int[]) c11644l.f23362l;
        AbstractC11397l.purchase(iArr, iArr2, iArr4);
        AbstractC11397l.applovin(iArr, iArr);
        AbstractC11397l.applovin(iArr2, iArr2);
        AbstractC11397l.applovin(iArr3, iArr3);
        AbstractC11397l.purchase(iArr3, iArr3, iArr3);
        AbstractC11397l.billing(iArr, iArr2, iArr5, iArr2);
        AbstractC11397l.applovin(iArr4, iArr4);
        AbstractC11397l.appmetrica(iArr5, iArr4, iArr4);
        AbstractC11397l.purchase(iArr3, iArr2, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = ((i13 >> 25) * 38) + i;
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
        AbstractC11397l.Signature(iArr, iArr2, iArr3);
        AbstractC11397l.Signature(iArr, iArr4, iArr);
        AbstractC11397l.Signature(iArr2, iArr5, iArr2);
    }

    public static void mopub(byte[] bArr, byte[] bArr2, byte b, byte[] bArr3, int i, byte[] bArr4) {
        if (b != 0) {
            C8339l.metrica("ctx");
            return;
        }
        C17711l c17711l = new C17711l();
        byte[] bArr5 = new byte[64];
        c17711l.update(bArr, 0, 32);
        c17711l.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        ads(bArr5, bArr6);
        c17711l.update(bArr5, 32, 32);
        c17711l.update(bArr3, 0, i);
        c17711l.doFinal(bArr5, 0);
        byte[] bArrAdmob = AbstractC2219l.admob(bArr5);
        byte[] bArr7 = new byte[32];
        C11644l c11644l = new C11644l(14);
        Signature(bArrAdmob, c11644l);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        AbstractC11397l.ads((int[]) c11644l.f23361l, iArr2);
        AbstractC11397l.Signature(iArr2, (int[]) c11644l.f23358l, iArr);
        AbstractC11397l.Signature(iArr2, (int[]) c11644l.f23357l, iArr2);
        AbstractC11397l.ad(iArr);
        AbstractC11397l.ad(iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        AbstractC11397l.applovin(iArr, iArr4);
        AbstractC11397l.applovin(iArr2, iArr5);
        AbstractC11397l.Signature(iArr4, iArr5, iArr3);
        AbstractC11397l.appmetrica(iArr4, iArr5, iArr4);
        AbstractC11397l.Signature(iArr3, admob, iArr3);
        iArr3[0] = iArr3[0] + 1;
        AbstractC11397l.purchase(iArr3, iArr4, iArr3);
        AbstractC11397l.ad(iArr3);
        AbstractC11397l.ad(iArr5);
        int iSubscription = AbstractC11397l.subscription(iArr3) & (~AbstractC11397l.subscription(iArr5));
        AbstractC11397l.metrica(0, 0, bArr7, iArr2);
        AbstractC11397l.metrica(5, 16, bArr7, iArr2);
        bArr7[31] = (byte) (((iArr[0] & 1) << 7) | bArr7[31]);
        if (iSubscription == 0) {
            C18073l.admob();
            return;
        }
        c17711l.update(bArr7, 0, 32);
        c17711l.update(bArr2, 0, 32);
        c17711l.update(bArr3, 0, i);
        c17711l.doFinal(bArr5, 0);
        byte[] bArrAdmob2 = AbstractC2219l.admob(bArr5);
        int[] iArr6 = new int[16];
        AbstractC2219l.amazon(bArrAdmob, iArr6);
        int[] iArr7 = new int[8];
        AbstractC2219l.amazon(bArrAdmob2, iArr7);
        int[] iArr8 = new int[8];
        AbstractC2219l.amazon(bArr6, iArr8);
        AbstractC5998l.Signature(iArr7, iArr8, iArr6);
        byte[] bArr8 = new byte[64];
        AbstractC16655l.billing(16, bArr8, iArr6);
        byte[] bArrAdmob3 = AbstractC2219l.admob(bArr8);
        System.arraycopy(bArr7, 0, bArr4, 0, 32);
        System.arraycopy(bArrAdmob3, 0, bArr4, 32, 32);
    }

    public static void purchase(C13161l c13161l, byte[] bArr, int i) {
        int[] iArr = (int[]) c13161l.f25776l;
        AbstractC11397l.metrica(10, i, bArr, iArr);
        AbstractC11397l.metrica(15, i + 16, bArr, iArr);
        int i2 = i + 31;
        bArr[i2] = (byte) (((((int[]) c13161l.f25776l)[0] & 1) << 7) | bArr[i2]);
    }

    public static void remoteconfig(boolean z, C12014l c12014l, C11644l c11644l, C0458l c0458l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) c11644l.f23358l;
        int[] iArr4 = (int[]) c11644l.f23357l;
        int[] iArr5 = (int[]) c0458l.f1691l;
        int[] iArr6 = (int[]) c11644l.f23361l;
        int[] iArr7 = (int[]) c11644l.f23360l;
        int[] iArr8 = (int[]) c11644l.f23362l;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        AbstractC11397l.billing(iArr4, iArr3, iArr4, iArr3);
        AbstractC11397l.Signature(iArr, (int[]) c12014l.f23941l, iArr);
        AbstractC11397l.Signature(iArr2, (int[]) c12014l.f23940l, iArr2);
        AbstractC11397l.Signature(iArr7, iArr8, iArr5);
        AbstractC11397l.Signature(iArr5, (int[]) c12014l.f23944l, iArr5);
        AbstractC11397l.Signature(iArr6, (int[]) c12014l.f23943l, iArr6);
        AbstractC11397l.billing(iArr4, iArr3, iArr8, iArr7);
        AbstractC11397l.billing(iArr6, iArr5, iArr2, iArr);
        AbstractC11397l.Signature(iArr3, iArr4, iArr6);
        AbstractC11397l.Signature(iArr3, iArr7, iArr3);
        AbstractC11397l.Signature(iArr4, iArr8, iArr4);
    }

    public static void smaato(boolean z, C0554l c0554l, C11644l c11644l, C0458l c0458l) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = (int[]) c11644l.f23358l;
        int[] iArr4 = (int[]) c11644l.f23361l;
        int[] iArr5 = (int[]) c11644l.f23357l;
        int[] iArr6 = (int[]) c0458l.f1691l;
        int[] iArr7 = (int[]) c11644l.f23360l;
        int[] iArr8 = (int[]) c11644l.f23362l;
        if (z) {
            iArr2 = iArr3;
            iArr = iArr5;
        } else {
            iArr = iArr3;
            iArr2 = iArr5;
        }
        AbstractC11397l.billing(iArr5, iArr3, iArr5, iArr3);
        AbstractC11397l.Signature(iArr, (int[]) c0554l.f1958l, iArr);
        AbstractC11397l.Signature(iArr2, (int[]) c0554l.f1957l, iArr2);
        AbstractC11397l.Signature(iArr7, iArr8, iArr6);
        AbstractC11397l.Signature(iArr6, (int[]) c0554l.f1956l, iArr6);
        AbstractC11397l.billing(iArr5, iArr3, iArr8, iArr7);
        AbstractC11397l.billing(iArr4, iArr6, iArr2, iArr);
        AbstractC11397l.Signature(iArr3, iArr5, iArr4);
        AbstractC11397l.Signature(iArr3, iArr7, iArr3);
        AbstractC11397l.Signature(iArr5, iArr8, iArr5);
    }

    public static void startapp(C10023l c10023l, C12014l[] c12014lArr, C0458l c0458l) {
        int i = 12;
        C10038l c10038l = new C10038l(12);
        int[] iArr = (int[]) c10023l.f20419l;
        boolean z = false;
        AbstractC11397l.isPro(0, 0, iArr, (int[]) c10038l.f20463l);
        int[] iArr2 = (int[]) c10023l.f20418l;
        AbstractC11397l.isPro(0, 0, iArr2, (int[]) c10038l.f20462l);
        AbstractC11397l.advert((int[]) c10038l.f20466l);
        AbstractC11397l.Signature(iArr, iArr2, (int[]) c10038l.f20465l);
        C10038l c10038l2 = new C10038l(12);
        firebase(c10038l, c10038l, c10038l2, c0458l);
        int i2 = 0;
        while (true) {
            C12014l c12014l = new C12014l(i, z);
            int[] iArr3 = new int[10];
            c12014l.f23941l = iArr3;
            int[] iArr4 = new int[10];
            c12014l.f23940l = iArr4;
            int[] iArr5 = new int[10];
            c12014l.f23944l = iArr5;
            int[] iArr6 = new int[10];
            c12014l.f23943l = iArr6;
            AbstractC11397l.billing((int[]) c10038l.f20462l, (int[]) c10038l.f20463l, iArr4, iArr3);
            AbstractC11397l.Signature((int[]) c10038l.f20465l, subs, iArr5);
            int[] iArr7 = (int[]) c10038l.f20466l;
            AbstractC11397l.purchase(iArr7, iArr7, iArr6);
            c12014lArr[i2] = c12014l;
            i2++;
            if (i2 == 4) {
                return;
            } else {
                firebase(c10038l, c10038l2, c10038l, c0458l);
            }
        }
    }

    public static void subs(C10038l[] c10038lArr) {
        int length = c10038lArr.length;
        int[] iArr = new int[length * 10];
        int[] iArr2 = new int[10];
        AbstractC11397l.isPro(0, 0, (int[]) c10038lArr[0].f20466l, iArr2);
        AbstractC11397l.isPro(0, 0, iArr2, iArr);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 >= length) {
                break;
            }
            AbstractC11397l.Signature(iArr2, (int[]) c10038lArr[i2].f20466l, iArr2);
            AbstractC11397l.isPro(0, i2 * 10, iArr2, iArr);
            i = i2;
        }
        AbstractC11397l.purchase(iArr2, iArr2, iArr2);
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[8];
        AbstractC11397l.isPro(0, 0, iArr2, iArr3);
        AbstractC11397l.ad(iArr3);
        AbstractC11397l.startapp(0, 0, iArr3, iArr4);
        AbstractC11397l.startapp(5, 4, iArr3, iArr4);
        AbstractC6974l.vip(AbstractC11397l.yandex, iArr4, iArr4);
        AbstractC11397l.remoteconfig(0, 0, iArr4, iArr2);
        AbstractC11397l.remoteconfig(4, 5, iArr4, iArr2);
        iArr2[9] = iArr2[9] & 16777215;
        int[] iArr5 = new int[10];
        while (i > 0) {
            int i3 = i - 1;
            AbstractC11397l.isPro(i3 * 10, 0, iArr, iArr5);
            AbstractC11397l.Signature(iArr5, iArr2, iArr5);
            AbstractC11397l.Signature(iArr2, (int[]) c10038lArr[i].f20466l, iArr2);
            AbstractC11397l.isPro(0, 0, iArr5, (int[]) c10038lArr[i].f20466l);
            i = i3;
        }
        AbstractC11397l.isPro(0, 0, iArr2, (int[]) c10038lArr[0].f20466l);
    }

    public static final C13492l subscription(String str, Object[] objArr, Function1 function1, C6956l c6956l) {
        boolean zBilling = c6956l.billing(objArr);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            C18396l c18396l = new C18396l(14);
            InterfaceC1519l.f3792l.getClass();
            C3316l c3316l = C4887l.loadAd;
            InterfaceC3538l.f7432l.getClass();
            c18396l.f35934l = new C2891l(C12898l.yandex, c3316l, c3316l, C10560l.loadAd, C17411l.yandex, true);
            InterfaceC6407l.yandex.getClass();
            C10773l c10773l = C8298l.crashlytics;
            C10773l c10773l2 = C8298l.loadAd;
            c18396l.f35933l = new C0820l(c10773l, c10773l2, c10773l2, c10773l2);
            C11775l c11775l = new C11775l();
            C4292l c4292l = new C4292l();
            function1.invoke(new C6099l(c18396l));
            Object c2549l = new C2549l((C2891l) c18396l.f35934l, (C0820l) c18396l.f35933l, c11775l, c4292l, 1.0f);
            c6956l.m2147try(c2549l);
            objM2132native = c2549l;
        }
        C2549l c2549l2 = (C2549l) objM2132native;
        boolean zBilling2 = c6956l.billing(str) | c6956l.billing(c2549l2);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling2 || objM2132native2 == obj) {
            objM2132native2 = new C13492l(str, c2549l2);
            c6956l.m2147try(objM2132native2);
        }
        return (C13492l) objM2132native2;
    }

    public static final C3408l tapsense(C5197l c5197l, C6956l c6956l) {
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        boolean zPurchase = c6956l.purchase((((long) Float.floatToRawIntBits(interfaceC13490l.loadAd())) & 4294967295L) | (((long) Float.floatToRawIntBits(c5197l.isPro)) << 32));
        Object objM2132native = c6956l.m2132native();
        if (zPurchase || objM2132native == C1867l.yandex) {
            C8006l c8006l = new C8006l();
            crashlytics(c8006l, c5197l.billing);
            Unit unit = Unit.INSTANCE;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC13490l.mo868instanceof(c5197l.loadAd))) << 32) | (((long) Float.floatToRawIntBits(interfaceC13490l.mo868instanceof(c5197l.crashlytics))) & 4294967295L);
            float fIntBitsToFloat = c5197l.amazon;
            float fIntBitsToFloat2 = c5197l.purchase;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            C3408l c3408l = new C3408l(c8006l);
            String str = c5197l.yandex;
            long j = c5197l.mopub;
            C0534l c0534l = j != 16 ? new C0534l(j, c5197l.admob) : null;
            boolean z = c5197l.subs;
            c3408l.f7261l.setValue(new C14174l(jFloatToRawIntBits));
            c3408l.f7257l.setValue(Boolean.valueOf(z));
            C12136l c12136l = c3408l.f7258l;
            c12136l.mopub.setValue(c0534l);
            c12136l.subs.setValue(new C14174l(jFloatToRawIntBits2));
            c12136l.crashlytics = str;
            c6956l.m2147try(c3408l);
            objM2132native = c3408l;
        }
        return (C3408l) objM2132native;
    }

    public static void vip(C11644l c11644l, C10038l c10038l) {
        AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23358l, (int[]) c10038l.f20463l);
        AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23357l, (int[]) c10038l.f20462l);
        AbstractC11397l.isPro(0, 0, (int[]) c11644l.f23361l, (int[]) c10038l.f20466l);
        AbstractC11397l.Signature((int[]) c11644l.f23360l, (int[]) c11644l.f23362l, (int[]) c10038l.f20465l);
    }

    public static final C4565l yandex(int i) {
        if (i == 0) {
            return new C4565l(47, true, true);
        }
        if (i == 1) {
            return new C4565l(155, false, false);
        }
        if (i == 2) {
            return new C4565l(229, false, false);
        }
        if (i == 3) {
            return new C4565l(242, false, false);
        }
        C8339l.smaato(AbstractC0653l.vip(i, "Incorrect eye number: "));
        return null;
    }
}
