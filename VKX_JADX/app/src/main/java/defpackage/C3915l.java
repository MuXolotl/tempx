package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؖؖۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3915l {
    public boolean admob;
    public int amazon;
    public CharSequence billing;
    public int crashlytics;
    public Object isPro;
    public C12417l loadAd;
    public Bundle mopub;
    public Uri purchase;
    public C13967l subs;
    public final int yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3915l(int i) {
        int i2;
        String str = C14869l.firebase;
        switch (i) {
            case 57369:
                i2 = R.drawable.media3_icon_album;
                break;
            case 57370:
                i2 = R.drawable.media3_icon_artist;
                break;
            case 57372:
                i2 = R.drawable.media3_icon_closed_captions;
                break;
            case 57375:
                i2 = R.drawable.media3_icon_fast_forward;
                break;
            case 57376:
                i2 = R.drawable.media3_icon_rewind;
                break;
            case 57396:
                i2 = R.drawable.media3_icon_pause;
                break;
            case 57399:
                i2 = R.drawable.media3_icon_play;
                break;
            case 57403:
                i2 = R.drawable.media3_icon_playlist_add;
                break;
            case 57408:
                i2 = R.drawable.media3_icon_repeat_all;
                break;
            case 57409:
                i2 = R.drawable.media3_icon_repeat_one;
                break;
            case 57410:
                i2 = R.drawable.media3_icon_skip_back;
                break;
            case 57411:
                i2 = R.drawable.media3_icon_shuffle_on;
                break;
            case 57412:
                i2 = R.drawable.media3_icon_next;
                break;
            case 57413:
                i2 = R.drawable.media3_icon_previous;
                break;
            case 57415:
                i2 = R.drawable.media3_icon_stop;
                break;
            case 57416:
                i2 = R.drawable.media3_icon_subtitles;
                break;
            case 57421:
                i2 = R.drawable.media3_icon_volume_down;
                break;
            case 57423:
                i2 = R.drawable.media3_icon_volume_off;
                break;
            case 57424:
                i2 = R.drawable.media3_icon_volume_up;
                break;
            case 57430:
                i2 = R.drawable.media3_icon_skip_forward_10;
                break;
            case 57431:
                i2 = R.drawable.media3_icon_skip_forward_30;
                break;
            case 57432:
                i2 = R.drawable.media3_icon_skip_forward_5;
                break;
            case 57433:
                i2 = R.drawable.media3_icon_skip_back_10;
                break;
            case 57434:
                i2 = R.drawable.media3_icon_skip_back_30;
                break;
            case 57435:
                i2 = R.drawable.media3_icon_skip_back_5;
                break;
            case 57436:
                i2 = R.drawable.media3_icon_queue_add;
                break;
            case 57446:
                i2 = R.drawable.media3_icon_queue_next;
                break;
            case 57447:
                i2 = R.drawable.media3_icon_queue_remove;
                break;
            case 57448:
                i2 = R.drawable.media3_icon_playback_speed;
                break;
            case 57573:
                i2 = R.drawable.media3_icon_feed;
                break;
            case 57669:
                i2 = R.drawable.media3_icon_plus;
                break;
            case 57671:
                i2 = R.drawable.media3_icon_plus_circle_unfilled;
                break;
            case 57675:
                i2 = R.drawable.media3_icon_block;
                break;
            case 57683:
                i2 = R.drawable.media3_icon_flag_unfilled;
                break;
            case 57691:
                i2 = R.drawable.media3_icon_minus;
                break;
            case 58409:
                i2 = R.drawable.media3_icon_quality;
                break;
            case 58654:
                i2 = R.drawable.media3_icon_radio;
                break;
            case 58919:
                i2 = R.drawable.media3_icon_sync;
                break;
            case 59405:
                i2 = R.drawable.media3_icon_share;
                break;
            case 59448:
                i2 = R.drawable.media3_icon_star_unfilled;
                break;
            case 59494:
                i2 = R.drawable.media3_icon_bookmark_unfilled;
                break;
            case 59500:
                i2 = R.drawable.media3_icon_check_circle_unfilled;
                break;
            case 59517:
                i2 = R.drawable.media3_icon_heart_unfilled;
                break;
            case 59576:
                i2 = R.drawable.media3_icon_settings;
                break;
            case 59611:
                i2 = R.drawable.media3_icon_thumb_down_unfilled;
                break;
            case 59612:
                i2 = R.drawable.media3_icon_thumb_up_unfilled;
                break;
            case 60288:
                i2 = R.drawable.media3_icon_playlist_remove;
                break;
            case 61298:
                i2 = R.drawable.media3_icon_subtitles_off;
                break;
            case 61389:
                i2 = R.drawable.media3_icon_playback_speed_1_0;
                break;
            case 61512:
                i2 = R.drawable.media3_icon_signal;
                break;
            case 61916:
                i2 = R.drawable.media3_icon_closed_captions_off;
                break;
            case 62688:
                i2 = R.drawable.media3_icon_playback_speed_1_5;
                break;
            case 62689:
                i2 = R.drawable.media3_icon_playback_speed_1_2;
                break;
            case 62690:
                i2 = R.drawable.media3_icon_playback_speed_0_5;
                break;
            case 62699:
                i2 = R.drawable.media3_icon_playback_speed_2_0;
                break;
            case 63220:
                i2 = R.drawable.media3_icon_skip_forward;
                break;
            case 1040448:
                i2 = R.drawable.media3_icon_repeat_off;
                break;
            case 1040451:
                i2 = R.drawable.media3_icon_shuffle_star;
                break;
            case 1040452:
                i2 = R.drawable.media3_icon_shuffle_off;
                break;
            case 1040470:
                i2 = R.drawable.media3_icon_skip_forward_15;
                break;
            case 1040473:
                i2 = R.drawable.media3_icon_skip_back_15;
                break;
            case 1040711:
                i2 = R.drawable.media3_icon_plus_circle_filled;
                break;
            case 1040712:
                i2 = R.drawable.media3_icon_minus_circle_filled;
                break;
            case 1040713:
                i2 = R.drawable.media3_icon_minus_circle_unfilled;
                break;
            case 1040723:
                i2 = R.drawable.media3_icon_flag_filled;
                break;
            case 1042488:
                i2 = R.drawable.media3_icon_star_filled;
                break;
            case 1042534:
                i2 = R.drawable.media3_icon_bookmark_filled;
                break;
            case 1042540:
                i2 = R.drawable.media3_icon_check_circle_filled;
                break;
            case 1042557:
                i2 = R.drawable.media3_icon_heart_filled;
                break;
            case 1042651:
                i2 = R.drawable.media3_icon_thumb_down_filled;
                break;
            case 1042652:
                i2 = R.drawable.media3_icon_thumb_up_filled;
                break;
            case 1045728:
                i2 = R.drawable.media3_icon_playback_speed_1_8;
                break;
            case 1045730:
                i2 = R.drawable.media3_icon_playback_speed_0_8;
                break;
            default:
                i2 = 0;
                break;
        }
        this(i, i2);
    }

    public final void amazon(C12417l c12417l) {
        AbstractC12442l.metrica(c12417l, "sessionCommand should not be null.");
        AbstractC12442l.subs(this.crashlytics == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.loadAd = c12417l;
        this.isPro = null;
    }

    public final void crashlytics(int i) {
        AbstractC12442l.subs(this.loadAd == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        this.crashlytics = i;
        this.isPro = null;
    }

    public final void loadAd(Uri uri) {
        AbstractC12442l.subs(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
        this.purchase = uri;
    }

    public final void purchase(C12417l c12417l, Object obj) {
        AbstractC12442l.subs(this.crashlytics == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
        this.loadAd = c12417l;
        int i = c12417l.yandex;
        String str = C14869l.firebase;
        this.isPro = C14869l.yandex(i == 40010 ? 5 : 0, obj);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x008f  */
    public final C14869l yandex() {
        int i;
        int i2 = 1;
        AbstractC12442l.ads("Exactly one of sessionCommand and playerCommand should be set", (this.loadAd == null) != (this.crashlytics == -1));
        if (this.subs == null) {
            int i3 = this.crashlytics;
            String str = C14869l.firebase;
            if (i3 != 1 && (i = this.yandex) != 57399 && i != 57396) {
                if (i3 == 11 || i3 == 7) {
                    i2 = 2;
                } else {
                    i2 = 6;
                    if (i3 == 6 || i == 57413 || i == 57376 || i == 57410 || i == 57435 || i == 57433 || i == 1040473 || i == 57434) {
                        i2 = 2;
                    } else if (i3 == 12 || i3 == 9 || i3 == 8 || i == 57412 || i == 57375 || i == 63220 || i == 57432 || i == 57430 || i == 1040470 || i == 57431) {
                        i2 = 3;
                    }
                }
            }
            this.subs = new C13967l(new int[]{i2});
        }
        return new C14869l(this.loadAd, this.crashlytics, this.yandex, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro);
    }

    public C3915l(int i, int i2) {
        this.yandex = i;
        this.amazon = i2;
        this.billing = "";
        this.mopub = Bundle.EMPTY;
        this.crashlytics = -1;
        this.admob = true;
    }
}
