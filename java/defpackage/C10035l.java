package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: renamed from: lَؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10035l implements InterfaceC9492l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final LinkedHashMap f20455l = new LinkedHashMap();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8688l f20454l = new C8688l(new C7703l(25));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public volatile Map f20453l = C14054l.f27396l;

    public static int crashlytics(InterfaceC10687l interfaceC10687l) {
        C12920l c12920l = (C12920l) interfaceC10687l.loadAd(AbstractC14471l.yandex);
        Object obj = c12920l != null ? c12920l.yandex.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC9492l
    public final void adcel(InterfaceC10687l interfaceC10687l, long j) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                CameraCaptureSession cameraCaptureSessionLoadAd = loadAd(interfaceC10687l);
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(AbstractC18202l.yandex.loadAd(CaptureRequest.class));
                if (cameraCaptureSessionLoadAd != null && captureRequest != null) {
                    executor.execute(new RunnableC3950l(0, j, (C18505l) abstractC4829l, cameraCaptureSessionLoadAd));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void ads(InterfaceC10687l interfaceC10687l) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                C2336l c2336l = AbstractC18202l.yandex;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new RunnableC7762l((C18505l) abstractC4829l, cameraCaptureSession, 13));
                }
            } else {
                executor.execute(new RunnableC15713l(abstractC4829l, this, interfaceC10687l, 1));
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void billing(InterfaceC10687l interfaceC10687l, final long j, int i, int i2) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (Build.VERSION.SDK_INT >= 24 && (abstractC4829l instanceof C18505l)) {
                C2336l c2336l = AbstractC18202l.yandex;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                final Surface surface = (Surface) interfaceC10687l.mo2962package().get(new C16755l(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final C18505l c18505l = (C18505l) abstractC4829l;
                    executor.execute(new Runnable() { // from class: lؘۙ۟
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC11965l.tapsense(c18505l.yandex, cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void isVip(InterfaceC10687l interfaceC10687l, long j, long j2) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                CameraCaptureSession cameraCaptureSessionLoadAd = loadAd(interfaceC10687l);
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(AbstractC18202l.yandex.loadAd(CaptureRequest.class));
                if (cameraCaptureSessionLoadAd != null && captureRequest != null) {
                    executor.execute(new RunnableC11690l((C18505l) abstractC4829l, cameraCaptureSessionLoadAd, captureRequest, j2, j, 0));
                }
            } else {
                executor.execute(new RunnableC15713l(abstractC4829l, this, interfaceC10687l, 0));
            }
        }
    }

    public final CameraCaptureSession loadAd(InterfaceC10687l interfaceC10687l) {
        C2336l c2336l = AbstractC18202l.yandex;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || ((CameraExtensionSession) interfaceC10687l.mo842while(c2336l.loadAd(C18353l.ads()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.f20454l.getValue();
    }

    @Override // defpackage.InterfaceC9492l
    public final void mopub(InterfaceC10687l interfaceC10687l, long j, long j2) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                C2336l c2336l = AbstractC18202l.yandex;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new RunnableC11690l((C18505l) abstractC4829l, cameraCaptureSession, captureRequest, j2, j, 1));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: private */
    public final void mo1759private(InterfaceC10687l interfaceC10687l, long j, InterfaceC9595l interfaceC9595l) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                CameraCaptureSession cameraCaptureSessionLoadAd = loadAd(interfaceC10687l);
                C2336l c2336l = AbstractC18202l.yandex;
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) interfaceC9595l.mo842while(c2336l.loadAd(CaptureFailure.class));
                if (cameraCaptureSessionLoadAd != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new RunnableC4063l((C18505l) abstractC4829l, cameraCaptureSessionLoadAd, captureRequest, captureFailure, 1));
                }
            } else {
                executor.execute(new RunnableC10613l(abstractC4829l, this, interfaceC10687l, new C18450l(26), 7));
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    public final void signatures(InterfaceC10687l interfaceC10687l, int i) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                C2336l c2336l = AbstractC18202l.yandex;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) interfaceC10687l.mo842while(c2336l.loadAd(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new RunnableC18542l((C18505l) abstractC4829l, cameraCaptureSession, captureRequest, captureResult, 0));
                }
            } else {
                executor.execute(new RunnableC2027l(abstractC4829l, this, interfaceC10687l, i));
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: switch */
    public final void mo1760switch(C15390l c15390l) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = c15390l.crashlytics.get(AbstractC14471l.yandex);
            C12920l c12920l = obj instanceof C12920l ? (C12920l) obj : null;
            Object obj2 = c12920l != null ? c12920l.yandex.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new RunnableC9534l(abstractC4829l, num != null ? num.intValue() : -1, 3));
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1761synchronized(InterfaceC10687l interfaceC10687l, long j, C15331l c15331l) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                C2336l c2336l = AbstractC18202l.yandex;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) interfaceC10687l.mo842while(c2336l.loadAd(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) c15331l.mo842while(c2336l.loadAd(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new RunnableC18542l((C18505l) abstractC4829l, cameraCaptureSession, captureRequest, captureResult, 1));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: throw */
    public final void mo1762throw(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
        for (Map.Entry entry : this.f20453l.entrySet()) {
            AbstractC4829l abstractC4829l = (AbstractC4829l) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (abstractC4829l instanceof C18505l) {
                CameraCaptureSession cameraCaptureSessionLoadAd = loadAd(interfaceC10687l);
                C2336l c2336l = AbstractC18202l.yandex;
                CaptureRequest captureRequest = (CaptureRequest) interfaceC10687l.mo842while(c2336l.loadAd(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) c9992l.mo842while(c2336l.loadAd(TotalCaptureResult.class));
                if (cameraCaptureSessionLoadAd != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new RunnableC4063l((C18505l) abstractC4829l, cameraCaptureSessionLoadAd, captureRequest, totalCaptureResult, 0));
                }
            } else {
                executor.execute(new RunnableC10613l(abstractC4829l, this, interfaceC10687l, new C9992l(interfaceC10687l, c9992l), 6));
            }
        }
    }

    public final void yandex(AbstractC4829l abstractC4829l, Executor executor) {
        if (this.f20453l.containsKey(abstractC4829l)) {
            throw new IllegalStateException((abstractC4829l + " was already registered!").toString());
        }
        synchronized (this.f20455l) {
            this.f20455l.put(abstractC4829l, executor);
            this.f20453l = AbstractC8676l.tapsense(this.f20455l);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC9492l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1758package(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void vip(InterfaceC10687l interfaceC10687l) {
    }

    @Override // defpackage.InterfaceC9492l
    public final /* synthetic */ void inmobi(InterfaceC10687l interfaceC10687l, long j, C9992l c9992l) {
    }
}
