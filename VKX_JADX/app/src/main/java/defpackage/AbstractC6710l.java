package defpackage;

import android.view.View;
import android.view.ViewParent;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6710l {
    public static final boolean admob(InterfaceC10696l interfaceC10696l) {
        return interfaceC10696l.crashlytics() == null;
    }

    public static final C8862l amazon(InterfaceC9671l interfaceC9671l) {
        C1332l c1332lSignature = ((InterfaceC2851l) interfaceC9671l).getF3035l();
        if (c1332lSignature == null) {
            C8339l.smaato("Identifier can only be calculated for managed objects.");
            return null;
        }
        InterfaceC7832l interfaceC7832l = c1332lSignature.f3419l;
        long j = c1332lSignature.f3424l.loadAd;
        long ptr$cinterop_release = c1332lSignature.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return new C8862l(j, realmcJNI.realm_object_get_key(ptr$cinterop_release), interfaceC7832l.mo876l(), ((C12125l) interfaceC7832l.mo1843l().f33215l).crashlytics);
    }

    public static final ViewParent billing(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void crashlytics(EnumC13846l enumC13846l, Function0 function0, C0404l c0404l, C0404l c0404l2, InterfaceC17242l interfaceC17242l, boolean z, C7259l c7259l, C6956l c6956l, int i) {
        int i2;
        InterfaceC17242l c10171l;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-406243761);
        if ((i & 6) == 0) {
            i2 = (c6956l.amazon(enumC13846l.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? c6956l.billing(c0404l) : c6956l.admob(c0404l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? c6956l.billing(c0404l2) : c6956l.admob(c0404l2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.mopub(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(c7259l) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.billing(null) ? 8388608 : 4194304;
        }
        int i3 = i2;
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (4793491 & i3) != 4793490)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            float f = AbstractC8999l.loadAd / 2.0f;
            long j = C9735l.firebase;
            C6839l c6839l = AbstractC7497l.yandex;
            C7863l c7863l = new C7863l(25.0f);
            C8372l c8372lYandex = AbstractC10493l.yandex(false, f, j, new C6839l(c7863l, c7863l, c7863l, c7863l), 240);
            C4346l c4346l = C4346l.f8873l;
            if (function0 != null) {
                C6402l c6402l = new C6402l(i4);
                if (AbstractC2812l.advert(c8372lYandex)) {
                    c10171l = new C10171l(enumC13846l, null, c8372lYandex, z, c6402l, function0);
                } else {
                    c10171l = c8372lYandex == null ? new C10171l(enumC13846l, null, null, z, c6402l, function0) : new C6085l(new C8898l(c8372lYandex, enumC13846l, z, c6402l, function0));
                }
            } else {
                c10171l = c4346l;
            }
            if (function0 != null) {
                C17857l c17857l = AbstractC16434l.yandex;
                interfaceC17242l2 = C18158l.f35556l;
            } else {
                interfaceC17242l2 = c4346l;
            }
            int i5 = i3 << 6;
            loadAd(z, enumC13846l, interfaceC17242l.premium(interfaceC17242l2).premium(c10171l).premium(AbstractC3605l.smaato(c4346l, 2.0f)), c7259l, c0404l, c0404l2, c6956l, ((i3 >> 15) & 14) | ((i3 << 3) & 112) | ((i3 >> 9) & 7168) | 32768 | (57344 & i5) | 262144 | (i5 & 458752));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(enumC13846l, function0, c0404l, c0404l2, interfaceC17242l, z, c7259l, i);
        }
    }

    public static final InterfaceC2851l firebase(C1332l c1332l) {
        C5501l c5501l = c1332l.f3423l;
        InterfaceC1388l interfaceC1388l = c1332l.f3420l;
        InterfaceC2851l interfaceC2851lM1810const = c5501l.m1810const(interfaceC1388l);
        subs(interfaceC2851lM1810const, c1332l.f3419l, c5501l, interfaceC1388l, c1332l.f3422l);
        return interfaceC2851lM1810const;
    }

    public static final InterfaceC2851l isPro(C3535l c3535l, InterfaceC1388l interfaceC1388l, C5501l c5501l, InterfaceC7832l interfaceC7832l) {
        InterfaceC2851l interfaceC2851lM1810const = c5501l.m1810const(interfaceC1388l);
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC7832l.mo1845l()).getPtr$cinterop_release();
        long j = c3535l.yandex;
        long j2 = c3535l.loadAd;
        int i = AbstractC9795l.yandex;
        subs(interfaceC2851lM1810const, interfaceC7832l, c5501l, interfaceC1388l, new LongPointerWrapper(realmcJNI.realm_get_object(ptr$cinterop_release, j, j2), false, 2, null));
        return interfaceC2851lM1810const;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:177:0x030a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0310  */
    /* JADX WARN: Code duplicated, block: B:181:0x0313  */
    /* JADX WARN: Code duplicated, block: B:184:0x0317  */
    /* JADX WARN: Code duplicated, block: B:186:0x031b  */
    /* JADX WARN: Code duplicated, block: B:187:0x031e  */
    /* JADX WARN: Code duplicated, block: B:188:0x0321  */
    /* JADX WARN: Code duplicated, block: B:190:0x0327  */
    /* JADX WARN: Code duplicated, block: B:192:0x032a  */
    /* JADX WARN: Code duplicated, block: B:194:0x032d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0330  */
    /* JADX WARN: Code duplicated, block: B:197:0x0334  */
    /* JADX WARN: Code duplicated, block: B:198:0x0337  */
    /* JADX WARN: Code duplicated, block: B:200:0x033b  */
    /* JADX WARN: Code duplicated, block: B:202:0x035f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0375  */
    /* JADX WARN: Code duplicated, block: B:206:0x037b  */
    /* JADX WARN: Code duplicated, block: B:208:0x037e  */
    /* JADX WARN: Code duplicated, block: B:210:0x0381  */
    /* JADX WARN: Code duplicated, block: B:211:0x0383  */
    /* JADX WARN: Code duplicated, block: B:213:0x0387  */
    /* JADX WARN: Code duplicated, block: B:216:0x0393  */
    /* JADX WARN: Code duplicated, block: B:218:0x039a  */
    /* JADX WARN: Code duplicated, block: B:220:0x039d  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:223:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:225:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:226:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:228:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:238:0x0418  */
    /* JADX WARN: Code duplicated, block: B:247:0x0440  */
    /* JADX WARN: Code duplicated, block: B:253:0x044f  */
    public static final void loadAd(boolean z, EnumC13846l enumC13846l, InterfaceC17242l interfaceC17242l, C7259l c7259l, final C0404l c0404l, final C0404l c0404l2, C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2;
        Object objMopub;
        float f;
        float f2;
        Object objMopub2;
        Object objMopub3;
        float f3;
        int i3;
        InterfaceC17807l c2966l;
        final C9459l c9459lBilling;
        Object objM2132native;
        final C16722l c16722l;
        long j;
        final InterfaceC12244l interfaceC12244lYandex;
        C6956l c6956l3;
        int iOrdinal;
        long j2;
        Object objVip;
        final Object obj;
        int iOrdinal2;
        long j3;
        final InterfaceC12244l interfaceC12244lVip;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM2132native2;
        int i5;
        int iOrdinal3;
        long j4;
        int iOrdinal4;
        c6956l.m2133new(-891330208);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.amazon(enumC13846l.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(c7259l) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? c6956l.billing(c0404l) : c6956l.admob(c0404l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? c6956l.billing(c0404l2) : c6956l.admob(c0404l2) ? 131072 : 65536;
        }
        int i6 = 0;
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            C18656l c18656lIsPro = AbstractC2438l.isPro(enumC13846l, null, c6956l, (i2 >> 3) & 14, 2);
            InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 1);
            C0010l c0010l = AbstractC3483l.purchase;
            boolean zMopub = c18656lIsPro.mopub();
            C13863l c13863l = C1867l.yandex;
            if (zMopub) {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling || objMopub == c13863l) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                }
                c6956l.startapp(false);
            }
            c6956l.m2123default(-768316570);
            int iOrdinal5 = ((EnumC13846l) objMopub).ordinal();
            float f4 = 0.0f;
            if (iOrdinal5 == 0) {
                f = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    C18725l.billing();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            c6956l.startapp(false);
            Float fValueOf = Float.valueOf(f);
            boolean zBilling2 = c6956l.billing(c18656lIsPro);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, i6));
                c6956l.m2147try(objM2132native3);
            }
            EnumC13846l enumC13846l2 = (EnumC13846l) ((InterfaceC12244l) objM2132native3).getValue();
            c6956l.m2123default(-768316570);
            int iOrdinal6 = enumC13846l2.ordinal();
            if (iOrdinal6 == 0) {
                f2 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    C18725l.billing();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            c6956l.startapp(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zBilling3 = c6956l.billing(c18656lIsPro);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling3 || objM2132native4 == c13863l) {
                objMopub2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 1));
                c6956l.m2147try(objMopub2);
            } else {
                objMopub2 = objM2132native4;
            }
            InterfaceC17460l interfaceC17460l = (InterfaceC17460l) ((InterfaceC12244l) objMopub2).getValue();
            c6956l.m2123default(1780794470);
            Object objLoadAd = interfaceC17460l.loadAd();
            EnumC13846l enumC13846l3 = EnumC13846l.f27082l;
            InterfaceC17807l c2966l2 = (objLoadAd != enumC13846l3 && interfaceC17460l.amazon() == enumC13846l3) ? new C2966l(100) : interfaceC17807lRemoteconfig;
            c6956l.startapp(false);
            final C9459l c9459lBilling2 = AbstractC2438l.billing(c18656lIsPro, fValueOf, fValueOf2, c2966l2, c0010l, c6956l, 0);
            if (c18656lIsPro.mopub()) {
                objMopub3 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling4 = c6956l.billing(c18656lIsPro);
                objMopub3 = c6956l.m2132native();
                if (zBilling4 || objMopub3 == c13863l) {
                    AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                    Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    try {
                        Object objCrashlytics2 = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics2);
                        objMopub3 = objCrashlytics2;
                    } catch (Throwable th2) {
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        throw th2;
                    }
                }
                c6956l.startapp(false);
            }
            c6956l.m2123default(1840054703);
            int iOrdinal7 = ((EnumC13846l) objMopub3).ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f3 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    C18725l.billing();
                    return;
                }
                f3 = 1.0f;
            }
            c6956l.startapp(false);
            Float fValueOf3 = Float.valueOf(f3);
            boolean zBilling5 = c6956l.billing(c18656lIsPro);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling5 || objM2132native5 == c13863l) {
                i3 = 2;
                objM2132native5 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, i3));
                c6956l.m2147try(objM2132native5);
            } else {
                i3 = 2;
            }
            EnumC13846l enumC13846l4 = (EnumC13846l) ((InterfaceC12244l) objM2132native5).getValue();
            c6956l.m2123default(1840054703);
            int iOrdinal8 = enumC13846l4.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != i3) {
                    C18725l.billing();
                    return;
                }
                f4 = 1.0f;
            }
            c6956l.startapp(false);
            Float fValueOf4 = Float.valueOf(f4);
            boolean zBilling6 = c6956l.billing(c18656lIsPro);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling6 || objM2132native6 == c13863l) {
                objM2132native6 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 3));
                c6956l.m2147try(objM2132native6);
            }
            InterfaceC17460l interfaceC17460l2 = (InterfaceC17460l) ((InterfaceC12244l) objM2132native6).getValue();
            c6956l.m2123default(630790831);
            if (interfaceC17460l2.loadAd() == enumC13846l3) {
                interfaceC17807lRemoteconfig = AbstractC0532l.mopub();
            } else {
                if (interfaceC17460l2.amazon() == enumC13846l3) {
                    c2966l = new C2966l(100);
                }
                c6956l.startapp(false);
                c9459lBilling = AbstractC2438l.billing(c18656lIsPro, fValueOf3, fValueOf4, c2966l, c0010l, c6956l, 0);
                objM2132native = c6956l.m2132native();
                if (objM2132native == c13863l) {
                    objM2132native = new C16722l();
                    c6956l.m2147try(objM2132native);
                }
                c16722l = (C16722l) objM2132native;
                c6956l.m2123default(-2128520210);
                if (enumC13846l == enumC13846l3) {
                    j = c7259l.loadAd;
                } else {
                    j = c7259l.yandex;
                }
                c7259l.getClass();
                interfaceC12244lYandex = AbstractC0703l.yandex(j, C7259l.yandex(enumC13846l, c6956l), null, null, c6956l, 0, 12);
                c6956l3 = c6956l;
                c6956l3.startapp(false);
                if (z) {
                    iOrdinal4 = enumC13846l.ordinal();
                    if (iOrdinal4 == 0) {
                        j2 = c7259l.crashlytics;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            C18725l.billing();
                            return;
                        }
                        j2 = c7259l.crashlytics;
                    } else {
                        j2 = c7259l.amazon;
                    }
                } else {
                    iOrdinal = enumC13846l.ordinal();
                    if (iOrdinal != 0) {
                        j2 = c7259l.purchase;
                    } else if (iOrdinal != 1) {
                        j2 = c7259l.billing;
                    } else {
                        if (iOrdinal == 2) {
                            C18725l.billing();
                            return;
                        }
                        j2 = c7259l.mopub;
                    }
                }
                if (z) {
                    c6956l3.m2123default(496026915);
                    objVip = AbstractC0703l.yandex(j2, C7259l.yandex(enumC13846l, c6956l3), null, null, c6956l, 0, 12);
                    c6956l3 = c6956l;
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(496117125);
                    objVip = AbstractC8020l.vip(new C9735l(j2), c6956l3);
                    c6956l3.startapp(false);
                }
                obj = objVip;
                if (z) {
                    iOrdinal3 = enumC13846l.ordinal();
                    if (iOrdinal3 == 0) {
                        j4 = c7259l.admob;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            C18725l.billing();
                            return;
                        }
                        j4 = c7259l.admob;
                    } else {
                        j4 = c7259l.subs;
                    }
                    j3 = j4;
                } else {
                    i2 = i2;
                    iOrdinal2 = enumC13846l.ordinal();
                    if (iOrdinal2 != 0) {
                        j3 = c7259l.isPro;
                    } else if (iOrdinal2 != 1) {
                        j3 = c7259l.firebase;
                    } else {
                        if (iOrdinal2 == 2) {
                            C18725l.billing();
                            return;
                        }
                        j3 = c7259l.smaato;
                    }
                }
                if (z) {
                    c6956l3.m2123default(633206758);
                    C6956l c6956l4 = c6956l3;
                    interfaceC12244lVip = AbstractC0703l.yandex(j3, C7259l.yandex(enumC13846l, c6956l3), null, null, c6956l4, 0, 12);
                    c6956l2 = c6956l4;
                    c6956l2.startapp(false);
                } else {
                    c6956l2 = c6956l3;
                    c6956l2.m2123default(633296968);
                    interfaceC12244lVip = AbstractC8020l.vip(new C9735l(j3), c6956l2);
                    c6956l2.startapp(false);
                }
                InterfaceC17242l interfaceC17242lAdmob = AbstractC0080l.admob(AbstractC0080l.adcel(interfaceC17242l, C18450l.f36043l));
                boolean zBilling7 = c6956l2.billing(obj) | c6956l2.billing(interfaceC12244lVip);
                i4 = i2;
                if ((i2 & 458752) != 131072 || ((i4 & 262144) != 0 && c6956l2.admob(c0404l2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zBilling8 = z2 | zBilling7 | c6956l2.billing(interfaceC12244lYandex) | c6956l2.billing(c9459lBilling2) | c6956l2.billing(c9459lBilling);
                if ((i4 & 57344) != 16384 || ((i4 & 32768) != 0 && c6956l2.admob(c0404l))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = zBilling8 | z3;
                objM2132native2 = c6956l2.m2132native();
                if (!z4 || objM2132native2 == c13863l) {
                    i5 = 0;
                    objM2132native2 = new Function1() { // from class: lؖۥۧ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            float f5;
                            InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                            long j5 = ((C9735l) obj.getValue()).yandex;
                            long j6 = ((C9735l) interfaceC12244lVip.getValue()).yandex;
                            float fMo868instanceof = interfaceC13349l.mo868instanceof(2.0f);
                            C0404l c0404l3 = c0404l2;
                            float f6 = c0404l3.yandex;
                            float f7 = f6 / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                            boolean zCrashlytics = C9735l.crashlytics(j5, j6);
                            C5053l c5053l = C5053l.yandex;
                            if (zCrashlytics) {
                                f5 = 0.0f;
                                AbstractC9361l.adcel(interfaceC13349l, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L), c5053l, 226);
                            } else {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                                float f8 = fIntBitsToFloat - (f6 * 2.0f);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                                float fMax = Math.max(0.0f, fMo868instanceof - f6);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                                interfaceC13349l = interfaceC13349l;
                                f5 = 0.0f;
                                AbstractC9361l.adcel(interfaceC13349l, j5, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, c5053l, 224);
                                float f9 = fIntBitsToFloat - f6;
                                float f10 = fMo868instanceof - f7;
                                AbstractC9361l.adcel(interfaceC13349l, j6, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), c0404l3, 224);
                            }
                            long j7 = ((C9735l) interfaceC12244lYandex.getValue()).yandex;
                            float fFloatValue = ((Number) c9459lBilling2.getValue()).floatValue();
                            float fFloatValue2 = ((Number) c9459lBilling.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                            float fFirebase = AbstractC7572l.firebase(0.4f, 0.5f, fFloatValue2);
                            float fFirebase2 = AbstractC7572l.firebase(0.7f, 0.5f, fFloatValue2);
                            float fFirebase3 = AbstractC7572l.firebase(0.5f, 0.5f, fFloatValue2);
                            float fFirebase4 = AbstractC7572l.firebase(0.3f, 0.5f, fFloatValue2);
                            C16722l c16722l2 = c16722l;
                            c16722l2.yandex.subs();
                            C9902l c9902l = c16722l2.yandex;
                            c9902l.billing(0.2f * fIntBitsToFloat2, fFirebase3 * fIntBitsToFloat2);
                            c9902l.purchase(fFirebase * fIntBitsToFloat2, fFirebase2 * fIntBitsToFloat2);
                            c9902l.purchase(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fFirebase4);
                            C16876l c16876l = c16722l2.loadAd;
                            c16876l.loadAd(c9902l);
                            C9902l c9902l2 = c16722l2.crashlytics;
                            c9902l2.subs();
                            c16876l.yandex(f5, c16876l.yandex.getLength() * fFloatValue, c9902l2);
                            AbstractC9361l.remoteconfig(interfaceC13349l, c16722l2.crashlytics, j7, 0.0f, c0404l, 52);
                            return Unit.INSTANCE;
                        }
                    };
                    c6956l2.m2147try(objM2132native2);
                } else {
                    i5 = 0;
                }
                AbstractC12155l.yandex(interfaceC17242lAdmob, (Function1) objM2132native2, c6956l2, i5);
            }
            c2966l = interfaceC17807lRemoteconfig;
            c6956l.startapp(false);
            c9459lBilling = AbstractC2438l.billing(c18656lIsPro, fValueOf3, fValueOf4, c2966l, c0010l, c6956l, 0);
            objM2132native = c6956l.m2132native();
            if (objM2132native == c13863l) {
                objM2132native = new C16722l();
                c6956l.m2147try(objM2132native);
            }
            c16722l = (C16722l) objM2132native;
            c6956l.m2123default(-2128520210);
            if (enumC13846l == enumC13846l3) {
                j = c7259l.loadAd;
            } else {
                j = c7259l.yandex;
            }
            c7259l.getClass();
            interfaceC12244lYandex = AbstractC0703l.yandex(j, C7259l.yandex(enumC13846l, c6956l), null, null, c6956l, 0, 12);
            c6956l3 = c6956l;
            c6956l3.startapp(false);
            if (z) {
                iOrdinal4 = enumC13846l.ordinal();
                if (iOrdinal4 == 0) {
                    j2 = c7259l.crashlytics;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        C18725l.billing();
                        return;
                    }
                    j2 = c7259l.crashlytics;
                } else {
                    j2 = c7259l.amazon;
                }
            } else {
                iOrdinal = enumC13846l.ordinal();
                if (iOrdinal != 0) {
                    j2 = c7259l.purchase;
                } else if (iOrdinal != 1) {
                    j2 = c7259l.billing;
                } else {
                    if (iOrdinal == 2) {
                        C18725l.billing();
                        return;
                    }
                    j2 = c7259l.mopub;
                }
            }
            if (z) {
                c6956l3.m2123default(496026915);
                objVip = AbstractC0703l.yandex(j2, C7259l.yandex(enumC13846l, c6956l3), null, null, c6956l, 0, 12);
                c6956l3 = c6956l;
                c6956l3.startapp(false);
            } else {
                c6956l3.m2123default(496117125);
                objVip = AbstractC8020l.vip(new C9735l(j2), c6956l3);
                c6956l3.startapp(false);
            }
            obj = objVip;
            if (z) {
                iOrdinal3 = enumC13846l.ordinal();
                if (iOrdinal3 == 0) {
                    j4 = c7259l.admob;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        C18725l.billing();
                        return;
                    }
                    j4 = c7259l.admob;
                } else {
                    j4 = c7259l.subs;
                }
                j3 = j4;
            } else {
                i2 = i2;
                iOrdinal2 = enumC13846l.ordinal();
                if (iOrdinal2 != 0) {
                    j3 = c7259l.isPro;
                } else if (iOrdinal2 != 1) {
                    j3 = c7259l.firebase;
                } else {
                    if (iOrdinal2 == 2) {
                        C18725l.billing();
                        return;
                    }
                    j3 = c7259l.smaato;
                }
            }
            if (z) {
                c6956l3.m2123default(633206758);
                C6956l c6956l5 = c6956l3;
                interfaceC12244lVip = AbstractC0703l.yandex(j3, C7259l.yandex(enumC13846l, c6956l3), null, null, c6956l5, 0, 12);
                c6956l2 = c6956l5;
                c6956l2.startapp(false);
            } else {
                c6956l2 = c6956l3;
                c6956l2.m2123default(633296968);
                interfaceC12244lVip = AbstractC8020l.vip(new C9735l(j3), c6956l2);
                c6956l2.startapp(false);
            }
            InterfaceC17242l interfaceC17242lAdmob2 = AbstractC0080l.admob(AbstractC0080l.adcel(interfaceC17242l, C18450l.f36043l));
            boolean zBilling9 = c6956l2.billing(obj) | c6956l2.billing(interfaceC12244lVip);
            i4 = i2;
            if ((i2 & 458752) != 131072) {
                z2 = true;
            } else {
                z2 = true;
            }
            boolean zBilling10 = z2 | zBilling9 | c6956l2.billing(interfaceC12244lYandex) | c6956l2.billing(c9459lBilling2) | c6956l2.billing(c9459lBilling);
            if ((i4 & 57344) != 16384) {
                z3 = true;
            } else {
                z3 = true;
            }
            z4 = zBilling10 | z3;
            objM2132native2 = c6956l2.m2132native();
            if (z4) {
                i5 = 0;
                objM2132native2 = new Function1() { // from class: lؖۥۧ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float f5;
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                        long j5 = ((C9735l) obj.getValue()).yandex;
                        long j6 = ((C9735l) interfaceC12244lVip.getValue()).yandex;
                        float fMo868instanceof = interfaceC13349l.mo868instanceof(2.0f);
                        C0404l c0404l3 = c0404l2;
                        float f6 = c0404l3.yandex;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                        boolean zCrashlytics = C9735l.crashlytics(j5, j6);
                        C5053l c5053l = C5053l.yandex;
                        if (zCrashlytics) {
                            f5 = 0.0f;
                            AbstractC9361l.adcel(interfaceC13349l, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L), c5053l, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                            float f8 = fIntBitsToFloat - (f6 * 2.0f);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                            float fMax = Math.max(0.0f, fMo868instanceof - f6);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                            interfaceC13349l = interfaceC13349l;
                            f5 = 0.0f;
                            AbstractC9361l.adcel(interfaceC13349l, j5, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, c5053l, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fMo868instanceof - f7;
                            AbstractC9361l.adcel(interfaceC13349l, j6, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), c0404l3, 224);
                        }
                        long j7 = ((C9735l) interfaceC12244lYandex.getValue()).yandex;
                        float fFloatValue = ((Number) c9459lBilling2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) c9459lBilling.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                        float fFirebase = AbstractC7572l.firebase(0.4f, 0.5f, fFloatValue2);
                        float fFirebase2 = AbstractC7572l.firebase(0.7f, 0.5f, fFloatValue2);
                        float fFirebase3 = AbstractC7572l.firebase(0.5f, 0.5f, fFloatValue2);
                        float fFirebase4 = AbstractC7572l.firebase(0.3f, 0.5f, fFloatValue2);
                        C16722l c16722l2 = c16722l;
                        c16722l2.yandex.subs();
                        C9902l c9902l = c16722l2.yandex;
                        c9902l.billing(0.2f * fIntBitsToFloat2, fFirebase3 * fIntBitsToFloat2);
                        c9902l.purchase(fFirebase * fIntBitsToFloat2, fFirebase2 * fIntBitsToFloat2);
                        c9902l.purchase(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fFirebase4);
                        C16876l c16876l = c16722l2.loadAd;
                        c16876l.loadAd(c9902l);
                        C9902l c9902l2 = c16722l2.crashlytics;
                        c9902l2.subs();
                        c16876l.yandex(f5, c16876l.yandex.getLength() * fFloatValue, c9902l2);
                        AbstractC9361l.remoteconfig(interfaceC13349l, c16722l2.crashlytics, j7, 0.0f, c0404l, 52);
                        return Unit.INSTANCE;
                    }
                };
                c6956l2.m2147try(objM2132native2);
            } else {
                i5 = 0;
                objM2132native2 = new Function1() { // from class: lؖۥۧ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float f5;
                        InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj2;
                        long j5 = ((C9735l) obj.getValue()).yandex;
                        long j6 = ((C9735l) interfaceC12244lVip.getValue()).yandex;
                        float fMo868instanceof = interfaceC13349l.mo868instanceof(2.0f);
                        C0404l c0404l3 = c0404l2;
                        float f6 = c0404l3.yandex;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                        boolean zCrashlytics = C9735l.crashlytics(j5, j6);
                        C5053l c5053l = C5053l.yandex;
                        if (zCrashlytics) {
                            f5 = 0.0f;
                            AbstractC9361l.adcel(interfaceC13349l, j5, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof)) & 4294967295L), c5053l, 226);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                            float f8 = fIntBitsToFloat - (f6 * 2.0f);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
                            float fMax = Math.max(0.0f, fMo868instanceof - f6);
                            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
                            interfaceC13349l = interfaceC13349l;
                            f5 = 0.0f;
                            AbstractC9361l.adcel(interfaceC13349l, j5, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, c5053l, 224);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fMo868instanceof - f7;
                            AbstractC9361l.adcel(interfaceC13349l, j6, (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), c0404l3, 224);
                        }
                        long j7 = ((C9735l) interfaceC12244lYandex.getValue()).yandex;
                        float fFloatValue = ((Number) c9459lBilling2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) c9459lBilling.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC13349l.admob() >> 32));
                        float fFirebase = AbstractC7572l.firebase(0.4f, 0.5f, fFloatValue2);
                        float fFirebase2 = AbstractC7572l.firebase(0.7f, 0.5f, fFloatValue2);
                        float fFirebase3 = AbstractC7572l.firebase(0.5f, 0.5f, fFloatValue2);
                        float fFirebase4 = AbstractC7572l.firebase(0.3f, 0.5f, fFloatValue2);
                        C16722l c16722l2 = c16722l;
                        c16722l2.yandex.subs();
                        C9902l c9902l = c16722l2.yandex;
                        c9902l.billing(0.2f * fIntBitsToFloat2, fFirebase3 * fIntBitsToFloat2);
                        c9902l.purchase(fFirebase * fIntBitsToFloat2, fFirebase2 * fIntBitsToFloat2);
                        c9902l.purchase(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fFirebase4);
                        C16876l c16876l = c16722l2.loadAd;
                        c16876l.loadAd(c9902l);
                        C9902l c9902l2 = c16722l2.crashlytics;
                        c9902l2.subs();
                        c16876l.yandex(f5, c16876l.yandex.getLength() * fFloatValue, c9902l2);
                        AbstractC9361l.remoteconfig(interfaceC13349l, c16722l2.crashlytics, j7, 0.0f, c0404l, 52);
                        return Unit.INSTANCE;
                    }
                };
                c6956l2.m2147try(objM2132native2);
            }
            AbstractC12155l.yandex(interfaceC17242lAdmob2, (Function1) objM2132native2, c6956l2, i5);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4186l(z, enumC13846l, interfaceC17242l, c7259l, c0404l, c0404l2, i);
        }
    }

    public static InterfaceC17242l mopub(InterfaceC17242l interfaceC17242l, C18113l c18113l, Function1 function1) {
        return interfaceC17242l.premium(new C13687l(c18113l, C3227l.billing, function1));
    }

    public static final C8862l purchase(InterfaceC9671l interfaceC9671l) {
        if (((InterfaceC2851l) interfaceC9671l).getF3035l() != null) {
            return amazon(interfaceC9671l);
        }
        return null;
    }

    public static final InterfaceC2851l smaato(LongPointerWrapper longPointerWrapper, InterfaceC1388l interfaceC1388l, C5501l c5501l, InterfaceC7832l interfaceC7832l) {
        InterfaceC2851l interfaceC2851lM1810const = c5501l.m1810const(interfaceC1388l);
        subs(interfaceC2851lM1810const, interfaceC7832l, c5501l, interfaceC1388l, longPointerWrapper);
        return interfaceC2851lM1810const;
    }

    public static final void subs(InterfaceC2851l interfaceC2851l, InterfaceC7832l interfaceC7832l, C5501l c5501l, InterfaceC1388l interfaceC1388l, LongPointerWrapper longPointerWrapper) {
        String strYandex;
        if (interfaceC2851l instanceof InterfaceC11343l) {
            NativePointer nativePointerMo1845l = interfaceC7832l.mo1845l();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            long jRealm_object_get_table = realmcJNI.realm_object_get_table(ptr$cinterop_release);
            realm_class_info_t realm_class_info_tVar = new realm_class_info_t();
            realmcJNI.realm_get_class(((LongPointerWrapper) nativePointerMo1845l).getPtr$cinterop_release(), jRealm_object_get_table, realm_class_info_tVar.yandex, realm_class_info_tVar);
            strYandex = realmcJNI.realm_class_info_t_name_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_primary_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_key_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_flags_get(realm_class_info_tVar.yandex, realm_class_info_tVar);
        } else {
            strYandex = AbstractC5293l.loadAd(interfaceC1388l).yandex();
        }
        interfaceC2851l.ads(new C1332l(strYandex, interfaceC1388l, interfaceC7832l, c5501l, longPointerWrapper));
    }

    public static final void yandex(boolean z, Function1 function1, InterfaceC17242l interfaceC17242l, boolean z2, C7259l c7259l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        boolean z3;
        C7259l c7259l2;
        C7259l c7259l3;
        int i2;
        InterfaceC17242l interfaceC17242l3;
        boolean z4;
        Function0 function0;
        boolean z5;
        c6956l.m2133new(-1406741137);
        int i3 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function1) ? 32 : 16) | 208256;
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                C0764l c0764l = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex;
                c7259l3 = c0764l.f2311public;
                if (c7259l3 == null) {
                    long jAmazon = AbstractC15038l.amazon(c0764l, AbstractC8999l.mopub);
                    long j = C9735l.isPro;
                    long jAmazon2 = AbstractC15038l.amazon(c0764l, AbstractC8999l.billing);
                    int i4 = AbstractC8999l.amazon;
                    long jAmazon3 = AbstractC15038l.amazon(c0764l, i4);
                    int i5 = AbstractC8999l.purchase;
                    long jAmazon4 = AbstractC15038l.amazon(c0764l, i5);
                    float f = AbstractC8999l.yandex;
                    C7259l c7259l4 = new C7259l(jAmazon, j, jAmazon3, j, C9735l.loadAd(f, jAmazon4), j, C9735l.loadAd(f, AbstractC15038l.amazon(c0764l, i5)), AbstractC15038l.amazon(c0764l, i4), AbstractC15038l.amazon(c0764l, AbstractC8999l.subs), C9735l.loadAd(f, AbstractC15038l.amazon(c0764l, i5)), C9735l.loadAd(AbstractC8999l.crashlytics, AbstractC15038l.amazon(c0764l, AbstractC8999l.admob)), C9735l.loadAd(f, AbstractC15038l.amazon(c0764l, i5)), jAmazon2);
                    c0764l.f2311public = c7259l4;
                    c7259l3 = c7259l4;
                }
                i2 = i3 & (-57345);
                interfaceC17242l3 = C4346l.f8873l;
                z4 = true;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-57345);
                interfaceC17242l3 = interfaceC17242l;
                z4 = z2;
                c7259l3 = c7259l;
            }
            c6956l.adcel();
            float fFloor = (float) Math.floor(((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo868instanceof(2.0f));
            EnumC13846l enumC13846l = z ? EnumC13846l.f27083l : EnumC13846l.f27082l;
            if (function1 != null) {
                c6956l.m2123default(2066141046);
                boolean z6 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objM2132native = c6956l.m2132native();
                if (z6 || objM2132native == C1867l.yandex) {
                    z5 = false;
                    objM2132native = new C1926l(0 == true ? 1 : 0, function1, z);
                    c6956l.m2147try(objM2132native);
                } else {
                    z5 = false;
                }
                function0 = (Function0) objM2132native;
                c6956l.startapp(z5);
            } else {
                c6956l.m2123default(2066206735);
                c6956l.startapp(false);
                function0 = null;
            }
            crashlytics(enumC13846l, function0, new C0404l(fFloor, 0.0f, 2, 0, null, 26), new C0404l(fFloor, 0.0f, 0, 0, null, 30), interfaceC17242l3, z4, c7259l3, c6956l, 12808704);
            interfaceC17242l2 = interfaceC17242l3;
            z3 = z4;
            c7259l2 = c7259l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z3 = z2;
            c7259l2 = c7259l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5322l(z, function1, interfaceC17242l2, z3, c7259l2, i, 0);
        }
    }
}
