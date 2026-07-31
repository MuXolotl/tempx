package defpackage;

/* JADX INFO: renamed from: lٍٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9559l implements InterfaceC8251l {
    public final /* synthetic */ float crashlytics;
    public final /* synthetic */ InterfaceC8251l loadAd;
    public final /* synthetic */ InterfaceC8251l yandex;

    public C9559l(InterfaceC8251l interfaceC8251l, InterfaceC8251l interfaceC8251l2, float f) {
        this.yandex = interfaceC8251l;
        this.loadAd = interfaceC8251l2;
        this.crashlytics = f;
    }

    @Override // defpackage.InterfaceC8251l
    public final float yandex(long j, InterfaceC13490l interfaceC13490l) {
        return AbstractC7572l.firebase(this.yandex.yandex(j, interfaceC13490l), this.loadAd.yandex(j, interfaceC13490l), this.crashlytics);
    }
}
