package defpackage;

import java.math.BigInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَِٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16336l implements InterfaceC3905l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C3007l f31951l = new C3007l(2);

    public static int amazon(AbstractC11918l abstractC11918l) {
        int iSmaato = (abstractC11918l.smaato() + 1) / 2;
        return iSmaato > 256 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : iSmaato;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object billing(AbstractC0283l abstractC0283l) {
        Object obj;
        InterfaceC12932l interfaceC12932lMetrica = abstractC0283l.metrica();
        AbstractC11174l.billing(interfaceC12932lMetrica);
        InterfaceC14029l interfaceC14029lBilling = AbstractC17082l.billing(abstractC0283l);
        C16477l c16477l = interfaceC14029lBilling instanceof C16477l ? (C16477l) interfaceC14029lBilling : null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (c16477l == null) {
            obj = Unit.INSTANCE;
        } else {
            AbstractC1872l abstractC1872l = c16477l.f32210l;
            if (AbstractC9853l.crashlytics(abstractC1872l, interfaceC12932lMetrica)) {
                c16477l.f32211l = Unit.INSTANCE;
                c16477l.f14041l = 1;
                abstractC1872l.adcel(interfaceC12932lMetrica, c16477l);
            } else {
                C5650l c5650l = new C5650l(C5650l.f12000l);
                InterfaceC12932l interfaceC12932lMo246l = interfaceC12932lMetrica.mo246l(c5650l);
                Unit unit = Unit.INSTANCE;
                c16477l.f32211l = unit;
                c16477l.f14041l = 1;
                abstractC1872l.adcel(interfaceC12932lMo246l, c16477l);
                if (c5650l.f12001l) {
                    AbstractC14868l abstractC14868lYandex = AbstractC12706l.yandex();
                    C11315l c11315l = abstractC14868lYandex.f29100l;
                    if (!(c11315l != null ? c11315l.isEmpty() : true)) {
                        if (abstractC14868lYandex.f29099l >= 4294967296L) {
                            c16477l.f32211l = unit;
                            c16477l.f14041l = 1;
                            abstractC14868lYandex.m3899l(c16477l);
                        } else {
                            abstractC14868lYandex.m3898l(true);
                            try {
                                c16477l.run();
                                do {
                                } while (abstractC14868lYandex.m3901l());
                            } catch (Throwable th) {
                                try {
                                    c16477l.mopub(th);
                                } catch (Throwable th2) {
                                    abstractC14868lYandex.m3900l(true);
                                    throw th2;
                                }
                            }
                            abstractC14868lYandex.m3900l(true);
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = enumC9342l;
        }
        return obj == enumC9342l ? obj : Unit.INSTANCE;
    }

    public static String crashlytics(InterfaceC16922l interfaceC16922l) {
        String algorithmName = interfaceC16922l.getAlgorithmName();
        int iIndexOf = algorithmName.indexOf(45);
        return (iIndexOf <= 0 || algorithmName.startsWith("SHA3")) ? algorithmName : algorithmName.substring(0, iIndexOf).concat(algorithmName.substring(iIndexOf + 1));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public static final void loadAd(InterfaceC17242l interfaceC17242l, C5866l c5866l, InterfaceC11780l interfaceC11780l, InterfaceC5404l interfaceC5404l, C0086l c0086l, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, Function1 function1, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        InterfaceC11780l c17253l;
        int i4;
        int i5;
        C0086l c0086l2;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        InterfaceC14745l interfaceC14745l2;
        C10306l c10306l2;
        InterfaceC17242l interfaceC17242l3;
        InterfaceC11780l interfaceC11780l2;
        C0086l c0086l3;
        C5866l c5866l2;
        boolean z4;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        C5866l c5866lYandex;
        C17308l c17308lYandex;
        boolean zBilling;
        Object objM2132native;
        InterfaceC14745l interfaceC14745l3;
        int i8;
        C10306l c10306lLoadAd;
        int i9;
        int i10;
        c6956l.m2133new(-1884325601);
        int i11 = i2 & 1;
        if (i11 != 0) {
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
            i3 |= 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                c17253l = interfaceC11780l;
                i3 |= c6956l.billing(c17253l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if (c6956l.billing(interfaceC5404l)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    c0086l2 = c0086l;
                    if (c6956l.billing(c0086l2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    i4 |= 524288;
                }
                i7 = 12582912 | i4;
                if ((100663296 & i) == 0) {
                    i7 = 46137344 | i4;
                }
                if ((805306368 & i) == 0) {
                    if (c6956l.admob(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                }
                z2 = true;
                if ((306783379 & i7) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i7 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0 || c6956l.ad()) {
                        if (i11 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                        if (i12 != 0) {
                            c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if (i5 != 0) {
                            c0086l2 = C18450l.f36044l;
                        }
                        c17308lYandex = AbstractC0310l.yandex(c6956l);
                        zBilling = c6956l.billing(c17308lYandex);
                        objM2132native = c6956l.m2132native();
                        if (zBilling || objM2132native == C1867l.yandex) {
                            objM2132native = new C1192l(c17308lYandex);
                            c6956l.m2147try(objM2132native);
                        }
                        interfaceC14745l3 = (C1192l) objM2132native;
                        i8 = i7 & (-238551153);
                        c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    } else {
                        c6956l.m2124else();
                        interfaceC14745l3 = interfaceC14745l;
                        z2 = z;
                        c10306lLoadAd = c10306l;
                        i8 = i7 & (-238551153);
                        interfaceC17242l4 = interfaceC17242l2;
                        c5866lYandex = c5866l;
                    }
                    C0086l c0086l4 = c0086l2;
                    c6956l.adcel();
                    InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
                    C5866l c5866l3 = c5866lYandex;
                    InterfaceC11780l interfaceC11780l3 = c17253l;
                    boolean z5 = z2;
                    AbstractC7574l.yandex(interfaceC17242l5, c5866l3, interfaceC11780l3, false, interfaceC14745l3, z5, c10306lLoadAd, null, null, c0086l4, interfaceC5404l, function1, c6956l, (i8 & 14) | 24576 | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                    interfaceC11780l2 = interfaceC11780l3;
                    z4 = z5;
                    c10306l2 = c10306lLoadAd;
                    c0086l3 = c0086l4;
                    c5866l2 = c5866l3;
                    interfaceC14745l2 = interfaceC14745l3;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    interfaceC14745l2 = interfaceC14745l;
                    c10306l2 = c10306l;
                    interfaceC17242l3 = interfaceC17242l2;
                    interfaceC11780l2 = c17253l;
                    c0086l3 = c0086l2;
                    c5866l2 = c5866l;
                    z4 = z;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC5404l, c0086l3, interfaceC14745l2, z4, c10306l2, function1, i, i2, 2);
                }
            }
            i4 |= 196608;
            c0086l2 = c0086l;
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) == 0) {
                if (c6956l.admob(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            z2 = true;
            if ((306783379 & i7) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i7 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i5 != 0) {
                        c0086l2 = C18450l.f36044l;
                    }
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC14745l3 = (C1192l) objM2132native;
                    i8 = i7 & (-238551153);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i5 != 0) {
                        c0086l2 = C18450l.f36044l;
                    }
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC14745l3 = (C1192l) objM2132native;
                    i8 = i7 & (-238551153);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                }
                C0086l c0086l5 = c0086l2;
                c6956l.adcel();
                InterfaceC17242l interfaceC17242l6 = interfaceC17242l4;
                C5866l c5866l4 = c5866lYandex;
                InterfaceC11780l interfaceC11780l4 = c17253l;
                boolean z6 = z2;
                AbstractC7574l.yandex(interfaceC17242l6, c5866l4, interfaceC11780l4, false, interfaceC14745l3, z6, c10306lLoadAd, null, null, c0086l5, interfaceC5404l, function1, c6956l, (i8 & 14) | 24576 | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                interfaceC11780l2 = interfaceC11780l4;
                z4 = z6;
                c10306l2 = c10306lLoadAd;
                c0086l3 = c0086l5;
                c5866l2 = c5866l4;
                interfaceC14745l2 = interfaceC14745l3;
                interfaceC17242l3 = interfaceC17242l6;
            } else {
                c6956l.m2124else();
                interfaceC14745l2 = interfaceC14745l;
                c10306l2 = c10306l;
                interfaceC17242l3 = interfaceC17242l2;
                interfaceC11780l2 = c17253l;
                c0086l3 = c0086l2;
                c5866l2 = c5866l;
                z4 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC5404l, c0086l3, interfaceC14745l2, z4, c10306l2, function1, i, i2, 2);
            }
        }
        i3 |= 384;
        c17253l = interfaceC11780l;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if (c6956l.billing(interfaceC5404l)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                c0086l2 = c0086l;
                if (c6956l.billing(c0086l2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                i4 |= 524288;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) == 0) {
                if (c6956l.admob(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            z2 = true;
            if ((306783379 & i7) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i7 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i5 != 0) {
                        c0086l2 = C18450l.f36044l;
                    }
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC14745l3 = (C1192l) objM2132native;
                    i8 = i7 & (-238551153);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i5 != 0) {
                        c0086l2 = C18450l.f36044l;
                    }
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC14745l3 = (C1192l) objM2132native;
                    i8 = i7 & (-238551153);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                }
                C0086l c0086l6 = c0086l2;
                c6956l.adcel();
                InterfaceC17242l interfaceC17242l7 = interfaceC17242l4;
                C5866l c5866l5 = c5866lYandex;
                InterfaceC11780l interfaceC11780l5 = c17253l;
                boolean z7 = z2;
                AbstractC7574l.yandex(interfaceC17242l7, c5866l5, interfaceC11780l5, false, interfaceC14745l3, z7, c10306lLoadAd, null, null, c0086l6, interfaceC5404l, function1, c6956l, (i8 & 14) | 24576 | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
                interfaceC11780l2 = interfaceC11780l5;
                z4 = z7;
                c10306l2 = c10306lLoadAd;
                c0086l3 = c0086l6;
                c5866l2 = c5866l5;
                interfaceC14745l2 = interfaceC14745l3;
                interfaceC17242l3 = interfaceC17242l7;
            } else {
                c6956l.m2124else();
                interfaceC14745l2 = interfaceC14745l;
                c10306l2 = c10306l;
                interfaceC17242l3 = interfaceC17242l2;
                interfaceC11780l2 = c17253l;
                c0086l3 = c0086l2;
                c5866l2 = c5866l;
                z4 = z;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC5404l, c0086l3, interfaceC14745l2, z4, c10306l2, function1, i, i2, 2);
            }
        }
        i4 |= 196608;
        c0086l2 = c0086l;
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        i7 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i4;
        }
        if ((805306368 & i) == 0) {
            if (c6956l.admob(function1)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i7 |= i9;
        }
        z2 = true;
        if ((306783379 & i7) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i7 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                if (i12 != 0) {
                    c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i5 != 0) {
                    c0086l2 = C18450l.f36044l;
                }
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC14745l3 = (C1192l) objM2132native;
                i8 = i7 & (-238551153);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
            } else {
                if (i11 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                if (i12 != 0) {
                    c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if (i5 != 0) {
                    c0086l2 = C18450l.f36044l;
                }
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC14745l3 = (C1192l) objM2132native;
                i8 = i7 & (-238551153);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
            }
            C0086l c0086l7 = c0086l2;
            c6956l.adcel();
            InterfaceC17242l interfaceC17242l8 = interfaceC17242l4;
            C5866l c5866l6 = c5866lYandex;
            InterfaceC11780l interfaceC11780l6 = c17253l;
            boolean z8 = z2;
            AbstractC7574l.yandex(interfaceC17242l8, c5866l6, interfaceC11780l6, false, interfaceC14745l3, z8, c10306lLoadAd, null, null, c0086l7, interfaceC5404l, function1, c6956l, (i8 & 14) | 24576 | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 18) & 7168) | ((i8 >> 12) & 112) | ((i8 >> 6) & 896), 1792);
            interfaceC11780l2 = interfaceC11780l6;
            z4 = z8;
            c10306l2 = c10306lLoadAd;
            c0086l3 = c0086l7;
            c5866l2 = c5866l6;
            interfaceC14745l2 = interfaceC14745l3;
            interfaceC17242l3 = interfaceC17242l8;
        } else {
            c6956l.m2124else();
            interfaceC14745l2 = interfaceC14745l;
            c10306l2 = c10306l;
            interfaceC17242l3 = interfaceC17242l2;
            interfaceC11780l2 = c17253l;
            c0086l3 = c0086l2;
            c5866l2 = c5866l;
            z4 = z;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC5404l, c0086l3, interfaceC14745l2, z4, c10306l2, function1, i, i2, 2);
        }
    }

    public static int purchase(BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        if (iBitLength < 2048) {
            return iBitLength >= 1024 ? 80 : 20;
        }
        if (iBitLength < 3072) {
            return 112;
        }
        if (iBitLength < 7680) {
            return 128;
        }
        if (iBitLength >= 15360) {
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 192;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x014e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0195  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    public static final void yandex(InterfaceC17242l interfaceC17242l, C5866l c5866l, InterfaceC11780l interfaceC11780l, InterfaceC3501l interfaceC3501l, InterfaceC6947l interfaceC6947l, InterfaceC14745l interfaceC14745l, boolean z, C10306l c10306l, Function1 function1, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        C5866l c5866lYandex;
        InterfaceC11780l c17253l;
        int i4;
        InterfaceC3501l interfaceC3501l2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Function1 function2;
        boolean z3;
        InterfaceC14745l interfaceC14745l2;
        InterfaceC17242l interfaceC17242l3;
        C5866l c5866l2;
        InterfaceC11780l interfaceC11780l2;
        InterfaceC3501l interfaceC3501l3;
        boolean z4;
        InterfaceC6947l interfaceC6947l2;
        C10306l c10306l2;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        InterfaceC6947l interfaceC6947l3;
        C17308l c17308lYandex;
        boolean zBilling;
        Object objM2132native;
        int i8;
        C10306l c10306lLoadAd;
        InterfaceC14745l interfaceC14745l3;
        int i9;
        c6956l.m2133new(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
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
                c5866lYandex = c5866l;
                int i11 = c6956l.billing(c5866lYandex) ? 32 : 16;
                i3 |= i11;
            } else {
                c5866lYandex = c5866l;
            }
            i3 |= i11;
        } else {
            c5866lYandex = c5866l;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                c17253l = interfaceC11780l;
                i3 |= c6956l.billing(c17253l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    interfaceC3501l2 = interfaceC3501l;
                    int i13 = c6956l.billing(interfaceC3501l2) ? 16384 : 8192;
                    i4 |= i13;
                } else {
                    interfaceC3501l2 = interfaceC3501l;
                }
                i4 |= i13;
            } else {
                interfaceC3501l2 = interfaceC3501l;
            }
            i5 = 196608 | i4;
            if ((1572864 & i) == 0) {
                i5 = 720896 | i4;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i5 |= i7;
                }
                if ((100663296 & i) == 0) {
                    i5 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    function2 = function1;
                    if (c6956l.admob(function2)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i5 |= i9;
                } else {
                    function2 = function1;
                }
                if ((306783379 & i5) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (c6956l.m2127for(i5 & 1, z3)) {
                    c6956l.m2141switch();
                    if ((i & 1) != 0 || c6956l.ad()) {
                        if (i10 != 0) {
                            interfaceC17242l4 = C4346l.f8873l;
                        } else {
                            interfaceC17242l4 = interfaceC17242l2;
                        }
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                            c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                        }
                        if (i12 != 0) {
                            c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            interfaceC3501l2 = AbstractC8313l.crashlytics;
                        }
                        interfaceC6947l3 = C18450l.f36046l;
                        c17308lYandex = AbstractC0310l.yandex(c6956l);
                        zBilling = c6956l.billing(c17308lYandex);
                        objM2132native = c6956l.m2132native();
                        if (zBilling || objM2132native == C1867l.yandex) {
                            objM2132native = new C1192l(c17308lYandex);
                            c6956l.m2147try(objM2132native);
                        }
                        C1192l c1192l = (C1192l) objM2132native;
                        if (i6 != 0) {
                            z2 = true;
                        }
                        i8 = i5 & (-238551041);
                        c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                        interfaceC14745l3 = c1192l;
                    } else {
                        c6956l.m2124else();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        interfaceC14745l3 = interfaceC14745l;
                        c10306lLoadAd = c10306l;
                        i8 = i5 & (-238551041);
                        interfaceC17242l4 = interfaceC17242l2;
                        interfaceC6947l3 = interfaceC6947l;
                    }
                    C5866l c5866l3 = c5866lYandex;
                    boolean z5 = z2;
                    c6956l.adcel();
                    InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
                    InterfaceC11780l interfaceC11780l3 = c17253l;
                    InterfaceC6947l interfaceC6947l4 = interfaceC6947l3;
                    AbstractC7574l.yandex(interfaceC17242l5, c5866l3, interfaceC11780l3, true, interfaceC14745l3, z5, c10306lLoadAd, interfaceC6947l4, interfaceC3501l2, null, null, function2, c6956l, ((i8 << 12) & 1879048192) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                    C10306l c10306l3 = c10306lLoadAd;
                    interfaceC14745l2 = interfaceC14745l3;
                    interfaceC3501l3 = interfaceC3501l2;
                    c10306l2 = c10306l3;
                    z4 = z5;
                    interfaceC6947l2 = interfaceC6947l4;
                    interfaceC11780l2 = interfaceC11780l3;
                    c5866l2 = c5866l3;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    interfaceC14745l2 = interfaceC14745l;
                    interfaceC17242l3 = interfaceC17242l2;
                    c5866l2 = c5866lYandex;
                    interfaceC11780l2 = c17253l;
                    interfaceC3501l3 = interfaceC3501l2;
                    z4 = z2;
                    interfaceC6947l2 = interfaceC6947l;
                    c10306l2 = c10306l;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC3501l3, interfaceC6947l2, interfaceC14745l2, z4, c10306l2, function1, i, i2, 1);
                }
            }
            i5 |= 12582912;
            z2 = z;
            if ((100663296 & i) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                function2 = function1;
                if (c6956l.admob(function2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            } else {
                function2 = function1;
            }
            if ((306783379 & i5) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i5 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    }
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        interfaceC3501l2 = AbstractC8313l.crashlytics;
                    }
                    interfaceC6947l3 = C18450l.f36046l;
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    C1192l c1192l2 = (C1192l) objM2132native;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    i8 = i5 & (-238551041);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    interfaceC14745l3 = c1192l2;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    }
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        interfaceC3501l2 = AbstractC8313l.crashlytics;
                    }
                    interfaceC6947l3 = C18450l.f36046l;
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    C1192l c1192l3 = (C1192l) objM2132native;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    i8 = i5 & (-238551041);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    interfaceC14745l3 = c1192l3;
                }
                C5866l c5866l4 = c5866lYandex;
                boolean z6 = z2;
                c6956l.adcel();
                InterfaceC17242l interfaceC17242l6 = interfaceC17242l4;
                InterfaceC11780l interfaceC11780l4 = c17253l;
                InterfaceC6947l interfaceC6947l5 = interfaceC6947l3;
                AbstractC7574l.yandex(interfaceC17242l6, c5866l4, interfaceC11780l4, true, interfaceC14745l3, z6, c10306lLoadAd, interfaceC6947l5, interfaceC3501l2, null, null, function2, c6956l, ((i8 << 12) & 1879048192) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                C10306l c10306l4 = c10306lLoadAd;
                interfaceC14745l2 = interfaceC14745l3;
                interfaceC3501l3 = interfaceC3501l2;
                c10306l2 = c10306l4;
                z4 = z6;
                interfaceC6947l2 = interfaceC6947l5;
                interfaceC11780l2 = interfaceC11780l4;
                c5866l2 = c5866l4;
                interfaceC17242l3 = interfaceC17242l6;
            } else {
                c6956l.m2124else();
                interfaceC14745l2 = interfaceC14745l;
                interfaceC17242l3 = interfaceC17242l2;
                c5866l2 = c5866lYandex;
                interfaceC11780l2 = c17253l;
                interfaceC3501l3 = interfaceC3501l2;
                z4 = z2;
                interfaceC6947l2 = interfaceC6947l;
                c10306l2 = c10306l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC3501l3, interfaceC6947l2, interfaceC14745l2, z4, c10306l2, function1, i, i2, 1);
            }
        }
        i3 |= 384;
        c17253l = interfaceC11780l;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                interfaceC3501l2 = interfaceC3501l;
                if (c6956l.billing(interfaceC3501l2)) {
                }
                i4 |= i13;
            } else {
                interfaceC3501l2 = interfaceC3501l;
            }
            i4 |= i13;
        } else {
            interfaceC3501l2 = interfaceC3501l;
        }
        i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (c6956l.mopub(z2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i5 |= i7;
            }
            if ((100663296 & i) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                function2 = function1;
                if (c6956l.admob(function2)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i5 |= i9;
            } else {
                function2 = function1;
            }
            if ((306783379 & i5) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (c6956l.m2127for(i5 & 1, z3)) {
                c6956l.m2141switch();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    }
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        interfaceC3501l2 = AbstractC8313l.crashlytics;
                    }
                    interfaceC6947l3 = C18450l.f36046l;
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    C1192l c1192l4 = (C1192l) objM2132native;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    i8 = i5 & (-238551041);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    interfaceC14745l3 = c1192l4;
                } else {
                    if (i10 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if ((i2 & 2) != 0) {
                        i5 &= -113;
                        c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                    }
                    if (i12 != 0) {
                        c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                        interfaceC3501l2 = AbstractC8313l.crashlytics;
                    }
                    interfaceC6947l3 = C18450l.f36046l;
                    c17308lYandex = AbstractC0310l.yandex(c6956l);
                    zBilling = c6956l.billing(c17308lYandex);
                    objM2132native = c6956l.m2132native();
                    if (zBilling) {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    } else {
                        objM2132native = new C1192l(c17308lYandex);
                        c6956l.m2147try(objM2132native);
                    }
                    C1192l c1192l5 = (C1192l) objM2132native;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    i8 = i5 & (-238551041);
                    c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                    interfaceC14745l3 = c1192l5;
                }
                C5866l c5866l5 = c5866lYandex;
                boolean z7 = z2;
                c6956l.adcel();
                InterfaceC17242l interfaceC17242l7 = interfaceC17242l4;
                InterfaceC11780l interfaceC11780l5 = c17253l;
                InterfaceC6947l interfaceC6947l6 = interfaceC6947l3;
                AbstractC7574l.yandex(interfaceC17242l7, c5866l5, interfaceC11780l5, true, interfaceC14745l3, z7, c10306lLoadAd, interfaceC6947l6, interfaceC3501l2, null, null, function2, c6956l, ((i8 << 12) & 1879048192) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                C10306l c10306l5 = c10306lLoadAd;
                interfaceC14745l2 = interfaceC14745l3;
                interfaceC3501l3 = interfaceC3501l2;
                c10306l2 = c10306l5;
                z4 = z7;
                interfaceC6947l2 = interfaceC6947l6;
                interfaceC11780l2 = interfaceC11780l5;
                c5866l2 = c5866l5;
                interfaceC17242l3 = interfaceC17242l7;
            } else {
                c6956l.m2124else();
                interfaceC14745l2 = interfaceC14745l;
                interfaceC17242l3 = interfaceC17242l2;
                c5866l2 = c5866lYandex;
                interfaceC11780l2 = c17253l;
                interfaceC3501l3 = interfaceC3501l2;
                z4 = z2;
                interfaceC6947l2 = interfaceC6947l;
                c10306l2 = c10306l;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC3501l3, interfaceC6947l2, interfaceC14745l2, z4, c10306l2, function1, i, i2, 1);
            }
        }
        i5 |= 12582912;
        z2 = z;
        if ((100663296 & i) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            function2 = function1;
            if (c6956l.admob(function2)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i5 |= i9;
        } else {
            function2 = function1;
        }
        if ((306783379 & i5) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c6956l.m2127for(i5 & 1, z3)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                }
                if (i12 != 0) {
                    c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    interfaceC3501l2 = AbstractC8313l.crashlytics;
                }
                interfaceC6947l3 = C18450l.f36046l;
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                C1192l c1192l6 = (C1192l) objM2132native;
                if (i6 != 0) {
                    z2 = true;
                }
                i8 = i5 & (-238551041);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                interfaceC14745l3 = c1192l6;
            } else {
                if (i10 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                    c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
                }
                if (i12 != 0) {
                    c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    i5 &= -57345;
                    interfaceC3501l2 = AbstractC8313l.crashlytics;
                }
                interfaceC6947l3 = C18450l.f36046l;
                c17308lYandex = AbstractC0310l.yandex(c6956l);
                zBilling = c6956l.billing(c17308lYandex);
                objM2132native = c6956l.m2132native();
                if (zBilling) {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C1192l(c17308lYandex);
                    c6956l.m2147try(objM2132native);
                }
                C1192l c1192l7 = (C1192l) objM2132native;
                if (i6 != 0) {
                    z2 = true;
                }
                i8 = i5 & (-238551041);
                c10306lLoadAd = AbstractC3643l.loadAd(c6956l);
                interfaceC14745l3 = c1192l7;
            }
            C5866l c5866l6 = c5866lYandex;
            boolean z8 = z2;
            c6956l.adcel();
            InterfaceC17242l interfaceC17242l8 = interfaceC17242l4;
            InterfaceC11780l interfaceC11780l6 = c17253l;
            InterfaceC6947l interfaceC6947l7 = interfaceC6947l3;
            AbstractC7574l.yandex(interfaceC17242l8, c5866l6, interfaceC11780l6, true, interfaceC14745l3, z8, c10306lLoadAd, interfaceC6947l7, interfaceC3501l2, null, null, function2, c6956l, ((i8 << 12) & 1879048192) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | ((i8 >> 3) & 3670016), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
            C10306l c10306l6 = c10306lLoadAd;
            interfaceC14745l2 = interfaceC14745l3;
            interfaceC3501l3 = interfaceC3501l2;
            c10306l2 = c10306l6;
            z4 = z8;
            interfaceC6947l2 = interfaceC6947l7;
            interfaceC11780l2 = interfaceC11780l6;
            c5866l2 = c5866l6;
            interfaceC17242l3 = interfaceC17242l8;
        } else {
            c6956l.m2124else();
            interfaceC14745l2 = interfaceC14745l;
            interfaceC17242l3 = interfaceC17242l2;
            c5866l2 = c5866lYandex;
            interfaceC11780l2 = c17253l;
            interfaceC3501l3 = interfaceC3501l2;
            z4 = z2;
            interfaceC6947l2 = interfaceC6947l;
            c10306l2 = c10306l;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11591l(interfaceC17242l3, c5866l2, interfaceC11780l2, interfaceC3501l3, interfaceC6947l2, interfaceC14745l2, z4, c10306l2, function1, i, i2, 1);
        }
    }
}
