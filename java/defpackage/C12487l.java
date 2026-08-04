package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12487l implements InterfaceC18514l {
    public final String loadAd;
    public final String yandex;

    public C12487l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
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
        if (!(obj instanceof C12487l)) {
            return false;
        }
        C12487l c12487l = (C12487l) obj;
        if (!this.yandex.equals(c12487l.yandex) || !AbstractC8576l.yandex(this.loadAd, c12487l.loadAd)) {
            return false;
        }
        C0479l c0479l = C0479l.yandex;
        return c0479l.equals(c0479l);
    }

    public final int hashCode() {
        return ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + 361106348;
    }

    public final String toString() {
        return "CroppedImageCard(imageUrl=" + this.yandex + ", title=" + this.loadAd + ", onClick=" + C0479l.yandex + ')';
    }

    @Override // defpackage.InterfaceC18514l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(-668439874);
        int i2 = (c6956l.billing(this) ? 32 : 16) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 17) != 16)) {
            Function1 function1 = (Function1) c6956l.isPro(AbstractC12821l.yandex);
            boolean zBilling = c6956l.billing(function1) | ((i2 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C15456l(function1, this, 2);
                c6956l.m2147try(objM2132native);
            }
            AbstractC10464l.yandex((Function0) objM2132native, AbstractC0080l.vip(AbstractC0080l.purchase(C4346l.f8873l, 64.0f), 200.0f), null, null, null, null, null, null, AbstractC14566l.amazon(1913625608, new C1350l(9, this), c6956l), c6956l, 805306416, 508);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, interfaceC17242l, i, 4);
        }
    }
}
