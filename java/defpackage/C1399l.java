package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import j$.util.Collection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: lَؒۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1399l extends CameraExtensionSession$ExtensionCaptureCallback {
    public final Serializable amazon;
    public final /* synthetic */ C8217l crashlytics;
    public final C16053l loadAd;
    public final /* synthetic */ int yandex;

    public C1399l(C8217l c8217l, C16053l c16053l) {
        this.yandex = 0;
        this.crashlytics = c8217l;
        this.loadAd = c16053l;
        this.amazon = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.yandex;
        C16053l c16053l = this.loadAd;
        Serializable serializable = this.amazon;
        switch (i) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    C8217l c8217l = this.crashlytics;
                    C3897l c3897l = c8217l.f17117l;
                    c3897l.getClass();
                    long jIncrementAndGet = C3897l.loadAd.incrementAndGet(c3897l);
                    c8217l.f17112l.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                c16053l.amazon(captureRequest, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                int size = ((List) ((LinkedHashMap) serializable).get(captureRequest)).size();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (size != 1) {
                    Log.i("CXCP", "onCaptureFailed is not triggered for repeating requests. Request frame numbers: " + Collection.EL.stream((List) linkedHashMap.get(captureRequest)));
                } else {
                    c16053l.amazon(captureRequest, ((Number) ((List) linkedHashMap.get(captureRequest)).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        int i2 = this.yandex;
        C16053l c16053l = this.loadAd;
        switch (i2) {
            case 0:
                c16053l.purchase(captureRequest, i);
                break;
            default:
                c16053l.purchase(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        int i = this.yandex;
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.yandex) {
            case 0:
                Serializable serializable = this.amazon;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    C8217l c8217l = this.crashlytics;
                    C3897l c3897l = c8217l.f17117l;
                    c3897l.getClass();
                    long jIncrementAndGet = C3897l.loadAd.incrementAndGet(c3897l);
                    c8217l.f17112l.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                this.loadAd.crashlytics(captureRequest, totalCaptureResult, ((Number) ((ConcurrentLinkedQueue) serializable).remove()).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        switch (this.yandex) {
            case 0:
                this.loadAd.billing(i);
                break;
            default:
                this.loadAd.billing(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        int i2 = this.yandex;
        C16053l c16053l = this.loadAd;
        C8217l c8217l = this.crashlytics;
        switch (i2) {
            case 0:
                c16053l.mopub(i, ((Long) c8217l.f17112l.get(cameraExtensionSession)).longValue());
                break;
            default:
                c16053l.mopub(i, ((Long) c8217l.f17112l.get(cameraExtensionSession)).longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        int i = this.yandex;
        Serializable serializable = this.amazon;
        C8217l c8217l = this.crashlytics;
        switch (i) {
            case 0:
                C3897l c3897l = c8217l.f17117l;
                c3897l.getClass();
                long jIncrementAndGet = C3897l.loadAd.incrementAndGet(c3897l);
                c8217l.f17112l.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.loadAd.admob(captureRequest, jIncrementAndGet, j);
                break;
            default:
                C3897l c3897l2 = c8217l.f17117l;
                c3897l2.getClass();
                long jIncrementAndGet2 = C3897l.loadAd.incrementAndGet(c3897l2);
                c8217l.f17112l.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.loadAd.admob(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }

    public C1399l(C8217l c8217l, C16053l c16053l, LinkedHashMap linkedHashMap) {
        this.yandex = 1;
        this.crashlytics = c8217l;
        this.loadAd = c16053l;
        this.amazon = linkedHashMap;
    }

    private final void loadAd(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }

    private final void yandex(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
    }
}
