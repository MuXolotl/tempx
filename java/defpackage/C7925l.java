package defpackage;

/* JADX INFO: renamed from: lًُُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7925l implements InterfaceC14105l {
    @Override // defpackage.InterfaceC14105l
    public final void admob(C15691l c15691l, EnumC8920l enumC8920l, boolean z) {
        c15691l.crashlytics();
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l billing() {
        return new C3301l(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l crashlytics() {
        return C3301l.f7041l;
    }

    @Override // defpackage.InterfaceC14105l
    public final /* synthetic */ InterfaceC15853l loadAd(int i, InterfaceC15879l interfaceC15879l) {
        return InterfaceC15853l.f31104l;
    }

    @Override // defpackage.InterfaceC14105l
    public final /* synthetic */ boolean mopub() {
        return true;
    }

    @Override // defpackage.InterfaceC14105l
    public final InterfaceC10367l purchase() {
        return C13629l.purchase;
    }

    @Override // defpackage.InterfaceC14105l
    public final C5012l yandex(int i, InterfaceC15879l interfaceC15879l) {
        return C5012l.purchase;
    }

    @Override // defpackage.InterfaceC14105l
    public final /* synthetic */ void amazon(int i) {
    }
}
