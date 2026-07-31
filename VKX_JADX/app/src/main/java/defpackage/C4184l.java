package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: renamed from: lؚؖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4184l extends AbstractC18433l {

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final C0022l f8591throws = new C0022l("CastClientImplCxless", null);
    public final CastDevice applovin;
    public final Bundle appmetrica;
    public final String inmobi;

    public C4184l(Context context, Looper looper, C1424l c1424l, CastDevice castDevice, Bundle bundle, String str, C3714l c3714l, C3714l c3714l2) {
        super(context, looper, 10, c1424l, c3714l, c3714l2);
        this.applovin = castDevice;
        this.appmetrica = bundle;
        this.inmobi = str;
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.AbstractC4620l
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC4620l
    public final void billing() {
        try {
            try {
                C10567l c10567l = (C10567l) metrica();
                C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                Parcel parcelM743l = c10567l.m743l();
                AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                c10567l.m747l(parcelM743l, 1);
            } catch (RemoteException | IllegalStateException e) {
                f8591throws.yandex(e, "Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super.billing();
        }
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 19390000;
    }

    @Override // defpackage.AbstractC4620l
    public final /* synthetic */ IInterface purchase(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof C10567l ? (C10567l) iInterfaceQueryLocalInterface : new C10567l(iBinder);
    }

    @Override // defpackage.AbstractC4620l
    public final Bundle smaato() {
        Bundle bundle = new Bundle();
        f8591throws.loadAd("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.applovin;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.inmobi);
        Bundle bundle2 = this.appmetrica;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.AbstractC4620l
    public final C9138l[] subs() {
        return AbstractC13106l.billing;
    }
}
