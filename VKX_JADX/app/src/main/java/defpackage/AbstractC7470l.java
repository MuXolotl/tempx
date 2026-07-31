package defpackage;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَؚۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7470l {
    public static final C6232l adcel(C7026l c7026l) {
        Object c18435l;
        SharedPreferences sharedPreferences = (SharedPreferences) c7026l.f14720l;
        String string = sharedPreferences.contains("vk.accountStore") ? sharedPreferences.getString("vk.accountStore", "") : null;
        if (string == null) {
            return null;
        }
        try {
            C9385l c9385l = AbstractC10925l.yandex;
            c9385l.getClass();
            c18435l = (C6232l) AbstractC15212l.crashlytics(c9385l, C6232l.Companion.serializer(), string);
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (C1171l.yandex(c18435l) != null) {
            c7026l.inmobi("vk.accountStore");
        }
        return (C6232l) (c18435l instanceof C18435l ? null : c18435l);
    }

    public static final C8896l admob(long j, long j2) {
        return new C8896l(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void ads(C7026l c7026l, C6232l c6232l) {
        C9385l c9385l = AbstractC10925l.yandex;
        c9385l.getClass();
        byte[] bArrLoadAd = c9385l.loadAd(C6232l.Companion.serializer(), c6232l);
        StringBuilder sb = new StringBuilder(bArrLoadAd.length * 2);
        for (byte b : bArrLoadAd) {
            sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        ((SharedPreferences) c7026l.f14720l).edit().putString("vk.accountStore", sb.toString().toLowerCase(Locale.ROOT)).apply();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0123  */
    /* JADX WARN: Code duplicated, block: B:84:0x012f  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final void amazon(final boolean z, final Function1 function1, final C12804l c12804l, InterfaceC17242l interfaceC17242l, boolean z2, final C7708l c7708l, final C2403l c2403l, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        boolean z3;
        int i3;
        Function1 function2;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        C7708l c7708l2;
        C2403l c2403l2;
        C15578l c15578l2;
        boolean z4;
        final InterfaceC17242l interfaceC17242l3;
        final boolean z5;
        C4224l c4224lAds;
        boolean z6;
        Object objM2132native;
        int i5;
        int i6;
        int i7;
        c6956l.m2133new(252067177);
        if ((i & 6) == 0) {
            z3 = z;
            i3 = (c6956l.mopub(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i3 |= c6956l.admob(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(c12804l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 2048 : 1024;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                c7708l2 = c7708l;
                if (c6956l.billing(c7708l2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            } else {
                c7708l2 = c7708l;
            }
            if ((i & 1572864) == 0) {
                c2403l2 = c2403l;
                if (c6956l.billing(c2403l2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            } else {
                c2403l2 = c2403l;
            }
            if ((12582912 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i4 |= i5;
            } else {
                c15578l2 = c15578l;
            }
            if ((4793491 & i4) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c6956l.m2127for(i4 & 1, z4)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i8 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    z6 = true;
                } else {
                    c6956l.m2124else();
                    z6 = z2;
                }
                InterfaceC17242l interfaceC17242l4 = interfaceC17242l2;
                c6956l.adcel();
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = new C17049l(25);
                    c6956l.m2147try(objM2132native);
                }
                int i9 = (i4 & 14) | 1572864 | (i4 & 112) | ((i4 >> 3) & 7168) | (57344 & (i4 << 6)) | (458752 & i4);
                int i10 = i4 << 3;
                remoteconfig(z3, function2, AbstractC4962l.yandex(interfaceC17242l4, false, (Function1) objM2132native), z6, c12804l, c7708l2, c2403l2, c15578l2, c6956l, (i10 & 234881024) | i9 | (29360128 & i10));
                z5 = z6;
                interfaceC17242l3 = interfaceC17242l4;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z5 = z2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lًٓٔ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC7470l.amazon(z, function1, c12804l, interfaceC17242l3, z5, c7708l, c2403l, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 3072;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
            c7708l2 = c7708l;
            if (c6956l.billing(c7708l2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i4 |= i7;
        } else {
            c7708l2 = c7708l;
        }
        if ((i & 1572864) == 0) {
            c2403l2 = c2403l;
            if (c6956l.billing(c2403l2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        } else {
            c2403l2 = c2403l;
        }
        if ((12582912 & i) == 0) {
            c15578l2 = c15578l;
            if (c6956l.admob(c15578l2)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i4 |= i5;
        } else {
            c15578l2 = c15578l;
        }
        if ((4793491 & i4) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c6956l.m2127for(i4 & 1, z4)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                z6 = true;
            } else {
                if (i8 != 0) {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                z6 = true;
            }
            InterfaceC17242l interfaceC17242l5 = interfaceC17242l2;
            c6956l.adcel();
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C17049l(25);
                c6956l.m2147try(objM2132native);
            }
            int i11 = (i4 & 14) | 1572864 | (i4 & 112) | ((i4 >> 3) & 7168) | (57344 & (i4 << 6)) | (458752 & i4);
            int i12 = i4 << 3;
            remoteconfig(z3, function2, AbstractC4962l.yandex(interfaceC17242l5, false, (Function1) objM2132native), z6, c12804l, c7708l2, c2403l2, c15578l2, c6956l, (i12 & 234881024) | i11 | (29360128 & i12));
            z5 = z6;
            interfaceC17242l3 = interfaceC17242l5;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            z5 = z2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lًٓٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC7470l.amazon(z, function1, c12804l, interfaceC17242l3, z5, c7708l, c2403l, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:113:0x018f  */
    /* JADX WARN: Code duplicated, block: B:116:0x019d  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:56:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void billing(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, C17076l c17076l, C2403l c2403l, InterfaceC6347l interfaceC6347l, Function2 function2, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        boolean z2;
        int i5;
        C17076l c17076l2;
        int i6;
        C2403l c2403l2;
        int i7;
        InterfaceC6347l interfaceC6347l2;
        Function2 function3;
        boolean z3;
        InterfaceC17242l interfaceC17242l3;
        boolean z4;
        InterfaceC6347l interfaceC6347l3;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        InterfaceC6347l interfaceC6347lLoadAd;
        int i8;
        InterfaceC17242l interfaceC17242l5;
        boolean z5;
        long j;
        C17076l c17076lTapsense;
        C17076l c17076lYandex;
        int i9;
        c6956l.m2133new(1413012038);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        c17076l2 = c17076l;
                        int i11 = c6956l.billing(c17076l2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        c17076l2 = c17076l;
                    }
                    i3 |= i11;
                } else {
                    c17076l2 = c17076l;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        c2403l2 = c2403l;
                        if (c6956l.billing(c2403l2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            interfaceC6347l2 = interfaceC6347l;
                            int i12 = c6956l.billing(interfaceC6347l2) ? 131072 : 65536;
                            i3 |= i12;
                        } else {
                            interfaceC6347l2 = interfaceC6347l;
                        }
                        i3 |= i12;
                    } else {
                        interfaceC6347l2 = interfaceC6347l;
                    }
                    if ((1572864 & i) == 0) {
                        function3 = function2;
                        if (c6956l.admob(function3)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    } else {
                        function3 = function2;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i3 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i & 1) != 0 || c6956l.ad()) {
                            if (i10 != 0) {
                                interfaceC17242l4 = C4346l.f8873l;
                            } else {
                                interfaceC17242l4 = interfaceC17242l2;
                            }
                            boolean z6 = i4 == 0 ? z2 : true;
                            if ((i2 & 8) != 0) {
                                j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                                c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                                if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                    c17076lYandex = c17076lTapsense;
                                } else {
                                    c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                                }
                                i3 &= -7169;
                                c17076l2 = c17076lYandex;
                            }
                            if (i6 != 0) {
                                c2403l2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                                i3 &= -458753;
                            } else {
                                interfaceC6347lLoadAd = interfaceC6347l2;
                            }
                            i8 = i3;
                            interfaceC17242l5 = interfaceC17242l4;
                            z5 = z6;
                        } else {
                            c6956l.m2124else();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z5 = z2;
                            c17076l2 = c17076l2;
                            c2403l2 = c2403l2;
                            i8 = i3;
                            interfaceC17242l5 = interfaceC17242l2;
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        c6956l.adcel();
                        int i13 = i8 << 3;
                        mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i13 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i13) | (i13 & 458752) | (i8 & 3670016));
                        interfaceC6347l3 = interfaceC6347lLoadAd;
                        z4 = z5;
                        interfaceC17242l3 = interfaceC17242l5;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l3 = interfaceC17242l2;
                        z4 = z2;
                        c17076l2 = c17076l2;
                        c2403l2 = c2403l2;
                        interfaceC6347l3 = interfaceC6347l2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
                    }
                }
                i3 |= 24576;
                c2403l2 = c2403l;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        interfaceC6347l2 = interfaceC6347l;
                        if (c6956l.billing(interfaceC6347l2)) {
                        }
                        i3 |= i12;
                    } else {
                        interfaceC6347l2 = interfaceC6347l;
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                if ((1572864 & i) == 0) {
                    function3 = function2;
                    if (c6956l.admob(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    function3 = function2;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    } else {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    }
                    c6956l.adcel();
                    int i14 = i8 << 3;
                    mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i14 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i14) | (i14 & 458752) | (i8 & 3670016));
                    interfaceC6347l3 = interfaceC6347lLoadAd;
                    z4 = z5;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    c17076l2 = c17076l2;
                    c2403l2 = c2403l2;
                    interfaceC6347l3 = interfaceC6347l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    c17076l2 = c17076l;
                    if (c6956l.billing(c17076l2)) {
                    }
                    i3 |= i11;
                } else {
                    c17076l2 = c17076l;
                }
                i3 |= i11;
            } else {
                c17076l2 = c17076l;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        interfaceC6347l2 = interfaceC6347l;
                        if (c6956l.billing(interfaceC6347l2)) {
                        }
                        i3 |= i12;
                    } else {
                        interfaceC6347l2 = interfaceC6347l;
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                if ((1572864 & i) == 0) {
                    function3 = function2;
                    if (c6956l.admob(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    function3 = function2;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    } else {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    }
                    c6956l.adcel();
                    int i15 = i8 << 3;
                    mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i15 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i15) | (i15 & 458752) | (i8 & 3670016));
                    interfaceC6347l3 = interfaceC6347lLoadAd;
                    z4 = z5;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    c17076l2 = c17076l2;
                    c2403l2 = c2403l2;
                    interfaceC6347l3 = interfaceC6347l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
                }
            }
            i3 |= 24576;
            c2403l2 = c2403l;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    interfaceC6347l2 = interfaceC6347l;
                    if (c6956l.billing(interfaceC6347l2)) {
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                i3 |= i12;
            } else {
                interfaceC6347l2 = interfaceC6347l;
            }
            if ((1572864 & i) == 0) {
                function3 = function2;
                if (c6956l.admob(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                function3 = function2;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                }
                c6956l.adcel();
                int i16 = i8 << 3;
                mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i16 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i16) | (i16 & 458752) | (i8 & 3670016));
                interfaceC6347l3 = interfaceC6347lLoadAd;
                z4 = z5;
                interfaceC17242l3 = interfaceC17242l5;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                c17076l2 = c17076l2;
                c2403l2 = c2403l2;
                interfaceC6347l3 = interfaceC6347l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
            }
        }
        i3 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (c6956l.mopub(z2)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    c17076l2 = c17076l;
                    if (c6956l.billing(c17076l2)) {
                    }
                    i3 |= i11;
                } else {
                    c17076l2 = c17076l;
                }
                i3 |= i11;
            } else {
                c17076l2 = c17076l;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    c2403l2 = c2403l;
                    if (c6956l.billing(c2403l2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        interfaceC6347l2 = interfaceC6347l;
                        if (c6956l.billing(interfaceC6347l2)) {
                        }
                        i3 |= i12;
                    } else {
                        interfaceC6347l2 = interfaceC6347l;
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                if ((1572864 & i) == 0) {
                    function3 = function2;
                    if (c6956l.admob(function3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    function3 = function2;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    } else {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 8) != 0) {
                            j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                            c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                            if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                                c17076lYandex = c17076lTapsense;
                            } else {
                                c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                            }
                            i3 &= -7169;
                            c17076l2 = c17076lYandex;
                        }
                        if (i6 != 0) {
                            c2403l2 = null;
                        }
                        if ((i2 & 32) != 0) {
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                            i3 &= -458753;
                        } else {
                            interfaceC6347lLoadAd = interfaceC6347l2;
                        }
                        i8 = i3;
                        interfaceC17242l5 = interfaceC17242l4;
                        z5 = z6;
                    }
                    c6956l.adcel();
                    int i17 = i8 << 3;
                    mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i17 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i17) | (i17 & 458752) | (i8 & 3670016));
                    interfaceC6347l3 = interfaceC6347lLoadAd;
                    z4 = z5;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    c17076l2 = c17076l2;
                    c2403l2 = c2403l2;
                    interfaceC6347l3 = interfaceC6347l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
                }
            }
            i3 |= 24576;
            c2403l2 = c2403l;
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    interfaceC6347l2 = interfaceC6347l;
                    if (c6956l.billing(interfaceC6347l2)) {
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                i3 |= i12;
            } else {
                interfaceC6347l2 = interfaceC6347l;
            }
            if ((1572864 & i) == 0) {
                function3 = function2;
                if (c6956l.admob(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                function3 = function2;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                }
                c6956l.adcel();
                int i18 = i8 << 3;
                mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i18 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i18) | (i18 & 458752) | (i8 & 3670016));
                interfaceC6347l3 = interfaceC6347lLoadAd;
                z4 = z5;
                interfaceC17242l3 = interfaceC17242l5;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                c17076l2 = c17076l2;
                c2403l2 = c2403l2;
                interfaceC6347l3 = interfaceC6347l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                c17076l2 = c17076l;
                if (c6956l.billing(c17076l2)) {
                }
                i3 |= i11;
            } else {
                c17076l2 = c17076l;
            }
            i3 |= i11;
        } else {
            c17076l2 = c17076l;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                c2403l2 = c2403l;
                if (c6956l.billing(c2403l2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    interfaceC6347l2 = interfaceC6347l;
                    if (c6956l.billing(interfaceC6347l2)) {
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347l2 = interfaceC6347l;
                }
                i3 |= i12;
            } else {
                interfaceC6347l2 = interfaceC6347l;
            }
            if ((1572864 & i) == 0) {
                function3 = function2;
                if (c6956l.admob(function3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                function3 = function2;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                        j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                        if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                            c17076lYandex = c17076lTapsense;
                        } else {
                            c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                        }
                        i3 &= -7169;
                        c17076l2 = c17076lYandex;
                    }
                    if (i6 != 0) {
                        c2403l2 = null;
                    }
                    if ((i2 & 32) != 0) {
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                        i3 &= -458753;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l2;
                    }
                    i8 = i3;
                    interfaceC17242l5 = interfaceC17242l4;
                    z5 = z6;
                }
                c6956l.adcel();
                int i19 = i8 << 3;
                mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i19 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i19) | (i19 & 458752) | (i8 & 3670016));
                interfaceC6347l3 = interfaceC6347lLoadAd;
                z4 = z5;
                interfaceC17242l3 = interfaceC17242l5;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                c17076l2 = c17076l2;
                c2403l2 = c2403l2;
                interfaceC6347l3 = interfaceC6347l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
            }
        }
        i3 |= 24576;
        c2403l2 = c2403l;
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                interfaceC6347l2 = interfaceC6347l;
                if (c6956l.billing(interfaceC6347l2)) {
                }
                i3 |= i12;
            } else {
                interfaceC6347l2 = interfaceC6347l;
            }
            i3 |= i12;
        } else {
            interfaceC6347l2 = interfaceC6347l;
        }
        if ((1572864 & i) == 0) {
            function3 = function2;
            if (c6956l.admob(function3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            function3 = function2;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i3 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                    c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                    if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                        c17076lYandex = c17076lTapsense;
                    } else {
                        c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                    }
                    i3 &= -7169;
                    c17076l2 = c17076lYandex;
                }
                if (i6 != 0) {
                    c2403l2 = null;
                }
                if ((i2 & 32) != 0) {
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                    i3 &= -458753;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l2;
                }
                i8 = i3;
                interfaceC17242l5 = interfaceC17242l4;
                z5 = z6;
            } else {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                    j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                    c17076lTapsense = AbstractC12442l.tapsense(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, j);
                    if (C9735l.crashlytics(c17076lTapsense.loadAd, j)) {
                        c17076lYandex = c17076lTapsense;
                    } else {
                        c17076lYandex = c17076lTapsense.yandex(c17076lTapsense.yandex, j, c17076lTapsense.crashlytics, C9735l.loadAd(0.38f, j));
                    }
                    i3 &= -7169;
                    c17076l2 = c17076lYandex;
                }
                if (i6 != 0) {
                    c2403l2 = null;
                }
                if ((i2 & 32) != 0) {
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                    i3 &= -458753;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l2;
                }
                i8 = i3;
                interfaceC17242l5 = interfaceC17242l4;
                z5 = z6;
            }
            c6956l.adcel();
            int i110 = i8 << 3;
            mopub(interfaceC17242l5, function0, z5, interfaceC6347lLoadAd, c17076l2, c2403l2, function3, c6956l, ((i8 >> 3) & 14) | (i110 & 112) | (i8 & 896) | ((i8 >> 6) & 7168) | (57344 & i110) | (i110 & 458752) | (i8 & 3670016));
            interfaceC6347l3 = interfaceC6347lLoadAd;
            z4 = z5;
            interfaceC17242l3 = interfaceC17242l5;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            z4 = z2;
            c17076l2 = c17076l2;
            c2403l2 = c2403l2;
            interfaceC6347l3 = interfaceC6347l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3435l(function0, interfaceC17242l3, z4, c17076l2, c2403l2, interfaceC6347l3, function2, i, i2);
        }
    }

    public static final void crashlytics(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C15578l c15578l, C6956l c6956l, int i) {
        boolean z2;
        InterfaceC6347l interfaceC6347l2;
        int i2;
        InterfaceC6347l interfaceC6347lLoadAd;
        boolean z3;
        c6956l.m2133new(-399178234);
        int i3 = i | (c6956l.admob(function0) ? 4 : 2) | 1408 | (c6956l.billing(c17076l) ? 16384 : 8192) | 196608;
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                i2 = i3 & (-7169);
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 7);
                z3 = true;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-7169);
                z3 = z;
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            c6956l.adcel();
            smaato(function0, interfaceC17242l, z3, interfaceC6347lLoadAd, c17076l, null, c15578l, c6956l, (i2 & 57344) | (i2 & 14) | 197040 | 14155776);
            z2 = z3;
            interfaceC6347l2 = interfaceC6347lLoadAd;
        } else {
            c6956l.m2124else();
            z2 = z;
            interfaceC6347l2 = interfaceC6347l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2940l(function0, interfaceC17242l, z2, interfaceC6347l2, c17076l, c15578l, i);
        }
    }

    public static final void firebase(int i, C15578l c15578l, C6956l c6956l, C17076l c17076l, C11607l c11607l, InterfaceC17242l interfaceC17242l, Function0 function0, boolean z) {
        int i2;
        c6956l.m2133new(-1422942537);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(c11607l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c17076l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 8388608 : 4194304;
        }
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            c6956l.m2123default(446444132);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            smaato(function0, interfaceC17242l, z, subscription(c11607l, c2403l, c6956l, (i2 >> 9) & 14), c17076l, c2403l, c15578l, c6956l, i2 & 29877246);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7491l(function0, interfaceC17242l, z, c11607l, c17076l, c15578l, i);
        }
    }

    public static final C8896l isPro(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C8896l(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void loadAd(int i, C15578l c15578l, C6956l c6956l, C17076l c17076l, C11607l c11607l, InterfaceC17242l interfaceC17242l, Function0 function0, boolean z) {
        InterfaceC17242l interfaceC17242l2;
        boolean z2;
        InterfaceC17242l interfaceC17242l3;
        boolean z3;
        c6956l.m2133new(-1970685840);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i | (c6956l.billing(c11607l) ? 32 : 16) | 3456 | (c6956l.billing(c17076l) ? 16384 : 8192) | 196608;
        if ((i & 1572864) == 0) {
            i2 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                interfaceC17242l3 = C4346l.f8873l;
                z3 = true;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
                z3 = z;
            }
            c6956l.adcel();
            firebase(((i2 << 3) & 29360128) | 1572864 | (i2 & 14) | 197040 | ((i2 << 6) & 7168) | (57344 & i2), c15578l, c6956l, c17076l, c11607l, interfaceC17242l3, function0, z3);
            interfaceC17242l2 = interfaceC17242l3;
            z2 = z3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z2 = z;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7491l(function0, c11607l, interfaceC17242l2, z2, c17076l, c15578l, i);
        }
    }

    public static final void metrica(InterfaceC17739l interfaceC17739l) {
        if ((interfaceC17739l instanceof C16044l ? (C16044l) interfaceC17739l : null) != null) {
            return;
        }
        C8339l.smaato(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC17739l.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final void mopub(InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C2403l c2403l, Function2 function2, C6956l c6956l, int i) {
        int i2;
        C2403l c2403l2;
        c6956l.m2133new(-1134296466);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c17076l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 599187) != 599186)) {
            if (c2403l == null) {
                c6956l.m2123default(976976045);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l2 = (C2403l) objM2132native;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(862798698);
                c6956l.startapp(false);
                c2403l2 = c2403l;
            }
            C17857l c17857l = AbstractC16434l.yandex;
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242l.premium(C18158l.f35556l);
            long jYandex = AbstractC9027l.yandex(40.0f, 40.0f);
            C11205l c11205l = AbstractC0080l.yandex;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC1135l.loadAd(AbstractC9151l.yandex(AbstractC4927l.amazon(AbstractC0019l.crashlytics(AbstractC0080l.firebase(interfaceC17242lPremium, C2261l.loadAd(jYandex), C2261l.yandex(jYandex)), interfaceC6347l), z ? c17076l.yandex : c17076l.crashlytics, interfaceC6347l), c2403l2, AbstractC10493l.yandex(false, 0.0f, 0L, interfaceC6347l, 247), z, new C6402l(0), function0, 8));
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC10478l.yandex(AbstractC5020l.startapp(z ? c17076l.loadAd : c17076l.amazon, AbstractC12502l.yandex), function2, c6956l, ((i3 >> 15) & 112) | 8);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(interfaceC17242l, function0, z, interfaceC6347l, c17076l, c2403l, function2, i);
        }
    }

    public static final void purchase(Function0 function0, C11607l c11607l, InterfaceC17242l interfaceC17242l, boolean z, C17076l c17076l, C2403l c2403l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        boolean z2;
        C2403l c2403l2;
        c6956l.m2133new(-83878734);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(c11607l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= c6956l.billing(c17076l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c6956l.billing(c2403l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        boolean z3 = true;
        if (c6956l.m2127for(i3 & 1, (599187 & i3) != 599186)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
                z3 = z;
            }
            c6956l.adcel();
            if (c2403l == null) {
                c6956l.m2123default(839983817);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c6956l.startapp(false);
                c2403l2 = (C2403l) objM2132native;
            } else {
                c6956l.m2123default(996926926);
                c6956l.startapp(false);
                c2403l2 = c2403l;
            }
            int i4 = i3 >> 3;
            mopub(interfaceC17242l, function0, z3, subscription(c11607l, c2403l2, c6956l, i4 & 14), c17076l, c2403l2, c15578l, c6956l, (i4 & 896) | ((i3 >> 6) & 14) | ((i3 << 3) & 112) | (57344 & i3) | (i3 & 3670016));
            z2 = z3;
        } else {
            c6956l.m2124else();
            z2 = z;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(function0, c11607l, interfaceC17242l, z2, c17076l, c2403l, c15578l, i, 5);
        }
    }

    public static final void remoteconfig(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z2, C12804l c12804l, C7708l c7708l, C2403l c2403l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        Function1 function2;
        InterfaceC17242l interfaceC17242l2;
        boolean z3;
        C7708l c7708l2;
        C15578l c15578l2;
        C2403l c2403l2;
        InterfaceC6347l interfaceC6347l;
        boolean z4;
        c6956l.m2133new(-907201848);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= c6956l.admob(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i2 |= c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            interfaceC17242l2 = interfaceC17242l;
        }
        if ((i & 3072) == 0) {
            z3 = z2;
            i2 |= c6956l.mopub(z3) ? 2048 : 1024;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c12804l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            c7708l2 = c7708l;
            i2 |= c6956l.billing(c7708l2) ? 131072 : 65536;
        } else {
            c7708l2 = c7708l;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            c15578l2 = c15578l;
            i2 |= c6956l.admob(c15578l2) ? 67108864 : 33554432;
        } else {
            c15578l2 = c15578l;
        }
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            if (c2403l == null) {
                c6956l.m2123default(1779346899);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l2 = (C2403l) objM2132native;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(57397636);
                c6956l.startapp(false);
                c2403l2 = c2403l;
            }
            c6956l.m2123default(1830759449);
            InterfaceC6347l interfaceC6347l2 = c12804l.yandex;
            InterfaceC6347l interfaceC6347l3 = c12804l.crashlytics;
            InterfaceC6347l interfaceC6347l4 = c12804l.loadAd;
            if (interfaceC6347l2 == interfaceC6347l4 && interfaceC6347l2 == interfaceC6347l3) {
                c6956l.startapp(false);
            } else {
                InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 4);
                boolean zBooleanValue = ((Boolean) C10053l.crashlytics(c2403l2, c6956l, 0).getValue()).booleanValue();
                c6956l.m2123default(379519412);
                if (zBooleanValue) {
                    interfaceC6347l = interfaceC6347l4;
                } else {
                    interfaceC6347l = z ? interfaceC6347l3 : interfaceC6347l2;
                }
                if ((interfaceC6347l2 instanceof C6839l) && (interfaceC6347l4 instanceof C6839l) && (interfaceC6347l3 instanceof C6839l)) {
                    c6956l.m2123default(1909239112);
                    c6956l.m2121class(-354053117, c12804l);
                    z4 = false;
                    C3226l c3226lAmazon = AbstractC16357l.amazon((C6839l) interfaceC6347l, interfaceC17807lRemoteconfig, c6956l, 0);
                    AbstractC12900l.ads(c6956l, false, false, false);
                    interfaceC6347l2 = c3226lAmazon;
                } else {
                    z4 = false;
                    c6956l.m2123default(1909337134);
                    c6956l.startapp(false);
                    c6956l.startapp(false);
                    interfaceC6347l2 = interfaceC6347l;
                }
                c6956l.startapp(z4);
            }
            vip(z, function2, interfaceC17242l2, z3, interfaceC6347l2, c7708l2, c2403l2, c15578l2, c6956l, 239017982 & i2);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8017l(z, function1, interfaceC17242l, z2, c12804l, c7708l, c2403l, c15578l, i, 0);
        }
    }

    public static final void smaato(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C17076l c17076l, C2403l c2403l, C15578l c15578l, C6956l c6956l, int i) {
        Function0 function1;
        int i2;
        InterfaceC6347l interfaceC6347l2;
        c6956l.m2133new(-171935091);
        if ((i & 6) == 0) {
            function1 = function0;
            i2 = (c6956l.admob(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6347l2 = interfaceC6347l;
            i2 |= c6956l.billing(interfaceC6347l2) ? 2048 : 1024;
        } else {
            interfaceC6347l2 = interfaceC6347l;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(c17076l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 8388608 : 4194304;
        }
        if (c6956l.m2127for(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C17049l(24);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native);
            long j = z ? c17076l.yandex : c17076l.crashlytics;
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            int i5 = (i4 & 1879048192) | i3 | (i4 & 234881024);
            AbstractC3274l.crashlytics(function1, interfaceC17242lYandex, z, interfaceC6347l2, j, z ? c17076l.loadAd : c17076l.amazon, 0.0f, 0.0f, null, c2403l, AbstractC14566l.amazon(669231714, new C15701l(c15578l, 0), c6956l), c6956l, i5, 192);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(function0, interfaceC17242l, z, interfaceC6347l, c17076l, c2403l, c15578l, i);
        }
    }

    public static final InterfaceC17487l startapp(InterfaceC10726l interfaceC10726l) {
        InterfaceC17487l interfaceC17487l = interfaceC10726l instanceof InterfaceC17487l ? (InterfaceC17487l) interfaceC10726l : null;
        if (interfaceC17487l != null) {
            return interfaceC17487l;
        }
        C8339l.smaato(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC10726l.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final C8896l subs(float f, long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C8896l(Float.intBitsToFloat(i) - f, Float.intBitsToFloat(i2) - f, Float.intBitsToFloat(i) + f, Float.intBitsToFloat(i2) + f);
    }

    public static final InterfaceC6347l subscription(C11607l c11607l, C2403l c2403l, C6956l c6956l, int i) {
        c6956l.m2123default(-514014991);
        InterfaceC6347l interfaceC6347l = c11607l.yandex;
        InterfaceC6347l interfaceC6347l2 = c11607l.loadAd;
        if (interfaceC6347l == interfaceC6347l2) {
            c6956l.startapp(false);
            return interfaceC6347l;
        }
        InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 4);
        boolean zBooleanValue = ((Boolean) C10053l.crashlytics(c2403l, c6956l, (i >> 3) & 14).getValue()).booleanValue();
        c6956l.m2123default(-508408412);
        InterfaceC6347l interfaceC6347lAmazon = zBooleanValue ? interfaceC6347l2 : interfaceC6347l;
        if ((interfaceC6347l instanceof C6839l) && (interfaceC6347l2 instanceof C6839l)) {
            c6956l.m2123default(-1940046184);
            c6956l.m2121class(1045797043, c11607l);
            interfaceC6347lAmazon = AbstractC16357l.amazon((C6839l) interfaceC6347lAmazon, interfaceC17807lRemoteconfig, c6956l, 0);
            AbstractC12900l.ads(c6956l, false, false, false);
        } else {
            c6956l.m2123default(-1939948162);
            c6956l.startapp(false);
            c6956l.startapp(false);
        }
        c6956l.startapp(false);
        return interfaceC6347lAmazon;
    }

    public static final void vip(final boolean z, final Function1 function1, InterfaceC17242l interfaceC17242l, final boolean z2, final InterfaceC6347l interfaceC6347l, C7708l c7708l, C2403l c2403l, C15578l c15578l, C6956l c6956l, int i) {
        int i2;
        long j;
        long j2;
        char c;
        final long j3;
        final C2403l c2403l2;
        c6956l.m2133new(-1118363928);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.mopub(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.billing(c7708l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.billing(c2403l) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 67108864 : 33554432;
        }
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C17049l(26);
                c6956l.m2147try(objM2132native);
            }
            final InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native);
            if (z2) {
                j = !z ? c7708l.yandex : c7708l.purchase;
            } else {
                j = c7708l.crashlytics;
            }
            long j4 = ((C9735l) AbstractC8020l.vip(new C9735l(j), c6956l).getValue()).yandex;
            if (z2) {
                j2 = !z ? c7708l.loadAd : c7708l.billing;
            } else {
                j2 = c7708l.amazon;
            }
            long j5 = ((C9735l) AbstractC8020l.vip(new C9735l(j2), c6956l).getValue()).yandex;
            final C15578l c15578lAmazon = AbstractC14566l.amazon(1492028158, new C15701l(c15578l, i3), c6956l);
            C8540l c8540l = AbstractC3274l.yandex;
            if (c2403l == null) {
                c6956l.m2123default(643383721);
                Object objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == c13863l) {
                    objM2132native2 = AbstractC14814l.isPro(c6956l);
                }
                c6956l.startapp(false);
                c = 0;
                c2403l2 = (C2403l) objM2132native2;
                j3 = j4;
            } else {
                c6956l.m2123default(-533435666);
                c6956l.startapp(false);
                c = 0;
                j3 = j4;
                c2403l2 = c2403l;
            }
            C8540l c8540l2 = AbstractC3274l.yandex;
            final float f = ((C14467l) c6956l.isPro(c8540l2)).f28331l + 0.0f;
            C10092l c10092lStartapp = AbstractC5020l.startapp(j5, AbstractC12502l.yandex);
            C10092l c10092lYandex = c8540l2.yandex(new C14467l(f));
            C10092l[] c10092lArr = new C10092l[2];
            c10092lArr[c] = c10092lStartapp;
            c10092lArr[1] = c10092lYandex;
            AbstractC10478l.loadAd(c10092lArr, AbstractC14566l.amazon(-1839065134, new Function2() { // from class: lُٖ٘
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C17857l c17857l = AbstractC16434l.yandex;
                        InterfaceC17242l interfaceC17242lPremium = interfaceC17242lYandex.premium(C18158l.f35556l);
                        C8540l c8540l3 = AbstractC10493l.yandex;
                        C2109l c2109l = ((C1504l) c6956l2.isPro(c8540l3)).yandex;
                        InterfaceC17242l interfaceC17242lPremium2 = interfaceC17242lPremium.premium(C4346l.f8873l);
                        long jPurchase = AbstractC3274l.purchase(j3, f, c6956l2);
                        float fMo868instanceof = ((InterfaceC13490l) c6956l2.isPro(AbstractC4751l.admob)).mo868instanceof(0.0f);
                        InterfaceC6347l interfaceC6347l2 = interfaceC6347l;
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC3274l.amazon(interfaceC17242lPremium2, interfaceC6347l2, jPurchase, null, fMo868instanceof);
                        C2109l c2109l2 = ((C1504l) c6956l2.isPro(c8540l3)).yandex;
                        InterfaceC17242l interfaceC17242lLoadAd = AbstractC1135l.loadAd(AbstractC3234l.isPro(interfaceC17242lAmazon, z, c2403l2, AbstractC10493l.yandex(false, 0.0f, 0L, interfaceC6347l2, 215), z2, null, function1));
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, true);
                        long j6 = c6956l2.f14595continue;
                        int i4 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                        AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                        AbstractC2812l.pro(0, c15578lAmazon, c6956l2, true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8017l(z, function1, interfaceC17242l, z2, interfaceC6347l, c7708l, c2403l, c15578l, i, 1);
        }
    }

    public static final void yandex(C11636l c11636l, final int i, long j, C6956l c6956l, int i2) {
        int i3;
        c6956l.m2133new(-267849987);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? c6956l.billing(c11636l) : c6956l.admob(c11636l) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.amazon(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.purchase(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            c6956l.m2141switch();
            if ((i2 & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC8020l.smaato(null);
                c6956l.m2147try(objM2132native);
            }
            final InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.smaato(null);
                c6956l.m2147try(objM2132native2);
            }
            final InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native3);
            }
            final InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native3;
            boolean zAdmob = c6956l.admob(interfaceC2262l) | ((i3 & 112) == 32);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == obj) {
                objM2132native4 = new Function4() { // from class: lٕٔۦ
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        InterfaceC7448l interfaceC7448l = (InterfaceC7448l) obj2;
                        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj3;
                        C15519l c15519l = (C15519l) obj4;
                        List list = (List) obj5;
                        C0010l c0010l = AbstractC3483l.mopub;
                        int i4 = i;
                        float f = ((C7622l) list.get(i4)).yandex;
                        C7622l c7622l = (C7622l) list.get(i4);
                        float f2 = c7622l.yandex + c7622l.loadAd;
                        InterfaceC8714l interfaceC8714l3 = interfaceC8714l;
                        C5616l c5616l = (C5616l) interfaceC8714l3.getValue();
                        InterfaceC14029l interfaceC14029l = null;
                        if (c5616l == null) {
                            c5616l = new C5616l(new C14467l(f), c0010l, null, 12);
                            interfaceC8714l3.setValue(c5616l);
                        }
                        InterfaceC8714l interfaceC8714l4 = interfaceC8714l2;
                        C5616l c5616l2 = (C5616l) interfaceC8714l4.getValue();
                        if (c5616l2 == null) {
                            c5616l2 = new C5616l(new C14467l(f2), c0010l, null, 12);
                            interfaceC8714l4.setValue(c5616l2);
                        }
                        boolean zLoadAd = C14467l.loadAd(((C14467l) c5616l2.purchase.getValue()).f28331l, f2);
                        InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                        if (!zLoadAd) {
                            AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C17872l(c5616l2, f2, interfaceC14029l, 1), 3);
                        }
                        int i5 = 2;
                        if (!C14467l.loadAd(((C14467l) c5616l.purchase.getValue()).f28331l, f)) {
                            AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C17872l(c5616l, f, interfaceC14029l, i5), 3);
                        }
                        int iMo870l = interfaceC7448l.mo870l(((C14467l) c5616l2.amazon()).f28331l);
                        int iMo870l2 = interfaceC7448l.mo870l(((C14467l) c5616l.amazon()).f28331l);
                        int i6 = iMo870l - iMo870l2;
                        long j2 = c15519l.yandex;
                        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(i6, i6, 0, 0, 12, j2));
                        return interfaceC7448l.isVip(C15519l.admob(j2), C15519l.mopub(j2), C14054l.f27396l, new C0352l(abstractC10113lAdcel, iMo870l2, 2));
                    }
                };
                c6956l.m2147try(objM2132native4);
            }
            AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(AbstractC3605l.smaato(AbstractC13095l.m3537else(C4346l.f8873l, new C7442l((Function4) objM2132native4, c11636l, 19)), 5.0f), 1.0f), j, AbstractC7497l.yandex), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8457l(c11636l, i, j, i2);
        }
    }
}
