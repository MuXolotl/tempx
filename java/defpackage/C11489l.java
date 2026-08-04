package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11489l {
    public static final C4348l admob;
    public static final C8634l amazon;
    public static final C8634l billing;
    public static final C8634l crashlytics;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C8634l mopub;
    public static final C8634l purchase;
    public static final C4348l subs;
    public static final C11489l yandex;

    static {
        boolean z = false;
        C0114l c0114l = new C0114l(C11489l.class, "enableItunes", "getEnableItunes()Z", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        int i = 3;
        loadAd = new InterfaceC13922l[]{c2336l.billing(c0114l), c2336l.billing(new C0114l(C11489l.class, "enableItunesInTags", "getEnableItunesInTags()Z", 0)), c2336l.billing(new C0114l(C11489l.class, "enableLyricsIntoTags", "getEnableLyricsIntoTags()Z", 0)), AbstractC9361l.tapsense(C11489l.class, "lastFmEnabled", "getLastFmEnabled()Z", 0, c2336l), AbstractC9361l.tapsense(C11489l.class, "lastFmBroadcastEnabled", "getLastFmBroadcastEnabled()Z", 0, c2336l)};
        yandex = new C11489l();
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        crashlytics = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_use_itunes", z, i);
        amazon = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_use_itunes_tagging", z, i);
        purchase = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_use_genius_tagging", z, i);
        billing = new C8634l(sharedPreferences != null ? sharedPreferences : null, "playback_allowlastfm", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        mopub = new C8634l(sharedPreferences, "playback_allowlastfm_broadcast", z, i);
        admob = AbstractC15439l.admob("integrations_lfm_add_subtitle", false, R.string.lfm_add_subtitle);
        subs = AbstractC15439l.admob("integrations_lfm_use_only_one_artist", false, R.string.lfm_use_one_artist);
    }

    public final boolean yandex() {
        InterfaceC13922l interfaceC13922l = loadAd[0];
        return ((Boolean) crashlytics.pro(this)).booleanValue();
    }
}
