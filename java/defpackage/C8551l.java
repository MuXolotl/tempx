package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: lٌُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8551l extends AbstractC17054l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C14405l f17637l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f17638l = 0;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f17639l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8551l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l, Context context) {
        super(layoutInflaterFactory2C14405l);
        this.f17637l = layoutInflaterFactory2C14405l;
        this.f17639l = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؓۤٚ, reason: contains not printable characters */
    public final IntentFilter mo2327l() {
        switch (this.f17638l) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lٔ٘۠, reason: contains not printable characters */
    public final int mo2328l() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.f17638l;
        Object obj = this.f17639l;
        switch (i) {
            case 0:
                return AbstractC16743l.yandex((PowerManager) obj) ? 2 : 1;
            default:
                C12418l c12418l = (C12418l) obj;
                C8807l c8807l = (C8807l) c12418l.f24521l;
                LocationManager locationManager = (LocationManager) c12418l.f24518l;
                if (c8807l.loadAd <= System.currentTimeMillis()) {
                    Context context = (Context) c12418l.f24519l;
                    Location lastKnownLocation2 = null;
                    if (AbstractC10999l.amazon(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (AbstractC10999l.amazon(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C0386l.billing == null) {
                            C0386l.billing = new C0386l();
                        }
                        C0386l c0386l = C0386l.billing;
                        c0386l.yandex(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c0386l.yandex(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c0386l.amazon == 1;
                        long j2 = c0386l.crashlytics;
                        long j3 = c0386l.loadAd;
                        c0386l.yandex(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = c0386l.crashlytics;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        c8807l.yandex = z;
                        c8807l.loadAd = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = c8807l.yandex;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void mo2329l() throws IllegalAccessException {
        int i = this.f17638l;
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = this.f17637l;
        switch (i) {
            case 0:
                layoutInflaterFactory2C14405l.startapp(true, true);
                break;
            default:
                layoutInflaterFactory2C14405l.startapp(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8551l(LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l, C12418l c12418l) {
        super(layoutInflaterFactory2C14405l);
        this.f17637l = layoutInflaterFactory2C14405l;
        this.f17639l = c12418l;
    }
}
