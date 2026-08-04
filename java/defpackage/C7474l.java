package defpackage;

/* JADX INFO: renamed from: lؚۘٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7474l extends AbstractC9707l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f15471l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13565l f15472l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC6242l f15473l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final String f15474l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f15475l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC1220l f15476l;

    public C7474l(AbstractC6242l abstractC6242l, C13565l c13565l, int i, int i2, C12843l c12843l) {
        this.f15473l = abstractC6242l;
        this.f15472l = c13565l;
        this.f15471l = i;
        this.f15475l = i2;
        String str = c13565l.loadAd;
        this.f15474l = AbstractC16648l.isVip(str, "<", false) ? null : str;
        this.f15476l = AbstractC9968l.crashlytics(2, new C11239l(this, c12843l, 1));
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: extends */
    public final boolean mo1106extends() {
        return this.f15472l.amazon != null;
    }

    @Override // defpackage.AbstractC9707l
    public final String getName() {
        return this.f15474l;
    }

    @Override // defpackage.AbstractC9707l
    public final int premium() {
        return this.f15475l;
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: private */
    public final boolean mo1108private() {
        AbstractC6242l abstractC6242l = this.f15473l;
        if (!(abstractC6242l instanceof AbstractC12055l) && !(abstractC6242l.ad() instanceof C9539l) && !AbstractC7572l.subs(abstractC6242l)) {
            C8936l.smaato(abstractC6242l, "Only constructors and top-level callables are supported for now: ");
            return false;
        }
        C13698l c13698l = AbstractC15547l.advert;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[54];
        return c13698l.m3679package(this.f15472l);
    }

    @Override // defpackage.AbstractC9707l
    public final int pro() {
        return this.f15471l;
    }

    @Override // defpackage.AbstractC9707l
    public final boolean remoteconfig() {
        C13698l c13698l = AbstractC15547l.advert;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[54];
        return c13698l.m3679package(this.f15472l);
    }

    @Override // defpackage.AbstractC9707l
    public final InterfaceC18672l subs() {
        return this.f15473l;
    }

    @Override // defpackage.AbstractC9707l
    /* JADX INFO: renamed from: synchronized */
    public final InterfaceC13012l mo1109synchronized() {
        return (InterfaceC13012l) this.f15476l.getValue();
    }
}
