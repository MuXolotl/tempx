package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: lؘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6018l extends AbstractC0895l implements InterfaceC6989l {
    public C6018l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 5);
    }

    @Override // defpackage.InterfaceC6989l
    /* JADX INFO: renamed from: return */
    public final void mo785return(Bundle bundle) {
        Parcel parcelM743l = m743l();
        AbstractC15425l.loadAd(parcelM743l, bundle);
        m741l(parcelM743l, 1);
    }
}
