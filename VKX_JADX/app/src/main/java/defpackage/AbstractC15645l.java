package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15645l {
    public static final C17253l yandex = new C17253l(8.0f, 4.0f, 8.0f, 4.0f);
    public static final float loadAd = 16.0f;
    public static final float crashlytics = 28.0f;
    public static final float amazon = 24.0f;
    public static final float purchase = 16.0f;

    /* JADX WARN: Code duplicated, block: B:100:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x018f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0192  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:120:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0226  */
    /* JADX WARN: Code duplicated, block: B:125:0x022c  */
    /* JADX WARN: Code duplicated, block: B:133:0x024b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0261  */
    /* JADX WARN: Code duplicated, block: B:137:0x0264  */
    /* JADX WARN: Code duplicated, block: B:140:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0278  */
    /* JADX WARN: Code duplicated, block: B:145:0x0299  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x02af  */
    /* JADX WARN: Code duplicated, block: B:151:0x031a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0327  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0149  */
    /* JADX WARN: Code duplicated, block: B:91:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156  */
    public static final void amazon(InterfaceC16711l interfaceC16711l, C15578l c15578l, C15178l c15178l, InterfaceC17242l interfaceC17242l, Function0 function0, boolean z, Function2 function2, C6956l c6956l, int i, int i2) {
        int i3;
        C15578l c15578l2;
        InterfaceC17242l interfaceC17242l2;
        int i4;
        Function0 function1;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        InterfaceC17242l interfaceC17242l3;
        Function0 function3;
        C4224l c4224lAds;
        InterfaceC17242l interfaceC17242l4;
        Function0 function4;
        C18656l c18656lAdmob;
        Object objM2132native;
        Object obj;
        InterfaceC8714l interfaceC8714l;
        Object objM2132native2;
        Object objM2132native3;
        InterfaceC8714l interfaceC8714l2;
        Object objM2132native4;
        boolean z4;
        Object objMopub;
        boolean zBooleanValue;
        float f;
        boolean zBilling;
        Object objM2132native5;
        boolean zBilling2;
        Object objM2132native6;
        boolean z5;
        Object objMopub2;
        boolean zBooleanValue2;
        float f2;
        boolean zBilling3;
        Object objM2132native7;
        boolean zBilling4;
        Object objM2132native8;
        boolean zBilling5;
        AbstractC18620l abstractC18620lBilling;
        Function1 function1Purchase;
        AbstractC18620l abstractC18620lRemoteconfig;
        boolean zBilling6;
        AbstractC18620l abstractC18620lBilling2;
        Function1 function1Purchase2;
        AbstractC18620l abstractC18620lRemoteconfig2;
        int i7;
        c6956l.m2133new(-293753984);
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC16711l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            c15578l2 = c15578l;
            i3 |= c6956l.admob(c15578l2) ? 32 : 16;
        } else {
            c15578l2 = c15578l;
        }
        if ((i & 384) == 0) {
            i3 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(c15178l) : c6956l.admob(c15178l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function1 = function0;
                    if (c6956l.admob(function1)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 14352384;
                if ((100663296 & i) == 0) {
                    if (c6956l.admob(function2)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i6 |= i7;
                }
                if ((38347923 & i6) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c6956l.m2127for(i6 & 1, z2)) {
                    if (i8 != 0) {
                        interfaceC17242l4 = C4346l.f8873l;
                    } else {
                        interfaceC17242l4 = interfaceC17242l2;
                    }
                    if (i4 != 0) {
                        function4 = null;
                    } else {
                        function4 = function1;
                    }
                    c18656lAdmob = AbstractC2438l.admob(c15178l.crashlytics, "tooltip transition", c6956l, 48, 0);
                    objM2132native = c6956l.m2132native();
                    obj = C1867l.yandex;
                    if (objM2132native == obj) {
                        objM2132native = AbstractC8020l.smaato(null);
                        c6956l.m2147try(objM2132native);
                    }
                    interfaceC8714l = (InterfaceC8714l) objM2132native;
                    objM2132native2 = c6956l.m2132native();
                    if (objM2132native2 == obj) {
                        objM2132native2 = new C6698l(new C1528l(interfaceC8714l, 4), interfaceC16711l);
                        c6956l.m2147try(objM2132native2);
                    }
                    C6698l c6698l = (C6698l) objM2132native2;
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-23901870, new C2736l(interfaceC8714l, function2, 20), c6956l);
                    objM2132native3 = c6956l.m2132native();
                    if (objM2132native3 == obj) {
                        objM2132native3 = AbstractC8020l.smaato(null);
                        c6956l.m2147try(objM2132native3);
                    }
                    interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
                    objM2132native4 = c6956l.m2132native();
                    if (objM2132native4 == obj) {
                        objM2132native4 = AbstractC8020l.mopub(new C13073l(interfaceC8714l, interfaceC8714l2, 1));
                        c6956l.m2147try(objM2132native4);
                    }
                    InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native4;
                    InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 2);
                    InterfaceC17807l interfaceC17807lRemoteconfig2 = C17423l.remoteconfig(c6956l, 5);
                    C0010l c0010l = AbstractC3483l.purchase;
                    if (c18656lAdmob.mopub()) {
                        z4 = false;
                        objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                    } else {
                        c6956l.m2123default(1666573488);
                        zBilling6 = c6956l.billing(c18656lAdmob);
                        objMopub = c6956l.m2132native();
                        if (!zBilling6 || objMopub == obj) {
                            abstractC18620lBilling2 = AbstractC7572l.billing();
                            if (abstractC18620lBilling2 != null) {
                                function1Purchase2 = abstractC18620lBilling2.purchase();
                            } else {
                                function1Purchase2 = null;
                            }
                            abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                            try {
                                Object objCrashlytics = c18656lAdmob.crashlytics();
                                AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                                c6956l.m2147try(objCrashlytics);
                                objMopub = objCrashlytics;
                                z4 = false;
                            } catch (Throwable th) {
                                AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                                throw th;
                            }
                        } else {
                            z4 = false;
                        }
                        c6956l.startapp(z4);
                    }
                    zBooleanValue = ((Boolean) objMopub).booleanValue();
                    c6956l.m2123default(838300572);
                    if (zBooleanValue) {
                        f = 1.0f;
                    } else {
                        f = 0.8f;
                    }
                    c6956l.startapp(z4);
                    Float fValueOf = Float.valueOf(f);
                    zBilling = c6956l.billing(c18656lAdmob);
                    objM2132native5 = c6956l.m2132native();
                    if (zBilling || objM2132native5 == obj) {
                        objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                        c6956l.m2147try(objM2132native5);
                    }
                    boolean zBooleanValue3 = ((Boolean) ((InterfaceC12244l) objM2132native5).getValue()).booleanValue();
                    c6956l.m2123default(838300572);
                    float f3 = zBooleanValue3 ? 1.0f : 0.8f;
                    c6956l.startapp(false);
                    Float fValueOf2 = Float.valueOf(f3);
                    zBilling2 = c6956l.billing(c18656lAdmob);
                    objM2132native6 = c6956l.m2132native();
                    if (zBilling2 || objM2132native6 == obj) {
                        objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                        c6956l.m2147try(objM2132native6);
                    }
                    c6956l.m2123default(-1664496585);
                    c6956l.startapp(false);
                    C9459l c9459lBilling = AbstractC2438l.billing(c18656lAdmob, fValueOf, fValueOf2, interfaceC17807lRemoteconfig, c0010l, c6956l, 196608);
                    if (c18656lAdmob.mopub()) {
                        z5 = false;
                        objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                    } else {
                        c6956l.m2123default(1666573488);
                        zBilling5 = c6956l.billing(c18656lAdmob);
                        objMopub2 = c6956l.m2132native();
                        if (zBilling5 || objMopub2 == obj) {
                            abstractC18620lBilling = AbstractC7572l.billing();
                            function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                            abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                            try {
                                Object objCrashlytics2 = c18656lAdmob.crashlytics();
                                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                                c6956l.m2147try(objCrashlytics2);
                                objMopub2 = objCrashlytics2;
                            } catch (Throwable th2) {
                                AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                                throw th2;
                            }
                        }
                        z5 = false;
                        c6956l.startapp(false);
                    }
                    zBooleanValue2 = ((Boolean) objMopub2).booleanValue();
                    c6956l.m2123default(-1903393104);
                    if (zBooleanValue2) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    c6956l.startapp(z5);
                    Float fValueOf3 = Float.valueOf(f2);
                    zBilling3 = c6956l.billing(c18656lAdmob);
                    objM2132native7 = c6956l.m2132native();
                    if (zBilling3 || objM2132native7 == obj) {
                        objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                        c6956l.m2147try(objM2132native7);
                    }
                    boolean zBooleanValue4 = ((Boolean) ((InterfaceC12244l) objM2132native7).getValue()).booleanValue();
                    c6956l.m2123default(-1903393104);
                    float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                    c6956l.startapp(false);
                    Float fValueOf4 = Float.valueOf(f4);
                    zBilling4 = c6956l.billing(c18656lAdmob);
                    objM2132native8 = c6956l.m2132native();
                    if (zBilling4 || objM2132native8 == obj) {
                        objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                        c6956l.m2147try(objM2132native8);
                    }
                    c6956l.m2123default(-111222965);
                    c6956l.startapp(false);
                    InterfaceC17242l interfaceC17242l5 = interfaceC17242l4;
                    Function0 function5 = function4;
                    AbstractC0133l.yandex(interfaceC16711l, AbstractC14566l.amazon(-527401546, new C8088l(interfaceC8714l2, c9459lBilling, AbstractC2438l.billing(c18656lAdmob, fValueOf3, fValueOf4, interfaceC17807lRemoteconfig2, c0010l, c6956l, 196608), interfaceC12244l, c15578l2, c6698l), c6956l), c15178l, interfaceC17242l5, function5, c15578lAmazon, c6956l, (i6 & 29360128) | (i6 & 14) | 100663344 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6));
                    function3 = function5;
                    z3 = true;
                    interfaceC17242l3 = interfaceC17242l5;
                } else {
                    c6956l.m2124else();
                    z3 = z;
                    interfaceC17242l3 = interfaceC17242l2;
                    function3 = function1;
                }
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C3435l(interfaceC16711l, c15578l, c15178l, interfaceC17242l3, function3, z3, function2, i, i2);
                }
            }
            i3 |= 24576;
            function1 = function0;
            i6 = i3 | 14352384;
            if ((100663296 & i) == 0) {
                if (c6956l.admob(function2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i6 |= i7;
            }
            if ((38347923 & i6) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i6 & 1, z2)) {
                if (i8 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                c18656lAdmob = AbstractC2438l.admob(c15178l.crashlytics, "tooltip transition", c6956l, 48, 0);
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                if (objM2132native == obj) {
                    objM2132native = AbstractC8020l.smaato(null);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC8714l = (InterfaceC8714l) objM2132native;
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = new C6698l(new C1528l(interfaceC8714l, 4), interfaceC16711l);
                    c6956l.m2147try(objM2132native2);
                }
                C6698l c6698l2 = (C6698l) objM2132native2;
                C15578l c15578lAmazon2 = AbstractC14566l.amazon(-23901870, new C2736l(interfaceC8714l, function2, 20), c6956l);
                objM2132native3 = c6956l.m2132native();
                if (objM2132native3 == obj) {
                    objM2132native3 = AbstractC8020l.smaato(null);
                    c6956l.m2147try(objM2132native3);
                }
                interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
                objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == obj) {
                    objM2132native4 = AbstractC8020l.mopub(new C13073l(interfaceC8714l, interfaceC8714l2, 1));
                    c6956l.m2147try(objM2132native4);
                }
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) objM2132native4;
                InterfaceC17807l interfaceC17807lRemoteconfig3 = C17423l.remoteconfig(c6956l, 2);
                InterfaceC17807l interfaceC17807lRemoteconfig4 = C17423l.remoteconfig(c6956l, 5);
                C0010l c0010l2 = AbstractC3483l.purchase;
                if (c18656lAdmob.mopub()) {
                    c6956l.m2123default(1666573488);
                    zBilling6 = c6956l.billing(c18656lAdmob);
                    objMopub = c6956l.m2132native();
                    if (zBilling6) {
                        abstractC18620lBilling2 = AbstractC7572l.billing();
                        if (abstractC18620lBilling2 != null) {
                            function1Purchase2 = abstractC18620lBilling2.purchase();
                        } else {
                            function1Purchase2 = null;
                        }
                        abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        Object objCrashlytics3 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics3);
                        objMopub = objCrashlytics3;
                        z4 = false;
                    } else {
                        abstractC18620lBilling2 = AbstractC7572l.billing();
                        if (abstractC18620lBilling2 != null) {
                            function1Purchase2 = abstractC18620lBilling2.purchase();
                        } else {
                            function1Purchase2 = null;
                        }
                        abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        Object objCrashlytics4 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics4);
                        objMopub = objCrashlytics4;
                        z4 = false;
                    }
                    c6956l.startapp(z4);
                } else {
                    z4 = false;
                    objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                }
                zBooleanValue = ((Boolean) objMopub).booleanValue();
                c6956l.m2123default(838300572);
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                c6956l.startapp(z4);
                Float fValueOf5 = Float.valueOf(f);
                zBilling = c6956l.billing(c18656lAdmob);
                objM2132native5 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                    c6956l.m2147try(objM2132native5);
                } else {
                    objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                    c6956l.m2147try(objM2132native5);
                }
                boolean zBooleanValue5 = ((Boolean) ((InterfaceC12244l) objM2132native5).getValue()).booleanValue();
                c6956l.m2123default(838300572);
                if (zBooleanValue5) {
                }
                c6956l.startapp(false);
                Float fValueOf6 = Float.valueOf(f3);
                zBilling2 = c6956l.billing(c18656lAdmob);
                objM2132native6 = c6956l.m2132native();
                if (zBilling2) {
                    objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                    c6956l.m2147try(objM2132native6);
                } else {
                    objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                    c6956l.m2147try(objM2132native6);
                }
                c6956l.m2123default(-1664496585);
                c6956l.startapp(false);
                C9459l c9459lBilling2 = AbstractC2438l.billing(c18656lAdmob, fValueOf5, fValueOf6, interfaceC17807lRemoteconfig3, c0010l2, c6956l, 196608);
                if (c18656lAdmob.mopub()) {
                    c6956l.m2123default(1666573488);
                    zBilling5 = c6956l.billing(c18656lAdmob);
                    objMopub2 = c6956l.m2132native();
                    if (zBilling5) {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        Object objCrashlytics5 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics5);
                        objMopub2 = objCrashlytics5;
                    } else {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        Object objCrashlytics6 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics6);
                        objMopub2 = objCrashlytics6;
                    }
                    z5 = false;
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                }
                zBooleanValue2 = ((Boolean) objMopub2).booleanValue();
                c6956l.m2123default(-1903393104);
                if (zBooleanValue2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                c6956l.startapp(z5);
                Float fValueOf7 = Float.valueOf(f2);
                zBilling3 = c6956l.billing(c18656lAdmob);
                objM2132native7 = c6956l.m2132native();
                if (zBilling3) {
                    objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                    c6956l.m2147try(objM2132native7);
                } else {
                    objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                    c6956l.m2147try(objM2132native7);
                }
                boolean zBooleanValue6 = ((Boolean) ((InterfaceC12244l) objM2132native7).getValue()).booleanValue();
                c6956l.m2123default(-1903393104);
                if (zBooleanValue6) {
                }
                c6956l.startapp(false);
                Float fValueOf8 = Float.valueOf(f4);
                zBilling4 = c6956l.billing(c18656lAdmob);
                objM2132native8 = c6956l.m2132native();
                if (zBilling4) {
                    objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                    c6956l.m2147try(objM2132native8);
                } else {
                    objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                    c6956l.m2147try(objM2132native8);
                }
                c6956l.m2123default(-111222965);
                c6956l.startapp(false);
                InterfaceC17242l interfaceC17242l6 = interfaceC17242l4;
                Function0 function6 = function4;
                AbstractC0133l.yandex(interfaceC16711l, AbstractC14566l.amazon(-527401546, new C8088l(interfaceC8714l2, c9459lBilling2, AbstractC2438l.billing(c18656lAdmob, fValueOf7, fValueOf8, interfaceC17807lRemoteconfig4, c0010l2, c6956l, 196608), interfaceC12244l2, c15578l2, c6698l2), c6956l), c15178l, interfaceC17242l6, function6, c15578lAmazon2, c6956l, (i6 & 29360128) | (i6 & 14) | 100663344 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6));
                function3 = function6;
                z3 = true;
                interfaceC17242l3 = interfaceC17242l6;
            } else {
                c6956l.m2124else();
                z3 = z;
                interfaceC17242l3 = interfaceC17242l2;
                function3 = function1;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(interfaceC16711l, c15578l, c15178l, interfaceC17242l3, function3, z3, function2, i, i2);
            }
        }
        i3 |= 3072;
        interfaceC17242l2 = interfaceC17242l;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function1 = function0;
                if (c6956l.admob(function1)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3 | 14352384;
            if ((100663296 & i) == 0) {
                if (c6956l.admob(function2)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i6 |= i7;
            }
            if ((38347923 & i6) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i6 & 1, z2)) {
                if (i8 != 0) {
                    interfaceC17242l4 = C4346l.f8873l;
                } else {
                    interfaceC17242l4 = interfaceC17242l2;
                }
                if (i4 != 0) {
                    function4 = null;
                } else {
                    function4 = function1;
                }
                c18656lAdmob = AbstractC2438l.admob(c15178l.crashlytics, "tooltip transition", c6956l, 48, 0);
                objM2132native = c6956l.m2132native();
                obj = C1867l.yandex;
                if (objM2132native == obj) {
                    objM2132native = AbstractC8020l.smaato(null);
                    c6956l.m2147try(objM2132native);
                }
                interfaceC8714l = (InterfaceC8714l) objM2132native;
                objM2132native2 = c6956l.m2132native();
                if (objM2132native2 == obj) {
                    objM2132native2 = new C6698l(new C1528l(interfaceC8714l, 4), interfaceC16711l);
                    c6956l.m2147try(objM2132native2);
                }
                C6698l c6698l3 = (C6698l) objM2132native2;
                C15578l c15578lAmazon3 = AbstractC14566l.amazon(-23901870, new C2736l(interfaceC8714l, function2, 20), c6956l);
                objM2132native3 = c6956l.m2132native();
                if (objM2132native3 == obj) {
                    objM2132native3 = AbstractC8020l.smaato(null);
                    c6956l.m2147try(objM2132native3);
                }
                interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
                objM2132native4 = c6956l.m2132native();
                if (objM2132native4 == obj) {
                    objM2132native4 = AbstractC8020l.mopub(new C13073l(interfaceC8714l, interfaceC8714l2, 1));
                    c6956l.m2147try(objM2132native4);
                }
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) objM2132native4;
                InterfaceC17807l interfaceC17807lRemoteconfig5 = C17423l.remoteconfig(c6956l, 2);
                InterfaceC17807l interfaceC17807lRemoteconfig6 = C17423l.remoteconfig(c6956l, 5);
                C0010l c0010l3 = AbstractC3483l.purchase;
                if (c18656lAdmob.mopub()) {
                    c6956l.m2123default(1666573488);
                    zBilling6 = c6956l.billing(c18656lAdmob);
                    objMopub = c6956l.m2132native();
                    if (zBilling6) {
                        abstractC18620lBilling2 = AbstractC7572l.billing();
                        if (abstractC18620lBilling2 != null) {
                            function1Purchase2 = abstractC18620lBilling2.purchase();
                        } else {
                            function1Purchase2 = null;
                        }
                        abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        Object objCrashlytics7 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics7);
                        objMopub = objCrashlytics7;
                        z4 = false;
                    } else {
                        abstractC18620lBilling2 = AbstractC7572l.billing();
                        if (abstractC18620lBilling2 != null) {
                            function1Purchase2 = abstractC18620lBilling2.purchase();
                        } else {
                            function1Purchase2 = null;
                        }
                        abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                        Object objCrashlytics8 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics8);
                        objMopub = objCrashlytics8;
                        z4 = false;
                    }
                    c6956l.startapp(z4);
                } else {
                    z4 = false;
                    objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                }
                zBooleanValue = ((Boolean) objMopub).booleanValue();
                c6956l.m2123default(838300572);
                if (zBooleanValue) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                c6956l.startapp(z4);
                Float fValueOf9 = Float.valueOf(f);
                zBilling = c6956l.billing(c18656lAdmob);
                objM2132native5 = c6956l.m2132native();
                if (zBilling) {
                    objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                    c6956l.m2147try(objM2132native5);
                } else {
                    objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                    c6956l.m2147try(objM2132native5);
                }
                boolean zBooleanValue7 = ((Boolean) ((InterfaceC12244l) objM2132native5).getValue()).booleanValue();
                c6956l.m2123default(838300572);
                if (zBooleanValue7) {
                }
                c6956l.startapp(false);
                Float fValueOf10 = Float.valueOf(f3);
                zBilling2 = c6956l.billing(c18656lAdmob);
                objM2132native6 = c6956l.m2132native();
                if (zBilling2) {
                    objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                    c6956l.m2147try(objM2132native6);
                } else {
                    objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                    c6956l.m2147try(objM2132native6);
                }
                c6956l.m2123default(-1664496585);
                c6956l.startapp(false);
                C9459l c9459lBilling3 = AbstractC2438l.billing(c18656lAdmob, fValueOf9, fValueOf10, interfaceC17807lRemoteconfig5, c0010l3, c6956l, 196608);
                if (c18656lAdmob.mopub()) {
                    c6956l.m2123default(1666573488);
                    zBilling5 = c6956l.billing(c18656lAdmob);
                    objMopub2 = c6956l.m2132native();
                    if (zBilling5) {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        Object objCrashlytics9 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics9);
                        objMopub2 = objCrashlytics9;
                    } else {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                        Object objCrashlytics10 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics10);
                        objMopub2 = objCrashlytics10;
                    }
                    z5 = false;
                    c6956l.startapp(false);
                } else {
                    z5 = false;
                    objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
                }
                zBooleanValue2 = ((Boolean) objMopub2).booleanValue();
                c6956l.m2123default(-1903393104);
                if (zBooleanValue2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                c6956l.startapp(z5);
                Float fValueOf11 = Float.valueOf(f2);
                zBilling3 = c6956l.billing(c18656lAdmob);
                objM2132native7 = c6956l.m2132native();
                if (zBilling3) {
                    objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                    c6956l.m2147try(objM2132native7);
                } else {
                    objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                    c6956l.m2147try(objM2132native7);
                }
                boolean zBooleanValue8 = ((Boolean) ((InterfaceC12244l) objM2132native7).getValue()).booleanValue();
                c6956l.m2123default(-1903393104);
                if (zBooleanValue8) {
                }
                c6956l.startapp(false);
                Float fValueOf12 = Float.valueOf(f4);
                zBilling4 = c6956l.billing(c18656lAdmob);
                objM2132native8 = c6956l.m2132native();
                if (zBilling4) {
                    objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                    c6956l.m2147try(objM2132native8);
                } else {
                    objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                    c6956l.m2147try(objM2132native8);
                }
                c6956l.m2123default(-111222965);
                c6956l.startapp(false);
                InterfaceC17242l interfaceC17242l7 = interfaceC17242l4;
                Function0 function7 = function4;
                AbstractC0133l.yandex(interfaceC16711l, AbstractC14566l.amazon(-527401546, new C8088l(interfaceC8714l2, c9459lBilling3, AbstractC2438l.billing(c18656lAdmob, fValueOf11, fValueOf12, interfaceC17807lRemoteconfig6, c0010l3, c6956l, 196608), interfaceC12244l3, c15578l2, c6698l3), c6956l), c15178l, interfaceC17242l7, function7, c15578lAmazon3, c6956l, (i6 & 29360128) | (i6 & 14) | 100663344 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6));
                function3 = function7;
                z3 = true;
                interfaceC17242l3 = interfaceC17242l7;
            } else {
                c6956l.m2124else();
                z3 = z;
                interfaceC17242l3 = interfaceC17242l2;
                function3 = function1;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(interfaceC16711l, c15578l, c15178l, interfaceC17242l3, function3, z3, function2, i, i2);
            }
        }
        i3 |= 24576;
        function1 = function0;
        i6 = i3 | 14352384;
        if ((100663296 & i) == 0) {
            if (c6956l.admob(function2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i6 |= i7;
        }
        if ((38347923 & i6) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i6 & 1, z2)) {
            if (i8 != 0) {
                interfaceC17242l4 = C4346l.f8873l;
            } else {
                interfaceC17242l4 = interfaceC17242l2;
            }
            if (i4 != 0) {
                function4 = null;
            } else {
                function4 = function1;
            }
            c18656lAdmob = AbstractC2438l.admob(c15178l.crashlytics, "tooltip transition", c6956l, 48, 0);
            objM2132native = c6956l.m2132native();
            obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC8020l.smaato(null);
                c6956l.m2147try(objM2132native);
            }
            interfaceC8714l = (InterfaceC8714l) objM2132native;
            objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C6698l(new C1528l(interfaceC8714l, 4), interfaceC16711l);
                c6956l.m2147try(objM2132native2);
            }
            C6698l c6698l4 = (C6698l) objM2132native2;
            C15578l c15578lAmazon4 = AbstractC14566l.amazon(-23901870, new C2736l(interfaceC8714l, function2, 20), c6956l);
            objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = AbstractC8020l.smaato(null);
                c6956l.m2147try(objM2132native3);
            }
            interfaceC8714l2 = (InterfaceC8714l) objM2132native3;
            objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == obj) {
                objM2132native4 = AbstractC8020l.mopub(new C13073l(interfaceC8714l, interfaceC8714l2, 1));
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC12244l interfaceC12244l4 = (InterfaceC12244l) objM2132native4;
            InterfaceC17807l interfaceC17807lRemoteconfig7 = C17423l.remoteconfig(c6956l, 2);
            InterfaceC17807l interfaceC17807lRemoteconfig8 = C17423l.remoteconfig(c6956l, 5);
            C0010l c0010l4 = AbstractC3483l.purchase;
            if (c18656lAdmob.mopub()) {
                c6956l.m2123default(1666573488);
                zBilling6 = c6956l.billing(c18656lAdmob);
                objMopub = c6956l.m2132native();
                if (zBilling6) {
                    abstractC18620lBilling2 = AbstractC7572l.billing();
                    if (abstractC18620lBilling2 != null) {
                        function1Purchase2 = abstractC18620lBilling2.purchase();
                    } else {
                        function1Purchase2 = null;
                    }
                    abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    Object objCrashlytics11 = c18656lAdmob.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                    c6956l.m2147try(objCrashlytics11);
                    objMopub = objCrashlytics11;
                    z4 = false;
                } else {
                    abstractC18620lBilling2 = AbstractC7572l.billing();
                    if (abstractC18620lBilling2 != null) {
                        function1Purchase2 = abstractC18620lBilling2.purchase();
                    } else {
                        function1Purchase2 = null;
                    }
                    abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    Object objCrashlytics12 = c18656lAdmob.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                    c6956l.m2147try(objCrashlytics12);
                    objMopub = objCrashlytics12;
                    z4 = false;
                }
                c6956l.startapp(z4);
            } else {
                z4 = false;
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
            }
            zBooleanValue = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(838300572);
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            c6956l.startapp(z4);
            Float fValueOf13 = Float.valueOf(f);
            zBilling = c6956l.billing(c18656lAdmob);
            objM2132native5 = c6956l.m2132native();
            if (zBilling) {
                objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                c6956l.m2147try(objM2132native5);
            } else {
                objM2132native5 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 12));
                c6956l.m2147try(objM2132native5);
            }
            boolean zBooleanValue9 = ((Boolean) ((InterfaceC12244l) objM2132native5).getValue()).booleanValue();
            c6956l.m2123default(838300572);
            if (zBooleanValue9) {
            }
            c6956l.startapp(false);
            Float fValueOf14 = Float.valueOf(f3);
            zBilling2 = c6956l.billing(c18656lAdmob);
            objM2132native6 = c6956l.m2132native();
            if (zBilling2) {
                objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                c6956l.m2147try(objM2132native6);
            } else {
                objM2132native6 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 13));
                c6956l.m2147try(objM2132native6);
            }
            c6956l.m2123default(-1664496585);
            c6956l.startapp(false);
            C9459l c9459lBilling4 = AbstractC2438l.billing(c18656lAdmob, fValueOf13, fValueOf14, interfaceC17807lRemoteconfig7, c0010l4, c6956l, 196608);
            if (c18656lAdmob.mopub()) {
                c6956l.m2123default(1666573488);
                zBilling5 = c6956l.billing(c18656lAdmob);
                objMopub2 = c6956l.m2132native();
                if (zBilling5) {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics13 = c18656lAdmob.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics13);
                    objMopub2 = objCrashlytics13;
                } else {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics14 = c18656lAdmob.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics14);
                    objMopub2 = objCrashlytics14;
                }
                z5 = false;
                c6956l.startapp(false);
            } else {
                z5 = false;
                objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
            }
            zBooleanValue2 = ((Boolean) objMopub2).booleanValue();
            c6956l.m2123default(-1903393104);
            if (zBooleanValue2) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            c6956l.startapp(z5);
            Float fValueOf15 = Float.valueOf(f2);
            zBilling3 = c6956l.billing(c18656lAdmob);
            objM2132native7 = c6956l.m2132native();
            if (zBilling3) {
                objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                c6956l.m2147try(objM2132native7);
            } else {
                objM2132native7 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 14));
                c6956l.m2147try(objM2132native7);
            }
            boolean zBooleanValue10 = ((Boolean) ((InterfaceC12244l) objM2132native7).getValue()).booleanValue();
            c6956l.m2123default(-1903393104);
            if (zBooleanValue10) {
            }
            c6956l.startapp(false);
            Float fValueOf16 = Float.valueOf(f4);
            zBilling4 = c6956l.billing(c18656lAdmob);
            objM2132native8 = c6956l.m2132native();
            if (zBilling4) {
                objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                c6956l.m2147try(objM2132native8);
            } else {
                objM2132native8 = AbstractC8020l.mopub(new C17648l(c18656lAdmob, 15));
                c6956l.m2147try(objM2132native8);
            }
            c6956l.m2123default(-111222965);
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242l8 = interfaceC17242l4;
            Function0 function8 = function4;
            AbstractC0133l.yandex(interfaceC16711l, AbstractC14566l.amazon(-527401546, new C8088l(interfaceC8714l2, c9459lBilling4, AbstractC2438l.billing(c18656lAdmob, fValueOf15, fValueOf16, interfaceC17807lRemoteconfig8, c0010l4, c6956l, 196608), interfaceC12244l4, c15578l2, c6698l4), c6956l), c15178l, interfaceC17242l8, function8, c15578lAmazon4, c6956l, (i6 & 29360128) | (i6 & 14) | 100663344 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6));
            function3 = function8;
            z3 = true;
            interfaceC17242l3 = interfaceC17242l8;
        } else {
            c6956l.m2124else();
            z3 = z;
            interfaceC17242l3 = interfaceC17242l2;
            function3 = function1;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3435l(interfaceC16711l, c15578l, c15178l, interfaceC17242l3, function3, z3, function2, i, i2);
        }
    }

    public static final C15178l billing(C6956l c6956l) {
        C16801l c16801l = AbstractC8752l.yandex;
        boolean zMopub = c6956l.mopub(false) | c6956l.billing(c16801l);
        Object objM2132native = c6956l.m2132native();
        if (zMopub || objM2132native == C1867l.yandex) {
            objM2132native = new C15178l(false, c16801l);
            c6956l.m2147try(objM2132native);
        }
        return (C15178l) objM2132native;
    }

    public static final void crashlytics(final C6698l c6698l, InterfaceC17242l interfaceC17242l, final Function2 function2, final InterfaceC6347l interfaceC6347l, float f, InterfaceC6347l interfaceC6347l2, final C16065l c16065l, float f2, C6956l c6956l, final int i) {
        int i2;
        InterfaceC17242l interfaceC17242l2;
        float f3;
        InterfaceC6347l interfaceC6347l3;
        final float f4;
        int i3;
        float f5;
        InterfaceC17242l interfaceC17242l3;
        InterfaceC6347l interfaceC6347l4;
        float f6;
        InterfaceC17242l interfaceC17242l4;
        InterfaceC6347l interfaceC6347l5;
        C15578l c15578l = AbstractC15290l.yandex;
        c6956l.m2133new(236290785);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(c6698l) : c6956l.admob(c6698l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 |= c6956l.billing(interfaceC6347l) ? 16384 : 8192;
        }
        int i6 = 196608 | i5;
        if ((1572864 & i) == 0) {
            i6 = 720896 | i5;
        }
        int i7 = 12582912;
        if ((i & 12582912) == 0) {
            i6 |= c6956l.billing(c16065l) ? 8388608 : 4194304;
        }
        int i8 = i6 | 905969664;
        if (c6956l.m2127for(i8 & 1, (306783379 & i8) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                float f7 = AbstractC1923l.loadAd;
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 13);
                i3 = i8 & (-3670017);
                f5 = f7;
                interfaceC17242l3 = C4346l.f8873l;
                interfaceC6347l4 = interfaceC6347lLoadAd;
                f6 = 3.0f;
            } else {
                c6956l.m2124else();
                f5 = f;
                interfaceC6347l4 = interfaceC6347l2;
                f6 = f2;
                i3 = i8 & (-3670017);
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            if (interfaceC6347l != null) {
                c6956l.m2123default(-111987513);
                Object objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (objM2132native == c13863l) {
                    objM2132native = AbstractC8020l.smaato(new C10924l(C10924l.yandex()));
                    c6956l.m2147try(objM2132native);
                }
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
                EnumC9931l enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
                long jYandex = ((C12771l) ((InterfaceC2229l) c6956l.isPro(AbstractC4751l.Signature))).yandex();
                boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && c6956l.admob(c6698l));
                Object objM2132native2 = c6956l.m2132native();
                if (z || objM2132native2 == c13863l) {
                    objM2132native2 = new C5767l(29, c6698l);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC17242l interfaceC17242lAdmob = AbstractC15560l.admob(new C12968l(new C1040l((Function0) objM2132native2, jYandex, c6698l.loadAd, enumC9931l, interfaceC8714l)), interfaceC17242l3);
                boolean zBilling = c6956l.billing(interfaceC6347l4) | ((i3 & 57344) == 16384);
                Object objM2132native3 = c6956l.m2132native();
                if (zBilling || objM2132native3 == c13863l) {
                    objM2132native3 = new C7437l(interfaceC8714l, interfaceC6347l4, interfaceC6347l);
                    c6956l.m2147try(objM2132native3);
                }
                interfaceC6347l5 = (C7437l) objM2132native3;
                c6956l.startapp(false);
                interfaceC17242l4 = interfaceC17242lAdmob;
            } else {
                i7 = 12582912;
                c6956l.m2123default(-111277830);
                c6956l.startapp(false);
                interfaceC17242l4 = interfaceC17242l3;
                interfaceC6347l5 = interfaceC6347l4;
            }
            float f8 = f6;
            f3 = f5;
            int i9 = i3 >> 12;
            interfaceC6347l3 = interfaceC6347l4;
            interfaceC17242l2 = interfaceC17242l3;
            AbstractC3274l.yandex(AbstractC0080l.remoteconfig(interfaceC17242l4, 40.0f, 24.0f, f5, 0.0f, 8), interfaceC6347l5, c16065l.yandex, 0L, 0.0f, f8, null, AbstractC14566l.amazon(-1249811482, new C2736l(function2, c16065l), c6956l), c6956l, (i9 & 57344) | i7 | (i9 & 458752), 72);
            f4 = f8;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            f3 = f;
            interfaceC6347l3 = interfaceC6347l2;
            f4 = f2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final InterfaceC17242l interfaceC17242l5 = interfaceC17242l2;
            final float f9 = f3;
            final InterfaceC6347l interfaceC6347l6 = interfaceC6347l3;
            c4224lAds.amazon = new Function2() { // from class: lۣ٘ۜ
                {
                    C15578l c15578l2 = AbstractC15290l.yandex;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C15578l c15578l2 = AbstractC15290l.yandex;
                    ((Integer) obj2).getClass();
                    AbstractC15645l.crashlytics(c6698l, interfaceC17242l5, function2, interfaceC6347l, f9, interfaceC6347l6, c16065l, f4, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void loadAd(final C6698l c6698l, final String str, InterfaceC17242l interfaceC17242l, float f, InterfaceC6347l interfaceC6347l, long j, long j2, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        final InterfaceC17242l interfaceC17242l2;
        final float f2;
        final InterfaceC6347l interfaceC6347l2;
        final long j3;
        final long j4;
        int i3;
        float f3;
        InterfaceC6347l interfaceC6347l3;
        long jPurchase;
        long j5;
        InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(1931523930);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? c6956l.billing(c6698l) : c6956l.admob(c6698l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(str) ? 32 : 16;
        }
        int i4 = i2 | 28032;
        if ((i & 196608) == 0) {
            i4 = 93568 | i2;
        }
        if ((i & 1572864) == 0) {
            i4 |= 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= 4194304;
        }
        int i5 = 905969664 | i4;
        if (c6956l.m2127for(i5 & 1, (306783379 & i5) != 306783378)) {
            c6956l.m2141switch();
            int i6 = i & 1;
            C4346l c4346l = C4346l.f8873l;
            if (i6 == 0 || c6956l.ad()) {
                float f4 = AbstractC1923l.yandex;
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 5);
                long jPurchase2 = AbstractC15038l.purchase(c6956l, 4);
                i3 = i5 & (-33488897);
                f3 = f4;
                interfaceC6347l3 = interfaceC6347lLoadAd;
                jPurchase = AbstractC15038l.purchase(c6956l, 6);
                j5 = jPurchase2;
                interfaceC17242l3 = c4346l;
            } else {
                c6956l.m2124else();
                i3 = i5 & (-33488897);
                interfaceC17242l3 = interfaceC17242l;
                f3 = f;
                interfaceC6347l3 = interfaceC6347l;
                j5 = j;
                jPurchase = j2;
            }
            c6956l.adcel();
            boolean z = (i3 & 112) == 32;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = new C6908l(str, 22);
                c6956l.m2147try(objM2132native);
            }
            int i7 = i3 & 14;
            int i8 = i3 >> 3;
            long j6 = j5;
            long j7 = jPurchase;
            yandex(c6698l, AbstractC4962l.yandex(c4346l, false, (Function1) objM2132native).premium(interfaceC17242l3), f3, interfaceC6347l3, j6, j7, c15578l, c6956l, (i8 & 234881024) | i7 | (i8 & 896) | (i8 & 7168) | (29360128 & i8) | 805306368);
            j4 = j7;
            j3 = j6;
            f2 = f3;
            interfaceC6347l2 = interfaceC6347l3;
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            f2 = f;
            interfaceC6347l2 = interfaceC6347l;
            j3 = j;
            j4 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍؚٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15645l.loadAd(c6698l, str, interfaceC17242l2, f2, interfaceC6347l2, j3, j4, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final float purchase(float f, int i, C8896l c8896l) {
        float fMin;
        float f2 = c8896l.yandex;
        float f3 = c8896l.crashlytics;
        float f4 = (f2 + f3) / 2.0f;
        float f5 = i;
        if (f >= f5) {
            return f4;
        }
        float f6 = f / 2.0f;
        if (f4 - f6 < 0.0f) {
            fMin = Math.max(f - f5, -f2);
        } else {
            if (f4 + f6 <= f5) {
                return f6;
            }
            fMin = Math.min(f - f3, 0.0f);
        }
        return fMin + f4;
    }

    public static final void yandex(final C6698l c6698l, final InterfaceC17242l interfaceC17242l, final float f, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final C15578l c15578l, C6956l c6956l, final int i) {
        int i2;
        long j3;
        c6956l.m2133new(-343758958);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c6956l.billing(c6698l) : c6956l.admob(c6698l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.crashlytics(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC6347l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.purchase(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            j3 = j2;
            i2 |= c6956l.purchase(j3) ? 1048576 : 524288;
        } else {
            j3 = j2;
        }
        if ((i & 12582912) == 0) {
            i2 |= c6956l.crashlytics(0.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.crashlytics(0.0f) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= c6956l.admob(c15578l) ? 536870912 : 268435456;
        }
        if (c6956l.m2127for(i2 & 1, (306783379 & i2) != 306783378)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            c6956l.m2123default(-1719803223);
            c6956l.startapp(false);
            int i3 = 12582912 | ((i2 >> 12) & 896);
            int i4 = i2 >> 9;
            AbstractC3274l.yandex(interfaceC17242l, interfaceC6347l, j3, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-1573998995, new Function2() { // from class: lؑۗٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.remoteconfig(C4346l.f8873l, 40.0f, 24.0f, f, 0.0f, 8), AbstractC15645l.yandex);
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                        long j4 = c6956l2.f14595continue;
                        int i5 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lFirebase);
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
                        AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
                        AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                        AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(j, AbstractC12502l.yandex), AbstractC13010l.yandex.yandex(AbstractC8644l.yandex(c6956l2, 3))}, c15578l, c6956l2, 8);
                        c6956l2.startapp(true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, i3 | (57344 & i4) | (i4 & 458752), 72);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؚٓۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15645l.yandex(c6698l, interfaceC17242l, f, interfaceC6347l, j, j2, c15578l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
