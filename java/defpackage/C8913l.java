package defpackage;

/* JADX INFO: renamed from: lٌٛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8913l extends AbstractC3740l implements InterfaceC9921l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C5378l f18312l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10038l f18313l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C12181l f18314l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C10919l f18315l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C7431l f18316l;

    public C8913l(C2312l c2312l, InterfaceC11865l interfaceC11865l, C7431l c7431l, C5378l c5378l) {
        super(interfaceC11865l, c2312l);
        this.f18312l = c5378l;
        C10919l c10919l = new C10919l(c7431l.f15385l, c7431l.f15384l);
        this.f18315l = c10919l;
        this.f18313l = new C10038l(c7431l, c10919l, c5378l, new C2911l(4, this));
        this.f18316l = c7431l;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m2431l(C0511l c0511l) {
        C7431l c7431l = this.f18316l;
        if (c7431l == null) {
            C8339l.smaato("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.f18316l = null;
        this.f18314l = new C12181l(this, c7431l.f15387l, this.f18315l, this.f18312l, null, c0511l, "scope of " + this, new C7646l(17, this));
    }

    @Override // defpackage.InterfaceC9921l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final InterfaceC7637l mo2432public() {
        C12181l c12181l = this.f18314l;
        if (c12181l == null) {
            return null;
        }
        return c12181l;
    }

    @Override // defpackage.AbstractC3740l, defpackage.AbstractC2775l, defpackage.Cgoto
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f7826l);
        sb.append(" from ");
        int i = AbstractC3759l.yandex;
        sb.append(AbstractC11125l.crashlytics(this));
        return sb.toString();
    }
}
