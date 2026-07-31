package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: lٌ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17790l implements InterfaceC16100l {
    public final /* synthetic */ AppMeasurementDynamiteService loadAd;
    public final InterfaceC11939l yandex;

    public C17790l(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC11939l interfaceC11939l) {
        this.loadAd = appMeasurementDynamiteService;
        this.yandex = interfaceC11939l;
    }

    @Override // defpackage.InterfaceC16100l
    public final void yandex(String str, String str2, Bundle bundle, long j) {
        try {
            this.yandex.ads(str, str2, bundle, j);
        } catch (RemoteException e) {
            C17417l c17417l = this.loadAd.purchase;
            if (c17417l != null) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(e, "Event listener threw exception");
            }
        }
    }
}
