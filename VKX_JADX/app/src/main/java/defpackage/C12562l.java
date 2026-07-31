package defpackage;

/* JADX INFO: renamed from: lًّّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12562l {
    public boolean admob;
    public int amazon;
    public boolean billing;
    public boolean crashlytics;
    public long firebase;
    public boolean isPro;
    public long loadAd;
    public boolean mopub;
    public long purchase;
    public boolean remoteconfig;
    public long smaato;
    public boolean subs;
    public final InterfaceC8979l yandex;

    public C12562l(InterfaceC8979l interfaceC8979l) {
        this.yandex = interfaceC8979l;
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
    public final void yandex(int i) {
        long j = this.smaato;
        if (j != -9223372036854775807L) {
            long j2 = this.loadAd;
            long j3 = this.firebase;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.yandex.yandex(j, this.remoteconfig ? 1 : 0, i2, i, null);
        }
    }
}
