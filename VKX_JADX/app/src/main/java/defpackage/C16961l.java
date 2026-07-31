package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: lؙٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16961l extends AbstractC18433l {
    public final C11468l applovin;

    public C16961l(Context context, Looper looper, C1424l c1424l, C11468l c11468l, C3714l c3714l, C3714l c3714l2) {
        super(context, looper, 270, c1424l, c3714l, c3714l2);
        this.applovin = c11468l;
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.AbstractC4620l
    public final boolean ads() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 203400000;
    }

    @Override // defpackage.AbstractC4620l
    public final IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C15567l ? (C15567l) iInterfaceQueryLocalInterface : new C15567l(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.AbstractC4620l
    public final Bundle smaato() {
        C11468l c11468l = this.applovin;
        c11468l.getClass();
        Bundle bundle = new Bundle();
        String str = c11468l.loadAd;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC6689l.amazon;
    }
}
