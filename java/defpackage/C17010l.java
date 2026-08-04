package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17010l implements InterfaceC18514l {
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C17010l(String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
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
        if (!(obj instanceof C17010l)) {
            return false;
        }
        C17010l c17010l = (C17010l) obj;
        if (!this.yandex.equals(c17010l.yandex) || !AbstractC8576l.yandex(this.loadAd, c17010l.loadAd) || !AbstractC8576l.yandex(this.crashlytics, c17010l.crashlytics)) {
            return false;
        }
        C0479l c0479l = C0479l.yandex;
        return c0479l.equals(c0479l) && c0479l.equals(c0479l);
    }

    public final int hashCode() {
        return ((((this.crashlytics.hashCode() + AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd)) * 31) + 361106348) * 31) + 361106348;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrack(imageUrl=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", subtitle=");
        sb.append(this.crashlytics);
        sb.append(", onClick=");
        C0479l c0479l = C0479l.yandex;
        sb.append(c0479l);
        sb.append(", onMenuClick=");
        sb.append(c0479l);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC18514l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(1678336903);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i | (c6956l.billing(this) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) c6956l.isPro(AbstractC12821l.yandex);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l, c6956l, 6);
            boolean zBilling = c6956l.billing(function1) | ((i2 & 112) == 32);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C15456l(function1, this, 1);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC16291l.loadAd((Function0) objM2132native2, interfaceC17242l, false, null, null, new C10513l(1.05f, 1.1f, 1.05f, 1.05f, 1.05f), null, null, c2403l, AbstractC14566l.amazon(-1500268826, new C7442l((Object) this, (InterfaceC12244l) interfaceC8714lLoadAd, 16), c6956l), c6956l, (i2 << 3) & 112, 54, 892);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(this, interfaceC17242l, i, 3);
        }
    }
}
