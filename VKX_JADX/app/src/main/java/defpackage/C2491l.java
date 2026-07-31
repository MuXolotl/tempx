package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًٌؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2491l {
    public static final C8634l admob;
    public static final C4348l amazon;
    public static final C8634l billing;
    public static final C4348l crashlytics;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C8634l mopub;
    public static final C16543l purchase;
    public static final C2491l yandex;

    static {
        boolean z = false;
        C0114l c0114l = new C0114l(C2491l.class, "startupIndex", "getStartupIndex()I", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        int i = 3;
        loadAd = new InterfaceC13922l[]{c2336l.billing(c0114l), c2336l.billing(new C0114l(C2491l.class, "startupOrbit", "getStartupOrbit()Z", 0)), AbstractC9361l.tapsense(C2491l.class, "isFullNumbersEnabled", "isFullNumbersEnabled()Z", 0, c2336l), AbstractC9361l.tapsense(C2491l.class, "hideSystemBarsOnNpSlide", "getHideSystemBarsOnNpSlide()Z", 0, c2336l), AbstractC9361l.tapsense(C2491l.class, "animReduceNavigation", "getAnimReduceNavigation()Z", 0, c2336l)};
        yandex = new C2491l();
        crashlytics = new C4348l("ctg_classic", R.string.catalog_classic, Integer.valueOf(R.string.catalog_classic_text), false);
        amazon = new C4348l("ctg_cache_classic", R.string.catalog_classic_cache, Integer.valueOf(R.string.catalog_classic_cache_text), false);
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        purchase = new C16543l(14, sharedPreferences != null ? sharedPreferences : null);
        billing = new C8634l(sharedPreferences != null ? sharedPreferences : null, "startup_orbit", z, i);
        mopub = new C8634l(sharedPreferences != null ? sharedPreferences : null, "interface_fullnumbers", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        admob = new C8634l(sharedPreferences, "animreduce_nav", z, i);
    }

    public final boolean loadAd() {
        InterfaceC13922l interfaceC13922l = loadAd[1];
        return ((Boolean) billing.pro(this)).booleanValue();
    }

    public final int yandex() {
        InterfaceC13922l interfaceC13922l = loadAd[0];
        return Integer.valueOf(((SharedPreferences) purchase.f32482l).getInt("startup_index", 0)).intValue();
    }
}
