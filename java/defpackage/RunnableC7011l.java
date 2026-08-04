package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: lؚؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7011l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AppMeasurementDynamiteService f14707l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6989l f14708l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14709l;

    public /* synthetic */ RunnableC7011l(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC6989l interfaceC6989l, int i) {
        this.f14709l = i;
        this.f14708l = interfaceC6989l;
        this.f14707l = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f14709l) {
            case 0:
                C11860l c11860lFirebase = this.f14707l.purchase.firebase();
                InterfaceC6989l interfaceC6989l = this.f14708l;
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                c11860lFirebase.m3267l(new RunnableC7706l(c11860lFirebase, c11860lFirebase.m3269l(false), interfaceC6989l, 13));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f14707l;
                C17410l c17410l = appMeasurementDynamiteService.purchase.f33949l;
                C17417l.billing(c17410l);
                C17417l c17417l = appMeasurementDynamiteService.purchase;
                if (c17417l.f33941l != null && c17417l.f33941l.booleanValue()) {
                    z = true;
                }
                c17410l.m4352l(this.f14708l, z);
                break;
        }
    }
}
