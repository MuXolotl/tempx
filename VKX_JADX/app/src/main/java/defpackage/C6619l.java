package defpackage;

/* JADX INFO: renamed from: lؙٞؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6619l implements InterfaceC7476l {
    public final C3329l yandex;

    public C6619l(Throwable th) {
        this.yandex = new C3329l(this, null, th, 2);
    }

    @Override // defpackage.InterfaceC7476l
    public final C3329l amazon() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC7476l
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.InterfaceC7476l
    public final C13247l crashlytics() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.InterfaceC7476l
    public final InterfaceC7476l loadAd() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.InterfaceC7476l
    public final C3329l mopub() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC7476l
    public final boolean yandex() {
        return false;
    }
}
