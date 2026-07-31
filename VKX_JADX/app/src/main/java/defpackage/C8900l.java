package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: lٌٛؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8900l extends AbstractC18433l {
    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 9410000;
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof C18414l ? (C18414l) iInterfaceQueryLocalInterface : new C18414l(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 5);
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC9464l.admob;
    }
}
