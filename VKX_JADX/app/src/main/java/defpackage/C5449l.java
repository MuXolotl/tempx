package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؘؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5449l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f11679l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f11680l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11681l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f11682l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f11683l;

    public /* synthetic */ C5449l(C9426l c9426l, InterfaceC1142l interfaceC1142l, C0708l c0708l, boolean z) {
        this.f11681l = 1;
        this.f11679l = c9426l;
        this.f11683l = interfaceC1142l;
        this.f11682l = c0708l;
        this.f11680l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        C12287l c12287l;
        Integer num;
        int i = this.f11681l;
        Object obj2 = this.f11682l;
        Object obj3 = this.f11683l;
        boolean z = this.f11680l;
        Object obj4 = this.f11679l;
        switch (i) {
            case 0:
                C14115l c14115l = (C14115l) obj3;
                C0534l c0534l = (C0534l) obj2;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                C13601l c13601l = c6742l.f14144l;
                if (!((Boolean) ((Function0) obj4).invoke()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (z) {
                    long jMo2070l = c13601l.mo2070l();
                    C18449l c18449l = c13601l.f26629l;
                    long jM4551private = c18449l.m4551private();
                    c18449l.m4555synchronized().mopub();
                    try {
                        ((C16543l) c18449l.f36010l).isVip(-1.0f, 1.0f, jMo2070l);
                        AbstractC9361l.isPro(c6742l, c14115l, 0L, 0.0f, c0534l, 46);
                    } finally {
                        AbstractC0653l.license(c18449l, jM4551private);
                    }
                } else {
                    AbstractC9361l.isPro(c6742l, c14115l, 0L, 0.0f, c0534l, 46);
                }
                return Unit.INSTANCE;
            case 1:
                C9426l c9426l = (C9426l) obj4;
                InterfaceC1142l interfaceC1142l = (InterfaceC1142l) obj3;
                C0708l c0708l = (C0708l) obj2;
                Throwable th = (Throwable) obj;
                if (th != null) {
                    if (AbstractC5088l.metrica()) {
                        Log.w("CXCP", "propagateToFocusMeteringResultDeferred: completed exceptionally!", th);
                    }
                    c9426l.m2649l(th);
                } else {
                    C6346l c6346l = (C6346l) interfaceC1142l.isVip();
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "propagateToFocusMeteringResultDeferred: result3A = " + c6346l);
                    }
                    int i2 = c6346l.yandex;
                    if (i2 == 4) {
                        AbstractC14814l.isVip("Camera is not active.", c9426l);
                    } else {
                        boolean z2 = false;
                        if (i2 == 2) {
                            c9426l.m3885new(new C12287l(false));
                        } else {
                            c0708l.getClass();
                            int i3 = c6346l.yandex;
                            C15331l c15331l = c6346l.loadAd;
                            if (i3 == 0) {
                                if (c15331l != null) {
                                    num = (Integer) c15331l.f29963l.get(CaptureResult.CONTROL_AF_STATE);
                                } else {
                                    num = null;
                                }
                                if (z) {
                                    List list = C7514l.loadAd;
                                    ArrayList arrayList = c0708l.remoteconfig;
                                    if (!(arrayList == null ? false : arrayList.contains(new C7514l(1))) || (c15331l != null && (num == null || num.intValue() == 4))) {
                                        z2 = true;
                                    }
                                }
                                c12287l = new C12287l(z2);
                            } else {
                                c12287l = new C12287l(false);
                            }
                            c9426l.m3885new(c12287l);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC16137l abstractC16137l = (AbstractC16137l) obj4;
                String str = (String) obj3;
                C11120l c11120l = (C11120l) obj2;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof C14930l) {
                    abstractC16137l.crashlytics.compareAndSet(-256, ((C14930l) th2).f29384l);
                }
                if (z && str != null) {
                    C15617l c15617l = c11120l.purchase.remoteconfig;
                    int iHashCode = c11120l.yandex.hashCode();
                    c15617l.getClass();
                    AbstractC15011l.amazon(iHashCode, str);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C5449l(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f11681l = i;
        this.f11679l = obj;
        this.f11680l = z;
        this.f11683l = obj2;
        this.f11682l = obj3;
    }
}
