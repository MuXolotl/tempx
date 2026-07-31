package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌۦۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9197l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f18906l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f18907l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f18908l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f18909l;

    public C9197l(boolean z) {
        super(0);
        this.f18908l = z;
        Boolean bool = Boolean.FALSE;
        this.f18909l = AbstractC8020l.smaato(bool);
        this.f18907l = AbstractC8020l.smaato(bool);
        this.f18906l = AbstractC8020l.smaato(null);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2621abstract(final Function0 function0, Function1 function1, final C1682l c1682l, C6956l c6956l, int i) {
        int i2;
        Function1 function2;
        int iAdmob;
        EnumC16913l enumC16913l;
        c6956l.m2133new(323919591);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
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
            i2 |= c6956l.admob(c1682l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                if (c1682l == null || (enumC16913l = c1682l.f4047l) == null) {
                    enumC16913l = EnumC16913l.SOCKS5;
                }
                objM2132native = AbstractC8020l.smaato(enumC16913l);
                c6956l.m2147try(objM2132native);
            }
            final InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                String str = c1682l != null ? c1682l.f4050l : null;
                if (str == null) {
                    str = "";
                }
                objM2132native2 = AbstractC8020l.smaato(str);
                c6956l.m2147try(objM2132native2);
            }
            final InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                C15308l c15308l = new C15308l(c1682l != null ? c1682l.f4045l : 0);
                c6956l.m2147try(c15308l);
                objM2132native3 = c15308l;
            }
            final C15308l c15308l2 = (C15308l) objM2132native3;
            Object objM2132native4 = c6956l.m2132native();
            if (objM2132native4 == c13863l) {
                String str2 = c1682l != null ? c1682l.f4046l : null;
                if (str2 == null) {
                    str2 = "";
                }
                objM2132native4 = AbstractC8020l.smaato(str2);
                c6956l.m2147try(objM2132native4);
            }
            final InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) objM2132native4;
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == c13863l) {
                String str3 = c1682l != null ? c1682l.f4049l : null;
                objM2132native5 = AbstractC8020l.smaato(str3 != null ? str3 : "");
                c6956l.m2147try(objM2132native5);
            }
            final InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) objM2132native5;
            final boolean z = ((String) interfaceC8714l2.getValue()).length() > 0 && c15308l2.admob() != 0 && ((((String) interfaceC8714l3.getValue()).length() > 0 && ((String) interfaceC8714l4.getValue()).length() > 0) || (((String) interfaceC8714l3.getValue()).length() == 0 && ((String) interfaceC8714l4.getValue()).length() == 0)) && (iAdmob = c15308l2.admob()) >= 0 && iAdmob < 65536;
            final Function1 function3 = function2;
            AbstractC16291l.yandex(function0, AbstractC14566l.amazon(385917343, new Function2() { // from class: lؒۜۨ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l2 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Function1 function4 = function3;
                        boolean zBilling = c6956l2.billing(function4);
                        final C1682l c1682l2 = c1682l;
                        boolean zAdmob = zBilling | c6956l2.admob(c1682l2);
                        final Function0 function5 = function0;
                        boolean zBilling2 = zAdmob | c6956l2.billing(function5);
                        Object objM2132native6 = c6956l2.m2132native();
                        if (zBilling2 || objM2132native6 == C1867l.yandex) {
                            final InterfaceC8714l interfaceC8714l5 = interfaceC8714l;
                            final InterfaceC8714l interfaceC8714l6 = interfaceC8714l2;
                            final C15308l c15308l3 = c15308l2;
                            final InterfaceC8714l interfaceC8714l7 = interfaceC8714l3;
                            final InterfaceC8714l interfaceC8714l8 = interfaceC8714l4;
                            Function0 function6 = new Function0() { // from class: lْٕؓ
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String strYandex;
                                    C1682l c1682l3 = c1682l2;
                                    if (c1682l3 == null || (strYandex = c1682l3.f4048l) == null) {
                                        strYandex = AbstractC0441l.admob().yandex();
                                    }
                                    function4.invoke(new C1682l(strYandex, (EnumC16913l) interfaceC8714l5.getValue(), (String) interfaceC8714l6.getValue(), c15308l3.admob(), (String) interfaceC8714l7.getValue(), (String) interfaceC8714l8.getValue(), C3844l.f7950l));
                                    function5.invoke();
                                    return Unit.INSTANCE;
                                }
                            };
                            c6956l2.m2147try(function6);
                            objM2132native6 = function6;
                        }
                        AbstractC17457l.mopub((Function0) objM2132native6, null, z, null, null, null, AbstractC11141l.vip, c6956l2, 805306368, 506);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), null, AbstractC14566l.amazon(-1117180963, new C0454l(13, function0), c6956l), null, AbstractC11141l.startapp, AbstractC14566l.amazon(923138874, new C0843l(interfaceC8714l, interfaceC8714l2, c15308l2, interfaceC8714l3, interfaceC8714l4, 2), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, (i3 & 14) | 1772592, 0, 16276);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6190l(this, function0, function1, c1682l, i, 1);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2622import(Function0 function0, Function1 function1, C1682l c1682l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1988754139);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c1682l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC16291l.yandex(function0, AbstractC14566l.amazon(-1926756387, new C12755l(function1, c1682l, function0, 26), c6956l), null, AbstractC14566l.amazon(865112603, new C0454l(14, function0), c6956l), null, AbstractC11141l.remoteconfig, AbstractC14566l.amazon(-1389534856, new C4951l(21, c1682l), c6956l), null, 0L, 0L, 0L, 0L, null, c6956l, (i2 & 14) | 1772592, 0, 16276);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6190l(this, function0, function1, c1682l, i, 0);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m2623instanceof(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-640691015);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC11028l.loadAd(AbstractC11141l.subs, AbstractC11141l.isPro, interfaceC17242l, c6956l, 438);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, interfaceC17242l, i, 15);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(941107032);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3604l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3604l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C3278l) ((AbstractC11904l) C0995l.f2741l.f33214l), c6956l, 0);
            boolean zBooleanValue = ((Boolean) this.f18909l.getValue()).booleanValue();
            C10086l c10086l = this.f18906l;
            if (zBooleanValue) {
                c6956l.m2123default(-1026493181);
                C1682l c1682l = (C1682l) c10086l.getValue();
                boolean zAdmob = c6956l.admob(this);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob || objM2132native2 == c13863l) {
                    objM2132native2 = new C5840l(this, i3);
                    c6956l.m2147try(objM2132native2);
                }
                Function0 function0 = (Function0) objM2132native2;
                boolean zAdmob2 = c6956l.admob(interfaceC2262l);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob2 || objM2132native3 == c13863l) {
                    objM2132native3 = new C15299l(interfaceC2262l, 17);
                    c6956l.m2147try(objM2132native3);
                }
                m2621abstract(function0, (Function1) objM2132native3, c1682l, c6956l, (i2 << 9) & 7168);
            } else {
                c6956l.m2123default(-1030713366);
            }
            c6956l.startapp(false);
            if (!((Boolean) this.f18907l.getValue()).booleanValue() || ((C1682l) c10086l.getValue()) == null) {
                c6956l2 = c6956l;
                c6956l2.m2123default(-1030713366);
            } else {
                c6956l.m2123default(-1026012030);
                C1682l c1682l2 = (C1682l) c10086l.getValue();
                boolean zAdmob3 = c6956l.admob(this);
                Object objM2132native4 = c6956l.m2132native();
                if (zAdmob3 || objM2132native4 == c13863l) {
                    objM2132native4 = new C5840l(this, 3);
                    c6956l.m2147try(objM2132native4);
                }
                Function0 function1 = (Function0) objM2132native4;
                boolean zAdmob4 = c6956l.admob(interfaceC2262l);
                Object objM2132native5 = c6956l.m2132native();
                if (zAdmob4 || objM2132native5 == c13863l) {
                    objM2132native5 = new C15299l(interfaceC2262l, 19);
                    c6956l.m2147try(objM2132native5);
                }
                m2622import(function1, (Function1) objM2132native5, c1682l2, c6956l, (i2 << 9) & 7168);
                c6956l2 = c6956l;
            }
            c6956l2.startapp(false);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-492273124, new C3158l(c13072lYandex, this, 16), c6956l2), null, null, null, 0, 0L, 0L, ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).amazon(c6956l2), AbstractC14566l.amazon(-1043662489, new C11223l(c13072lYandex, interfaceC8714lLoadAd, interfaceC2262l, this, 14), c6956l2), c6956l2, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2674l(this, i);
        }
    }
}
