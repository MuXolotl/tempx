package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: lٍٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16533l extends AbstractC18433l {

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final C0022l f32307class = new C0022l("CastClientImpl", null);

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static final Object f32308interface = new Object();

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static final Object f32309static = new Object();
    public C5040l applovin;
    public final CastDevice appmetrica;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public String f32310case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public int f32311catch;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final HashMap f32312continue;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public String f32313else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public double f32314extends;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public C10121l f32315for;
    public final C1021l inmobi;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public boolean f32316native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final Bundle f32317package;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public boolean f32318private;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public String f32319strictfp;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public Bundle f32320switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public BinderC2788l f32321synchronized;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public int f32322throw;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final HashMap f32323throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean f32324volatile;

    public C16533l(Context context, Looper looper, C1424l c1424l, CastDevice castDevice, C1021l c1021l, Bundle bundle, C3714l c3714l, C3714l c3714l2) {
        super(context, looper, 10, c1424l, c3714l, c3714l2);
        this.appmetrica = castDevice;
        this.inmobi = c1021l;
        this.f32317package = bundle;
        this.f32323throws = new HashMap();
        new AtomicLong(0L);
        this.f32312continue = new HashMap();
        this.f32322throw = -1;
        this.f32311catch = -1;
        this.applovin = null;
        this.f32319strictfp = null;
        this.f32314extends = 0.0d;
        appmetrica();
        this.f32324volatile = false;
        this.f32315for = null;
        appmetrica();
    }

    @Override // defpackage.AbstractC4620l
    public final void ad(int i, IBinder iBinder, Bundle bundle, int i2) {
        f32307class.loadAd("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 2300) {
            this.f32316native = true;
            this.f32318private = true;
        }
        if (i == 2300) {
            Bundle bundle2 = new Bundle();
            this.f32320switch = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.ad(i, iBinder, bundle, i2);
    }

    @Override // defpackage.AbstractC4620l
    public final String adcel() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final void appmetrica() {
        CastDevice castDevice = this.appmetrica;
        AbstractC1051l.isPro(castDevice, "device should not be null");
        C14513l c14513l = castDevice.f534l;
        if (c14513l.m3860synchronized(2048) || !c14513l.m3860synchronized(4) || c14513l.m3860synchronized(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f531l);
    }

    @Override // defpackage.AbstractC4620l
    public final void billing() {
        Object[] objArr = {this.f32321synchronized, Boolean.valueOf(subscription())};
        C0022l c0022l = f32307class;
        c0022l.loadAd("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        BinderC2788l binderC2788l = this.f32321synchronized;
        C16533l c16533l = null;
        this.f32321synchronized = null;
        if (binderC2788l != null) {
            C16533l c16533l2 = (C16533l) binderC2788l.mopub.getAndSet(null);
            if (c16533l2 != null) {
                c16533l2.f32322throw = -1;
                c16533l2.f32311catch = -1;
                c16533l2.applovin = null;
                c16533l2.f32319strictfp = null;
                c16533l2.f32314extends = 0.0d;
                c16533l2.appmetrica();
                c16533l2.f32324volatile = false;
                c16533l2.f32315for = null;
                c16533l = c16533l2;
            }
            if (c16533l != null) {
                m4184throws();
                try {
                    try {
                        C10567l c10567l = (C10567l) metrica();
                        C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                        Parcel parcelM743l = c10567l.m743l();
                        AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                        c10567l.m747l(parcelM743l, 1);
                    } catch (RemoteException | IllegalStateException e) {
                        c0022l.yandex(e, "Error while disconnecting the controller interface", new Object[0]);
                    }
                    return;
                } finally {
                    super.billing();
                }
            }
        }
        c0022l.loadAd("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // defpackage.AbstractC4620l
    public final Bundle firebase() {
        Bundle bundle = this.f32320switch;
        if (bundle == null) {
            return null;
        }
        this.f32320switch = null;
        return bundle;
    }

    public final void inmobi(int i, long j) {
        C13132l c13132l;
        HashMap map = this.f32312continue;
        synchronized (map) {
            c13132l = (C13132l) map.remove(Long.valueOf(j));
        }
        if (c13132l != null) {
            c13132l.yandex.loadAd(null);
        }
    }

    @Override // defpackage.AbstractC4620l
    public final void license(C10602l c10602l) {
        super.license(c10602l);
        m4184throws();
    }

    @Override // defpackage.AbstractC4620l
    public final int loadAd() {
        return 12800000;
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
        f32307class.loadAd("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f32313else, this.f32310case);
        CastDevice castDevice = this.appmetrica;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        Bundle bundle2 = this.f32317package;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        BinderC2788l binderC2788l = new BinderC2788l(this);
        this.f32321synchronized = binderC2788l;
        bundle.putParcelable("listener", new BinderWrapper(binderC2788l));
        String str = this.f32313else;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f32310case;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // defpackage.AbstractC4620l
    public final String startapp() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m4184throws() {
        f32307class.loadAd("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap map = this.f32323throws;
        synchronized (map) {
            map.clear();
        }
    }
}
