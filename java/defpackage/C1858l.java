package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؚٕؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1858l {
    public final int loadAd;
    public final C16928l yandex;

    public C1858l(C16928l c16928l, int i) {
        this.yandex = c16928l;
        this.loadAd = i;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858l)) {
            return false;
        }
        C1858l c1858l = (C1858l) obj;
        if (!AbstractC8576l.yandex(this.yandex, c1858l.yandex)) {
            return false;
        }
        C12773l c12773l = C12773l.yandex;
        return c12773l.equals(c12773l) && this.loadAd == c1858l.loadAd;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, C12773l.yandex, Integer.valueOf(this.loadAd));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.yandex);
        sb.append(", audioSpec=");
        sb.append(C12773l.yandex);
        sb.append(", outputFormat=");
        return AbstractC0653l.adcel(sb, this.loadAd, '}');
    }
}
