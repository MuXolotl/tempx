package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍُ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9470l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C8748l f19358l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f19359l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19360l;

    public /* synthetic */ C9470l(InterfaceC12244l interfaceC12244l, C8748l c8748l) {
        this.f19360l = 1;
        this.f19359l = interfaceC12244l;
        this.f19358l = c8748l;
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
        Object c3151l;
        C8748l c8748l;
        int i = this.f19360l;
        C8748l c8748l2 = this.f19358l;
        C13863l c13863l = C1867l.yandex;
        InterfaceC12244l interfaceC12244l = this.f19359l;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C8748l c8748l3 = this.f19358l;
                    if (c8748l3.f18009l.length() > 0) {
                        c6956l.m2123default(1736647626);
                        AbstractC18079l.amazon(AbstractC14566l.amazon(-1085734120, new C9470l(interfaceC12244l, c8748l3), c6956l), null, AbstractC14566l.amazon(-1958144682, new C5780l(c8748l3, i3), c6956l), null, 0.0f, null, null, null, null, c6956l, 390, 506);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(1737575797);
                        String str = (String) interfaceC12244l.getValue();
                        boolean zAdmob = c6956l.admob(c8748l3);
                        Object objM2132native = c6956l.m2132native();
                        if (zAdmob || objM2132native == c13863l) {
                            c3151l = new C3151l(1, c8748l3, C8748l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 8);
                            c8748l = c8748l3;
                            c6956l.m2147try(c3151l);
                        } else {
                            c3151l = objM2132native;
                            c8748l = c8748l3;
                        }
                        InterfaceC5059l interfaceC5059l = (InterfaceC5059l) c3151l;
                        boolean zAdmob2 = c6956l.admob(c8748l);
                        Object objM2132native2 = c6956l.m2132native();
                        if (zAdmob2 || objM2132native2 == c13863l) {
                            C3151l c3151l2 = new C3151l(1, c8748l, C8748l.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 0, 9);
                            c6956l.m2147try(c3151l2);
                            objM2132native2 = c3151l2;
                        }
                        c8748l.m2427transient(str, (Function1) interfaceC5059l, (Function1) ((InterfaceC5059l) objM2132native2), AbstractC3605l.startapp(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0.0f, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).crashlytics(c6956l), 0.0f, 0.0f, 13), false, AbstractC10999l.loadAd, AbstractC14566l.amazon(-1674405905, new C5780l(c8748l, i2), c6956l), C8565l.remoteconfig(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.adcel, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c6956l, 2147483646, 4095), null, c6956l, 1769472);
                        c6956l.startapp(false);
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBilling = c6956l2.billing((String) interfaceC12244l.getValue());
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zBilling || objM2132native3 == c13863l) {
                        objM2132native3 = ((String) interfaceC12244l.getValue()) + ' ' + c8748l2.f34617l.getString(R.string.in_cache);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC13010l.loadAd((String) objM2132native3, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l2, 0, 24960, 241662);
                } else {
                    c6956l2.m2124else();
                }
                break;
            default:
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c6956l3.m2124else();
                } else if (((C16187l) interfaceC12244l.getValue()).amazon) {
                    c6956l3.m2123default(-1154512450);
                    c8748l2.m2425public(c6956l3, 0);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(-1154376949);
                    C17253l c17253lLoadAd = AbstractC3605l.loadAd(0.0f, 12.0f, 1);
                    boolean zBilling2 = c6956l3.billing(interfaceC12244l) | c6956l3.admob(c8748l2);
                    Object objM2132native4 = c6956l3.m2132native();
                    if (zBilling2 || objM2132native4 == c13863l) {
                        objM2132native4 = new C10207l(interfaceC12244l, c8748l2, 12);
                        c6956l3.m2147try(objM2132native4);
                    }
                    AbstractC16336l.yandex(C4346l.f8873l, null, c17253lLoadAd, null, null, null, false, null, (Function1) objM2132native4, c6956l3, 390, 506);
                    c6956l3.startapp(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9470l(C8748l c8748l, InterfaceC12244l interfaceC12244l, int i) {
        this.f19360l = i;
        this.f19358l = c8748l;
        this.f19359l = interfaceC12244l;
    }
}
