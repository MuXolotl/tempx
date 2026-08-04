package defpackage;

/* JADX INFO: renamed from: lَُٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10953l implements InterfaceC1814l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C17535l f22082l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C2540l f22083l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17721l f22084l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C3223l f22085l;

    public C10953l(C6806l c6806l) {
        this.f22084l = c6806l.loadAd;
        this.f22083l = c6806l.yandex.loadAd();
        this.f22082l = c6806l.billing;
        this.f22085l = c6806l.crashlytics.m273l();
    }

    @Override // defpackage.InterfaceC1814l
    public final C17535l getAttributes() {
        return this.f22082l;
    }

    @Override // defpackage.InterfaceC1814l
    public final C17721l getMethod() {
        return this.f22084l;
    }

    @Override // defpackage.InterfaceC1814l
    public final C2540l getUrl() {
        return this.f22083l;
    }

    @Override // defpackage.InterfaceC1814l, defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // defpackage.InterfaceC13536l
    public final InterfaceC4539l yandex() {
        return this.f22085l;
    }
}
