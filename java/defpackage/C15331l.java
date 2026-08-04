package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: renamed from: lٔۧٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15331l implements InterfaceC2024l, InterfaceC5899l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f29962l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CaptureResult f29963l;

    public C15331l(CaptureResult captureResult, String str) {
        this.f29963l = captureResult;
        this.f29962l = str;
    }

    public final String toString() {
        return "FrameMetadata(camera: " + ((Object) C10160l.loadAd(this.f29962l)) + ", frameNumber: " + this.f29963l.getFrameNumber() + ')';
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        C2336l c2336l = AbstractC18202l.yandex;
        boolean zEquals = interfaceC1388l.equals(c2336l.loadAd(CaptureResult.class));
        CaptureResult captureResult = this.f29963l;
        if (zEquals) {
            return captureResult;
        }
        if (!interfaceC1388l.equals(c2336l.loadAd(TotalCaptureResult.class)) || captureResult == null) {
            return null;
        }
        return captureResult;
    }
}
