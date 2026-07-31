package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٌٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8800l extends AbstractC18433l {
    public final AtomicReference applovin;

    public C8800l(Context context, Looper looper, C1424l c1424l, C3714l c3714l, C3714l c3714l2) {
        super(context, looper, 41, c1424l, c3714l, c3714l2);
        this.applovin = new AtomicReference();
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.AbstractC4620l
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final void billing() {
        try {
            if (this.applovin.getAndSet(null) != null) {
                throw new ClassCastException();
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.billing();
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 12600000;
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof C2368l ? (C2368l) iInterfaceQueryLocalInterface : new C2368l(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", 1);
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC12811l.yandex;
    }
}
