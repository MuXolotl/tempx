package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lؔۛۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2910l implements InterfaceC2413l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f6326l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18474l f6327l = AbstractC1805l.yandex(false);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11561l f6328l = AbstractC1805l.crashlytics(null);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CameraDevice f6329l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC5389l f6330l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C0458l f6331l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10393l f6332l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C11969l f6333l;

    public C2910l(InterfaceC5389l interfaceC5389l, CameraDevice cameraDevice, String str, C10393l c10393l, C0458l c0458l, C11969l c11969l) {
        this.f6330l = interfaceC5389l;
        this.f6329l = cameraDevice;
        this.f6326l = str;
        this.f6332l = c10393l;
        this.f6331l = c0458l;
        this.f6333l = c11969l;
    }

    @Override // defpackage.InterfaceC2413l
    public final CaptureRequest.Builder adcel(TotalCaptureResult totalCaptureResult) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateReprocessCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.f6326l;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            C10393l c10393l = this.f6332l;
            try {
                d = 1000000.0d;
                try {
                    try {
                        builderCreateReprocessCaptureRequest = this.f6329l.createReprocessCaptureRequest(totalCaptureResult);
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
                        c10393l.yandex(str, true, i);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c10393l.yandex(str, false, 9);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateReprocessCaptureRequest = null;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
            return builderCreateReprocessCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC2413l
    public final void ads(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.f6326l;
            C10393l c10393l = this.f6332l;
            try {
                AbstractC5121l.metrica(this.f6329l, i);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
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
                    c10393l.yandex(str, true, i2);
                } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    c10393l.yandex(str, false, 9);
                } else {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: continue */
    public final boolean mo833continue(List list, InterfaceC17121l interfaceC17121l) throws Throwable {
        String str;
        int i;
        String str2;
        String str3;
        InterfaceC6262l interfaceC6262l;
        boolean z;
        char c;
        Unit unit;
        int i2;
        C11969l c11969l = this.f6333l;
        CameraDevice cameraDevice = this.f6329l;
        C8195l c8195lYandex = yandex(interfaceC17121l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l2 = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l2 != null) {
            loadAd(interfaceC6262l2);
        }
        String str4 = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strStartapp);
                C10393l c10393l = this.f6332l;
                try {
                    interfaceC6262l = interfaceC6262l2;
                    try {
                        C10393l c10393l2 = this.f6332l;
                        C0458l c0458l = this.f6331l;
                        try {
                            Handler handlerYandex = c11969l.yandex();
                            str3 = strStartapp;
                            z = true;
                            try {
                                cameraDevice.createCaptureSession(list, new C7266l(this, interfaceC17121l, interfaceC6262l, c10393l2, c0458l, handlerYandex), c11969l.yandex());
                                unit = Unit.INSTANCE;
                                c = 0;
                                i2 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i3 = 6;
                                        } else if (reason == 3) {
                                            i3 = 0;
                                        } else if (reason == 4) {
                                            i3 = z;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i3 = 11;
                                        } else {
                                            i3 = 2;
                                        }
                                    }
                                    c10393l.yandex(str4, z, i3);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        c = 0;
                                        c10393l.yandex(str4, false, 9);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                    i2 = z;
                                }
                                c = 0;
                                unit = null;
                                i2 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strStartapp;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strStartapp;
                            c11969l = 1;
                            str = str2;
                            i = c11969l;
                            long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert = AbstractC5020l.advert(str, " - ");
                            Object[] objArr = new Object[i];
                            objArr[0] = Double.valueOf(jVip / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr, i, null, "%.3f ms", sbAdvert));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strStartapp;
                    } catch (Throwable th2) {
                        th = th2;
                        c11969l = 1;
                        str2 = strStartapp;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strStartapp;
                    interfaceC6262l = interfaceC6262l2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strStartapp;
                    c11969l = 1;
                }
                long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                StringBuilder sbAdvert2 = AbstractC5020l.advert(str3, " - ");
                Object[] objArr2 = new Object[i2];
                objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                Log.d("CXCP", AbstractC5020l.license(objArr2, i2, null, "%.3f ms", sbAdvert2));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (interfaceC6262l != null) {
                        crashlytics(interfaceC6262l);
                    }
                }
                if (unit != null) {
                    return i2;
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strStartapp;
            i = 1;
            long jVip3 = AbstractC5020l.vip(jElapsedRealtimeNanos);
            StringBuilder sbAdvert3 = AbstractC5020l.advert(str, " - ");
            Object[] objArr3 = new Object[i];
            objArr3[0] = Double.valueOf(jVip3 / 1000000.0d);
            Log.d("CXCP", AbstractC5020l.license(objArr3, i, null, "%.3f ms", sbAdvert3));
            throw th;
        }
    }

    public final void crashlytics(InterfaceC6262l interfaceC6262l) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            interfaceC6262l.yandex();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x007a, B:20:0x007e, B:22:0x0083, B:24:0x008c, B:32:0x00a3, B:34:0x00a7, B:43:0x00d4, B:50:0x00fb, B:52:0x0100, B:54:0x0106, B:56:0x010a, B:58:0x010e, B:61:0x0113, B:63:0x0117, B:64:0x011d, B:65:0x011e), top: B:78:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x007a, B:20:0x007e, B:22:0x0083, B:24:0x008c, B:32:0x00a3, B:34:0x00a7, B:43:0x00d4, B:50:0x00fb, B:52:0x0100, B:54:0x0106, B:56:0x010a, B:58:0x010e, B:61:0x0113, B:63:0x0117, B:64:0x011d, B:65:0x011e), top: B:78:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:8:0x0039, B:9:0x003e, B:10:0x004f, B:12:0x0055, B:18:0x007a, B:20:0x007e, B:22:0x0083, B:24:0x008c, B:32:0x00a3, B:34:0x00a7, B:43:0x00d4, B:50:0x00fb, B:52:0x0100, B:54:0x0106, B:56:0x010a, B:58:0x010e, B:61:0x0113, B:63:0x0117, B:64:0x011d, B:65:0x011e), top: B:78:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00a7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00d4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x015b, please report this as an issue */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: default */
    public final boolean mo834default(ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        InterfaceC6262l interfaceC6262l;
        C10393l c10393l;
        char c;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z;
        C11969l c11969l = this.f6333l;
        CameraDevice cameraDevice = this.f6329l;
        C8195l c8195lYandex = yandex(interfaceC17121l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l2 = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l2 != null) {
            loadAd(interfaceC6262l2);
        }
        String str = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createCaptureSessionByOutputConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strStartapp);
            C10393l c10393l2 = this.f6332l;
            try {
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((OutputConfiguration) ((C5819l) ((InterfaceC12918l) it.next())).mo842while(AbstractC18202l.yandex.loadAd(OutputConfiguration.class)));
                }
                interfaceC6262l = interfaceC6262l2;
                try {
                    try {
                        c10393l = c10393l2;
                        try {
                            cameraDevice.createCaptureSessionByOutputConfigurations(arrayList2, new C7266l(this, interfaceC17121l, interfaceC6262l, this.f6332l, this.f6331l, c11969l.yandex()), c11969l.yandex());
                            unit = Unit.INSTANCE;
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                C10393l c10393l3 = c10393l;
                                if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    c = 0;
                                    c10393l3.yandex(str, false, 9);
                                    unit = null;
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                                StringBuilder sbAdvert = AbstractC5020l.advert(strStartapp, " - ");
                                Object[] objArr = new Object[1];
                                objArr[c] = Double.valueOf(jVip / 1000000.0d);
                                Log.d("CXCP", AbstractC5020l.license(objArr, 1, null, "%.3f ms", sbAdvert));
                                if (unit == null) {
                                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                    if (interfaceC6262l != null) {
                                        crashlytics(interfaceC6262l);
                                    }
                                }
                                if (unit != null) {
                                    return true;
                                }
                                return false;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z = true;
                            }
                            c10393l.yandex(str, z, i);
                            unit = null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c10393l = c10393l2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    c10393l = c10393l2;
                    if (e instanceof CameraAccessException) {
                        C10393l c10393l4 = c10393l;
                        if (e instanceof IllegalArgumentException) {
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c10393l4.yandex(str, false, 9);
                        unit = null;
                        long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                        StringBuilder sbAdvert2 = AbstractC5020l.advert(strStartapp, " - ");
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                        Log.d("CXCP", AbstractC5020l.license(objArr2, 1, null, "%.3f ms", sbAdvert2));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (interfaceC6262l != null) {
                                crashlytics(interfaceC6262l);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return false;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z = true;
                            i = 0;
                        } else if (reason != 4) {
                            z = true;
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z = true;
                    }
                    c10393l.yandex(str, z, i);
                    unit = null;
                    c = 0;
                    long jVip3 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                    StringBuilder sbAdvert3 = AbstractC5020l.advert(strStartapp, " - ");
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = Double.valueOf(jVip3 / 1000000.0d);
                    Log.d("CXCP", AbstractC5020l.license(objArr3, 1, null, "%.3f ms", sbAdvert3));
                    if (unit == null) {
                        Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                        if (interfaceC6262l != null) {
                            crashlytics(interfaceC6262l);
                        }
                    }
                    if (unit != null) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e4) {
                e = e4;
                interfaceC6262l = interfaceC6262l2;
            }
            c = 0;
            long jVip4 = AbstractC5020l.vip(jElapsedRealtimeNanos);
            StringBuilder sbAdvert4 = AbstractC5020l.advert(strStartapp, " - ");
            Object[] objArr4 = new Object[1];
            objArr4[c] = Double.valueOf(jVip4 / 1000000.0d);
            Log.d("CXCP", AbstractC5020l.license(objArr4, 1, null, "%.3f ms", sbAdvert4));
            if (unit == null) {
                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                if (interfaceC6262l != null) {
                    crashlytics(interfaceC6262l);
                }
            }
            if (unit != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(strStartapp, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x003a, B:9:0x003f, B:10:0x005b, B:12:0x0061, B:14:0x006b, B:36:0x00bf, B:38:0x00c3, B:47:0x00f0, B:54:0x0117, B:56:0x011c, B:58:0x0122, B:60:0x0126, B:62:0x012a, B:65:0x012f, B:67:0x0133, B:68:0x0139, B:69:0x013a, B:23:0x0090, B:25:0x009a, B:27:0x00a7), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x003a, B:9:0x003f, B:10:0x005b, B:12:0x0061, B:14:0x006b, B:36:0x00bf, B:38:0x00c3, B:47:0x00f0, B:54:0x0117, B:56:0x011c, B:58:0x0122, B:60:0x0126, B:62:0x012a, B:65:0x012f, B:67:0x0133, B:68:0x0139, B:69:0x013a, B:23:0x0090, B:25:0x009a, B:27:0x00a7), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x003a, B:9:0x003f, B:10:0x005b, B:12:0x0061, B:14:0x006b, B:36:0x00bf, B:38:0x00c3, B:47:0x00f0, B:54:0x0117, B:56:0x011c, B:58:0x0122, B:60:0x0126, B:62:0x012a, B:65:0x012f, B:67:0x0133, B:68:0x0139, B:69:0x013a, B:23:0x0090, B:25:0x009a, B:27:0x00a7), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:8:0x003a, B:9:0x003f, B:10:0x005b, B:12:0x0061, B:14:0x006b, B:36:0x00bf, B:38:0x00c3, B:47:0x00f0, B:54:0x0117, B:56:0x011c, B:58:0x0122, B:60:0x0126, B:62:0x012a, B:65:0x012f, B:67:0x0133, B:68:0x0139, B:69:0x013a, B:23:0x0090, B:25:0x009a, B:27:0x00a7), top: B:82:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0196 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00f0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0177, please report this as an issue */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: import */
    public final boolean mo835import(C11765l c11765l, ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        C10393l c10393l;
        char c;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z;
        InterfaceC6262l interfaceC6262l;
        C11969l c11969l = this.f6333l;
        CameraDevice cameraDevice = this.f6329l;
        C8195l c8195lYandex = yandex(interfaceC17121l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l2 = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l2 != null) {
            loadAd(interfaceC6262l2);
        }
        String str = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createReprocessableCaptureSessionByConfigurations-", str);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strStartapp);
            C10393l c10393l2 = this.f6332l;
            try {
                InputConfiguration inputConfiguration = new InputConfiguration(c11765l.yandex, c11765l.loadAd, c11765l.crashlytics);
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        interfaceC6262l = interfaceC6262l2;
                        try {
                            arrayList2.add((OutputConfiguration) ((C5819l) ((InterfaceC12918l) it.next())).mo842while(AbstractC18202l.yandex.loadAd(OutputConfiguration.class)));
                            interfaceC6262l2 = interfaceC6262l;
                        } catch (Exception e) {
                            e = e;
                            c10393l = c10393l2;
                            interfaceC6262l2 = interfaceC6262l;
                            if (e instanceof CameraAccessException) {
                                C10393l c10393l3 = c10393l;
                                if (e instanceof IllegalArgumentException) {
                                }
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                c = 0;
                                c10393l3.yandex(str, false, 9);
                                unit = null;
                                long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                                StringBuilder sbAdvert = AbstractC5020l.advert(strStartapp, " - ");
                                Object[] objArr = new Object[1];
                                objArr[c] = Double.valueOf(jVip / 1000000.0d);
                                Log.d("CXCP", AbstractC5020l.license(objArr, 1, null, "%.3f ms", sbAdvert));
                                if (unit == null) {
                                    Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                    if (interfaceC6262l2 != null) {
                                        crashlytics(interfaceC6262l2);
                                    }
                                }
                                if (unit != null) {
                                    return true;
                                }
                                return false;
                            }
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            cameraAccessException = (CameraAccessException) e;
                            reason = cameraAccessException.getReason();
                            i = 3;
                            z = true;
                            if (reason == 1) {
                                if (reason != 2) {
                                    i = 6;
                                } else if (reason != 3) {
                                    z = true;
                                    i = 0;
                                } else if (reason != 4) {
                                    z = true;
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z = true;
                            }
                            c10393l.yandex(str, z, i);
                            unit = null;
                            c = 0;
                            long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert2 = AbstractC5020l.advert(strStartapp, " - ");
                            Object[] objArr2 = new Object[1];
                            objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr2, 1, null, "%.3f ms", sbAdvert2));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (interfaceC6262l2 != null) {
                                    crashlytics(interfaceC6262l2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return false;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c10393l = c10393l2;
                        if (e instanceof CameraAccessException) {
                            C10393l c10393l4 = c10393l;
                            if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                c = 0;
                                c10393l4.yandex(str, false, 9);
                                unit = null;
                            } else {
                                if (!(e instanceof IllegalStateException)) {
                                    throw e;
                                }
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            }
                            long jVip3 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert3 = AbstractC5020l.advert(strStartapp, " - ");
                            Object[] objArr3 = new Object[1];
                            objArr3[c] = Double.valueOf(jVip3 / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr3, 1, null, "%.3f ms", sbAdvert3));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (interfaceC6262l2 != null) {
                                    crashlytics(interfaceC6262l2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return false;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z = true;
                                i = 0;
                            } else if (reason != 4) {
                                z = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z = true;
                        }
                        c10393l.yandex(str, z, i);
                        unit = null;
                        c = 0;
                        long jVip4 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                        StringBuilder sbAdvert4 = AbstractC5020l.advert(strStartapp, " - ");
                        Object[] objArr4 = new Object[1];
                        objArr4[c] = Double.valueOf(jVip4 / 1000000.0d);
                        Log.d("CXCP", AbstractC5020l.license(objArr4, 1, null, "%.3f ms", sbAdvert4));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (interfaceC6262l2 != null) {
                                crashlytics(interfaceC6262l2);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return false;
                    }
                }
                interfaceC6262l = interfaceC6262l2;
                try {
                    c10393l = c10393l2;
                    interfaceC6262l2 = interfaceC6262l;
                    try {
                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, arrayList2, new C7266l(this, interfaceC17121l, interfaceC6262l2, this.f6332l, this.f6331l, c11969l.yandex()), c11969l.yandex());
                        unit = Unit.INSTANCE;
                    } catch (Exception e3) {
                        e = e3;
                        if (e instanceof CameraAccessException) {
                            C10393l c10393l5 = c10393l;
                            if (e instanceof IllegalArgumentException) {
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            c = 0;
                            c10393l5.yandex(str, false, 9);
                            unit = null;
                            long jVip5 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert5 = AbstractC5020l.advert(strStartapp, " - ");
                            Object[] objArr5 = new Object[1];
                            objArr5[c] = Double.valueOf(jVip5 / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr5, 1, null, "%.3f ms", sbAdvert5));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                                if (interfaceC6262l2 != null) {
                                    crashlytics(interfaceC6262l2);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return false;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z = true;
                        if (reason == 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z = true;
                                i = 0;
                            } else if (reason != 4) {
                                z = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z = true;
                        }
                        c10393l.yandex(str, z, i);
                        unit = null;
                    }
                } catch (Exception e4) {
                    e = e4;
                    c10393l = c10393l2;
                    interfaceC6262l2 = interfaceC6262l;
                    if (e instanceof CameraAccessException) {
                        C10393l c10393l6 = c10393l;
                        if (e instanceof IllegalArgumentException) {
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c = 0;
                        c10393l6.yandex(str, false, 9);
                        unit = null;
                        long jVip6 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                        StringBuilder sbAdvert6 = AbstractC5020l.advert(strStartapp, " - ");
                        Object[] objArr6 = new Object[1];
                        objArr6[c] = Double.valueOf(jVip6 / 1000000.0d);
                        Log.d("CXCP", AbstractC5020l.license(objArr6, 1, null, "%.3f ms", sbAdvert6));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                            if (interfaceC6262l2 != null) {
                                crashlytics(interfaceC6262l2);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return false;
                    }
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    cameraAccessException = (CameraAccessException) e;
                    reason = cameraAccessException.getReason();
                    i = 3;
                    z = true;
                    if (reason == 1) {
                        if (reason != 2) {
                            i = 6;
                        } else if (reason != 3) {
                            z = true;
                            i = 0;
                        } else if (reason != 4) {
                            z = true;
                            i = 1;
                        } else if (reason != 5) {
                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                            i = 11;
                        } else {
                            i = 2;
                        }
                        z = true;
                    }
                    c10393l.yandex(str, z, i);
                    unit = null;
                    c = 0;
                    long jVip7 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                    StringBuilder sbAdvert7 = AbstractC5020l.advert(strStartapp, " - ");
                    Object[] objArr7 = new Object[1];
                    objArr7[c] = Double.valueOf(jVip7 / 1000000.0d);
                    Log.d("CXCP", AbstractC5020l.license(objArr7, 1, null, "%.3f ms", sbAdvert7));
                    if (unit == null) {
                        Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                        if (interfaceC6262l2 != null) {
                            crashlytics(interfaceC6262l2);
                        }
                    }
                    if (unit != null) {
                        return true;
                    }
                    return false;
                }
            } catch (Exception e5) {
                e = e5;
            }
            c = 0;
            long jVip8 = AbstractC5020l.vip(jElapsedRealtimeNanos);
            StringBuilder sbAdvert8 = AbstractC5020l.advert(strStartapp, " - ");
            Object[] objArr8 = new Object[1];
            objArr8[c] = Double.valueOf(jVip8 / 1000000.0d);
            Log.d("CXCP", AbstractC5020l.license(objArr8, 1, null, "%.3f ms", sbAdvert8));
            if (unit == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (interfaceC6262l2 != null) {
                    crashlytics(interfaceC6262l2);
                }
            }
            if (unit != null) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(strStartapp, " - ")));
            throw th;
        }
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: instanceof */
    public final void mo836instanceof() {
        if (!this.f6327l.loadAd()) {
            C8339l.smaato("Check failed.");
            return;
        }
        C11561l c11561l = this.f6328l;
        c11561l.getClass();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) C11561l.loadAd.getAndSet(c11561l, null);
        if (interfaceC6262l != null) {
            crashlytics(interfaceC6262l);
        }
    }

    public final void loadAd(InterfaceC6262l interfaceC6262l) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            interfaceC6262l.loadAd();
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final boolean mo837l(InputConfiguration inputConfiguration, ArrayList arrayList, InterfaceC17121l interfaceC17121l) throws Throwable {
        String str;
        int i;
        String str2;
        boolean z;
        InterfaceC6262l interfaceC6262l;
        char c;
        Unit unit;
        int i2;
        C11969l c11969l = this.f6333l;
        CameraDevice cameraDevice = this.f6329l;
        C8195l c8195lYandex = yandex(interfaceC17121l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l2 = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l2 != null) {
            loadAd(interfaceC6262l2);
        }
        String str3 = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createReprocessableCaptureSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(strStartapp);
            C10393l c10393l = this.f6332l;
            try {
                interfaceC6262l = interfaceC6262l2;
                try {
                    C10393l c10393l2 = this.f6332l;
                    C0458l c0458l = this.f6331l;
                    try {
                        Handler handlerYandex = c11969l.yandex();
                        str2 = strStartapp;
                        z = true;
                        try {
                            try {
                                cameraDevice.createReprocessableCaptureSession(inputConfiguration, arrayList, new C7266l(this, interfaceC17121l, interfaceC6262l, c10393l2, c0458l, handlerYandex), c11969l.yandex());
                                unit = Unit.INSTANCE;
                                c = 0;
                                i2 = z;
                            } catch (Throwable th) {
                                th = th;
                                str = str2;
                                i = z;
                                long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                                StringBuilder sbAdvert = AbstractC5020l.advert(str, " - ");
                                Object[] objArr = new Object[i];
                                objArr[0] = Double.valueOf(jVip / 1000000.0d);
                                Log.d("CXCP", AbstractC5020l.license(objArr, i, null, "%.3f ms", sbAdvert));
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof CameraAccessException) {
                                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                CameraAccessException cameraAccessException = (CameraAccessException) e;
                                int reason = cameraAccessException.getReason();
                                int i3 = 3;
                                if (reason != z) {
                                    if (reason == 2) {
                                        i3 = 6;
                                    } else if (reason == 3) {
                                        i3 = 0;
                                    } else if (reason == 4) {
                                        i3 = z;
                                    } else if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i3 = 11;
                                    } else {
                                        i3 = 2;
                                    }
                                }
                                c10393l.yandex(str3, z, i3);
                            } else {
                                if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                    c = 0;
                                    c10393l.yandex(str3, false, 9);
                                } else {
                                    if (!(e instanceof IllegalStateException)) {
                                        throw e;
                                    }
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                }
                                unit = null;
                                i2 = z;
                            }
                            c = 0;
                            unit = null;
                            i2 = z;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = strStartapp;
                        z = true;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = strStartapp;
                        z = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = true;
                    str2 = strStartapp;
                } catch (Throwable th3) {
                    th = th3;
                    z = true;
                    str2 = strStartapp;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = strStartapp;
                interfaceC6262l = interfaceC6262l2;
                z = true;
            } catch (Throwable th4) {
                th = th4;
                str2 = strStartapp;
                z = true;
            }
            long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
            StringBuilder sbAdvert2 = AbstractC5020l.advert(str2, " - ");
            Object[] objArr2 = new Object[i2];
            objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
            Log.d("CXCP", AbstractC5020l.license(objArr2, i2, null, "%.3f ms", sbAdvert2));
            if (unit == null) {
                Log.w("CXCP", "Failed to create reprocess session from " + cameraDevice + ". Finalizing previous session");
                if (interfaceC6262l != null) {
                    crashlytics(interfaceC6262l);
                }
            }
            if (unit != null) {
                return i2;
            }
            return false;
        } catch (Throwable th5) {
            th = th5;
            str = strStartapp;
            i = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ef A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:24:0x009d, B:26:0x00a9, B:28:0x00af, B:30:0x00c5, B:35:0x00cf, B:36:0x00d6, B:37:0x00d7, B:45:0x00eb, B:47:0x00ef, B:56:0x011c, B:62:0x013b, B:65:0x0141, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0152, B:76:0x0156, B:77:0x015c, B:78:0x015d), top: B:98:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:24:0x009d, B:26:0x00a9, B:28:0x00af, B:30:0x00c5, B:35:0x00cf, B:36:0x00d6, B:37:0x00d7, B:45:0x00eb, B:47:0x00ef, B:56:0x011c, B:62:0x013b, B:65:0x0141, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0152, B:76:0x0156, B:77:0x015c, B:78:0x015d), top: B:98:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0133  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141 A[Catch: all -> 0x00c9, TryCatch #4 {all -> 0x00c9, blocks: (B:24:0x009d, B:26:0x00a9, B:28:0x00af, B:30:0x00c5, B:35:0x00cf, B:36:0x00d6, B:37:0x00d7, B:45:0x00eb, B:47:0x00ef, B:56:0x011c, B:62:0x013b, B:65:0x0141, B:67:0x0145, B:69:0x0149, B:71:0x014d, B:74:0x0152, B:76:0x0156, B:77:0x015c, B:78:0x015d), top: B:98:0x003c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00ef, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x011c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x019c, please report this as an issue */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final boolean mo838l(C9212l c9212l) throws Throwable {
        String str;
        long j;
        String str2;
        char c;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z;
        ExecutorC10608l executorC10608l = c9212l.loadAd;
        CameraDevice cameraDevice = this.f6329l;
        Integer num = c9212l.billing;
        C8796l c8796l = c9212l.mopub;
        C8195l c8195lYandex = yandex(c8796l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l != null) {
            loadAd(interfaceC6262l);
        }
        String str3 = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createExtensionSession-", str3);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strStartapp);
                C10393l c10393l = this.f6332l;
                try {
                    int iIntValue = num.intValue();
                    ArrayList arrayList = c9212l.yandex;
                    j = jElapsedRealtimeNanos;
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    int i2 = iIntValue;
                                    C8796l c8796l2 = c8796l;
                                    arrayList2.add(C13502l.crashlytics(((C5819l) ((InterfaceC12918l) it.next())).mo842while(AbstractC18202l.yandex.loadAd(C13502l.amazon()))));
                                    iIntValue = i2;
                                    c8796l = c8796l2;
                                } catch (Throwable th) {
                                    th = th;
                                    str = "%.3f ms";
                                    Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(j) / 1000000.0d)}, 1, null, str, AbstractC5020l.advert(strStartapp, " - ")));
                                    throw th;
                                }
                            }
                            str2 = "%.3f ms";
                            try {
                                ExtensionSessionConfiguration extensionSessionConfiguration = new ExtensionSessionConfiguration(iIntValue, arrayList2, executorC10608l, new C17819l(this, c8796l, interfaceC6262l, this.f6332l, this.f6331l, executorC10608l));
                                InterfaceC12918l interfaceC12918l = c9212l.admob;
                                if (interfaceC12918l != null && Build.VERSION.SDK_INT >= 34) {
                                    OutputConfiguration outputConfigurationCrashlytics = C13502l.crashlytics(((C5819l) interfaceC12918l).mo842while(AbstractC18202l.yandex.loadAd(C13502l.amazon())));
                                    if (outputConfigurationCrashlytics == null) {
                                        throw new IllegalStateException("Failed to unwrap Postview OutputConfiguration");
                                    }
                                    AbstractC5917l.m1866extends(extensionSessionConfiguration, outputConfigurationCrashlytics);
                                }
                                cameraDevice.createExtensionSession(extensionSessionConfiguration);
                                unit = Unit.INSTANCE;
                                c = 0;
                            } catch (Exception e) {
                                e = e;
                                if (!(e instanceof CameraAccessException)) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            i = 6;
                                        } else if (reason != 3) {
                                            z = true;
                                            i = 0;
                                        } else if (reason != 4) {
                                            z = true;
                                            i = 1;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                        z = true;
                                    }
                                    c10393l.yandex(str3, z, i);
                                } else {
                                    if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        c = 0;
                                        c10393l.yandex(str3, false, 9);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                }
                                c = 0;
                                unit = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = "%.3f ms";
                            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(j) / 1000000.0d)}, 1, null, str, AbstractC5020l.advert(strStartapp, " - ")));
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = "%.3f ms";
                        if (!(e instanceof CameraAccessException)) {
                            if (e instanceof IllegalArgumentException) {
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            c = 0;
                            c10393l.yandex(str3, false, 9);
                            unit = null;
                            long jVip = AbstractC5020l.vip(j);
                            StringBuilder sbAdvert = AbstractC5020l.advert(strStartapp, " - ");
                            Object[] objArr = new Object[1];
                            objArr[c] = Double.valueOf(jVip / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr, 1, null, str2, sbAdvert));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                                if (interfaceC6262l != null) {
                                    crashlytics(interfaceC6262l);
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return false;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z = true;
                        if (reason != 1) {
                            if (reason != 2) {
                                i = 6;
                            } else if (reason != 3) {
                                z = true;
                                i = 0;
                            } else if (reason != 4) {
                                z = true;
                                i = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i = 11;
                            } else {
                                i = 2;
                            }
                            z = true;
                        }
                        c10393l.yandex(str3, z, i);
                        c = 0;
                        unit = null;
                        long jVip2 = AbstractC5020l.vip(j);
                        StringBuilder sbAdvert2 = AbstractC5020l.advert(strStartapp, " - ");
                        Object[] objArr2 = new Object[1];
                        objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                        Log.d("CXCP", AbstractC5020l.license(objArr2, 1, null, str2, sbAdvert2));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                            if (interfaceC6262l != null) {
                                crashlytics(interfaceC6262l);
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = jElapsedRealtimeNanos;
                } catch (Throwable th3) {
                    th = th3;
                    j = jElapsedRealtimeNanos;
                }
                long jVip3 = AbstractC5020l.vip(j);
                StringBuilder sbAdvert3 = AbstractC5020l.advert(strStartapp, " - ");
                Object[] objArr3 = new Object[1];
                objArr3[c] = Double.valueOf(jVip3 / 1000000.0d);
                Log.d("CXCP", AbstractC5020l.license(objArr3, 1, null, str2, sbAdvert3));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create extension session from " + cameraDevice + ". Finalizing previous session");
                    if (interfaceC6262l != null) {
                        crashlytics(interfaceC6262l);
                    }
                }
                if (unit != null) {
                    return true;
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
                str = "%.3f ms";
                j = jElapsedRealtimeNanos;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: private */
    public final CaptureRequest.Builder mo839private(int i) throws Throwable {
        double d;
        CaptureRequest.Builder builderCreateCaptureRequest;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.f6326l;
        sb.append(str);
        String string = sb.toString();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(string);
            C10393l c10393l = this.f6332l;
            try {
                d = 1000000.0d;
                try {
                    try {
                        builderCreateCaptureRequest = this.f6329l.createCaptureRequest(i);
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
                        int i2 = 3;
                        if (reason != 1) {
                            if (reason == 2) {
                                i2 = 6;
                            } else if (reason == 3) {
                                i2 = 0;
                            } else if (reason == 4) {
                                i2 = 1;
                            } else if (reason != 5) {
                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                i2 = 11;
                            } else {
                                i2 = 2;
                            }
                        }
                        c10393l.yandex(str, true, i2);
                    } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        c10393l.yandex(str, false, 9);
                    } else {
                        if (!(e instanceof IllegalStateException)) {
                            throw e;
                        }
                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    }
                    builderCreateCaptureRequest = null;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", AbstractC5020l.advert(string, " - ")));
            return builderCreateCaptureRequest;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.InterfaceC2413l
    public final void signatures() {
        InterfaceC6262l interfaceC6262l;
        if (!this.f6327l.yandex() || (interfaceC6262l = (InterfaceC6262l) this.f6328l.yandex) == null) {
            return;
        }
        loadAd(interfaceC6262l);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x024f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0267  */
    /* JADX WARN: Code duplicated, block: B:110:0x026e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0270 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0199 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:26:0x00aa, B:28:0x00b3, B:30:0x00b9, B:35:0x00ca, B:38:0x00f5, B:39:0x0115, B:41:0x011b, B:42:0x0129, B:43:0x0133, B:45:0x0139, B:47:0x014b, B:49:0x0158, B:50:0x015c, B:52:0x016d, B:55:0x0176, B:56:0x0179, B:58:0x017b, B:59:0x017e, B:68:0x0195, B:70:0x0199, B:79:0x01c6, B:87:0x01eb, B:89:0x01f0, B:91:0x01f6, B:93:0x01fa, B:95:0x01fe, B:98:0x0203, B:100:0x0207, B:101:0x020d, B:102:0x020e), top: B:117:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c6 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:26:0x00aa, B:28:0x00b3, B:30:0x00b9, B:35:0x00ca, B:38:0x00f5, B:39:0x0115, B:41:0x011b, B:42:0x0129, B:43:0x0133, B:45:0x0139, B:47:0x014b, B:49:0x0158, B:50:0x015c, B:52:0x016d, B:55:0x0176, B:56:0x0179, B:58:0x017b, B:59:0x017e, B:68:0x0195, B:70:0x0199, B:79:0x01c6, B:87:0x01eb, B:89:0x01f0, B:91:0x01f6, B:93:0x01fa, B:95:0x01fe, B:98:0x0203, B:100:0x0207, B:101:0x020d, B:102:0x020e), top: B:117:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f0 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:26:0x00aa, B:28:0x00b3, B:30:0x00b9, B:35:0x00ca, B:38:0x00f5, B:39:0x0115, B:41:0x011b, B:42:0x0129, B:43:0x0133, B:45:0x0139, B:47:0x014b, B:49:0x0158, B:50:0x015c, B:52:0x016d, B:55:0x0176, B:56:0x0179, B:58:0x017b, B:59:0x017e, B:68:0x0195, B:70:0x0199, B:79:0x01c6, B:87:0x01eb, B:89:0x01f0, B:91:0x01f6, B:93:0x01fa, B:95:0x01fe, B:98:0x0203, B:100:0x0207, B:101:0x020d, B:102:0x020e), top: B:117:0x003d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x024f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0199, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01c6, please report this as an issue */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: synchronized */
    public final boolean mo840synchronized(C7104l c7104l) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        Unit unit;
        CameraAccessException cameraAccessException;
        int reason;
        int i;
        boolean z;
        CameraDevice cameraDevice = this.f6329l;
        List list = c7104l.loadAd;
        C8195l c8195lYandex = yandex(c7104l.purchase);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l != null) {
            loadAd(interfaceC6262l);
            Unit unit2 = Unit.INSTANCE;
        }
        String str5 = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createCaptureSession-", str5);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strStartapp);
                C10393l c10393l = this.f6332l;
                try {
                    int i2 = c7104l.yandex;
                    ArrayList arrayList = c7104l.crashlytics;
                    str3 = "%.3f ms";
                    try {
                        try {
                            ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList2.add(C13502l.crashlytics(((C5819l) ((InterfaceC12918l) it.next())).mo842while(AbstractC18202l.yandex.loadAd(C13502l.amazon()))));
                                } catch (Throwable th) {
                                    th = th;
                                    str2 = " - ";
                                    str = str3;
                                    Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, AbstractC5020l.advert(strStartapp, str2)));
                                    throw th;
                                }
                            }
                            try {
                                str4 = " - ";
                                c10393l = c10393l;
                                try {
                                    SessionConfiguration sessionConfigurationYandex = AbstractC1172l.yandex(i2, arrayList2, c7104l.amazon, new C7266l(this, c7104l.purchase, interfaceC6262l, this.f6332l, this.f6331l, this.f6333l.yandex()));
                                    if (list != null) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            AbstractC13950l.m3809final(sessionConfigurationYandex, AbstractC12148l.advert(str5, list));
                                        } else {
                                            AbstractC13950l.m3809final(sessionConfigurationYandex, new InputConfiguration(((C11765l) AbstractC16901l.m4208abstract(list)).yandex, ((C11765l) AbstractC16901l.m4208abstract(list)).loadAd, ((C11765l) AbstractC16901l.m4208abstract(list)).crashlytics));
                                        }
                                    }
                                    try {
                                        Trace.beginSection("createCaptureRequest");
                                        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(c7104l.billing);
                                        Trace.endSection();
                                        Set set = (Set) ((C10861l) this.f6330l).f21958l.getValue();
                                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(set, 10));
                                        Iterator it2 = set.iterator();
                                        while (it2.hasNext()) {
                                            arrayList3.add(((CaptureRequest.Key) it2.next()).getName());
                                        }
                                        for (Map.Entry entry : c7104l.mopub.entrySet()) {
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if ((key instanceof CaptureRequest.Key) && arrayList3.contains(((CaptureRequest.Key) key).getName())) {
                                                AbstractC7370l.subs(builderCreateCaptureRequest, key, value);
                                            }
                                        }
                                        AbstractC13950l.m3814instanceof(sessionConfigurationYandex, builderCreateCaptureRequest.build());
                                        try {
                                            Trace.beginSection("Api28Compat.createCaptureSession");
                                            AbstractC13950l.firebase(cameraDevice, sessionConfigurationYandex);
                                            Unit unit3 = Unit.INSTANCE;
                                            Trace.endSection();
                                            unit = Unit.INSTANCE;
                                            c = 0;
                                            long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                                            StringBuilder sbAdvert = AbstractC5020l.advert(strStartapp, str4);
                                            Object[] objArr = new Object[1];
                                            objArr[c] = Double.valueOf(jVip / 1000000.0d);
                                            Log.d("CXCP", AbstractC5020l.license(objArr, 1, null, str3, sbAdvert));
                                            if (unit == null) {
                                                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                                if (interfaceC6262l != null) {
                                                    crashlytics(interfaceC6262l);
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                            }
                                            if (unit != null) {
                                                return true;
                                            }
                                            return false;
                                        } catch (Throwable th2) {
                                            Trace.endSection();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        Trace.endSection();
                                        throw th3;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (e instanceof CameraAccessException) {
                                        C10393l c10393l2 = c10393l;
                                        if (!(e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                            c = 0;
                                            c10393l2.yandex(str5, false, 9);
                                            unit = null;
                                        } else {
                                            if (!(e instanceof IllegalStateException)) {
                                                throw e;
                                            }
                                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                        }
                                        long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                                        StringBuilder sbAdvert2 = AbstractC5020l.advert(strStartapp, str4);
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                                        Log.d("CXCP", AbstractC5020l.license(objArr2, 1, null, str3, sbAdvert2));
                                        if (unit == null) {
                                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                            if (interfaceC6262l != null) {
                                                crashlytics(interfaceC6262l);
                                                Unit unit5 = Unit.INSTANCE;
                                            }
                                        }
                                        if (unit != null) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    cameraAccessException = (CameraAccessException) e;
                                    reason = cameraAccessException.getReason();
                                    i = 3;
                                    z = true;
                                    if (reason != 1) {
                                        if (reason != 2) {
                                            if (reason != 3) {
                                                i = 0;
                                            } else if (reason != 4) {
                                                i = 1;
                                            } else if (reason != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                                i = 11;
                                            } else {
                                                i = 2;
                                            }
                                            z = true;
                                        } else {
                                            i = 6;
                                        }
                                        z = true;
                                    } else {
                                        c10393l = c10393l;
                                    }
                                    c10393l.yandex(str5, z, i);
                                    unit = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str4 = " - ";
                                c10393l = c10393l;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = str3;
                            str2 = " - ";
                            Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, str, AbstractC5020l.advert(strStartapp, str2)));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str4 = " - ";
                        if (e instanceof CameraAccessException) {
                            C10393l c10393l3 = c10393l;
                            if (e instanceof IllegalArgumentException) {
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            c = 0;
                            c10393l3.yandex(str5, false, 9);
                            unit = null;
                            long jVip3 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert3 = AbstractC5020l.advert(strStartapp, str4);
                            Object[] objArr3 = new Object[1];
                            objArr3[c] = Double.valueOf(jVip3 / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr3, 1, null, str3, sbAdvert3));
                            if (unit == null) {
                                Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                                if (interfaceC6262l != null) {
                                    crashlytics(interfaceC6262l);
                                    Unit unit6 = Unit.INSTANCE;
                                }
                            }
                            if (unit != null) {
                                return true;
                            }
                            return false;
                        }
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        cameraAccessException = (CameraAccessException) e;
                        reason = cameraAccessException.getReason();
                        i = 3;
                        z = true;
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    i = 0;
                                } else if (reason != 4) {
                                    i = 1;
                                } else if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i = 11;
                                } else {
                                    i = 2;
                                }
                                z = true;
                            } else {
                                i = 6;
                            }
                            z = true;
                        } else {
                            c10393l = c10393l;
                        }
                        c10393l.yandex(str5, z, i);
                        unit = null;
                        c = 0;
                        long jVip4 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                        StringBuilder sbAdvert4 = AbstractC5020l.advert(strStartapp, str4);
                        Object[] objArr4 = new Object[1];
                        objArr4[c] = Double.valueOf(jVip4 / 1000000.0d);
                        Log.d("CXCP", AbstractC5020l.license(objArr4, 1, null, str3, sbAdvert4));
                        if (unit == null) {
                            Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                            if (interfaceC6262l != null) {
                                crashlytics(interfaceC6262l);
                                Unit unit7 = Unit.INSTANCE;
                            }
                        }
                        if (unit != null) {
                            return true;
                        }
                        return false;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = "%.3f ms";
                } catch (Throwable th5) {
                    th = th5;
                    str3 = "%.3f ms";
                }
            } catch (Throwable th6) {
                th = th6;
                str = "%.3f ms";
                str2 = " - ";
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: throw */
    public final boolean mo841throw(ArrayList arrayList, InterfaceC17121l interfaceC17121l) throws Throwable {
        String str;
        int i;
        String str2;
        String str3;
        InterfaceC6262l interfaceC6262l;
        boolean z;
        char c;
        Unit unit;
        int i2;
        C11969l c11969l = this.f6333l;
        CameraDevice cameraDevice = this.f6329l;
        C8195l c8195lYandex = yandex(interfaceC17121l);
        boolean zBooleanValue = ((Boolean) c8195lYandex.f17098l).booleanValue();
        InterfaceC6262l interfaceC6262l2 = (InterfaceC6262l) c8195lYandex.f17097l;
        if (!zBooleanValue) {
            return false;
        }
        if (interfaceC6262l2 != null) {
            loadAd(interfaceC6262l2);
        }
        String str4 = this.f6326l;
        String strStartapp = AbstractC14814l.startapp("CXCP#createConstrainedHighSpeedCaptureSession-", str4);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                Trace.beginSection(strStartapp);
                C10393l c10393l = this.f6332l;
                try {
                    interfaceC6262l = interfaceC6262l2;
                    try {
                        C10393l c10393l2 = this.f6332l;
                        C0458l c0458l = this.f6331l;
                        try {
                            Handler handlerYandex = c11969l.yandex();
                            str3 = strStartapp;
                            z = true;
                            try {
                                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, new C7266l(this, interfaceC17121l, interfaceC6262l, c10393l2, c0458l, handlerYandex), c11969l.yandex());
                                unit = Unit.INSTANCE;
                                c = 0;
                                i2 = z;
                            } catch (Exception e) {
                                e = e;
                                if (e instanceof CameraAccessException) {
                                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                                    int reason = cameraAccessException.getReason();
                                    int i3 = 3;
                                    if (reason != z) {
                                        if (reason == 2) {
                                            i3 = 6;
                                        } else if (reason == 3) {
                                            i3 = 0;
                                        } else if (reason == 4) {
                                            i3 = z;
                                        } else if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i3 = 11;
                                        } else {
                                            i3 = 2;
                                        }
                                    }
                                    c10393l.yandex(str4, z, i3);
                                } else {
                                    if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                                        c = 0;
                                        c10393l.yandex(str4, false, 9);
                                    } else {
                                        if (!(e instanceof IllegalStateException)) {
                                            throw e;
                                        }
                                        Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                    }
                                    unit = null;
                                    i2 = z;
                                }
                                c = 0;
                                unit = null;
                                i2 = z;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str3 = strStartapp;
                            z = true;
                        } catch (Throwable th) {
                            th = th;
                            str2 = strStartapp;
                            c11969l = 1;
                            str = str2;
                            i = c11969l;
                            long jVip = AbstractC5020l.vip(jElapsedRealtimeNanos);
                            StringBuilder sbAdvert = AbstractC5020l.advert(str, " - ");
                            Object[] objArr = new Object[i];
                            objArr[0] = Double.valueOf(jVip / 1000000.0d);
                            Log.d("CXCP", AbstractC5020l.license(objArr, i, null, "%.3f ms", sbAdvert));
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z = true;
                        str3 = strStartapp;
                    } catch (Throwable th2) {
                        th = th2;
                        c11969l = 1;
                        str2 = strStartapp;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str3 = strStartapp;
                    interfaceC6262l = interfaceC6262l2;
                    z = true;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = strStartapp;
                    c11969l = 1;
                }
                long jVip2 = AbstractC5020l.vip(jElapsedRealtimeNanos);
                StringBuilder sbAdvert2 = AbstractC5020l.advert(str3, " - ");
                Object[] objArr2 = new Object[i2];
                objArr2[c] = Double.valueOf(jVip2 / 1000000.0d);
                Log.d("CXCP", AbstractC5020l.license(objArr2, i2, null, "%.3f ms", sbAdvert2));
                if (unit == null) {
                    Log.w("CXCP", "Failed to create capture session from " + cameraDevice + ". Finalizing previous session");
                    if (interfaceC6262l != null) {
                        crashlytics(interfaceC6262l);
                    }
                }
                if (unit != null) {
                    return i2;
                }
                return false;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            str = strStartapp;
            i = 1;
            long jVip3 = AbstractC5020l.vip(jElapsedRealtimeNanos);
            StringBuilder sbAdvert3 = AbstractC5020l.advert(str, " - ");
            Object[] objArr3 = new Object[i];
            objArr3[0] = Double.valueOf(jVip3 / 1000000.0d);
            Log.d("CXCP", AbstractC5020l.license(objArr3, i, null, "%.3f ms", sbAdvert3));
            throw th;
        }
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) C10160l.loadAd(this.f6326l)) + ')';
    }

    @Override // defpackage.InterfaceC2413l
    public final String vip() {
        return this.f6326l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        if (interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CameraDevice.class))) {
            return this.f6329l;
        }
        return null;
    }

    public final C8195l yandex(InterfaceC6262l interfaceC6262l) {
        if (this.f6327l.loadAd()) {
            crashlytics(interfaceC6262l);
            return new C8195l(Boolean.FALSE, null);
        }
        Boolean bool = Boolean.TRUE;
        C11561l c11561l = this.f6328l;
        c11561l.getClass();
        return new C8195l(bool, C11561l.loadAd.getAndSet(c11561l, interfaceC6262l));
    }
}
