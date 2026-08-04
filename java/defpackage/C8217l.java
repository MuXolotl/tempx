package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: renamed from: lًۘؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8217l implements InterfaceC13461l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10393l f17111l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final HashMap f17112l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CameraExtensionSession f17113l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2413l f17114l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17115l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Executor f17116l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3897l f17117l;

    public C8217l(C2910l c2910l, CameraExtensionSession cameraExtensionSession, C10393l c10393l, ExecutorC10608l executorC10608l) {
        this.f17114l = c2910l;
        this.f17113l = cameraExtensionSession;
        this.f17111l = c10393l;
        this.f17116l = executorC10608l;
        C11879l c11879l = AbstractC0329l.yandex;
        c11879l.getClass();
        this.f17115l = C11879l.loadAd.incrementAndGet(c11879l);
        C3897l c3897l = new C3897l();
        c3897l.yandex = 0L;
        this.f17117l = c3897l;
        this.f17112l = new HashMap();
    }

    @Override // defpackage.InterfaceC11450l
    public final Integer Signature(CaptureRequest captureRequest, C16053l c16053l) throws Exception {
        String strVip = this.f17114l.vip();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.f17113l;
            Executor executor = this.f17116l;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new C1399l(this, c16053l)) : cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new C1399l(this, c16053l, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            C10393l c10393l = this.f17111l;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c10393l.yandex(strVip, false, 9);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            c10393l.yandex(strVip, true, i2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final boolean mo2275abstract() {
        return false;
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final Integer mo2276case(List list, C16053l c16053l) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2278l((CaptureRequest) it.next(), c16053l);
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.f17113l.close();
    }

    @Override // defpackage.InterfaceC11450l
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lؙؔؑ, reason: contains not printable characters */
    public final Integer mo2277l(List list, C16053l c16053l) {
        if (list.size() == 1) {
            return Signature((CaptureRequest) AbstractC16901l.m4208abstract(list), c16053l);
        }
        C8339l.smaato("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lٔٙٝ, reason: contains not printable characters */
    public final Integer mo2278l(CaptureRequest captureRequest, C16053l c16053l) throws Exception {
        String strVip = this.f17114l.vip();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.f17113l;
            Executor executor = this.f17116l;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, executor, new C1399l(this, c16053l)) : cameraExtensionSession.capture(captureRequest, executor, new C1399l(this, c16053l, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            C10393l c10393l = this.f17111l;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c10393l.yandex(strVip, false, 9);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            c10393l.yandex(strVip, true, i2);
            return null;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final boolean mo2279l() throws Exception {
        Unit unit;
        String strVip = this.f17114l.vip();
        try {
            this.f17113l.stopRepeating();
            unit = Unit.INSTANCE;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            C10393l c10393l = this.f17111l;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                c10393l.yandex(strVip, true, i);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                c10393l.yandex(strVip, false, 9);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final boolean mo2280l(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final InterfaceC2413l mo2281try() {
        return this.f17114l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(C18353l.ads()))) {
            return this.f17113l;
        }
        return null;
    }
}
