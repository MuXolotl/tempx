package defpackage;

import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12467l extends AbstractC14968l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f24599l = R.string.app_name;

    public C12467l() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        c10227lAdmob.add(new C12451l(R.string.menu_account));
        C16287l.yandex.getClass();
        if (C16287l.yandex()) {
            c10227lAdmob.add(new C8789l(R.string.orbit_menu_switchto, AbstractC16570l.yandex, R.drawable.ic_user_outline_28, new C5735l(0, this, C12467l.class, "switchToVk", "switchToVk()V", 0, 0, 3), 2));
        } else {
            c10227lAdmob.add(new C8789l(R.string.orbit_menu_signin, AbstractC16570l.loadAd, R.drawable.ic_user_outline_28, new C5735l(0, this, C12467l.class, "switchToVkAuth", "switchToVkAuth()V", 0, 0, 4), 2));
        }
        c10227lAdmob.add(new C8789l(R.string.orbitmenu_cache, (C15578l) null, R.drawable.ic_download_outline_28, new C5735l(0, this, C12467l.class, "openCachedTracks", "openCachedTracks()V", 0, 0, 5), 6));
        c10227lAdmob.add(new C12451l(R.string.acc_prefs));
        m3912import(c10227lAdmob, R.string.it_header, 0, R.drawable.ic_palette_outline_28, new C1990l(26));
        m3912import(c10227lAdmob, R.string.settings_now_playing_title, R.string.settings_now_playing_desc, R.drawable.ic_sound_wave_outline_28, C17445l.f33991l);
        m3912import(c10227lAdmob, R.string.st_pb, R.string.st_pb_desc, R.drawable.ic_video_outline_28, new C1990l(27));
        m3912import(c10227lAdmob, R.string.settings_root_experimental, R.string.settings_root_experimental_desc, R.drawable.ic_bug_outline_28, C0355l.f1422l);
        m3912import(c10227lAdmob, R.string.nmenu_about, 0, R.drawable.ic_info_outline_28, new C1990l(28));
        m3913public(AbstractC14055l.purchase(c10227lAdmob));
    }

    @Override // defpackage.AbstractC14968l
    /* JADX INFO: renamed from: instanceof */
    public final int mo2657instanceof() {
        return this.f24599l;
    }
}
