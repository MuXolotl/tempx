package defpackage;

/* JADX INFO: renamed from: l٘ؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17588l implements InterfaceC11445l {
    public C14513l amazon;
    public final C18449l crashlytics;
    public final C6536l loadAd;
    public final int purchase;
    public final InterfaceC0587l yandex;

    public C17588l(InterfaceC0587l interfaceC0587l, InterfaceC6384l interfaceC6384l) {
        C6536l c6536l = new C6536l(27, interfaceC6384l);
        C18449l c18449l = new C18449l(13);
        C14513l c14513l = new C14513l(-1, 6, (byte) 0);
        this.yandex = interfaceC0587l;
        this.loadAd = c6536l;
        this.crashlytics = c18449l;
        this.amazon = c14513l;
        this.purchase = 1048576;
    }

    @Override // defpackage.InterfaceC11445l
    public final AbstractC14384l amazon(C2427l c2427l) {
        c2427l.loadAd.getClass();
        return new C10743l(c2427l, this.yandex, this.loadAd, this.crashlytics.m4550package(c2427l), this.amazon, this.purchase, null);
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l purchase(C14513l c14513l) {
        AbstractC12442l.metrica(c14513l, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.amazon = c14513l;
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l crashlytics(boolean z) {
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l loadAd(int i) {
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l yandex(C8565l c8565l) {
        return this;
    }
}
