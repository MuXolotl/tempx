package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: lّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12582l extends AbstractC18433l implements InterfaceC1168l {
    public final boolean applovin;
    public final C1424l appmetrica;
    public final Bundle inmobi;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Integer f24767throws;

    public C12582l(Context context, Looper looper, C1424l c1424l, Bundle bundle, InterfaceC15669l interfaceC15669l, InterfaceC11821l interfaceC11821l) {
        super(context, looper, 44, c1424l, interfaceC15669l, interfaceC11821l);
        this.applovin = true;
        this.appmetrica = c1424l;
        this.inmobi = bundle;
        this.f24767throws = (Integer) c1424l.f3606l;
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.AbstractC4620l, defpackage.InterfaceC1168l
    public final boolean crashlytics() {
        return this.applovin;
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
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C16806l ? (C16806l) iInterfaceQueryLocalInterface : new C16806l(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // defpackage.AbstractC4620l
    public final Bundle smaato() {
        C1424l c1424l = this.appmetrica;
        boolean zEquals = this.crashlytics.getPackageName().equals((String) c1424l.f3601l);
        Bundle bundle = this.inmobi;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c1424l.f3601l);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
}
