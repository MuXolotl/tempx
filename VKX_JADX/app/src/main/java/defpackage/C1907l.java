package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lّؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1907l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8529l f4328l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4329l;

    public /* synthetic */ C1907l(C8529l c8529l, int i) {
        this.f4329l = i;
        this.f4328l = c8529l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f4329l;
        int i2 = 3;
        final C8529l c8529l = this.f4328l;
        switch (i) {
            case 0:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC9027l.loadAd, 3);
                final int i3 = 0;
                final int i4 = 1;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-272922413, true, new Function3() { // from class: lِْؖ
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
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i5 = i3;
                        Object obj5 = C1867l.yandex;
                        C8529l c8529l2 = c8529l;
                        int i6 = 1;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                                    long j = c6956l.f14595continue;
                                    int i7 = (int) (j ^ (j >>> 32));
                                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                                    C4346l c4346l = C4346l.f8873l;
                                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                                    InterfaceC8801l.firebase.getClass();
                                    Function0 function0 = C3438l.loadAd;
                                    c6956l.m2140super();
                                    if (c6956l.f14603switch) {
                                        c6956l.firebase(function0);
                                    } else {
                                        c6956l.m2136protected();
                                    }
                                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                                    AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
                                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.android_auto_setup);
                                    AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(abstractC5189l)).loadAd.purchase, c6956l, 48, 0, 131064);
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.android_auto_setup_info), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(abstractC5189l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(abstractC5189l)).loadAd.isPro, c6956l, 48, 0, 131064);
                                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 4.0f));
                                    c8529l2.m2326import(1, R.string.android_auto_setup_one, c6956l, 6);
                                    c8529l2.m2326import(2, R.string.android_auto_setup_two, c6956l, 6);
                                    c8529l2.m2326import(3, R.string.android_auto_setup_three, c6956l, 6);
                                    c8529l2.m2326import(4, R.string.android_auto_setup_four, c6956l, 6);
                                    c8529l2.m2326import(5, R.string.android_auto_setup_five, c6956l, 6);
                                    c8529l2.m2326import(6, R.string.android_auto_setup_six, c6956l, 6);
                                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                                    C6839l c6839l = ((C14370l) c6956l.isPro(abstractC5189l)).crashlytics.crashlytics;
                                    boolean zAdmob = c6956l.admob(c8529l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == obj5) {
                                        objM2132native = new C9636l(4, c8529l2);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lStartapp, false, c6839l, null, null, null, c17253l, AbstractC9027l.crashlytics, c6956l, 817889328, 372);
                                    c6956l.startapp(true);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.startapp;
                                    boolean zAdmob2 = c6956l2.admob(c8529l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == obj5) {
                                        objM2132native2 = new C1907l(c8529l2, i6);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) objM2132native2, c6956l2, 0, 6);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC9027l.amazon, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2035748139, true, new Function3() { // from class: lِْؖ
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
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i5 = i4;
                        Object obj5 = C1867l.yandex;
                        C8529l c8529l2 = c8529l;
                        int i6 = 1;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
                                    long j = c6956l.f14595continue;
                                    int i7 = (int) (j ^ (j >>> 32));
                                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                                    C4346l c4346l = C4346l.f8873l;
                                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
                                    InterfaceC8801l.firebase.getClass();
                                    Function0 function0 = C3438l.loadAd;
                                    c6956l.m2140super();
                                    if (c6956l.f14603switch) {
                                        c6956l.firebase(function0);
                                    } else {
                                        c6956l.m2136protected();
                                    }
                                    AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
                                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
                                    AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
                                    AbstractC8182l.purchase(c6956l, C3438l.firebase);
                                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
                                    String strPurchase = AbstractC11999l.purchase(c6956l, R.string.android_auto_setup);
                                    AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(abstractC5189l)).loadAd.purchase, c6956l, 48, 0, 131064);
                                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.android_auto_setup_info), AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), ((C14370l) c6956l.isPro(abstractC5189l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(abstractC5189l)).loadAd.isPro, c6956l, 48, 0, 131064);
                                    AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 4.0f));
                                    c8529l2.m2326import(1, R.string.android_auto_setup_one, c6956l, 6);
                                    c8529l2.m2326import(2, R.string.android_auto_setup_two, c6956l, 6);
                                    c8529l2.m2326import(3, R.string.android_auto_setup_three, c6956l, 6);
                                    c8529l2.m2326import(4, R.string.android_auto_setup_four, c6956l, 6);
                                    c8529l2.m2326import(5, R.string.android_auto_setup_five, c6956l, 6);
                                    c8529l2.m2326import(6, R.string.android_auto_setup_six, c6956l, 6);
                                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                                    C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                                    C6839l c6839l = ((C14370l) c6956l.isPro(abstractC5189l)).crashlytics.crashlytics;
                                    boolean zAdmob = c6956l.admob(c8529l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == obj5) {
                                        objM2132native = new C9636l(4, c8529l2);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lStartapp, false, c6839l, null, null, null, c17253l, AbstractC9027l.crashlytics, c6956l, 817889328, 372);
                                    c6956l.startapp(true);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.startapp;
                                    boolean zAdmob2 = c6956l2.admob(c8529l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == obj5) {
                                        objM2132native2 = new C1907l(c8529l2, i6);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) objM2132native2, c6956l2, 0, 6);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                break;
            default:
                ((Boolean) obj).getClass();
                Activity activityIsVip = c8529l.isVip();
                AbstractC11708l.yandex(new Ctry(activityIsVip, new C10734l(null, activityIsVip.getString(R.string.notification), activityIsVip.getString(R.string.restart_prompt), new C8195l(activityIsVip.getString(R.string.restart_act), new C7282l(i2)), null, 241), 4));
                break;
        }
        return Unit.INSTANCE;
    }
}
