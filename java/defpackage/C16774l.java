package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: lٖۦؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16774l extends AbstractC10078l {
    public static C16774l amazon(InterfaceC0048l interfaceC0048l, Size size) {
        if (interfaceC0048l.tapsense() == null) {
            C1759l.isPro(interfaceC0048l.applovin(interfaceC0048l.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        C16774l c16774l = new C16774l();
        C10814l c10814lSignatures = interfaceC0048l.signatures();
        C7420l c7420l = C7420l.f15370l;
        int i = C10814l.yandex().mopub.crashlytics;
        ArrayList arrayList = c16774l.amazon;
        ArrayList arrayList2 = c16774l.crashlytics;
        C9598l c9598l = c16774l.loadAd;
        if (c10814lSignatures != null) {
            C0665l c0665l = c10814lSignatures.mopub;
            i = c0665l.crashlytics;
            for (CameraDevice.StateCallback stateCallback : c10814lSignatures.crashlytics) {
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : c10814lSignatures.amazon) {
                if (!arrayList.contains(stateCallback2)) {
                    arrayList.add(stateCallback2);
                }
            }
            c9598l.billing(c0665l.amazon);
            c7420l = c0665l.loadAd;
        }
        c9598l.getClass();
        c9598l.f19553l = C5104l.amazon(c7420l);
        int i2 = 5;
        if (interfaceC0048l instanceof C8749l) {
            Rational rational = AbstractC3400l.yandex;
            if (((PreviewPixelHDRnetQuirk) AbstractC17919l.yandex(PreviewPixelHDRnetQuirk.class)) != null && !AbstractC8576l.yandex(AbstractC3400l.yandex, new Rational(size.getWidth(), size.getHeight()))) {
                C5104l c5104lCrashlytics = C5104l.crashlytics();
                c5104lCrashlytics.mopub(AbstractC5641l.billing(CaptureRequest.TONEMAP_MODE), 2);
                c9598l.license(new C16443l(i2, C7420l.yandex(c5104lCrashlytics)));
            }
        }
        c9598l.f19550l = ((Number) interfaceC0048l.smaato(C16443l.f32156l, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) interfaceC0048l.smaato(C16443l.f32155l, null);
        if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
            arrayList2.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) interfaceC0048l.smaato(C16443l.f32158l, null);
        if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
            arrayList.add(stateCallback4);
        }
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) interfaceC0048l.smaato(C16443l.f32152l, null);
        if (captureCallback != null) {
            C18505l c18505l = new C18505l(captureCallback);
            c9598l.tapsense(c18505l);
            ArrayList arrayList3 = c16774l.purchase;
            if (!arrayList3.contains(c18505l)) {
                arrayList3.add(c18505l);
            }
        }
        int iMo259static = interfaceC0048l.mo259static();
        if (iMo259static != 0) {
            c9598l.getClass();
            if (iMo259static != 0) {
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f918l, Integer.valueOf(iMo259static));
            }
        }
        int iMo258private = interfaceC0048l.mo258private();
        if (iMo258private != 0) {
            c9598l.getClass();
            if (iMo258private != 0) {
                ((C5104l) c9598l.f19553l).mopub(InterfaceC0048l.f921l, Integer.valueOf(iMo258private));
            }
        }
        C5104l c5104lCrashlytics2 = C5104l.crashlytics();
        C6916l c6916l = C16443l.f32154l;
        String str = (String) interfaceC0048l.smaato(c6916l, null);
        if (str != null) {
            c5104lCrashlytics2.mopub(c6916l, str);
        }
        C6916l c6916l2 = C16443l.f32153l;
        Long l = (Long) interfaceC0048l.smaato(c6916l2, null);
        if (l != null) {
            c5104lCrashlytics2.mopub(c6916l2, Long.valueOf(l.longValue()));
        }
        c9598l.license(c5104lCrashlytics2);
        C3316l c3316l = new C3316l(6);
        interfaceC0048l.inmobi(new C5131l(c3316l, interfaceC0048l, 0));
        c9598l.license(new C5501l(i2, C7420l.yandex((C5104l) c3316l.f7072l)));
        return c16774l;
    }

    public final C10814l crashlytics() {
        return new C10814l(new ArrayList(this.yandex), new ArrayList(this.crashlytics), new ArrayList(this.amazon), new ArrayList(this.purchase), this.loadAd.pro(), this.billing, this.mopub, this.admob, this.subs);
    }

    public final void loadAd(AbstractC0958l abstractC0958l, C15421l c15421l, int i) {
        C11644l c11644lYandex = C14113l.yandex(abstractC0958l);
        if (c15421l == null) {
            C6541l.subs("Null dynamicRange");
            return;
        }
        c11644lYandex.f23362l = c15421l;
        c11644lYandex.f23361l = Integer.valueOf(i);
        this.yandex.add(c11644lYandex.m3173l());
        ((HashSet) this.loadAd.f19549l).add(abstractC0958l);
    }

    public final void yandex(InterfaceC17944l interfaceC17944l) {
        this.loadAd.license(interfaceC17944l);
    }
}
