package defpackage;

/* JADX INFO: renamed from: lؚٚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7346l extends AbstractC10033l {
    public final /* synthetic */ byte[] crashlytics;
    public final /* synthetic */ int loadAd;
    public final /* synthetic */ C12105l yandex;

    public C7346l(int i, C12105l c12105l, byte[] bArr) {
        this.yandex = c12105l;
        this.loadAd = i;
        this.crashlytics = bArr;
    }

    @Override // defpackage.AbstractC10033l
    public final void isPro(InterfaceC16805l interfaceC16805l) {
        interfaceC16805l.mo728public(this.loadAd, this.crashlytics);
    }

    @Override // defpackage.AbstractC10033l
    public final C12105l loadAd() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC10033l
    public final long yandex() {
        return this.loadAd;
    }
}
