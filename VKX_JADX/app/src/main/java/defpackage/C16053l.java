package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕۥٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16053l extends CameraCaptureSession.CaptureCallback {
    public final ArrayMap admob;
    public final ArrayList amazon;
    public final C13161l billing;
    public final ArrayList crashlytics;
    public final long firebase;
    public final C7094l isPro;
    public final boolean loadAd;
    public final ArrayMap mopub;
    public final List purchase;
    public volatile Integer remoteconfig;
    public final C9426l smaato;
    public final C5664l subs;
    public final String yandex;

    public C16053l(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, C13161l c13161l, ArrayMap arrayMap, ArrayMap arrayMap2, C5664l c5664l, C7094l c7094l) {
        this.yandex = str;
        this.loadAd = z;
        this.crashlytics = arrayList;
        this.amazon = arrayList2;
        this.purchase = list;
        this.billing = c13161l;
        this.mopub = arrayMap;
        this.admob = arrayMap2;
        this.subs = c5664l;
        this.isPro = c7094l;
        C3897l c3897l = AbstractC10494l.loadAd;
        c3897l.getClass();
        this.firebase = C3897l.loadAd.incrementAndGet(c3897l);
        this.smaato = new C9426l();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        C8339l.smaato("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final void admob(CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onCaptureStarted");
        this.smaato.m3885new(Unit.INSTANCE);
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9492l) list.get(i)).isVip(interfaceC10687lSubs, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i2)).isVip(interfaceC10687lSubs, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void amazon(CaptureRequest captureRequest, long j) {
        Trace.beginSection("onCaptureFailed");
        this.smaato.m3885new(Unit.INSTANCE);
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        loadAd(interfaceC10687lSubs, j, new C12740l(interfaceC10687lSubs, j));
        Trace.endSection();
    }

    public final void billing(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.smaato.m3885new(Unit.INSTANCE);
        this.billing.Signature(this);
        if (yandex() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + yandex() + ", but expected " + i + '!';
            this.isPro.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.amazon;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC10687l interfaceC10687l = (InterfaceC10687l) arrayList.get(i2);
            List list = this.purchase;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC9492l) list.get(i3)).ads(interfaceC10687l);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            InterfaceC10687l interfaceC10687l2 = (InterfaceC10687l) arrayList.get(i4);
            int size4 = interfaceC10687l2.billing().amazon.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC9492l) interfaceC10687l2.billing().amazon.get(i5)).ads(interfaceC10687l2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void crashlytics(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.billing.Signature(this);
        Trace.endSection();
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        C9992l c9992l = new C9992l(totalCaptureResult, this.yandex);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9492l) list.get(i)).inmobi(interfaceC10687lSubs, j, c9992l);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i2)).inmobi(interfaceC10687lSubs, j, c9992l);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((InterfaceC9492l) list.get(i3)).mo1762throw(interfaceC10687lSubs, j, c9992l);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = interfaceC10687lSubs.billing().amazon.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i4)).mo1762throw(interfaceC10687lSubs, j, c9992l);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void loadAd(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
        this.billing.Signature(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9492l) list.get(i)).mo1759private(interfaceC10687l, j, interfaceC9595l);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687l.billing().amazon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC9492l) interfaceC10687l.billing().amazon.get(i2)).mo1759private(interfaceC10687l, j, interfaceC9595l);
        }
        Trace.endSection();
    }

    public final void mopub(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.smaato.m3885new(Unit.INSTANCE);
        this.billing.Signature(this);
        if (yandex() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + yandex() + ", but expected " + i + '!';
            this.isPro.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.amazon;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC10687l interfaceC10687l = (InterfaceC10687l) arrayList.get(i2);
            List list = this.purchase;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((InterfaceC9492l) list.get(i3)).adcel(interfaceC10687l, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            InterfaceC10687l interfaceC10687l2 = (InterfaceC10687l) arrayList.get(i4);
            int size4 = interfaceC10687l2.billing().amazon.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((InterfaceC9492l) interfaceC10687l2.billing().amazon.get(i5)).adcel(interfaceC10687l2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        C16853l c16853l;
        Object next;
        Trace.beginSection("onCaptureBufferLost");
        C16755l c16755l = (C16755l) this.mopub.get(surface);
        ArrayMap arrayMap = this.admob;
        if (c16755l == null) {
            C13172l c13172l = (C13172l) arrayMap.get(surface);
            C16755l c16755l2 = null;
            if (c13172l != null) {
                int i = c13172l.yandex;
                Iterator it = this.subs.f12038l.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C16853l) next).yandex != i);
                c16853l = (C16853l) next;
            } else {
                c16853l = null;
            }
            if (c16853l != null) {
                C9494l c9494l = c16853l.isPro;
                if (c9494l == null) {
                    c9494l = null;
                }
                if (c9494l != null) {
                    c16755l2 = new C16755l(c9494l.yandex);
                }
            }
            c16755l = c16755l2;
        }
        C13172l c13172l2 = (C13172l) arrayMap.get(surface);
        if (c16755l == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            C18353l.adcel(sb, " on ", C1266l.yandex(j));
            return;
        }
        if (c13172l2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            C18353l.adcel(sb2, " on ", C1266l.yandex(j));
            return;
        }
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC9492l) list.get(i2)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((InterfaceC9492l) list.get(i4)).billing(interfaceC10687lSubs, j, c16755l.yandex, c13172l2.yandex);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = interfaceC10687lSubs.billing().amazon.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i5)).billing(interfaceC10687lSubs, j, c16755l.yandex, c13172l2.yandex);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        crashlytics(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        Trace.beginSection("onCaptureFailed");
        this.smaato.m3885new(Unit.INSTANCE);
        loadAd(subs(captureRequest), captureFailure.getFrameNumber(), new C7123l(captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        C15331l c15331l = new C15331l(captureResult, this.yandex);
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9492l) list.get(i)).mo1761synchronized(interfaceC10687lSubs, frameNumber, c15331l);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i2)).mo1761synchronized(interfaceC10687lSubs, frameNumber, c15331l);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        billing(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        mopub(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        admob(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        Trace.beginSection("onReadoutStarted");
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC9492l) list.get(i)).mopub(interfaceC10687lSubs, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i2)).mopub(interfaceC10687lSubs, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void purchase(CaptureRequest captureRequest, int i) {
        Trace.beginSection("onCaptureProcessProgressed");
        InterfaceC10687l interfaceC10687lSubs = subs(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.purchase;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC9492l) list.get(i2)).signatures(interfaceC10687lSubs, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = interfaceC10687lSubs.billing().amazon.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((InterfaceC9492l) interfaceC10687lSubs.billing().amazon.get(i3)).signatures(interfaceC10687lSubs, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final InterfaceC10687l subs(CaptureRequest captureRequest) {
        ArrayList arrayList = this.crashlytics;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (InterfaceC10687l) this.amazon.get(i);
            }
        }
        C1759l.smaato("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.firebase;
    }

    public final int yandex() {
        int iIntValue;
        if (this.remoteconfig != null) {
            Integer num = this.remoteconfig;
            if (num != null) {
                return num.intValue();
            }
            C17132l.smaato(33, this, "SequenceNumber has not been set for ");
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.remoteconfig;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }
}
