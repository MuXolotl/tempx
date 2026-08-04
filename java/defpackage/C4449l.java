package defpackage;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؖۡٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4449l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C17398l f9046l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9047l;

    public /* synthetic */ C4449l(C17398l c17398l, int i) {
        this.f9047l = i;
        this.f9046l = c17398l;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i = this.f9047l;
        C17398l c17398l = this.f9046l;
        switch (i) {
            case 0:
                int i2 = C4456l.f9065l;
                AudioPlaylist audioPlaylist = c17398l.f33899l;
                if (audioPlaylist != null && (str = c17398l.f33886l) != null) {
                    new C4456l(new C5218l(audioPlaylist, str)).Signature(c17398l.isVip());
                }
                break;
            case 1:
                AudioTrack audioTrack = (AudioTrack) obj;
                Activity activityIsVip = c17398l.isVip();
                String string = c17398l.isVip().getString(R.string.playlist_remove_desc, audioTrack.yandex, audioTrack.amazon);
                C5514l c5514l = new C5514l(c17398l, audioTrack, 13);
                C9312l c9312l = new C9312l(activityIsVip);
                VKXApplication.Companion companion = VKXApplication.f36628l;
                String strLoadAd = VKXApplication.Companion.loadAd(R.string.confirm);
                C14225l c14225l = (C14225l) c9312l.f28907l;
                c14225l.amazon = strLoadAd;
                c14225l.billing = string;
                c9312l.appmetrica(android.R.string.cancel, new DialogInterfaceOnClickListenerC0609l(0));
                c9312l.applovin(R.string.confirm_act, new DialogInterfaceOnClickListenerC5488l(2, c5514l));
                c9312l.isVip();
                break;
            case 2:
                C7268l c7268l = C7268l.f15111l;
                AppActivity appActivity = (AppActivity) c17398l.isVip();
                String str3 = c17398l.f33886l;
                AudioPlaylist audioPlaylist2 = c17398l.f33899l;
                c7268l.getClass();
                C7268l.yandex(appActivity, str3, audioPlaylist2, (List) obj);
                AppActivity appActivity2 = (AppActivity) c17398l.isVip();
                Integer numValueOf = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion2 = VKXApplication.f36628l;
                C6666l.yandex(appActivity2, new C10734l(numValueOf, VKXApplication.Companion.loadAd(R.string.sn_playlist_added_to_cache), c17398l.f33886l + " - " + c17398l.f33899l.mopub, null, null, 248));
                break;
            case 3:
                c17398l.mo782this();
                break;
            case 4:
                List list = (List) obj;
                C7268l c7268l2 = C7268l.f15111l;
                AppActivity appActivity3 = (AppActivity) c17398l.isVip();
                String str4 = c17398l.f33886l;
                if (str4 == null) {
                    str2 = c17398l.f33899l.advert;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = str4.length() > 0 ? str4 : null;
                    if (str2 == null) {
                        str2 = c17398l.f33899l.advert;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                }
                AudioPlaylist audioPlaylist3 = c17398l.f33899l;
                c7268l2.getClass();
                C7268l.yandex(appActivity3, str2, audioPlaylist3, list);
                AppActivity appActivity4 = (AppActivity) c17398l.isVip();
                Integer numValueOf2 = Integer.valueOf(R.drawable.ic_download_square_outline_28);
                VKXApplication.Companion companion3 = VKXApplication.f36628l;
                C6666l.yandex(appActivity4, new C10734l(numValueOf2, VKXApplication.Companion.loadAd(R.string.sn_playlist_added_to_cache), c17398l.f33886l + " - " + c17398l.f33899l.mopub, null, null, 248));
                break;
            case 5:
                AbstractC11397l.mopub(c17398l.isVip(), new C9810l(c17398l.f33899l, (List) obj, 9));
                break;
            case 6:
                List list2 = (List) obj;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.yandex(list2, false);
                AppActivity appActivity5 = (AppActivity) c17398l.isVip();
                Integer numValueOf3 = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                String string2 = vKXApplication.getString(R.string.play_next_ok);
                AudioPlaylist audioPlaylist4 = c17398l.f33899l;
                C6666l.yandex(appActivity5, new C10734l(numValueOf3, string2, audioPlaylist4 != null ? audioPlaylist4.mopub : null, null, null, 208));
                break;
            default:
                new C0228l(new C4449l(c17398l, 3), c17398l.f33899l, (List) obj, 8).Signature(c17398l.isVip());
                break;
        }
        return Unit.INSTANCE;
    }
}
