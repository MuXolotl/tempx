package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lَؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10056l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final AbstractC18082l f20511l = AbstractC0509l.crashlytics(new C8195l(1, Integer.valueOf(R.string.timer_set_1)), new C8195l(5, Integer.valueOf(R.string.timer_set_5)), new C8195l(10, Integer.valueOf(R.string.timer_set_10)), new C8195l(15, Integer.valueOf(R.string.timer_set_15)), new C8195l(30, Integer.valueOf(R.string.timer_set_30)), new C8195l(45, Integer.valueOf(R.string.timer_set_45)), new C8195l(60, Integer.valueOf(R.string.timer_set_60)), new C8195l(120, Integer.valueOf(R.string.timer_set_120)));

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f20512l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f20513l;

    public C10056l() {
        super(0);
        this.f20512l = AbstractC8020l.smaato(AbstractC8619l.firebase.yandex());
        AbstractC8020l.smaato(AbstractC8619l.remoteconfig.yandex());
        this.f20513l = AbstractC8020l.smaato(C13701l.yandex);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2869abstract(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-1744885844);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            C16076l c16076l = VKXApplication.f36632l;
            if (c16076l == null) {
                c16076l = null;
            }
            c16076l.getClass();
            int i4 = 17;
            C1372l c1372l = (C1372l) c16076l.admob(new C18606l(c16076l, i4));
            int i5 = (int) (((c1372l != null ? c1372l.yandex : 1.0f) / 0.1f) - 5.0f);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C3342l(i3);
                c6956l.m2147try(objM2132native2);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(i5, (Function0) objM2132native2, c6956l, 384, 2);
            C16076l c16076l2 = VKXApplication.f36632l;
            if (c16076l2 == null) {
                c16076l2 = null;
            }
            c16076l2.getClass();
            C1372l c1372l2 = (C1372l) c16076l2.admob(new C18606l(c16076l2, i4));
            int i6 = (int) (((c1372l2 != null ? c1372l2.loadAd : 1.0f) / 0.1f) - 5.0f);
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C3342l(i3);
                c6956l.m2147try(objM2132native3);
            }
            interfaceC17242l2 = interfaceC17242l;
            AbstractC3383l.yandex(interfaceC17242l2, null, null, null, null, AbstractC14566l.amazon(404679454, new C11223l(this, c2887lLoadAd, AbstractC10521l.loadAd(i6, (Function0) objM2132native3, c6956l, 384, 2), interfaceC2262l, 17), c6956l), c6956l, (i2 & 14) | 196608, 30);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17992l(this, interfaceC17242l2, i, i3);
        }
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        C12942l.billing = null;
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
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m2870break(boolean z) {
        AbstractC8619l.firebase.loadAd(Boolean.valueOf(z));
        if (z) {
            C0554l c0554l = C16076l.f31498l;
            if (c0554l == null) {
                c0554l = null;
            }
            C7390l c7390l = ((C16076l) ((C3342l) c0554l.f1958l).invoke()).f31515l;
            C0554l c0554l2 = C16076l.f31498l;
            if (c0554l2 == null) {
                c0554l2 = null;
            }
            C10507l c10507lCrashlytics = ((C16076l) ((C3342l) c0554l2.f1958l).invoke()).crashlytics();
            c7390l.yandex(c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null);
        } else {
            C0554l c0554l3 = C16076l.f31498l;
            ((C16076l) ((C3342l) (c0554l3 != null ? c0554l3 : null).f1958l).invoke()).f31515l.loadAd();
        }
        this.f20512l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m2871finally(C15578l c15578l, Function1 function1, AbstractC13264l abstractC13264l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        AbstractC13264l abstractC13264l2;
        C6956l c6956l2;
        c6956l.m2133new(1165227671);
        int i2 = i | (c6956l.billing(abstractC13264l) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C13765l(0.0f);
                c6956l.m2147try(objM2132native2);
            }
            C13765l c13765l = (C13765l) objM2132native2;
            Integer numValueOf = Integer.valueOf(((C15308l) abstractC13264l.amazon.f32506l).admob());
            int i3 = i2 & 57344;
            boolean z = i3 == 16384;
            Object objM2132native3 = c6956l.m2132native();
            int i4 = 5;
            InterfaceC14029l interfaceC14029l = null;
            if (z || objM2132native3 == c13863l) {
                objM2132native3 = new C7864l(abstractC13264l, c13765l, interfaceC14029l, i4);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, numValueOf, (Function2) objM2132native3);
            Integer numValueOf2 = Integer.valueOf(abstractC13264l.metrica());
            Object objM2132native4 = c6956l.m2132native();
            int i5 = 6;
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C7864l(function1, c13765l, interfaceC14029l, i5);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, numValueOf2, (Function2) objM2132native4);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf3 = Integer.valueOf(i6);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf3, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.yandex(C11090l.billing(((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, 0, 0L, 16777214), AbstractC14566l.amazon(672573968, new C2104l(c15578l, c13765l, interfaceC2262l, abstractC13264l, 13), c6956l), c6956l, 48);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_down_24, 0, c6956l), null, new C14020l(C18450l.f36034l), ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, c6956l, 56, 0);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l, 48);
            long j2 = c6956l.f14595continue;
            int i7 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_chevron_left_outline_28, 0, c6956l);
            long j3 = ((C14370l) c6956l.isPro(c10707l)).yandex.subscription;
            boolean zAdmob = c6956l.admob(interfaceC2262l) | (i3 == 16384);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob || objM2132native5 == c13863l) {
                abstractC13264l2 = abstractC13264l;
                objM2132native5 = new C16154l(interfaceC2262l, abstractC13264l2, 4);
                c6956l.m2147try(objM2132native5);
            } else {
                abstractC13264l2 = abstractC13264l;
            }
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native5, 15), j3, c6956l, 56, 0);
            AbstractC11308l.yandex(new C9247l(1.0f, true), null, AbstractC14566l.amazon(486120167, new C8005l(abstractC13264l2, 0), c6956l), c6956l, 3072, 6);
            c6956l2 = c6956l;
            AbstractC14165l abstractC14165lCrashlytics2 = AbstractC16759l.crashlytics(R.drawable.ic_chevron_right_outline_28, 0, c6956l2);
            long j4 = ((C14370l) c6956l2.isPro(c10707l)).yandex.subscription;
            boolean zAdmob2 = c6956l2.admob(interfaceC2262l) | (i3 == 16384);
            Object objM2132native6 = c6956l2.m2132native();
            if (zAdmob2 || objM2132native6 == c13863l) {
                objM2132native6 = new C16154l(interfaceC2262l, abstractC13264l2, 5);
                c6956l2.m2147try(objM2132native6);
            }
            AbstractC4597l.loadAd(abstractC14165lCrashlytics2, null, AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native6, 15), j4, c6956l2, 56, 0);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            abstractC13264l2 = abstractC13264l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0843l(this, c15578l, function1, abstractC13264l2, interfaceC17242l, i, 5);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2872import(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(2142489105);
        int i2 = 2;
        int i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i4 = 3;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C6195l(this, i2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3383l.loadAd((Function0) objM2132native, interfaceC17242l, false, null, null, null, null, AbstractC10000l.billing, c6956l, ((i3 << 3) & 112) | 100663296, 252);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17992l(this, interfaceC17242l, i, i4);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m2873instanceof(final boolean z, final int i, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i2) {
        c6956l.m2133new(-1817365154);
        int i3 = i2 | (c6956l.mopub(z) ? 4 : 2) | (c6956l.amazon(i) ? 32 : 16) | (c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(this) ? 2048 : 1024);
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C6195l(this, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3383l.loadAd((Function0) objM2132native, interfaceC17242l, false, null, null, null, null, AbstractC14566l.amazon(241847369, new Function3() { // from class: lٍَ۠
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C6956l c6956l2 = (C6956l) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final boolean z2 = z;
                        final int i5 = i;
                        C15578l c15578lAmazon = AbstractC14566l.amazon(-37055480, new Function2() { // from class: lًَٓ
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                C6956l c6956l3 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (!c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    c6956l3.m2124else();
                                } else if (z2) {
                                    c6956l3.m2123default(-113169120);
                                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.settings_crossfade_seconds_fmt, new Object[]{Integer.valueOf(i5)}, c6956l3), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                                    c6956l3.startapp(false);
                                } else {
                                    c6956l3.m2123default(-113043105);
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, R.string.eq3_disabled), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                                    c6956l3.startapp(false);
                                }
                                return Unit.INSTANCE;
                            }
                        }, c6956l2);
                        int i6 = AbstractC15548l.yandex;
                        AbstractC13319l.yandex(AbstractC10000l.startapp, null, null, c15578lAmazon, AbstractC10000l.adcel, AbstractC10000l.subscription, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l2, 510), c6956l2, 224262, 390);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, ((i3 >> 3) & 112) | 100663296, 252);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9607l(this, z, i, interfaceC17242l, i2, 3);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1596566873);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) AbstractC16584l.crashlytics().f3605l).yandex();
            Object obj = AbstractC16584l.crashlytics().f3605l;
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-258444011, new C12893l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-844887382, new C7506l(this, AbstractC3700l.loadAd(interfaceC6942lYandex, (C4700l) ((AbstractC11904l) C7445l.f15420l.f33214l), c6956l, 0), b), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12893l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        if (C12942l.purchase) {
            m2876try(C12942l.amazon);
        }
        C12942l.billing = new C6536l(25, this);
        m2876try(C12942l.amazon);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m2874public(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(425506543);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3383l.yandex(interfaceC17242l, null, null, null, null, AbstractC14566l.amazon(-1719895455, new C1866l(this, AbstractC6363l.admob(0, 1, c6956l), 6), c6956l), c6956l, (i2 & 14) | 196608, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17992l(this, interfaceC17242l, i, i3);
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m2875this(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-1084079792);
        int i2 = 2;
        int i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        int i4 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C6195l(this, i4);
                c6956l.m2147try(objM2132native);
            }
            AbstractC3383l.loadAd((Function0) objM2132native, interfaceC17242l, false, null, null, null, null, AbstractC14566l.amazon(1648118981, new C3596l(this, i4), c6956l), c6956l, ((i3 << 3) & 112) | 100663296, 252);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17992l(this, interfaceC17242l, i, i2);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m2876try(int i) {
        Object c5242l;
        if (C12942l.crashlytics) {
            c5242l = C18052l.yandex;
        } else {
            c5242l = i > 0 ? new C5242l(i, AbstractC14205l.amazon(i, false)) : C13701l.yandex;
        }
        this.f20513l.setValue(c5242l);
    }
}
