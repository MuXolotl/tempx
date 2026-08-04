package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1156l implements InterfaceC2413l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f3132l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f3133l = new Object();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2910l f3134l;

    public C1156l(C2910l c2910l) {
        this.f3134l = c2910l;
    }

    @Override // defpackage.InterfaceC2413l
    public final CaptureRequest.Builder adcel(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Builder builderAdcel;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createReprocessCaptureRequest failed: Virtual device disconnected");
                    builderAdcel = null;
                } else {
                    builderAdcel = this.f3134l.adcel(totalCaptureResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderAdcel;
    }

    @Override // defpackage.InterfaceC2413l
    public final void ads(int i) {
        this.f3134l.ads(i);
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final boolean mo833continue(List list, InterfaceC17121l interfaceC17121l) {
        boolean zMo833continue;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    interfaceC17121l.yandex();
                    zMo833continue = false;
                } else {
                    zMo833continue = this.f3134l.mo833continue(list, interfaceC17121l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo833continue;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final boolean mo834default(ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        boolean zMo834default;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createCaptureSessionByOutputConfigurations failed: Virtual device disconnected");
                    ((C15202l) interfaceC17121l).yandex();
                    zMo834default = false;
                } else {
                    zMo834default = this.f3134l.mo834default(arrayList, interfaceC17121l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo834default;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final boolean mo835import(C11765l c11765l, ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        boolean zMo835import;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createReprocessableCaptureSessionByConfigurations failed: Virtual device disconnected");
                    ((C15202l) interfaceC17121l).yandex();
                    zMo835import = false;
                } else {
                    zMo835import = this.f3134l.mo835import(c11765l, arrayList, interfaceC17121l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo835import;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void mo836instanceof() {
        this.f3134l.mo836instanceof();
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: lٜؓ۠, reason: contains not printable characters */
    public final boolean mo837l(InputConfiguration inputConfiguration, ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        boolean zMo837l;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createReprocessableCaptureSession failed: Virtual device disconnected");
                    ((C15202l) interfaceC17121l).yandex();
                    zMo837l = false;
                } else {
                    zMo837l = this.f3134l.mo837l(inputConfiguration, arrayList, interfaceC17121l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo837l;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final boolean mo838l(C9212l c9212l) {
        boolean zMo838l;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createExtensionSession failed: Virtual device disconnected");
                    c9212l.mopub.yandex();
                    zMo838l = false;
                } else {
                    zMo838l = this.f3134l.mo838l(c9212l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo838l;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final CaptureRequest.Builder mo839private(int i) {
        CaptureRequest.Builder builderMo839private;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createCaptureRequest failed: Virtual device disconnected");
                    builderMo839private = null;
                } else {
                    builderMo839private = this.f3134l.mo839private(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return builderMo839private;
    }

    @Override // defpackage.InterfaceC2413l
    public final void signatures() {
        this.f3134l.signatures();
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean mo840synchronized(C7104l c7104l) {
        boolean zMo840synchronized;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createCaptureSession failed: Virtual device disconnected");
                    c7104l.purchase.yandex();
                    zMo840synchronized = false;
                } else {
                    zMo840synchronized = this.f3134l.mo840synchronized(c7104l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo840synchronized;
    }

    @Override // defpackage.InterfaceC2413l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final boolean mo841throw(ArrayList arrayList, InterfaceC17121l interfaceC17121l) {
        boolean zMo841throw;
        synchronized (this.f3133l) {
            try {
                if (this.f3132l) {
                    Log.w("CXCP", "createConstrainedHighSpeedCaptureSession failed: Virtual device disconnected");
                    ((C15202l) interfaceC17121l).yandex();
                    zMo841throw = false;
                } else {
                    zMo841throw = this.f3134l.mo841throw(arrayList, interfaceC17121l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zMo841throw;
    }

    @Override // defpackage.InterfaceC2413l
    public final String vip() {
        return this.f3134l.f6326l;
    }

    @Override // defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        return this.f3134l.mo842while(interfaceC1388l);
    }

    public final void yandex() {
        synchronized (this.f3133l) {
            this.f3132l = true;
            Unit unit = Unit.INSTANCE;
        }
    }
}
