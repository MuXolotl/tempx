package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0813l extends AbstractC5563l implements Function1 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C6267l f2441l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2442l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f2443l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f2444l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0813l(C6267l c6267l, int i, InterfaceC14029l interfaceC14029l) {
        super(1, interfaceC14029l);
        this.f2441l = c6267l;
        this.f2442l = i;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i;
        C9426l c9426lLoadAd;
        int i2 = this.f2444l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                C6267l c6267l = this.f2441l;
                int i3 = this.f2442l;
                C2667l c2667lYandex = c6267l.crashlytics.yandex();
                this.f2443l = i3;
                this.f2444l = 1;
                obj = c2667lYandex.yandex(this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
                i = i3;
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.f2443l;
                AbstractC2829l.crashlytics(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                C10069l c10069l = (C10069l) autoCloseable;
                C6558l c6558l = new C6558l(i);
                if (c10069l.f20544l.yandex()) {
                    C8936l.firebase(c10069l, " after close.", "Cannot call setTorchOff on ");
                    c9426lLoadAd = null;
                } else {
                    C10013l c10013l = c10069l.f20542l;
                    c10013l.getClass();
                    c9426lLoadAd = C10013l.loadAd(c10013l, c6558l, null, null, new C12468l(0), null, null, null, 118);
                }
                AbstractC1214l.yandex(autoCloseable, null);
                return c9426lLoadAd;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1214l.yandex(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return C6267l.smaato;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l adcel(InterfaceC14029l interfaceC14029l) {
        return new C0813l(this.f2441l, this.f2442l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0813l) adcel((InterfaceC14029l) obj)).Signature(Unit.INSTANCE);
    }
}
