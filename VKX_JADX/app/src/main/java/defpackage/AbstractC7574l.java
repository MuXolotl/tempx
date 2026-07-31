package defpackage;

import android.net.Uri;
import androidx.car.app.model.Alert;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚّۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7574l {
    public static final int[] yandex = {-4553, -2, -1, -1, -1, -1};
    public static final int[] loadAd = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] crashlytics = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void admob(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC0079l.tapsense(iArr, iArr3);
        purchase(iArr3, iArr2);
    }

    public static void amazon(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC0079l.ads(iArr, iArr2, iArr4);
        purchase(iArr4, iArr3);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void billing(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[5] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? AbstractC4952l.Signature(6, 3, iArr) : 0) == 0) {
            if (iArr[5] == -1 || !AbstractC0079l.vip(iArr, yandex)) {
                return;
            }
        }
        AbstractC4952l.amazon(6, 4553, iArr);
    }

    public static final C2427l crashlytics(C3346l c3346l, String str) {
        String string;
        String str2;
        int i = c3346l.yandex;
        long j = c3346l.loadAd;
        String str3 = c3346l.amazon;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        String str4 = c3346l.advert;
        if (str4 == null || str4.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) String.valueOf(j));
            sb.append('_');
            sb.append(i);
            string = sb.toString();
        } else {
            string = ((Object) String.valueOf(j)) + '_' + i + '_' + str4;
        }
        String strConcat = "ext:playlist:".concat(string);
        C3117l c3117l = new C3117l();
        c3117l.yandex = str3;
        List list2 = c3346l.inmobi;
        Uri uri = null;
        c3117l.billing = list2 != null ? AbstractC16901l.m4210case(list2, ",", null, null, new C4100l(26), 30) : null;
        C8206l c8206l = c3346l.tapsense;
        if (c8206l != null && (str2 = c8206l.mopub) != null) {
            uri = Uri.parse(str2);
        }
        c3117l.vip = uri;
        c3117l.f6662synchronized = 13;
        c3117l.subscription = Boolean.TRUE;
        c3117l.ads = Boolean.FALSE;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str3));
        return new C2427l(strConcat, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }

    public static boolean firebase(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void isPro(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC0079l.Signature(iArr, iArr2, iArr3) != 0) {
            AbstractC4952l.m1653throws(6, 4553, iArr3);
        }
    }

    public static final C2427l loadAd(C6388l c6388l) {
        String str = c6388l.yandex;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        String str2 = c6388l.crashlytics;
        if (str2 == null) {
            str2 = "";
        }
        String strConcat = "ext:artist:".concat(str2);
        C3117l c3117l = new C3117l();
        c3117l.yandex = str;
        c3117l.f6662synchronized = 13;
        c3117l.subscription = Boolean.TRUE;
        c3117l.ads = Boolean.FALSE;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", "Исполнители"), new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str));
        return new C2427l(strConcat, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }

    public static final InterfaceC17242l mopub(float f) {
        C4346l c4346l = C4346l.f8873l;
        return (f == 1.0f && f == 1.0f) ? c4346l : AbstractC7477l.crashlytics(c4346l, f, f, 0.0f, 0.0f, 0.0f, null, false, 1048572);
    }

    public static void purchase(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = (4553 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[8]) & 4294967295L;
        long j6 = (4553 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[9]) & 4294967295L;
        long j8 = (4553 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[10]) & 4294967295L;
        long j10 = (4553 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = (4553 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = (j12 >>> 32) + j11;
        long j14 = j13 & 4294967295L;
        long j15 = (4553 * j14) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = j13 >>> 32;
        long j17 = (4553 * j16) + j14 + (((long) i2) & 4294967295L) + (j15 >>> 32);
        iArr2[1] = (int) j17;
        long j18 = j16 + (((long) i3) & 4294967295L) + (j17 >>> 32);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j19;
        if (((j19 >>> 32) == 0 ? 0 : AbstractC4952l.Signature(6, 4, iArr2)) != 0 || (iArr2[5] == -1 && AbstractC0079l.vip(iArr2, yandex))) {
            AbstractC4952l.amazon(6, 4553, iArr2);
        }
    }

    public static void subs(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC0079l.tapsense(iArr, iArr3);
        while (true) {
            purchase(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC0079l.tapsense(iArr2, iArr3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191  */
    /* JADX WARN: Code duplicated, block: B:136:0x0195  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019c  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:155:0x022e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0234  */
    /* JADX WARN: Code duplicated, block: B:163:0x0246  */
    /* JADX WARN: Code duplicated, block: B:165:0x024c  */
    /* JADX WARN: Code duplicated, block: B:171:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x025d  */
    /* JADX WARN: Code duplicated, block: B:175:0x026e  */
    /* JADX WARN: Code duplicated, block: B:178:0x028f  */
    /* JADX WARN: Code duplicated, block: B:181:0x02be  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:191:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:205:0x030d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0313  */
    /* JADX WARN: Code duplicated, block: B:213:0x032e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0334  */
    /* JADX WARN: Code duplicated, block: B:221:0x0348  */
    /* JADX WARN: Code duplicated, block: B:223:0x034e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0362  */
    /* JADX WARN: Code duplicated, block: B:231:0x0368  */
    /* JADX WARN: Code duplicated, block: B:237:0x037c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0382  */
    /* JADX WARN: Code duplicated, block: B:245:0x039c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x039e  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:255:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:257:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:259:0x03df  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:270:0x040d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0450  */
    /* JADX WARN: Code duplicated, block: B:275:0x045e  */
    /* JADX WARN: Code duplicated, block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x0169, please report this as an issue */
    public static final void yandex(InterfaceC17242l interfaceC17242l, C5866l c5866l, InterfaceC11780l interfaceC11780l, boolean z, InterfaceC14745l interfaceC14745l, boolean z2, C10306l c10306l, InterfaceC6947l interfaceC6947l, InterfaceC3501l interfaceC3501l, C0086l c0086l, InterfaceC5404l interfaceC5404l, Function1 function1, C6956l c6956l, int i, int i2, int i3) {
        int i4;
        InterfaceC6947l interfaceC6947l2;
        InterfaceC3501l interfaceC3501l2;
        int i5;
        boolean z3;
        C5866l c5866l2;
        C0086l c0086l2;
        C4224l c4224lAds;
        int i6;
        C0086l c0086l3;
        C0086l c0086l4;
        InterfaceC3501l interfaceC3501l3;
        InterfaceC6947l interfaceC6947l3;
        int i7;
        InterfaceC8714l interfaceC8714lVip;
        boolean z4;
        Object objM2132native;
        Object obj;
        InterfaceC2901l interfaceC2901l;
        boolean z5;
        Object objM2132native2;
        Object objM2132native3;
        InterfaceC2262l interfaceC2262l;
        InterfaceC3685l interfaceC3685l;
        C13975l c13975l;
        boolean zAmazon;
        Object objM2132native4;
        Object obj2;
        int i8;
        InterfaceC2901l interfaceC2901l2;
        EnumC7283l enumC7283l;
        EnumC7283l enumC7283l2;
        InterfaceC17242l interfaceC17242lSubs;
        boolean zAmazon2;
        Object objM2132native5;
        c6956l.m2133new(924924659);
        if ((i & 6) == 0) {
            i4 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c6956l.billing(c5866l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= c6956l.billing(interfaceC11780l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= c6956l.mopub(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= c6956l.mopub(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= c6956l.billing(interfaceC14745l) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= c6956l.mopub(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= c6956l.billing(c10306l) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= 33554432;
        }
        int i9 = i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        if (i9 != 0) {
            i4 |= 805306368;
            interfaceC6947l2 = interfaceC6947l;
        } else {
            interfaceC6947l2 = interfaceC6947l;
            if ((i & 805306368) == 0) {
                i4 |= c6956l.billing(interfaceC6947l2) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
            interfaceC3501l2 = interfaceC3501l;
        } else {
            interfaceC3501l2 = interfaceC3501l;
            if ((i2 & 6) == 0) {
                i5 = i2 | (c6956l.billing(interfaceC3501l2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i11 = i4;
        int i12 = i3 & 2048;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= c6956l.billing(c0086l) ? 32 : 16;
        }
        int i13 = i5;
        int i14 = i3 & 4096;
        if (i14 == 0) {
            if ((i2 & 384) == 0) {
                i13 |= c6956l.billing(interfaceC5404l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i2 & 3072) != 0) {
                i13 |= c6956l.admob(function1) ? 2048 : 1024;
            }
            if ((i11 & 306783379) == 306783378 || (i13 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i11 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    i6 = i11 & (-234881025);
                    if (i9 != 0) {
                        interfaceC6947l2 = null;
                    }
                    if (i10 != 0) {
                        interfaceC3501l2 = null;
                    }
                    if (i12 != 0) {
                        c0086l3 = null;
                    } else {
                        c0086l3 = c0086l;
                    }
                    if (i14 != 0) {
                        c0086l4 = c0086l3;
                        interfaceC3501l3 = interfaceC3501l2;
                        interfaceC6947l3 = interfaceC6947l2;
                        interfaceC5404l = null;
                    } else {
                        c0086l4 = c0086l3;
                    }
                    c6956l.adcel();
                    i7 = i6 >> 3;
                    int i15 = i7 & 14;
                    int i16 = ((i13 >> 6) & 112) | i15;
                    int i17 = i6;
                    interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
                    int i18 = i13;
                    z4 = (((i16 & 14) ^ 6) <= 4 && c6956l.billing(c5866l)) || (i16 & 6) == 4;
                    objM2132native = c6956l.m2132native();
                    obj = C1867l.yandex;
                    if (z4 || objM2132native == obj) {
                        C7091l c7091l = new C7091l();
                        c7091l.yandex = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                        c7091l.loadAd = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                        C1461l c1461l = C1461l.f3659l;
                        objM2132native = new C0059l(0, 6, InterfaceC12244l.class, AbstractC8020l.billing(c1461l, new Cfinally(AbstractC8020l.billing(c1461l, new C0289l(interfaceC8714lVip, 20)), c5866l, c7091l, 18)), "value", "getValue()Ljava/lang/Object;");
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC2901l = (InterfaceC2901l) objM2132native;
                    int i19 = i17 >> 9;
                    int i20 = i15 | (i19 & 112);
                    z5 = ((((i20 & 112) ^ 48) <= 32 && c6956l.mopub(z)) || (i20 & 48) == 32) | ((((i20 & 14) ^ 6) <= 4 && c6956l.billing(c5866l)) || (i20 & 6) == 4);
                    objM2132native2 = c6956l.m2132native();
                    if (z5 || objM2132native2 == obj) {
                        objM2132native2 = new C4373l(c5866l, z);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC14371l interfaceC14371l = (InterfaceC14371l) objM2132native2;
                    objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == obj) {
                        objM2132native3 = AbstractC12311l.isPro(c6956l);
                        c6956l.m2147try(objM2132native3);
                    }
                    interfaceC2262l = (InterfaceC2262l) objM2132native3;
                    interfaceC3685l = (InterfaceC3685l) c6956l.isPro(AbstractC4751l.mopub);
                    c13975l = ((Boolean) c6956l.isPro(AbstractC4751l.ad)).booleanValue() ? null : C17926l.yandex;
                    int i21 = i18 << 18;
                    int i22 = (i17 & 65520) | (i19 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | ((i18 << 27) & 1879048192);
                    zAmazon = ((((i22 & 112) ^ 48) <= 32 && c6956l.billing(c5866l)) || (i22 & 48) == 32) | ((((i22 & 896) ^ 384) <= 256 && c6956l.billing(interfaceC11780l)) || (i22 & 384) == 256) | ((((i22 & 7168) ^ 3072) <= 2048 && c6956l.mopub(false)) || (i22 & 3072) == 2048) | ((((57344 & i22) ^ 24576) <= 16384 && c6956l.mopub(z)) || (i22 & 24576) == 16384) | c6956l.amazon(0) | ((((i22 & 3670016) ^ 1572864) <= 1048576 && c6956l.billing(interfaceC6947l3)) || (i22 & 1572864) == 1048576) | ((((i22 & 29360128) ^ 12582912) <= 8388608 && c6956l.billing(c0086l4)) || (i22 & 12582912) == 8388608) | ((((i22 & 234881024) ^ 100663296) <= 67108864 && c6956l.billing(interfaceC5404l)) || (i22 & 100663296) == 67108864) | ((((i22 & 1879048192) ^ 805306368) <= 536870912 && c6956l.billing(interfaceC3501l3)) || (i22 & 805306368) == 536870912) | c6956l.billing(interfaceC3685l) | c6956l.billing(c13975l);
                    objM2132native4 = c6956l.m2132native();
                    if (!zAmazon || objM2132native4 == obj) {
                        obj2 = obj;
                        i8 = 4;
                        Object c4591l = new C4591l(c5866l, z, interfaceC11780l, interfaceC2901l, interfaceC3501l3, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l, interfaceC6947l3, c0086l4);
                        interfaceC2901l2 = interfaceC2901l;
                        c6956l.m2147try(c4591l);
                        objM2132native4 = c4591l;
                    } else {
                        obj2 = obj;
                        i8 = 4;
                        interfaceC2901l2 = interfaceC2901l;
                    }
                    InterfaceC2948l interfaceC2948l = (InterfaceC2948l) objM2132native4;
                    if (z) {
                        enumC7283l = EnumC7283l.f15126l;
                    } else {
                        enumC7283l = EnumC7283l.f15125l;
                    }
                    enumC7283l2 = enumC7283l;
                    if (z2) {
                        c6956l.m2123default(-2077147368);
                        zAmazon2 = c6956l.amazon(0) | ((((i7 & 14) ^ 6) <= i8 && c6956l.billing(c5866l)) || (i7 & 6) == i8);
                        objM2132native5 = c6956l.m2132native();
                        if (zAmazon2 || objM2132native5 == obj2) {
                            objM2132native5 = new C9213l(c5866l);
                            c6956l.m2147try(objM2132native5);
                        }
                        interfaceC17242lSubs = AbstractC10565l.subs((C9213l) objM2132native5, c5866l.startapp, enumC7283l2);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-2076718545);
                        c6956l.startapp(false);
                        interfaceC17242lSubs = C4346l.f8873l;
                    }
                    c5866l2 = c5866l;
                    AbstractC18377l.yandex(interfaceC2901l2, AbstractC18377l.amazon(AbstractC0019l.billing(AbstractC2648l.purchase(interfaceC17242l.premium(c5866l.remoteconfig).premium(c5866l.vip), interfaceC2901l2, interfaceC14371l, enumC7283l2, z2).premium(interfaceC17242lSubs), c5866l.metrica), c5866l, enumC7283l2, c10306l, z2, interfaceC14745l, c5866l.mopub, null), c5866l2.adcel, interfaceC2948l, c6956l, 0);
                    interfaceC3501l2 = interfaceC3501l3;
                    interfaceC6947l2 = interfaceC6947l3;
                    c0086l2 = c0086l4;
                } else {
                    c6956l.m2124else();
                    i6 = i11 & (-234881025);
                    c0086l4 = c0086l;
                }
                interfaceC3501l3 = interfaceC3501l2;
                interfaceC6947l3 = interfaceC6947l2;
                c6956l.adcel();
                i7 = i6 >> 3;
                int i110 = i7 & 14;
                int i111 = ((i13 >> 6) & 112) | i110;
                int i112 = i6;
                interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
                int i113 = i13;
                if (((i111 & 14) ^ 6) <= 4) {
                }
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                if (z4) {
                    C7091l c7091l2 = new C7091l();
                    c7091l2.yandex = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                    c7091l2.loadAd = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                    C1461l c1461l2 = C1461l.f3659l;
                    objM2132native = new C0059l(0, 6, InterfaceC12244l.class, AbstractC8020l.billing(c1461l2, new Cfinally(AbstractC8020l.billing(c1461l2, new C0289l(interfaceC8714lVip, 20)), c5866l, c7091l2, 18)), "value", "getValue()Ljava/lang/Object;");
                    c6956l.m2147try(objM2132native);
                } else {
                    C7091l c7091l3 = new C7091l();
                    c7091l3.yandex = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                    c7091l3.loadAd = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                    C1461l c1461l3 = C1461l.f3659l;
                    objM2132native = new C0059l(0, 6, InterfaceC12244l.class, AbstractC8020l.billing(c1461l3, new Cfinally(AbstractC8020l.billing(c1461l3, new C0289l(interfaceC8714lVip, 20)), c5866l, c7091l3, 18)), "value", "getValue()Ljava/lang/Object;");
                    c6956l.m2147try(objM2132native);
                }
                interfaceC2901l = (InterfaceC2901l) objM2132native;
                int i114 = i112 >> 9;
                int i23 = i110 | (i114 & 112);
                z5 = ((((i23 & 112) ^ 48) <= 32 && c6956l.mopub(z)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) <= 4 && c6956l.billing(c5866l)) || (i23 & 6) == 4);
                objM2132native2 = c6956l.m2132native();
                if (z5) {
                    objM2132native2 = new C4373l(c5866l, z);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C4373l(c5866l, z);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC14371l interfaceC14371l2 = (InterfaceC14371l) objM2132native2;
                objM2132native3 = c6956l.m2132native();
                if (objM2132native3 == obj) {
                    objM2132native3 = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native3);
                }
                interfaceC2262l = (InterfaceC2262l) objM2132native3;
                interfaceC3685l = (InterfaceC3685l) c6956l.isPro(AbstractC4751l.mopub);
                c13975l = ((Boolean) c6956l.isPro(AbstractC4751l.ad)).booleanValue() ? null : C17926l.yandex;
                int i24 = i113 << 18;
                int i25 = (i112 & 65520) | (i114 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | ((i113 << 27) & 1879048192);
                zAmazon = ((((i25 & 112) ^ 48) <= 32 && c6956l.billing(c5866l)) || (i25 & 48) == 32) | ((((i25 & 896) ^ 384) <= 256 && c6956l.billing(interfaceC11780l)) || (i25 & 384) == 256) | ((((i25 & 7168) ^ 3072) <= 2048 && c6956l.mopub(false)) || (i25 & 3072) == 2048) | ((((57344 & i25) ^ 24576) <= 16384 && c6956l.mopub(z)) || (i25 & 24576) == 16384) | c6956l.amazon(0) | ((((i25 & 3670016) ^ 1572864) <= 1048576 && c6956l.billing(interfaceC6947l3)) || (i25 & 1572864) == 1048576) | ((((i25 & 29360128) ^ 12582912) <= 8388608 && c6956l.billing(c0086l4)) || (i25 & 12582912) == 8388608) | ((((i25 & 234881024) ^ 100663296) <= 67108864 && c6956l.billing(interfaceC5404l)) || (i25 & 100663296) == 67108864) | ((((i25 & 1879048192) ^ 805306368) <= 536870912 && c6956l.billing(interfaceC3501l3)) || (i25 & 805306368) == 536870912) | c6956l.billing(interfaceC3685l) | c6956l.billing(c13975l);
                objM2132native4 = c6956l.m2132native();
                if (zAmazon) {
                    obj2 = obj;
                    i8 = 4;
                    Object c4591l2 = new C4591l(c5866l, z, interfaceC11780l, interfaceC2901l, interfaceC3501l3, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l, interfaceC6947l3, c0086l4);
                    interfaceC2901l2 = interfaceC2901l;
                    c6956l.m2147try(c4591l2);
                    objM2132native4 = c4591l2;
                } else {
                    obj2 = obj;
                    i8 = 4;
                    Object c4591l3 = new C4591l(c5866l, z, interfaceC11780l, interfaceC2901l, interfaceC3501l3, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l, interfaceC6947l3, c0086l4);
                    interfaceC2901l2 = interfaceC2901l;
                    c6956l.m2147try(c4591l3);
                    objM2132native4 = c4591l3;
                }
                InterfaceC2948l interfaceC2948l2 = (InterfaceC2948l) objM2132native4;
                if (z) {
                    enumC7283l = EnumC7283l.f15126l;
                } else {
                    enumC7283l = EnumC7283l.f15125l;
                }
                enumC7283l2 = enumC7283l;
                if (z2) {
                    c6956l.m2123default(-2077147368);
                    zAmazon2 = c6956l.amazon(0) | ((((i7 & 14) ^ 6) <= i8 && c6956l.billing(c5866l)) || (i7 & 6) == i8);
                    objM2132native5 = c6956l.m2132native();
                    if (zAmazon2) {
                        objM2132native5 = new C9213l(c5866l);
                        c6956l.m2147try(objM2132native5);
                    } else {
                        objM2132native5 = new C9213l(c5866l);
                        c6956l.m2147try(objM2132native5);
                    }
                    interfaceC17242lSubs = AbstractC10565l.subs((C9213l) objM2132native5, c5866l.startapp, enumC7283l2);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-2076718545);
                    c6956l.startapp(false);
                    interfaceC17242lSubs = C4346l.f8873l;
                }
                c5866l2 = c5866l;
                AbstractC18377l.yandex(interfaceC2901l2, AbstractC18377l.amazon(AbstractC0019l.billing(AbstractC2648l.purchase(interfaceC17242l.premium(c5866l.remoteconfig).premium(c5866l.vip), interfaceC2901l2, interfaceC14371l2, enumC7283l2, z2).premium(interfaceC17242lSubs), c5866l.metrica), c5866l, enumC7283l2, c10306l, z2, interfaceC14745l, c5866l.mopub, null), c5866l2.adcel, interfaceC2948l2, c6956l, 0);
                interfaceC3501l2 = interfaceC3501l3;
                interfaceC6947l2 = interfaceC6947l3;
                c0086l2 = c0086l4;
            } else {
                c5866l2 = c5866l;
                c6956l.m2124else();
                c0086l2 = c0086l;
                interfaceC5404l = interfaceC5404l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C12746l(interfaceC17242l, c5866l2, interfaceC11780l, z, interfaceC14745l, z2, c10306l, interfaceC6947l2, interfaceC3501l2, c0086l2, interfaceC5404l, function1, i, i2, i3);
            }
        }
        i13 |= 384;
        if ((i2 & 3072) != 0) {
            i13 |= c6956l.admob(function1) ? 2048 : 1024;
        }
        if ((i11 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (c6956l.m2127for(i11 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                i6 = i11 & (-234881025);
                if (i9 != 0) {
                    interfaceC6947l2 = null;
                }
                if (i10 != 0) {
                    interfaceC3501l2 = null;
                }
                if (i12 != 0) {
                    c0086l3 = null;
                } else {
                    c0086l3 = c0086l;
                }
                if (i14 != 0) {
                    c0086l4 = c0086l3;
                    interfaceC3501l3 = interfaceC3501l2;
                    interfaceC6947l3 = interfaceC6947l2;
                    interfaceC5404l = null;
                } else {
                    c0086l4 = c0086l3;
                    interfaceC3501l3 = interfaceC3501l2;
                    interfaceC6947l3 = interfaceC6947l2;
                }
            } else {
                i6 = i11 & (-234881025);
                if (i9 != 0) {
                    interfaceC6947l2 = null;
                }
                if (i10 != 0) {
                    interfaceC3501l2 = null;
                }
                if (i12 != 0) {
                    c0086l3 = null;
                } else {
                    c0086l3 = c0086l;
                }
                if (i14 != 0) {
                    c0086l4 = c0086l3;
                    interfaceC3501l3 = interfaceC3501l2;
                    interfaceC6947l3 = interfaceC6947l2;
                    interfaceC5404l = null;
                } else {
                    c0086l4 = c0086l3;
                    interfaceC3501l3 = interfaceC3501l2;
                    interfaceC6947l3 = interfaceC6947l2;
                }
            }
            c6956l.adcel();
            i7 = i6 >> 3;
            int i115 = i7 & 14;
            int i116 = ((i13 >> 6) & 112) | i115;
            int i117 = i6;
            interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
            int i118 = i13;
            if (((i116 & 14) ^ 6) <= 4) {
            }
            objM2132native = c6956l.m2132native();
            obj = C1867l.yandex;
            if (z4) {
                C7091l c7091l4 = new C7091l();
                c7091l4.yandex = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                c7091l4.loadAd = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                C1461l c1461l4 = C1461l.f3659l;
                objM2132native = new C0059l(0, 6, InterfaceC12244l.class, AbstractC8020l.billing(c1461l4, new Cfinally(AbstractC8020l.billing(c1461l4, new C0289l(interfaceC8714lVip, 20)), c5866l, c7091l4, 18)), "value", "getValue()Ljava/lang/Object;");
                c6956l.m2147try(objM2132native);
            } else {
                C7091l c7091l5 = new C7091l();
                c7091l5.yandex = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                c7091l5.loadAd = new C15308l(Alert.DURATION_SHOW_INDEFINITELY);
                C1461l c1461l5 = C1461l.f3659l;
                objM2132native = new C0059l(0, 6, InterfaceC12244l.class, AbstractC8020l.billing(c1461l5, new Cfinally(AbstractC8020l.billing(c1461l5, new C0289l(interfaceC8714lVip, 20)), c5866l, c7091l5, 18)), "value", "getValue()Ljava/lang/Object;");
                c6956l.m2147try(objM2132native);
            }
            interfaceC2901l = (InterfaceC2901l) objM2132native;
            int i119 = i117 >> 9;
            int i26 = i115 | (i119 & 112);
            z5 = ((((i26 & 112) ^ 48) <= 32 && c6956l.mopub(z)) || (i26 & 48) == 32) | ((((i26 & 14) ^ 6) <= 4 && c6956l.billing(c5866l)) || (i26 & 6) == 4);
            objM2132native2 = c6956l.m2132native();
            if (z5) {
                objM2132native2 = new C4373l(c5866l, z);
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = new C4373l(c5866l, z);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC14371l interfaceC14371l3 = (InterfaceC14371l) objM2132native2;
            objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native3);
            }
            interfaceC2262l = (InterfaceC2262l) objM2132native3;
            interfaceC3685l = (InterfaceC3685l) c6956l.isPro(AbstractC4751l.mopub);
            c13975l = ((Boolean) c6956l.isPro(AbstractC4751l.ad)).booleanValue() ? null : C17926l.yandex;
            int i27 = i118 << 18;
            int i28 = (i117 & 65520) | (i119 & 3670016) | (i27 & 29360128) | (i27 & 234881024) | ((i118 << 27) & 1879048192);
            zAmazon = ((((i28 & 112) ^ 48) <= 32 && c6956l.billing(c5866l)) || (i28 & 48) == 32) | ((((i28 & 896) ^ 384) <= 256 && c6956l.billing(interfaceC11780l)) || (i28 & 384) == 256) | ((((i28 & 7168) ^ 3072) <= 2048 && c6956l.mopub(false)) || (i28 & 3072) == 2048) | ((((57344 & i28) ^ 24576) <= 16384 && c6956l.mopub(z)) || (i28 & 24576) == 16384) | c6956l.amazon(0) | ((((i28 & 3670016) ^ 1572864) <= 1048576 && c6956l.billing(interfaceC6947l3)) || (i28 & 1572864) == 1048576) | ((((i28 & 29360128) ^ 12582912) <= 8388608 && c6956l.billing(c0086l4)) || (i28 & 12582912) == 8388608) | ((((i28 & 234881024) ^ 100663296) <= 67108864 && c6956l.billing(interfaceC5404l)) || (i28 & 100663296) == 67108864) | ((((i28 & 1879048192) ^ 805306368) <= 536870912 && c6956l.billing(interfaceC3501l3)) || (i28 & 805306368) == 536870912) | c6956l.billing(interfaceC3685l) | c6956l.billing(c13975l);
            objM2132native4 = c6956l.m2132native();
            if (zAmazon) {
                obj2 = obj;
                i8 = 4;
                Object c4591l4 = new C4591l(c5866l, z, interfaceC11780l, interfaceC2901l, interfaceC3501l3, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l, interfaceC6947l3, c0086l4);
                interfaceC2901l2 = interfaceC2901l;
                c6956l.m2147try(c4591l4);
                objM2132native4 = c4591l4;
            } else {
                obj2 = obj;
                i8 = 4;
                Object c4591l5 = new C4591l(c5866l, z, interfaceC11780l, interfaceC2901l, interfaceC3501l3, interfaceC5404l, interfaceC2262l, interfaceC3685l, c13975l, interfaceC6947l3, c0086l4);
                interfaceC2901l2 = interfaceC2901l;
                c6956l.m2147try(c4591l5);
                objM2132native4 = c4591l5;
            }
            InterfaceC2948l interfaceC2948l3 = (InterfaceC2948l) objM2132native4;
            if (z) {
                enumC7283l = EnumC7283l.f15126l;
            } else {
                enumC7283l = EnumC7283l.f15125l;
            }
            enumC7283l2 = enumC7283l;
            if (z2) {
                c6956l.m2123default(-2077147368);
                zAmazon2 = c6956l.amazon(0) | ((((i7 & 14) ^ 6) <= i8 && c6956l.billing(c5866l)) || (i7 & 6) == i8);
                objM2132native5 = c6956l.m2132native();
                if (zAmazon2) {
                    objM2132native5 = new C9213l(c5866l);
                    c6956l.m2147try(objM2132native5);
                } else {
                    objM2132native5 = new C9213l(c5866l);
                    c6956l.m2147try(objM2132native5);
                }
                interfaceC17242lSubs = AbstractC10565l.subs((C9213l) objM2132native5, c5866l.startapp, enumC7283l2);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-2076718545);
                c6956l.startapp(false);
                interfaceC17242lSubs = C4346l.f8873l;
            }
            c5866l2 = c5866l;
            AbstractC18377l.yandex(interfaceC2901l2, AbstractC18377l.amazon(AbstractC0019l.billing(AbstractC2648l.purchase(interfaceC17242l.premium(c5866l.remoteconfig).premium(c5866l.vip), interfaceC2901l2, interfaceC14371l3, enumC7283l2, z2).premium(interfaceC17242lSubs), c5866l.metrica), c5866l, enumC7283l2, c10306l, z2, interfaceC14745l, c5866l.mopub, null), c5866l2.adcel, interfaceC2948l3, c6956l, 0);
            interfaceC3501l2 = interfaceC3501l3;
            interfaceC6947l2 = interfaceC6947l3;
            c0086l2 = c0086l4;
        } else {
            c5866l2 = c5866l;
            c6956l.m2124else();
            c0086l2 = c0086l;
            interfaceC5404l = interfaceC5404l;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12746l(interfaceC17242l, c5866l2, interfaceC11780l, z, interfaceC14745l, z2, c10306l, interfaceC6947l2, interfaceC3501l2, c0086l2, interfaceC5404l, function1, i, i2, i3);
        }
    }
}
