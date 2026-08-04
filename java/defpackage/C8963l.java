package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lٌٟ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8963l extends AbstractC18433l {
    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // defpackage.AbstractC4620l
    public final boolean ads() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 17895000;
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof C2333l ? (C2333l) iInterfaceQueryLocalInterface : new C2333l(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 0);
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC4927l.loadAd;
    }
}
