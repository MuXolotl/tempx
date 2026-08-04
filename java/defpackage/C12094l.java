package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lٌِۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12094l implements InterfaceC0930l {
    public C9426l admob;
    public final boolean amazon;
    public final C13716l billing;
    public InterfaceC16983l crashlytics;
    public final C14338l loadAd;
    public final AtomicInteger mopub;
    public boolean purchase;
    public InterfaceC1142l subs;
    public final C15161l yandex;

    public C12094l(InterfaceC5389l interfaceC5389l, C15161l c15161l, C14338l c14338l, C5342l c5342l) {
        this.yandex = c15161l;
        this.loadAd = c14338l;
        boolean z = false;
        if (interfaceC5389l != null) {
            InterfaceC5389l.admob.getClass();
            int[] iArr = (int[]) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null ? false : AbstractC8669l.tapsense(iArr, 6)) {
                z = true;
            }
        }
        this.amazon = z;
        this.billing = new C13716l(-1);
        this.mopub = new AtomicInteger(-1);
        if (z) {
            c5342l.yandex(new C9413l(this), c14338l.amazon);
        }
    }

    public final C9426l amazon(boolean z, boolean z2) {
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        C9426l c9426l = new C9426l();
        if (this.amazon) {
            AbstractC10999l.mopub(this.loadAd.purchase, null, 0, new C12307l((InterfaceC14029l) null, this, c9426l, z, z2), 3);
            return c9426l;
        }
        c9426l.m2649l(new IllegalStateException("Low Light Boost is not supported!"));
        return c9426l;
    }

    public final void crashlytics(C13716l c13716l, int i) {
        if (this.mopub.getAndSet(i) != i) {
            if (AbstractC12225l.purchase()) {
                c13716l.subs(Integer.valueOf(i));
            } else {
                c13716l.isPro(Integer.valueOf(i));
            }
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void loadAd(InterfaceC16983l interfaceC16983l) {
        this.crashlytics = interfaceC16983l;
        if (this.purchase) {
            if (interfaceC16983l != null) {
                amazon(true, false);
            } else {
                crashlytics(this.billing, 0);
            }
        }
    }

    @Override // defpackage.InterfaceC0930l
    public final void reset() {
        C9426l c9426l = this.admob;
        if (c9426l != null) {
            AbstractC14814l.isVip("There is a new enableLowLightBoost being set", c9426l);
        }
        this.admob = null;
        amazon(false, true);
    }

    public final void yandex(List list) {
        if (this.amazon) {
            if (list.isEmpty()) {
                this.subs = AbstractC15929l.yandex(Boolean.FALSE);
            } else {
                this.subs = AbstractC10999l.crashlytics(3, null, this.loadAd.purchase, new C7864l(this, list, (InterfaceC14029l) null, 0));
            }
        }
    }
}
