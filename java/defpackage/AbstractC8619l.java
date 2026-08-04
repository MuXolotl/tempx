package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8619l {
    public static final C11897l crashlytics;
    public static final C11897l vip;
    public static final C4348l yandex = AbstractC15439l.admob("preserve_repeat_mode", true, R.string.preseve_repeat_save);
    public static final C4348l loadAd = AbstractC15439l.admob("preserve_shuffle_mode", true, R.string.preseve_shuffle_save);
    public static final C11897l amazon = AbstractC15439l.yandex("shuffle_mode");
    public static final C4348l purchase = new C4348l("volume_oreo_skip", R.string.skip_volume, Integer.valueOf(R.string.skip_volume_desc), false);
    public static final C4348l billing = new C4348l("n_no_explicit", R.string.notification_no_explicit, Integer.valueOf(R.string.notification_no_explicit_desc), false);
    public static final C4348l mopub = new C4348l("n_no_library", R.string.not_ls_noremove, Integer.valueOf(R.string.not_ls_noremove_desc), false);
    public static final C4348l admob = AbstractC15439l.admob("n_no_stop", false, R.string.notification_no_stop);
    public static final C4348l subs = new C4348l("ignore_focus", R.string.ignore_audio_focus, Integer.valueOf(R.string.ignore_audio_focus_desc), false);
    public static final C4348l isPro = new C4348l("skip_silence_2", R.string.skip_silence, Integer.valueOf(R.string.skip_silence_desc), false);
    public static final C4348l firebase = AbstractC15439l.admob("broadcast_to_profile", false, R.string.broadcast_to_status);
    public static final C4348l smaato = AbstractC15439l.admob("stop_on_task_removal", false, R.string.stop_playback_on_task_removal);
    public static final C11897l remoteconfig = AbstractC15439l.yandex("eq3_enabled");
    public static final C11897l metrica = AbstractC15439l.yandex("eq3_fade_simul");
    public static final C4348l startapp = new C4348l("artwork_use_provider", R.string.use_content_provider_for_artwork, Integer.valueOf(R.string.use_content_provider_for_artwork_desc), false);
    public static final C11897l adcel = AbstractC15439l.yandex("exp_reduce_wakelocks");
    public static final C11897l ads = AbstractC15439l.yandex("exp_prefer_offloading");

    static {
        int i = 19;
        crashlytics = new C11897l("repeat_mode", new C10975l(i, EnumC12501l.values()), EnumC12501l.f24640l);
        vip = new C11897l("eq3_engine", new C10975l(i, EnumC4948l.values()), EnumC4948l.f10079l);
    }
}
