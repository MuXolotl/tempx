package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Collections;

/* JADX INFO: renamed from: lَۗؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10502l implements InterfaceC0930l {
    public InterfaceC16983l crashlytics;
    public C5783l loadAd;
    public final C17775l yandex;

    public C10502l(C17775l c17775l) {
        this.yandex = c17775l;
        this.loadAd = new C5783l(c17775l.amazon, 0, c17775l.crashlytics, c17775l.purchase);
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.crashlytics = interfaceC16983l;
        yandex(false);
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        C5783l c5783l = this.loadAd;
        this.loadAd = new C5783l(c5783l.yandex, 0, c5783l.crashlytics, c5783l.amazon);
        yandex(true);
    }

    public final C9426l yandex(boolean z) {
        C17775l c17775l = this.yandex;
        if (!c17775l.amazon) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            C9426l c9426l = new C9426l();
            c9426l.m2649l(illegalArgumentException);
            return c9426l;
        }
        if (!c17775l.crashlytics.contains(0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + c17775l.crashlytics.getUpper() + " .. " + c17775l.crashlytics.getLower() + ']');
            C9426l c9426l2 = new C9426l();
            c9426l2.m2649l(illegalArgumentException2);
            return c9426l2;
        }
        InterfaceC16983l interfaceC16983l = this.crashlytics;
        if (interfaceC16983l == null) {
            C6711l c6711l = new C6711l("Camera is not active.");
            C9426l c9426l3 = c17775l.billing;
            if (c9426l3 != null) {
                c9426l3.m2649l(c6711l);
            }
            C9426l c9426l4 = new C9426l();
            c9426l4.m2649l(c6711l);
            return c9426l4;
        }
        C5783l c5783l = this.loadAd;
        this.loadAd = new C5783l(c5783l.yandex, 0, c5783l.crashlytics, c5783l.amazon);
        C5342l c5342l = c17775l.loadAd;
        C9426l c9426l5 = new C9426l();
        C9426l c9426l6 = c17775l.billing;
        if (c9426l6 != null) {
            if (z) {
                AbstractC14814l.isVip("Cancelled by another setExposureCompensationIndex()", c9426l6);
            } else {
                AbstractC0140l.vip(c9426l5, c9426l6);
            }
        }
        c17775l.billing = c9426l5;
        C15083l c15083l = c17775l.mopub;
        if (c15083l != null) {
            c5342l.loadAd(c15083l);
            c17775l.mopub = null;
        }
        interfaceC16983l.isPro(Collections.singletonMap(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0), AbstractC3222l.loadAd);
        C15083l c15083l2 = new C15083l(0, c9426l5);
        c5342l.yandex(c15083l2, c17775l.yandex.amazon);
        c9426l5.mo2154l(new C3005l(c17775l, c15083l2, 11));
        c17775l.mopub = c15083l2;
        return c9426l5;
    }
}
