package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lؚۥؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7635l implements InterfaceC17069l {
    public static final C7635l yandex = new C7635l();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C7635l);
    }

    @Override // defpackage.InterfaceC17069l
    public final int getTitle() {
        return R.string.library_mass_action_cache;
    }

    public final int hashCode() {
        return -1763686629;
    }

    public final String toString() {
        return "Cache";
    }

    @Override // defpackage.InterfaceC17069l
    public final void yandex(AppActivity appActivity, VKProfile vKProfile, List list) {
        String str;
        long jCrashlytics;
        String strAmazon;
        String strAmazon2;
        C15478l c15478l = C15478l.purchase;
        if (vKProfile == null || (str = vKProfile.amazon) == null) {
            C16287l.yandex.getClass();
            C7644l c7644l = VKXApplication.f36633l;
            if (c7644l == null) {
                c7644l = null;
            }
            str = ((C4645l) c7644l.f15735l).isPro;
        }
        AlbumThumb albumThumb = new AlbumThumb((String) null, (String) null, (String) null, str, (String) null, 23);
        if (vKProfile != null) {
            jCrashlytics = vKProfile.yandex;
        } else {
            C16287l.yandex.getClass();
            jCrashlytics = C16287l.crashlytics();
        }
        long j = jCrashlytics;
        if (vKProfile == null || (strAmazon = vKProfile.yandex()) == null) {
            C16287l.yandex.getClass();
            strAmazon = C16287l.amazon();
        }
        AudioPlaylist audioPlaylist = new AudioPlaylist(-1337, j, null, null, strAmazon, "Автоматически созданный плейлист, представляющий ".concat(vKProfile != null ? "библиотеку \"" + vKProfile.yandex() + '\"' : "вашу библиотеку. При повторном кешировании список обновится."), 0, 0, 0, 0L, null, null, null, null, null, 0, null, null, albumThumb, null, null, null, null, null, false, false, null, null, null, null, null, false, null, false, false, -262196, 7);
        if (vKProfile == null || (strAmazon2 = vKProfile.yandex()) == null) {
            C16287l.yandex.getClass();
            strAmazon2 = C16287l.amazon();
        }
        C17685l c17685l = new C17685l(audioPlaylist, list, strAmazon2);
        c15478l.getClass();
        C15478l.loadAd(appActivity, c17685l);
        C7206l c7206l = C7206l.yandex;
        NextDockView nextDockView = (NextDockView) appActivity.f36640l.f15742l;
        String strValueOf = String.valueOf(3);
        for (C9359l c9359l : nextDockView.f36849l) {
            if (AbstractC8576l.yandex(c9359l.yandex.yandex, strValueOf)) {
                c7206l.yandex((FrameLayout) c9359l.loadAd.f20465l, EnumC10788l.f21810l);
                return;
            }
        }
        C1759l.firebase("Collection contains no element matching the predicate.");
    }
}
