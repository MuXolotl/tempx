package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;

/* JADX INFO: renamed from: l٘ٙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18002l implements InterfaceC17552l {
    public static final boolean crashlytics;
    public final C8688l loadAd;
    public final InterfaceC15897l yandex;

    static {
        crashlytics = AbstractC17919l.yandex(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public C18002l(C15736l c15736l, InterfaceC15897l interfaceC15897l, C14338l c14338l, C8715l c8715l) {
        this.yandex = interfaceC15897l;
        new C8688l(new C1482l(c15736l, 1));
        this.loadAd = new C8688l(new C13802l(1, this));
    }

    @Override // defpackage.InterfaceC17552l
    public final void yandex(int i) {
        ((C3607l) this.loadAd.getValue()).getClass();
    }
}
