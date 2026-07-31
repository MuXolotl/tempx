package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٖؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2099l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ String f4695l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C14232l f4696l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2099l(String str, C14232l c14232l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f4695l = str;
        this.f4696l = c14232l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Boolean boolValueOf;
        int i;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i2;
        AbstractC2829l.crashlytics(obj);
        String str = this.f4695l;
        C14232l c14232l = this.f4696l;
        InterfaceC15897l interfaceC15897l = c14232l.yandex;
        C10393l c10393l = c14232l.crashlytics;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) interfaceC15897l.get()).isCameraDeviceSetupSupported(str));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason == 1) {
                    i = 3;
                } else if (reason == 2) {
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
            boolValueOf = null;
        }
        if (!AbstractC8576l.yandex(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) C10160l.loadAd(str)));
        try {
            cameraDeviceSetup = ((CameraManager) interfaceC15897l.get()).getCameraDeviceSetup(str);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                int reason2 = cameraAccessException2.getReason();
                if (reason2 == 1) {
                    i2 = 3;
                } else if (reason2 == 2) {
                    i2 = 6;
                } else if (reason2 == 3) {
                    i2 = 0;
                } else if (reason2 == 4) {
                    i2 = 1;
                } else if (reason2 != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
                c10393l.yandex(str, true, i2);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                c10393l.yandex(str, false, 9);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new C12301l(cameraDeviceSetup, str, c10393l);
        }
        return null;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C2099l(this.f4695l, this.f4696l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2099l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
