package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10892l {
    public static final C8634l admob;
    public static final C4348l amazon;
    public static final C8634l billing;
    public static final C4348l crashlytics;
    public static final C8634l firebase;
    public static final C8634l isPro;
    public static final /* synthetic */ InterfaceC13922l[] loadAd;
    public static final C8634l metrica;
    public static final C8634l mopub;
    public static final C4348l purchase;
    public static final C8634l remoteconfig;
    public static final C8634l smaato;
    public static final C8634l startapp;
    public static final C8634l subs;
    public static final C8634l vip;
    public static final C10892l yandex;

    static {
        boolean z = false;
        C0544l c0544l = new C0544l(C10892l.class, "shuffleShortcuts", "getShuffleShortcuts()Z", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        String str = "libvkx_enable";
        boolean z2 = true;
        int i = 3;
        loadAd = new InterfaceC13922l[]{c2336l.admob(c0544l), AbstractC9361l.tapsense(C10892l.class, "downloadID3", "getDownloadID3()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "downloadCounter", "getDownloadCounter()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "invertDownloadOrder", "getInvertDownloadOrder()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "blockRussianTracks", "getBlockRussianTracks()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "blockRussianArtists", "getBlockRussianArtists()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "blockRussianAlbums", "getBlockRussianAlbums()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "blockExplicitTracks", "getBlockExplicitTracks()Z", 0, c2336l), AbstractC9361l.tapsense(C10892l.class, "blockLegalNotices", "getBlockLegalNotices()Z", 0, c2336l), c2336l.billing(new C0114l(C10892l.class, "libvkx_enable", "getLibvkx_enable()Z", 0)), AbstractC9361l.tapsense(C10892l.class, "libvkx_preferLibrary", "getLibvkx_preferLibrary()Z", 0, c2336l)};
        yandex = new C10892l();
        crashlytics = AbstractC15439l.admob("onstop_queue_saving", true, R.string.settings_preserve_queue);
        amazon = new C4348l("resume_after_call", R.string.call_resume, Integer.valueOf(R.string.call_resume_desc), false);
        purchase = new C4348l("headset_pause_on_plug", R.string.st_hs_pause, Integer.valueOf(R.string.st_hs_pause_desc), false);
        SharedPreferences sharedPreferences = AbstractC3957l.amazon;
        billing = new C8634l(sharedPreferences != null ? sharedPreferences : null, "shortcuts_shuffle", z, i);
        mopub = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_add_id3", z2, i);
        admob = new C8634l(sharedPreferences != null ? sharedPreferences : null, "download_add_counter", z2, i);
        subs = new C8634l(sharedPreferences != null ? sharedPreferences : null, "downloader_invorder_pl", z, i);
        isPro = new C8634l(sharedPreferences != null ? sharedPreferences : null, "meme_block_names", z, i);
        firebase = new C8634l(sharedPreferences != null ? sharedPreferences : null, "meme_block_art", z, i);
        smaato = new C8634l(sharedPreferences != null ? sharedPreferences : null, "meme_block_alb", z, i);
        remoteconfig = new C8634l(sharedPreferences != null ? sharedPreferences : null, "meme_block_explicit", z, i);
        vip = new C8634l(sharedPreferences != null ? sharedPreferences : null, "meme_block_legal_notices", z, i);
        metrica = new C8634l(sharedPreferences != null ? sharedPreferences : null, str, z2, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        startapp = new C8634l(sharedPreferences, "libvkx_libcatalog", z, i);
    }

    public final void yandex(boolean z) {
        metrica.advert(loadAd[9], Boolean.valueOf(z));
    }
}
