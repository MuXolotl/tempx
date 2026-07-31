package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؙْ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6433l extends AbstractC11801l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f13458l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f13459l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String[] f13460l;

    public C6433l() {
        super(0);
        this.f13459l = AbstractC8020l.smaato(EnumC9503l.f19385l);
        int i = Build.VERSION.SDK_INT;
        this.f13460l = i >= 33 ? new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.NEARBY_WIFI_DEVICES", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : i >= 31 ? new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final Map m2001abstract() throws PackageManager.NameNotFoundException {
        int[] iArr;
        PackageInfo packageInfo = this.f34617l.getPackageManager().getPackageInfo("com.google.android.gms", 4096);
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null || (iArr = packageInfo.requestedPermissionsFlags) == null) {
            return C14054l.f27396l;
        }
        C17963l c17963l = new C17963l();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            c17963l.put(strArr[i], Boolean.valueOf((iArr[i] & 2) != 0));
        }
        return c17963l.crashlytics();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2002import() {
        Object c18435l;
        int iCrashlytics = C7181l.purchase.crashlytics(this.f34617l.getApplicationContext(), C13268l.yandex);
        C10086l c10086l = this.f13459l;
        if (iCrashlytics != 0) {
            c10086l.setValue(EnumC9503l.f19384l);
            return;
        }
        try {
            c18435l = m2001abstract();
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = C14054l.f27396l;
        }
        Map map = (Map) c18435l;
        for (String str : this.f13460l) {
            if (AbstractC7720l.loadAd(this.f34617l, str) != 0) {
                c10086l.setValue(EnumC9503l.f19387l);
                return;
            } else {
                if (!((Boolean) j$.util.Map.EL.getOrDefault(map, str, Boolean.FALSE)).booleanValue()) {
                    c10086l.setValue(EnumC9503l.f19383l);
                    return;
                }
            }
        }
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        c16076l.ads();
        C15478l.purchase.yandex(C17684l.yandex, false);
        C10244l.purchase.yandex(C11935l.yandex, false);
        VKXApplication.f36625l.postDelayed(new RunnableC5360l(3, this), 750L);
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final EnumC9503l m2003instanceof() {
        return (EnumC9503l) this.f13459l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(124579381);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(110576377, new C9567l(this, b, b), c6956l), AbstractC14566l.amazon(1059066106, new C9567l(this, i3, b), c6956l), null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(186786244, new C1543l(this, b), c6956l), c6956l, 805306800, 249);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9567l(this, i);
        }
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void mo2004package(int i, String[] strArr, int[] iArr) {
        if (i == 1039) {
            m2002import();
            this.f13458l = true;
        }
    }

    @Override // defpackage.AbstractC17777l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void mo2005throws() {
        super.mo2005throws();
        m2002import();
    }
}
