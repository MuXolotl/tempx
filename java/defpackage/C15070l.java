package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٟٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C15070l implements InterfaceC11450l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10393l f29601l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CameraCaptureSession f29602l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2413l f29603l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Handler f29604l;

    public C15070l(InterfaceC2413l interfaceC2413l, CameraCaptureSession cameraCaptureSession, C10393l c10393l, Handler handler) {
        this.f29603l = interfaceC2413l;
        this.f29602l = cameraCaptureSession;
        this.f29601l = c10393l;
        this.f29604l = handler;
        C11879l c11879l = AbstractC0329l.yandex;
        c11879l.getClass();
        C11879l.loadAd.incrementAndGet(c11879l);
    }

    @Override // defpackage.InterfaceC11450l
    public final Integer Signature(CaptureRequest captureRequest, C16053l c16053l) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            d = 1000000.0d;
            try {
                try {
                    numValueOf = Integer.valueOf(this.f29602l.setRepeatingRequest(captureRequest, c16053l, this.f29604l));
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
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
                    numValueOf = null;
                }
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: abstract */
    public final boolean mo2275abstract() throws Throwable {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            try {
                this.f29602l.abortCaptures();
                unit = Unit.INSTANCE;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: case */
    public final Integer mo2276case(List list, C16053l c16053l) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            d = 1000000.0d;
            try {
                try {
                    numValueOf = Integer.valueOf(this.f29602l.captureBurst(list, c16053l, this.f29604l));
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
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
                    numValueOf = null;
                }
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f29602l.close();
    }

    @Override // defpackage.InterfaceC11450l
    public final Surface getInputSurface() {
        return this.f29602l.getInputSurface();
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lؙؔؑ */
    public final Integer mo2277l(List list, C16053l c16053l) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            d = 1000000.0d;
            try {
                try {
                    numValueOf = Integer.valueOf(this.f29602l.setRepeatingBurst(list, c16053l, this.f29604l));
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
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
                    numValueOf = null;
                }
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lٔٙٝ */
    public final Integer mo2278l(CaptureRequest captureRequest, C16053l c16053l) throws Throwable {
        double d;
        Integer numValueOf;
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            d = 1000000.0d;
            try {
                try {
                    numValueOf = Integer.valueOf(this.f29602l.capture(captureRequest, c16053l, this.f29604l));
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
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
                    numValueOf = null;
                }
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                return numValueOf;
            } catch (Throwable th) {
                th = th;
                Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lَٖؔ */
    public final boolean mo2279l() throws Throwable {
        double d;
        Unit unit;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            try {
                this.f29602l.stopRepeating();
                unit = Unit.INSTANCE;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: lؙٗٙ */
    public final boolean mo2280l(List list) throws Throwable {
        double d;
        Unit unit;
        if (Build.VERSION.SDK_INT < 26) {
            C8339l.smaato("Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed.");
            return false;
        }
        StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
        InterfaceC2413l interfaceC2413l = this.f29603l;
        sb.append(interfaceC2413l.vip());
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            String strVip = interfaceC2413l.vip();
            C10393l c10393l = this.f29601l;
            try {
                CameraCaptureSession cameraCaptureSession = this.f29602l;
                d = 1000000.0d;
                try {
                    try {
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(C13502l.crashlytics(((C5819l) ((InterfaceC12918l) it.next())).mo842while(AbstractC18202l.yandex.loadAd(C13502l.amazon()))));
                        }
                        AbstractC5941l.pro(cameraCaptureSession, arrayList);
                        unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    if (e instanceof CameraAccessException) {
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
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
            return unit != null;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC11450l
    /* JADX INFO: renamed from: try */
    public final InterfaceC2413l mo2281try() {
        return this.f29603l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CameraCaptureSession.class))) {
            return this.f29602l;
        }
        return null;
    }
}
