package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: lٌۗۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8994l {
    public static final C5991l admob;
    public static final C8634l amazon;
    public static final C8634l billing;
    public static final C8634l crashlytics;
    public static final C11897l firebase;
    public static final C11897l isPro;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C8634l mopub;
    public static final C8634l purchase;
    public static final C11897l subs;
    public static final C8994l yandex;

    static {
        boolean z = false;
        C0544l c0544l = new C0544l(C8994l.class, "invertCacheAddOrder", "getInvertCacheAddOrder()Z", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        boolean z2 = true;
        int i = 3;
        loadAd = new InterfaceC13922l[]{c2336l.admob(c0544l), AbstractC9361l.tapsense(C8994l.class, "skipErrors", "getSkipErrors()Z", 0, c2336l), AbstractC9361l.tapsense(C8994l.class, "useSAF", "getUseSAF()Z", 0, c2336l), AbstractC9361l.tapsense(C8994l.class, "overwriteExisting", "getOverwriteExisting()Z", 0, c2336l), AbstractC9361l.tapsense(C8994l.class, "addAlbumToFn", "getAddAlbumToFn()Z", 0, c2336l), c2336l.billing(new C0114l(C8994l.class, "downloadPath", "getDownloadPath()Ljava/lang/String;", 0))};
        yandex = new C8994l();
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        crashlytics = new C8634l(sharedPreferences != null ? sharedPreferences : null, "cache_invert_add_order", z, i);
        amazon = new C8634l(sharedPreferences != null ? sharedPreferences : null, "unified_skip_errors", z, i);
        purchase = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_useSAF", z2, i);
        billing = new C8634l(sharedPreferences != null ? sharedPreferences : null, "downloader_overwrite_existing", z2, i);
        mopub = new C8634l(sharedPreferences != null ? sharedPreferences : null, "downloader_add_album_to_fn", z2, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        int i2 = 7;
        admob = new C5991l(sharedPreferences, "download_path", "", i2);
        subs = new C11897l("cache_path_storageIdx", new C16936l(i2), 0);
        int i3 = 19;
        isPro = new C11897l("skyline_last_sort", new C10975l(i3, EnumC17214l.values()), EnumC17214l.Default);
        firebase = new C11897l("skyline_last_source", new C10975l(i3, EnumC7195l.values()), EnumC7195l.f15026l);
    }

    public final void crashlytics(String str) {
        InterfaceC13922l interfaceC13922l = loadAd[5];
        C5991l c5991l = admob;
        ((SharedPreferences) c5991l.f12716l).edit().putString((String) c5991l.f12715l, str).apply();
    }

    public final boolean loadAd() {
        InterfaceC13922l interfaceC13922l = loadAd[3];
        return ((Boolean) billing.pro(this)).booleanValue();
    }

    public final String yandex() {
        InterfaceC13922l interfaceC13922l = loadAd[5];
        return (String) admob.advert(this);
    }
}
