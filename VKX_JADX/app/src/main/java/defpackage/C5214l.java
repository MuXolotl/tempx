package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؗۡۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5214l implements Function3 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13157l f11293l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11294l;

    public /* synthetic */ C5214l(C13157l c13157l, int i) {
        this.f11294l = i;
        this.f11293l = c13157l;
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
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6956l c6956l;
        Object obj4;
        Object obj5;
        Object obj6;
        int i = this.f11294l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        C13157l c13157l = this.f11293l;
        int i2 = 1;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (((EnumC4948l) c13157l.f25771l.getValue()) == EnumC4948l.f10080l) {
                        c6956l2.m2123default(1816553573);
                        boolean zAdmob = c6956l2.admob(c13157l);
                        Object objM2132native = c6956l2.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            obj4 = objM2132native;
                            C4217l c4217l = new C4217l(c13157l, 7);
                            c6956l2.m2147try(c4217l);
                            obj4 = c4217l;
                        }
                        AbstractC7470l.billing((Function0) obj4, null, false, null, null, null, AbstractC4072l.firebase, c6956l2, 1572864, 62);
                        c6956l = c6956l2;
                    } else {
                        C6956l c6956l3 = c6956l2;
                        c6956l3.m2123default(1807514407);
                        c6956l = c6956l3;
                    }
                    c6956l.startapp(false);
                } else {
                    c6956l2.m2124else();
                }
                break;
            case 1:
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l4.m2127for(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    boolean zBooleanValue = ((Boolean) c13157l.f25773l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l4.admob(c13157l);
                    Object objM2132native2 = c6956l4.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        obj5 = objM2132native2;
                        C7701l c7701l = new C7701l(c13157l, z ? 1 : 0);
                        c6956l4.m2147try(c7701l);
                        obj5 = c7701l;
                    }
                    AbstractC13402l.yandex(zBooleanValue, (Function1) obj5, AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l4, 384);
                } else {
                    c6956l4.m2124else();
                }
                break;
            case 2:
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l5.billing(c7091l) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    c13157l.m3573instanceof((EnumC4948l) c13157l.f25771l.getValue(), AbstractC3605l.vip(AbstractC5020l.smaato(c7091l, c4346l), 16.0f, 0.0f, 2), c6956l5, 0);
                } else {
                    c6956l5.m2124else();
                }
                break;
            case 3:
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    boolean zAdmob3 = c6956l6.admob(c13157l);
                    Object objM2132native3 = c6956l6.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        obj6 = objM2132native3;
                        C4217l c4217l2 = new C4217l(c13157l, 8);
                        c6956l6.m2147try(c4217l2);
                        obj6 = c4217l2;
                    }
                    AbstractC13319l.yandex(AbstractC4072l.smaato, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) obj6, 15), null, AbstractC4072l.remoteconfig, null, AbstractC14566l.amazon(1406928478, new C6041l(c13157l, i2, z2 ? 1 : 0), c6956l6), null, c6956l6, 199686, 468);
                } else {
                    c6956l6.m2124else();
                }
                break;
            default:
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if (c6956l7.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    c13157l.m3572import(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), c6956l7, 6);
                } else {
                    c6956l7.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
