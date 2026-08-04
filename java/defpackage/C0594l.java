package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lؑۛۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594l extends AbstractC4620l {
    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 12451000;
    }

    @Override // defpackage.AbstractC4620l
    public final /* synthetic */ IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5496l ? (InterfaceC5496l) iInterfaceQueryLocalInterface : new C9574l(iBinder);
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
