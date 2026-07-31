package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16363l {
    public static final long yandex = AbstractC9027l.yandex(40.0f, 40.0f);

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:121:0x0169  */
    /* JADX WARN: Code duplicated, block: B:123:0x016e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x017c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01da  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:162:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0213  */
    /* JADX WARN: Code duplicated, block: B:173:0x023a  */
    /* JADX WARN: Code duplicated, block: B:176:0x024e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0250  */
    /* JADX WARN: Code duplicated, block: B:181:0x0259  */
    /* JADX WARN: Code duplicated, block: B:184:0x026a  */
    /* JADX WARN: Code duplicated, block: B:185:0x026d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0271  */
    /* JADX WARN: Code duplicated, block: B:189:0x0275  */
    /* JADX WARN: Code duplicated, block: B:192:0x0282  */
    /* JADX WARN: Code duplicated, block: B:193:0x0285  */
    /* JADX WARN: Code duplicated, block: B:197:0x0291  */
    /* JADX WARN: Code duplicated, block: B:199:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void amazon(String str, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, C3790l c3790l, C6973l c6973l, boolean z2, int i, int i2, C10754l c10754l, Function1 function2, C2403l c2403l, C8990l c8990l, C15578l c15578l, C6956l c6956l, int i3, int i4, int i5) {
        int i6;
        boolean z3;
        int i7;
        C6973l c6973l2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        int i17;
        C10754l c10754l2;
        Function1 function3;
        boolean z5;
        int i18;
        C4224l c4224lAds;
        int i19;
        Object obj;
        int i20;
        C10754l c10754l3;
        Object objM2132native;
        C10754l c10754l4;
        int i21;
        int i22;
        int i23;
        Object objM2132native2;
        InterfaceC8714l interfaceC8714l;
        C0639l c0639lLoadAd;
        boolean zBilling;
        Object objM2132native3;
        boolean z6;
        Object objM2132native4;
        InterfaceC8714l interfaceC8714l2;
        int i24;
        int i25;
        boolean z7;
        boolean z8;
        Object objM2132native5;
        int i26;
        int i27;
        int i28;
        int i29;
        c6956l.m2133new(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (c6956l.billing(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i30 = i5 & 8;
        if (i30 == 0) {
            if ((i3 & 3072) == 0) {
                z3 = z;
                i6 |= c6956l.mopub(z3) ? 2048 : 1024;
            }
            if ((i5 & 16) != 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                if (c6956l.mopub(false)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i6 |= i7;
            }
            if ((i3 & 196608) == 0) {
                if (c6956l.billing(c11090l)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i6 |= i29;
            }
            if ((i3 & 1572864) == 0) {
                if (c6956l.billing(c3790l)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i6 |= i28;
            }
            if ((i3 & 12582912) == 0) {
                c6973l2 = c6973l;
                if (c6956l.billing(c6973l2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i6 |= i27;
            } else {
                c6973l2 = c6973l;
            }
            if ((i3 & 100663296) == 0) {
                if (c6956l.mopub(z2)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i6 |= i26;
            }
            if ((i3 & 805306368) == 0) {
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                    i8 = i;
                    int i31 = c6956l.amazon(i8) ? 536870912 : 268435456;
                    i6 |= i31;
                } else {
                    i8 = i;
                }
                i6 |= i31;
            } else {
                i8 = i;
            }
            i9 = i5 & 1024;
            if (i9 != 0) {
                i10 = i4 | 6;
            } else if ((i4 & 6) == 0) {
                if (c6956l.amazon(i2)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 = i4 | i11;
            } else {
                i10 = i4;
            }
            i12 = i5 & 2048;
            if (i12 != 0) {
                i10 |= 48;
            } else if ((i4 & 48) != 0) {
                if (c6956l.billing(c10754l)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i10 |= i13;
            }
            i14 = i10 | 384;
            if ((i4 & 3072) == 0) {
                i15 = i14 | (c6956l.billing(c2403l) ? 2048 : 1024);
            } else {
                i15 = i14;
            }
            if ((i4 & 24576) != 0) {
                i15 |= c6956l.billing(c8990l) ? 16384 : 8192;
            }
            if ((i4 & 196608) == 0) {
                i15 |= c6956l.admob(c15578l) ? 131072 : 65536;
            }
            i16 = i6;
            if ((i6 & 306783379) == 306783378 || (i15 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c6956l.m2127for(i16 & 1, z4)) {
                c6956l.m2141switch();
                i19 = i3 & 1;
                obj = C1867l.yandex;
                if (i19 != 0 || c6956l.ad()) {
                    if (i30 != 0) {
                        z3 = true;
                    }
                    if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                        if (z2) {
                            i22 = 1;
                        } else {
                            i22 = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                        i16 &= -1879048193;
                        i8 = i22;
                    }
                    if (i9 != 0) {
                        i20 = 1;
                    } else {
                        i20 = i2;
                    }
                    if (i12 != 0) {
                        c10754l3 = C15718l.f30873l;
                    } else {
                        c10754l3 = c10754l;
                    }
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == obj) {
                        objM2132native = new C10351l(14);
                        c6956l.m2147try(objM2132native);
                    }
                    function2 = (Function1) objM2132native;
                    i2 = i20;
                    i8 = i8;
                    c10754l4 = c10754l3;
                    i21 = i16;
                } else {
                    c6956l.m2124else();
                    i21 = (i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? i16 & (-1879048193) : i16;
                    c10754l4 = c10754l;
                }
                c6956l.adcel();
                i23 = i8;
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = AbstractC8020l.smaato(new C0639l(0L, 6, str));
                    c6956l.m2147try(objM2132native2);
                }
                interfaceC8714l = (InterfaceC8714l) objM2132native2;
                c0639lLoadAd = C0639l.loadAd((C0639l) interfaceC8714l.getValue(), str);
                zBilling = c6956l.billing(c0639lLoadAd);
                objM2132native3 = c6956l.m2132native();
                if (zBilling || objM2132native3 == obj) {
                    objM2132native3 = new Ctry(c0639lLoadAd, interfaceC8714l, 19);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC12311l.billing((Function0) objM2132native3, c6956l);
                if ((i21 & 14) == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objM2132native4 = c6956l.m2132native();
                if (z6 || objM2132native4 == obj) {
                    objM2132native4 = AbstractC8020l.smaato(str);
                    c6956l.m2147try(objM2132native4);
                }
                interfaceC8714l2 = (InterfaceC8714l) objM2132native4;
                C14966l c14966lAmazon = c3790l.amazon(z2);
                boolean z9 = !z2;
                if (z2) {
                    i24 = 1;
                } else {
                    i24 = i2;
                }
                if (z2) {
                    i25 = 1;
                } else {
                    i25 = i23;
                }
                boolean zBilling2 = c6956l.billing(interfaceC8714l2);
                if ((i21 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = zBilling2 | z7;
                objM2132native5 = c6956l.m2132native();
                if (z8 || objM2132native5 == obj) {
                    objM2132native5 = new C11537l(function1, interfaceC8714l, interfaceC8714l2, 1);
                    c6956l.m2147try(objM2132native5);
                }
                int i32 = i15 << 9;
                boolean z10 = z3;
                AbstractC16817l.loadAd(c0639lLoadAd, (Function1) objM2132native5, interfaceC17242l, c11090l, c10754l4, function2, c2403l, c8990l, z9, i25, i24, c14966lAmazon, c6973l2, z10, c15578l, c6956l, (i21 & 896) | ((i21 >> 6) & 7168) | (i32 & 57344) | (i32 & 458752) | (i32 & 3670016) | (i32 & 29360128), ((i21 >> 15) & 896) | (i21 & 7168) | (i21 & 57344) | (i15 & 458752));
                i18 = i23;
                i17 = i2;
                c10754l2 = c10754l4;
                function3 = function2;
                z5 = z10;
            } else {
                c6956l.m2124else();
                i17 = i2;
                c10754l2 = c10754l;
                function3 = function2;
                z5 = z3;
                i18 = i8;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3256l(str, function1, interfaceC17242l, z5, c11090l, c3790l, c6973l, z2, i18, i17, c10754l2, function3, c2403l, c8990l, c15578l, i3, i4, i5);
            }
        }
        i6 |= 3072;
        z3 = z;
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (c6956l.mopub(false)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        if ((i3 & 196608) == 0) {
            if (c6956l.billing(c11090l)) {
                i29 = 131072;
            } else {
                i29 = 65536;
            }
            i6 |= i29;
        }
        if ((i3 & 1572864) == 0) {
            if (c6956l.billing(c3790l)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i6 |= i28;
        }
        if ((i3 & 12582912) == 0) {
            c6973l2 = c6973l;
            if (c6956l.billing(c6973l2)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i6 |= i27;
        } else {
            c6973l2 = c6973l;
        }
        if ((i3 & 100663296) == 0) {
            if (c6956l.mopub(z2)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i6 |= i26;
        }
        if ((i3 & 805306368) == 0) {
            if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                i8 = i;
                if (c6956l.amazon(i8)) {
                }
                i6 |= i31;
            } else {
                i8 = i;
            }
            i6 |= i31;
        } else {
            i8 = i;
        }
        i9 = i5 & 1024;
        if (i9 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c6956l.amazon(i2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i4 | i11;
        } else {
            i10 = i4;
        }
        i12 = i5 & 2048;
        if (i12 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) != 0) {
            if (c6956l.billing(c10754l)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        i14 = i10 | 384;
        if ((i4 & 3072) == 0) {
            i15 = i14 | (c6956l.billing(c2403l) ? 2048 : 1024);
        } else {
            i15 = i14;
        }
        if ((i4 & 24576) != 0) {
            i15 |= c6956l.billing(c8990l) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i15 |= c6956l.admob(c15578l) ? 131072 : 65536;
        }
        i16 = i6;
        if ((i6 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (c6956l.m2127for(i16 & 1, z4)) {
            c6956l.m2141switch();
            i19 = i3 & 1;
            obj = C1867l.yandex;
            if (i19 != 0) {
                if (i30 != 0) {
                    z3 = true;
                }
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    if (z2) {
                        i22 = 1;
                    } else {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                    i16 &= -1879048193;
                    i8 = i22;
                }
                if (i9 != 0) {
                    i20 = 1;
                } else {
                    i20 = i2;
                }
                if (i12 != 0) {
                    c10754l3 = C15718l.f30873l;
                } else {
                    c10754l3 = c10754l;
                }
                objM2132native = c6956l.m2132native();
                if (objM2132native == obj) {
                    objM2132native = new C10351l(14);
                    c6956l.m2147try(objM2132native);
                }
                function2 = (Function1) objM2132native;
                i2 = i20;
                i8 = i8;
                c10754l4 = c10754l3;
                i21 = i16;
            } else {
                if (i30 != 0) {
                    z3 = true;
                }
                if ((i5 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    if (z2) {
                        i22 = 1;
                    } else {
                        i22 = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                    i16 &= -1879048193;
                    i8 = i22;
                }
                if (i9 != 0) {
                    i20 = 1;
                } else {
                    i20 = i2;
                }
                if (i12 != 0) {
                    c10754l3 = C15718l.f30873l;
                } else {
                    c10754l3 = c10754l;
                }
                objM2132native = c6956l.m2132native();
                if (objM2132native == obj) {
                    objM2132native = new C10351l(14);
                    c6956l.m2147try(objM2132native);
                }
                function2 = (Function1) objM2132native;
                i2 = i20;
                i8 = i8;
                c10754l4 = c10754l3;
                i21 = i16;
            }
            c6956l.adcel();
            i23 = i8;
            objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.smaato(new C0639l(0L, 6, str));
                c6956l.m2147try(objM2132native2);
            }
            interfaceC8714l = (InterfaceC8714l) objM2132native2;
            c0639lLoadAd = C0639l.loadAd((C0639l) interfaceC8714l.getValue(), str);
            zBilling = c6956l.billing(c0639lLoadAd);
            objM2132native3 = c6956l.m2132native();
            if (zBilling) {
                objM2132native3 = new Ctry(c0639lLoadAd, interfaceC8714l, 19);
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = new Ctry(c0639lLoadAd, interfaceC8714l, 19);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.billing((Function0) objM2132native3, c6956l);
            if ((i21 & 14) == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            objM2132native4 = c6956l.m2132native();
            if (z6) {
                objM2132native4 = AbstractC8020l.smaato(str);
                c6956l.m2147try(objM2132native4);
            } else {
                objM2132native4 = AbstractC8020l.smaato(str);
                c6956l.m2147try(objM2132native4);
            }
            interfaceC8714l2 = (InterfaceC8714l) objM2132native4;
            C14966l c14966lAmazon2 = c3790l.amazon(z2);
            boolean z11 = !z2;
            if (z2) {
                i24 = 1;
            } else {
                i24 = i2;
            }
            if (z2) {
                i25 = 1;
            } else {
                i25 = i23;
            }
            boolean zBilling3 = c6956l.billing(interfaceC8714l2);
            if ((i21 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = zBilling3 | z7;
            objM2132native5 = c6956l.m2132native();
            if (z8) {
                objM2132native5 = new C11537l(function1, interfaceC8714l, interfaceC8714l2, 1);
                c6956l.m2147try(objM2132native5);
            } else {
                objM2132native5 = new C11537l(function1, interfaceC8714l, interfaceC8714l2, 1);
                c6956l.m2147try(objM2132native5);
            }
            int i33 = i15 << 9;
            boolean z12 = z3;
            AbstractC16817l.loadAd(c0639lLoadAd, (Function1) objM2132native5, interfaceC17242l, c11090l, c10754l4, function2, c2403l, c8990l, z11, i25, i24, c14966lAmazon2, c6973l2, z12, c15578l, c6956l, (i21 & 896) | ((i21 >> 6) & 7168) | (i33 & 57344) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128), ((i21 >> 15) & 896) | (i21 & 7168) | (i21 & 57344) | (i15 & 458752));
            i18 = i23;
            i17 = i2;
            c10754l2 = c10754l4;
            function3 = function2;
            z5 = z12;
        } else {
            c6956l.m2124else();
            i17 = i2;
            c10754l2 = c10754l;
            function3 = function2;
            z5 = z3;
            i18 = i8;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3256l(str, function1, interfaceC17242l, z5, c11090l, c3790l, c6973l, z2, i18, i17, c10754l2, function3, c2403l, c8990l, c15578l, i3, i4, i5);
        }
    }

    public static final void billing(C12217l c12217l, C6956l c6956l, int i) {
        C12217l c12217l2;
        c6956l.m2133new(2025287684);
        int i2 = (c6956l.admob(c12217l) ? 4 : 2) | i;
        int i3 = 1;
        int i4 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zBilling = c6956l.billing(c12217l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.mopub(new C18497l(c12217l, i4));
                c6956l.m2147try(objM2132native);
            }
            C1348l c1348l = (C1348l) ((InterfaceC12244l) objM2132native).getValue();
            if (c1348l.yandex) {
                c6956l.m2123default(-354609545);
                boolean zAdmob = c6956l.admob(c12217l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C12561l(c12217l, 1);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC7316l interfaceC7316l = (InterfaceC7316l) objM2132native2;
                int i5 = c1348l.amazon;
                boolean z = c1348l.purchase;
                boolean zAdmob2 = c6956l.admob(c12217l);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob2 || objM2132native3 == c13863l) {
                    objM2132native3 = new C12514l(c12217l, i3);
                    c6956l.m2147try(objM2132native3);
                }
                c12217l2 = c12217l;
                AbstractC5103l.loadAd(interfaceC7316l, true, i5, z, yandex, c1348l.crashlytics, new C8110l(c12217l, null, null, (PointerInputEventHandler) objM2132native3, 6), c6956l, 24624, 0);
                c6956l.startapp(false);
            } else {
                c12217l2 = c12217l;
                c6956l.m2123default(-353981826);
                c6956l.startapp(false);
            }
            boolean zBilling2 = c6956l.billing(c12217l2);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == c13863l) {
                objM2132native4 = AbstractC8020l.mopub(new C18497l(c12217l2, i3));
                c6956l.m2147try(objM2132native4);
            }
            C1348l c1348l2 = (C1348l) ((InterfaceC12244l) objM2132native4).getValue();
            if (c1348l2.yandex) {
                c6956l.m2123default(-353488678);
                boolean zAdmob3 = c6956l.admob(c12217l2);
                Object objM2132native5 = c6956l.m2132native();
                if (zAdmob3 || objM2132native5 == c13863l) {
                    objM2132native5 = new C12561l(c12217l2, 2);
                    c6956l.m2147try(objM2132native5);
                }
                InterfaceC7316l interfaceC7316l2 = (InterfaceC7316l) objM2132native5;
                int i6 = c1348l2.amazon;
                boolean z2 = c1348l2.purchase;
                boolean zAdmob4 = c6956l.admob(c12217l2);
                Object objM2132native6 = c6956l.m2132native();
                if (zAdmob4 || objM2132native6 == c13863l) {
                    objM2132native6 = new C12514l(c12217l2, 2);
                    c6956l.m2147try(objM2132native6);
                }
                AbstractC5103l.loadAd(interfaceC7316l2, false, i6, z2, yandex, c1348l2.crashlytics, new C8110l(c12217l2, null, null, (PointerInputEventHandler) objM2132native6, 6), c6956l, 24624, 0);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-352863842);
                c6956l.startapp(false);
            }
        } else {
            c12217l2 = c12217l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12715l(c12217l2, i, 0);
        }
    }

    public static final void crashlytics(C0639l c0639l, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, C3790l c3790l, C6973l c6973l, boolean z2, int i, int i2, C10754l c10754l, Function1 function2, C2403l c2403l, C8990l c8990l, C15578l c15578l, C6956l c6956l, int i3) {
        Function1 function3;
        Function1 function4;
        c6956l.m2133new(-971111025);
        int i4 = i3 | (c6956l.billing(c0639l) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | (c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.mopub(z) ? 2048 : 1024) | (c6956l.mopub(false) ? 16384 : 8192) | (c6956l.billing(c11090l) ? 131072 : 65536) | (c6956l.billing(c3790l) ? 1048576 : 524288) | (c6956l.billing(c6973l) ? 8388608 : 4194304) | (c6956l.mopub(z2) ? 67108864 : 33554432) | (c6956l.amazon(i) ? 536870912 : 268435456);
        int i5 = 196608 | (c6956l.amazon(i2) ? 4 : 2) | (c6956l.billing(c10754l) ? 32 : 16) | 384 | (c6956l.billing(c2403l) ? 2048 : 1024) | (c6956l.billing(c8990l) ? 16384 : 8192);
        if (c6956l.m2127for(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            c6956l.m2141switch();
            int i6 = i3 & 1;
            C13863l c13863l = C1867l.yandex;
            if (i6 == 0 || c6956l.ad()) {
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = new C10351l(13);
                    c6956l.m2147try(objM2132native);
                }
                function4 = (Function1) objM2132native;
            } else {
                c6956l.m2124else();
                function4 = function2;
            }
            c6956l.adcel();
            C14966l c14966lAmazon = c3790l.amazon(z2);
            boolean z3 = !z2;
            int i7 = z2 ? 1 : i2;
            int i8 = z2 ? 1 : i;
            boolean z4 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object objM2132native2 = c6956l.m2132native();
            if (z4 || objM2132native2 == c13863l) {
                objM2132native2 = new C0464l(c0639l, function1, 16);
                c6956l.m2147try(objM2132native2);
            }
            int i9 = i5 << 9;
            AbstractC16817l.loadAd(c0639l, (Function1) objM2132native2, interfaceC17242l, c11090l, c10754l, function4, c2403l, c8990l, z3, i8, i7, c14966lAmazon, c6973l, z, c15578l, c6956l, (i4 & 910) | ((i4 >> 6) & 7168) | (i9 & 57344) | 196608 | (i9 & 3670016) | (i9 & 29360128), ((i4 >> 15) & 896) | (i4 & 7168) | (i4 & 57344) | 196608);
            function3 = function4;
        } else {
            c6956l.m2124else();
            function3 = function2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14604l(c0639l, function1, interfaceC17242l, z, c11090l, c3790l, c6973l, z2, i, i2, c10754l, function3, c2403l, c8990l, c15578l, i3);
        }
    }

    public static final void loadAd(final C10178l c10178l, final InterfaceC17242l interfaceC17242l, final boolean z, final InterfaceC13142l interfaceC13142l, final C11090l c11090l, final C3790l c3790l, final InterfaceC11381l interfaceC11381l, final InterfaceC15892l interfaceC15892l, final C2403l c2403l, final AbstractC9544l abstractC9544l, final InterfaceC17727l interfaceC17727l, final C11194l c11194l, C6956l c6956l, final int i) {
        c6956l.m2133new(469439921);
        int i2 = i | (c6956l.billing(c10178l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.mopub(z) ? 256 : 128) | (c6956l.mopub(false) ? 2048 : 1024) | (c6956l.billing(interfaceC13142l) ? 16384 : 8192) | (c6956l.billing(c11090l) ? 131072 : 65536) | (c6956l.billing(c3790l) ? 1048576 : 524288) | (c6956l.billing(interfaceC11381l) ? 8388608 : 4194304) | (c6956l.billing(interfaceC15892l) ? 67108864 : 33554432) | (c6956l.admob(null) ? 536870912 : 268435456);
        int i3 = 128;
        int i4 = (c6956l.billing(c2403l) ? 4 : 2) | (c6956l.billing(abstractC9544l) ? 32 : 16);
        if (c6956l.billing(null)) {
            i3 = 256;
        }
        int i5 = i4 | i3 | (c6956l.billing(interfaceC17727l) ? 2048 : 1024) | (c6956l.billing(c11194l) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, ((306783379 & i2) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            int i6 = (i5 & 14) | 384 | (i5 & 112);
            int i7 = i5 << 3;
            yandex(c10178l, interfaceC17242l, z, interfaceC13142l, c11090l, c3790l, interfaceC11381l, interfaceC15892l, c2403l, abstractC9544l, null, interfaceC17727l, c11194l, false, c6956l, i2 & 2147483646, (i7 & 7168) | i6 | (57344 & i7) | (i7 & 458752), 65536);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l, z, interfaceC13142l, c11090l, c3790l, interfaceC11381l, interfaceC15892l, c2403l, abstractC9544l, interfaceC17727l, c11194l, i) { // from class: lِِّ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ boolean f24719l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC11381l f24720l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC15892l f24721l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f24722l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ AbstractC9544l f24724l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ C11090l f24725l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC13142l f24726l;

                /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
                public final /* synthetic */ C11194l f24727l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C2403l f24728l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C3790l f24729l;

                /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17727l f24730l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    AbstractC16363l.loadAd(this.f24723l, this.f24722l, this.f24719l, this.f24726l, this.f24725l, this.f24729l, this.f24720l, this.f24721l, this.f24728l, this.f24724l, this.f24730l, this.f24727l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void purchase(C12217l c12217l, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(1991581797);
        int i2 = 2;
        int i3 = (c6956l.admob(c12217l) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zBilling = c6956l.billing(c12217l);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.mopub(new C18497l(c12217l, i2));
                c6956l.m2147try(objM2132native);
            }
            if (((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue()) {
                c6956l.m2123default(535437134);
                boolean zAdmob = c6956l.admob(c12217l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C12561l(c12217l, 0);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC7316l interfaceC7316l = (InterfaceC7316l) objM2132native2;
                boolean zAdmob2 = c6956l.admob(c12217l);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob2 || objM2132native3 == c13863l) {
                    objM2132native3 = new C12514l(c12217l, i4);
                    c6956l.m2147try(objM2132native3);
                }
                c6956l2 = c6956l;
                AbstractC6852l.yandex(interfaceC7316l, new C8110l(c12217l, null, null, (PointerInputEventHandler) objM2132native3, 6), yandex, c6956l2, 384, 0);
                c6956l2.startapp(false);
            } else {
                c6956l2 = c6956l;
                c6956l2.m2123default(535820573);
                c6956l2.startapp(false);
            }
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12715l(c12217l, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015a  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0165  */
    /* JADX WARN: Code duplicated, block: B:124:0x016a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0170  */
    /* JADX WARN: Code duplicated, block: B:128:0x0176  */
    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01af  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0203  */
    /* JADX WARN: Code duplicated, block: B:161:0x020e  */
    /* JADX WARN: Code duplicated, block: B:162:0x021b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0226  */
    /* JADX WARN: Code duplicated, block: B:166:0x0228  */
    /* JADX WARN: Code duplicated, block: B:169:0x0231  */
    /* JADX WARN: Code duplicated, block: B:170:0x0233  */
    /* JADX WARN: Code duplicated, block: B:173:0x023b  */
    /* JADX WARN: Code duplicated, block: B:174:0x023d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0245 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x024b  */
    /* JADX WARN: Code duplicated, block: B:181:0x024e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0250  */
    /* JADX WARN: Code duplicated, block: B:186:0x0265 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x0267  */
    /* JADX WARN: Code duplicated, block: B:190:0x0273  */
    /* JADX WARN: Code duplicated, block: B:191:0x0278  */
    /* JADX WARN: Code duplicated, block: B:194:0x0283  */
    /* JADX WARN: Code duplicated, block: B:197:0x0298  */
    /* JADX WARN: Code duplicated, block: B:200:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:209:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0330  */
    /* JADX WARN: Code duplicated, block: B:213:0x0349  */
    /* JADX WARN: Code duplicated, block: B:214:0x034b  */
    /* JADX WARN: Code duplicated, block: B:217:0x036c  */
    /* JADX WARN: Code duplicated, block: B:218:0x036e  */
    /* JADX WARN: Code duplicated, block: B:221:0x0376  */
    /* JADX WARN: Code duplicated, block: B:222:0x0378  */
    /* JADX WARN: Code duplicated, block: B:225:0x0382  */
    /* JADX WARN: Code duplicated, block: B:226:0x0384  */
    /* JADX WARN: Code duplicated, block: B:229:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:230:0x038e  */
    /* JADX WARN: Code duplicated, block: B:235:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:241:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:243:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x03de  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:248:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:249:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:251:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:252:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:255:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x040a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0445  */
    /* JADX WARN: Code duplicated, block: B:264:0x044b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0451  */
    /* JADX WARN: Code duplicated, block: B:269:0x0457  */
    /* JADX WARN: Code duplicated, block: B:271:0x045e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0461  */
    /* JADX WARN: Code duplicated, block: B:275:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:276:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:278:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:281:0x050c  */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    public static final void yandex(final C10178l c10178l, final InterfaceC17242l interfaceC17242l, final boolean z, final InterfaceC13142l interfaceC13142l, final C11090l c11090l, final C3790l c3790l, final InterfaceC11381l interfaceC11381l, final InterfaceC15892l interfaceC15892l, final C2403l c2403l, final AbstractC9544l abstractC9544l, final InterfaceC1832l interfaceC1832l, final InterfaceC17727l interfaceC17727l, final C11194l c11194l, boolean z2, C6956l c6956l, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        final boolean z4;
        C6956l c6956l2;
        boolean z5;
        C4224l c4224lAds;
        boolean z6;
        InterfaceC13490l interfaceC13490l;
        EnumC9931l enumC9931l;
        final boolean zYandex;
        C13863l c13863l;
        C2403l c2403l2;
        EnumC7283l enumC7283l;
        EnumC7283l enumC7283l2;
        Object objM2132native;
        InterfaceC5995l interfaceC5995l;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objM2132native2;
        InterfaceC1832l interfaceC1832l2;
        C16328l c16328l;
        boolean zBilling;
        Object objM2132native3;
        C10312l c10312l;
        C3790l c3790lMetrica;
        Object objM2132native4;
        InterfaceC2262l interfaceC2262l;
        C10537l c10537lMo3369default;
        final InterfaceC13515l interfaceC13515lLoadAd;
        Object objM2132native5;
        C10715l c10715l;
        InterfaceC7948l interfaceC7948l;
        boolean zBilling2;
        InterfaceC7948l interfaceC7948l2;
        Object c12217l;
        InterfaceC13490l interfaceC13490l2;
        int i7;
        C6956l c6956l3;
        InterfaceC5995l interfaceC5995l2;
        C10312l c10312l2;
        final C10715l c10715l2;
        InterfaceC2262l interfaceC2262l2;
        C12217l c12217l2;
        final InterfaceC1234l interfaceC1234l;
        boolean zBilling3;
        Object objM2132native6;
        final C7811l c7811l;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM2132native7;
        final C12217l c12217l3;
        final C16328l c16328l2;
        boolean z16;
        boolean zAdmob;
        Object objM2132native8;
        boolean z17;
        boolean z18;
        boolean zMopub;
        Object objM2132native9;
        boolean z19;
        C2403l c2403l3;
        boolean z20;
        EnumC7283l enumC7283l3;
        boolean z21;
        C16395l c16395l;
        EnumC7283l enumC7283l4;
        int i8;
        boolean z22;
        boolean z23;
        Object objM2132native10;
        boolean zAdmob2;
        c6956l.m2133new(965149429);
        if ((i & 6) == 0) {
            i4 = (c6956l.billing(c10178l) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= c6956l.mopub(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= c6956l.billing(interfaceC13142l) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= c6956l.billing(c11090l) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= c6956l.billing(c3790l) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= c6956l.billing(interfaceC11381l) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= c6956l.billing(interfaceC15892l) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= c6956l.admob(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (c6956l.billing(c2403l) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c6956l.billing(abstractC9544l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c6956l.billing(interfaceC1832l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i9 = i5;
        if ((i3 & 8192) == 0) {
            if ((i2 & 3072) == 0) {
                i9 |= c6956l.billing(null) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                if ((32768 & i2) == 0) {
                    zAdmob2 = c6956l.billing(interfaceC17727l);
                } else {
                    zAdmob2 = c6956l.admob(interfaceC17727l);
                }
                i9 |= zAdmob2 ? 16384 : 8192;
            }
            if ((i2 & 196608) != 0) {
                i9 |= c6956l.billing(c11194l) ? 131072 : 65536;
            }
            i6 = i3 & 65536;
            if (i6 != 0) {
                i9 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i9 |= c6956l.mopub(z2) ? 1048576 : 524288;
            }
            if ((i4 & 306783379) == 306783378 || (599187 & i9) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i4 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i6 != 0) {
                        z6 = false;
                    }
                    c6956l.adcel();
                    interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                    enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
                    zYandex = AbstractC8576l.yandex(interfaceC15892l, C11485l.f23084l);
                    c13863l = C1867l.yandex;
                    if (c2403l == null) {
                        c6956l.m2123default(-2038132442);
                        objM2132native10 = c6956l.m2132native();
                        if (objM2132native10 == c13863l) {
                            objM2132native10 = AbstractC14814l.isPro(c6956l);
                        }
                        c6956l.startapp(false);
                        c2403l2 = (C2403l) objM2132native10;
                    } else {
                        c6956l.m2123default(-204294191);
                        c6956l.startapp(false);
                        c2403l2 = c2403l;
                    }
                    enumC7283l = EnumC7283l.f15126l;
                    if (zYandex) {
                        enumC7283l2 = EnumC7283l.f15125l;
                    } else {
                        enumC7283l2 = enumC7283l;
                    }
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == c13863l) {
                        C8490l c8490lLoadAd = AbstractC3861l.loadAd(0, 3, 2);
                        c6956l.m2147try(c8490lLoadAd);
                        objM2132native = c8490lLoadAd;
                    }
                    interfaceC5995l = (InterfaceC5995l) objM2132native;
                    if ((i4 & 14) == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i9 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z24 = z8 | z7;
                    if ((i9 & 7168) == 2048) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z24 | z9;
                    objM2132native2 = c6956l.m2132native();
                    if (z10 || objM2132native2 == c13863l) {
                        if (interfaceC1832l != null) {
                            interfaceC1832l2 = interfaceC1832l;
                        } else if (zYandex) {
                            interfaceC1832l2 = C5603l.yandex;
                        } else {
                            interfaceC1832l2 = null;
                        }
                        objM2132native2 = new C16328l(c10178l, interfaceC13142l, interfaceC1832l2);
                        c6956l.m2147try(objM2132native2);
                    }
                    c16328l = (C16328l) objM2132native2;
                    zBilling = c6956l.billing(c16328l);
                    objM2132native3 = c6956l.m2132native();
                    if (zBilling || objM2132native3 == c13863l) {
                        objM2132native3 = new C10312l();
                        c6956l.m2147try(objM2132native3);
                    }
                    c10312l = (C10312l) objM2132native3;
                    if (interfaceC13142l != null) {
                        c3790lMetrica = interfaceC13142l.metrica();
                    } else {
                        c3790lMetrica = null;
                    }
                    final C3790l c3790lYandex = c3790l.yandex(c3790lMetrica);
                    objM2132native4 = c6956l.m2132native();
                    if (objM2132native4 == c13863l) {
                        objM2132native4 = AbstractC12311l.isPro(c6956l);
                        c6956l.m2147try(objM2132native4);
                    }
                    interfaceC2262l = (InterfaceC2262l) objM2132native4;
                    c6956l.m2123default(-2036249936);
                    c10537lMo3369default = c11090l.yandex.firebase;
                    if (c10537lMo3369default == null) {
                        C10537l c10537l = C10537l.f21447l;
                        c10537lMo3369default = AbstractC4189l.yandex.mo3369default();
                    }
                    interfaceC13515lLoadAd = AbstractC16692l.loadAd(EnumC16103l.f31560l, c10537lMo3369default, c6956l, 6);
                    c6956l.startapp(false);
                    objM2132native5 = c6956l.m2132native();
                    if (objM2132native5 == c13863l) {
                        objM2132native5 = new C10715l();
                        c6956l.m2147try(objM2132native5);
                    }
                    c10715l = (C10715l) objM2132native5;
                    interfaceC7948l = (InterfaceC7948l) c6956l.isPro(AbstractC4751l.billing);
                    zBilling2 = c6956l.billing(c16328l);
                    Object objM2132native11 = c6956l.m2132native();
                    if (!zBilling2 || objM2132native11 == c13863l) {
                        int i10 = i9;
                        interfaceC7948l2 = interfaceC7948l;
                        interfaceC13490l2 = interfaceC13490l;
                        i7 = i10;
                        c6956l3 = c6956l;
                        interfaceC5995l2 = interfaceC5995l;
                        c12217l = new C12217l(c16328l, c10312l, interfaceC13490l2, z, z6, c10715l, interfaceC2262l, interfaceC13515lLoadAd, interfaceC7948l2);
                        c10312l2 = c10312l;
                        c10715l2 = c10715l;
                        interfaceC2262l2 = interfaceC2262l;
                        c6956l3.m2147try(c12217l);
                    } else {
                        c10312l2 = c10312l;
                        interfaceC5995l2 = interfaceC5995l;
                        interfaceC13490l2 = interfaceC13490l;
                        c10715l2 = c10715l;
                        i7 = i9;
                        interfaceC2262l2 = interfaceC2262l;
                        interfaceC7948l2 = interfaceC7948l;
                        c12217l = objM2132native11;
                        c6956l3 = c6956l;
                    }
                    c12217l2 = (C12217l) c12217l;
                    interfaceC1234l = (InterfaceC1234l) c6956l3.isPro(AbstractC4751l.smaato);
                    zBilling3 = c6956l3.billing((InterfaceC9801l) c6956l3.isPro(AbstractC4751l.ads)) | c6956l3.billing(interfaceC2262l2);
                    objM2132native6 = c6956l3.m2132native();
                    if (zBilling3 || objM2132native6 == c13863l) {
                        objM2132native6 = new C7811l();
                        c6956l3.m2147try(objM2132native6);
                    }
                    c7811l = (C7811l) objM2132native6;
                    boolean zBilling4 = c6956l3.billing(c16328l);
                    if ((57344 & i4) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zAdmob3 = z11 | zBilling4 | c6956l3.admob(c12217l2) | c6956l3.admob(interfaceC1234l) | c6956l3.admob(interfaceC7948l2) | c6956l3.billing(c7811l) | c6956l3.billing(interfaceC13490l2);
                    if ((i4 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z25 = zAdmob3 | z12;
                    if ((i4 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z26 = z25 | z13;
                    if ((i7 & 3670016) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z26 | z14;
                    objM2132native7 = c6956l3.m2132native();
                    if (!z15 || objM2132native7 == c13863l) {
                        final InterfaceC13490l interfaceC13490l3 = interfaceC13490l2;
                        c12217l3 = c12217l2;
                        final InterfaceC7948l interfaceC7948l3 = interfaceC7948l2;
                        final boolean z27 = z6;
                        c16328l2 = c16328l;
                        Function0 function0 = new Function0(interfaceC13142l, c12217l3, interfaceC1234l, interfaceC7948l3, c7811l, interfaceC13490l3, z, z27) { // from class: lۣ٘ؗ

                            /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                            public final /* synthetic */ C12217l f34528l;

                            /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                            public final /* synthetic */ boolean f34529l;

                            /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                            public final /* synthetic */ boolean f34530l;

                            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                            public final /* synthetic */ InterfaceC13142l f34531l;

                            /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                            public final /* synthetic */ InterfaceC7948l f34533l;

                            /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                            public final /* synthetic */ InterfaceC1234l f34534l;

                            /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                            public final /* synthetic */ InterfaceC13490l f34535l;

                            {
                                this.f34535l = interfaceC13490l3;
                                this.f34529l = z;
                                this.f34530l = z27;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                C4451l c4451l;
                                C7504l c7504l;
                                this.f34532l.loadAd = this.f34531l;
                                C12217l c12217l4 = this.f34528l;
                                boolean z28 = this.f34529l;
                                if (!z28 && (c4451l = c12217l4.purchase.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                                    c7504l.ads(null);
                                    c4451l.f9058l = null;
                                }
                                c12217l4.firebase = this.f34534l;
                                c12217l4.admob = this.f34533l;
                                c12217l4.crashlytics = this.f34535l;
                                c12217l4.isPro = z28;
                                c12217l4.amazon = this.f34530l;
                                return Unit.INSTANCE;
                            }
                        };
                        z16 = z;
                        z6 = z27;
                        c6956l3.m2147try(function0);
                        objM2132native7 = function0;
                    } else {
                        z16 = z;
                        c12217l3 = c12217l2;
                        c16328l2 = c16328l;
                    }
                    AbstractC12311l.billing((Function0) objM2132native7, c6956l3);
                    zAdmob = c6956l3.admob(c12217l3);
                    objM2132native8 = c6956l3.m2132native();
                    if (!zAdmob || objM2132native8 == c13863l) {
                        z17 = false;
                        objM2132native8 = new C15419l(c12217l3, 0);
                        c6956l3.m2147try(objM2132native8);
                    } else {
                        z17 = false;
                    }
                    AbstractC12311l.loadAd(c12217l3, (Function1) objM2132native8, c6956l3);
                    if (z6) {
                        z18 = z17;
                    } else {
                        i8 = c3790l.crashlytics;
                        if (i8 == 7) {
                            z22 = true;
                        } else {
                            z22 = z17;
                        }
                        if (z22) {
                            z18 = z17;
                        } else {
                            if (i8 == 8) {
                                z23 = true;
                            } else {
                                z23 = z17;
                            }
                            if (z23) {
                                z18 = z17;
                            } else {
                                z18 = true;
                            }
                        }
                    }
                    final EnumC11107l enumC11107l = (EnumC11107l) c12217l3.ads.getValue();
                    zMopub = c6956l3.mopub(z18) | c6956l3.admob(interfaceC5995l2);
                    objM2132native9 = c6956l3.m2132native();
                    if (zMopub || objM2132native9 == c13863l) {
                        objM2132native9 = new C10041l(z18, interfaceC5995l2, 1);
                        c6956l3.m2147try(objM2132native9);
                    }
                    InterfaceC17242l interfaceC17242lBilling = AbstractC6900l.billing(interfaceC17242l, z16, z18, (Function0) objM2132native9);
                    z19 = z17;
                    boolean z28 = z6;
                    C2403l c2403l4 = c2403l2;
                    C4577l c4577l = new C4577l(c16328l2, c10312l2, c12217l3, interfaceC13142l, z16, c3790lYandex, interfaceC11381l, zYandex, c2403l4, z28, interfaceC5995l2);
                    final C16328l c16328l3 = c16328l2;
                    c2403l3 = c2403l4;
                    z5 = z28;
                    final C12217l c12217l4 = c12217l3;
                    InterfaceC17242l interfaceC17242lPremium = interfaceC17242lBilling.premium(c4577l);
                    if (z || enumC11107l != EnumC11107l.f22312l) {
                        z20 = z19;
                    } else {
                        z20 = true;
                    }
                    if (enumC9931l == EnumC9931l.f20222l) {
                        enumC7283l4 = enumC7283l2;
                        if (enumC7283l4 != enumC7283l) {
                            z21 = z19;
                        } else {
                            z21 = true;
                        }
                        enumC7283l3 = enumC7283l4;
                    } else {
                        c2403l3 = c2403l3;
                        enumC7283l3 = enumC7283l2;
                        z21 = true;
                    }
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC13611l.billing(interfaceC17242lPremium, c11194l, enumC7283l3, z20, z21, c2403l3);
                    final EnumC7283l enumC7283l5 = enumC7283l3;
                    final C2403l c2403l5 = c2403l3;
                    InterfaceC11325l.yandex.getClass();
                    InterfaceC17242l interfaceC17242lYandex = AbstractC7280l.yandex(AbstractC15269l.crashlytics(interfaceC17242lBilling2, AbstractC4047l.loadAd), new C2736l(c12217l4, interfaceC2262l2, 16));
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                    long j = c6956l.f14595continue;
                    int i11 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
                    InterfaceC8801l.firebase.getClass();
                    c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l, Integer.valueOf(i11), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, C3438l.amazon);
                    z4 = z;
                    c6956l2 = c6956l;
                    final C10312l c10312l3 = c10312l2;
                    AbstractC1896l.crashlytics(c12217l4, z4, AbstractC14566l.amazon(-673241599, new Function2() { // from class: lُؐؐ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                InterfaceC17727l interfaceC17727l2 = interfaceC17727l;
                                if (interfaceC17727l2 == null) {
                                    interfaceC17727l2 = C15718l.f30861l;
                                }
                                final C2403l c2403l6 = c2403l5;
                                final InterfaceC15892l interfaceC15892l2 = interfaceC15892l;
                                final C11090l c11090l2 = c11090l;
                                final C10312l c10312l4 = c10312l3;
                                final boolean z29 = zYandex;
                                final EnumC11107l enumC11107l2 = enumC11107l;
                                final C16328l c16328l4 = c16328l3;
                                final C12217l c12217l5 = c12217l4;
                                final AbstractC9544l abstractC9544l2 = abstractC9544l;
                                final boolean z30 = z4;
                                final C11194l c11194l2 = c11194l;
                                final EnumC7283l enumC7283l6 = enumC7283l5;
                                final C10715l c10715l3 = c10715l2;
                                final InterfaceC13515l interfaceC13515l = interfaceC13515lLoadAd;
                                final C3790l c3790l2 = c3790lYandex;
                                interfaceC17727l2.crashlytics(AbstractC14566l.amazon(1969169726, new Function2() { // from class: lِٔۥ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        C6956l c6956l5 = (C6956l) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            C2403l c2403l7 = c2403l6;
                                            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l7, c6956l5, 0);
                                            Object objM2132native12 = c6956l5.m2132native();
                                            C13863l c13863l2 = C1867l.yandex;
                                            if (objM2132native12 == c13863l2) {
                                                objM2132native12 = AbstractC8020l.smaato(Boolean.FALSE);
                                                c6956l5.m2147try(objM2132native12);
                                            }
                                            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native12;
                                            boolean zBilling5 = c6956l5.billing(c2403l7);
                                            Object objM2132native13 = c6956l5.m2132native();
                                            if (zBilling5 || objM2132native13 == c13863l2) {
                                                objM2132native13 = new C15416l(c2403l7, interfaceC8714l, null, 0);
                                                c6956l5.m2147try(objM2132native13);
                                            }
                                            AbstractC12311l.amazon(c6956l5, c2403l7, (Function2) objM2132native13);
                                            InterfaceC2229l interfaceC2229l = (InterfaceC2229l) c6956l5.isPro(AbstractC4751l.Signature);
                                            boolean zBilling6 = c6956l5.billing(c2403l7) | c6956l5.billing(interfaceC2229l);
                                            Object objM2132native14 = c6956l5.m2132native();
                                            if (zBilling6 || objM2132native14 == c13863l2) {
                                                objM2132native14 = AbstractC8020l.mopub(new Ctry(interfaceC2229l, interfaceC8714lLoadAd, 18));
                                                c6956l5.m2147try(objM2132native14);
                                            }
                                            InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native14;
                                            ((Boolean) interfaceC8714lLoadAd.getValue()).getClass();
                                            int i12 = interfaceC15892l2 instanceof C5083l ? Integer.MAX_VALUE : 1;
                                            C10312l c10312l5 = c10312l4;
                                            InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(C4346l.f8873l, new C1350l(4, c10312l5));
                                            AbstractC17653l.purchase(1, i12);
                                            C11090l c11090l3 = c11090l2;
                                            boolean z31 = z29;
                                            if (i12 != Integer.MAX_VALUE && !z31) {
                                                interfaceC17242lM3537else = interfaceC17242lM3537else.premium(new C16695l(c11090l3, 1, i12));
                                            }
                                            InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(interfaceC17242lM3537else.premium(new C4544l(c11090l3)));
                                            boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
                                            boolean zBooleanValue2 = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                                            boolean z32 = enumC11107l2 == EnumC11107l.f22311l;
                                            C16328l c16328l5 = c16328l4;
                                            C12217l c12217l6 = c12217l5;
                                            AbstractC9544l abstractC9544l3 = abstractC9544l2;
                                            boolean z33 = z30;
                                            InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lAmazon.premium(new C5460l(zBooleanValue, zBooleanValue2, z32, c10312l5, c16328l5, c12217l6, abstractC9544l3, z33, c11194l2, enumC7283l6, c10715l3, interfaceC13515l));
                                            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, true);
                                            long j2 = c6956l5.f14595continue;
                                            int i13 = (int) (j2 ^ (j2 >>> 32));
                                            InterfaceC18556l interfaceC18556lSmaato2 = c6956l5.smaato();
                                            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l5, interfaceC17242lPremium2);
                                            InterfaceC8801l.firebase.getClass();
                                            C16395l c16395l2 = C3438l.loadAd;
                                            c6956l5.m2140super();
                                            if (c6956l5.f14603switch) {
                                                c6956l5.firebase(c16395l2);
                                            } else {
                                                c6956l5.m2136protected();
                                            }
                                            AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon2, C3438l.mopub);
                                            AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato2, C3438l.billing);
                                            AbstractC8182l.billing(c6956l5, Integer.valueOf(i13), C3438l.isPro);
                                            AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                                            AbstractC8182l.billing(c6956l5, interfaceC17242lBilling4, C3438l.amazon);
                                            AbstractC9383l.yandex(new C9634l(c10312l5, c16328l5, c11090l3, z31, c3790l2), c6956l5, 0);
                                            if (z33 && ((Boolean) interfaceC12244l.getValue()).booleanValue() && ((Boolean) c12217l6.smaato.getValue()).booleanValue()) {
                                                c6956l5.m2123default(-810654004);
                                                AbstractC16363l.billing(c12217l6, c6956l5, 0);
                                                c6956l5.m2123default(-810526873);
                                                AbstractC16363l.purchase(c12217l6, c6956l5, 0);
                                                c6956l5.startapp(false);
                                                c6956l5.startapp(false);
                                            } else {
                                                c6956l5.m2123default(-810390690);
                                                c6956l5.startapp(false);
                                            }
                                            c6956l5.startapp(true);
                                        } else {
                                            c6956l5.m2124else();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, c6956l4), c6956l4, 6);
                            } else {
                                c6956l4.m2124else();
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l2), c6956l2, ((i4 >> 3) & 112) | 384);
                    c6956l2.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                z6 = z2;
                c6956l.adcel();
                interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
                zYandex = AbstractC8576l.yandex(interfaceC15892l, C11485l.f23084l);
                c13863l = C1867l.yandex;
                if (c2403l == null) {
                    c6956l.m2123default(-2038132442);
                    objM2132native10 = c6956l.m2132native();
                    if (objM2132native10 == c13863l) {
                        objM2132native10 = AbstractC14814l.isPro(c6956l);
                    }
                    c6956l.startapp(false);
                    c2403l2 = (C2403l) objM2132native10;
                } else {
                    c6956l.m2123default(-204294191);
                    c6956l.startapp(false);
                    c2403l2 = c2403l;
                }
                enumC7283l = EnumC7283l.f15126l;
                if (zYandex) {
                    enumC7283l2 = EnumC7283l.f15125l;
                } else {
                    enumC7283l2 = enumC7283l;
                }
                objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    C8490l c8490lLoadAd2 = AbstractC3861l.loadAd(0, 3, 2);
                    c6956l.m2147try(c8490lLoadAd2);
                    objM2132native = c8490lLoadAd2;
                }
                interfaceC5995l = (InterfaceC5995l) objM2132native;
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i9 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z29 = z8 | z7;
                if ((i9 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = z29 | z9;
                objM2132native2 = c6956l.m2132native();
                if (z10) {
                    if (interfaceC1832l != null) {
                        interfaceC1832l2 = interfaceC1832l;
                    } else if (zYandex) {
                        interfaceC1832l2 = C5603l.yandex;
                    } else {
                        interfaceC1832l2 = null;
                    }
                    objM2132native2 = new C16328l(c10178l, interfaceC13142l, interfaceC1832l2);
                    c6956l.m2147try(objM2132native2);
                } else {
                    if (interfaceC1832l != null) {
                        interfaceC1832l2 = interfaceC1832l;
                    } else if (zYandex) {
                        interfaceC1832l2 = C5603l.yandex;
                    } else {
                        interfaceC1832l2 = null;
                    }
                    objM2132native2 = new C16328l(c10178l, interfaceC13142l, interfaceC1832l2);
                    c6956l.m2147try(objM2132native2);
                }
                c16328l = (C16328l) objM2132native2;
                zBilling = c6956l.billing(c16328l);
                objM2132native3 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native3 = new C10312l();
                    c6956l.m2147try(objM2132native3);
                } else {
                    objM2132native3 = new C10312l();
                    c6956l.m2147try(objM2132native3);
                }
                c10312l = (C10312l) objM2132native3;
                if (interfaceC13142l != null) {
                    c3790lMetrica = interfaceC13142l.metrica();
                } else {
                    c3790lMetrica = null;
                }
                final C3790l c3790lYandex2 = c3790l.yandex(c3790lMetrica);
                objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == c13863l) {
                    objM2132native4 = AbstractC12311l.isPro(c6956l);
                    c6956l.m2147try(objM2132native4);
                }
                interfaceC2262l = (InterfaceC2262l) objM2132native4;
                c6956l.m2123default(-2036249936);
                c10537lMo3369default = c11090l.yandex.firebase;
                if (c10537lMo3369default == null) {
                    C10537l c10537l2 = C10537l.f21447l;
                    c10537lMo3369default = AbstractC4189l.yandex.mo3369default();
                }
                interfaceC13515lLoadAd = AbstractC16692l.loadAd(EnumC16103l.f31560l, c10537lMo3369default, c6956l, 6);
                c6956l.startapp(false);
                objM2132native5 = c6956l.m2132native();
                if (objM2132native5 == c13863l) {
                    objM2132native5 = new C10715l();
                    c6956l.m2147try(objM2132native5);
                }
                c10715l = (C10715l) objM2132native5;
                interfaceC7948l = (InterfaceC7948l) c6956l.isPro(AbstractC4751l.billing);
                zBilling2 = c6956l.billing(c16328l);
                Object objM2132native12 = c6956l.m2132native();
                if (zBilling2) {
                    int i12 = i9;
                    interfaceC7948l2 = interfaceC7948l;
                    interfaceC13490l2 = interfaceC13490l;
                    i7 = i12;
                    c6956l3 = c6956l;
                    interfaceC5995l2 = interfaceC5995l;
                    c12217l = new C12217l(c16328l, c10312l, interfaceC13490l2, z, z6, c10715l, interfaceC2262l, interfaceC13515lLoadAd, interfaceC7948l2);
                    c10312l2 = c10312l;
                    c10715l2 = c10715l;
                    interfaceC2262l2 = interfaceC2262l;
                    c6956l3.m2147try(c12217l);
                } else {
                    int i13 = i9;
                    interfaceC7948l2 = interfaceC7948l;
                    interfaceC13490l2 = interfaceC13490l;
                    i7 = i13;
                    c6956l3 = c6956l;
                    interfaceC5995l2 = interfaceC5995l;
                    c12217l = new C12217l(c16328l, c10312l, interfaceC13490l2, z, z6, c10715l, interfaceC2262l, interfaceC13515lLoadAd, interfaceC7948l2);
                    c10312l2 = c10312l;
                    c10715l2 = c10715l;
                    interfaceC2262l2 = interfaceC2262l;
                    c6956l3.m2147try(c12217l);
                }
                c12217l2 = (C12217l) c12217l;
                interfaceC1234l = (InterfaceC1234l) c6956l3.isPro(AbstractC4751l.smaato);
                zBilling3 = c6956l3.billing((InterfaceC9801l) c6956l3.isPro(AbstractC4751l.ads)) | c6956l3.billing(interfaceC2262l2);
                objM2132native6 = c6956l3.m2132native();
                if (zBilling3) {
                    objM2132native6 = new C7811l();
                    c6956l3.m2147try(objM2132native6);
                } else {
                    objM2132native6 = new C7811l();
                    c6956l3.m2147try(objM2132native6);
                }
                c7811l = (C7811l) objM2132native6;
                boolean zBilling5 = c6956l3.billing(c16328l);
                if ((57344 & i4) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zAdmob4 = z11 | zBilling5 | c6956l3.admob(c12217l2) | c6956l3.admob(interfaceC1234l) | c6956l3.admob(interfaceC7948l2) | c6956l3.billing(c7811l) | c6956l3.billing(interfaceC13490l2);
                if ((i4 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z210 = zAdmob4 | z12;
                if ((i4 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z211 = z210 | z13;
                if ((i7 & 3670016) == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z211 | z14;
                objM2132native7 = c6956l3.m2132native();
                if (z15) {
                    final InterfaceC13490l interfaceC13490l4 = interfaceC13490l2;
                    c12217l3 = c12217l2;
                    final InterfaceC7948l interfaceC7948l4 = interfaceC7948l2;
                    final boolean z212 = z6;
                    c16328l2 = c16328l;
                    Function0 function1 = new Function0(interfaceC13142l, c12217l3, interfaceC1234l, interfaceC7948l4, c7811l, interfaceC13490l4, z, z212) { // from class: lۣ٘ؗ

                        /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                        public final /* synthetic */ C12217l f34528l;

                        /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                        public final /* synthetic */ boolean f34529l;

                        /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                        public final /* synthetic */ boolean f34530l;

                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC13142l f34531l;

                        /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC7948l f34533l;

                        /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC1234l f34534l;

                        /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC13490l f34535l;

                        {
                            this.f34535l = interfaceC13490l4;
                            this.f34529l = z;
                            this.f34530l = z212;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            C4451l c4451l;
                            C7504l c7504l;
                            this.f34532l.loadAd = this.f34531l;
                            C12217l c12217l5 = this.f34528l;
                            boolean z213 = this.f34529l;
                            if (!z213 && (c4451l = c12217l5.purchase.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                                c7504l.ads(null);
                                c4451l.f9058l = null;
                            }
                            c12217l5.firebase = this.f34534l;
                            c12217l5.admob = this.f34533l;
                            c12217l5.crashlytics = this.f34535l;
                            c12217l5.isPro = z213;
                            c12217l5.amazon = this.f34530l;
                            return Unit.INSTANCE;
                        }
                    };
                    z16 = z;
                    z6 = z212;
                    c6956l3.m2147try(function1);
                    objM2132native7 = function1;
                } else {
                    final InterfaceC13490l interfaceC13490l5 = interfaceC13490l2;
                    c12217l3 = c12217l2;
                    final InterfaceC7948l interfaceC7948l5 = interfaceC7948l2;
                    final boolean z213 = z6;
                    c16328l2 = c16328l;
                    Function0 function2 = new Function0(interfaceC13142l, c12217l3, interfaceC1234l, interfaceC7948l5, c7811l, interfaceC13490l5, z, z213) { // from class: lۣ٘ؗ

                        /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                        public final /* synthetic */ C12217l f34528l;

                        /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                        public final /* synthetic */ boolean f34529l;

                        /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                        public final /* synthetic */ boolean f34530l;

                        /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC13142l f34531l;

                        /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC7948l f34533l;

                        /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC1234l f34534l;

                        /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                        public final /* synthetic */ InterfaceC13490l f34535l;

                        {
                            this.f34535l = interfaceC13490l5;
                            this.f34529l = z;
                            this.f34530l = z213;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            C4451l c4451l;
                            C7504l c7504l;
                            this.f34532l.loadAd = this.f34531l;
                            C12217l c12217l5 = this.f34528l;
                            boolean z214 = this.f34529l;
                            if (!z214 && (c4451l = c12217l5.purchase.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                                c7504l.ads(null);
                                c4451l.f9058l = null;
                            }
                            c12217l5.firebase = this.f34534l;
                            c12217l5.admob = this.f34533l;
                            c12217l5.crashlytics = this.f34535l;
                            c12217l5.isPro = z214;
                            c12217l5.amazon = this.f34530l;
                            return Unit.INSTANCE;
                        }
                    };
                    z16 = z;
                    z6 = z213;
                    c6956l3.m2147try(function2);
                    objM2132native7 = function2;
                }
                AbstractC12311l.billing((Function0) objM2132native7, c6956l3);
                zAdmob = c6956l3.admob(c12217l3);
                objM2132native8 = c6956l3.m2132native();
                if (zAdmob) {
                    z17 = false;
                    objM2132native8 = new C15419l(c12217l3, 0);
                    c6956l3.m2147try(objM2132native8);
                } else {
                    z17 = false;
                    objM2132native8 = new C15419l(c12217l3, 0);
                    c6956l3.m2147try(objM2132native8);
                }
                AbstractC12311l.loadAd(c12217l3, (Function1) objM2132native8, c6956l3);
                if (z6) {
                    z18 = z17;
                } else {
                    i8 = c3790l.crashlytics;
                    if (i8 == 7) {
                        z22 = true;
                    } else {
                        z22 = z17;
                    }
                    if (z22) {
                        z18 = z17;
                    } else {
                        if (i8 == 8) {
                            z23 = true;
                        } else {
                            z23 = z17;
                        }
                        if (z23) {
                            z18 = true;
                        } else {
                            z18 = z17;
                        }
                    }
                }
                final EnumC11107l enumC11107l2 = (EnumC11107l) c12217l3.ads.getValue();
                zMopub = c6956l3.mopub(z18) | c6956l3.admob(interfaceC5995l2);
                objM2132native9 = c6956l3.m2132native();
                if (zMopub) {
                    objM2132native9 = new C10041l(z18, interfaceC5995l2, 1);
                    c6956l3.m2147try(objM2132native9);
                } else {
                    objM2132native9 = new C10041l(z18, interfaceC5995l2, 1);
                    c6956l3.m2147try(objM2132native9);
                }
                InterfaceC17242l interfaceC17242lBilling4 = AbstractC6900l.billing(interfaceC17242l, z16, z18, (Function0) objM2132native9);
                z19 = z17;
                boolean z214 = z6;
                C2403l c2403l6 = c2403l2;
                C4577l c4577l2 = new C4577l(c16328l2, c10312l2, c12217l3, interfaceC13142l, z16, c3790lYandex2, interfaceC11381l, zYandex, c2403l6, z214, interfaceC5995l2);
                final C16328l c16328l4 = c16328l2;
                c2403l3 = c2403l6;
                z5 = z214;
                final C12217l c12217l5 = c12217l3;
                InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lBilling4.premium(c4577l2);
                if (z) {
                    z20 = z19;
                } else {
                    z20 = z19;
                }
                if (enumC9931l == EnumC9931l.f20222l) {
                    enumC7283l4 = enumC7283l2;
                    if (enumC7283l4 != enumC7283l) {
                        z21 = z19;
                    } else {
                        z21 = true;
                    }
                    enumC7283l3 = enumC7283l4;
                } else {
                    c2403l3 = c2403l3;
                    enumC7283l3 = enumC7283l2;
                    z21 = true;
                }
                InterfaceC17242l interfaceC17242lBilling5 = AbstractC13611l.billing(interfaceC17242lPremium2, c11194l, enumC7283l3, z20, z21, c2403l3);
                final EnumC7283l enumC7283l6 = enumC7283l3;
                final C2403l c2403l7 = c2403l3;
                InterfaceC11325l.yandex.getClass();
                InterfaceC17242l interfaceC17242lYandex2 = AbstractC7280l.yandex(AbstractC15269l.crashlytics(interfaceC17242lBilling5, AbstractC4047l.loadAd), new C2736l(c12217l5, interfaceC2262l2, 16));
                InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, true);
                long j2 = c6956l.f14595continue;
                int i14 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex2);
                InterfaceC8801l.firebase.getClass();
                c16395l = C3438l.loadAd;
                c6956l.m2140super();
                if (c6956l.f14603switch) {
                    c6956l.firebase(c16395l);
                } else {
                    c6956l.m2136protected();
                }
                AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, C3438l.mopub);
                AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, C3438l.billing);
                AbstractC8182l.billing(c6956l, Integer.valueOf(i14), C3438l.isPro);
                AbstractC8182l.purchase(c6956l, C3438l.firebase);
                AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, C3438l.amazon);
                z4 = z;
                c6956l2 = c6956l;
                final C10312l c10312l4 = c10312l2;
                AbstractC1896l.crashlytics(c12217l5, z4, AbstractC14566l.amazon(-673241599, new Function2() { // from class: lُؐؐ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        C6956l c6956l4 = (C6956l) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (c6956l4.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                            InterfaceC17727l interfaceC17727l2 = interfaceC17727l;
                            if (interfaceC17727l2 == null) {
                                interfaceC17727l2 = C15718l.f30861l;
                            }
                            final C2403l c2403l8 = c2403l7;
                            final InterfaceC15892l interfaceC15892l2 = interfaceC15892l;
                            final C11090l c11090l2 = c11090l;
                            final C10312l c10312l5 = c10312l4;
                            final boolean z215 = zYandex;
                            final EnumC11107l enumC11107l3 = enumC11107l2;
                            final C16328l c16328l5 = c16328l4;
                            final C12217l c12217l6 = c12217l5;
                            final AbstractC9544l abstractC9544l2 = abstractC9544l;
                            final boolean z30 = z4;
                            final C11194l c11194l2 = c11194l;
                            final EnumC7283l enumC7283l7 = enumC7283l6;
                            final C10715l c10715l3 = c10715l2;
                            final InterfaceC13515l interfaceC13515l = interfaceC13515lLoadAd;
                            final C3790l c3790l2 = c3790lYandex2;
                            interfaceC17727l2.crashlytics(AbstractC14566l.amazon(1969169726, new Function2() { // from class: lِٔۥ
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    C6956l c6956l5 = (C6956l) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        C2403l c2403l9 = c2403l8;
                                        InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l9, c6956l5, 0);
                                        Object objM2132native13 = c6956l5.m2132native();
                                        C13863l c13863l2 = C1867l.yandex;
                                        if (objM2132native13 == c13863l2) {
                                            objM2132native13 = AbstractC8020l.smaato(Boolean.FALSE);
                                            c6956l5.m2147try(objM2132native13);
                                        }
                                        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native13;
                                        boolean zBilling6 = c6956l5.billing(c2403l9);
                                        Object objM2132native14 = c6956l5.m2132native();
                                        if (zBilling6 || objM2132native14 == c13863l2) {
                                            objM2132native14 = new C15416l(c2403l9, interfaceC8714l, null, 0);
                                            c6956l5.m2147try(objM2132native14);
                                        }
                                        AbstractC12311l.amazon(c6956l5, c2403l9, (Function2) objM2132native14);
                                        InterfaceC2229l interfaceC2229l = (InterfaceC2229l) c6956l5.isPro(AbstractC4751l.Signature);
                                        boolean zBilling7 = c6956l5.billing(c2403l9) | c6956l5.billing(interfaceC2229l);
                                        Object objM2132native15 = c6956l5.m2132native();
                                        if (zBilling7 || objM2132native15 == c13863l2) {
                                            objM2132native15 = AbstractC8020l.mopub(new Ctry(interfaceC2229l, interfaceC8714lLoadAd, 18));
                                            c6956l5.m2147try(objM2132native15);
                                        }
                                        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native15;
                                        ((Boolean) interfaceC8714lLoadAd.getValue()).getClass();
                                        int i15 = interfaceC15892l2 instanceof C5083l ? Integer.MAX_VALUE : 1;
                                        C10312l c10312l6 = c10312l5;
                                        InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(C4346l.f8873l, new C1350l(4, c10312l6));
                                        AbstractC17653l.purchase(1, i15);
                                        C11090l c11090l3 = c11090l2;
                                        boolean z31 = z215;
                                        if (i15 != Integer.MAX_VALUE && !z31) {
                                            interfaceC17242lM3537else = interfaceC17242lM3537else.premium(new C16695l(c11090l3, 1, i15));
                                        }
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(interfaceC17242lM3537else.premium(new C4544l(c11090l3)));
                                        boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
                                        boolean zBooleanValue2 = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                                        boolean z32 = enumC11107l3 == EnumC11107l.f22311l;
                                        C16328l c16328l6 = c16328l5;
                                        C12217l c12217l7 = c12217l6;
                                        AbstractC9544l abstractC9544l3 = abstractC9544l2;
                                        boolean z33 = z30;
                                        InterfaceC17242l interfaceC17242lPremium3 = interfaceC17242lAmazon.premium(new C5460l(zBooleanValue, zBooleanValue2, z32, c10312l6, c16328l6, c12217l7, abstractC9544l3, z33, c11194l2, enumC7283l7, c10715l3, interfaceC13515l));
                                        InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, true);
                                        long j3 = c6956l5.f14595continue;
                                        int i16 = (int) (j3 ^ (j3 >>> 32));
                                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l5.smaato();
                                        InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l5, interfaceC17242lPremium3);
                                        InterfaceC8801l.firebase.getClass();
                                        C16395l c16395l2 = C3438l.loadAd;
                                        c6956l5.m2140super();
                                        if (c6956l5.f14603switch) {
                                            c6956l5.firebase(c16395l2);
                                        } else {
                                            c6956l5.m2136protected();
                                        }
                                        AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon3, C3438l.mopub);
                                        AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato3, C3438l.billing);
                                        AbstractC8182l.billing(c6956l5, Integer.valueOf(i16), C3438l.isPro);
                                        AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                                        AbstractC8182l.billing(c6956l5, interfaceC17242lBilling7, C3438l.amazon);
                                        AbstractC9383l.yandex(new C9634l(c10312l6, c16328l6, c11090l3, z31, c3790l2), c6956l5, 0);
                                        if (z33 && ((Boolean) interfaceC12244l.getValue()).booleanValue() && ((Boolean) c12217l7.smaato.getValue()).booleanValue()) {
                                            c6956l5.m2123default(-810654004);
                                            AbstractC16363l.billing(c12217l7, c6956l5, 0);
                                            c6956l5.m2123default(-810526873);
                                            AbstractC16363l.purchase(c12217l7, c6956l5, 0);
                                            c6956l5.startapp(false);
                                            c6956l5.startapp(false);
                                        } else {
                                            c6956l5.m2123default(-810390690);
                                            c6956l5.startapp(false);
                                        }
                                        c6956l5.startapp(true);
                                    } else {
                                        c6956l5.m2124else();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c6956l4), c6956l4, 6);
                        } else {
                            c6956l4.m2124else();
                        }
                        return Unit.INSTANCE;
                    }
                }, c6956l2), c6956l2, ((i4 >> 3) & 112) | 384);
                c6956l2.startapp(true);
            } else {
                z4 = z;
                c6956l2 = c6956l;
                c6956l2.m2124else();
                z5 = z2;
            }
            c4224lAds = c6956l2.ads();
            if (c4224lAds != null) {
                final boolean z30 = z4;
                final boolean z31 = z5;
                c4224lAds.amazon = new Function2() { // from class: lؘٛۥ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iPurchase = AbstractC0545l.purchase(i | 1);
                        int iPurchase2 = AbstractC0545l.purchase(i2);
                        AbstractC16363l.yandex(c10178l, interfaceC17242l, z30, interfaceC13142l, c11090l, c3790l, interfaceC11381l, interfaceC15892l, c2403l, abstractC9544l, interfaceC1832l, interfaceC17727l, c11194l, z31, (C6956l) obj, iPurchase, iPurchase2, i3);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i9 |= 3072;
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                zAdmob2 = c6956l.billing(interfaceC17727l);
            } else {
                zAdmob2 = c6956l.admob(interfaceC17727l);
            }
            i9 |= zAdmob2 ? 16384 : 8192;
        }
        if ((i2 & 196608) != 0) {
            i9 |= c6956l.billing(c11194l) ? 131072 : 65536;
        }
        i6 = i3 & 65536;
        if (i6 != 0) {
            i9 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i9 |= c6956l.mopub(z2) ? 1048576 : 524288;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (c6956l.m2127for(i4 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
            } else if (i6 != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            c6956l.adcel();
            interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
            enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
            zYandex = AbstractC8576l.yandex(interfaceC15892l, C11485l.f23084l);
            c13863l = C1867l.yandex;
            if (c2403l == null) {
                c6956l.m2123default(-2038132442);
                objM2132native10 = c6956l.m2132native();
                if (objM2132native10 == c13863l) {
                    objM2132native10 = AbstractC14814l.isPro(c6956l);
                }
                c6956l.startapp(false);
                c2403l2 = (C2403l) objM2132native10;
            } else {
                c6956l.m2123default(-204294191);
                c6956l.startapp(false);
                c2403l2 = c2403l;
            }
            enumC7283l = EnumC7283l.f15126l;
            if (zYandex) {
                enumC7283l2 = EnumC7283l.f15125l;
            } else {
                enumC7283l2 = enumC7283l;
            }
            objM2132native = c6956l.m2132native();
            if (objM2132native == c13863l) {
                C8490l c8490lLoadAd3 = AbstractC3861l.loadAd(0, 3, 2);
                c6956l.m2147try(c8490lLoadAd3);
                objM2132native = c8490lLoadAd3;
            }
            interfaceC5995l = (InterfaceC5995l) objM2132native;
            if ((i4 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i9 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z215 = z8 | z7;
            if ((i9 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = z215 | z9;
            objM2132native2 = c6956l.m2132native();
            if (z10) {
                if (interfaceC1832l != null) {
                    interfaceC1832l2 = interfaceC1832l;
                } else if (zYandex) {
                    interfaceC1832l2 = C5603l.yandex;
                } else {
                    interfaceC1832l2 = null;
                }
                objM2132native2 = new C16328l(c10178l, interfaceC13142l, interfaceC1832l2);
                c6956l.m2147try(objM2132native2);
            } else {
                if (interfaceC1832l != null) {
                    interfaceC1832l2 = interfaceC1832l;
                } else if (zYandex) {
                    interfaceC1832l2 = C5603l.yandex;
                } else {
                    interfaceC1832l2 = null;
                }
                objM2132native2 = new C16328l(c10178l, interfaceC13142l, interfaceC1832l2);
                c6956l.m2147try(objM2132native2);
            }
            c16328l = (C16328l) objM2132native2;
            zBilling = c6956l.billing(c16328l);
            objM2132native3 = c6956l.m2132native();
            if (zBilling) {
                objM2132native3 = new C10312l();
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = new C10312l();
                c6956l.m2147try(objM2132native3);
            }
            c10312l = (C10312l) objM2132native3;
            if (interfaceC13142l != null) {
                c3790lMetrica = interfaceC13142l.metrica();
            } else {
                c3790lMetrica = null;
            }
            final C3790l c3790lYandex3 = c3790l.yandex(c3790lMetrica);
            objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == c13863l) {
                objM2132native4 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native4);
            }
            interfaceC2262l = (InterfaceC2262l) objM2132native4;
            c6956l.m2123default(-2036249936);
            c10537lMo3369default = c11090l.yandex.firebase;
            if (c10537lMo3369default == null) {
                C10537l c10537l3 = C10537l.f21447l;
                c10537lMo3369default = AbstractC4189l.yandex.mo3369default();
            }
            interfaceC13515lLoadAd = AbstractC16692l.loadAd(EnumC16103l.f31560l, c10537lMo3369default, c6956l, 6);
            c6956l.startapp(false);
            objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == c13863l) {
                objM2132native5 = new C10715l();
                c6956l.m2147try(objM2132native5);
            }
            c10715l = (C10715l) objM2132native5;
            interfaceC7948l = (InterfaceC7948l) c6956l.isPro(AbstractC4751l.billing);
            zBilling2 = c6956l.billing(c16328l);
            Object objM2132native13 = c6956l.m2132native();
            if (zBilling2) {
                int i15 = i9;
                interfaceC7948l2 = interfaceC7948l;
                interfaceC13490l2 = interfaceC13490l;
                i7 = i15;
                c6956l3 = c6956l;
                interfaceC5995l2 = interfaceC5995l;
                c12217l = new C12217l(c16328l, c10312l, interfaceC13490l2, z, z6, c10715l, interfaceC2262l, interfaceC13515lLoadAd, interfaceC7948l2);
                c10312l2 = c10312l;
                c10715l2 = c10715l;
                interfaceC2262l2 = interfaceC2262l;
                c6956l3.m2147try(c12217l);
            } else {
                int i16 = i9;
                interfaceC7948l2 = interfaceC7948l;
                interfaceC13490l2 = interfaceC13490l;
                i7 = i16;
                c6956l3 = c6956l;
                interfaceC5995l2 = interfaceC5995l;
                c12217l = new C12217l(c16328l, c10312l, interfaceC13490l2, z, z6, c10715l, interfaceC2262l, interfaceC13515lLoadAd, interfaceC7948l2);
                c10312l2 = c10312l;
                c10715l2 = c10715l;
                interfaceC2262l2 = interfaceC2262l;
                c6956l3.m2147try(c12217l);
            }
            c12217l2 = (C12217l) c12217l;
            interfaceC1234l = (InterfaceC1234l) c6956l3.isPro(AbstractC4751l.smaato);
            zBilling3 = c6956l3.billing((InterfaceC9801l) c6956l3.isPro(AbstractC4751l.ads)) | c6956l3.billing(interfaceC2262l2);
            objM2132native6 = c6956l3.m2132native();
            if (zBilling3) {
                objM2132native6 = new C7811l();
                c6956l3.m2147try(objM2132native6);
            } else {
                objM2132native6 = new C7811l();
                c6956l3.m2147try(objM2132native6);
            }
            c7811l = (C7811l) objM2132native6;
            boolean zBilling6 = c6956l3.billing(c16328l);
            if ((57344 & i4) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zAdmob5 = z11 | zBilling6 | c6956l3.admob(c12217l2) | c6956l3.admob(interfaceC1234l) | c6956l3.admob(interfaceC7948l2) | c6956l3.billing(c7811l) | c6956l3.billing(interfaceC13490l2);
            if ((i4 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z216 = zAdmob5 | z12;
            if ((i4 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z217 = z216 | z13;
            if ((i7 & 3670016) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z217 | z14;
            objM2132native7 = c6956l3.m2132native();
            if (z15) {
                final InterfaceC13490l interfaceC13490l6 = interfaceC13490l2;
                c12217l3 = c12217l2;
                final InterfaceC7948l interfaceC7948l6 = interfaceC7948l2;
                final boolean z218 = z6;
                c16328l2 = c16328l;
                Function0 function3 = new Function0(interfaceC13142l, c12217l3, interfaceC1234l, interfaceC7948l6, c7811l, interfaceC13490l6, z, z218) { // from class: lۣ٘ؗ

                    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                    public final /* synthetic */ C12217l f34528l;

                    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                    public final /* synthetic */ boolean f34529l;

                    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                    public final /* synthetic */ boolean f34530l;

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC13142l f34531l;

                    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC7948l f34533l;

                    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC1234l f34534l;

                    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC13490l f34535l;

                    {
                        this.f34535l = interfaceC13490l6;
                        this.f34529l = z;
                        this.f34530l = z218;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C4451l c4451l;
                        C7504l c7504l;
                        this.f34532l.loadAd = this.f34531l;
                        C12217l c12217l6 = this.f34528l;
                        boolean z219 = this.f34529l;
                        if (!z219 && (c4451l = c12217l6.purchase.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                            c7504l.ads(null);
                            c4451l.f9058l = null;
                        }
                        c12217l6.firebase = this.f34534l;
                        c12217l6.admob = this.f34533l;
                        c12217l6.crashlytics = this.f34535l;
                        c12217l6.isPro = z219;
                        c12217l6.amazon = this.f34530l;
                        return Unit.INSTANCE;
                    }
                };
                z16 = z;
                z6 = z218;
                c6956l3.m2147try(function3);
                objM2132native7 = function3;
            } else {
                final InterfaceC13490l interfaceC13490l7 = interfaceC13490l2;
                c12217l3 = c12217l2;
                final InterfaceC7948l interfaceC7948l7 = interfaceC7948l2;
                final boolean z219 = z6;
                c16328l2 = c16328l;
                Function0 function4 = new Function0(interfaceC13142l, c12217l3, interfaceC1234l, interfaceC7948l7, c7811l, interfaceC13490l7, z, z219) { // from class: lۣ٘ؗ

                    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                    public final /* synthetic */ C12217l f34528l;

                    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                    public final /* synthetic */ boolean f34529l;

                    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                    public final /* synthetic */ boolean f34530l;

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC13142l f34531l;

                    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC7948l f34533l;

                    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC1234l f34534l;

                    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                    public final /* synthetic */ InterfaceC13490l f34535l;

                    {
                        this.f34535l = interfaceC13490l7;
                        this.f34529l = z;
                        this.f34530l = z219;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C4451l c4451l;
                        C7504l c7504l;
                        this.f34532l.loadAd = this.f34531l;
                        C12217l c12217l6 = this.f34528l;
                        boolean z2110 = this.f34529l;
                        if (!z2110 && (c4451l = c12217l6.purchase.yandex) != null && (c7504l = c4451l.f9058l) != null) {
                            c7504l.ads(null);
                            c4451l.f9058l = null;
                        }
                        c12217l6.firebase = this.f34534l;
                        c12217l6.admob = this.f34533l;
                        c12217l6.crashlytics = this.f34535l;
                        c12217l6.isPro = z2110;
                        c12217l6.amazon = this.f34530l;
                        return Unit.INSTANCE;
                    }
                };
                z16 = z;
                z6 = z219;
                c6956l3.m2147try(function4);
                objM2132native7 = function4;
            }
            AbstractC12311l.billing((Function0) objM2132native7, c6956l3);
            zAdmob = c6956l3.admob(c12217l3);
            objM2132native8 = c6956l3.m2132native();
            if (zAdmob) {
                z17 = false;
                objM2132native8 = new C15419l(c12217l3, 0);
                c6956l3.m2147try(objM2132native8);
            } else {
                z17 = false;
                objM2132native8 = new C15419l(c12217l3, 0);
                c6956l3.m2147try(objM2132native8);
            }
            AbstractC12311l.loadAd(c12217l3, (Function1) objM2132native8, c6956l3);
            if (z6) {
                z18 = z17;
            } else {
                i8 = c3790l.crashlytics;
                if (i8 == 7) {
                    z22 = true;
                } else {
                    z22 = z17;
                }
                if (z22) {
                    z18 = z17;
                } else {
                    if (i8 == 8) {
                        z23 = true;
                    } else {
                        z23 = z17;
                    }
                    if (z23) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                }
            }
            final EnumC11107l enumC11107l3 = (EnumC11107l) c12217l3.ads.getValue();
            zMopub = c6956l3.mopub(z18) | c6956l3.admob(interfaceC5995l2);
            objM2132native9 = c6956l3.m2132native();
            if (zMopub) {
                objM2132native9 = new C10041l(z18, interfaceC5995l2, 1);
                c6956l3.m2147try(objM2132native9);
            } else {
                objM2132native9 = new C10041l(z18, interfaceC5995l2, 1);
                c6956l3.m2147try(objM2132native9);
            }
            InterfaceC17242l interfaceC17242lBilling7 = AbstractC6900l.billing(interfaceC17242l, z16, z18, (Function0) objM2132native9);
            z19 = z17;
            boolean z2110 = z6;
            C2403l c2403l8 = c2403l2;
            C4577l c4577l3 = new C4577l(c16328l2, c10312l2, c12217l3, interfaceC13142l, z16, c3790lYandex3, interfaceC11381l, zYandex, c2403l8, z2110, interfaceC5995l2);
            final C16328l c16328l5 = c16328l2;
            c2403l3 = c2403l8;
            z5 = z2110;
            final C12217l c12217l6 = c12217l3;
            InterfaceC17242l interfaceC17242lPremium3 = interfaceC17242lBilling7.premium(c4577l3);
            if (z) {
                z20 = z19;
            } else {
                z20 = z19;
            }
            if (enumC9931l == EnumC9931l.f20222l) {
                enumC7283l4 = enumC7283l2;
                if (enumC7283l4 != enumC7283l) {
                    z21 = z19;
                } else {
                    z21 = true;
                }
                enumC7283l3 = enumC7283l4;
            } else {
                c2403l3 = c2403l3;
                enumC7283l3 = enumC7283l2;
                z21 = true;
            }
            InterfaceC17242l interfaceC17242lBilling8 = AbstractC13611l.billing(interfaceC17242lPremium3, c11194l, enumC7283l3, z20, z21, c2403l3);
            final EnumC7283l enumC7283l7 = enumC7283l3;
            final C2403l c2403l9 = c2403l3;
            InterfaceC11325l.yandex.getClass();
            InterfaceC17242l interfaceC17242lYandex3 = AbstractC7280l.yandex(AbstractC15269l.crashlytics(interfaceC17242lBilling8, AbstractC4047l.loadAd), new C2736l(c12217l6, interfaceC2262l2, 16));
            InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36026l, true);
            long j3 = c6956l.f14595continue;
            int i17 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling9 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex3);
            InterfaceC8801l.firebase.getClass();
            c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon3, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i17), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling9, C3438l.amazon);
            z4 = z;
            c6956l2 = c6956l;
            final C10312l c10312l5 = c10312l2;
            AbstractC1896l.crashlytics(c12217l6, z4, AbstractC14566l.amazon(-673241599, new Function2() { // from class: lُؐؐ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l4 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l4.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC17727l interfaceC17727l2 = interfaceC17727l;
                        if (interfaceC17727l2 == null) {
                            interfaceC17727l2 = C15718l.f30861l;
                        }
                        final C2403l c2403l10 = c2403l9;
                        final InterfaceC15892l interfaceC15892l2 = interfaceC15892l;
                        final C11090l c11090l2 = c11090l;
                        final C10312l c10312l6 = c10312l5;
                        final boolean z2111 = zYandex;
                        final EnumC11107l enumC11107l4 = enumC11107l3;
                        final C16328l c16328l6 = c16328l5;
                        final C12217l c12217l7 = c12217l6;
                        final AbstractC9544l abstractC9544l2 = abstractC9544l;
                        final boolean z32 = z4;
                        final C11194l c11194l2 = c11194l;
                        final EnumC7283l enumC7283l8 = enumC7283l7;
                        final C10715l c10715l3 = c10715l2;
                        final InterfaceC13515l interfaceC13515l = interfaceC13515lLoadAd;
                        final C3790l c3790l2 = c3790lYandex3;
                        interfaceC17727l2.crashlytics(AbstractC14566l.amazon(1969169726, new Function2() { // from class: lِٔۥ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    C2403l c2403l11 = c2403l10;
                                    InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l11, c6956l5, 0);
                                    Object objM2132native14 = c6956l5.m2132native();
                                    C13863l c13863l2 = C1867l.yandex;
                                    if (objM2132native14 == c13863l2) {
                                        objM2132native14 = AbstractC8020l.smaato(Boolean.FALSE);
                                        c6956l5.m2147try(objM2132native14);
                                    }
                                    InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native14;
                                    boolean zBilling7 = c6956l5.billing(c2403l11);
                                    Object objM2132native15 = c6956l5.m2132native();
                                    if (zBilling7 || objM2132native15 == c13863l2) {
                                        objM2132native15 = new C15416l(c2403l11, interfaceC8714l, null, 0);
                                        c6956l5.m2147try(objM2132native15);
                                    }
                                    AbstractC12311l.amazon(c6956l5, c2403l11, (Function2) objM2132native15);
                                    InterfaceC2229l interfaceC2229l = (InterfaceC2229l) c6956l5.isPro(AbstractC4751l.Signature);
                                    boolean zBilling8 = c6956l5.billing(c2403l11) | c6956l5.billing(interfaceC2229l);
                                    Object objM2132native16 = c6956l5.m2132native();
                                    if (zBilling8 || objM2132native16 == c13863l2) {
                                        objM2132native16 = AbstractC8020l.mopub(new Ctry(interfaceC2229l, interfaceC8714lLoadAd, 18));
                                        c6956l5.m2147try(objM2132native16);
                                    }
                                    InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native16;
                                    ((Boolean) interfaceC8714lLoadAd.getValue()).getClass();
                                    int i18 = interfaceC15892l2 instanceof C5083l ? Integer.MAX_VALUE : 1;
                                    C10312l c10312l7 = c10312l6;
                                    InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(C4346l.f8873l, new C1350l(4, c10312l7));
                                    AbstractC17653l.purchase(1, i18);
                                    C11090l c11090l3 = c11090l2;
                                    boolean z33 = z2111;
                                    if (i18 != Integer.MAX_VALUE && !z33) {
                                        interfaceC17242lM3537else = interfaceC17242lM3537else.premium(new C16695l(c11090l3, 1, i18));
                                    }
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0019l.amazon(interfaceC17242lM3537else.premium(new C4544l(c11090l3)));
                                    boolean zBooleanValue = ((Boolean) interfaceC12244l.getValue()).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) interfaceC8714l.getValue()).booleanValue();
                                    boolean z34 = enumC11107l4 == EnumC11107l.f22311l;
                                    C16328l c16328l7 = c16328l6;
                                    C12217l c12217l8 = c12217l7;
                                    AbstractC9544l abstractC9544l3 = abstractC9544l2;
                                    boolean z35 = z32;
                                    InterfaceC17242l interfaceC17242lPremium4 = interfaceC17242lAmazon.premium(new C5460l(zBooleanValue, zBooleanValue2, z34, c10312l7, c16328l7, c12217l8, abstractC9544l3, z35, c11194l2, enumC7283l8, c10715l3, interfaceC13515l));
                                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(C18450l.f36026l, true);
                                    long j4 = c6956l5.f14595continue;
                                    int i19 = (int) (j4 ^ (j4 >>> 32));
                                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l5.smaato();
                                    InterfaceC17242l interfaceC17242lBilling10 = AbstractC17541l.billing(c6956l5, interfaceC17242lPremium4);
                                    InterfaceC8801l.firebase.getClass();
                                    C16395l c16395l2 = C3438l.loadAd;
                                    c6956l5.m2140super();
                                    if (c6956l5.f14603switch) {
                                        c6956l5.firebase(c16395l2);
                                    } else {
                                        c6956l5.m2136protected();
                                    }
                                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon4, C3438l.mopub);
                                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato4, C3438l.billing);
                                    AbstractC8182l.billing(c6956l5, Integer.valueOf(i19), C3438l.isPro);
                                    AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling10, C3438l.amazon);
                                    AbstractC9383l.yandex(new C9634l(c10312l7, c16328l7, c11090l3, z33, c3790l2), c6956l5, 0);
                                    if (z35 && ((Boolean) interfaceC12244l.getValue()).booleanValue() && ((Boolean) c12217l8.smaato.getValue()).booleanValue()) {
                                        c6956l5.m2123default(-810654004);
                                        AbstractC16363l.billing(c12217l8, c6956l5, 0);
                                        c6956l5.m2123default(-810526873);
                                        AbstractC16363l.purchase(c12217l8, c6956l5, 0);
                                        c6956l5.startapp(false);
                                        c6956l5.startapp(false);
                                    } else {
                                        c6956l5.m2123default(-810390690);
                                        c6956l5.startapp(false);
                                    }
                                    c6956l5.startapp(true);
                                } else {
                                    c6956l5.m2124else();
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l4), c6956l4, 6);
                    } else {
                        c6956l4.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l2), c6956l2, ((i4 >> 3) & 112) | 384);
            c6956l2.startapp(true);
        } else {
            z4 = z;
            c6956l2 = c6956l;
            c6956l2.m2124else();
            z5 = z2;
        }
        c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            final boolean z32 = z4;
            final boolean z33 = z5;
            c4224lAds.amazon = new Function2() { // from class: lؘٛۥ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC16363l.yandex(c10178l, interfaceC17242l, z32, interfaceC13142l, c11090l, c3790l, interfaceC11381l, interfaceC15892l, c2403l, abstractC9544l, interfaceC1832l, interfaceC17727l, c11194l, z33, (C6956l) obj, iPurchase, iPurchase2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
