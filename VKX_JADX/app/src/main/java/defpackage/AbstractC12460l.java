package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lًّۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12460l {
    public static final int[] yandex = {23, 66, 160};
    public static final C8540l loadAd = new C8540l(new C5146l(28));

    public static final long loadAd(long j, float f, C6956l c6956l) {
        C10707l c10707l = AbstractC10689l.yandex;
        if (!C9735l.crashlytics(j, ((C10936l) c6956l.isPro(c10707l)).subs())) {
            c6956l.m2123default(117637169);
            c6956l.startapp(false);
            return j;
        }
        c6956l.m2123default(117557530);
        C10936l c10936l = (C10936l) c6956l.isPro(c10707l);
        long jSubs = C14467l.loadAd(f, 0.0f) ? c10936l.subs() : AbstractC12953l.firebase(C9735l.loadAd(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, ((C9735l) c10936l.tapsense.getValue()).yandex), c10936l.subs());
        c6956l.startapp(false);
        return jSubs;
    }

    public static final void yandex(final InterfaceC17242l interfaceC17242l, final boolean z, final boolean z2, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final float f, final C2209l c2209l, final C4442l c4442l, final C2403l c2403l, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        InterfaceC6347l interfaceC6347l2;
        long j3;
        int i4;
        C15578l c15578l2;
        C6956l c6956l2;
        C2403l c2403l2;
        c6956l.m2133new(-813380697);
        if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = (c6956l.billing(interfaceC17242l2) ? 4 : 2) | i;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.mopub(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.mopub(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            interfaceC6347l2 = interfaceC6347l;
            i3 |= c6956l.billing(interfaceC6347l2) ? 2048 : 1024;
        } else {
            interfaceC6347l2 = interfaceC6347l;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i3 |= c6956l.purchase(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.purchase(j2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.crashlytics(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.billing(c2209l) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.billing(c4442l) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c6956l.crashlytics(0.0f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.billing(c2403l) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            c15578l2 = c15578l;
            i4 |= c6956l.admob(c15578l2) ? 32 : 16;
        } else {
            c15578l2 = c15578l;
        }
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (c2403l == null) {
                c6956l.m2123default(781552596);
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = AbstractC14814l.isPro(c6956l);
                }
                c2403l2 = (C2403l) objM2132native;
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(25210723);
                c6956l.startapp(false);
                c2403l2 = c2403l;
            }
            final InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l2, c6956l, 0);
            InterfaceC8714l interfaceC8714lCrashlytics = C10053l.crashlytics(c2403l2, c6956l, 0);
            boolean zBooleanValue = ((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) interfaceC8714lCrashlytics.getValue()).booleanValue();
            float f2 = 0.8f;
            if ((z2 || !zBooleanValue2) && ((z2 || !zBooleanValue) && (z2 || !z))) {
                f2 = z2 ? 1.0f : 0.6f;
            }
            C8540l c8540l = loadAd;
            c6956l2 = c6956l;
            final InterfaceC17242l interfaceC17242l3 = interfaceC17242l2;
            final InterfaceC6347l interfaceC6347l3 = interfaceC6347l2;
            final long j4 = j3;
            final float f3 = f2;
            final C15578l c15578l3 = c15578l2;
            final C2403l c2403l3 = c2403l2;
            AbstractC10478l.loadAd(new C10092l[]{AbstractC5020l.startapp(j2, AbstractC1017l.yandex), c8540l.yandex(new C14467l(((C14467l) c6956l.isPro(c8540l)).f28331l + 0.0f))}, AbstractC14566l.amazon(-1992904601, new Function2() { // from class: lٕؔۖ
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
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l3 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = 2;
                    if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(((Boolean) interfaceC8714lLoadAd.getValue()).booleanValue() ? 0.5f : 0.0f, null, "zIndex", null, c6956l3, 3072, 22);
                        long jLoadAd = AbstractC12460l.loadAd(j4, ((C14467l) c6956l3.isPro(AbstractC12460l.loadAd)).f28331l, c6956l3);
                        InterfaceC12553l interfaceC12553l = (InterfaceC12553l) AbstractC8020l.loadAd(c2403l3.yandex, new C7008l(), c6956l3, 0).getValue();
                        int i6 = 300;
                        if (!(interfaceC12553l instanceof C7008l)) {
                            if (interfaceC12553l instanceof C17768l) {
                                i6 = 500;
                            } else if (interfaceC12553l instanceof C12951l) {
                                i6 = 120;
                            }
                        }
                        InterfaceC12244l interfaceC12244lLoadAd2 = AbstractC16245l.loadAd(f, AbstractC0532l.subs(i6, 2, AbstractC16373l.yandex), "tv-surface-scale", null, c6956l3, 3072, 20);
                        float fFloatValue = ((Number) interfaceC12244lLoadAd2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) interfaceC12244lLoadAd2.getValue()).floatValue();
                        long j5 = C1723l.loadAd;
                        long j6 = AbstractC4239l.yandex;
                        InterfaceC17242l interfaceC17242lPremium = interfaceC17242l3.premium(new C4929l(fFloatValue, fFloatValue2, 1.0f, 0.0f, 0.0f, j5, AbstractC16837l.yandex, false, j6, j6, 0, C2068l.yandex));
                        boolean z3 = license.yandex;
                        long jLoadAd2 = AbstractC12460l.loadAd(c4442l.yandex, 0.0f, c6956l3);
                        float fMo868instanceof = ((InterfaceC13490l) c6956l3.isPro(AbstractC4751l.admob)).mo868instanceof(0.0f);
                        InterfaceC6347l interfaceC6347l4 = interfaceC6347l3;
                        InterfaceC17242l interfaceC17242lPremium2 = AbstractC17002l.crashlytics(interfaceC17242lPremium, z3, new C9584l(interfaceC6347l4, fMo868instanceof, jLoadAd2)).premium(new C15924l(((Number) interfaceC12244lLoadAd.getValue()).floatValue()));
                        C2209l c2209l2 = C2209l.crashlytics;
                        C2209l c2209l3 = c2209l;
                        InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC17002l.crashlytics(interfaceC17242lPremium2, !AbstractC8576l.yandex(c2209l3, c2209l2), new C1449l(interfaceC6347l4, c2209l3)), jLoadAd, interfaceC6347l4);
                        float f4 = f3;
                        boolean zCrashlytics = c6956l3.crashlytics(f4) | c6956l3.billing(interfaceC6347l4);
                        Object objM2132native2 = c6956l3.m2132native();
                        C13863l c13863l = C1867l.yandex;
                        if (zCrashlytics || objM2132native2 == c13863l) {
                            objM2132native2 = new C5724l(f4, interfaceC6347l4, i5);
                            c6956l3.m2147try(objM2132native2);
                        }
                        InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(interfaceC17242lAmazon, (Function1) objM2132native2);
                        C14855l c14855l = C18450l.f36026l;
                        InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, true);
                        long j7 = c6956l3.f14595continue;
                        int i7 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lLoadAd);
                        InterfaceC8801l.firebase.getClass();
                        C16395l c16395l = C3438l.loadAd;
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l);
                        } else {
                            c6956l3.m2136protected();
                        }
                        C6415l c6415l = C3438l.mopub;
                        AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, c6415l);
                        C6415l c6415l2 = C3438l.billing;
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, c6415l2);
                        Integer numValueOf = Integer.valueOf(i7);
                        C6415l c6415l3 = C3438l.isPro;
                        AbstractC8182l.crashlytics(c6956l3, numValueOf, c6415l3);
                        C11192l c11192l = C3438l.firebase;
                        AbstractC8182l.purchase(c6956l3, c11192l);
                        C6415l c6415l4 = C3438l.amazon;
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, c6415l4);
                        boolean z4 = z2;
                        boolean zMopub = c6956l3.mopub(z4);
                        Object objM2132native3 = c6956l3.m2132native();
                        if (zMopub || objM2132native3 == c13863l) {
                            objM2132native3 = new C13816l(z4, 4);
                            c6956l3.m2147try(objM2132native3);
                        }
                        InterfaceC17242l interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(C4346l.f8873l, (Function1) objM2132native3);
                        InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                        long j8 = c6956l3.f14595continue;
                        int i8 = (int) (j8 ^ (j8 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato2 = c6956l3.smaato();
                        InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l3, interfaceC17242lLoadAd2);
                        c6956l3.m2140super();
                        if (c6956l3.f14603switch) {
                            c6956l3.firebase(c16395l);
                        } else {
                            c6956l3.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon2, c6415l);
                        AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato2, c6415l2);
                        AbstractC8182l.crashlytics(c6956l3, Integer.valueOf(i8), c6415l3);
                        AbstractC8182l.purchase(c6956l3, c11192l);
                        AbstractC8182l.billing(c6956l3, interfaceC17242lBilling2, c6415l4);
                        c15578l3.invoke(C16170l.yandex, c6956l3, 6);
                        c6956l3.startapp(true);
                        c6956l3.startapp(true);
                    } else {
                        c6956l3.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l2), c6956l2, 56);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؔؐۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC12460l.yandex(interfaceC17242l, z, z2, interfaceC6347l, j, j2, f, c2209l, c4442l, c2403l, c15578l, (C6956l) obj, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
