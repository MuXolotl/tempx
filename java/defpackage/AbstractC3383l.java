package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؕٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3383l {
    public static final Class[] yandex = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final LinkedHashMap admob(List list, C0544l c0544l) {
        HashMap map = new HashMap();
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Object obj : list) {
            Object obj2 = c0544l.get(obj);
            Integer num = (Integer) map.get(obj2);
            int iIntValue = num != null ? num.intValue() + 1 : 0;
            map.put(obj2, Integer.valueOf(iIntValue));
            linkedHashMap.put(new C0648l(iIntValue, obj2), obj);
        }
        return linkedHashMap;
    }

    public static final void amazon(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        InterfaceC6347l interfaceC6347lLoadAd;
        C12654l c12654l2;
        C7224l c7224l2;
        C5028l c5028l2;
        C15578l c15578l2;
        C12654l c12654l3;
        C7224l c7224l3;
        C5028l c5028lAmazon;
        C7224l c7224l4;
        int i4;
        InterfaceC6347l interfaceC6347l2;
        C12654l c12654l4;
        c6956l.m2133new(-1945643296);
        if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = (c6956l.billing(interfaceC17242l2) ? 4 : 2) | i;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                interfaceC6347lLoadAd = interfaceC6347l;
                int i5 = c6956l.billing(interfaceC6347lLoadAd) ? 32 : 16;
                i3 |= i5;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            i3 |= i5;
        } else {
            interfaceC6347lLoadAd = interfaceC6347l;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c12654l2 = c12654l;
                int i6 = c6956l.billing(c12654l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i6;
            } else {
                c12654l2 = c12654l;
            }
            i3 |= i6;
        } else {
            c12654l2 = c12654l;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                c7224l2 = c7224l;
                int i7 = c6956l.billing(c7224l2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                c7224l2 = c7224l;
            }
            i3 |= i7;
        } else {
            c7224l2 = c7224l;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c5028l2 = c5028l;
                int i8 = c6956l.billing(c5028l2) ? 16384 : 8192;
                i3 |= i8;
            } else {
                c5028l2 = c5028l;
            }
            i3 |= i8;
        } else {
            c5028l2 = c5028l;
        }
        if ((196608 & i) == 0) {
            c15578l2 = c15578l;
            i3 |= c6956l.admob(c15578l2) ? 131072 : 65536;
        } else {
            c15578l2 = c15578l;
        }
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            c6956l.m2141switch();
            int i9 = -57345;
            if ((i & 1) == 0 || c6956l.ad()) {
                if ((i2 & 2) != 0) {
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c12654l3 = c0764l.f2315super;
                    if (c12654l3 == null) {
                        C12654l c12654l5 = new C12654l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35)), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35))));
                        c0764l.f2315super = c12654l5;
                        c12654l3 = c12654l5;
                    }
                    i3 &= -897;
                } else {
                    i9 = -57345;
                    c12654l3 = c12654l2;
                }
                if ((i2 & 8) != 0) {
                    c7224l3 = new C7224l(0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f);
                    i3 &= -7169;
                } else {
                    c7224l3 = c7224l2;
                }
                if ((i2 & 16) != 0) {
                    i4 = i3 & i9;
                    interfaceC6347l2 = interfaceC6347lLoadAd;
                    c5028lAmazon = AbstractC13880l.amazon(c6956l, 1);
                    c12654l4 = c12654l3;
                    c7224l4 = c7224l3;
                } else {
                    c5028lAmazon = c5028l2;
                    c7224l4 = c7224l3;
                    i4 = i3;
                    interfaceC6347l2 = interfaceC6347lLoadAd;
                    c12654l4 = c12654l3;
                }
            } else {
                c6956l.m2124else();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                C5028l c5028l3 = c5028l2;
                i4 = i3;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                c12654l4 = c12654l2;
                c7224l4 = c7224l2;
                c5028lAmazon = c5028l3;
            }
            c6956l.adcel();
            yandex(interfaceC17242l2, interfaceC6347l2, c12654l4, c7224l4, c5028lAmazon, c15578l2, c6956l, i4 & 524286, 0);
            c5028l2 = c5028lAmazon;
            c7224l2 = c7224l4;
            c12654l2 = c12654l4;
            interfaceC6347lLoadAd = interfaceC6347l2;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15679l(interfaceC17242l, interfaceC6347lLoadAd, c12654l2, c7224l2, c5028l2, c15578l, i, i2, 0);
        }
    }

    public static final void billing(long j, C11090l c11090l, Function2 function2, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-684938728);
        if ((i & 6) == 0) {
            i2 = (c6956l.purchase(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(c11090l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C8540l c8540l = AbstractC13010l.yandex;
            AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(j, AbstractC12502l.yandex), c8540l.yandex(((C11090l) c6956l.isPro(c8540l)).purchase(c11090l))}, function2, c6956l, ((i2 >> 3) & 112) | 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4173l(j, c11090l, function2, i, 0);
        }
    }

    public static final long crashlytics(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final long isPro(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:114:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0137  */
    /* JADX WARN: Code duplicated, block: B:117:0x013c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0141  */
    /* JADX WARN: Code duplicated, block: B:123:0x014e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0163  */
    /* JADX WARN: Code duplicated, block: B:128:0x017b  */
    /* JADX WARN: Code duplicated, block: B:131:0x018e  */
    /* JADX WARN: Code duplicated, block: B:134:0x019a  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x0104  */
    public static final void loadAd(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, Function3 function3, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        boolean z2;
        int i5;
        InterfaceC6347l interfaceC6347lLoadAd;
        C12654l c12654lCrashlytics;
        C7224l c7224l2;
        int i6;
        C5028l c5028l2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        InterfaceC17242l interfaceC17242l3;
        boolean z4;
        InterfaceC6347l interfaceC6347l2;
        C12654l c12654l2;
        C7224l c7224l3;
        C5028l c5028l3;
        C4224l c4224lAds;
        C12654l c12654l3;
        boolean z5;
        Object objM2132native;
        long j;
        long j2;
        int i10;
        c6956l.m2133new(2136075085);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
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
                        interfaceC6347lLoadAd = interfaceC6347l;
                        int i12 = c6956l.billing(interfaceC6347lLoadAd) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        interfaceC6347lLoadAd = interfaceC6347l;
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        c12654lCrashlytics = c12654l;
                        int i13 = c6956l.billing(c12654lCrashlytics) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        c12654lCrashlytics = c12654l;
                    }
                    i3 |= i13;
                } else {
                    c12654lCrashlytics = c12654l;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        c7224l2 = c7224l;
                        int i14 = c6956l.billing(c7224l2) ? 131072 : 65536;
                        i3 |= i14;
                    } else {
                        c7224l2 = c7224l;
                    }
                    i3 |= i14;
                } else {
                    c7224l2 = c7224l;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        c5028l2 = c5028l;
                        if (c6956l.billing(c5028l2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    if ((i2 & 128) != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (c6956l.billing(null)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i3 |= i8;
                    }
                    if ((i & 100663296) == 0) {
                        if (c6956l.admob(function3)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                        i3 |= i10;
                    }
                    i9 = 1;
                    if ((38347923 & i3) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c6956l.m2127for(i3 & 1, z3)) {
                        c6956l.m2141switch();
                        if ((i & 1) != 0 || c6956l.ad()) {
                            if (i11 != 0) {
                                interfaceC17242l2 = C4346l.f8873l;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                            }
                            if (i6 != 0) {
                                c5028l2 = null;
                            }
                        } else {
                            c6956l.m2124else();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        int i15 = i3;
                        c12654l3 = c12654lCrashlytics;
                        C7224l c7224l4 = c7224l2;
                        C5028l c5028l4 = c5028l2;
                        z5 = z2;
                        InterfaceC6347l interfaceC6347l3 = interfaceC6347lLoadAd;
                        InterfaceC17242l interfaceC17242l4 = interfaceC17242l2;
                        c6956l.adcel();
                        c6956l.m2123default(1577873102);
                        objM2132native = c6956l.m2132native();
                        if (objM2132native == C1867l.yandex) {
                            objM2132native = AbstractC14814l.isPro(c6956l);
                        }
                        C2403l c2403l = (C2403l) objM2132native;
                        c6956l.startapp(false);
                        if (z5) {
                            j = c12654l3.yandex;
                        } else {
                            j = c12654l3.crashlytics;
                        }
                        long j3 = j;
                        if (z5) {
                            j2 = c12654l3.loadAd;
                        } else {
                            j2 = c12654l3.amazon;
                        }
                        AbstractC3274l.crashlytics(function0, interfaceC17242l4, z5, interfaceC6347l3, j3, j2, 0.0f, ((C14467l) c7224l4.yandex(z5, c2403l, c6956l, ((i15 >> 6) & 14) | ((i15 >> 9) & 896)).getValue()).f28331l, c5028l4, c2403l, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i15 & 8190) | ((i15 << 6) & 234881024), 64);
                        c12654l2 = c12654l3;
                        c7224l3 = c7224l4;
                        interfaceC17242l3 = interfaceC17242l4;
                        z4 = z5;
                        interfaceC6347l2 = interfaceC6347l3;
                        c5028l3 = c5028l4;
                    } else {
                        c6956l.m2124else();
                        interfaceC17242l3 = interfaceC17242l2;
                        z4 = z2;
                        interfaceC6347l2 = interfaceC6347lLoadAd;
                        c12654l2 = c12654lCrashlytics;
                        c7224l3 = c7224l2;
                        c5028l3 = c5028l2;
                    }
                    c4224lAds = c6956l.ads();
                    if (c4224lAds != null) {
                        c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
                    }
                }
                i3 |= 1572864;
                c5028l2 = c5028l;
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (c6956l.billing(null)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if (c6956l.admob(function3)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i9 = 1;
                if ((38347923 & i3) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    } else {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    }
                    int i16 = i3;
                    c12654l3 = c12654lCrashlytics;
                    C7224l c7224l5 = c7224l2;
                    C5028l c5028l5 = c5028l2;
                    z5 = z2;
                    InterfaceC6347l interfaceC6347l4 = interfaceC6347lLoadAd;
                    InterfaceC17242l interfaceC17242l5 = interfaceC17242l2;
                    c6956l.adcel();
                    c6956l.m2123default(1577873102);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = AbstractC14814l.isPro(c6956l);
                    }
                    C2403l c2403l2 = (C2403l) objM2132native;
                    c6956l.startapp(false);
                    if (z5) {
                        j = c12654l3.yandex;
                    } else {
                        j = c12654l3.crashlytics;
                    }
                    long j4 = j;
                    if (z5) {
                        j2 = c12654l3.loadAd;
                    } else {
                        j2 = c12654l3.amazon;
                    }
                    AbstractC3274l.crashlytics(function0, interfaceC17242l5, z5, interfaceC6347l4, j4, j2, 0.0f, ((C14467l) c7224l5.yandex(z5, c2403l2, c6956l, ((i16 >> 6) & 14) | ((i16 >> 9) & 896)).getValue()).f28331l, c5028l5, c2403l2, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i16 & 8190) | ((i16 << 6) & 234881024), 64);
                    c12654l2 = c12654l3;
                    c7224l3 = c7224l5;
                    interfaceC17242l3 = interfaceC17242l5;
                    z4 = z5;
                    interfaceC6347l2 = interfaceC6347l4;
                    c5028l3 = c5028l5;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    interfaceC6347l2 = interfaceC6347lLoadAd;
                    c12654l2 = c12654lCrashlytics;
                    c7224l3 = c7224l2;
                    c5028l3 = c5028l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    interfaceC6347lLoadAd = interfaceC6347l;
                    if (c6956l.billing(interfaceC6347lLoadAd)) {
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l;
                }
                i3 |= i12;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c12654lCrashlytics = c12654l;
                    if (c6956l.billing(c12654lCrashlytics)) {
                    }
                    i3 |= i13;
                } else {
                    c12654lCrashlytics = c12654l;
                }
                i3 |= i13;
            } else {
                c12654lCrashlytics = c12654l;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c7224l2 = c7224l;
                    if (c6956l.billing(c7224l2)) {
                    }
                    i3 |= i14;
                } else {
                    c7224l2 = c7224l;
                }
                i3 |= i14;
            } else {
                c7224l2 = c7224l;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    c5028l2 = c5028l;
                    if (c6956l.billing(c5028l2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (c6956l.billing(null)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if (c6956l.admob(function3)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i9 = 1;
                if ((38347923 & i3) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    } else {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    }
                    int i17 = i3;
                    c12654l3 = c12654lCrashlytics;
                    C7224l c7224l6 = c7224l2;
                    C5028l c5028l6 = c5028l2;
                    z5 = z2;
                    InterfaceC6347l interfaceC6347l5 = interfaceC6347lLoadAd;
                    InterfaceC17242l interfaceC17242l6 = interfaceC17242l2;
                    c6956l.adcel();
                    c6956l.m2123default(1577873102);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = AbstractC14814l.isPro(c6956l);
                    }
                    C2403l c2403l3 = (C2403l) objM2132native;
                    c6956l.startapp(false);
                    if (z5) {
                        j = c12654l3.yandex;
                    } else {
                        j = c12654l3.crashlytics;
                    }
                    long j5 = j;
                    if (z5) {
                        j2 = c12654l3.loadAd;
                    } else {
                        j2 = c12654l3.amazon;
                    }
                    AbstractC3274l.crashlytics(function0, interfaceC17242l6, z5, interfaceC6347l5, j5, j2, 0.0f, ((C14467l) c7224l6.yandex(z5, c2403l3, c6956l, ((i17 >> 6) & 14) | ((i17 >> 9) & 896)).getValue()).f28331l, c5028l6, c2403l3, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i17 & 8190) | ((i17 << 6) & 234881024), 64);
                    c12654l2 = c12654l3;
                    c7224l3 = c7224l6;
                    interfaceC17242l3 = interfaceC17242l6;
                    z4 = z5;
                    interfaceC6347l2 = interfaceC6347l5;
                    c5028l3 = c5028l6;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    interfaceC6347l2 = interfaceC6347lLoadAd;
                    c12654l2 = c12654lCrashlytics;
                    c7224l3 = c7224l2;
                    c5028l3 = c5028l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
                }
            }
            i3 |= 1572864;
            c5028l2 = c5028l;
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (c6956l.billing(null)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                if (c6956l.admob(function3)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i9 = 1;
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                } else {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                }
                int i18 = i3;
                c12654l3 = c12654lCrashlytics;
                C7224l c7224l7 = c7224l2;
                C5028l c5028l7 = c5028l2;
                z5 = z2;
                InterfaceC6347l interfaceC6347l6 = interfaceC6347lLoadAd;
                InterfaceC17242l interfaceC17242l7 = interfaceC17242l2;
                c6956l.adcel();
                c6956l.m2123default(1577873102);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                C2403l c2403l4 = (C2403l) objM2132native;
                c6956l.startapp(false);
                if (z5) {
                    j = c12654l3.yandex;
                } else {
                    j = c12654l3.crashlytics;
                }
                long j6 = j;
                if (z5) {
                    j2 = c12654l3.loadAd;
                } else {
                    j2 = c12654l3.amazon;
                }
                AbstractC3274l.crashlytics(function0, interfaceC17242l7, z5, interfaceC6347l6, j6, j2, 0.0f, ((C14467l) c7224l7.yandex(z5, c2403l4, c6956l, ((i18 >> 6) & 14) | ((i18 >> 9) & 896)).getValue()).f28331l, c5028l7, c2403l4, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i18 & 8190) | ((i18 << 6) & 234881024), 64);
                c12654l2 = c12654l3;
                c7224l3 = c7224l7;
                interfaceC17242l3 = interfaceC17242l7;
                z4 = z5;
                interfaceC6347l2 = interfaceC6347l6;
                c5028l3 = c5028l7;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                c12654l2 = c12654lCrashlytics;
                c7224l3 = c7224l2;
                c5028l3 = c5028l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
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
                    interfaceC6347lLoadAd = interfaceC6347l;
                    if (c6956l.billing(interfaceC6347lLoadAd)) {
                    }
                    i3 |= i12;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l;
                }
                i3 |= i12;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c12654lCrashlytics = c12654l;
                    if (c6956l.billing(c12654lCrashlytics)) {
                    }
                    i3 |= i13;
                } else {
                    c12654lCrashlytics = c12654l;
                }
                i3 |= i13;
            } else {
                c12654lCrashlytics = c12654l;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c7224l2 = c7224l;
                    if (c6956l.billing(c7224l2)) {
                    }
                    i3 |= i14;
                } else {
                    c7224l2 = c7224l;
                }
                i3 |= i14;
            } else {
                c7224l2 = c7224l;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    c5028l2 = c5028l;
                    if (c6956l.billing(c5028l2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (c6956l.billing(null)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((i & 100663296) == 0) {
                    if (c6956l.admob(function3)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                i9 = 1;
                if ((38347923 & i3) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i3 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    } else {
                        if (i11 != 0) {
                            interfaceC17242l2 = C4346l.f8873l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                        }
                        if (i6 != 0) {
                            c5028l2 = null;
                        }
                    }
                    int i19 = i3;
                    c12654l3 = c12654lCrashlytics;
                    C7224l c7224l8 = c7224l2;
                    C5028l c5028l8 = c5028l2;
                    z5 = z2;
                    InterfaceC6347l interfaceC6347l7 = interfaceC6347lLoadAd;
                    InterfaceC17242l interfaceC17242l8 = interfaceC17242l2;
                    c6956l.adcel();
                    c6956l.m2123default(1577873102);
                    objM2132native = c6956l.m2132native();
                    if (objM2132native == C1867l.yandex) {
                        objM2132native = AbstractC14814l.isPro(c6956l);
                    }
                    C2403l c2403l5 = (C2403l) objM2132native;
                    c6956l.startapp(false);
                    if (z5) {
                        j = c12654l3.yandex;
                    } else {
                        j = c12654l3.crashlytics;
                    }
                    long j7 = j;
                    if (z5) {
                        j2 = c12654l3.loadAd;
                    } else {
                        j2 = c12654l3.amazon;
                    }
                    AbstractC3274l.crashlytics(function0, interfaceC17242l8, z5, interfaceC6347l7, j7, j2, 0.0f, ((C14467l) c7224l8.yandex(z5, c2403l5, c6956l, ((i19 >> 6) & 14) | ((i19 >> 9) & 896)).getValue()).f28331l, c5028l8, c2403l5, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i19 & 8190) | ((i19 << 6) & 234881024), 64);
                    c12654l2 = c12654l3;
                    c7224l3 = c7224l8;
                    interfaceC17242l3 = interfaceC17242l8;
                    z4 = z5;
                    interfaceC6347l2 = interfaceC6347l7;
                    c5028l3 = c5028l8;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l3 = interfaceC17242l2;
                    z4 = z2;
                    interfaceC6347l2 = interfaceC6347lLoadAd;
                    c12654l2 = c12654lCrashlytics;
                    c7224l3 = c7224l2;
                    c5028l3 = c5028l2;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
                }
            }
            i3 |= 1572864;
            c5028l2 = c5028l;
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (c6956l.billing(null)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                if (c6956l.admob(function3)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i9 = 1;
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                } else {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                }
                int i110 = i3;
                c12654l3 = c12654lCrashlytics;
                C7224l c7224l9 = c7224l2;
                C5028l c5028l9 = c5028l2;
                z5 = z2;
                InterfaceC6347l interfaceC6347l8 = interfaceC6347lLoadAd;
                InterfaceC17242l interfaceC17242l9 = interfaceC17242l2;
                c6956l.adcel();
                c6956l.m2123default(1577873102);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                C2403l c2403l6 = (C2403l) objM2132native;
                c6956l.startapp(false);
                if (z5) {
                    j = c12654l3.yandex;
                } else {
                    j = c12654l3.crashlytics;
                }
                long j8 = j;
                if (z5) {
                    j2 = c12654l3.loadAd;
                } else {
                    j2 = c12654l3.amazon;
                }
                AbstractC3274l.crashlytics(function0, interfaceC17242l9, z5, interfaceC6347l8, j8, j2, 0.0f, ((C14467l) c7224l9.yandex(z5, c2403l6, c6956l, ((i110 >> 6) & 14) | ((i110 >> 9) & 896)).getValue()).f28331l, c5028l9, c2403l6, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i110 & 8190) | ((i110 << 6) & 234881024), 64);
                c12654l2 = c12654l3;
                c7224l3 = c7224l9;
                interfaceC17242l3 = interfaceC17242l9;
                z4 = z5;
                interfaceC6347l2 = interfaceC6347l8;
                c5028l3 = c5028l9;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                c12654l2 = c12654lCrashlytics;
                c7224l3 = c7224l2;
                c5028l3 = c5028l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                interfaceC6347lLoadAd = interfaceC6347l;
                if (c6956l.billing(interfaceC6347lLoadAd)) {
                }
                i3 |= i12;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            i3 |= i12;
        } else {
            interfaceC6347lLoadAd = interfaceC6347l;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c12654lCrashlytics = c12654l;
                if (c6956l.billing(c12654lCrashlytics)) {
                }
                i3 |= i13;
            } else {
                c12654lCrashlytics = c12654l;
            }
            i3 |= i13;
        } else {
            c12654lCrashlytics = c12654l;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c7224l2 = c7224l;
                if (c6956l.billing(c7224l2)) {
                }
                i3 |= i14;
            } else {
                c7224l2 = c7224l;
            }
            i3 |= i14;
        } else {
            c7224l2 = c7224l;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                c5028l2 = c5028l;
                if (c6956l.billing(c5028l2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (c6956l.billing(null)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((i & 100663296) == 0) {
                if (c6956l.admob(function3)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            i9 = 1;
            if ((38347923 & i3) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i3 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                } else {
                    if (i11 != 0) {
                        interfaceC17242l2 = C4346l.f8873l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    if (i6 != 0) {
                        c5028l2 = null;
                    }
                }
                int i111 = i3;
                c12654l3 = c12654lCrashlytics;
                C7224l c7224l10 = c7224l2;
                C5028l c5028l10 = c5028l2;
                z5 = z2;
                InterfaceC6347l interfaceC6347l9 = interfaceC6347lLoadAd;
                InterfaceC17242l interfaceC17242l10 = interfaceC17242l2;
                c6956l.adcel();
                c6956l.m2123default(1577873102);
                objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                C2403l c2403l7 = (C2403l) objM2132native;
                c6956l.startapp(false);
                if (z5) {
                    j = c12654l3.yandex;
                } else {
                    j = c12654l3.crashlytics;
                }
                long j9 = j;
                if (z5) {
                    j2 = c12654l3.loadAd;
                } else {
                    j2 = c12654l3.amazon;
                }
                AbstractC3274l.crashlytics(function0, interfaceC17242l10, z5, interfaceC6347l9, j9, j2, 0.0f, ((C14467l) c7224l10.yandex(z5, c2403l7, c6956l, ((i111 >> 6) & 14) | ((i111 >> 9) & 896)).getValue()).f28331l, c5028l10, c2403l7, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i111 & 8190) | ((i111 << 6) & 234881024), 64);
                c12654l2 = c12654l3;
                c7224l3 = c7224l10;
                interfaceC17242l3 = interfaceC17242l10;
                z4 = z5;
                interfaceC6347l2 = interfaceC6347l9;
                c5028l3 = c5028l10;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                z4 = z2;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                c12654l2 = c12654lCrashlytics;
                c7224l3 = c7224l2;
                c5028l3 = c5028l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
            }
        }
        i3 |= 1572864;
        c5028l2 = c5028l;
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (c6956l.billing(null)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (c6956l.admob(function3)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        i9 = 1;
        if ((38347923 & i3) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i3 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                }
                if (i6 != 0) {
                    c5028l2 = null;
                }
            } else {
                if (i11 != 0) {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                }
                if (i6 != 0) {
                    c5028l2 = null;
                }
            }
            int i112 = i3;
            c12654l3 = c12654lCrashlytics;
            C7224l c7224l11 = c7224l2;
            C5028l c5028l11 = c5028l2;
            z5 = z2;
            InterfaceC6347l interfaceC6347l10 = interfaceC6347lLoadAd;
            InterfaceC17242l interfaceC17242l11 = interfaceC17242l2;
            c6956l.adcel();
            c6956l.m2123default(1577873102);
            objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l8 = (C2403l) objM2132native;
            c6956l.startapp(false);
            if (z5) {
                j = c12654l3.yandex;
            } else {
                j = c12654l3.crashlytics;
            }
            long j10 = j;
            if (z5) {
                j2 = c12654l3.loadAd;
            } else {
                j2 = c12654l3.amazon;
            }
            AbstractC3274l.crashlytics(function0, interfaceC17242l11, z5, interfaceC6347l10, j10, j2, 0.0f, ((C14467l) c7224l11.yandex(z5, c2403l8, c6956l, ((i112 >> 6) & 14) | ((i112 >> 9) & 896)).getValue()).f28331l, c5028l11, c2403l8, AbstractC14566l.amazon(-1347531112, new C15232l(i9, function3), c6956l), c6956l, (i112 & 8190) | ((i112 << 6) & 234881024), 64);
            c12654l2 = c12654l3;
            c7224l3 = c7224l11;
            interfaceC17242l3 = interfaceC17242l11;
            z4 = z5;
            interfaceC6347l2 = interfaceC6347l10;
            c5028l3 = c5028l11;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            z4 = z2;
            interfaceC6347l2 = interfaceC6347lLoadAd;
            c12654l2 = c12654lCrashlytics;
            c7224l3 = c7224l2;
            c5028l3 = c5028l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z4, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 3);
        }
    }

    public static final boolean mopub(Object obj) {
        if (obj instanceof InterfaceC0938l) {
            InterfaceC0938l interfaceC0938l = (InterfaceC0938l) obj;
            if (interfaceC0938l.loadAd() == C18450l.f36015l || interfaceC0938l.loadAd() == C7472l.f15463l || interfaceC0938l.loadAd() == C1461l.f3659l) {
                Object value = interfaceC0938l.getValue();
                if (value == null) {
                    return true;
                }
                return mopub(value);
            }
        } else if (!(obj instanceof InterfaceC14328l) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (yandex[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void purchase(Function0 function0, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, C15578l c15578l, C6956l c6956l, int i, int i2) {
        Function0 function1;
        int i3;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        C12654l c12654l2;
        int i5;
        boolean z2;
        InterfaceC6347l interfaceC6347l2;
        C7224l c7224l2;
        C5028l c5028l2;
        C12654l c12654l3;
        InterfaceC17242l interfaceC17242l3;
        boolean z3;
        C4224l c4224lAds;
        int i6;
        InterfaceC17242l interfaceC17242l4;
        InterfaceC6347l interfaceC6347lLoadAd;
        int i7;
        C12654l c12654l4;
        int i8;
        int i9;
        InterfaceC17242l interfaceC17242l5;
        C5028l c5028lAmazon;
        C12654l c12654l5;
        boolean z4;
        C7224l c7224l3;
        C0764l c0764l;
        int i10;
        c6956l.m2133new(1401605899);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (c6956l.admob(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            i4 = i3 | 384;
            if ((i & 3072) == 0) {
                i4 = i3 | 1408;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c12654l2 = c12654l;
                    int i12 = c6956l.billing(c12654l2) ? 16384 : 8192;
                    i4 |= i12;
                } else {
                    c12654l2 = c12654l;
                }
                i4 |= i12;
            } else {
                c12654l2 = c12654l;
            }
            if ((196608 & i) == 0) {
                i4 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i5 = i4 | 12582912;
            if ((100663296 & i) == 0) {
                if (c6956l.admob(c15578l)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i5 |= i10;
            }
            if ((38347923 & i5) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i5 & 1, z2)) {
                c6956l.m2141switch();
                i6 = -4128769;
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i11 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    i7 = i5 & (-7169);
                    if ((i2 & 16) != 0) {
                        c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                        c12654l4 = c0764l.f2315super;
                        if (c12654l4 == null) {
                            C12654l c12654l6 = new C12654l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35)), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35))));
                            c0764l.f2315super = c12654l6;
                            c12654l4 = c12654l6;
                        }
                        i8 = i5 & (-64513);
                    } else {
                        i6 = -4128769;
                        c12654l4 = c12654l2;
                        i8 = i7;
                    }
                    C7224l c7224l4 = new C7224l(0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f);
                    i9 = i8 & i6;
                    interfaceC17242l5 = interfaceC17242l4;
                    c5028lAmazon = AbstractC13880l.amazon(c6956l, 0);
                    c12654l5 = c12654l4;
                    z4 = true;
                    c7224l3 = c7224l4;
                } else {
                    c6956l.m2124else();
                    int i13 = i5 & (-7169);
                    if ((i2 & 16) != 0) {
                        i13 = i5 & (-64513);
                    }
                    c7224l3 = c7224l;
                    c5028lAmazon = c5028l;
                    c12654l5 = c12654l2;
                    i9 = i13 & (-4128769);
                    interfaceC17242l5 = interfaceC17242l2;
                    z4 = z;
                    interfaceC6347lLoadAd = interfaceC6347l;
                }
                c6956l.adcel();
                loadAd(function1, interfaceC17242l5, z4, interfaceC6347lLoadAd, c12654l5, c7224l3, c5028lAmazon, c15578l, c6956l, 268435454 & i9, 0);
                c5028l2 = c5028lAmazon;
                c7224l2 = c7224l3;
                c12654l3 = c12654l5;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                z3 = z4;
                interfaceC17242l3 = interfaceC17242l5;
            } else {
                c6956l.m2124else();
                interfaceC6347l2 = interfaceC6347l;
                c7224l2 = c7224l;
                c5028l2 = c5028l;
                c12654l3 = c12654l2;
                interfaceC17242l3 = interfaceC17242l2;
                z3 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z3, interfaceC6347l2, c12654l3, c7224l2, c5028l2, c15578l, i, i2, 4);
            }
        }
        i3 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i3 | 384;
        if ((i & 3072) == 0) {
            i4 = i3 | 1408;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c12654l2 = c12654l;
                if (c6956l.billing(c12654l2)) {
                }
                i4 |= i12;
            } else {
                c12654l2 = c12654l;
            }
            i4 |= i12;
        } else {
            c12654l2 = c12654l;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i5 = i4 | 12582912;
        if ((100663296 & i) == 0) {
            if (c6956l.admob(c15578l)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i5 |= i10;
        }
        if ((38347923 & i5) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i5 & 1, z2)) {
            c6956l.m2141switch();
            i6 = -4128769;
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                i7 = i5 & (-7169);
                if ((i2 & 16) != 0) {
                    c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c12654l4 = c0764l.f2315super;
                    if (c12654l4 == null) {
                        C12654l c12654l7 = new C12654l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35)), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35))));
                        c0764l.f2315super = c12654l7;
                        c12654l4 = c12654l7;
                    }
                    i8 = i5 & (-64513);
                } else {
                    i6 = -4128769;
                    c12654l4 = c12654l2;
                    i8 = i7;
                }
                C7224l c7224l5 = new C7224l(0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f);
                i9 = i8 & i6;
                interfaceC17242l5 = interfaceC17242l4;
                c5028lAmazon = AbstractC13880l.amazon(c6956l, 0);
                c12654l5 = c12654l4;
                z4 = true;
                c7224l3 = c7224l5;
            } else {
                if (i11 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                i7 = i5 & (-7169);
                if ((i2 & 16) != 0) {
                    c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c12654l4 = c0764l.f2315super;
                    if (c12654l4 == null) {
                        C12654l c12654l8 = new C12654l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35)), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.yandex(c0764l, AbstractC15038l.amazon(c0764l, 35))));
                        c0764l.f2315super = c12654l8;
                        c12654l4 = c12654l8;
                    }
                    i8 = i5 & (-64513);
                } else {
                    i6 = -4128769;
                    c12654l4 = c12654l2;
                    i8 = i7;
                }
                C7224l c7224l6 = new C7224l(0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f);
                i9 = i8 & i6;
                interfaceC17242l5 = interfaceC17242l4;
                c5028lAmazon = AbstractC13880l.amazon(c6956l, 0);
                c12654l5 = c12654l4;
                z4 = true;
                c7224l3 = c7224l6;
            }
            c6956l.adcel();
            loadAd(function1, interfaceC17242l5, z4, interfaceC6347lLoadAd, c12654l5, c7224l3, c5028lAmazon, c15578l, c6956l, 268435454 & i9, 0);
            c5028l2 = c5028lAmazon;
            c7224l2 = c7224l3;
            c12654l3 = c12654l5;
            interfaceC6347l2 = interfaceC6347lLoadAd;
            z3 = z4;
            interfaceC17242l3 = interfaceC17242l5;
        } else {
            c6956l.m2124else();
            interfaceC6347l2 = interfaceC6347l;
            c7224l2 = c7224l;
            c5028l2 = c5028l;
            c12654l3 = c12654l2;
            interfaceC17242l3 = interfaceC17242l2;
            z3 = z;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8602l(function0, interfaceC17242l3, z3, interfaceC6347l2, c12654l3, c7224l2, c5028l2, c15578l, i, i2, 4);
        }
    }

    public static final long subs(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:105:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void yandex(InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, C12654l c12654l, C7224l c7224l, C5028l c5028l, Function3 function3, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        InterfaceC6347l interfaceC6347lLoadAd;
        C12654l c12654lCrashlytics;
        C7224l c7224l2;
        C5028l c5028l2;
        boolean z;
        InterfaceC6347l interfaceC6347l2;
        C12654l c12654l2;
        C5028l c5028l3;
        InterfaceC17242l interfaceC17242l3;
        C7224l c7224l3;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        C12654l c12654l3;
        InterfaceC6347l interfaceC6347l3;
        C5028l c5028l4;
        int i4;
        c6956l.m2133new(1359693790);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = (c6956l.billing(interfaceC17242l2) ? 4 : 2) | i;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                interfaceC6347lLoadAd = interfaceC6347l;
                int i6 = c6956l.billing(interfaceC6347lLoadAd) ? 32 : 16;
                i3 |= i6;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            i3 |= i6;
        } else {
            interfaceC6347lLoadAd = interfaceC6347l;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c12654lCrashlytics = c12654l;
                int i7 = c6956l.billing(c12654lCrashlytics) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                i3 |= i7;
            } else {
                c12654lCrashlytics = c12654l;
            }
            i3 |= i7;
        } else {
            c12654lCrashlytics = c12654l;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                c7224l2 = c7224l;
                int i8 = c6956l.billing(c7224l2) ? 2048 : 1024;
                i3 |= i8;
            } else {
                c7224l2 = c7224l;
            }
            i3 |= i8;
        } else {
            c7224l2 = c7224l;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                c5028l2 = c5028l;
                i3 |= c6956l.billing(c5028l2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                if (c6956l.admob(function3)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i5 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                    }
                    InterfaceC6347l interfaceC6347l4 = interfaceC6347lLoadAd;
                    interfaceC17242l3 = interfaceC17242l4;
                    c12654l3 = c12654lCrashlytics;
                    interfaceC6347l3 = interfaceC6347l4;
                    c7224l3 = c7224l2;
                    if (i9 != 0) {
                        c5028l4 = null;
                    } else {
                        c5028l4 = c5028l2;
                    }
                } else {
                    c6956l.m2124else();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    c12654l3 = c12654lCrashlytics;
                    c5028l4 = c5028l2;
                    interfaceC6347l3 = interfaceC6347lLoadAd;
                    interfaceC17242l3 = interfaceC17242l2;
                    c7224l3 = c7224l2;
                }
                c6956l.adcel();
                AbstractC3274l.yandex(interfaceC17242l3, interfaceC6347l3, c12654l3.yandex, c12654l3.loadAd, 0.0f, ((C14467l) c7224l3.yandex(true, null, c6956l, ((i3 >> 3) & 896) | 54).getValue()).f28331l, c5028l4, AbstractC14566l.amazon(-97109725, new C15232l(2, function3), c6956l), c6956l, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                c12654l2 = c12654l3;
                interfaceC6347l2 = interfaceC6347l3;
                c5028l3 = c5028l4;
            } else {
                c6956l.m2124else();
                interfaceC6347l2 = interfaceC6347lLoadAd;
                c12654l2 = c12654lCrashlytics;
                c5028l3 = c5028l2;
                interfaceC17242l3 = interfaceC17242l2;
                c7224l3 = c7224l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C15679l(interfaceC17242l3, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 1);
            }
        }
        i3 |= 24576;
        c5028l2 = c5028l;
        if ((196608 & i) == 0) {
            if (c6956l.admob(function3)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                }
                InterfaceC6347l interfaceC6347l5 = interfaceC6347lLoadAd;
                interfaceC17242l3 = interfaceC17242l4;
                c12654l3 = c12654lCrashlytics;
                interfaceC6347l3 = interfaceC6347l5;
                c7224l3 = c7224l2;
                if (i9 != 0) {
                    c5028l4 = null;
                } else {
                    c5028l4 = c5028l2;
                }
            } else {
                if (i5 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    c12654lCrashlytics = AbstractC13880l.crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    c7224l2 = new C7224l(0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f);
                }
                InterfaceC6347l interfaceC6347l6 = interfaceC6347lLoadAd;
                interfaceC17242l3 = interfaceC17242l4;
                c12654l3 = c12654lCrashlytics;
                interfaceC6347l3 = interfaceC6347l6;
                c7224l3 = c7224l2;
                if (i9 != 0) {
                    c5028l4 = null;
                } else {
                    c5028l4 = c5028l2;
                }
            }
            c6956l.adcel();
            AbstractC3274l.yandex(interfaceC17242l3, interfaceC6347l3, c12654l3.yandex, c12654l3.loadAd, 0.0f, ((C14467l) c7224l3.yandex(true, null, c6956l, ((i3 >> 3) & 896) | 54).getValue()).f28331l, c5028l4, AbstractC14566l.amazon(-97109725, new C15232l(2, function3), c6956l), c6956l, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
            c12654l2 = c12654l3;
            interfaceC6347l2 = interfaceC6347l3;
            c5028l3 = c5028l4;
        } else {
            c6956l.m2124else();
            interfaceC6347l2 = interfaceC6347lLoadAd;
            c12654l2 = c12654lCrashlytics;
            c5028l3 = c5028l2;
            interfaceC17242l3 = interfaceC17242l2;
            c7224l3 = c7224l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15679l(interfaceC17242l3, interfaceC6347l2, c12654l2, c7224l3, c5028l3, function3, i, i2, 1);
        }
    }
}
