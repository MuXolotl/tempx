package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14744l {
    public static final float crashlytics;
    public static final float loadAd;
    public static final float yandex;

    static {
        AbstractC3605l.loadAd(4.0f, 0.0f, 2);
        AbstractC3605l.yandex(4.0f, 2.0f);
        ((Boolean) AbstractC7063l.yandex.getValue()).getClass();
        yandex = 8.0f;
        loadAd = 112.0f;
        crashlytics = 280.0f;
    }

    public static final void loadAd(final Function2 function2, final Function0 function0, final InterfaceC17242l interfaceC17242l, final Function2 function3, final Function2 function4, final boolean z, final C3500l c3500l, final InterfaceC11780l interfaceC11780l, C6956l c6956l, final int i) {
        int i2;
        Function0 function1;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-1325192924);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= c6956l.admob(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i2 |= c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            interfaceC17242l2 = interfaceC17242l;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(function4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.mopub(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.billing(c3500l) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.billing(interfaceC11780l) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.billing(null) ? 67108864 : 33554432;
        }
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.remoteconfig(AbstractC0080l.amazon(AbstractC9151l.yandex(interfaceC17242l2, null, AbstractC10493l.yandex(true, 0.0f, 0L, null, 254), z, null, function1, 24), 1.0f), loadAd, 48.0f, crashlytics, 0.0f, 8), interfaceC11780l);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l, 48);
            long j = c6956l.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
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
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC13010l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.remoteconfig, AbstractC14566l.amazon(865999929, new C8076l(3, function3, c3500l, function4, function2, z), c6956l), c6956l, 48);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌؗۦ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC14744l.loadAd(function2, function0, interfaceC17242l, function3, function4, z, c3500l, interfaceC11780l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C14783l c14783l, Function0 function0, C11194l c11194l, InterfaceC6347l interfaceC6347l, long j, float f, C15578l c15578l, C6956l c6956l, int i) {
        boolean z;
        Object objMopub;
        boolean z2;
        Object objMopub2;
        c6956l.m2133new(-1278879194);
        int i2 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2) | (c6956l.billing(c14783l) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(c11194l) ? 2048 : 1024) | (c6956l.billing(interfaceC6347l) ? 16384 : 8192) | (c6956l.purchase(j) ? 131072 : 65536) | (c6956l.crashlytics(0.0f) ? 1048576 : 524288) | (c6956l.crashlytics(f) ? 8388608 : 4194304) | (c6956l.billing(null) ? 67108864 : 33554432) | (c6956l.admob(c15578l) ? 536870912 : 268435456);
        if (c6956l.m2127for(i2 & 1, (i2 & 306783379) != 306783378)) {
            C18656l c18656lAdmob = AbstractC2438l.admob(c14783l, "DropDownMenu", c6956l, (((i2 >> 3) & 14) | 48) & 126, 0);
            InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 2);
            InterfaceC17807l interfaceC17807lRemoteconfig2 = C17423l.remoteconfig(c6956l, 5);
            C0010l c0010l = AbstractC3483l.purchase;
            boolean zMopub = c18656lAdmob.mopub();
            Object obj = C1867l.yandex;
            if (zMopub) {
                interfaceC17807lRemoteconfig = interfaceC17807lRemoteconfig;
                z = false;
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling = c6956l.billing(c18656lAdmob);
                objMopub = c6956l.m2132native();
                if (zBilling || objMopub == obj) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                }
                z = false;
                c6956l.startapp(false);
            }
            boolean zBooleanValue = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-904349302);
            float f2 = zBooleanValue ? 1.0f : 0.8f;
            c6956l.startapp(z);
            Float fValueOf = Float.valueOf(f2);
            boolean zBilling2 = c6956l.billing(c18656lAdmob);
            Object objM2132native = c6956l.m2132native();
            if (zBilling2 || objM2132native == obj) {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656lAdmob, 8));
                c6956l.m2147try(objM2132native);
            }
            boolean zBooleanValue2 = ((Boolean) ((InterfaceC12244l) objM2132native).getValue()).booleanValue();
            c6956l.m2123default(-904349302);
            float f3 = zBooleanValue2 ? 1.0f : 0.8f;
            c6956l.startapp(false);
            Float fValueOf2 = Float.valueOf(f3);
            boolean zBilling3 = c6956l.billing(c18656lAdmob);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lAdmob, 9));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.m2123default(-257488561);
            c6956l.startapp(false);
            C9459l c9459lBilling = AbstractC2438l.billing(c18656lAdmob, fValueOf, fValueOf2, interfaceC17807lRemoteconfig, c0010l, c6956l, 0);
            if (c18656lAdmob.mopub()) {
                z2 = false;
                objMopub2 = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lAdmob);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling4 = c6956l.billing(c18656lAdmob);
                objMopub2 = c6956l.m2132native();
                if (zBilling4 || objMopub2 == obj) {
                    AbstractC18620l abstractC18620lBilling2 = AbstractC7572l.billing();
                    Function1 function1Purchase2 = abstractC18620lBilling2 != null ? abstractC18620lBilling2.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig2 = AbstractC7572l.remoteconfig(abstractC18620lBilling2);
                    try {
                        Object objCrashlytics2 = c18656lAdmob.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        c6956l.m2147try(objCrashlytics2);
                        objMopub2 = objCrashlytics2;
                    } catch (Throwable th2) {
                        AbstractC7572l.startapp(abstractC18620lBilling2, abstractC18620lRemoteconfig2, function1Purchase2);
                        throw th2;
                    }
                }
                z2 = false;
                c6956l.startapp(false);
            }
            boolean zBooleanValue3 = ((Boolean) objMopub2).booleanValue();
            c6956l.m2123default(2062693622);
            float f4 = zBooleanValue3 ? 1.0f : 0.0f;
            c6956l.startapp(z2);
            Float fValueOf3 = Float.valueOf(f4);
            boolean zBilling5 = c6956l.billing(c18656lAdmob);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling5 || objM2132native3 == obj) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lAdmob, 10));
                c6956l.m2147try(objM2132native3);
            }
            boolean zBooleanValue4 = ((Boolean) ((InterfaceC12244l) objM2132native3).getValue()).booleanValue();
            c6956l.m2123default(2062693622);
            float f5 = zBooleanValue4 ? 1.0f : 0.0f;
            c6956l.startapp(false);
            Float fValueOf4 = Float.valueOf(f5);
            boolean zBilling6 = c6956l.billing(c18656lAdmob);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling6 || objM2132native4 == obj) {
                objM2132native4 = AbstractC8020l.mopub(new C4011l(c18656lAdmob, 11));
                c6956l.m2147try(objM2132native4);
            }
            c6956l.m2123default(-1585412933);
            c6956l.startapp(false);
            C9459l c9459lBilling2 = AbstractC2438l.billing(c18656lAdmob, fValueOf3, fValueOf4, interfaceC17807lRemoteconfig2, c0010l, c6956l, 0);
            boolean zBooleanValue5 = ((Boolean) c6956l.isPro(AbstractC13622l.yandex)).booleanValue();
            boolean zMopub2 = c6956l.mopub(zBooleanValue5) | c6956l.billing(c9459lBilling) | ((i2 & 112) == 32) | c6956l.billing(c9459lBilling2) | ((i2 & 896) == 256);
            Object objM2132native5 = c6956l.m2132native();
            if (zMopub2 || objM2132native5 == obj) {
                Object c18536l = new C18536l(zBooleanValue5, c14783l, function0, c9459lBilling, c9459lBilling2);
                c6956l.m2147try(c18536l);
                objM2132native5 = c18536l;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            AbstractC3274l.yandex(AbstractC7477l.loadAd(C4346l.f8873l, (Function1) objM2132native5), interfaceC6347l, j, 0L, 0.0f, f, null, AbstractC14566l.amazon(-816027071, new C12755l(interfaceC17242l, c11194l, c15578l, 21), c6956l), c6956l, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14067l(interfaceC17242l, c14783l, function0, c11194l, interfaceC6347l, j, f, c15578l, i);
        }
    }
}
