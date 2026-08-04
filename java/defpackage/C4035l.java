package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lَٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4035l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13330l f8315l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8316l = 0;

    public /* synthetic */ C4035l(C13330l c13330l) {
        this.f8315l = c13330l;
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final C13330l c13330l;
        switch (this.f8316l) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i = 0;
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 16.0f, 0.0f, 16.0f, fYandex, 2);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l, 48);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
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
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l, 196608, 31);
                    final C13330l c13330l2 = this.f8315l;
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, c13330l2.f26174l), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).purchase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, c13330l2.f26171l), AbstractC0080l.amazon(c4346l, 1.0f), AbstractC13106l.purchase(c6956l).subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    c13330l2.f26167l.invoke(c6956l, 0);
                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
                    long j2 = c6956l.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l, c6415l3, c6956l, c11192l);
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                    boolean zAdmob = c6956l.admob(c13330l2);
                    Object objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new C6335l(0, c13330l2, C13330l.class, "negativeClicked", "negativeClicked()V", 0, 0, 14);
                        c6956l.m2147try(objM2132native);
                    }
                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native;
                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    C17253l c17253l2 = C12719l.yandex;
                    C13412l c13412lYandex = C12719l.yandex(AbstractC13106l.purchase(c6956l).ads, AbstractC13106l.purchase(c6956l).adcel, 0L, 0L, c6956l, 12);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    AbstractC17457l.loadAd((Function0) interfaceC5059l, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, c13412lYandex, null, null, c17253l, AbstractC14566l.amazon(-1789092971, new Function3() { // from class: lۣٔؑ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i4 = i;
                            C13330l c13330l3 = c13330l2;
                            switch (i4) {
                                case 0:
                                    C6956l c6956l2 = (C6956l) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c13330l3.f26169l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l3 = (C6956l) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c13330l3.f26168l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                                    } else {
                                        c6956l3.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l), c6956l, 817889280, 356);
                    boolean zAdmob2 = c6956l.admob(c13330l2);
                    Object objM2132native2 = c6956l.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        c13330l = c13330l2;
                        objM2132native2 = new C6335l(0, c13330l, C13330l.class, "positiveClicked", "positiveClicked()V", 0, 0, 15);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        c13330l = c13330l2;
                    }
                    InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) objM2132native2;
                    C17253l c17253l3 = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                    if (1.0f <= 0.0d) {
                        AbstractC10440l.yandex("invalid weight; must be greater than zero");
                    }
                    final int i4 = 1;
                    AbstractC17457l.loadAd((Function0) interfaceC5059l2, new C9247l(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC13106l.billing(c6956l).crashlytics, null, null, null, c17253l3, AbstractC14566l.amazon(-1413674484, new Function3() { // from class: lۣٔؑ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i5 = i4;
                            C13330l c13330l3 = c13330l;
                            switch (i5) {
                                case 0:
                                    C6956l c6956l2 = (C6956l) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, c13330l3.f26169l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l3 = (C6956l) obj4;
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l3, c13330l3.f26168l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                                    } else {
                                        c6956l3.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, c6956l), c6956l, 817889280, 372);
                    c6956l.startapp(true);
                    c6956l.startapp(true);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                this.f8315l.license((C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C4035l(C13330l c13330l, int i) {
        this.f8315l = c13330l;
    }
}
