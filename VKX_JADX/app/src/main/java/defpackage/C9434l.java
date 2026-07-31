package defpackage;

import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍٍؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9434l extends AbstractC14968l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final int f19293l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ int f19294l;

    public C9434l(int i) {
        this.f19294l = i;
        switch (i) {
            case 1:
                this.f19293l = R.string.nmenu_catalogs;
                C10227l c10227lAdmob = AbstractC14055l.admob();
                m3912import(c10227lAdmob, R.string.menu_history, R.string.menu_history_desc, R.drawable.history_backward_outline_28, new C7703l(26));
                m3912import(c10227lAdmob, R.string.ctg_updates, 0, R.drawable.ic_archive_outline_28, new C7703l(27));
                m3912import(c10227lAdmob, R.string.ctg_friends, 0, R.drawable.ic_user_outline_28, new C7703l(28));
                m3912import(c10227lAdmob, R.string.ctg_groups, 0, R.drawable.ic_users_outline_28, new C7703l(29));
                m3912import(c10227lAdmob, R.string.radiostations, R.string.radiostations_desc, R.drawable.ic_radiowaves_left_and_right_outline_28, new C11200l(0));
                m3913public(AbstractC14055l.purchase(c10227lAdmob));
                break;
            case 2:
                this.f19293l = R.string.acc_prefs;
                C10227l c10227lAdmob2 = AbstractC14055l.admob();
                m3912import(c10227lAdmob2, R.string.it_header, 0, R.drawable.ic_palette_outline_28, C8299l.f17199l);
                m3912import(c10227lAdmob2, R.string.settings_now_playing_title, R.string.settings_now_playing_desc, R.drawable.ic_sound_wave_outline_28, C1531l.f3798l);
                m3912import(c10227lAdmob2, R.string.st_pb, R.string.st_pb_desc, R.drawable.ic_video_outline_28, C10495l.f21369l);
                m3912import(c10227lAdmob2, R.string.st_not, R.string.st_not_desc, R.drawable.ic_notifications_28, C15791l.f31010l);
                m3912import(c10227lAdmob2, R.string.pref_category_thirdparty, R.string.pref_category_thirdparty_desc, R.drawable.ic_services_outline_28, C2915l.f6341l);
                m3912import(c10227lAdmob2, R.string.st_storage, R.string.st_storage_desc, R.drawable.ic_download_outline_28, C16297l.f31890l);
                m3912import(c10227lAdmob2, R.string.settings_root_experimental, R.string.settings_root_experimental_desc, R.drawable.ic_bug_outline_28, C9276l.f19079l);
                m3912import(c10227lAdmob2, R.string.st_proxy, R.string.st_proxy_desc, R.drawable.ic_globe_outline_28, C5221l.f11303l);
                m3912import(c10227lAdmob2, R.string.ota_pref, 0, R.drawable.ic_upload_outline_28, C15909l.f31229l);
                m3913public(AbstractC14055l.purchase(c10227lAdmob2));
                break;
            case 3:
                this.f19293l = R.string.nmenu_profiles;
                C10227l c10227lAdmob3 = AbstractC14055l.admob();
                m3912import(c10227lAdmob3, R.string.acc_friends, 0, R.drawable.ic_user_outline_28, new C3342l(13));
                m3912import(c10227lAdmob3, R.string.acc_groups, 0, R.drawable.ic_users_outline_28, new C3342l(14));
                m3912import(c10227lAdmob3, R.string.acc_wall, 0, R.drawable.ic_article_outline_28, new C3342l(15));
                m3912import(c10227lAdmob3, R.string.acc_news, R.string.acc_news_desc, R.drawable.ic_newsfeed_outline_28, new C3342l(16));
                m3912import(c10227lAdmob3, R.string.messages_shared_media, R.string.messages_shared_media_desc, R.drawable.ic_message_outline_28, new C3342l(17));
                m3913public(AbstractC14055l.purchase(c10227lAdmob3));
                break;
            case 4:
                this.f19293l = R.string.rec_screen;
                C10227l c10227lAdmob4 = AbstractC14055l.admob();
                m3912import(c10227lAdmob4, R.string.tab_recommendations, R.string.acc_rec_desc, R.drawable.ic_advertising_outline_28, new C3342l(25));
                m3912import(c10227lAdmob4, R.string.ctg_artists, 0, R.drawable.ic_music_mic_outline_28, new C3342l(26));
                m3912import(c10227lAdmob4, R.string.rec_screen_for_you, R.string.rec_screen_for_you_desc, R.drawable.ic_playlist_outline_28, new C3342l(27));
                c10227lAdmob4.add(C12414l.yandex);
                c10227lAdmob4.add(new C12451l(R.string.rec_screen_genres));
                c10227lAdmob4.add(new C6835l());
                m3912import(c10227lAdmob4, R.string.tab_popular, R.string.acc_pop_desc, R.drawable.ic_statistics_outline_28, new C3342l(28));
                for (C8195l c8195l : AbstractC14055l.remoteconfig(new C8195l(1, "Rock"), new C8195l(2, "Pop"), new C8195l(3, "Rap & Hip-Hop"), new C8195l(4, "Easy Listening"), new C8195l(5, "House & Dance"), new C8195l(6, "Instrumental"), new C8195l(7, "Metal"), new C8195l(21, "Alternative"), new C8195l(8, "Dubstep"), new C8195l(1001, "Jazz & Blues"), new C8195l(10, "Drum & Bass"), new C8195l(11, "Trance"), new C8195l(13, "Ethnic"), new C8195l(14, "Acoustic & Vocal"), new C8195l(15, "Reggae"), new C8195l(16, "Classical"), new C8195l(17, "Indie Pop"), new C8195l(22, "Electropop & Disco"), new C8195l(18, "Other"))) {
                    int iIntValue = ((Number) c8195l.f17098l).intValue();
                    String str = (String) c8195l.f17097l;
                    c10227lAdmob4.add(new C8789l(0, new C15578l(-1914691139, true, new C4210l(str, 19)), (Function2) null, 0, new C8652l(this, new C8803l(iIntValue, str, 5), 18)));
                }
                m3913public(AbstractC14055l.purchase(c10227lAdmob4));
                break;
            default:
                this.f19293l = R.string.account_category;
                C10227l c10227lAdmob5 = AbstractC14055l.admob();
                c10227lAdmob5.add(new C8789l(R.string.auth2_qr_code_scanner_act, new C15578l(1326809315, true, new C14813l((byte) 0, 4)), R.drawable.ic_qr_code_outline_28, new C9636l(1, this), 2));
                m3912import(c10227lAdmob5, R.string.privacy_cfg, R.string.privacy_cfg_desc, R.drawable.ic_user_outline_28, C7116l.f14901l);
                m3912import(c10227lAdmob5, R.string.blacklist_menu, R.string.blacklist_menu_desc, R.drawable.ic_block_outline_28, C9715l.f19798l);
                m3911abstract(c10227lAdmob5, R.string.catalog_blacklist, R.string.catalog_blacklist_text, R.drawable.ic_edit_outline_28, C5343l.f11489l);
                m3911abstract(c10227lAdmob5, R.string.find_duplicates, R.string.find_duplicates_text, R.drawable.ic_search_outline_28, C6926l.f14498l);
                m3911abstract(c10227lAdmob5, R.string.libtools_wipe_library, R.string.libtools_wipe_library_text, R.drawable.ic_delete_outline_28, C14158l.f27686l);
                m3911abstract(c10227lAdmob5, R.string.android_auto_entrypoint, 0, R.drawable.ic_car_outline_28, C5675l.f12074l);
                m3913public(AbstractC14055l.purchase(c10227lAdmob5));
                break;
        }
    }

    @Override // defpackage.AbstractC14968l
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final int mo2657instanceof() {
        switch (this.f19294l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f19293l;
    }
}
