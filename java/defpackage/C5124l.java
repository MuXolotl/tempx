package defpackage;

import android.graphics.Color;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؗۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5124l extends AbstractC10581l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f11154l = AbstractC8020l.smaato(C8553l.yandex);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f11158l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f11155l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f11156l = AbstractC8020l.smaato(EnumC12334l.f24418l);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f11157l = AbstractC8020l.smaato(Boolean.FALSE);

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final Object m1691protected(C5124l c5124l, AbstractC0283l abstractC0283l) {
        C15609l c15609l;
        C5124l c5124l2;
        Throwable th;
        Object c4573l;
        c5124l.getClass();
        C10086l c10086l = c5124l.f11154l;
        if (abstractC0283l instanceof C15609l) {
            c15609l = (C15609l) abstractC0283l;
            int i = c15609l.f30466l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15609l.f30466l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15609l = new C15609l(c5124l, abstractC0283l);
            }
        } else {
            c15609l = new C15609l(c5124l, abstractC0283l);
        }
        Object obj = c15609l.f30469l;
        int i2 = c15609l.f30466l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c10086l.setValue(new C13619l((InterfaceC11666l) c10086l.getValue()));
                c15609l.f30468l = c5124l;
                c15609l.f30467l = c5124l;
                c15609l.f30466l = 1;
                Object objM1700return = c5124l.m1700return(c15609l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM1700return == enumC9342l) {
                    return enumC9342l;
                }
                c5124l2 = c5124l;
            } catch (Throwable th2) {
                c5124l2 = c5124l;
                th = th2;
                c4573l = new C4573l(th);
                c5124l = c5124l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5124l = c15609l.f30467l;
            c5124l2 = c15609l.f30468l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c4573l = new C4573l(th);
                c5124l = c5124l2;
            }
        }
        c4573l = C4149l.yandex;
        c5124l.f11154l.setValue(c4573l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final Object m1692transient(C5124l c5124l, AbstractC0283l abstractC0283l) {
        C2919l c2919l;
        C5124l c5124l2;
        Throwable th;
        Object c4573l;
        if (abstractC0283l instanceof C2919l) {
            c2919l = (C2919l) abstractC0283l;
            int i = c2919l.f6355l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2919l.f6355l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2919l = new C2919l(c5124l, abstractC0283l);
            }
        } else {
            c2919l = new C2919l(c5124l, abstractC0283l);
        }
        Object obj = c2919l.f6358l;
        int i2 = c2919l.f6355l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c5124l.f11154l.setValue(C12943l.yandex);
                c2919l.f6357l = c5124l;
                c2919l.f6356l = c5124l;
                c2919l.f6355l = 1;
                Object objM1700return = c5124l.m1700return(c2919l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM1700return == enumC9342l) {
                    return enumC9342l;
                }
                c5124l2 = c5124l;
            } catch (Throwable th2) {
                c5124l2 = c5124l;
                th = th2;
                c4573l = new C4573l(th);
                c5124l = c5124l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5124l = c2919l.f6356l;
            c5124l2 = c2919l.f6357l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c4573l = new C4573l(th);
                c5124l = c5124l2;
            }
        }
        c4573l = C4149l.yandex;
        c5124l.f11154l.setValue(c4573l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m1693break(EnumC12334l enumC12334l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        EnumC12334l enumC12334l2;
        C5124l c5124l;
        String strMopub;
        boolean z;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(349165413);
        int i2 = i | (c6956l2.amazon(enumC12334l.ordinal()) ? 4 : 2) | (c6956l2.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l2);
            InterfaceC17817l interfaceC17817lM2932import = m2932import();
            EnumC11447l enumC11447lM2931abstract = m2931abstract();
            C8195l c8195lM1696implements = m1696implements();
            boolean zBilling = ((i2 & 14) == 4) | c6956l2.billing(interfaceC17817lM2932import) | c6956l2.amazon(enumC11447lM2931abstract.ordinal()) | c6956l2.billing(c8195lM1696implements != null ? new C8428l(c8195lM1696implements) : null);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                int iOrdinal = enumC12334l.ordinal();
                objM2132native = C13284l.yandex;
                C11401l c11401l = C11401l.yandex;
                EnumC11447l enumC11447l = EnumC11447l.f23031l;
                C15321l c15321l = C15321l.yandex;
                EnumC11447l enumC11447l2 = EnumC11447l.f23032l;
                C17079l c17079l = C17079l.yandex;
                if (iOrdinal == 0) {
                    InterfaceC17817l interfaceC17817lM2932import2 = m2932import();
                    C3086l c3086l = interfaceC17817lM2932import2 instanceof C3086l ? (C3086l) interfaceC17817lM2932import2 : null;
                    boolean zYandex = AbstractC8576l.yandex(c3086l != null ? c3086l.billing : null, "common");
                    if (m1696implements() != null) {
                        C8195l c8195lM1696implements2 = m1696implements();
                        if ((c8195lM1696implements2 != null ? (AbstractC0301l) c8195lM1696implements2.f17098l : null) == null) {
                            objM2132native = c17079l;
                        }
                    }
                    if (zYandex && m2931abstract() == enumC11447l2) {
                        objM2132native = c15321l;
                    } else if (zYandex && m2931abstract() == enumC11447l) {
                        objM2132native = c11401l;
                    }
                } else {
                    if (iOrdinal != 1) {
                        C18725l.billing();
                        return;
                    }
                    InterfaceC17817l interfaceC17817lM2932import3 = m2932import();
                    C16022l c16022l = interfaceC17817lM2932import3 instanceof C16022l ? (C16022l) interfaceC17817lM2932import3 : null;
                    boolean z2 = (c16022l != null ? c16022l.yandex : null) instanceof C6435l;
                    C8195l c8195lM1696implements3 = m1696implements();
                    if ((c8195lM1696implements3 != null ? (AbstractC0301l) c8195lM1696implements3.f17098l : null) instanceof C6435l) {
                        objM2132native = c17079l;
                    } else if (z2 && m2931abstract() == enumC11447l2) {
                        objM2132native = c15321l;
                    } else if (z2 && m2931abstract() == enumC11447l) {
                        objM2132native = c11401l;
                    }
                }
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC11666l interfaceC11666l = (InterfaceC11666l) objM2132native;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C4346l c4346l = C4346l.f8873l;
            AbstractC10565l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l2, 6);
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(c4346l, 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C0086l c0086l = C18450l.f36040l;
            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native2 = c6956l2.m2132native();
            int i5 = 3;
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C6599l(this, i5);
                c6956l2.m2147try(objM2132native2);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native2, 15);
            C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, c0086l, c6956l2, 54);
            long j3 = c6956l2.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            int iOrdinal2 = enumC12334l.ordinal();
            if (iOrdinal2 == 0) {
                strMopub = AbstractC12900l.mopub(c6956l2, -2121351148, R.string.uma_header_mix_type_vk, c6956l2, false);
            } else {
                if (iOrdinal2 != 1) {
                    throw AbstractC12900l.billing(-2121352766, c6956l2, false);
                }
                strMopub = AbstractC12900l.mopub(c6956l2, -2121348235, R.string.uma_header_mix_type_uma, c6956l2, false);
            }
            String str = strMopub;
            AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).adcel, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l2).amazon, c6956l, 14155776, 0, 129850);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_chevron_down_24, 0, c6956l), null, AbstractC0080l.isPro(c4346l, 24.0f), AbstractC13106l.purchase(c6956l).subscription, c6956l, 440, 0);
            c6956l.startapp(true);
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.uma_radio_vkmix_desc), null, AbstractC13106l.purchase(c6956l).subscription, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), AbstractC7039l.isPro(18), 0, false, 0, 0, null, c6956l, 24576, 48, 259050);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l, c6956l, 54);
            long j4 = c6956l.f14595continue;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                z = false;
                C6814l c6814l = new C6814l(0, this, C5124l.class, "playPersonalRadio", "playPersonalRadio()V", 0, 0, 16);
                c6956l.m2147try(c6814l);
                objM2132native3 = c6814l;
            } else {
                z = false;
            }
            C6839l c6839lYandex = AbstractC7497l.yandex(8.0f);
            C17253l c17253l = C12719l.yandex;
            c5124l = this;
            AbstractC17457l.loadAd((Function0) ((InterfaceC5059l) objM2132native3), null, false, c6839lYandex, C12719l.yandex(C9735l.loadAd(0.25f, AbstractC13106l.purchase(c6956l).adcel), AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12), null, null, new C17253l(0.0f, 0.0f, 0.0f, 0.0f), AbstractC14566l.amazon(827380396, new C1866l(interfaceC11666l, iAdmob, 10), c6956l), c6956l, 817889280, 358);
            c6956l2 = c6956l;
            enumC12334l2 = enumC12334l;
            if (enumC12334l2 == EnumC12334l.f24418l) {
                c6956l2.m2123default(-501979772);
                C6839l c6839lYandex2 = AbstractC7497l.yandex(8.0f);
                C17076l c17076lIsVip = AbstractC12442l.isVip(AbstractC13106l.purchase(c6956l2).adcel, c6956l2);
                boolean zAdmob3 = c6956l2.admob(c5124l);
                Object objM2132native4 = c6956l2.m2132native();
                if (zAdmob3 || objM2132native4 == c13863l) {
                    objM2132native4 = new C6599l(c5124l, 5);
                    c6956l2.m2147try(objM2132native4);
                }
                AbstractC7470l.billing((Function0) objM2132native4, null, false, c17076lIsVip, null, c6839lYandex2, AbstractC17943l.isPro, c6956l2, 1572864, 22);
            } else {
                c6956l2.m2123default(-527741082);
            }
            c6956l2.startapp(z);
            AbstractC12900l.ads(c6956l2, true, r11, r11);
        } else {
            enumC12334l2 = enumC12334l;
            c5124l = this;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3411l(c5124l, enumC12334l2, interfaceC17242l, i, 16);
        }
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public final C8195l m1694const() {
        C16302l c16302l = (C16302l) this.f11158l.getValue();
        if (c16302l != null) {
            return c16302l.yandex;
        }
        return null;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m1695finally(C6956l c6956l, int i) {
        c6956l.m2133new(-373966898);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C6599l(this, i4);
                c6956l.m2147try(objM2132native);
            }
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC2426l.crashlytics((Function0) objM2132native, null, null, 0.0f, false, null, ((C14370l) c6956l.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, null, AbstractC14566l.amazon(-507864020, new C0455l(this, i3), c6956l), c6956l, 0, 7998);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8211l(this, i, 1);
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final C8195l m1696implements() {
        C8428l c8428l = (C8428l) this.f11155l.getValue();
        if (c8428l != null) {
            return c8428l.yandex;
        }
        return null;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final void m1697l(C8195l c8195l) {
        this.f11155l.setValue(c8195l != null ? new C8428l(c8195l) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final void m1698l(AbstractC0301l abstractC0301l) {
        C8195l c8195lM1696implements = m1696implements();
        C16076l c16076l = 0;
        if (c8195lM1696implements != null) {
            ((InterfaceC7042l) c8195lM1696implements.f17097l).ads(null);
            m1697l(null);
        }
        InterfaceC17817l interfaceC17817lM2932import = m2932import();
        C16022l c16022l = interfaceC17817lM2932import instanceof C16022l ? (C16022l) interfaceC17817lM2932import : null;
        if (!AbstractC8576l.yandex(c16022l != null ? c16022l.yandex : null, abstractC0301l)) {
            m1697l(new C8195l(abstractC0301l, AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C15352l(abstractC0301l, this, c16076l, 25), 3)));
            Unit unit = Unit.INSTANCE;
            return;
        }
        C16076l c16076l2 = VKXApplication.f36632l;
        if (c16076l2 == null) {
            c16076l2 = null;
        }
        if (c16076l2.purchase() == EnumC11447l.f23032l) {
            C16076l c16076l3 = VKXApplication.f36632l;
            (c16076l3 != null ? c16076l3 : null).isPro();
        } else {
            C16076l c16076l4 = VKXApplication.f36632l;
            (c16076l4 != null ? c16076l4 : 0).smaato();
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        C5124l c5124l = this;
        c6956l.m2133new(1798113995);
        int i2 = i | (c6956l.admob(c5124l) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C2663l c2663lPurchase = AbstractC0831l.purchase(c6956l);
            boolean z = ((InterfaceC11666l) c5124l.f11154l.getValue()) instanceof C13619l;
            boolean zAdmob = c6956l.admob(c5124l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                C6814l c6814l = new C6814l(0, this, C5124l.class, "dispatchRefresh", "dispatchRefresh()V", 0, 0, 15);
                c5124l = this;
                c6956l.m2147try(c6814l);
                objM2132native = c6814l;
            }
            C7473l c7473lRemoteconfig = AbstractC14289l.remoteconfig(z, (Function0) ((InterfaceC5059l) objM2132native), c6956l);
            if (((Boolean) c5124l.f11157l.getValue()).booleanValue()) {
                c6956l.m2123default(782287628);
                c5124l.m1695finally(c6956l, i2 & 14);
            } else {
                c6956l.m2123default(775904759);
            }
            c6956l.startapp(false);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1290681201, new C1645l(27, c2663lPurchase), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1400083738, new C2346l(c5124l, c2663lPurchase, c7473lRemoteconfig, z, 3), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8211l(this, i, 0);
        }
    }

    @Override // defpackage.AbstractC10581l, defpackage.AbstractC17777l
    public final void premium() {
        super.premium();
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C2621l(this, null, 0), 3);
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m1699public(int i, int i2, C6956l c6956l) {
        c6956l.m2133new(869832245);
        int i3 = (c6956l.amazon(i) ? 4 : 2) | i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, i), AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2), C9735l.loadAd(0.7f, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 48, 0, 262136);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(this, i, i2, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: return, reason: not valid java name */
    public final Object m1700return(AbstractC0283l abstractC0283l) {
        C13607l c13607l;
        Serializable serializableIsPro;
        if (abstractC0283l instanceof C13607l) {
            c13607l = (C13607l) abstractC0283l;
            int i = c13607l.f26638l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13607l.f26638l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13607l = new C13607l(this, abstractC0283l);
            }
        } else {
            c13607l = new C13607l(this, abstractC0283l);
        }
        Object obj = c13607l.f26639l;
        int i2 = c13607l.f26638l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C6928l c6928l = C6928l.f14502l;
            c13607l.f26640l = this;
            c13607l.f26638l = 1;
            serializableIsPro = c6928l.isPro(false, c13607l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (serializableIsPro == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c13607l.f26640l;
            AbstractC2829l.crashlytics(obj);
            serializableIsPro = ((C16302l) obj).yandex;
        }
        C8195l c8195l = (C8195l) serializableIsPro;
        this.f11158l.setValue(c8195l != null ? new C16302l(c8195l) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m1701this(Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(1703990280);
        int i2 = (c6956l.admob(function1) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC16336l.loadAd(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), null, AbstractC3605l.loadAd(16.0f, 0.0f, 2), new C7537l(8.0f, true, new C8339l(12)), null, null, false, null, function1, c6956l, ((i2 << 27) & 1879048192) | 24966, 490);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(this, function1, i, 9);
        }
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m1702try(String str, final String str2, final String str3, final String str4, final AbstractC0301l abstractC0301l, C6956l c6956l, int i) {
        Object c18435l;
        C9735l c9735l;
        long jMopub;
        Object obj;
        c6956l.m2133new(1586732165);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(str2) ? 32 : 16) | (c6956l.billing(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(str4) ? 2048 : 1024) | (c6956l.billing(abstractC0301l) ? 16384 : 8192) | (c6956l.admob(this) ? 131072 : 65536);
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            final int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            if (str != null) {
                try {
                    c18435l = new C9735l(AbstractC12953l.loadAd(Color.parseColor(str)));
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                if (c18435l instanceof C18435l) {
                    c18435l = null;
                }
                c9735l = (C9735l) c18435l;
            } else {
                c9735l = null;
            }
            if (c9735l == null) {
                c6956l.m2123default(136233954);
                jMopub = AbstractC15038l.mopub(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex, 1.0f);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(136229366);
                c6956l.startapp(false);
                jMopub = c9735l.yandex;
            }
            InterfaceC17817l interfaceC17817lM2932import = m2932import();
            EnumC11447l enumC11447lM2931abstract = m2931abstract();
            C8195l c8195lM1696implements = m1696implements();
            boolean zBilling = c6956l.billing(interfaceC17817lM2932import) | c6956l.amazon(enumC11447lM2931abstract.ordinal()) | c6956l.billing(c8195lM1696implements != null ? new C8428l(c8195lM1696implements) : null);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                InterfaceC17817l interfaceC17817lM2932import2 = m2932import();
                C16022l c16022l = interfaceC17817lM2932import2 instanceof C16022l ? (C16022l) interfaceC17817lM2932import2 : null;
                boolean zYandex = AbstractC8576l.yandex(c16022l != null ? c16022l.yandex : null, abstractC0301l);
                C8195l c8195lM1696implements2 = m1696implements();
                if (AbstractC8576l.yandex(c8195lM1696implements2 != null ? (AbstractC0301l) c8195lM1696implements2.f17098l : null, abstractC0301l)) {
                    obj = C17079l.yandex;
                } else if (zYandex && m2931abstract() == EnumC11447l.f23032l) {
                    obj = C15321l.yandex;
                } else {
                    obj = (zYandex && m2931abstract() == EnumC11447l.f23031l) ? C11401l.yandex : C13284l.yandex;
                }
                objM2132native = obj;
                c6956l.m2147try(objM2132native);
            }
            final InterfaceC11666l interfaceC11666l = (InterfaceC11666l) objM2132native;
            final long j = jMopub;
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(1261672787, new Function3() { // from class: lٌؑۛ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    C6956l c6956l2 = (C6956l) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                        C4346l c4346l = C4346l.f8873l;
                        InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(AbstractC0080l.vip(c4346l, 240.0f), 180.0f);
                        long j2 = j;
                        boolean zPurchase = c6956l2.purchase(j2);
                        Object objM2132native2 = c6956l2.m2132native();
                        C13863l c13863l = C1867l.yandex;
                        if (zPurchase || objM2132native2 == c13863l) {
                            objM2132native2 = new C4199l(j2, 10);
                            c6956l2.m2147try(objM2132native2);
                        }
                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC14289l.isPro(interfaceC17242lPurchase, (Function1) objM2132native2), 16.0f);
                        C14855l c14855l = C18450l.f36026l;
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
                        long j3 = c6956l2.f14595continue;
                        int i3 = (int) (j3 ^ (j3 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
                        Integer numValueOf = Integer.valueOf(i3);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l2, c11192l);
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
                        C6839l c6839l = AbstractC7497l.yandex;
                        InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, c6839l), 64.0f);
                        C16170l c16170l = C16170l.yandex;
                        AbstractC7741l.amazon(str2, null, c16170l.yandex(interfaceC17242lIsPro, c14855l), C4176l.yandex, null, c6956l2, 1572912, 1976);
                        C5124l c5124l = this;
                        boolean zAdmob = c6956l2.admob(c5124l);
                        AbstractC0301l abstractC0301l2 = abstractC0301l;
                        boolean zBilling2 = zAdmob | c6956l2.billing(abstractC0301l2);
                        Object objM2132native3 = c6956l2.m2132native();
                        if (zBilling2 || objM2132native3 == c13863l) {
                            objM2132native3 = new C5514l(c5124l, abstractC0301l2, 9);
                            c6956l2.m2147try(objM2132native3);
                        }
                        InterfaceC17242l interfaceC17242lYandex = c16170l.yandex(c4346l, C18450l.f36036l);
                        long j4 = C9735l.purchase;
                        AbstractC11184l.crashlytics((Function0) objM2132native3, interfaceC17242lYandex, c6839l, j4, C9735l.loadAd, null, AbstractC14566l.amazon(1237153514, new C1674l(interfaceC11666l, iAdmob, 18), c6956l2), c6956l2, 12610560);
                        InterfaceC17242l interfaceC17242lYandex2 = c16170l.yandex(c4346l, C18450l.f36021l);
                        C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                        long j5 = c6956l2.f14595continue;
                        int i4 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lYandex2);
                        c6956l2.m2140super();
                        if (c6956l2.f14603switch) {
                            c6956l2.firebase(c16395l);
                        } else {
                            c6956l2.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                        AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                        AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                        AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                        C10707l c10707l = AbstractC16964l.yandex;
                        C11090l c11090l = ((C14370l) c6956l2.isPro(c10707l)).loadAd.isPro;
                        AbstractC13010l.loadAd(str3, null, j4, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 0, false, 1, 0, c11090l, c6956l2, 14156160, 24576, 114490);
                        AbstractC13010l.loadAd(str4, null, C9735l.loadAd(0.7f, j4), 0L, null, null, null, 0L, null, 0L, 0, false, 2, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, c6956l2, 384, 24576, 114682);
                        c6956l2.startapp(true);
                        c6956l2.startapp(true);
                    } else {
                        c6956l2.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), c6956l, 196608, 31);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8088l(this, str, str2, str3, str4, abstractC0301l, i, 7);
        }
    }
}
