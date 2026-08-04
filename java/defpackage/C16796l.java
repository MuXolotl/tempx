package defpackage;

/* JADX INFO: renamed from: lٖۧۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16796l implements InterfaceC17320l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C5501l f32826l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6581l f32827l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C17239l f32828l;

    public C16796l(C17239l c17239l, InterfaceC6581l interfaceC6581l) {
        this.f32828l = c17239l;
        this.f32827l = interfaceC6581l;
        this.f32826l = interfaceC6581l.yandex();
        interfaceC6581l.loadAd();
    }

    @Override // defpackage.InterfaceC17320l
    public final boolean admob() {
        return this.f32827l.admob();
    }

    @Override // defpackage.InterfaceC17320l
    public final void billing(C2759l c2759l) {
        this.f32827l.billing(c2759l);
    }

    @Override // defpackage.InterfaceC17320l
    public final InterfaceC18636l crashlytics() {
        return this.f32828l;
    }

    @Override // defpackage.InterfaceC17320l
    public final C2759l isPro() {
        return this.f32827l.isPro();
    }

    @Override // defpackage.InterfaceC17320l
    public final boolean smaato() {
        return this.f32827l.smaato();
    }

    @Override // defpackage.InterfaceC17320l
    public final C5501l yandex() {
        return this.f32826l;
    }
}
