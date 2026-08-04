package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8985l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f18532l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18533l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18534l;

    public /* synthetic */ C8985l(Object obj, boolean z, int i) {
        this.f18534l = i;
        this.f18532l = obj;
        this.f18533l = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.f18534l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        boolean z = this.f18533l;
        int i2 = 1;
        Object obj4 = this.f18532l;
        boolean z2 = false;
        switch (i) {
            case 0:
                C4587l c4587l = (C4587l) obj4;
                InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
                }
                if (!c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    c6956l.m2124else();
                } else if (c4587l.crashlytics != null) {
                    c6956l.m2123default(345562349);
                    AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(522963892, new C15707l(12, c4587l), c6956l), AbstractC14566l.amazon(102844947, new C7371l(c4587l, z, 3), c6956l), c6956l, (iIntValue & 14) | 432);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(346904029);
                    AbstractC0133l.purchase(c4587l.loadAd, null, 0L, 0L, interfaceC15451l.yandex(c4346l, 1.0f, true), c6956l, 48, 12);
                    c6956l.startapp(false);
                }
                return Unit.INSTANCE;
            case 1:
                C4456l c4456l = (C4456l) obj4;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (z) {
                        c6956l2.m2123default(-1272428838);
                        boolean zAdmob = c6956l2.admob(c4456l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            objM2132native = new C3871l(c4456l, 0);
                            c6956l2.m2147try(objM2132native);
                        }
                        Function0 function0 = (Function0) objM2132native;
                        if (c4456l.f9075l.yandex()) {
                            c6956l2.m2123default(-1272175320);
                            j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.yandex;
                            c6956l2.startapp(false);
                        } else {
                            c6956l2.m2123default(-1272065146);
                            j = ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel;
                            c6956l2.startapp(false);
                        }
                        AbstractC7470l.billing(function0, null, false, AbstractC12442l.isVip(j, c6956l2), null, null, AbstractC14566l.amazon(-555983464, new C4625l(c4456l, z2 ? 1 : 0), c6956l2), c6956l2, 1572864, 54);
                    } else {
                        c6956l2.m2123default(-1289520719);
                    }
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function1 = (Function1) obj4;
                C6956l c6956l3 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(c4346l, 20.0f, 14.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l3, 0);
                    long j2 = c6956l3.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lRemoteconfig);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c5062lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    boolean z3 = this.f18533l;
                    String strPurchase = AbstractC11999l.purchase(c6956l3, z3 ? R.string.eq3_enabled : R.string.eq3_disabled);
                    C10707l c10707l = AbstractC16964l.yandex;
                    long j3 = ((C14370l) c6956l3.isPro(c10707l)).yandex.license;
                    long jIsPro = AbstractC7039l.isPro(20);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 0.85f);
                    C0086l c0086l = C18450l.f36040l;
                    AbstractC13010l.loadAd(strPurchase, interfaceC17242lAmazon.premium(new C13820l(c0086l)), j3, jIsPro, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 24576, 0, 262120);
                    long jLoadAd = C9735l.loadAd(0.5f, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp);
                    long j4 = ((C14370l) c6956l3.isPro(c10707l)).yandex.yandex;
                    long j5 = C9735l.isPro;
                    C17290l c17290l = new C17290l(j4, jLoadAd, j5, AbstractC15038l.purchase(c6956l3, 11), AbstractC15038l.purchase(c6956l3, 24), AbstractC15038l.purchase(c6956l3, 39), AbstractC15038l.purchase(c6956l3, 24), AbstractC15038l.purchase(c6956l3, 39), AbstractC12953l.firebase(C9735l.loadAd(1.0f, AbstractC15038l.purchase(c6956l3, 35)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.purchase(c6956l3, 18)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), j5, AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l3, 18)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l3, 18)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.purchase(c6956l3, 39)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), AbstractC12953l.firebase(C9735l.loadAd(0.12f, AbstractC15038l.purchase(c6956l3, 18)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp), AbstractC12953l.firebase(C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l3, 39)), ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp));
                    InterfaceC17242l interfaceC17242lPremium = AbstractC0080l.amazon(c4346l, 1.0f).premium(new C13820l(c0086l));
                    boolean zBilling = c6956l3.billing(function1);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zBilling || objM2132native2 == c13863l) {
                        objM2132native2 = new C0786l(6, function1);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC2021l.yandex(z3, (Function1) objM2132native2, interfaceC17242lPremium, false, c17290l, c6956l3, 0, 88);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C10507l c10507l = (C10507l) obj4;
                InterfaceC15451l interfaceC15451l2 = (InterfaceC15451l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l4.billing(interfaceC15451l2) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    AbstractC0133l.loadAd(interfaceC15451l2, AbstractC14566l.amazon(1112844838, new C7897l(c10507l, i2), c6956l4), AbstractC14566l.amazon(1771227717, new C7371l(z, c10507l, 9), c6956l4), c6956l4, (iIntValue4 & 14) | 432);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C7806l c7806l = (C7806l) obj4;
                InterfaceC4277l interfaceC4277l = (InterfaceC4277l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c6956l5.billing(interfaceC4277l) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    C3856l.yandex.yandex(c7806l, this.f18533l, interfaceC4277l.yandex(c4346l, C18450l.f36017l), 0L, 0L, 0.0f, c6956l5, 1572864);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            default:
                AbstractC10113l abstractC10113lAdcel = ((InterfaceC6357l) obj2).adcel(((C15519l) obj3).yandex);
                return ((InterfaceC7448l) obj).isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C3533l((InterfaceC12244l) obj4, z, abstractC10113lAdcel));
        }
    }

    public /* synthetic */ C8985l(boolean z, Object obj, int i) {
        this.f18534l = i;
        this.f18533l = z;
        this.f18532l = obj;
    }
}
