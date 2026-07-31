package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَُۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10508l extends AbstractC16915l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17807l f21378l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f21379l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C15578l f21380l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f21381l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10508l(C18656l c18656l, InterfaceC17807l interfaceC17807l, Object obj, C15578l c15578l) {
        super(2);
        this.f21379l = c18656l;
        this.f21378l = interfaceC17807l;
        this.f21381l = obj;
        this.f21380l = c15578l;
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
        Object objMopub;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
            C0010l c0010l = AbstractC3483l.purchase;
            C18656l c18656l = this.f21379l;
            boolean zMopub = c18656l.mopub();
            C13863l c13863l = C1867l.yandex;
            if (zMopub) {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656l);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling = c6956l.billing(c18656l);
                objMopub = c6956l.m2132native();
                if (zBilling || objMopub == c13863l) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656l.crashlytics();
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
            c6956l.m2123default(1378811975);
            Object obj3 = this.f21381l;
            float f = AbstractC8576l.yandex(objMopub, obj3) ? 1.0f : 0.0f;
            c6956l.startapp(false);
            Float fValueOf = Float.valueOf(f);
            boolean zBilling2 = c6956l.billing(c18656l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling2 || objM2132native == c13863l) {
                objM2132native = AbstractC8020l.mopub(new C4011l(c18656l, 4));
                c6956l.m2147try(objM2132native);
            }
            Object value = ((InterfaceC12244l) objM2132native).getValue();
            c6956l.m2123default(1378811975);
            float f2 = AbstractC8576l.yandex(value, obj3) ? 1.0f : 0.0f;
            c6956l.startapp(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zBilling3 = c6956l.billing(c18656l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656l, 5));
                c6956l.m2147try(objM2132native2);
            }
            c6956l.m2123default(955869654);
            c6956l.startapp(false);
            C9459l c9459lBilling = AbstractC2438l.billing(c18656l, fValueOf, fValueOf2, this.f21378l, c0010l, c6956l, 0);
            boolean zBilling4 = c6956l.billing(c9459lBilling);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling4 || objM2132native3 == c13863l) {
                objM2132native3 = new C3006l(14, c9459lBilling);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(C4346l.f8873l, (Function1) objM2132native3);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.crashlytics(c6956l, Integer.valueOf(i), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            this.f21380l.invoke(obj3, c6956l, 0);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
