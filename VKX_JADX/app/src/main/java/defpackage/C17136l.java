package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗٔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17136l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C8688l f33320l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f33321l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f33322l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f33323l;

    public C17136l() {
        super(0);
        this.f33322l = AbstractC8020l.smaato(null);
        this.f33323l = AbstractC8020l.smaato(null);
        this.f33321l = AbstractC8020l.smaato(Boolean.FALSE);
        this.f33320l = new C8688l(new C12235l(this, 4));
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static final C3554l m4267try(C17136l c17136l, C3554l c3554l, C11359l c11359l) {
        String str = c11359l.yandex;
        String str2 = c11359l.loadAd;
        List list = c11359l.purchase;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            arrayList.add(new C2882l(((Number) c11359l.amazon.get(i)).intValue(), (float) ((Number) obj).doubleValue()));
            i = i2;
        }
        return C3554l.loadAd(c3554l, str, str2, arrayList, 24);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4268abstract(C11359l c11359l, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(47368937);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c11359l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC16291l.yandex(function0, AbstractC14566l.amazon(1572998449, new C0454l(5, function1), c6956l), null, AbstractC14566l.amazon(437054003, new C0454l(6, function0), c6956l), null, AbstractC5103l.billing, AbstractC14566l.amazon(-1266862666, new C15707l(25, c11359l), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, ((i2 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, c11359l, function0, function1, i, 6);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4269finally(String str, C6956l c6956l, int i) {
        c6956l.m2133new(-706469667);
        int i2 = i | (c6956l.billing(str) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC13010l.loadAd(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.remoteconfig, c6956l, i2 & 14, 0, 131070);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14601l(this, str, i, 0);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4270import(Function0 function0, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(890467652);
        if ((i & 6) == 0) {
            i2 = i | (c6956l.admob(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC8020l.smaato(new C0639l(0L, 6, ""));
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            AbstractC16291l.yandex(function0, AbstractC14566l.amazon(538986380, new C9772l(function1, interfaceC8714l, 29), c6956l), null, AbstractC14566l.amazon(662268046, new C0454l(8, function0), c6956l), null, AbstractC5103l.remoteconfig, AbstractC14566l.amazon(-1300293103, new C12755l((Object) function0, (Object) function1, interfaceC8714l, 14), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, (i2 & 14) | 1772592, 0, 16276);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, function0, function1, i, 14);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4271instanceof(Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1543464210);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC3383l.loadAd(function0, interfaceC17242l, false, null, AbstractC13880l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, 0L, c6956l, 0, 12), null, AbstractC2576l.yandex(1.0f, ((C14370l) c6956l.isPro(c10707l)).yandex.ads), AbstractC5103l.startapp, c6956l, (i2 & 14) | 100663344, 172);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) this, (Object) function0, interfaceC17242l, i, 15);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C6956l c6956l2;
        C17136l c17136l;
        C6956l c6956l3;
        C17136l c17136l2 = this;
        c6956l.m2133new(-2030414661);
        int i2 = i | (c6956l.admob(c17136l2) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC15829l interfaceC15829l = (InterfaceC15829l) c17136l2.f33320l.getValue();
            C15199l c15199l = C15199l.f29801l;
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C17437l(3, null, 0);
                c6956l.m2147try(objM2132native);
            }
            C18454l c18454l = C18454l.f36052l;
            C5073l c5073lCrashlytics = AbstractC8265l.crashlytics(interfaceC15829l, c15199l, (Function3) objM2132native, C18454l.loadAd(), c6956l, 0);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                C13434l.yandex.getClass();
                objM2132native3 = AbstractC0509l.purchase(C13434l.amazon);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC13238l interfaceC13238l = (InterfaceC13238l) objM2132native3;
            C13434l.yandex.getClass();
            C11362l c11362l = C13434l.purchase;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            C11359l c11359l = (C11359l) c17136l2.f33323l.getValue();
            if (c11359l == null) {
                c6956l.m2123default(-2058011719);
                c6956l.startapp(false);
                c6956l2 = c6956l;
                c17136l = c17136l2;
            } else {
                c6956l.m2123default(-2058011718);
                boolean zAdmob = c6956l.admob(c17136l2);
                Object objM2132native4 = c6956l.m2132native();
                if (zAdmob || objM2132native4 == c13863l) {
                    objM2132native4 = new C12235l(c17136l2, 0);
                    c6956l.m2147try(objM2132native4);
                }
                Function0 function0 = (Function0) objM2132native4;
                boolean zAdmob2 = c6956l.admob(c11359l) | c6956l.billing(c5073lCrashlytics) | c6956l.admob(interfaceC2262l) | c6956l.admob(c17136l2);
                Object objM2132native5 = c6956l.m2132native();
                if (zAdmob2 || objM2132native5 == c13863l) {
                    C17026l c17026l = new C17026l(c11359l, interfaceC2262l, this, c5073lCrashlytics, 5);
                    c6956l.m2147try(c17026l);
                    objM2132native5 = c17026l;
                }
                C6956l c6956l4 = c6956l;
                C17136l c17136l3 = this;
                c17136l3.m4268abstract(c11359l, function0, (Function0) objM2132native5, c6956l4, (i2 << 9) & 7168);
                c6956l4.startapp(false);
                c17136l = c17136l3;
                c6956l2 = c6956l4;
            }
            C11359l c11359l2 = (C11359l) c17136l.f33322l.getValue();
            if (c11359l2 == null) {
                c6956l2.m2123default(-2057435863);
                c6956l2.startapp(false);
                c6956l3 = c6956l2;
            } else {
                c6956l2.m2123default(-2057435862);
                boolean zAdmob3 = c6956l2.admob(c17136l);
                Object objM2132native6 = c6956l2.m2132native();
                if (zAdmob3 || objM2132native6 == c13863l) {
                    objM2132native6 = new C12235l(c17136l, 1);
                    c6956l2.m2147try(objM2132native6);
                }
                Function0 function1 = (Function0) objM2132native6;
                boolean zBilling = c6956l2.billing(c5073lCrashlytics) | c6956l2.admob(interfaceC2262l) | c6956l2.admob(c17136l);
                Object objM2132native7 = c6956l2.m2132native();
                if (zBilling || objM2132native7 == c13863l) {
                    objM2132native7 = new C7705l(interfaceC2262l, c17136l, c5073lCrashlytics);
                    c6956l2.m2147try(objM2132native7);
                }
                c17136l.m4273this(c11359l2, function1, (Function1) objM2132native7, c6956l2, (i2 << 9) & 7168);
                C6956l c6956l5 = c6956l2;
                c6956l5.startapp(false);
                c6956l3 = c6956l5;
            }
            if (((Boolean) c17136l.f33321l.getValue()).booleanValue()) {
                c6956l3.m2123default(-2056925261);
                boolean zAdmob4 = c6956l3.admob(c17136l);
                Object objM2132native8 = c6956l3.m2132native();
                if (zAdmob4 || objM2132native8 == c13863l) {
                    objM2132native8 = new C12235l(c17136l, 3);
                    c6956l3.m2147try(objM2132native8);
                }
                Function0 function2 = (Function0) objM2132native8;
                boolean zBilling2 = c6956l3.billing(c5073lCrashlytics) | c6956l3.admob(interfaceC2262l) | c6956l3.admob(c17136l);
                Object objM2132native9 = c6956l3.m2132native();
                if (zBilling2 || objM2132native9 == c13863l) {
                    objM2132native9 = new C7705l(c17136l, c5073lCrashlytics, interfaceC2262l);
                    c6956l3.m2147try(objM2132native9);
                }
                c17136l.m4270import(function2, (Function1) objM2132native9, c6956l3, (i2 << 6) & 896);
            } else {
                c6956l3.m2123default(-2062586233);
            }
            c6956l3.startapp(false);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-554459017, new C14601l(c13072lYandex, c17136l), c6956l3), null, null, null, 0, 0L, 0L, ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).amazon(c6956l3), AbstractC14566l.amazon(-1586573044, new C18383l(c13072lYandex, this, c11362l, c5073lCrashlytics, interfaceC13238l, 1), c6956l3), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2362l(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x024a  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4272public(C15578l c15578l, C15578l c15578l2, boolean z, Function0 function0, InterfaceC17242l interfaceC17242l, Function2 function2, C6956l c6956l, int i, int i2) {
        Function2 function3;
        int i3;
        boolean z2;
        C15578l c15578l3;
        Function2 function4;
        C4224l c4224lAds;
        Function2 function5;
        C18656l c18656lIsPro;
        boolean zBooleanValue;
        long j;
        Object objBilling;
        boolean zBilling;
        Object objM2132native;
        Object objMopub;
        boolean zBooleanValue2;
        long j2;
        boolean zBilling2;
        Object objM2132native2;
        boolean zBooleanValue3;
        long j3;
        boolean zBilling3;
        Object objM2132native3;
        boolean zBilling4;
        AbstractC18620l abstractC18620lBilling;
        Function1 function1Purchase;
        AbstractC18620l abstractC18620lRemoteconfig;
        c6956l.m2133new(599704568);
        int i4 = i | (c6956l.mopub(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function0) ? 2048 : 1024);
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((i & 196608) == 0) {
                function3 = function2;
                i4 |= c6956l.admob(function3) ? 131072 : 65536;
            }
            i3 = i4;
            if ((74899 & i3) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i3 & 1, z2)) {
                if (i5 != 0) {
                    function5 = AbstractC5103l.adcel;
                } else {
                    function5 = function3;
                }
                c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "[EqualizerPresetCard] is current preset custom", c6956l, ((i3 >> 6) & 14) | 48, 0);
                zBooleanValue = ((Boolean) c18656lIsPro.amazon.getValue()).booleanValue();
                c6956l.m2123default(-1120023802);
                if (zBooleanValue) {
                    c6956l.m2123default(971879156);
                    j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(971956315);
                    j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                    c6956l.startapp(false);
                }
                c6956l.startapp(false);
                objBilling = C9735l.billing(j);
                zBilling = c6956l.billing(objBilling);
                objM2132native = c6956l.m2132native();
                Object obj = C1867l.yandex;
                if (zBilling || objM2132native == obj) {
                    Object c0010l = new C0010l(C11192l.f22516l, new C3006l(10, objBilling));
                    c6956l.m2147try(c0010l);
                    objM2132native = c0010l;
                }
                C0010l c0010l2 = (C0010l) objM2132native;
                if (c18656lIsPro.mopub()) {
                    objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
                } else {
                    c6956l.m2123default(1666573488);
                    zBilling4 = c6956l.billing(c18656lIsPro);
                    objMopub = c6956l.m2132native();
                    if (zBilling4 || objMopub == obj) {
                        abstractC18620lBilling = AbstractC7572l.billing();
                        if (abstractC18620lBilling != null) {
                            function1Purchase = abstractC18620lBilling.purchase();
                        } else {
                            function1Purchase = null;
                        }
                        abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
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
                zBooleanValue2 = ((Boolean) objMopub).booleanValue();
                c6956l.m2123default(-1120023802);
                if (zBooleanValue2) {
                    c6956l.m2123default(971879156);
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(971956315);
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                    c6956l.startapp(false);
                }
                c6956l.startapp(false);
                C9735l c9735l = new C9735l(j2);
                zBilling2 = c6956l.billing(c18656lIsPro);
                objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == obj) {
                    objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 6));
                    c6956l.m2147try(objM2132native2);
                }
                zBooleanValue3 = ((Boolean) ((InterfaceC12244l) objM2132native2).getValue()).booleanValue();
                c6956l.m2123default(-1120023802);
                if (zBooleanValue3) {
                    c6956l.m2123default(971879156);
                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(971956315);
                    j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                    c6956l.startapp(false);
                }
                c6956l.startapp(false);
                C9735l c9735l2 = new C9735l(j3);
                zBilling3 = c6956l.billing(c18656lIsPro);
                objM2132native3 = c6956l.m2132native();
                if (zBilling3 || objM2132native3 == obj) {
                    objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 7));
                    c6956l.m2147try(objM2132native3);
                }
                c6956l.m2123default(-781456724);
                C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
                c6956l.startapp(false);
                long j4 = ((C9735l) AbstractC2438l.billing(c18656lIsPro, c9735l, c9735l2, c13315lAdmob, c0010l2, c6956l, 196608).f19321l.getValue()).yandex;
                AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                C12654l c12654lYandex = AbstractC13880l.yandex(j4, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.subscription, 0L, 0L, c6956l, 0, 12);
                C5028l c5028lYandex = AbstractC2576l.yandex(1.0f, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.ads);
                c15578l3 = c15578l;
                AbstractC3383l.loadAd(function0, interfaceC17242l, false, null, c12654lYandex, null, c5028lYandex, AbstractC14566l.amazon(-125765971, new Cprotected(c15578l3, function5, c15578l2, 17), c6956l), c6956l, ((i3 >> 9) & 14) | 100663344, 172);
                function4 = function5;
            } else {
                c15578l3 = c15578l;
                c6956l.m2124else();
                function4 = function3;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C3435l(this, c15578l3, c15578l2, z, function0, interfaceC17242l, function4, i, i2);
            }
        }
        i4 |= 196608;
        function3 = function2;
        i3 = i4;
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i3 & 1, z2)) {
            if (i5 != 0) {
                function5 = AbstractC5103l.adcel;
            } else {
                function5 = function3;
            }
            c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(z), "[EqualizerPresetCard] is current preset custom", c6956l, ((i3 >> 6) & 14) | 48, 0);
            zBooleanValue = ((Boolean) c18656lIsPro.amazon.getValue()).booleanValue();
            c6956l.m2123default(-1120023802);
            if (zBooleanValue) {
                c6956l.m2123default(971879156);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(971956315);
                j = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            objBilling = C9735l.billing(j);
            zBilling = c6956l.billing(objBilling);
            objM2132native = c6956l.m2132native();
            Object obj2 = C1867l.yandex;
            if (zBilling) {
                Object c0010l3 = new C0010l(C11192l.f22516l, new C3006l(10, objBilling));
                c6956l.m2147try(c0010l3);
                objM2132native = c0010l3;
            } else {
                Object c0010l4 = new C0010l(C11192l.f22516l, new C3006l(10, objBilling));
                c6956l.m2147try(c0010l4);
                objM2132native = c0010l4;
            }
            C0010l c0010l5 = (C0010l) objM2132native;
            if (c18656lIsPro.mopub()) {
                c6956l.m2123default(1666573488);
                zBilling4 = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling4) {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    if (abstractC18620lBilling != null) {
                        function1Purchase = abstractC18620lBilling.purchase();
                    } else {
                        function1Purchase = null;
                    }
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics2 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics2);
                    objMopub = objCrashlytics2;
                } else {
                    abstractC18620lBilling = AbstractC7572l.billing();
                    if (abstractC18620lBilling != null) {
                        function1Purchase = abstractC18620lBilling.purchase();
                    } else {
                        function1Purchase = null;
                    }
                    abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    Object objCrashlytics3 = c18656lIsPro.crashlytics();
                    AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                    c6956l.m2147try(objCrashlytics3);
                    objMopub = objCrashlytics3;
                }
                c6956l.startapp(false);
            } else {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            }
            zBooleanValue2 = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(-1120023802);
            if (zBooleanValue2) {
                c6956l.m2123default(971879156);
                j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(971956315);
                j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            C9735l c9735l3 = new C9735l(j2);
            zBilling2 = c6956l.billing(c18656lIsPro);
            objM2132native2 = c6956l.m2132native();
            if (zBilling2) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 6));
                c6956l.m2147try(objM2132native2);
            } else {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 6));
                c6956l.m2147try(objM2132native2);
            }
            zBooleanValue3 = ((Boolean) ((InterfaceC12244l) objM2132native2).getValue()).booleanValue();
            c6956l.m2123default(-1120023802);
            if (zBooleanValue3) {
                c6956l.m2123default(971879156);
                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(971956315);
                j3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.startapp;
                c6956l.startapp(false);
            }
            c6956l.startapp(false);
            C9735l c9735l4 = new C9735l(j3);
            zBilling3 = c6956l.billing(c18656lIsPro);
            objM2132native3 = c6956l.m2132native();
            if (zBilling3) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 7));
                c6956l.m2147try(objM2132native3);
            } else {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 7));
                c6956l.m2147try(objM2132native3);
            }
            c6956l.m2123default(-781456724);
            C13315l c13315lAdmob2 = AbstractC0532l.admob(0.0f, 0.0f, null, 7);
            c6956l.startapp(false);
            long j5 = ((C9735l) AbstractC2438l.billing(c18656lIsPro, c9735l3, c9735l4, c13315lAdmob2, c0010l5, c6956l, 196608).f19321l.getValue()).yandex;
            AbstractC5189l abstractC5189l2 = AbstractC16964l.yandex;
            C12654l c12654lYandex2 = AbstractC13880l.yandex(j5, ((C14370l) c6956l.isPro(abstractC5189l2)).yandex.subscription, 0L, 0L, c6956l, 0, 12);
            C5028l c5028lYandex2 = AbstractC2576l.yandex(1.0f, ((C14370l) c6956l.isPro(abstractC5189l2)).yandex.ads);
            c15578l3 = c15578l;
            AbstractC3383l.loadAd(function0, interfaceC17242l, false, null, c12654lYandex2, null, c5028lYandex2, AbstractC14566l.amazon(-125765971, new Cprotected(c15578l3, function5, c15578l2, 17), c6956l), c6956l, ((i3 >> 9) & 14) | 100663344, 172);
            function4 = function5;
        } else {
            c15578l3 = c15578l;
            c6956l.m2124else();
            function4 = function3;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3435l(this, c15578l3, c15578l2, z, function0, interfaceC17242l, function4, i, i2);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4273this(C11359l c11359l, Function0 function0, Function1 function1, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1852185155);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c11359l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            boolean zBilling = c6956l.billing(c11359l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC8020l.smaato(new C0639l(0L, 6, c11359l.loadAd));
                c6956l.m2147try(objM2132native);
            }
            InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            AbstractC16291l.yandex(function0, AbstractC14566l.amazon(-326555643, new C12755l((Object) function1, (Object) c11359l, interfaceC8714l, 13), c6956l), null, AbstractC14566l.amazon(-1462500089, new C0454l(7, function0), c6956l), null, AbstractC5103l.subs, AbstractC14566l.amazon(1128550538, new C2104l(interfaceC8714l, function0, function1, c11359l, 4), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, ((i3 >> 3) & 14) | 1772592, 0, 16276);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, c11359l, function0, function1, i, 7);
        }
    }
}
