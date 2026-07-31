package defpackage;

/* JADX INFO: renamed from: lّٖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17958l implements InterfaceC9750l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final C2536l loadAd;
    public final InterfaceC15782l yandex;

    public C17958l(String str, InterfaceC15782l interfaceC15782l, C2536l c2536l, boolean z, boolean z2) {
        this.yandex = interfaceC15782l;
        this.loadAd = c2536l;
        this.crashlytics = z;
        this.amazon = z2;
    }

    @Override // defpackage.InterfaceC9750l
    public final InterfaceC3012l yandex(C9950l c9950l, C10712l c10712l, AbstractC10437l abstractC10437l) {
        return new C14372l(c9950l, abstractC10437l, this);
    }
}
