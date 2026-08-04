package defpackage;

/* JADX INFO: renamed from: lّؑۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0279l extends AbstractC17691l {
    public final C15977l yandex;

    public C0279l(C15977l c15977l) {
        this.yandex = c15977l;
    }

    @Override // defpackage.AbstractC17691l
    public final Object amazon(InterfaceC7697l interfaceC7697l) {
        return ((C0852l) interfaceC7697l).loadAd();
    }

    @Override // defpackage.AbstractC17691l
    public final InterfaceC7697l loadAd() {
        return AbstractC8258l.crashlytics;
    }

    @Override // defpackage.AbstractC17691l
    public final C15977l yandex() {
        return this.yandex;
    }
}
