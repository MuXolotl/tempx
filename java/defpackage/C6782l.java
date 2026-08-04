package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lؙ۟٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6782l {
    public static final C8634l amazon;
    public static final C8634l billing;
    public static final C8634l crashlytics;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C8634l mopub;
    public static final C8634l purchase;
    public static final C6782l yandex;

    static {
        boolean z = false;
        C0544l c0544l = new C0544l(C6782l.class, "isAlertOpened", "isAlertOpened()Z", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        boolean z2 = true;
        int i = 3;
        loadAd = new InterfaceC13922l[]{c2336l.admob(c0544l), AbstractC9361l.tapsense(C6782l.class, "preferExternal", "getPreferExternal()Z", 0, c2336l), AbstractC9361l.tapsense(C6782l.class, "preferWifi", "getPreferWifi()Z", 0, c2336l), AbstractC9361l.tapsense(C6782l.class, "downloadSepCover", "getDownloadSepCover()Z", 0, c2336l), AbstractC9361l.tapsense(C6782l.class, "downloadSepFolder", "getDownloadSepFolder()Z", 0, c2336l), AbstractC9361l.tapsense(C6782l.class, "analyticsVK", "getAnalyticsVK()Z", 0, c2336l), c2336l.billing(new C0114l(C6782l.class, "migrated", "getMigrated()Z", 0)), c2336l.billing(new C0114l(C6782l.class, "skipStartupSaf", "getSkipStartupSaf()Z", 0)), c2336l.billing(new C0114l(C6782l.class, "forceFallbackForProfile", "getForceFallbackForProfile()Z", 0)), c2336l.billing(new C0114l(C6782l.class, "forceFallbackForProfileTestMark", "getForceFallbackForProfileTestMark()Z", 0))};
        yandex = new C6782l();
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        crashlytics = new C8634l(sharedPreferences != null ? sharedPreferences : null, "misc_donatepopup", z, i);
        amazon = new C8634l(sharedPreferences != null ? sharedPreferences : null, "dl_sp_folder", z2, i);
        purchase = new C8634l(sharedPreferences != null ? sharedPreferences : null, "global_vk", z2, i);
        billing = new C8634l(sharedPreferences != null ? sharedPreferences : null, "oc_forceFallbackProfile", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        mopub = new C8634l(sharedPreferences, "oc_forceFallbackProfile_testMark", z, i);
    }

    public final void loadAd(boolean z) {
        mopub.advert(loadAd[9], Boolean.valueOf(z));
    }

    public final void yandex(boolean z) {
        billing.advert(loadAd[8], Boolean.valueOf(z));
    }
}
