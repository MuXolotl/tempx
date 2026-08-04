package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍْٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16291l {
    public static final C15578l yandex = new C15578l(876538222, false, new C5142l(1));

    public static final void amazon(final boolean z, final Function0 function0, final InterfaceC17242l interfaceC17242l, final boolean z2, final C12331l c12331l, final C7307l c7307l, final C11001l c11001l, C3104l c3104l, C13891l c13891l, final C15578l c15578l, C6956l c6956l, final int i, final int i2, final int i3) {
        int i4;
        C3104l c3104l2;
        C13891l c13891l2;
        int i5;
        C15578l c15578l2;
        final C13891l c13891l3;
        final C3104l c3104l3;
        C3104l c3104l4;
        int i6;
        C13891l c13891l4;
        int i7;
        C3104l c3104l5;
        C13891l c13891l5;
        InterfaceC6347l interfaceC6347l;
        long j;
        long j2;
        long j3;
        float f;
        C2209l c2209l;
        long j4;
        C4442l c4442l;
        c6956l.m2133new(-1686649872);
        if ((i & 6) == 0) {
            i4 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= c6956l.mopub(z2) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= c6956l.admob(null) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= c6956l.crashlytics(0.0f) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= c6956l.billing(c12331l) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= c6956l.billing(c7307l) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= c6956l.billing(c11001l) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                c3104l2 = c3104l;
                int i8 = c6956l.billing(c3104l2) ? 536870912 : 268435456;
                i4 |= i8;
            } else {
                c3104l2 = c3104l;
            }
            i4 |= i8;
        } else {
            c3104l2 = c3104l;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0) {
                c13891l2 = c13891l;
                int i9 = c6956l.billing(c13891l2) ? 4 : 2;
                i5 = i2 | i9;
            } else {
                c13891l2 = c13891l;
            }
            i5 = i2 | i9;
        } else {
            c13891l2 = c13891l;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c6956l.billing(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            c15578l2 = c15578l;
            i5 |= c6956l.admob(c15578l2) ? 256 : 128;
        } else {
            c15578l2 = c15578l;
        }
        int i10 = i5;
        int i11 = i4;
        if (c6956l.m2127for(i11 & 1, ((i4 & 306783379) == 306783378 && (i10 & 147) == 146) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    C2209l c2209l2 = C2209l.crashlytics;
                    c3104l4 = new C3104l(c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2, c2209l2);
                    i6 = i11 & (-1879048193);
                } else {
                    c3104l4 = c3104l2;
                    i6 = i11;
                }
                if ((i3 & 1024) != 0) {
                    C4442l c4442l2 = C4442l.loadAd;
                    c13891l4 = new C13891l(c4442l2, c4442l2, c4442l2, c4442l2, c4442l2, c4442l2);
                    i10 &= -15;
                } else {
                    c13891l4 = c13891l2;
                }
                i7 = i6;
                c3104l5 = c3104l4;
                c13891l5 = c13891l4;
            } else {
                c6956l.m2124else();
                int i12 = (i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? i11 & (-1879048193) : i11;
                if ((i3 & 1024) != 0) {
                    i10 &= -15;
                }
                c13891l5 = c13891l2;
                i7 = i12;
                c3104l5 = c3104l2;
            }
            c6956l.adcel();
            c6956l.m2123default(-163190677);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l, c6956l, 0);
            InterfaceC8714l interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l, c6956l, 0);
            int[] iArr = AbstractC12460l.yandex;
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(AbstractC13702l.crashlytics(AbstractC17541l.loadAd(interfaceC17242l, new C7182l(z2, c2403l, function0, 1)), c2403l, 1), true, new C14027l(z, z2, function0));
            boolean zBooleanValue = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z2 && z && zBooleanValue2) {
                interfaceC6347l = c12331l.admob;
            } else if (z2 && z && zBooleanValue) {
                interfaceC6347l = c12331l.billing;
            } else if (z2 && z) {
                interfaceC6347l = c12331l.amazon;
            } else if (z2 && zBooleanValue2) {
                interfaceC6347l = c12331l.crashlytics;
            } else if (z2 && zBooleanValue) {
                interfaceC6347l = c12331l.loadAd;
            } else if (z2) {
                interfaceC6347l = c12331l.yandex;
            } else if (!z2 && z && zBooleanValue) {
                interfaceC6347l = c12331l.isPro;
            } else if (z2 || !z) {
                interfaceC6347l = (z2 || !zBooleanValue) ? c12331l.purchase : c12331l.mopub;
            } else {
                interfaceC6347l = c12331l.subs;
            }
            boolean zBooleanValue3 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z2 && z && zBooleanValue4) {
                j = c7307l.remoteconfig;
            } else if (z2 && z && zBooleanValue3) {
                j = c7307l.firebase;
            } else if (z2 && z) {
                j = c7307l.mopub;
            } else if (z2 && zBooleanValue4) {
                j = c7307l.purchase;
            } else if (z2 && zBooleanValue3) {
                j = c7307l.crashlytics;
            } else {
                j = z2 ? c7307l.yandex : c7307l.subs;
            }
            boolean zBooleanValue5 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue6 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z2 && z && zBooleanValue6) {
                j2 = j;
                j3 = c7307l.vip;
            } else {
                j2 = j;
                if (z2 && z && zBooleanValue5) {
                    j3 = c7307l.smaato;
                } else if (z2 && z) {
                    j3 = c7307l.admob;
                } else if (z2 && zBooleanValue6) {
                    j3 = c7307l.billing;
                } else if (z2 && zBooleanValue5) {
                    j3 = c7307l.amazon;
                } else {
                    j3 = z2 ? c7307l.loadAd : c7307l.isPro;
                }
            }
            boolean zBooleanValue7 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue8 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            float f2 = 1.0f;
            if (!z2 || !z || !zBooleanValue8) {
                if (z2 && z && zBooleanValue7) {
                    f = c11001l.loadAd;
                } else if ((!z2 || !z) && ((!z2 || !zBooleanValue8) && z2 && zBooleanValue7)) {
                    f = c11001l.yandex;
                }
                f2 = f;
            }
            boolean zBooleanValue9 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue10 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z2 && z && zBooleanValue10) {
                c2209l = c3104l5.admob;
            } else if (z2 && z && zBooleanValue9) {
                c2209l = c3104l5.billing;
            } else if (z2 && z) {
                c2209l = c3104l5.amazon;
            } else if (z2 && zBooleanValue10) {
                c2209l = c3104l5.crashlytics;
            } else if (z2 && zBooleanValue9) {
                c2209l = c3104l5.loadAd;
            } else if (z2) {
                c2209l = c3104l5.yandex;
            } else if (!z2 && z && zBooleanValue9) {
                c2209l = c3104l5.isPro;
            } else if (z2 || !z) {
                c2209l = (z2 || !zBooleanValue9) ? c3104l5.purchase : c3104l5.mopub;
            } else {
                c2209l = c3104l5.subs;
            }
            boolean zBooleanValue11 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue12 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z2 && z && zBooleanValue12) {
                j4 = j3;
                c4442l = c13891l5.billing;
            } else {
                j4 = j3;
                if (z2 && z && zBooleanValue11) {
                    c4442l = c13891l5.purchase;
                } else if (z2 && z) {
                    c4442l = c13891l5.amazon;
                } else if (z2 && zBooleanValue12) {
                    c4442l = c13891l5.crashlytics;
                } else if (z2 && zBooleanValue11) {
                    c4442l = c13891l5.loadAd;
                } else {
                    c4442l = z2 ? c13891l5.yandex : C4442l.loadAd;
                }
            }
            C13891l c13891l6 = c13891l5;
            AbstractC12460l.yandex(interfaceC17242lYandex, z, z2, interfaceC6347l, j2, j4, f2, c2209l, c4442l, c2403l, c15578l2, c6956l, ((i7 >> 3) & 896) | ((i7 << 3) & 112) | ((i7 << 12) & 1879048192), (i10 >> 3) & 112);
            c3104l3 = c3104l5;
            c13891l3 = c13891l6;
        } else {
            c6956l.m2124else();
            c13891l3 = c13891l2;
            c3104l3 = c3104l2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌؘۛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC16291l.amazon(z, function0, interfaceC17242l, z2, c12331l, c7307l, c11001l, c3104l3, c13891l3, c15578l, (C6956l) obj, iPurchase, iPurchase2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void billing(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + Math.min(byteBuffer.remaining(), i));
    }

    public static final void crashlytics(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, C17442l c17442l, C15578l c15578l, C6956l c6956l, int i) {
        if ((i & 1) != 0) {
            interfaceC17242l = C4346l.f8873l;
        }
        if ((i & 4) != 0) {
            C2209l c2209l = AbstractC8209l.yandex;
            interfaceC6347l = AbstractC16837l.yandex;
        }
        if ((i & 8) != 0) {
            c17442l = AbstractC8209l.yandex(0L, 0L, c6956l, 384, 3);
        }
        C17442l c17442l2 = c17442l;
        C2209l c2209l2 = AbstractC8209l.yandex;
        C4442l c4442l = AbstractC8209l.loadAd;
        C8540l c8540l = AbstractC12460l.loadAd;
        AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(c17442l2.loadAd, AbstractC1017l.yandex), c8540l.yandex(new C14467l(((C14467l) c6956l.isPro(c8540l)).f28331l + 0.0f))}, AbstractC14566l.amazon(2067745999, new C8088l(c17442l2, interfaceC17242l, interfaceC6347l, c4442l, c2209l2, c15578l), c6956l), c6956l, 56);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x010d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0113  */
    /* JADX WARN: Code duplicated, block: B:107:0x0119  */
    /* JADX WARN: Code duplicated, block: B:108:0x011c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0121  */
    /* JADX WARN: Code duplicated, block: B:113:0x0129  */
    /* JADX WARN: Code duplicated, block: B:116:0x0130  */
    /* JADX WARN: Code duplicated, block: B:124:0x0149  */
    /* JADX WARN: Code duplicated, block: B:127:0x0152  */
    /* JADX WARN: Code duplicated, block: B:148:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x019c  */
    /* JADX WARN: Code duplicated, block: B:150:0x019e  */
    /* JADX WARN: Code duplicated, block: B:153:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x01da  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x0229  */
    /* JADX WARN: Code duplicated, block: B:172:0x0241  */
    /* JADX WARN: Code duplicated, block: B:174:0x024f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0259  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x02a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x02ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:189:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x02db  */
    /* JADX WARN: Code duplicated, block: B:199:0x02de  */
    /* JADX WARN: Code duplicated, block: B:204:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x0306 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x0308  */
    /* JADX WARN: Code duplicated, block: B:210:0x030b  */
    /* JADX WARN: Code duplicated, block: B:216:0x032c  */
    /* JADX WARN: Code duplicated, block: B:218:0x0330 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:220:0x0335 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:221:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x033c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x033e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0341  */
    /* JADX WARN: Code duplicated, block: B:231:0x0361 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0368 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x036f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0371  */
    /* JADX WARN: Code duplicated, block: B:239:0x0374  */
    /* JADX WARN: Code duplicated, block: B:242:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:243:0x038f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0394 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0396  */
    /* JADX WARN: Code duplicated, block: B:247:0x0399  */
    /* JADX WARN: Code duplicated, block: B:248:0x039c  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:253:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v33 */
    public static final void loadAd(final Function0 function0, final InterfaceC17242l interfaceC17242l, boolean z, C8886l c8886l, C7568l c7568l, C10513l c10513l, C9486l c9486l, C11568l c11568l, final C2403l c2403l, final C15578l c15578l, C6956l c6956l, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        C8886l c8886l2;
        C7568l c7568l2;
        C10513l c10513l2;
        C9486l c9486l2;
        final C11568l c11568l2;
        int i6;
        int i7;
        boolean z2;
        final boolean z3;
        final C10513l c10513l3;
        final C9486l c9486l3;
        final C8886l c8886l3;
        final C7568l c7568l3;
        C4224l c4224lAds;
        boolean z4;
        C8886l c8886l4;
        boolean z5;
        C7568l c7568lCrashlytics;
        C10513l c10513l4;
        boolean z6;
        int i8;
        C7568l c7568l4;
        C8886l c8886l5;
        C11568l c11568l3;
        C9486l c9486l4;
        C10513l c10513l5;
        ?? r7;
        C2403l c2403l2;
        InterfaceC8714l interfaceC8714lCrashlytics;
        boolean zBooleanValue;
        InterfaceC6347l interfaceC6347l;
        boolean zBooleanValue2;
        long j;
        boolean zBooleanValue3;
        C8886l c8886l6;
        long j2;
        boolean zBooleanValue4;
        long j3;
        float f;
        boolean zBooleanValue5;
        C2209l c2209l;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        C4442l c4442l;
        Object objM2132native;
        int i9;
        c6956l.m2133new(-760788112);
        if ((i & 6) == 0) {
            i4 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                i4 |= c6956l.mopub(z) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                if (c6956l.crashlytics(0.0f)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            if ((196608 & i) == 0) {
                if ((i3 & 32) == 0) {
                    c8886l2 = c8886l;
                    int i11 = c6956l.billing(c8886l2) ? 131072 : 65536;
                    i4 |= i11;
                } else {
                    c8886l2 = c8886l;
                }
                i4 |= i11;
            } else {
                c8886l2 = c8886l;
            }
            if ((1572864 & i) == 0) {
                if ((i3 & 64) == 0) {
                    c7568l2 = c7568l;
                    int i12 = c6956l.billing(c7568l2) ? 1048576 : 524288;
                    i4 |= i12;
                } else {
                    c7568l2 = c7568l;
                }
                i4 |= i12;
            } else {
                c7568l2 = c7568l;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    c10513l2 = c10513l;
                    int i13 = c6956l.billing(c10513l2) ? 8388608 : 4194304;
                    i4 |= i13;
                } else {
                    c10513l2 = c10513l;
                }
                i4 |= i13;
            } else {
                c10513l2 = c10513l;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    c9486l2 = c9486l;
                    int i14 = c6956l.billing(c9486l2) ? 67108864 : 33554432;
                    i4 |= i14;
                } else {
                    c9486l2 = c9486l;
                }
                i4 |= i14;
            } else {
                c9486l2 = c9486l;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                    c11568l2 = c11568l;
                    int i15 = c6956l.billing(c11568l2) ? 536870912 : 268435456;
                    i4 |= i15;
                } else {
                    c11568l2 = c11568l;
                }
                i4 |= i15;
            } else {
                c11568l2 = c11568l;
            }
            if ((i2 & 6) == 0) {
                if (c6956l.billing(c2403l)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                i6 = i2 | i9;
            } else {
                i6 = i2;
            }
            if ((i2 & 48) == 0) {
                i6 |= c6956l.admob(c15578l) ? 32 : 16;
            }
            i7 = i6;
            if ((306783379 & i4) == 306783378 || (i7 & 19) != 18) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i4 & 1, z2)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 32) != 0) {
                        C6839l c6839l = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).crashlytics;
                        c8886l4 = new C8886l(c6839l, c6839l, c6839l, c6839l, c6839l);
                        i4 &= -458753;
                    } else {
                        c8886l4 = c8886l2;
                    }
                    if ((i3 & 64) != 0) {
                        z5 = false;
                        c7568lCrashlytics = AbstractC7439l.crashlytics(0L, 0L, c6956l, 100663296, 255);
                        i4 &= -3670017;
                    } else {
                        z5 = false;
                        c7568lCrashlytics = c7568l2;
                    }
                    if ((i3 & 128) != 0) {
                        c10513l4 = new C10513l(1.0f, 1.1f, 1.0f, 1.0f, 1.0f);
                        i4 &= -29360129;
                    } else {
                        c10513l4 = c10513l;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        C2209l c2209l2 = C2209l.crashlytics;
                        i4 &= -234881025;
                        c9486l2 = new C9486l(c2209l2, c2209l2, c2209l2, c2209l2, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).yandex()), AbstractC7293l.loadAd));
                    }
                    if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        C4442l c4442l2 = C4442l.loadAd;
                        i4 &= -1879048193;
                        c11568l2 = new C11568l(c4442l2, c4442l2, c4442l2);
                    }
                    z6 = z4;
                    i8 = i4;
                    c7568l4 = c7568lCrashlytics;
                    c8886l5 = c8886l4;
                    c11568l3 = c11568l2;
                    c9486l4 = c9486l2;
                    c10513l5 = c10513l4;
                    r7 = z5;
                } else {
                    c6956l.m2124else();
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        i4 &= -1879048193;
                    }
                    c11568l3 = c11568l2;
                    r7 = 0;
                    c8886l5 = c8886l2;
                    z6 = z;
                    i8 = i4;
                    c9486l4 = c9486l2;
                    c7568l4 = c7568l2;
                    c10513l5 = c10513l2;
                }
                c6956l.adcel();
                if (c2403l == null) {
                    c6956l.m2123default(-95518069);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = AbstractC14814l.isPro(c6956l);
                    }
                    c2403l2 = (C2403l) objM2132native;
                    c6956l.startapp(r7);
                } else {
                    c6956l.m2123default(-972913204);
                    c6956l.startapp(r7);
                    c2403l2 = c2403l;
                }
                InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l2, c6956l, r7);
                interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l2, c6956l, r7);
                int[] iArr = AbstractC12460l.yandex;
                InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(AbstractC13702l.crashlytics(AbstractC17541l.loadAd(interfaceC17242l, new C7182l(z6, c2403l2, function0, 1)), c2403l2, 1), true, new C9012l(z6, function0, 4));
                zBooleanValue = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue() && z6) {
                    interfaceC6347l = c8886l5.crashlytics;
                } else if (!zBooleanValue && z6) {
                    interfaceC6347l = c8886l5.loadAd;
                } else if (!zBooleanValue && !z6) {
                    interfaceC6347l = c8886l5.purchase;
                } else if (z6) {
                    interfaceC6347l = c8886l5.yandex;
                } else {
                    interfaceC6347l = c8886l5.amazon;
                }
                zBooleanValue2 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue() && z6) {
                    j = c7568l4.purchase;
                } else if (!zBooleanValue2 && z6) {
                    j = c7568l4.crashlytics;
                } else if (z6) {
                    j = c7568l4.yandex;
                } else {
                    j = c7568l4.mopub;
                }
                zBooleanValue3 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                if (((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue() || !z6) {
                    c8886l6 = c8886l5;
                    if (!zBooleanValue3 && z6) {
                        j2 = c7568l4.amazon;
                    } else if (z6) {
                        j2 = c7568l4.loadAd;
                    } else {
                        j2 = c7568l4.admob;
                    }
                } else {
                    c8886l6 = c8886l5;
                    j2 = c7568l4.billing;
                }
                zBooleanValue4 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                if (((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue() || !z6) {
                    j3 = j2;
                    if (!zBooleanValue4 && z6) {
                        f = c10513l5.loadAd;
                    } else if (!zBooleanValue4 && !z6) {
                        f = c10513l5.purchase;
                    } else if (z6) {
                        f = c10513l5.yandex;
                    } else {
                        f = c10513l5.amazon;
                    }
                } else {
                    j3 = j2;
                    f = c10513l5.crashlytics;
                }
                float f2 = f;
                zBooleanValue5 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue() && z6) {
                    c2209l = c9486l4.crashlytics;
                } else if (!zBooleanValue5 && z6) {
                    c2209l = c9486l4.loadAd;
                } else if (!zBooleanValue5 && !z6) {
                    c2209l = c9486l4.purchase;
                } else if (z6) {
                    c2209l = c9486l4.yandex;
                } else {
                    c2209l = c9486l4.amazon;
                }
                C2209l c2209l3 = c2209l;
                zBooleanValue6 = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
                zBooleanValue7 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
                if (z6) {
                    c4442l = C4442l.loadAd;
                } else if (zBooleanValue7) {
                    c4442l = c11568l3.crashlytics;
                } else if (zBooleanValue6) {
                    c4442l = c11568l3.loadAd;
                } else {
                    c4442l = c11568l3.yandex;
                }
                AbstractC12460l.yandex(interfaceC17242lYandex, false, z6, interfaceC6347l, j, j3, f2, c2209l3, c4442l, c2403l2, c15578l, c6956l, ((i8 >> 3) & 896) | 48 | ((i8 << 15) & 1879048192), i7 & 112);
                c10513l3 = c10513l5;
                c9486l3 = c9486l4;
                z3 = z6;
                c11568l2 = c11568l3;
                c7568l3 = c7568l4;
                c8886l3 = c8886l6;
            } else {
                c6956l.m2124else();
                z3 = z;
                c10513l3 = c10513l;
                c9486l3 = c9486l2;
                c8886l3 = c8886l2;
                c7568l3 = c7568l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٍٍ٘
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        int iPurchase2 = AbstractC0545l.purchase(i2);
                        AbstractC16291l.loadAd(function0, interfaceC17242l, z3, c8886l3, c7568l3, c10513l3, c9486l3, c11568l2, c2403l, c15578l, (C6956l) obj, iPurchase, iPurchase2, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i4 |= 3072;
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c6956l.crashlytics(0.0f)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        if ((196608 & i) == 0) {
            if ((i3 & 32) == 0) {
                c8886l2 = c8886l;
                if (c6956l.billing(c8886l2)) {
                }
                i4 |= i11;
            } else {
                c8886l2 = c8886l;
            }
            i4 |= i11;
        } else {
            c8886l2 = c8886l;
        }
        if ((1572864 & i) == 0) {
            if ((i3 & 64) == 0) {
                c7568l2 = c7568l;
                if (c6956l.billing(c7568l2)) {
                }
                i4 |= i12;
            } else {
                c7568l2 = c7568l;
            }
            i4 |= i12;
        } else {
            c7568l2 = c7568l;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                c10513l2 = c10513l;
                if (c6956l.billing(c10513l2)) {
                }
                i4 |= i13;
            } else {
                c10513l2 = c10513l;
            }
            i4 |= i13;
        } else {
            c10513l2 = c10513l;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                c9486l2 = c9486l;
                if (c6956l.billing(c9486l2)) {
                }
                i4 |= i14;
            } else {
                c9486l2 = c9486l;
            }
            i4 |= i14;
        } else {
            c9486l2 = c9486l;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                c11568l2 = c11568l;
                if (c6956l.billing(c11568l2)) {
                }
                i4 |= i15;
            } else {
                c11568l2 = c11568l;
            }
            i4 |= i15;
        } else {
            c11568l2 = c11568l;
        }
        if ((i2 & 6) == 0) {
            if (c6956l.billing(c2403l)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i2 | i9;
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        i7 = i6;
        if ((306783379 & i4) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (c6956l.m2127for(i4 & 1, z2)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 32) != 0) {
                    C6839l c6839l2 = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).crashlytics;
                    c8886l4 = new C8886l(c6839l2, c6839l2, c6839l2, c6839l2, c6839l2);
                    i4 &= -458753;
                } else {
                    c8886l4 = c8886l2;
                }
                if ((i3 & 64) != 0) {
                    z5 = false;
                    c7568lCrashlytics = AbstractC7439l.crashlytics(0L, 0L, c6956l, 100663296, 255);
                    i4 &= -3670017;
                } else {
                    z5 = false;
                    c7568lCrashlytics = c7568l2;
                }
                if ((i3 & 128) != 0) {
                    c10513l4 = new C10513l(1.0f, 1.1f, 1.0f, 1.0f, 1.0f);
                    i4 &= -29360129;
                } else {
                    c10513l4 = c10513l;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    C2209l c2209l4 = C2209l.crashlytics;
                    i4 &= -234881025;
                    c9486l2 = new C9486l(c2209l4, c2209l4, c2209l4, c2209l4, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).yandex()), AbstractC7293l.loadAd));
                }
                if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    C4442l c4442l3 = C4442l.loadAd;
                    i4 &= -1879048193;
                    c11568l2 = new C11568l(c4442l3, c4442l3, c4442l3);
                }
                z6 = z4;
                i8 = i4;
                c7568l4 = c7568lCrashlytics;
                c8886l5 = c8886l4;
                c11568l3 = c11568l2;
                c9486l4 = c9486l2;
                c10513l5 = c10513l4;
                r7 = z5;
            } else {
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 32) != 0) {
                    C6839l c6839l3 = ((C0260l) c6956l.isPro(AbstractC14696l.yandex)).crashlytics;
                    c8886l4 = new C8886l(c6839l3, c6839l3, c6839l3, c6839l3, c6839l3);
                    i4 &= -458753;
                } else {
                    c8886l4 = c8886l2;
                }
                if ((i3 & 64) != 0) {
                    z5 = false;
                    c7568lCrashlytics = AbstractC7439l.crashlytics(0L, 0L, c6956l, 100663296, 255);
                    i4 &= -3670017;
                } else {
                    z5 = false;
                    c7568lCrashlytics = c7568l2;
                }
                if ((i3 & 128) != 0) {
                    c10513l4 = new C10513l(1.0f, 1.1f, 1.0f, 1.0f, 1.0f);
                    i4 &= -29360129;
                } else {
                    c10513l4 = c10513l;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    C2209l c2209l5 = C2209l.crashlytics;
                    i4 &= -234881025;
                    c9486l2 = new C9486l(c2209l5, c2209l5, c2209l5, c2209l5, new C2209l(AbstractC2576l.yandex(2.0f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).yandex()), AbstractC7293l.loadAd));
                }
                if ((i3 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    C4442l c4442l4 = C4442l.loadAd;
                    i4 &= -1879048193;
                    c11568l2 = new C11568l(c4442l4, c4442l4, c4442l4);
                }
                z6 = z4;
                i8 = i4;
                c7568l4 = c7568lCrashlytics;
                c8886l5 = c8886l4;
                c11568l3 = c11568l2;
                c9486l4 = c9486l2;
                c10513l5 = c10513l4;
                r7 = z5;
            }
            c6956l.adcel();
            if (c2403l == null) {
                c6956l.m2123default(-95518069);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l2 = (C2403l) objM2132native;
                c6956l.startapp(r7);
            } else {
                c6956l.m2123default(-972913204);
                c6956l.startapp(r7);
                c2403l2 = c2403l;
            }
            InterfaceC8714l interfaceC8714lLoadAd2 = AbstractC8317l.loadAd(c2403l2, c6956l, r7);
            interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l2, c6956l, r7);
            int[] iArr2 = AbstractC12460l.yandex;
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC4962l.yandex(AbstractC13702l.crashlytics(AbstractC17541l.loadAd(interfaceC17242l, new C7182l(z6, c2403l2, function0, 1)), c2403l2, 1), true, new C9012l(z6, function0, 4));
            zBooleanValue = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue()) {
                if (!zBooleanValue) {
                    if (!zBooleanValue) {
                        if (z6) {
                            interfaceC6347l = c8886l5.yandex;
                        } else {
                            interfaceC6347l = c8886l5.amazon;
                        }
                    } else if (z6) {
                        interfaceC6347l = c8886l5.yandex;
                    } else {
                        interfaceC6347l = c8886l5.amazon;
                    }
                } else if (!zBooleanValue) {
                    if (z6) {
                        interfaceC6347l = c8886l5.yandex;
                    } else {
                        interfaceC6347l = c8886l5.amazon;
                    }
                } else if (z6) {
                    interfaceC6347l = c8886l5.yandex;
                } else {
                    interfaceC6347l = c8886l5.amazon;
                }
            } else if (!zBooleanValue) {
                if (!zBooleanValue) {
                    if (z6) {
                        interfaceC6347l = c8886l5.yandex;
                    } else {
                        interfaceC6347l = c8886l5.amazon;
                    }
                } else if (z6) {
                    interfaceC6347l = c8886l5.yandex;
                } else {
                    interfaceC6347l = c8886l5.amazon;
                }
            } else if (!zBooleanValue) {
                if (z6) {
                    interfaceC6347l = c8886l5.yandex;
                } else {
                    interfaceC6347l = c8886l5.amazon;
                }
            } else if (z6) {
                interfaceC6347l = c8886l5.yandex;
            } else {
                interfaceC6347l = c8886l5.amazon;
            }
            zBooleanValue2 = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue()) {
                if (!zBooleanValue2) {
                    if (z6) {
                        j = c7568l4.yandex;
                    } else {
                        j = c7568l4.mopub;
                    }
                } else if (z6) {
                    j = c7568l4.yandex;
                } else {
                    j = c7568l4.mopub;
                }
            } else if (!zBooleanValue2) {
                if (z6) {
                    j = c7568l4.yandex;
                } else {
                    j = c7568l4.mopub;
                }
            } else if (z6) {
                j = c7568l4.yandex;
            } else {
                j = c7568l4.mopub;
            }
            zBooleanValue3 = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            if (((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue()) {
                c8886l6 = c8886l5;
                if (!zBooleanValue3) {
                    if (z6) {
                        j2 = c7568l4.loadAd;
                    } else {
                        j2 = c7568l4.admob;
                    }
                } else if (z6) {
                    j2 = c7568l4.loadAd;
                } else {
                    j2 = c7568l4.admob;
                }
            } else {
                c8886l6 = c8886l5;
                if (!zBooleanValue3) {
                    if (z6) {
                        j2 = c7568l4.loadAd;
                    } else {
                        j2 = c7568l4.admob;
                    }
                } else if (z6) {
                    j2 = c7568l4.loadAd;
                } else {
                    j2 = c7568l4.admob;
                }
            }
            zBooleanValue4 = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            if (((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue()) {
                j3 = j2;
                if (!zBooleanValue4) {
                    if (!zBooleanValue4) {
                        if (z6) {
                            f = c10513l5.yandex;
                        } else {
                            f = c10513l5.amazon;
                        }
                    } else if (z6) {
                        f = c10513l5.yandex;
                    } else {
                        f = c10513l5.amazon;
                    }
                } else if (!zBooleanValue4) {
                    if (z6) {
                        f = c10513l5.yandex;
                    } else {
                        f = c10513l5.amazon;
                    }
                } else if (z6) {
                    f = c10513l5.yandex;
                } else {
                    f = c10513l5.amazon;
                }
            } else {
                j3 = j2;
                if (!zBooleanValue4) {
                    if (!zBooleanValue4) {
                        if (z6) {
                            f = c10513l5.yandex;
                        } else {
                            f = c10513l5.amazon;
                        }
                    } else if (z6) {
                        f = c10513l5.yandex;
                    } else {
                        f = c10513l5.amazon;
                    }
                } else if (!zBooleanValue4) {
                    if (z6) {
                        f = c10513l5.yandex;
                    } else {
                        f = c10513l5.amazon;
                    }
                } else if (z6) {
                    f = c10513l5.yandex;
                } else {
                    f = c10513l5.amazon;
                }
            }
            float f3 = f;
            zBooleanValue5 = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            if (!((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue()) {
                if (!zBooleanValue5) {
                    if (!zBooleanValue5) {
                        if (z6) {
                            c2209l = c9486l4.yandex;
                        } else {
                            c2209l = c9486l4.amazon;
                        }
                    } else if (z6) {
                        c2209l = c9486l4.yandex;
                    } else {
                        c2209l = c9486l4.amazon;
                    }
                } else if (!zBooleanValue5) {
                    if (z6) {
                        c2209l = c9486l4.yandex;
                    } else {
                        c2209l = c9486l4.amazon;
                    }
                } else if (z6) {
                    c2209l = c9486l4.yandex;
                } else {
                    c2209l = c9486l4.amazon;
                }
            } else if (!zBooleanValue5) {
                if (!zBooleanValue5) {
                    if (z6) {
                        c2209l = c9486l4.yandex;
                    } else {
                        c2209l = c9486l4.amazon;
                    }
                } else if (z6) {
                    c2209l = c9486l4.yandex;
                } else {
                    c2209l = c9486l4.amazon;
                }
            } else if (!zBooleanValue5) {
                if (z6) {
                    c2209l = c9486l4.yandex;
                } else {
                    c2209l = c9486l4.amazon;
                }
            } else if (z6) {
                c2209l = c9486l4.yandex;
            } else {
                c2209l = c9486l4.amazon;
            }
            C2209l c2209l6 = c2209l;
            zBooleanValue6 = ((Boolean) interfaceC8714lLoadAd2.getValue()).booleanValue();
            zBooleanValue7 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            if (z6) {
                c4442l = C4442l.loadAd;
            } else if (zBooleanValue7) {
                c4442l = c11568l3.crashlytics;
            } else if (zBooleanValue6) {
                c4442l = c11568l3.loadAd;
            } else {
                c4442l = c11568l3.yandex;
            }
            AbstractC12460l.yandex(interfaceC17242lYandex2, false, z6, interfaceC6347l, j, j3, f3, c2209l6, c4442l, c2403l2, c15578l, c6956l, ((i8 >> 3) & 896) | 48 | ((i8 << 15) & 1879048192), i7 & 112);
            c10513l3 = c10513l5;
            c9486l3 = c9486l4;
            z3 = z6;
            c11568l2 = c11568l3;
            c7568l3 = c7568l4;
            c8886l3 = c8886l6;
        } else {
            c6956l.m2124else();
            z3 = z;
            c10513l3 = c10513l;
            c9486l3 = c9486l2;
            c8886l3 = c8886l2;
            c7568l3 = c7568l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍٍ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC16291l.loadAd(function0, interfaceC17242l, z3, c8886l3, c7568l3, c10513l3, c9486l3, c11568l2, c2403l, c15578l, (C6956l) obj, iPurchase, iPurchase2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static BigInteger purchase(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(InterfaceC11695l.startapp);
        }
        return z ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0182  */
    /* JADX WARN: Code duplicated, block: B:104:0x019b  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0121  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    public static final void yandex(final Function0 function0, final C15578l c15578l, InterfaceC17242l interfaceC17242l, Function2 function2, Function2 function3, final Function2 function4, final Function2 function5, InterfaceC6347l interfaceC6347l, long j, long j2, long j3, long j4, C9401l c9401l, C6956l c6956l, final int i, final int i2, final int i3) {
        int i4;
        Function2 function6;
        int i5;
        Function2 function7;
        int i6;
        int i7;
        int i8;
        C9401l c9401l2;
        int i9;
        boolean z;
        final InterfaceC17242l interfaceC17242l2;
        final InterfaceC6347l interfaceC6347l2;
        final long j5;
        final long j6;
        final long j7;
        final C9401l c9401l3;
        final Function2 function8;
        final Function2 function9;
        final long j8;
        C4224l c4224lAds;
        InterfaceC6347l interfaceC6347l3;
        int i10;
        Function2 function10;
        InterfaceC17242l interfaceC17242l3;
        Function2 function11;
        long j9;
        long j10;
        long j11;
        C9401l c9401l4;
        int i11;
        long j12;
        int i12;
        int i13;
        c6956l.m2133new(94478519);
        if ((i & 6) == 0) {
            i4 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        int i14 = i4 | 384;
        int i15 = i3 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                function6 = function2;
                i14 |= c6956l.admob(function6) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    function7 = function3;
                    if (c6956l.admob(function7)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i14 |= i6;
                }
                if ((196608 & i) != 0) {
                    if (c6956l.admob(function4)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i14 |= i13;
                }
                if ((1572864 & i) != 0) {
                    if (c6956l.admob(function5)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i14 |= i12;
                }
                if ((i & 12582912) == 0) {
                    i14 |= 4194304;
                }
                if ((i & 100663296) == 0) {
                    i14 |= 33554432;
                }
                if ((i & 805306368) == 0) {
                    i14 |= 268435456;
                }
                i7 = i2 | 402;
                i8 = i3 & 8192;
                if (i8 != 0) {
                    if ((i2 & 3072) == 0) {
                        c9401l2 = c9401l;
                        if (c6956l.billing(c9401l2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i7 |= i9;
                    }
                    if ((i14 & 306783379) == 306783378 || (i7 & 1171) != 1170) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c6956l.m2127for(i14 & 1, z)) {
                        c6956l.m2141switch();
                        if ((i & 1) != 0 || c6956l.ad()) {
                            if (i15 != 0) {
                                function6 = null;
                            }
                            if (i5 != 0) {
                                function7 = null;
                            }
                            InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 2);
                            long jPurchase = AbstractC15038l.purchase(c6956l, 38);
                            long jPurchase2 = AbstractC15038l.purchase(c6956l, 31);
                            int i16 = (-2143289345) & i14;
                            long jPurchase3 = AbstractC15038l.purchase(c6956l, 18);
                            long jPurchase4 = AbstractC15038l.purchase(c6956l, 19);
                            int i17 = i7 & (-127);
                            C4346l c4346l = C4346l.f8873l;
                            if (i8 != 0) {
                                c9401l2 = new C9401l(7);
                            }
                            interfaceC6347l3 = interfaceC6347lLoadAd;
                            i10 = i16;
                            function10 = function6;
                            interfaceC17242l3 = c4346l;
                            function11 = function7;
                            j9 = jPurchase4;
                            j10 = jPurchase3;
                            j11 = jPurchase;
                            c9401l4 = c9401l2;
                            i11 = i17;
                            j12 = jPurchase2;
                        } else {
                            c6956l.m2124else();
                            i10 = i14 & (-2143289345);
                            int i18 = i7 & (-127);
                            interfaceC6347l3 = interfaceC6347l;
                            j11 = j;
                            j12 = j2;
                            j9 = j4;
                            c9401l4 = c9401l2;
                            function10 = function6;
                            function11 = function7;
                            j10 = j3;
                            i11 = i18;
                            interfaceC17242l3 = interfaceC17242l;
                        }
                        c6956l.adcel();
                        AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                        function9 = function11;
                        c9401l3 = c9401l4;
                        function8 = function10;
                        j7 = j9;
                        interfaceC17242l2 = interfaceC17242l3;
                        j8 = j10;
                        j6 = j12;
                        j5 = j11;
                        interfaceC6347l2 = interfaceC6347l3;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l2 = interfaceC17242l;
                        interfaceC6347l2 = interfaceC6347l;
                        j5 = j;
                        j6 = j2;
                        j7 = j4;
                        c9401l3 = c9401l2;
                        function8 = function6;
                        function9 = function7;
                        j8 = j3;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iPurchase = AbstractC0545l.purchase(i | 1);
                                int iPurchase2 = AbstractC0545l.purchase(i2);
                                AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i7 = 3474;
                c9401l2 = c9401l;
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (c6956l.m2127for(i14 & 1, z)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd2 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase5 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase6 = AbstractC15038l.purchase(c6956l, 31);
                        int i19 = (-2143289345) & i14;
                        long jPurchase7 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase8 = AbstractC15038l.purchase(c6956l, 19);
                        int i110 = i7 & (-127);
                        C4346l c4346l2 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd2;
                        i10 = i19;
                        function10 = function6;
                        interfaceC17242l3 = c4346l2;
                        function11 = function7;
                        j9 = jPurchase8;
                        j10 = jPurchase7;
                        j11 = jPurchase5;
                        c9401l4 = c9401l2;
                        i11 = i110;
                        j12 = jPurchase6;
                    } else {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd3 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase9 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase10 = AbstractC15038l.purchase(c6956l, 31);
                        int i111 = (-2143289345) & i14;
                        long jPurchase11 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase12 = AbstractC15038l.purchase(c6956l, 19);
                        int i112 = i7 & (-127);
                        C4346l c4346l3 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd3;
                        i10 = i111;
                        function10 = function6;
                        interfaceC17242l3 = c4346l3;
                        function11 = function7;
                        j9 = jPurchase12;
                        j10 = jPurchase11;
                        j11 = jPurchase9;
                        c9401l4 = c9401l2;
                        i11 = i112;
                        j12 = jPurchase10;
                    }
                    c6956l.adcel();
                    AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                    function9 = function11;
                    c9401l3 = c9401l4;
                    function8 = function10;
                    j7 = j9;
                    interfaceC17242l2 = interfaceC17242l3;
                    j8 = j10;
                    j6 = j12;
                    j5 = j11;
                    interfaceC6347l2 = interfaceC6347l3;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    interfaceC6347l2 = interfaceC6347l;
                    j5 = j;
                    j6 = j2;
                    j7 = j4;
                    c9401l3 = c9401l2;
                    function8 = function6;
                    function9 = function7;
                    j8 = j3;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iPurchase = AbstractC0545l.purchase(i | 1);
                            int iPurchase2 = AbstractC0545l.purchase(i2);
                            AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i14 |= 24576;
            function7 = function3;
            if ((196608 & i) != 0) {
                if (c6956l.admob(function4)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 |= i13;
            }
            if ((1572864 & i) != 0) {
                if (c6956l.admob(function5)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i14 |= i12;
            }
            if ((i & 12582912) == 0) {
                i14 |= 4194304;
            }
            if ((i & 100663296) == 0) {
                i14 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                i14 |= 268435456;
            }
            i7 = i2 | 402;
            i8 = i3 & 8192;
            if (i8 != 0) {
                if ((i2 & 3072) == 0) {
                    c9401l2 = c9401l;
                    if (c6956l.billing(c9401l2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i7 |= i9;
                }
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (c6956l.m2127for(i14 & 1, z)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd4 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase13 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase14 = AbstractC15038l.purchase(c6956l, 31);
                        int i113 = (-2143289345) & i14;
                        long jPurchase15 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase16 = AbstractC15038l.purchase(c6956l, 19);
                        int i114 = i7 & (-127);
                        C4346l c4346l4 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd4;
                        i10 = i113;
                        function10 = function6;
                        interfaceC17242l3 = c4346l4;
                        function11 = function7;
                        j9 = jPurchase16;
                        j10 = jPurchase15;
                        j11 = jPurchase13;
                        c9401l4 = c9401l2;
                        i11 = i114;
                        j12 = jPurchase14;
                    } else {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd5 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase17 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase18 = AbstractC15038l.purchase(c6956l, 31);
                        int i115 = (-2143289345) & i14;
                        long jPurchase19 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase110 = AbstractC15038l.purchase(c6956l, 19);
                        int i116 = i7 & (-127);
                        C4346l c4346l5 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd5;
                        i10 = i115;
                        function10 = function6;
                        interfaceC17242l3 = c4346l5;
                        function11 = function7;
                        j9 = jPurchase110;
                        j10 = jPurchase19;
                        j11 = jPurchase17;
                        c9401l4 = c9401l2;
                        i11 = i116;
                        j12 = jPurchase18;
                    }
                    c6956l.adcel();
                    AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                    function9 = function11;
                    c9401l3 = c9401l4;
                    function8 = function10;
                    j7 = j9;
                    interfaceC17242l2 = interfaceC17242l3;
                    j8 = j10;
                    j6 = j12;
                    j5 = j11;
                    interfaceC6347l2 = interfaceC6347l3;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    interfaceC6347l2 = interfaceC6347l;
                    j5 = j;
                    j6 = j2;
                    j7 = j4;
                    c9401l3 = c9401l2;
                    function8 = function6;
                    function9 = function7;
                    j8 = j3;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iPurchase = AbstractC0545l.purchase(i | 1);
                            int iPurchase2 = AbstractC0545l.purchase(i2);
                            AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i7 = 3474;
            c9401l2 = c9401l;
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (c6956l.m2127for(i14 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd6 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase111 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase112 = AbstractC15038l.purchase(c6956l, 31);
                    int i117 = (-2143289345) & i14;
                    long jPurchase113 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase114 = AbstractC15038l.purchase(c6956l, 19);
                    int i118 = i7 & (-127);
                    C4346l c4346l6 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd6;
                    i10 = i117;
                    function10 = function6;
                    interfaceC17242l3 = c4346l6;
                    function11 = function7;
                    j9 = jPurchase114;
                    j10 = jPurchase113;
                    j11 = jPurchase111;
                    c9401l4 = c9401l2;
                    i11 = i118;
                    j12 = jPurchase112;
                } else {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd7 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase115 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase116 = AbstractC15038l.purchase(c6956l, 31);
                    int i119 = (-2143289345) & i14;
                    long jPurchase117 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase118 = AbstractC15038l.purchase(c6956l, 19);
                    int i1110 = i7 & (-127);
                    C4346l c4346l7 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd7;
                    i10 = i119;
                    function10 = function6;
                    interfaceC17242l3 = c4346l7;
                    function11 = function7;
                    j9 = jPurchase118;
                    j10 = jPurchase117;
                    j11 = jPurchase115;
                    c9401l4 = c9401l2;
                    i11 = i1110;
                    j12 = jPurchase116;
                }
                c6956l.adcel();
                AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                function9 = function11;
                c9401l3 = c9401l4;
                function8 = function10;
                j7 = j9;
                interfaceC17242l2 = interfaceC17242l3;
                j8 = j10;
                j6 = j12;
                j5 = j11;
                interfaceC6347l2 = interfaceC6347l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                interfaceC6347l2 = interfaceC6347l;
                j5 = j;
                j6 = j2;
                j7 = j4;
                c9401l3 = c9401l2;
                function8 = function6;
                function9 = function7;
                j8 = j3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        int iPurchase2 = AbstractC0545l.purchase(i2);
                        AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i14 = i4 | 3456;
        function6 = function2;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                function7 = function3;
                if (c6956l.admob(function7)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i14 |= i6;
            }
            if ((196608 & i) != 0) {
                if (c6956l.admob(function4)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 |= i13;
            }
            if ((1572864 & i) != 0) {
                if (c6956l.admob(function5)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i14 |= i12;
            }
            if ((i & 12582912) == 0) {
                i14 |= 4194304;
            }
            if ((i & 100663296) == 0) {
                i14 |= 33554432;
            }
            if ((i & 805306368) == 0) {
                i14 |= 268435456;
            }
            i7 = i2 | 402;
            i8 = i3 & 8192;
            if (i8 != 0) {
                if ((i2 & 3072) == 0) {
                    c9401l2 = c9401l;
                    if (c6956l.billing(c9401l2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i7 |= i9;
                }
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (c6956l.m2127for(i14 & 1, z)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd8 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase119 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase1110 = AbstractC15038l.purchase(c6956l, 31);
                        int i1111 = (-2143289345) & i14;
                        long jPurchase1111 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase1112 = AbstractC15038l.purchase(c6956l, 19);
                        int i1112 = i7 & (-127);
                        C4346l c4346l8 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd8;
                        i10 = i1111;
                        function10 = function6;
                        interfaceC17242l3 = c4346l8;
                        function11 = function7;
                        j9 = jPurchase1112;
                        j10 = jPurchase1111;
                        j11 = jPurchase119;
                        c9401l4 = c9401l2;
                        i11 = i1112;
                        j12 = jPurchase1110;
                    } else {
                        if (i15 != 0) {
                            function6 = null;
                        }
                        if (i5 != 0) {
                            function7 = null;
                        }
                        InterfaceC6347l interfaceC6347lLoadAd9 = AbstractC2610l.loadAd(c6956l, 2);
                        long jPurchase1113 = AbstractC15038l.purchase(c6956l, 38);
                        long jPurchase1114 = AbstractC15038l.purchase(c6956l, 31);
                        int i1113 = (-2143289345) & i14;
                        long jPurchase1115 = AbstractC15038l.purchase(c6956l, 18);
                        long jPurchase1116 = AbstractC15038l.purchase(c6956l, 19);
                        int i1114 = i7 & (-127);
                        C4346l c4346l9 = C4346l.f8873l;
                        if (i8 != 0) {
                            c9401l2 = new C9401l(7);
                        }
                        interfaceC6347l3 = interfaceC6347lLoadAd9;
                        i10 = i1113;
                        function10 = function6;
                        interfaceC17242l3 = c4346l9;
                        function11 = function7;
                        j9 = jPurchase1116;
                        j10 = jPurchase1115;
                        j11 = jPurchase1113;
                        c9401l4 = c9401l2;
                        i11 = i1114;
                        j12 = jPurchase1114;
                    }
                    c6956l.adcel();
                    AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                    function9 = function11;
                    c9401l3 = c9401l4;
                    function8 = function10;
                    j7 = j9;
                    interfaceC17242l2 = interfaceC17242l3;
                    j8 = j10;
                    j6 = j12;
                    j5 = j11;
                    interfaceC6347l2 = interfaceC6347l3;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l2 = interfaceC17242l;
                    interfaceC6347l2 = interfaceC6347l;
                    j5 = j;
                    j6 = j2;
                    j7 = j4;
                    c9401l3 = c9401l2;
                    function8 = function6;
                    function9 = function7;
                    j8 = j3;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iPurchase = AbstractC0545l.purchase(i | 1);
                            int iPurchase2 = AbstractC0545l.purchase(i2);
                            AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i7 = 3474;
            c9401l2 = c9401l;
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (c6956l.m2127for(i14 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd10 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase1117 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase1118 = AbstractC15038l.purchase(c6956l, 31);
                    int i1115 = (-2143289345) & i14;
                    long jPurchase1119 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase11110 = AbstractC15038l.purchase(c6956l, 19);
                    int i1116 = i7 & (-127);
                    C4346l c4346l10 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd10;
                    i10 = i1115;
                    function10 = function6;
                    interfaceC17242l3 = c4346l10;
                    function11 = function7;
                    j9 = jPurchase11110;
                    j10 = jPurchase1119;
                    j11 = jPurchase1117;
                    c9401l4 = c9401l2;
                    i11 = i1116;
                    j12 = jPurchase1118;
                } else {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd11 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase11111 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase11112 = AbstractC15038l.purchase(c6956l, 31);
                    int i1117 = (-2143289345) & i14;
                    long jPurchase11113 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase11114 = AbstractC15038l.purchase(c6956l, 19);
                    int i1118 = i7 & (-127);
                    C4346l c4346l11 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd11;
                    i10 = i1117;
                    function10 = function6;
                    interfaceC17242l3 = c4346l11;
                    function11 = function7;
                    j9 = jPurchase11114;
                    j10 = jPurchase11113;
                    j11 = jPurchase11111;
                    c9401l4 = c9401l2;
                    i11 = i1118;
                    j12 = jPurchase11112;
                }
                c6956l.adcel();
                AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                function9 = function11;
                c9401l3 = c9401l4;
                function8 = function10;
                j7 = j9;
                interfaceC17242l2 = interfaceC17242l3;
                j8 = j10;
                j6 = j12;
                j5 = j11;
                interfaceC6347l2 = interfaceC6347l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                interfaceC6347l2 = interfaceC6347l;
                j5 = j;
                j6 = j2;
                j7 = j4;
                c9401l3 = c9401l2;
                function8 = function6;
                function9 = function7;
                j8 = j3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        int iPurchase2 = AbstractC0545l.purchase(i2);
                        AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i14 |= 24576;
        function7 = function3;
        if ((196608 & i) != 0) {
            if (c6956l.admob(function4)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i14 |= i13;
        }
        if ((1572864 & i) != 0) {
            if (c6956l.admob(function5)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i14 |= i12;
        }
        if ((i & 12582912) == 0) {
            i14 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i14 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i14 |= 268435456;
        }
        i7 = i2 | 402;
        i8 = i3 & 8192;
        if (i8 != 0) {
            if ((i2 & 3072) == 0) {
                c9401l2 = c9401l;
                if (c6956l.billing(c9401l2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i7 |= i9;
            }
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (c6956l.m2127for(i14 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd12 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase11115 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase11116 = AbstractC15038l.purchase(c6956l, 31);
                    int i1119 = (-2143289345) & i14;
                    long jPurchase11117 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase11118 = AbstractC15038l.purchase(c6956l, 19);
                    int i11110 = i7 & (-127);
                    C4346l c4346l12 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd12;
                    i10 = i1119;
                    function10 = function6;
                    interfaceC17242l3 = c4346l12;
                    function11 = function7;
                    j9 = jPurchase11118;
                    j10 = jPurchase11117;
                    j11 = jPurchase11115;
                    c9401l4 = c9401l2;
                    i11 = i11110;
                    j12 = jPurchase11116;
                } else {
                    if (i15 != 0) {
                        function6 = null;
                    }
                    if (i5 != 0) {
                        function7 = null;
                    }
                    InterfaceC6347l interfaceC6347lLoadAd13 = AbstractC2610l.loadAd(c6956l, 2);
                    long jPurchase11119 = AbstractC15038l.purchase(c6956l, 38);
                    long jPurchase111110 = AbstractC15038l.purchase(c6956l, 31);
                    int i11111 = (-2143289345) & i14;
                    long jPurchase111111 = AbstractC15038l.purchase(c6956l, 18);
                    long jPurchase111112 = AbstractC15038l.purchase(c6956l, 19);
                    int i11112 = i7 & (-127);
                    C4346l c4346l13 = C4346l.f8873l;
                    if (i8 != 0) {
                        c9401l2 = new C9401l(7);
                    }
                    interfaceC6347l3 = interfaceC6347lLoadAd13;
                    i10 = i11111;
                    function10 = function6;
                    interfaceC17242l3 = c4346l13;
                    function11 = function7;
                    j9 = jPurchase111112;
                    j10 = jPurchase111111;
                    j11 = jPurchase11119;
                    c9401l4 = c9401l2;
                    i11 = i11112;
                    j12 = jPurchase111110;
                }
                c6956l.adcel();
                AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
                function9 = function11;
                c9401l3 = c9401l4;
                function8 = function10;
                j7 = j9;
                interfaceC17242l2 = interfaceC17242l3;
                j8 = j10;
                j6 = j12;
                j5 = j11;
                interfaceC6347l2 = interfaceC6347l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                interfaceC6347l2 = interfaceC6347l;
                j5 = j;
                j6 = j2;
                j7 = j4;
                c9401l3 = c9401l2;
                function8 = function6;
                function9 = function7;
                j8 = j3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        int iPurchase2 = AbstractC0545l.purchase(i2);
                        AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i7 = 3474;
        c9401l2 = c9401l;
        if ((i14 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (c6956l.m2127for(i14 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    function6 = null;
                }
                if (i5 != 0) {
                    function7 = null;
                }
                InterfaceC6347l interfaceC6347lLoadAd14 = AbstractC2610l.loadAd(c6956l, 2);
                long jPurchase111113 = AbstractC15038l.purchase(c6956l, 38);
                long jPurchase111114 = AbstractC15038l.purchase(c6956l, 31);
                int i11113 = (-2143289345) & i14;
                long jPurchase111115 = AbstractC15038l.purchase(c6956l, 18);
                long jPurchase111116 = AbstractC15038l.purchase(c6956l, 19);
                int i11114 = i7 & (-127);
                C4346l c4346l14 = C4346l.f8873l;
                if (i8 != 0) {
                    c9401l2 = new C9401l(7);
                }
                interfaceC6347l3 = interfaceC6347lLoadAd14;
                i10 = i11113;
                function10 = function6;
                interfaceC17242l3 = c4346l14;
                function11 = function7;
                j9 = jPurchase111116;
                j10 = jPurchase111115;
                j11 = jPurchase111113;
                c9401l4 = c9401l2;
                i11 = i11114;
                j12 = jPurchase111114;
            } else {
                if (i15 != 0) {
                    function6 = null;
                }
                if (i5 != 0) {
                    function7 = null;
                }
                InterfaceC6347l interfaceC6347lLoadAd15 = AbstractC2610l.loadAd(c6956l, 2);
                long jPurchase111117 = AbstractC15038l.purchase(c6956l, 38);
                long jPurchase111118 = AbstractC15038l.purchase(c6956l, 31);
                int i11115 = (-2143289345) & i14;
                long jPurchase111119 = AbstractC15038l.purchase(c6956l, 18);
                long jPurchase1111110 = AbstractC15038l.purchase(c6956l, 19);
                int i11116 = i7 & (-127);
                C4346l c4346l15 = C4346l.f8873l;
                if (i8 != 0) {
                    c9401l2 = new C9401l(7);
                }
                interfaceC6347l3 = interfaceC6347lLoadAd15;
                i10 = i11115;
                function10 = function6;
                interfaceC17242l3 = c4346l15;
                function11 = function7;
                j9 = jPurchase1111110;
                j10 = jPurchase111119;
                j11 = jPurchase111117;
                c9401l4 = c9401l2;
                i11 = i11116;
                j12 = jPurchase111118;
            }
            c6956l.adcel();
            AbstractC0850l.crashlytics(function0, c15578l, interfaceC17242l3, function10, function11, function4, function5, interfaceC6347l3, j11, j12, j10, j9, c9401l4, c6956l, i10 & 2147483646, i11 & 8190);
            function9 = function11;
            c9401l3 = c9401l4;
            function8 = function10;
            j7 = j9;
            interfaceC17242l2 = interfaceC17242l3;
            j8 = j10;
            j6 = j12;
            j5 = j11;
            interfaceC6347l2 = interfaceC6347l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            interfaceC6347l2 = interfaceC6347l;
            j5 = j;
            j6 = j2;
            j7 = j4;
            c9401l3 = c9401l2;
            function8 = function6;
            function9 = function7;
            j8 = j3;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lَؕٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC16291l.yandex(function0, c15578l, interfaceC17242l2, function8, function9, function4, function5, interfaceC6347l2, j5, j6, j8, j7, c9401l3, (C6956l) obj, iPurchase, iPurchase2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
