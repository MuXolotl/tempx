package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.glance.session.SessionWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒۥۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1474l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3678l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f3679l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f3680l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1474l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(1, interfaceC14029l);
        this.f3679l = i;
        this.f3680l = obj;
        this.f3678l = obj2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f3679l;
        Object obj2 = this.f3678l;
        Object obj3 = this.f3680l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C5616l c5616l = (C5616l) obj3;
                C5616l.yandex(c5616l);
                Object objCrashlytics = c5616l.crashlytics(obj2);
                c5616l.crashlytics.f13720l.setValue(objCrashlytics);
                c5616l.purchase.setValue(objCrashlytics);
                return Unit.INSTANCE;
            case 1:
                AbstractC2829l.crashlytics(obj);
                CameraDevice cameraDevice = (CameraDevice) obj3;
                if (cameraDevice != null) {
                    Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException e) {
                            Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                        }
                        Unit unit = Unit.INSTANCE;
                        Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(str, " - ")));
                    } catch (Throwable th) {
                        Log.d("CXCP", AbstractC5020l.license(new Object[]{Double.valueOf(AbstractC5020l.vip(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", AbstractC5020l.advert(str, " - ")));
                        throw th;
                    }
                    break;
                }
                ((C9122l) obj2).f18750l = true;
                return Unit.INSTANCE;
            case 2:
                AbstractC2829l.crashlytics(obj);
                StringBuilder sb = new StringBuilder();
                C15202l c15202l = (C15202l) obj3;
                sb.append(c15202l);
                sb.append(" CameraCaptureSessionWrapper#close");
                C7752l c7752l = (C7752l) obj2;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + c15202l);
                    AbstractC14814l.advert(c7752l.yandex);
                    Unit unit2 = Unit.INSTANCE;
                    return Unit.INSTANCE;
                } finally {
                    Trace.endSection();
                }
            case 3:
                AbstractC2829l.crashlytics(obj);
                StringBuilder sb2 = new StringBuilder();
                C15202l c15202l2 = (C15202l) obj3;
                sb2.append(c15202l2);
                sb2.append(" stopRepeating");
                C9598l c9598l = (C9598l) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    c9598l.m2697for();
                    Unit unit3 = Unit.INSTANCE;
                    Trace.endSection();
                    try {
                        Trace.beginSection(c15202l2 + " abortCaptures");
                        c9598l.amazon();
                        return Unit.INSTANCE;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 4:
                AbstractC2829l.crashlytics(obj);
                AbstractC12074l abstractC12074l = (AbstractC12074l) obj3;
                AbstractC14760l.crashlytics(((InterfaceC9955l) abstractC12074l.f24000l).mo1553throw().f14095l, (InterfaceC9955l) abstractC12074l.f24000l, (C7166l) obj2);
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                InterfaceC18636l interfaceC18636l = (InterfaceC18636l) obj3;
                AbstractC14760l.crashlytics(interfaceC18636l.mo1553throw().f14095l, interfaceC18636l, (Throwable) obj2);
                return Unit.INSTANCE;
            default:
                AbstractC2829l.crashlytics(obj);
                ((C3399l) obj3).loadAd(((SessionWorker) obj2).subs.crashlytics);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        int i = this.f3679l;
        Object obj = this.f3678l;
        Object obj2 = this.f3680l;
        switch (i) {
            case 0:
                return new C1474l((C5616l) obj2, obj, interfaceC14029l, 0);
            case 1:
                return new C1474l((CameraDevice) obj2, (C9122l) obj, interfaceC14029l, 1);
            case 2:
                return new C1474l((C15202l) obj2, (C7752l) obj, interfaceC14029l, 2);
            case 3:
                return new C1474l((C15202l) obj2, (C9598l) obj, interfaceC14029l, 3);
            case 4:
                return new C1474l((AbstractC12074l) obj2, (C7166l) obj, interfaceC14029l, 4);
            case 5:
                return new C1474l((InterfaceC18636l) obj2, (Throwable) obj, interfaceC14029l, 5);
            default:
                return new C1474l((C3399l) obj2, (SessionWorker) obj, interfaceC14029l, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj;
        switch (this.f3679l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((C1474l) adcel(interfaceC14029l)).Signature(Unit.INSTANCE);
    }
}
