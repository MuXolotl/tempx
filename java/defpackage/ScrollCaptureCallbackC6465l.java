package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.recyclerview.widget.RecyclerView;
import java.util.function.Consumer;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙٔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC6465l implements ScrollCaptureCallback {
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l amazon;
    public final C0463l billing;
    public final C17240l crashlytics;
    public final C16918l loadAd;
    public final C18662l purchase;
    public final C18666l yandex;

    public ScrollCaptureCallbackC6465l(C18666l c18666l, C16918l c16918l, C18662l c18662l, C17240l c17240l, ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.yandex = c18666l;
        this.loadAd = c16918l;
        this.crashlytics = c17240l;
        this.amazon = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.purchase = new C18662l(c18662l.f36440l.mo246l(C12590l.f24799l));
        this.billing = new C0463l(c16918l.loadAd(), new C18716l(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(ScrollCaptureCallbackC6465l scrollCaptureCallbackC6465l, ScrollCaptureSession scrollCaptureSession, C16918l c16918l, AbstractC0283l abstractC0283l) {
        C6083l c6083l;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSession2;
        int i3;
        C16918l c16918l2;
        int i4;
        int iPurchase;
        int iPurchase2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (abstractC0283l instanceof C6083l) {
            c6083l = (C6083l) abstractC0283l;
            int i7 = c6083l.f12856l;
            if ((i7 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6083l.f12856l = i7 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6083l = new C6083l(scrollCaptureCallbackC6465l, abstractC0283l);
            }
        } else {
            c6083l = new C6083l(scrollCaptureCallbackC6465l, abstractC0283l);
        }
        Object obj = c6083l.f12855l;
        int i8 = c6083l.f12856l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i8 == 0) {
            AbstractC2829l.crashlytics(obj);
            i = c16918l.loadAd;
            i2 = c16918l.amazon;
            C0463l c0463l = scrollCaptureCallbackC6465l.billing;
            c6083l.f12858l = scrollCaptureSession;
            c6083l.f12857l = c16918l;
            c6083l.f12860l = i;
            c6083l.f12854l = i2;
            c6083l.f12856l = 1;
            if (i > i2) {
                c0463l.getClass();
                C11467l.subs(i, i2, " ≤ max=", "Expected min=");
                return null;
            }
            int i9 = i2 - i;
            int i10 = c0463l.yandex;
            if (i9 > i10) {
                C10754l.metrica(AbstractC12589l.premium(i9, i10, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objLoadAd = c0463l.loadAd((((i9 / 2) + i) - (i10 / 2)) - c0463l.loadAd, c6083l);
            if (objLoadAd != enumC9342l) {
                objLoadAd = Unit.INSTANCE;
            }
            if (objLoadAd != enumC9342l) {
                objLoadAd = Unit.INSTANCE;
            }
            if (objLoadAd != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i8 == 1) {
            int i11 = c6083l.f12854l;
            int i12 = c6083l.f12860l;
            C16918l c16918l3 = c6083l.f12857l;
            ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) c6083l.f12858l;
            AbstractC2829l.crashlytics(obj);
            i = i12;
            c16918l = c16918l3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i8 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = c6083l.f12854l;
            i4 = c6083l.f12860l;
            c16918l2 = c6083l.f12857l;
            scrollCaptureSession2 = (ScrollCaptureSession) c6083l.f12858l;
            AbstractC2829l.crashlytics(obj);
        }
        C0463l c0463l2 = scrollCaptureCallbackC6465l.billing;
        iPurchase = AbstractC8576l.purchase(i4 - AbstractC5573l.ads(c0463l2.loadAd), 0, c0463l2.yandex);
        C0463l c0463l3 = scrollCaptureCallbackC6465l.billing;
        iPurchase2 = AbstractC8576l.purchase(i3 - AbstractC5573l.ads(c0463l3.loadAd), 0, c0463l3.yandex);
        i5 = c16918l2.yandex;
        i6 = c16918l2.crashlytics;
        if (iPurchase == iPurchase2) {
            return C16918l.purchase;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iPurchase);
            C16918l c16918l4 = scrollCaptureCallbackC6465l.loadAd;
            canvasLockHardwareCanvas.translate(-c16918l4.yandex, -c16918l4.loadAd);
            scrollCaptureCallbackC6465l.amazon.getRootView().draw(canvasLockHardwareCanvas);
            int iAds = AbstractC5573l.ads(scrollCaptureCallbackC6465l.billing.loadAd);
            return new C16918l(i5, iPurchase + iAds, i6, iPurchase2 + iAds);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        C11192l c11192l = C11192l.f22544l;
        c6083l.f12858l = scrollCaptureSession;
        c6083l.f12857l = c16918l;
        c6083l.f12860l = i;
        c6083l.f12854l = i2;
        c6083l.f12856l = 2;
        if (AbstractC1789l.amazon(c6083l.f1295l).mo1226super(c11192l, c6083l) != enumC9342l) {
            scrollCaptureSession2 = scrollCaptureSession;
            i3 = i2;
            c16918l2 = c16918l;
            i4 = i;
            C0463l c0463l4 = scrollCaptureCallbackC6465l.billing;
            iPurchase = AbstractC8576l.purchase(i4 - AbstractC5573l.ads(c0463l4.loadAd), 0, c0463l4.yandex);
            C0463l c0463l5 = scrollCaptureCallbackC6465l.billing;
            iPurchase2 = AbstractC8576l.purchase(i3 - AbstractC5573l.ads(c0463l5.loadAd), 0, c0463l5.yandex);
            i5 = c16918l2.yandex;
            i6 = c16918l2.crashlytics;
            if (iPurchase == iPurchase2) {
                return C16918l.purchase;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iPurchase);
            C16918l c16918l5 = scrollCaptureCallbackC6465l.loadAd;
            canvasLockHardwareCanvas.translate(-c16918l5.yandex, -c16918l5.loadAd);
            scrollCaptureCallbackC6465l.amazon.getRootView().draw(canvasLockHardwareCanvas);
            int iAds2 = AbstractC5573l.ads(scrollCaptureCallbackC6465l.billing.loadAd);
            return new C16918l(i5, iPurchase + iAds2, i6, iPurchase2 + iAds2);
        }
        return enumC9342l;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC10999l.mopub(this.purchase, C8035l.f16723l, 0, new C6637l(this, runnable, (InterfaceC14029l) null, 7), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C7504l c7504lMopub = AbstractC10999l.mopub(this.purchase, null, 0, new C0384l(this, scrollCaptureSession, rect, consumer, (InterfaceC14029l) null, 10), 3);
        c7504lMopub.mo2154l(new C3006l(11, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C13857l(0, c7504lMopub));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.t(AbstractC5833l.isPro(this.loadAd));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.billing.loadAd = 0.0f;
        ((C10086l) this.crashlytics.loadAd).setValue(Boolean.TRUE);
        runnable.run();
    }
}
