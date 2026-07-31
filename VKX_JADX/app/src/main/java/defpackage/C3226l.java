package defpackage;

/* JADX INFO: renamed from: lؘؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3226l implements InterfaceC6347l {
    public final /* synthetic */ C13834l yandex;

    public C3226l(C13834l c13834l) {
        this.yandex = c13834l;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
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
    @Override // defpackage.InterfaceC6347l
    public final AbstractC15342l yandex(long j, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l) {
        Object obj;
        C13834l c13834l = this.yandex;
        float fFloatValue = ((Number) c13834l.amazon.amazon()).floatValue();
        C6839l c6839l = c13834l.billing;
        if (fFloatValue != c13834l.purchase || c6839l == null) {
            C6839l c6839l2 = c13834l.loadAd;
            C6839l c6839l3 = c13834l.crashlytics;
            if (!AbstractC8576l.yandex(c6839l2, c6839l3)) {
                Object objLoadAd = c6839l2 != null ? c6839l2.loadAd(c6839l3, fFloatValue) : null;
                if (objLoadAd == null && c6839l3 != null) {
                    objLoadAd = c6839l3.loadAd(c6839l2, 1.0f - fFloatValue);
                }
                if (objLoadAd != null) {
                    obj = objLoadAd;
                } else if (fFloatValue >= 0.5f) {
                    obj = c6839l2;
                    obj = c6839l2;
                    obj = c6839l3;
                }
            } else if (fFloatValue >= 0.5f) {
                obj = c6839l2;
                obj = c6839l2;
                obj = c6839l3;
            }
            obj = c6839l2;
            obj = c6839l2;
            c6839l = (C6839l) obj;
            c13834l.purchase = fFloatValue;
            c13834l.billing = c6839l;
        }
        return c6839l.yandex(j, enumC9931l, interfaceC13490l);
    }
}
