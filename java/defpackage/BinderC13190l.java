package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lؙْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC13190l extends AbstractBinderC5395l implements InterfaceC8051l {
    public final C13132l billing;

    public BinderC13190l(C13132l c13132l) {
        super("com.google.android.gms.nearby.internal.connection.IResultListener", 5);
        this.billing = c13132l;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lّٔ٘ */
    public final boolean mo1423l(Parcel parcel, int i) {
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        AbstractC14866l.loadAd(parcel);
        Status statusAppmetrica = C11963l.appmetrica(i2);
        boolean zBilling = statusAppmetrica.billing();
        C13132l c13132l = this.billing;
        if (zBilling) {
            c13132l.yandex.loadAd(null);
            return true;
        }
        c13132l.getClass();
        c13132l.yandex.yandex(new C3890l(statusAppmetrica));
        return true;
    }
}
