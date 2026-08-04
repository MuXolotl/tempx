package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lٍٚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC9663l implements View.OnClickListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f19745l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19746l;

    public /* synthetic */ ViewOnClickListenerC9663l(C17022l c17022l, AudioPlaylist audioPlaylist) {
        this.f19746l = 0;
        this.f19745l = audioPlaylist;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7644l c7644l;
        int i = this.f19746l;
        AudioPlaylist audioPlaylist = this.f19745l;
        switch (i) {
            case 0:
                Context context = view.getContext();
                if (audioPlaylist.inmobi == null) {
                    AbstractC1213l.billing(context, new C17398l(audioPlaylist));
                } else {
                    new C10655l(new C15642l(R.string.content_blocked_playlist, 2), 2).Signature((AppActivity) context);
                }
                break;
            case 1:
                AbstractC9033l.crashlytics((AppActivity) view.getContext(), new C17972l(audioPlaylist, (InterfaceC14029l) null, 3));
                break;
            case 2:
                AbstractC9033l.crashlytics((AppActivity) ((Activity) view.getContext()), new C7226l(audioPlaylist, null, null, 11));
                break;
            case 3:
                AbstractC1213l.crashlytics(view, new C17398l(audioPlaylist));
                break;
            case 4:
                AbstractC1213l.crashlytics(view, new C17398l(audioPlaylist));
                break;
            default:
                if (!AbstractC14770l.billing(audioPlaylist)) {
                    OriginalPlaylist originalPlaylist = audioPlaylist.tapsense;
                    String strValueOf = String.valueOf(originalPlaylist != null ? originalPlaylist.yandex : audioPlaylist.amazon);
                    C16287l.yandex.getClass();
                    if (!strValueOf.equals(String.valueOf(C16287l.crashlytics()))) {
                        AppActivity appActivity = C8183l.loadAd;
                        if (appActivity != null) {
                            appActivity.license(new C15191l((String) null, new C1329l("https://vk.com/audios".concat(strValueOf), 1)));
                        }
                        break;
                    } else {
                        AppActivity appActivity2 = C8183l.loadAd;
                        AppActivity appActivity3 = AbstractC2812l.advert(appActivity2) ? appActivity2 : null;
                        if (appActivity3 != null && (c7644l = appActivity3.f36640l) != null) {
                            ((NextDockView) c7644l.f15742l).loadAd(String.valueOf(3), (6 & 2) != 0, true);
                            break;
                        }
                    }
                } else {
                    Context context2 = view.getContext();
                    List list = audioPlaylist.isVip;
                    if (list != null) {
                        AbstractC2044l.yandex(context2, list);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC9663l(C9575l c9575l, AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        this.f19746l = 2;
        this.f19745l = audioPlaylist;
    }

    public /* synthetic */ ViewOnClickListenerC9663l(AudioPlaylist audioPlaylist, int i) {
        this.f19746l = i;
        this.f19745l = audioPlaylist;
    }
}
