package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lۣ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18304l extends AbstractC18433l {
    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 12451000;
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return iInterfaceQueryLocalInterface instanceof C7132l ? (C7132l) iInterfaceQueryLocalInterface : new C7132l(iBinder, "com.google.android.gms.cast.internal.ICastService", 1);
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC13106l.billing;
    }
}
