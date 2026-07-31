package defpackage;

/* JADX INFO: renamed from: lِٓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14085l {
    public static final C17963l loadAd;
    public static final C11897l yandex = AbstractC15439l.yandex("migration_x00");

    static {
        C17963l c17963l = new C17963l();
        c17963l.put("broadcast_to_profile", AbstractC8619l.firebase);
        c17963l.put("ignore_audio_focus", AbstractC8619l.subs);
        c17963l.put("skip_silence", AbstractC8619l.isPro);
        C10892l.yandex.getClass();
        c17963l.put("headset_pause_on_plug", C10892l.purchase);
        c17963l.put("resume_after_call", C10892l.amazon);
        c17963l.put("save_repeat", AbstractC8619l.yandex);
        c17963l.put("onstop_queue_saving", C10892l.crashlytics);
        loadAd = c17963l.crashlytics();
    }
}
