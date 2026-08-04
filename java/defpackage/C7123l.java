package defpackage;

import android.hardware.camera2.CaptureFailure;

/* JADX INFO: renamed from: lًؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7123l implements InterfaceC9595l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f14929l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f14930l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CaptureFailure f14931l;

    public C7123l(CaptureFailure captureFailure) {
        this.f14931l = captureFailure;
        captureFailure.getFrameNumber();
        this.f14930l = captureFailure.getReason();
        this.f14929l = captureFailure.wasImageCaptured();
    }

    @Override // defpackage.InterfaceC9595l
    public final int inmobi() {
        return this.f14930l;
    }

    @Override // defpackage.InterfaceC9595l
    public final boolean isVip() {
        return this.f14929l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CaptureFailure.class))) {
            return this.f14931l;
        }
        return null;
    }
}
