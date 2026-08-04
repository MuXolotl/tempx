package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lؕۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3756l extends AbstractBinderC5395l implements InterfaceC5700l {
    public final C13132l billing;

    public BinderC3756l(C13132l c13132l) {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener", 5);
        this.billing = c13132l;
    }

    @Override // defpackage.AbstractBinderC5395l
    /* JADX INFO: renamed from: lّٔ٘, reason: contains not printable characters */
    public final boolean mo1423l(Parcel parcel, int i) {
        if (i != 2) {
            return false;
        }
        C9417l c9417l = (C9417l) AbstractC14866l.yandex(parcel, C9417l.CREATOR);
        AbstractC14866l.loadAd(parcel);
        Status statusAppmetrica = C11963l.appmetrica(c9417l.f19266l);
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
