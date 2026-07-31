package defpackage;

/* JADX INFO: renamed from: lٍْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17005l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f33134l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC17242l f33135l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11611l f33136l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f33137l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C18329l f33138l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0554l f33139l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C1739l f33140l;

    public C17005l(long j, C11611l c11611l, long j2) {
        C0554l c0554l = C0554l.f1954l;
        this.f33137l = j;
        this.f33136l = c11611l;
        this.f33134l = j2;
        this.f33139l = c0554l;
        C1739l c1739l = new C1739l();
        this.f33140l = c1739l;
        InterfaceC17242l interfaceC17242lAmazon = AbstractC13106l.amazon(new C4275l(c11611l, j, new C8841l(this, 3)), c1739l);
        InterfaceC11325l.yandex.getClass();
        this.f33135l = AbstractC15269l.crashlytics(interfaceC17242lAmazon, AbstractC4047l.loadAd);
    }

    public final void amazon(C0327l c0327l) {
        C15531l c15531l;
        C0327l c0327l2 = (C0327l) this.f33139l.f1957l;
        if (c0327l2 != null && !AbstractC8576l.yandex(c0327l2.yandex.yandex, c0327l.yandex.yandex) && (c15531l = this.f33136l.subs) != null) {
            c15531l.invoke(Long.valueOf(this.f33137l));
        }
        this.f33139l = C0554l.signatures(this.f33139l, null, c0327l, null, 5);
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        C8841l c8841l = new C8841l(this, 0);
        C8841l c8841l2 = new C8841l(this, 1);
        C8841l c8841l3 = new C8841l(this, 2);
        C1739l c1739l = this.f33140l;
        long j = this.f33137l;
        C18329l c18329l = new C18329l(j, c8841l, c8841l2, c8841l3, c1739l);
        C11611l c11611l = this.f33136l;
        C18730l c18730l = c11611l.crashlytics;
        if (j == 0) {
            AbstractC14825l.yandex("The selectable contains an invalid id: " + j);
        }
        if (c18730l.loadAd(j)) {
            AbstractC14825l.yandex("Another selectable with the id: " + j + " has already subscribed.");
        }
        c18730l.subs(j, c18329l);
        c11611l.loadAd.add(c18329l);
        c11611l.yandex = false;
        this.f33138l = c18329l;
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        C18329l c18329l = this.f33138l;
        if (c18329l != null) {
            this.f33136l.billing(c18329l);
            this.f33138l = null;
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        C18329l c18329l = this.f33138l;
        if (c18329l != null) {
            this.f33136l.billing(c18329l);
            this.f33138l = null;
        }
    }
}
