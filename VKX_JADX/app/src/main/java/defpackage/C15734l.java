package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lٕٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٕٗٚ;", "Llَّؓ;", "Llؙّٕ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C15734l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C13623l f30906l;

    public C15734l(C13623l c13623l) {
        this.f30906l = c13623l;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        C6416l c6416l = (C6416l) abstractC14971l;
        C17150l c17150l = c6416l.f34839l;
        C17150l c17150l2 = AbstractC12366l.loadAd;
        if (!AbstractC8576l.yandex(c17150l, c17150l2)) {
            c6416l.f34839l = c17150l2;
            if (c6416l.f34840l) {
                c6416l.m4440l();
            }
        }
        c6416l.f34841l = this.f30906l;
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
        if (!(obj instanceof C15734l)) {
            return false;
        }
        C15734l c15734l = (C15734l) obj;
        C17150l c17150l = AbstractC12366l.loadAd;
        return c17150l.equals(c17150l) && AbstractC8576l.yandex(this.f30906l, c15734l.f30906l);
    }

    public final int hashCode() {
        int i = ((1022 * 31) + 1237) * 31;
        C13623l c13623l = this.f30906l;
        return i + (c13623l == null ? 0 : c13623l.hashCode());
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C6416l(AbstractC12366l.loadAd, this.f30906l);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC12366l.loadAd + ", overrideDescendants=false, touchBoundsExpansion=" + this.f30906l + ")";
    }
}
