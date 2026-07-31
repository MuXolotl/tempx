package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗٔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17122l {
    public static final C13657l yandex = new C13657l(1);

    public static void admob(int i, int i2, int i3) {
        String strSubs;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strSubs = subs(i, i3, "start index");
            } else {
                strSubs = (i2 < 0 || i2 > i3) ? subs(i2, i3, "end index") : AbstractC15344l.subs("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strSubs);
        }
    }

    public static final void amazon(Function2 function2, C15578l c15578l, InterfaceC11780l interfaceC11780l, C6956l c6956l, int i) {
        c6956l.m2133new(-1069265073);
        int i2 = (c6956l.admob(function2) ? 4 : 2) | i | (c6956l.admob(c15578l) ? 32 : 16) | (c6956l.billing(interfaceC11780l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C14855l c14855l = C18450l.f36043l;
            InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(C4346l.f8873l, interfaceC11780l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
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
            AbstractC13010l.yandex(AbstractC8644l.yandex(c6956l, 10), AbstractC14566l.amazon(-1372614088, new C3411l(function2, c15578l, C17423l.remoteconfig(c6956l, 2), i3), c6956l), c6956l, 48);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1856l(function2, c15578l, interfaceC11780l, i);
        }
    }

    public static final void billing(InterfaceC12932l interfaceC12932l, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC11589l.yandex.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0805l) it.next()).mo685continue(interfaceC12932l, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC11718l.yandex(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC11718l.yandex(th, new C18197l(interfaceC12932l));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x0211  */
    /* JADX WARN: Code duplicated, block: B:116:0x0262  */
    /* JADX WARN: Code duplicated, block: B:119:0x0276  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x013e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    /* JADX WARN: Code duplicated, block: B:88:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:99:0x01af A[ADDED_TO_REGION] */
    public static final void crashlytics(C0275l c0275l, boolean z, Function0 function0, InterfaceC6347l interfaceC6347l, InterfaceC17242l interfaceC17242l, boolean z2, C13959l c13959l, C5028l c5028l, InterfaceC11780l interfaceC11780l, Function2 function2, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC6347l interfaceC6347l2;
        boolean z3;
        int i4;
        boolean z4;
        InterfaceC17242l interfaceC17242l2;
        C13959l c13959l2;
        C5028l c5028l2;
        InterfaceC11780l interfaceC11780l2;
        Function2 function3;
        boolean z5;
        C4224l c4224lAds;
        C0764l c0764l;
        C13959l c13959l3;
        C13959l c13959l4;
        long j;
        boolean z6;
        InterfaceC17242l interfaceC17242l3;
        C5028l c5028l3;
        InterfaceC11780l interfaceC11780l3;
        Function2 function4;
        int i5;
        C13959l c13959l5;
        Object objM2132native;
        Object obj;
        C2403l c2403l;
        boolean z7;
        long j2;
        long j3;
        long j4;
        Object objM2132native2;
        C15308l c15308l;
        boolean zBilling;
        Object objM2132native3;
        int i6;
        Object objM2132native4;
        c6956l.m2133new(1532041126);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(c0275l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6347l2 = interfaceC6347l;
            i3 |= c6956l.billing(interfaceC6347l2) ? 2048 : 1024;
        } else {
            interfaceC6347l2 = interfaceC6347l;
        }
        int i7 = i3 | 24576;
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                i7 |= c6956l.mopub(z3) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                i7 |= 524288;
            }
            if ((12582912 & i) == 0) {
                i7 |= 4194304;
            }
            i4 = i7 | 905969664;
            if ((306783379 & i4) == 306783378) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (c6956l.m2127for(i4 & 1, z4)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i8 != 0) {
                        z3 = true;
                    }
                    C7069l c7069l = C7069l.yandex;
                    c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                    c13959l3 = c0764l.f2300implements;
                    if (c13959l3 == null) {
                        long jAmazon = AbstractC15038l.amazon(c0764l, 32);
                        long jAmazon2 = AbstractC15038l.amazon(c0764l, 15);
                        long jAmazon3 = AbstractC15038l.amazon(c0764l, 24);
                        long j5 = C9735l.isPro;
                        c13959l4 = new C13959l(jAmazon, jAmazon2, jAmazon3, j5, AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 32), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)), j5, C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)));
                        c0764l.f2300implements = c13959l4;
                    } else {
                        c13959l4 = c13959l3;
                    }
                    if (!z3 && z) {
                        j = c13959l4.crashlytics;
                    } else if (!z3 && !z) {
                        j = c13959l4.billing;
                    } else if (z3 && z) {
                        j = c13959l4.subs;
                    } else {
                        j = c13959l4.smaato;
                    }
                    C5028l c5028lYandex = AbstractC2576l.yandex(1.0f, j);
                    C17253l c17253l = C7069l.loadAd;
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-643804033, new C4584l(z, 8), c6956l);
                    C13959l c13959l6 = c13959l4;
                    z6 = z3;
                    interfaceC17242l3 = C4346l.f8873l;
                    c5028l3 = c5028lYandex;
                    interfaceC11780l3 = c17253l;
                    function4 = c15578lAmazon;
                    i5 = i4 & (-33030145);
                    c13959l5 = c13959l6;
                } else {
                    c6956l.m2124else();
                    int i9 = i4 & (-33030145);
                    c13959l5 = c13959l;
                    c5028l3 = c5028l;
                    interfaceC11780l3 = interfaceC11780l;
                    function4 = function2;
                    i5 = i9;
                    z6 = z3;
                    interfaceC17242l3 = interfaceC17242l;
                }
                c6956l.adcel();
                c6956l.m2123default(-1579573323);
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                if (objM2132native == obj) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l = (C2403l) objM2132native;
                c6956l.startapp(false);
                c13959l5.getClass();
                if (z6 || !z) {
                    z7 = z6;
                    if (!z7 && !z) {
                        j2 = c13959l5.amazon;
                    } else if (z7 && z) {
                        j2 = c13959l5.mopub;
                    } else {
                        j2 = c13959l5.isPro;
                    }
                } else {
                    z7 = z6;
                    j2 = c13959l5.yandex;
                }
                if (z7 || !z) {
                    j3 = j2;
                    if (!z7 && !z) {
                        j4 = c13959l5.purchase;
                    } else if (z7 && z) {
                        j4 = c13959l5.admob;
                    } else {
                        j4 = c13959l5.firebase;
                    }
                } else {
                    j3 = j2;
                    j4 = c13959l5.loadAd;
                }
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = new C15308l(0);
                    c6956l.m2147try(objM2132native2);
                }
                c15308l = (C15308l) objM2132native2;
                zBilling = c6956l.billing(c2403l);
                objM2132native3 = c6956l.m2132native();
                long j6 = j4;
                i6 = 20;
                if (zBilling || objM2132native3 == obj) {
                    objM2132native3 = new C7226l(c2403l, c15308l, null, i6);
                    c6956l.m2147try(objM2132native3);
                }
                AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native3);
                InterfaceC17242l interfaceC17242lM3537else = AbstractC13095l.m3537else(c0275l.yandex(interfaceC17242l3, 1.0f, true), new C8985l(c15308l, z, 5));
                C17253l c17253l2 = C12719l.yandex;
                InterfaceC17242l interfaceC17242lYandex = AbstractC0080l.yandex(interfaceC17242lM3537else, C12719l.crashlytics, C12719l.billing());
                objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == obj) {
                    objM2132native4 = new C10557l(20);
                    c6956l.m2147try(objM2132native4);
                }
                boolean z8 = z7;
                InterfaceC11780l interfaceC11780l4 = interfaceC11780l3;
                AbstractC3274l.loadAd(z, function0, AbstractC4962l.yandex(interfaceC17242lYandex, false, (Function1) objM2132native4), z8, interfaceC6347l2, j3, j6, 0.0f, c5028l3, c2403l, AbstractC14566l.amazon(-1208080836, new C1856l(function4, c15578l, interfaceC11780l3), c6956l), c6956l, ((i5 >> 3) & 126) | ((i5 >> 6) & 7168) | (57344 & (i5 << 3)), 384);
                z5 = z8;
                c5028l2 = c5028l3;
                c13959l2 = c13959l5;
                function3 = function4;
                interfaceC11780l2 = interfaceC11780l4;
                interfaceC17242l2 = interfaceC17242l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                c13959l2 = c13959l;
                c5028l2 = c5028l;
                interfaceC11780l2 = interfaceC11780l;
                function3 = function2;
                z5 = z3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C17652l(c0275l, z, function0, interfaceC6347l, interfaceC17242l2, z5, c13959l2, c5028l2, interfaceC11780l2, function3, c15578l, i, i2);
            }
        }
        i7 = 221184 | i3;
        z3 = z2;
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i7 |= 4194304;
        }
        i4 = i7 | 905969664;
        if ((306783379 & i4) == 306783378) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (c6956l.m2127for(i4 & 1, z4)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    z3 = true;
                }
                C7069l c7069l2 = C7069l.yandex;
                c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                c13959l3 = c0764l.f2300implements;
                if (c13959l3 == null) {
                    long jAmazon4 = AbstractC15038l.amazon(c0764l, 32);
                    long jAmazon5 = AbstractC15038l.amazon(c0764l, 15);
                    long jAmazon6 = AbstractC15038l.amazon(c0764l, 24);
                    long j7 = C9735l.isPro;
                    c13959l4 = new C13959l(jAmazon4, jAmazon5, jAmazon6, j7, AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 32), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)), j7, C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)));
                    c0764l.f2300implements = c13959l4;
                } else {
                    c13959l4 = c13959l3;
                }
                if (!z3) {
                    if (!z3) {
                        if (z3) {
                            j = c13959l4.smaato;
                        } else {
                            j = c13959l4.smaato;
                        }
                    } else if (z3) {
                        j = c13959l4.smaato;
                    } else {
                        j = c13959l4.smaato;
                    }
                } else if (!z3) {
                    if (z3) {
                        j = c13959l4.smaato;
                    } else {
                        j = c13959l4.smaato;
                    }
                } else if (z3) {
                    j = c13959l4.smaato;
                } else {
                    j = c13959l4.smaato;
                }
                C5028l c5028lYandex2 = AbstractC2576l.yandex(1.0f, j);
                C17253l c17253l3 = C7069l.loadAd;
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(-643804033, new C4584l(z, 8), c6956l);
                C13959l c13959l7 = c13959l4;
                z6 = z3;
                interfaceC17242l3 = C4346l.f8873l;
                c5028l3 = c5028lYandex2;
                interfaceC11780l3 = c17253l3;
                function4 = c15578lAmazon2;
                i5 = i4 & (-33030145);
                c13959l5 = c13959l7;
            } else {
                if (i8 != 0) {
                    z3 = true;
                }
                C7069l c7069l3 = C7069l.yandex;
                c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                c13959l3 = c0764l.f2300implements;
                if (c13959l3 == null) {
                    long jAmazon7 = AbstractC15038l.amazon(c0764l, 32);
                    long jAmazon8 = AbstractC15038l.amazon(c0764l, 15);
                    long jAmazon9 = AbstractC15038l.amazon(c0764l, 24);
                    long j8 = C9735l.isPro;
                    c13959l4 = new C13959l(jAmazon7, jAmazon8, jAmazon9, j8, AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 24), AbstractC15038l.amazon(c0764l, 32), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)), j8, C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.12f, AbstractC15038l.amazon(c0764l, 24)));
                    c0764l.f2300implements = c13959l4;
                } else {
                    c13959l4 = c13959l3;
                }
                if (!z3) {
                    if (!z3) {
                        if (z3) {
                            j = c13959l4.smaato;
                        } else {
                            j = c13959l4.smaato;
                        }
                    } else if (z3) {
                        j = c13959l4.smaato;
                    } else {
                        j = c13959l4.smaato;
                    }
                } else if (!z3) {
                    if (z3) {
                        j = c13959l4.smaato;
                    } else {
                        j = c13959l4.smaato;
                    }
                } else if (z3) {
                    j = c13959l4.smaato;
                } else {
                    j = c13959l4.smaato;
                }
                C5028l c5028lYandex3 = AbstractC2576l.yandex(1.0f, j);
                C17253l c17253l4 = C7069l.loadAd;
                C15578l c15578lAmazon3 = AbstractC14566l.amazon(-643804033, new C4584l(z, 8), c6956l);
                C13959l c13959l8 = c13959l4;
                z6 = z3;
                interfaceC17242l3 = C4346l.f8873l;
                c5028l3 = c5028lYandex3;
                interfaceC11780l3 = c17253l4;
                function4 = c15578lAmazon3;
                i5 = i4 & (-33030145);
                c13959l5 = c13959l8;
            }
            c6956l.adcel();
            c6956l.m2123default(-1579573323);
            objM2132native = c6956l.m2132native();
            obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            c13959l5.getClass();
            if (z6) {
                z7 = z6;
                if (!z7) {
                    if (z7) {
                        j2 = c13959l5.isPro;
                    } else {
                        j2 = c13959l5.isPro;
                    }
                } else if (z7) {
                    j2 = c13959l5.isPro;
                } else {
                    j2 = c13959l5.isPro;
                }
            } else {
                z7 = z6;
                if (!z7) {
                    if (z7) {
                        j2 = c13959l5.isPro;
                    } else {
                        j2 = c13959l5.isPro;
                    }
                } else if (z7) {
                    j2 = c13959l5.isPro;
                } else {
                    j2 = c13959l5.isPro;
                }
            }
            if (z7) {
                j3 = j2;
                if (!z7) {
                    if (z7) {
                        j4 = c13959l5.firebase;
                    } else {
                        j4 = c13959l5.firebase;
                    }
                } else if (z7) {
                    j4 = c13959l5.firebase;
                } else {
                    j4 = c13959l5.firebase;
                }
            } else {
                j3 = j2;
                if (!z7) {
                    if (z7) {
                        j4 = c13959l5.firebase;
                    } else {
                        j4 = c13959l5.firebase;
                    }
                } else if (z7) {
                    j4 = c13959l5.firebase;
                } else {
                    j4 = c13959l5.firebase;
                }
            }
            objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C15308l(0);
                c6956l.m2147try(objM2132native2);
            }
            c15308l = (C15308l) objM2132native2;
            zBilling = c6956l.billing(c2403l);
            objM2132native3 = c6956l.m2132native();
            long j9 = j4;
            i6 = 20;
            if (zBilling) {
                objM2132native3 = new C7226l(c2403l, c15308l, null, i6);
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = new C7226l(c2403l, c15308l, null, i6);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native3);
            InterfaceC17242l interfaceC17242lM3537else2 = AbstractC13095l.m3537else(c0275l.yandex(interfaceC17242l3, 1.0f, true), new C8985l(c15308l, z, 5));
            C17253l c17253l5 = C12719l.yandex;
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC0080l.yandex(interfaceC17242lM3537else2, C12719l.crashlytics, C12719l.billing());
            objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj) {
                objM2132native4 = new C10557l(20);
                c6956l.m2147try(objM2132native4);
            }
            boolean z9 = z7;
            InterfaceC11780l interfaceC11780l5 = interfaceC11780l3;
            AbstractC3274l.loadAd(z, function0, AbstractC4962l.yandex(interfaceC17242lYandex2, false, (Function1) objM2132native4), z9, interfaceC6347l2, j3, j9, 0.0f, c5028l3, c2403l, AbstractC14566l.amazon(-1208080836, new C1856l(function4, c15578l, interfaceC11780l3), c6956l), c6956l, ((i5 >> 3) & 126) | ((i5 >> 6) & 7168) | (57344 & (i5 << 3)), 384);
            z5 = z9;
            c5028l2 = c5028l3;
            c13959l2 = c13959l5;
            function3 = function4;
            interfaceC11780l2 = interfaceC11780l5;
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            c13959l2 = c13959l;
            c5028l2 = c5028l;
            interfaceC11780l2 = interfaceC11780l;
            function3 = function2;
            z5 = z3;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17652l(c0275l, z, function0, interfaceC6347l, interfaceC17242l2, z5, c13959l2, c5028l2, interfaceC11780l2, function3, c15578l, i, i2);
        }
    }

    public static final void loadAd(InterfaceC3177l interfaceC3177l, C15063l c15063l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(228371534);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(interfaceC3177l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15063l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function1) ? 256 : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean zAdmob = c6956l.admob(c15063l) | ((i2 & 896) == 256) | c6956l.admob(interfaceC3177l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new Ctransient(interfaceC3177l, c15063l, function1, 25);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.yandex(interfaceC3177l, c15063l, (Function1) objM2132native, c6956l);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(interfaceC3177l, c15063l, function1, i, 19);
        }
    }

    public static void mopub(int i, int i2) {
        String strSubs;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strSubs = AbstractC15344l.subs("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
                    return;
                }
                strSubs = AbstractC15344l.subs("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strSubs);
        }
    }

    public static final void purchase(final InterfaceC17242l interfaceC17242l, final float f, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        c6956l.m2133new(2041406825);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            C7069l c7069l = C7069l.yandex;
            InterfaceC17242l interfaceC17242lAdmob = AbstractC10409l.admob(AbstractC0080l.loadAd(AbstractC4962l.yandex(interfaceC17242l, false, new C10557l(21)), 40.0f, 1), 1);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(-1.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAdmob);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C0275l();
                c6956l.m2147try(objM2132native);
            }
            c15578l.invoke((C0275l) objM2132native, c6956l, Integer.valueOf(((i3 >> 3) & 112) | 6));
            c6956l.startapp(true);
            f = 1.0f;
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؚؗۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    AbstractC17122l.purchase(interfaceC17242l, f, c15578l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static String subs(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC15344l.subs("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC15344l.subs("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
        return null;
    }

    public static final void yandex(Boolean bool, Object obj, InterfaceC3177l interfaceC3177l, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(696924721);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(function1) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                interfaceC3177l = (InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex);
            } else {
                c6956l.m2124else();
            }
            int i3 = i2 & (-897);
            c6956l.adcel();
            boolean zBilling = c6956l.billing(bool) | c6956l.billing(obj) | c6956l.billing(interfaceC3177l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C15063l(interfaceC3177l.loadAd());
                c6956l.m2147try(objM2132native);
            }
            loadAd(interfaceC3177l, (C15063l) objM2132native, function1, c6956l, (i3 >> 3) & 896);
        } else {
            c6956l.m2124else();
        }
        InterfaceC3177l interfaceC3177l2 = interfaceC3177l;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(bool, obj, interfaceC3177l2, function1, i, 8);
        }
    }
}
