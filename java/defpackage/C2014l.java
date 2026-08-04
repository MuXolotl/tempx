package defpackage;

/* JADX INFO: renamed from: lٍٟؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2014l implements InterfaceC7476l {
    public final C13247l yandex;

    public C2014l(C13247l c13247l) {
        this.yandex = c13247l;
    }

    @Override // defpackage.InterfaceC7476l
    public final C3329l amazon() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.InterfaceC7476l
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.InterfaceC7476l
    public final C13247l crashlytics() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC7476l
    public final InterfaceC7476l loadAd() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.InterfaceC7476l
    public final C3329l mopub() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.InterfaceC7476l
    public final boolean yandex() {
        return true;
    }
}
