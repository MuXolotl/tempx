package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚٖۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16727l {
    public static final C12288l yandex = new C12288l(true, 30);

    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0097, please report this as an issue */
    public static final void loadAd(Function2 function2, Function0 function0, InterfaceC17242l interfaceC17242l, Function2 function3, Function2 function4, boolean z, C3500l c3500l, InterfaceC11780l interfaceC11780l, C6956l c6956l, int i, int i2) {
        C3500l c3500l2;
        int i3;
        boolean z2;
        InterfaceC17242l interfaceC17242l2;
        Function2 function5;
        boolean z3;
        InterfaceC11780l interfaceC11780l2;
        C3500l c3500l3;
        Function2 function6;
        C4224l c4224lAds;
        C3500l c3500lYandex;
        Function2 function7;
        C3500l c3500l4;
        boolean z4;
        InterfaceC11780l interfaceC11780l3;
        InterfaceC17242l interfaceC17242l3;
        Function2 function8;
        c6956l.m2133new(-532959117);
        int i4 = (c6956l.admob(function0) ? 32 : 16) | i;
        int i5 = i4 | 384;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 = i4 | 3456;
        } else if ((i & 3072) == 0) {
            i5 |= c6956l.admob(function3) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            i5 |= c6956l.admob(function4) ? 16384 : 8192;
        }
        int i8 = i5 | 196608;
        if ((i2 & 64) == 0) {
            c3500l2 = c3500l;
            int i9 = c6956l.billing(c3500l2) ? 1048576 : 524288;
            i3 = i8 | i9 | 113246208;
            if ((38347923 & i3) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i3 & 1, z2)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i6 != 0) {
                        function3 = null;
                    }
                    Function2 function9 = i7 == 0 ? function4 : null;
                    if ((i2 & 64) != 0) {
                        C17253l c17253l = AbstractC13451l.yandex;
                        c3500lYandex = AbstractC13451l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                        i3 &= -3670017;
                    } else {
                        c3500lYandex = c3500l2;
                    }
                    function7 = function9;
                    c3500l4 = c3500lYandex;
                    z4 = true;
                    interfaceC11780l3 = AbstractC13451l.yandex;
                    interfaceC17242l3 = C4346l.f8873l;
                    function8 = function3;
                } else {
                    c6956l.m2124else();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    interfaceC17242l3 = interfaceC17242l;
                    function8 = function3;
                    z4 = z;
                    interfaceC11780l3 = interfaceC11780l;
                    c3500l4 = c3500l2;
                    function7 = function4;
                }
                c6956l.adcel();
                AbstractC14744l.loadAd(function2, function0, interfaceC17242l3, function8, function7, z4, c3500l4, interfaceC11780l3, c6956l, i3 & 268435454);
                interfaceC11780l2 = interfaceC11780l3;
                c3500l3 = c3500l4;
                z3 = z4;
                function5 = function7;
                function6 = function8;
                interfaceC17242l2 = interfaceC17242l3;
            } else {
                c6956l.m2124else();
                interfaceC17242l2 = interfaceC17242l;
                function5 = function4;
                z3 = z;
                interfaceC11780l2 = interfaceC11780l;
                c3500l3 = c3500l2;
                function6 = function3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C8602l(function2, function0, interfaceC17242l2, function6, function5, z3, c3500l3, interfaceC11780l2, i, i2);
            }
        }
        c3500l2 = c3500l;
        i3 = i8 | i9 | 113246208;
        if ((38347923 & i3) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i3 & 1, z2)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    function3 = null;
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) != 0) {
                    C17253l c17253l2 = AbstractC13451l.yandex;
                    c3500lYandex = AbstractC13451l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    i3 &= -3670017;
                } else {
                    c3500lYandex = c3500l2;
                }
                function7 = function9;
                c3500l4 = c3500lYandex;
                z4 = true;
                interfaceC11780l3 = AbstractC13451l.yandex;
                interfaceC17242l3 = C4346l.f8873l;
                function8 = function3;
            } else {
                if (i6 != 0) {
                    function3 = null;
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) != 0) {
                    C17253l c17253l3 = AbstractC13451l.yandex;
                    c3500lYandex = AbstractC13451l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
                    i3 &= -3670017;
                } else {
                    c3500lYandex = c3500l2;
                }
                function7 = function9;
                c3500l4 = c3500lYandex;
                z4 = true;
                interfaceC11780l3 = AbstractC13451l.yandex;
                interfaceC17242l3 = C4346l.f8873l;
                function8 = function3;
            }
            c6956l.adcel();
            AbstractC14744l.loadAd(function2, function0, interfaceC17242l3, function8, function7, z4, c3500l4, interfaceC11780l3, c6956l, i3 & 268435454);
            interfaceC11780l2 = interfaceC11780l3;
            c3500l3 = c3500l4;
            z3 = z4;
            function5 = function7;
            function6 = function8;
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            function5 = function4;
            z3 = z;
            interfaceC11780l2 = interfaceC11780l;
            c3500l3 = c3500l2;
            function6 = function3;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8602l(function2, function0, interfaceC17242l2, function6, function5, z3, c3500l3, interfaceC11780l2, i, i2);
        }
    }

    public static final void yandex(final boolean z, final Function0 function0, InterfaceC17242l interfaceC17242l, long j, C11194l c11194l, C12288l c12288l, InterfaceC6347l interfaceC6347l, long j2, float f, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        Function0 function1;
        InterfaceC17242l interfaceC17242l2;
        int i3;
        final C11194l c11194l2;
        final C12288l c12288l2;
        final InterfaceC6347l interfaceC6347l2;
        final long j3;
        final float f2;
        final InterfaceC17242l interfaceC17242l3;
        final long jFloatToRawIntBits;
        int i4;
        C12288l c12288l3;
        C11194l c11194l3;
        InterfaceC17242l interfaceC17242l4;
        InterfaceC6347l interfaceC6347l3;
        long j4;
        float f3;
        c6956l.m2133new(1725609375);
        int i5 = i | (c6956l.mopub(z) ? 4 : 2);
        if ((i & 48) == 0) {
            function1 = function0;
            i5 |= c6956l.admob(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i5 | (c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i7 = i3 | 910896128;
        if (c6956l.m2127for(i7 & 1, (306783379 & i7) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                InterfaceC17242l interfaceC17242l5 = i6 != 0 ? C4346l.f8873l : interfaceC17242l2;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                C11194l c11194lCrashlytics = AbstractC13841l.crashlytics(c6956l);
                C17253l c17253l = AbstractC13451l.yandex;
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 5);
                long jPurchase = AbstractC15038l.purchase(c6956l, 37);
                i4 = i7 & (-33087489);
                c12288l3 = yandex;
                c11194l3 = c11194lCrashlytics;
                interfaceC17242l4 = interfaceC17242l5;
                interfaceC6347l3 = interfaceC6347lLoadAd;
                j4 = jPurchase;
                f3 = 3.0f;
            } else {
                c6956l.m2124else();
                i4 = i7 & (-33087489);
                c11194l3 = c11194l;
                c12288l3 = c12288l;
                interfaceC6347l3 = interfaceC6347l;
                j4 = j2;
                f3 = f;
                interfaceC17242l4 = interfaceC17242l2;
                jFloatToRawIntBits = j;
            }
            c6956l.adcel();
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = new C14783l(Boolean.FALSE);
                c6956l.m2147try(objM2132native);
            }
            C14783l c14783l = (C14783l) objM2132native;
            c14783l.crashlytics.setValue(Boolean.valueOf(z));
            if (((Boolean) c14783l.loadAd.getValue()).booleanValue() || ((Boolean) c14783l.crashlytics.getValue()).booleanValue()) {
                c6956l.m2123default(1165885407);
                InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
                boolean zBilling = c6956l.billing(interfaceC13490l);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling || objM2132native2 == obj) {
                    objM2132native2 = new C12310l(jFloatToRawIntBits, interfaceC13490l);
                    c6956l.m2147try(objM2132native2);
                }
                C12310l c12310l = (C12310l) objM2132native2;
                AbstractC3017l.yandex(c12310l, function1, c12288l3, AbstractC14566l.amazon(-917492520, new C14067l(interfaceC17242l4, c14783l, c12310l, c11194l3, interfaceC6347l3, j4, f3, c15578l), c6956l), c6956l, (i4 & 112) | 3456, 0);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(1166904067);
                c6956l.startapp(false);
            }
            c12288l2 = c12288l3;
            interfaceC17242l3 = interfaceC17242l4;
            c11194l2 = c11194l3;
            interfaceC6347l2 = interfaceC6347l3;
            j3 = j4;
            f2 = f3;
        } else {
            c6956l.m2124else();
            c11194l2 = c11194l;
            c12288l2 = c12288l;
            interfaceC6347l2 = interfaceC6347l;
            j3 = j2;
            f2 = f;
            interfaceC17242l3 = interfaceC17242l2;
            jFloatToRawIntBits = j;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lُٗٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    AbstractC16727l.yandex(z, function0, interfaceC17242l3, jFloatToRawIntBits, c11194l2, c12288l2, interfaceC6347l2, j3, f2, c15578l, (C6956l) obj2, iPurchase, i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
