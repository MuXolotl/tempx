package defpackage;

/* JADX INFO: renamed from: lٖۡ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16700l {
    public long admob;
    public boolean amazon;
    public int billing;
    public boolean crashlytics;
    public boolean loadAd;
    public long mopub;
    public int purchase;
    public final InterfaceC8979l yandex;

    public C16700l(InterfaceC8979l interfaceC8979l) {
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
    public final void loadAd(int i, long j, boolean z) {
        AbstractC12442l.subscription(this.admob != -9223372036854775807L);
        if (this.purchase == 182 && z && this.loadAd) {
            this.yandex.yandex(this.admob, this.amazon ? 1 : 0, (int) (j - this.mopub), i, null);
        }
        if (this.purchase != 179) {
            this.mopub = j;
        }
    }

    public final void yandex(int i, int i2, byte[] bArr) {
        if (this.crashlytics) {
            int i3 = this.billing;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.billing = (i2 - i) + i3;
            } else {
                this.amazon = ((bArr[i4] & 192) >> 6) == 0;
                this.crashlytics = false;
            }
        }
    }
}
