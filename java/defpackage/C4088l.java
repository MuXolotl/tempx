package defpackage;

import androidx.car.app.navigation.loadAd;

/* JADX INFO: renamed from: lْٖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4088l implements InterfaceC18325l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5268l f8420l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8421l;

    public C4088l(loadAd loadad, C5268l c5268l) {
        this.f8421l = 1;
        this.f8420l = c5268l;
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
        int i = this.f8421l;
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        int i = this.f8421l;
        C5268l c5268l = this.f8420l;
        switch (i) {
            case 0:
                c5268l.loadAd(this);
                break;
            case 1:
                AbstractC9859l.yandex();
                c5268l.loadAd(this);
                break;
            default:
                c5268l.loadAd(this);
                break;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
        int i = this.f8421l;
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
        int i = this.f8421l;
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStart(InterfaceC3177l interfaceC3177l) {
        int i = this.f8421l;
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onStop(InterfaceC3177l interfaceC3177l) {
        int i = this.f8421l;
    }

    public /* synthetic */ C4088l(C5268l c5268l, int i) {
        this.f8421l = i;
        this.f8420l = c5268l;
    }

    private final /* synthetic */ void crashlytics() {
    }

    private final /* synthetic */ void loadAd() {
    }

    private final /* synthetic */ void yandex() {
    }

    private final /* synthetic */ void admob(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void amazon(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void billing(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void firebase(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void isPro(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void metrica(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void purchase(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void remoteconfig(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void smaato(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void startapp(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void subs(InterfaceC3177l interfaceC3177l) {
    }

    private final /* synthetic */ void vip(InterfaceC3177l interfaceC3177l) {
    }
}
